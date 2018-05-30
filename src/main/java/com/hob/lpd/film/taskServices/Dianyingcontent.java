package com.hob.lpd.film.taskServices;

import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.Iterator;


@Service
public class Dianyingcontent{

    private final static Logger logger = Logger.getLogger(Dianyingcontent.class);
    static String content = "<!doctype html>\n" +
            "<html>\n" +
            "<head>\n" +
            "\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
            "\t<meta name=\"keywords\" content=\"[BT下载][王牌特工2：黄金圈][HD-MP4/2.69G][英语中英双字][1080P][141分钟未删减版动作大片]\" />\n" +
            "\t<meta name=\"description\" content=\"导演: 马修·沃恩编剧: 简·古德曼 / 马修·沃恩 / 马克·米勒 / 戴夫·吉布森主演: 塔伦·埃格顿 / 科林·费尔斯 / \" />\n" +
            "\t<meta name=\"generator\" content=\"Xiuno BBS\" />\n" +
            "\t<meta name=\"author\" content=\"Xiuno Team\" />\n" +
            "\t<meta name=\"copyright\" content=\"2008-2012 xiuno.com\" />\n" +
            "\t<meta name=\"MSSmartTagsPreventParsing\" content=\"True\" />\n" +
            "\t<meta http-equiv=\"MSThemeCompatible\" content=\"Yes\" />\n" +
            "\t<!--<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7\" />-->\n" +
            "\t\n" +
            "\t<link href=\"http://www.btbtt55.com/view/common.css\" type=\"text/css\" rel=\"stylesheet\" />\n" +
            "\t<link rel=\"shortcut icon\" href=\"favicon.ico\" />\n" +
            "\t\n" +
            "\t<script type=\"text/javascript\">\n" +
            "\tvar cookie_pre = 'bbs_';\n" +
            "\tvar g_uid = 0;\n" +
            "\t</script>\n" +
            "\t<title>[BT下载][王牌特工2：黄金圈][HD-MP4/2.69G][英语中英双字][1080P][141分钟未删减版动作大片] 电影下载 2017 欧美 动作 </title>\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "<div id=\"wrapper1\">\n" +
            "\t\n" +
            "\t<div id=\"wrapper2\">\n" +
            "\t\t\n" +
            "\t\t<div id=\"menu\" role=\"navigation\">\n" +
            "\t\t\t<div class=\"width\">\n" +
            "\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"table-layout: fixed;\">\n" +
            "\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t<td class=\"left\"></td>\n" +
            "\t\t\t\t\t\t<td class=\"logo\"><a href=\"http://www.btbttpic.com/\" title=\"BT之家_bt电影天堂__电影首发站-影视资源交流社区\"><span id=\"logo\"></span></a></td>\n" +
            "\t\t\t\t\t\t<td class=\"center\">\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t<span class=\"sep\"></span>\n" +
            "\t\t\t\t\t\t\t<a href=\"./\" >首页</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t                          \n" +
            "                          <span class=\"sep\"></span>\n" +
            "                           <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1.htm\"  Array[forum-index-fid-1.htm]>电影下载</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm]>欧美影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm]>剧情影片</a>\n" +
            "<span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm]>香港影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm]>大陆影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-9.htm\"  Array[forum-index-fid-9.htm]>福利影片</a>\n" +
            "                           <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-8.htm\"  Array[forum-index-fid-8.htm]>美女图片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            "\n" +
            " <a href=\"/forum-index-fid-7.htm\"  Array[forum-index-fid-7.htm]>新手教堂</a>\n" +
            "                      <span class=\"sep\"></span>    \n" +
            "                          \n" +
            "                      <!--\n" +
            "\t\t\t\t\t\t\t<span class=\"sep\"></span>\n" +
            "\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/forum-index-fid-1.htm\"  class=\"checked\">电影下载</a>\t\n" +
            "                   -->\n" +
            "                         \n" +
            "                          \n" +
            "                          \n" +
            "\t\t\t\t\t\t\t                          \n" +
            "                          <span class=\"sep\"></span>\n" +
            "                           <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1.htm\"  Array[forum-index-fid-1.htm]>电影下载</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm]>欧美影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm]>剧情影片</a>\n" +
            "<span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm]>香港影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm]>大陆影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-9.htm\"  Array[forum-index-fid-9.htm]>福利影片</a>\n" +
            "                           <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-8.htm\"  Array[forum-index-fid-8.htm]>美女图片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            "\n" +
            " <a href=\"/forum-index-fid-7.htm\"  Array[forum-index-fid-7.htm]>新手教堂</a>\n" +
            "                      <span class=\"sep\"></span>    \n" +
            "                          \n" +
            "                      <!--\n" +
            "\t\t\t\t\t\t\t<span class=\"sep\"></span>\n" +
            "\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/forum-index-fid-2.htm\" >720p高清</a>\t\n" +
            "                   -->\n" +
            "                         \n" +
            "                          \n" +
            "                          \n" +
            "\t\t\t\t\t\t\t                          \n" +
            "                          <span class=\"sep\"></span>\n" +
            "                           <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1.htm\"  Array[forum-index-fid-1.htm]>电影下载</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm]>欧美影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm]>剧情影片</a>\n" +
            "<span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm]>香港影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm]>大陆影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-9.htm\"  Array[forum-index-fid-9.htm]>福利影片</a>\n" +
            "                           <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-8.htm\"  Array[forum-index-fid-8.htm]>美女图片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            "\n" +
            " <a href=\"/forum-index-fid-7.htm\"  Array[forum-index-fid-7.htm]>新手教堂</a>\n" +
            "                      <span class=\"sep\"></span>    \n" +
            "                          \n" +
            "                      <!--\n" +
            "\t\t\t\t\t\t\t<span class=\"sep\"></span>\n" +
            "\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/forum-index-fid-3.htm\" >1080p高清</a>\t\n" +
            "                   -->\n" +
            "                         \n" +
            "                          \n" +
            "                          \n" +
            "\t\t\t\t\t\t\t                          \n" +
            "                          <span class=\"sep\"></span>\n" +
            "                           <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1.htm\"  Array[forum-index-fid-1.htm]>电影下载</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm]>欧美影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm]>剧情影片</a>\n" +
            "<span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm]>香港影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm]>大陆影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-9.htm\"  Array[forum-index-fid-9.htm]>福利影片</a>\n" +
            "                           <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-8.htm\"  Array[forum-index-fid-8.htm]>美女图片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            "\n" +
            " <a href=\"/forum-index-fid-7.htm\"  Array[forum-index-fid-7.htm]>新手教堂</a>\n" +
            "                      <span class=\"sep\"></span>    \n" +
            "                          \n" +
            "                      <!--\n" +
            "\t\t\t\t\t\t\t<span class=\"sep\"></span>\n" +
            "\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/forum-index-fid-4.htm\" >3D电影下载</a>\t\n" +
            "                   -->\n" +
            "                         \n" +
            "                          \n" +
            "                          \n" +
            "\t\t\t\t\t\t\t                          \n" +
            "                          <span class=\"sep\"></span>\n" +
            "                           <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1.htm\"  Array[forum-index-fid-1.htm]>电影下载</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm]>欧美影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm]>剧情影片</a>\n" +
            "<span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm]>香港影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm]>大陆影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-9.htm\"  Array[forum-index-fid-9.htm]>福利影片</a>\n" +
            "                           <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-8.htm\"  Array[forum-index-fid-8.htm]>美女图片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            "\n" +
            " <a href=\"/forum-index-fid-7.htm\"  Array[forum-index-fid-7.htm]>新手教堂</a>\n" +
            "                      <span class=\"sep\"></span>    \n" +
            "                          \n" +
            "                      <!--\n" +
            "\t\t\t\t\t\t\t<span class=\"sep\"></span>\n" +
            "\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/forum-index-fid-5.htm\" >蓝光电影</a>\t\n" +
            "                   -->\n" +
            "                         \n" +
            "                          \n" +
            "                          \n" +
            "\t\t\t\t\t\t\t                          \n" +
            "                          <span class=\"sep\"></span>\n" +
            "                           <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1.htm\"  Array[forum-index-fid-1.htm]>电影下载</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm]>欧美影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm]>剧情影片</a>\n" +
            "<span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm]>香港影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm]>大陆影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-9.htm\"  Array[forum-index-fid-9.htm]>福利影片</a>\n" +
            "                           <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-8.htm\"  Array[forum-index-fid-8.htm]>美女图片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            "\n" +
            " <a href=\"/forum-index-fid-7.htm\"  Array[forum-index-fid-7.htm]>新手教堂</a>\n" +
            "                      <span class=\"sep\"></span>    \n" +
            "                          \n" +
            "                      <!--\n" +
            "\t\t\t\t\t\t\t<span class=\"sep\"></span>\n" +
            "\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/forum-index-fid-6.htm\" >会员求片</a>\t\n" +
            "                   -->\n" +
            "                         \n" +
            "                          \n" +
            "                          \n" +
            "\t\t\t\t\t\t\t                          \n" +
            "                          <span class=\"sep\"></span>\n" +
            "                           <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1.htm\"  Array[forum-index-fid-1.htm]>电影下载</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm]>欧美影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm]>剧情影片</a>\n" +
            "<span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm]>香港影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm]>大陆影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-9.htm\"  Array[forum-index-fid-9.htm]>福利影片</a>\n" +
            "                           <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-8.htm\"  Array[forum-index-fid-8.htm]>美女图片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            "\n" +
            " <a href=\"/forum-index-fid-7.htm\"  Array[forum-index-fid-7.htm]>新手教堂</a>\n" +
            "                      <span class=\"sep\"></span>    \n" +
            "                          \n" +
            "                      <!--\n" +
            "\t\t\t\t\t\t\t<span class=\"sep\"></span>\n" +
            "\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/forum-index-fid-7.htm\" >新手教堂</a>\t\n" +
            "                   -->\n" +
            "                         \n" +
            "                          \n" +
            "                          \n" +
            "\t\t\t\t\t\t\t                          \n" +
            "                          <span class=\"sep\"></span>\n" +
            "                           <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1.htm\"  Array[forum-index-fid-1.htm]>电影下载</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm]>欧美影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm]>剧情影片</a>\n" +
            "<span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm]>香港影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm]>大陆影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-9.htm\"  Array[forum-index-fid-9.htm]>福利影片</a>\n" +
            "                           <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-8.htm\"  Array[forum-index-fid-8.htm]>美女图片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            "\n" +
            " <a href=\"/forum-index-fid-7.htm\"  Array[forum-index-fid-7.htm]>新手教堂</a>\n" +
            "                      <span class=\"sep\"></span>    \n" +
            "                          \n" +
            "                      <!--\n" +
            "\t\t\t\t\t\t\t<span class=\"sep\"></span>\n" +
            "\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/forum-index-fid-8.htm\" >美女图片</a>\t\n" +
            "                   -->\n" +
            "                         \n" +
            "                          \n" +
            "                          \n" +
            "\t\t\t\t\t\t\t                          \n" +
            "                          <span class=\"sep\"></span>\n" +
            "                           <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1.htm\"  Array[forum-index-fid-1.htm]>电影下载</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-1-typeid2-0-typeid3-0-typeid4-0.htm]>欧美影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-0-typeid2-246-typeid3-0-typeid4-0.htm]>剧情影片</a>\n" +
            "<span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-3-typeid2-0-typeid3-0-typeid4-0.htm]>香港影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "   <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm\"  Array[forum-index-fid-1-typeid1-9-typeid2-0-typeid3-0-typeid4-0.htm]>大陆影片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-9.htm\"  Array[forum-index-fid-9.htm]>福利影片</a>\n" +
            "                           <span class=\"sep\"></span>    \n" +
            "     <span class=\"sep\"></span>\n" +
            " <a href=\"/forum-index-fid-8.htm\"  Array[forum-index-fid-8.htm]>美女图片</a>\n" +
            " <span class=\"sep\"></span>    \n" +
            "  <span class=\"sep\"></span>\n" +
            "\n" +
            " <a href=\"/forum-index-fid-7.htm\"  Array[forum-index-fid-7.htm]>新手教堂</a>\n" +
            "                      <span class=\"sep\"></span>    \n" +
            "                          \n" +
            "                      <!--\n" +
            "\t\t\t\t\t\t\t<span class=\"sep\"></span>\n" +
            "\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/forum-index-fid-9.htm\" >福利影片</a>\t\n" +
            "                   -->\n" +
            "                         \n" +
            "                          \n" +
            "                          \n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t<td class=\"center2\">\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<form action=\"http://www.btbtt55.com/search-index.htm\" target=\"_blank\" id=\"search_form\" method=\"post\">\n" +
            "\t\t\t\t\t\t\t\t<div id=\"search\"><input type=\"text\" id=\"search_keyword\" name=\"keyword\" x-webkit-speech lang=\"zh-CN\" size=\"200\"  placeholder=\" 搜索其实就这么简单!\" /></div>\n" +
            "\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t</form>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t<td class=\"right\"></td>\n" +
            "\t\t\t\t\t</tr>\n" +
            "\t\t\t\t</table>\n" +
            "\t\t\t</div>\n" +
            "\t\t</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\n" +
            "\t\t\n" +
            "\t\t<div id=\"body\" role=\"main\">\n" +
            "\t\t\n" +
            "\t\t\n" +
            "          <!--\n" +
            "<center><img src=\"/1495.jpg\" alt=\"BT种子\" title=\"BT下载\"/></center>-->\n" +
            "\n" +
            "\n" +
            "\n" +
            "<div class=\"width\">\n" +
            "\n" +
            "\t\n" +
            "\t<table id=\"nav\" cellpadding=\"0\" cellspacing=\"0\" style=\"margin-bottom: 4px;\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td class=\"left\"></td>\n" +
            "\t\t\t<td class=\"center\" style=\"white-space:nowrap; overflow: hidden;\">\n" +
            "\t\t\t\t<a class=\"icon icon-home\" href=\"./\"></a>\n" +
            "\t\t\t\t<span class=\"sep\"></span>\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t<span><a href=\"http://www.btbtt55.com/forum-index-fid-1-page-1.htm\" id=\"forum_link\">电影下载</a></span>\n" +
            "\t\t\t\t<span class=\"sep\"></span>\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t<span><a href=\"http://www.btbtt55.com/thread-index-fid-1-tid-12872.htm\">[BT下载][王牌特工2：黄金圈][HD-MP4/2.69G][英语中英双字][</a></span>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td class=\"center2\">\n" +
            "\t\t\t\t\t\t\t\t<span id=\"user\">\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/user-login.htm\" class=\"ajaxdialog\" onclick=\"return false\" rel=\"nofollow\"><span class=\"icon icon-user-user\"></span> 登录</a>\n" +
            "\t\t\t\t\t<a href=\"http://www.btbtt55.com/user-create.htm\" class=\"ajaxdialog\" onclick=\"return false\" rel=\"nofollow\"><span class=\"icon icon-user-create\"></span> 注册</a>\n" +
            "\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t</span>\n" +
            "\t\t\t\t<a href=\"http://www.btbtt55.com/post-thread-fid-1-typeid1-1-typeid2-41-typeid3-31939-typeid4-0-ajax-1.htm\" target=\"_blank\" onclick=\"return false;\" id=\"create_thread\" rel=\"nofollow\"><span class=\"icon icon-post-newthread\"></span> 发新帖</a>\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td class=\"right\"></td>\n" +
            "\t\t</tr>\n" +
            "\t</table>\n" +
            "\t\n" +
            "\t\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-582.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-582-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"残夜浪迹 1楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" style=\"background-image: url(http://www.btbttpic.com/upload/avatar/000/000/582_middle.gif?1506587253)\"></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">残夜浪迹</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t<h2 id=\"subject_12872\">\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t<span class=\"icon icon-top-1\" style=\"margin-right: 2px;\" title=\"置顶主题\"></span>\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/forum-index-fid-1-typeid3-31939.htm\" target=\"_blank\" rel=\"nofollow\">[2017]</a>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/forum-index-fid-1-typeid1-1.htm\" target=\"_blank\" rel=\"nofollow\">[欧美]</a>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/forum-index-fid-1-typeid2-41.htm\" target=\"_blank\" rel=\"nofollow\">[动作]</a>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t[BT下载][王牌特工2：黄金圈][HD-MP4/2.69G][英语中英双字][1080P][141分钟未删减版动作大片]\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\n" +
            "\t\t\t\t\t</h2>\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27734\" class=\"message\"><p><img src=\"http://www.btbttpic.com/upload/attach/000/042/907ba6031c6f74cb71ed2bcb8c659acb.jpg\" width=\"421\" height=\"596\" /><br /></p><p>导演: 马修·沃恩</p><p>编剧: 简·古德曼 / 马修·沃恩 / 马克·米勒 / 戴夫·吉布森</p><p>主演: 塔伦·埃格顿 / 科林·费尔斯 / 马克·斯特朗 / 朱丽安·摩尔 / 埃尔顿·约翰 / 爱德华·霍尔克罗夫特 / 哈莉·贝瑞 / 佩德罗·帕斯卡 / 查宁·塔图姆 / 杰夫·布里吉斯 / 迈克尔·刚本 / 索菲·库克森 / 汉娜·奥斯特罗姆 / 比约恩·格拉纳特 / 莱娜·恩卓 / 波比·迪瓦伊 / 汤姆·本尼迪克·奈特 / 托马斯·图尔格斯 / 基思·艾伦 / 艾米丽·沃森 / 布鲁斯·格林伍德 / 戈登·亚历山大 / 马丁·福特 / 明格斯·约翰斯顿</p><p>类型: 喜剧 / 动作 / 冒险</p><p>制片国家/地区: 英国 / 美国</p><p>语言: 英语</p><p>上映日期: 2017-10-20(中国大陆) / 2017-09-20(英国) / 2017-09-22(美国)</p><p>片长: 141分钟 / 139分钟(中国大陆)</p><p>又名: 王牌特工2 / 皇家特工：金圈子(港) / 金牌特务：机密对决(台) / 王牌特工2：黄金圆环 / 王牌特工：黄金圈 / Kingsman 2</p><p>IMDb链接: tt4649466</p><p>豆瓣评分：7.2</p><p><br /></p><p>剧情简介：</p><p>　　时光飞逝，一转眼，艾格西（塔伦·埃格顿 Taron Egerton 饰）已经成长为了一名出色而又可靠的特工，他和蒂尔德公主（汉娜·阿尔斯托姆 Hanna Alström 饰）之间的感情也愈演愈浓，两人眼看着就要携手步入婚姻的殿堂。就在这个节骨眼上，前特工查理（爱德华·霍尔克罗夫特 Edward Holcroft 饰）杀了回来，如今的他效力于一个名为“黄金圈”的贩毒组织，组织头目波比（朱丽安·摩尔 Julianne Moore 饰）是一个邪恶而又野心勃勃的女人。&nbsp;</p><p>　　查理查出了金士曼的所有据点，用导弹将它们全部摧毁。幸存的艾格西和梅林（马克·斯特朗 Mark Strong 饰）千里迢迢远赴美国，向潜伏在那里的联邦特工寻求帮助。波比种植了一种含有毒素的大麻，将它们输送往世界各地，当瘾君子们体内的毒素渐渐发作后，波比以此为筹码，正式向政府宣战。</p><p><img src=\"http://www.btbttpic.com/upload/attach/000/042/fb46e04a6d094455aba9364b983d6ab2.jpg\" width=\"975\" height=\"402\" /><img src=\"http://www.btbttpic.com/upload/attach/000/042/0db73f5bacf3c4fdbf5f0981c391a737.jpg\" width=\"971\" height=\"406\" /><img src=\"http://www.btbttpic.com/upload/attach/000/042/1d74b8e898dc0a6511085c189d9ab147.jpg\" width=\"971\" height=\"404\" /><img src=\"http://www.btbttpic.com/upload/attach/000/042/9ddcf5c6d50b1195b6272c30729f5fc8.jpg\" width=\"971\" height=\"405\" /><img src=\"http://www.btbttpic.com/upload/attach/000/042/8cb96949b0a1d33efd635761505124b4.jpg\" width=\"971\" height=\"407\" /><br /></p><div></div></div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t<br />\n" +
            "\t\t\t\t\t<div class=\"attachlist\">\n" +
            "\t\t\t\t\t\t<table width=\"100%\" cellpadding=\"2\" class=\"noborder\">\n" +
            "\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t<td class=\"bold\"><span class=\"red\" style=\"font-size: 18px\">1 </span>个下载附件：<font color=\"#FF0000\"><a target=\"_blank\" href=\"http://dl.xunlei.com/\"><font color=\"#FF0000\">★本机需装有“迅雷或者BT相关下载软件”才能下片哦！★</font></a></font></td>\n" +
            "\t\t\t\t\t\t\t\t<td width=\"70\" class=\"grey\">售价</td>\n" +
            "\t\t\t\t\t\t\t\t<td width=\"70\" class=\"grey\">大小</td>\n" +
            "\t\t\t\t\t\t\t\t<td width=\"70\" class=\"grey\">下载</td>\n" +
            "\t\t\t\t\t\t\t\t<td width=\"70\" class=\"grey\">时间</td>\n" +
            "\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t<tr><td colspan=\"6\"><hr /></td></tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t<td>\n" +
            "\t\t\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/attach-dialog-fid-1-aid-42787-ajax-1.htm\" class=\"ajaxdialog\" ajaxdialog=\"{showtitle: false, cache: true, position: 6, modal: false}\" onclick=\"return false;\" target=\"_blank\" rel=\"nofollow\"><img src=\"http://www.btbtt55.com/view/image/filetype/torrent.gif\" width=\"16\" height=\"16\" />王牌T工2.Kingsman.The.Golden.Circle.2017.HD1080P.X264.AAC.English.CHS-ENG.mp4.torrent</a>\n" +
            "\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t<td class=\"red\">0 金币</td>\n" +
            "\t\t\t\t\t\t\t\t<td class=\"grey\">18.81K</td>\n" +
            "\t\t\t\t\t\t\t\t<td>47180 次</td>\n" +
            "\t\t\t\t\t\t\t\t<td class=\"grey\">6月前</td>\n" +
            "\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t<tr><td colspan=\"6\"><hr /></td></tr>\n" +
            "\t\t\t\t\t\t\t                           \n" +
            "\t\t\t\t\t\t</table>\n" +
            "                       <p align=\"center\"><font color=\"#0000FF\"><span style=\"font-size: 11.5pt\">本站所有电影完全免费，必须用迅雷下载，下载的人越多下载速度越快，把资源分享给您的朋友可以大大提高下载速度。</span></font></p>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27734\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#1楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t\t<tr>\n" +
            "\t\t\t<td></td>\n" +
            "\t\t\t<td></td>\n" +
            "\t\t\t<td>\n" +
            "\t\t\t\t<div class=\"bg2 border\" style=\"margin-top: 1px; padding: 8px;\">\n" +
            "\t\t\t\t\t<span class=\"grey\">发帖时间：</span><b>6月前</b> &nbsp; <span class=\"grey2\">|</span> &nbsp; \n" +
            "\t\t\t\t\t<span class=\"grey\">查看数：</span><span id=\"thread_views\" class=\"bold\">0</span> &nbsp; <span class=\"grey2\">|</span> &nbsp; \n" +
            "\t\t\t\t\t<span class=\"grey\">回复数：</span><b>42</b>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-582.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-582-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"残夜浪迹 2楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" style=\"background-image: url(http://www.btbttpic.com/upload/avatar/000/000/582_middle.gif?1506587253)\"></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">残夜浪迹</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27735\" class=\"message\">全网首发1080P超清英语中英双字，完整未删减动作大片，值得观看！</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27735\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#2楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-2453.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-2453-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"终结之岚 3楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">终结之岚</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27736\" class=\"message\">谢谢分享</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27736\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#3楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-90.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-90-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"btbta 4楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" style=\"background-image: url(http://www.btbttpic.com/upload/avatar/000/000/90_middle.gif?1458194348)\"></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">btbta</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27739\" class=\"message\">确实很好看，强烈建议下载观看。。。。。。。。。。</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27739\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#4楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-12037.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-12037-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"发财 5楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">发财</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27741\" class=\"message\">谢谢分享,祝好人好梦,梦想成真!!</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27741\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#5楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-12041.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-12041-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"Young先森 6楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">Young先森</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27742\" class=\"message\">66666</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27742\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#6楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-12068.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-12068-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"没毛的狼 7楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">没毛的狼</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27750\" class=\"message\">终于回归了，可惜以前的用户名没有了。。。谢谢分享</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27750\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#7楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-12069.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-12069-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"邪恶的舌头 8楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">邪恶的舌头</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27754\" class=\"message\">支持</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27754\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#8楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-12094.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-12094-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"ml2244287 9楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">ml2244287</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27758\" class=\"message\">好东西</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27758\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#9楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-12103.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-12103-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"12345678Lisa 10楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">12345678Lisa</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27761\" class=\"message\">f好</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27761\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#10楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-12103.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-12103-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"12345678Lisa 11楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">12345678Lisa</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27763\" class=\"message\">thanks</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27763\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#11楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-520.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-520-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"whs1954 12楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" style=\"background-image: url(http://www.btbttpic.com/upload/avatar/000/000/520_middle.gif?1467420858)\"></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">whs1954</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27767\" class=\"message\">非常感谢楼主发片共享！</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27767\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#12楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-12150.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-12150-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"空空无量 13楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">空空无量</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27776\" class=\"message\">多谢分享666666666</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27776\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#13楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-12187.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-12187-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"mossback 14楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">mossback</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27779\" class=\"message\">無聊的時候,看看電影還真不錯！！</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27779\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#14楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-10341.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-10341-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"王建 15楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">王建</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27780\" class=\"message\">非常感谢楼主发片共享！<br /></div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27780\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#15楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-12227.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-12227-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"俞同福 16楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">俞同福</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27784\" class=\"message\">好东西 哈哈</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27784\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#16楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-12273.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-12273-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"xiaoliu 17楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">xiaoliu</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27793\" class=\"message\">66666666666</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27793\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#17楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-12312.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-12312-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"ccavv123 18楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">ccavv123</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27842\" class=\"message\">good.good.good</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27842\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#18楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-12282.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-12282-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"毒刺 19楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">毒刺</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27847\" class=\"message\">感谢分享</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27847\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#19楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-12357.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-12357-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\" aria-label=\"boyxulei 20楼\">\n" +
            "\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t</a>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\">boyxulei</div>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border post\">\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div id=\"message_27918\" class=\"message\">多谢分享</div>\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t<div class=\"grey mod\" pid=\"27918\" style=\"zoom: 1;\">\n" +
            "\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"width: 150px; float: left; text-align: left;\" class=\"small\">6月前</span>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t#20楼\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\n" +
            "\t\t\n" +
            "\t\n" +
            "\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" style=\"margin-top: 4px;\" class=\"post_table\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td width=\"70\" valign=\"top\">\n" +
            "\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\n" +
            "\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t<div style=\"word-break:break-all;\"></div>\n" +
            "\t\t\t\t<div class=\"grey small\">游客组</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td width=\"15\"></td>\n" +
            "\t\t\t<td class=\"post_td\" valign=\"top\">\n" +
            "\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\n" +
            "\t\t\t\t<div class=\"bg1 border shadow\" style=\"padding: 8px;\">\n" +
            "\t\t\t\t\t<form action=\"http://www.btbtt55.com/post-post-fid-1-tid-12872-ajax-1-quickpost-1.htm\" method=\"post\" id=\"quick_post_form\" target=\"_blank\">\n" +
            "\t\t\t\t\t\t<input type=\"hidden\" name=\"FORM_HASH\" value=\"dc87211ef70851ea\" />\n" +
            "\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t<textarea name=\"message\" id=\"quick_message\" style=\"width: 100%; height: 60px; font-size: 14px; overflow: hidden;\" aria-label=\"快速回复内容\"></textarea>\n" +
            "\t\t\t\t\t\t<div style=\"margin-top: 4px;\">\n" +
            "\t\t\t\t\t\t\t<div style=\"width: 50%; float: left;\">\n" +
            "\t\t\t\t\t\t\t\t<a type=\"submit\" class=\"button smallblue\" id=\"quick_post_submit\" value=\"快速回复\" href=\"javascript:void(0)\" role=\"button\"><span>快速回复</span></a>\n" +
            "\t\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t<div style=\"width: 50%; float: left; text-align: right;\">\n" +
            "\t\t\t\t\t\t\t\t<a href=\"http://www.btbtt55.com/post-post-fid-1-tid-12872-ajax-1.htm\" class=\"grey ajaxdialog\" ajaxdialog=\"{cache: true}\" onclick=\"return false;\" id=\"create_post\" >高级回复</a>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</form>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t</table>\n" +
            "\t\n" +
            "\t\n" +
            "\t<div class=\"box\">\n" +
            "\t\t<div class=\"page\" style=\"text-align: center;\"><a href=\"http://www.btbtt55.com/thread-index-fid-1-tid-12872-page-1.htm\" class=\"checked\">1</a><a href=\"http://www.btbtt55.com/thread-index-fid-1-tid-12872-page-2.htm\">2</a><a href=\"http://www.btbtt55.com/thread-index-fid-1-tid-12872-page-3.htm\">3</a><a href=\"http://www.btbtt55.com/thread-index-fid-1-tid-12872-page-2.htm\">▶</a></div>\n" +
            "\t\t\t\t<p style=\"text-align: center; padding: 8px;\">\n" +
            "\t\t\t\t\t\t<a type=\"button\" value=\" 返回【电影下载】\" class=\"button bigblue\" id=\"return_back\" href=\"javascript:void(0)\" role=\"button\"><span> 返回【电影下载】</span></a>\n" +
            "\t\t</p>\n" +
            "\t</div>\n" +
            "\t\n" +
            "\t\n" +
            "\n" +
            "</div>\n" +
            "\n" +
            "\t\t\n" +
            "\t\t</div>\n" +
            "\t\t\n" +
            "\t</div>\n" +
            "\t\n" +
            "</div>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "<div id=\"footer\" role=\"contentinfo\">\n" +
            "\t\n" +
            "\t<table class=\"width\">\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td class=\"left\">\n" +
            "\t\t\t\t免责声明：本站纯属公益性网站，所有资源来自网友上传，与本站无关！删除请联系billokyes@gmail.com 我们会及时删除<br />\n" +
            "\t\t\t\tPowered by  <a href=\"http://bbs.xiuno.com\" target=\"_blank\" class=\"grey\">Xiuno BBS <b>2.1.0</b></a>\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t\t<td class=\"right\">\n" +
            "\t\t\t\t<br />\n" +
            "\t\t\t\t2018-5-29 15:14, 耗时:0.0095s\n" +
            "\t\t\t\t\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t</table>\n" +
            "\t\n" +
            "</div>\n" +
            "\n" +
            "\n" +
            "<script src=\"http://www.btbtt55.com/view/js/jquery-1.4.min.js\" type=\"text/javascript\" ></script>\n" +
            "\n" +
            "<script src=\"http://www.btbtt55.com/view/js/common.js\" type=\"text/javascript\"></script>\n" +
            "\n" +
            "<script src=\"http://www.btbtt55.com/view/js/dialog.js\" type=\"text/javascript\"></script>\n" +
            "<script src=\"/slade.js\"></script>\n" +
            "<script type=\"text/javascript\">\n" +
            "\n" +
            "$('#search input').focus(function() {$('#search').addClass('hover');});\n" +
            "$('#search input').blur(function() {$('#search').removeClass('hover');});\n" +
            "$('#search input').keyup(function(e) {\n" +
            "\tif(e.which == 13 || e.which == 10) {\n" +
            "\t\tvar val = encodeURIComponent($(this).val());\n" +
            "\t\t$('#search_form').attr('action', 'http://www.btbtt55.com/search-index-keyword-'+val+'.htm');\n" +
            "\t\t$('#search_form').submit();\n" +
            "\t\treturn false;\n" +
            "\t}\n" +
            "});\n" +
            "\n" +
            "// 登陆后才能发帖\n" +
            "$('#create_thread').click(function() {\n" +
            "\tif(g_uid == 0) {\n" +
            "\t\tajaxdialog_request('http://www.btbtt55.com/user-login.htm', function() {\n" +
            "\t\t\t$('#create_thread').unbind('click');\n" +
            "\t\t\tajaxdialog_request($('#create_thread').attr('href'));\n" +
            "\t\t\t$('#create_thread').click(function() {\n" +
            "\t\t\t\tajaxdialog_request($('#create_thread').attr('href'));\n" +
            "\t\t\t});\n" +
            "\t\t}, {fullicon: 1});\n" +
            "\t\treturn false;\n" +
            "\t} else {\n" +
            "\t\tajaxdialog_request($('#create_thread').attr('href'), null);\n" +
            "\t\treturn false;\n" +
            "\t}\n" +
            "});\n" +
            "\n" +
            "$('a.ajaxdialog, input.ajaxdialog').die('click').live('click', ajaxdialog_click);\n" +
            "$('a.ajaxtoggle').die('click').live('click', ajaxtoggle_event);\n" +
            "\n" +
            "//$('div.list .table tr:odd').not('tr.header').addClass('odd');\t/* 奇数行的背景色 */\n" +
            "//$('div.list .table tr:last').addClass('last');\t/* 奇数行的背景色 */\n" +
            "\n" +
            "\n" +
            "</script>\n" +
            "\n" +
            "<script language=\"javascript\" src=\"http://count11.51yes.com/click.aspx?id=113999888&logo=12\" charset=\"gb2312\"></script>\n" +
            "<script type=\"text/javascript\" src=\"plugin/fspk_retop/retop.js\"></script>\n" +
            "\n" +
            "\n" +
            "<script type=\"text/javascript\">\n" +
            "\n" +
            "tid_add_read(12872, 1527578088);\n" +
            "\n" +
            "$('#create_post').click(function() {\n" +
            "\tif(g_uid == 0) {\n" +
            "\t\tajaxdialog_request('http://www.btbtt55.com/user-login.htm', function() {\n" +
            "\t\t\t$('#create_post').unbind('click');\n" +
            "\t\t\tajaxdialog_request($('#create_post').attr('href'));\n" +
            "\t\t\t$('#create_post').click(function() {\n" +
            "\t\t\t\tajaxdialog_request($('#create_post').attr('href'));\n" +
            "\t\t\t});\n" +
            "\t\t});\n" +
            "\t\treturn false;\n" +
            "\t} else {\n" +
            "\t\treturn true;\n" +
            "\t}\n" +
            "});\n" +
            "\n" +
            "// 点击数服务器\n" +
            "$.getScript('http://www.btbtt55.com/service/clickd/?db=tid&w=12872&r=12872&'+Math.random(), function() {\n" +
            "\tif(typeof xn_json == 'undefined') return;\n" +
            "\tvar json = xn_json;\n" +
            "\t$('#thread_views').html(json['12872']);\n" +
            "});\n" +
            "\n" +
            "// 自动伸缩，自动提交\n" +
            "$('#quick_message').keyup(function(e) {\n" +
            "\tif((e.ctrlKey && (e.which == 13 || e.which == 10)) || (e.altKey && e.which == 83)) {\n" +
            "\t\t$('#quick_post_submit').trigger('click');\n" +
            "\t\treturn false;\n" +
            "\t}\n" +
            "        \n" +
            "\tvar h = $(this)[0].scrollHeight;\n" +
            "\tif(h <= 100) {\n" +
            "\t\treturn true;\n" +
            "\t} else {\n" +
            "\t\t$(this).height($(this)[0].scrollHeight);\n" +
            "\t\treturn true;\n" +
            "\t}\n" +
            "});\n" +
            "\n" +
            "// 快速回复\n" +
            "$('#quick_post_submit').click(function() {\n" +
            "\tif(!$('#quick_message').val()) {\n" +
            "\t\t$('#quick_message').alert('请填写内容！', {width: 150, delay: 3000}).focus();\n" +
            "\t\treturn false;\n" +
            "\t}\n" +
            "\t$('#quick_post_submit').disable();\n" +
            "\t\n" +
            "\tfunction quick_post_submit_func() {\n" +
            "\t\tvar postdata = $(\"#quick_post_form\").serialize();\n" +
            "\t\t$.post($('#quick_post_form').attr('action'), postdata,  function(s){\n" +
            "\t\t\tvar json = json_decode(s);\n" +
            "\t\t\tif(error = json_error(json)) {alert(error); return false;}\n" +
            "\t\t\tif(json.status <= 0) {\n" +
            "\t\t\t\talert(json.message);\n" +
            "\t\t\t\treturn false;\n" +
            "\t\t\t} else {\n" +
            "\t\t\t\tjson = json.message;\n" +
            "\t\t\t\tif(json.message) {\n" +
            "\t\t\t\t\t$('#quick_message').alert(json.message, {width:250, delay: 3000}).focus();\n" +
            "\t\t\t\t\treturn false;\n" +
            "\t\t\t\t}\n" +
            "\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t//var page = Math.max(1, intval(json.page));\n" +
            "\t\t\t\t//window.location= 'http://www.btbtt55.com/thread-index-fid-1-tid-12872-page-'+page+'-scrollbottom-1.htm';\n" +
            "\t\t\t\t\n" +
            "\t\t\t\tvar post = json.post;\n" +
            "\t\t\t\t// 结果直接显示在上面，不再跳转\n" +
            "\t\t\t\tvar s = '<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\" class=\"post_table\">\\\n" +
            "\t\t\t\t\t<tr>\\\n" +
            "\t\t\t\t\t\t<td width=\"70\" valign=\"top\">\\\n" +
            "\t\t\t\t\t\t\t<div>\\\n" +
            "\t\t\t\t\t\t\t\t<a href_real=\"http://www.btbtt55.com/you-index-uid-0.htm\" target=\"_blank\" href=\"http://www.btbtt55.com/you-profile-uid-0-ajax-1.htm\" class=\"ajaxdialog_hover\" ajaxdialog=\"{position: 5, modal: false, timeout: 1000, showtitle: false}\" onclick=\"return false;\" style=\"display: block\" rel=\"nofollow\">\\\n" +
            "\t\t\t\t\t\t\t\t\t<span class=\"avatar_middle border bg1\" ></span>\\\n" +
            "\t\t\t\t\t\t\t\t</a>\\\n" +
            "\t\t\t\t\t\t\t</div>\\\n" +
            "\t\t\t\t\t\t\t<div style=\"word-break:break-all;\" aria-label=\"'+post.username+' '+post.posts+'楼\">'+post.username+'</div>\\\n" +
            "\t\t\t\t\t\t</td>\\\n" +
            "\t\t\t\t\t\t<td width=\"15\"></td>\\\n" +
            "\t\t\t\t\t\t<td class=\"post_td\" valign=\"top\">\\\n" +
            "\t\t\t\t\t\t\t<span class=\"icon icon-left-arrow\" style=\"position: absolute; z-index: 9; float: left; margin-left: -9px; margin-top: 10px;\"></span>\\\n" +
            "\t\t\t\t\t\t\t<div class=\"bg1 border post\">\\\n" +
            "\t\t\t\t\t\t\t\t<div id=\"message_'+post.pid+'\" class=\"message\">'+post.message+'</div>\\\n" +
            "\t\t\t\t\t\t\t</div>\\\n" +
            "\t\t\t\t\t\t</td>\\\n" +
            "\t\t\t\t\t</tr>\\\n" +
            "\t\t\t\t</table>';\n" +
            "\t\t\t\tvar jtable = $(s);\n" +
            "\t\t\t\t$('table.post_table:last').before(jtable);\n" +
            "\t\t\t\t//jtable.message = post.message;\n" +
            "\t\t\t\t$('#quick_message').val('').focus();\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t$('#quick_post_submit').enable();\n" +
            "\t\t\t}\n" +
            "\t\t});\n" +
            "\t}\n" +
            "\n" +
            "\tif(g_uid == 0) {\n" +
            "\t\tajaxdialog_request('http://www.btbtt55.com/user-login.htm', function() {\n" +
            "\t\t\tquick_post_submit_func();\n" +
            "\t\t\treturn false;\n" +
            "\t\t});\n" +
            "\t} else {\n" +
            "\t\tquick_post_submit_func();\n" +
            "\t\treturn false;\n" +
            "\t}\n" +
            "});\n" +
            "\n" +
            "// 滚动回复的到最底部\n" +
            "\n" +
            "// 记录当前页码\n" +
            "var fid_page = $.parseJSON($.pdata(cookie_pre + 'fid_page'));\n" +
            "var page = fid_page ? fid_page[''+1] : 1;\n" +
            "var href = $('#forum_link').attr('href').replace(/page-1/ig, \"page-\"+page);\n" +
            "$('#forum_link').attr('href', href);\n" +
            "$('#return_back').click(function() {\n" +
            "\twindow.location = href;\n" +
            "});\n" +
            "\n" +
            "// 鼠标放在头像上弹出用户信息 ajaxdialog_hover\n" +
            "var jajaxdialoglinks = $('a.ajaxdialog_hover');\n" +
            "jajaxdialoglinks.die('click').live('click', function() {window.open($(this).attr('href_real'))});\n" +
            "jajaxdialoglinks.die('mouseover').live('mouseover', ajaxdialog_mouseover);\n" +
            "jajaxdialoglinks.die('mouseout').live('mouseout', ajaxdialog_mouseout);\n" +
            "$('a.ajaxconfirm').die('click').live('click', ajaxdialog_confirm);\n" +
            "\n" +
            "// post_td 下的图片调整大小\n" +
            "$(function() {\n" +
            "\tvar td_width = $('td.post_td').width() - 28;\n" +
            "\ttd_width = Math.min($('#body').width() - 170, td_width);\n" +
            "\t$('td.post_td img').each(function() {\n" +
            "\t\tif($(this).width() > td_width) {\n" +
            "\t\t\tthis.height = Math.ceil((this.height /this.width) * td_width);\n" +
            "\t\t\tthis.width = Math.ceil(td_width);\n" +
            "\t\t\t\n" +
            "\t\t\tthis.style.cursor = 'pointer';\n" +
            "\t\t\tthis.onclick = function() {\n" +
            "\t\t\t\twindow.open(this.src);\n" +
            "\t\t\t}\n" +
            "\t\t}\n" +
            "\t});\n" +
            "});\n" +
            "\n" +
            "// 快捷键翻页\n" +
            "bind_document_keyup_page();\n" +
            "$('div.post').each(function(i) {\n" +
            "\tvar _this = this;\n" +
            "\t$(_this).hover(\n" +
            "\t\tfunction() {\n" +
            "\t\t\t$(_this).find('div.mod div').show().css('opacity', 0).stop().animate({opacity:1}, 500);\n" +
            "\t\t},\n" +
            "\t\tfunction() {\n" +
            "\t\t\t$(_this).find('div.mod div').animate({opacity:0}, 500);\n" +
            "\t\t}\n" +
            "\t)\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "\n" +
            "\n" +
            "</body>\n" +
            "\n" +
            "</html>\n";
    public static void main(String[] args) {
        Document doc = Jsoup.parse(content);
        Elements elementsTag = doc.getElementsByTag("p");
        Elements elementsImg = doc.getElementsByTag("img");

        Iterator itTag =  elementsTag.iterator();
        Iterator itImg =  elementsImg.iterator();
        String a = "";
        while(itTag.hasNext()){
            Element element = (Element)itTag.next();
            a += element.text().toString() + "|";
        }

        String b = "";
        while(itImg.hasNext()){
            Element element = (Element)itImg.next();
            b += element.attr("src")+ "|";
        }
        System.out.println(a);
        System.out.println("=========================");
        System.out.println(b);
    }





}
