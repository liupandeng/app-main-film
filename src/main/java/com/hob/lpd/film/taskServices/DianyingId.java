package com.hob.lpd.film.taskServices;

import com.dream.common.db.IDBPool;
import com.dream.common.db.dao.BaseDictDao;
import com.dream.common.utils.DateUtils;
import com.dream.common.utils.StringUtils;
import com.dream.common.utils.okhttp.OkHttpUtils;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class DianyingId implements IService {

    private final static Logger logger = Logger.getLogger(DianyingId.class);
    private IDBPool pool;

    @Autowired
    public DianyingId(IDBPool pool) {
        this.pool = pool;
    }

    @Autowired
    private BaseDictDao dianyingIdDao;
    @Autowired
    private BaseDictDao dianyingContentDao;

    @Autowired
    private OkHttpUtils okHttpUtils;

    String baseIdUrl = "http://www.btbtt88.com/forum-index-fid-1-page-";
    String baseContentUrl = "http://www.btbtt88.com/thread-index-fid-1-tid-";
    String downBaseUrl = "http://www.btbtt88.com/attach-download-fid-1-aid-";
    String suffix = ".htm";

    String vipbaseUrl = "http://www.btbtt88.com/forum-index-fid-9-page-";
    public void process() {
        for(int i = 1; i <= 2; i++){
            System.out.println("第" + i + "页 start...");
            operate(i,baseIdUrl);
            System.out.println("第" + i + "页 end...");
        }
    }

    private void operate(int pageNum, String baseIdUrl){
        List<Map<String, String>> idList = getIDDoc(pageNum, baseIdUrl);
        insertFilmId(idList);
    }


    /**获取页面的电影id*/
    private List<Map<String, String>> getIDDoc(int index, String fileIdBaseUrl){
        Document doc = null;
        List<Map<String, String>> list = new ArrayList<>();
        try {
            String url = fileIdBaseUrl + index + suffix;
            String content = okHttpUtils.doGetReturnString(url);
            doc = Jsoup.parse(content);
            Elements a = doc.getElementsByClass("icon");
            Iterator it = a.iterator();
            while (it.hasNext()){
                Element element = (Element)it.next();
                String tid =element.attr("tid");
                if(StringUtils.isEmpty(tid)){
                    continue;
                }
                Map<String,String> data = new HashMap<>();
                data.put("film_id",tid);
                data.put("type","0");
                data.put("page_num",index + "");
                data.put("intime", DateUtils.datetimeFormat().format(new Date()));
                list.add(data);
            }
        } catch (Exception e) {
            logger.error("DianyingId 获取电影id 失败！！!" + e.getMessage());
        }
        return list;
    }


    /**根据电影id去获取对应的电影内容详情*/
    private List<Map<String, String>> getContentDoc(String film_id){
        Document doc = null;
        List<Map<String, String>> list = new ArrayList<>();
        try {
            String url = baseContentUrl + film_id + suffix;
            String content = okHttpUtils.doGetReturnString(url);
            doc = Jsoup.parse(content);
            Elements elementsTag = doc.getElementsByTag("p");
            Elements elementsImg = doc.getElementsByTag("img");
            Element elementTitle = doc.getElementById("subject_" + film_id);
            if(elementTitle == null){
                System.out.println("subject_" + film_id + "is null");
                return null;
            }
            String[] title = elementTitle.text().replaceAll(" ", "").replaceAll("\\[","").split("]");
            Elements a = doc.getElementsByClass("ajaxdialog");
            Iterator it = a.iterator();
            while (it.hasNext()){
                Element element = (Element)it.next();
                String urlArr = element.attr("href");
                if(urlArr.contains("attach-dialog-fid-1-aid-")){
                    int start = urlArr.indexOf("attach-dialog-fid-1-aid-") +24;
                    int end = urlArr.indexOf("-ajax-1.htm");
                    String realDownUrl = downBaseUrl+ urlArr.substring(start,end) + suffix;
                    Map<String,String> data = new HashMap<>();
                    String desc = title.length >= 9 ? title[8] : "";
                    data.put("year",title[0]);
                    data.put("area",title[1]);
                    data.put("type",title[2]);
                    data.put("down_method",title[3]);
                    data.put("name",title[4]);
                    data.put("size",title[5]);
                    data.put("subtitles",title[6]);
                    data.put("sharpness",title[7]);
                    data.put("desc",desc);
                    data.put("content",content);
                    data.put("down_url",realDownUrl);
                    data.put("film_id",film_id);
                    data.put("intime",DateUtils.datetimeFormat().format(new Date()));
                    list.add(data);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**插入电影内容表*/
    private void insertFilmContent(List<Map<String,String>> datas){
        datas.forEach(temp -> {
            String filmId = temp.get("film_id");
            boolean isExist = dianyingContentDao.rawQueryForInt("select count(*) from dianying_content where film_id = ?", new String[]{filmId}) > 0 ? true : false;
            if(!isExist){
                int result = dianyingContentDao.insert(temp);
                logger.info("新增电影content!!!result: "+ result +" ==film_id ==" + filmId);
            }
        });
    }

    /**插入电影id 表*/
    private void insertFilmId(List<Map<String,String>> datas){
        datas.forEach(temp -> {
            String filmId = temp.get("film_id");
            boolean isExist = dianyingIdDao.rawQueryForInt("select count(*) from dianying_id where film_id = ?", new String[]{filmId}) > 0 ? true: false;
            if(!isExist){
                int result = dianyingIdDao.insert(temp);
                String isSuccess = result > 0 ? "==成功！！！" : "==失败！！！";
                logger.info("新增电影id ==" + filmId + isSuccess);
                if(result > 0){
                    List<Map<String, String>> contentList = getContentDoc(filmId);
                    insertFilmContent(contentList);
                }
            }
        });
    }

}
