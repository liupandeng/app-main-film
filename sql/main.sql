CREATE TABLE `dianying_content` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `film_id` int(11) DEFAULT NULL COMMENT '电影对应id',
  `content` longtext COMMENT '页面内容',
  `down_url` varchar(255) DEFAULT NULL COMMENT '下载地址',
  `intime` datetime DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `year` varchar(11) DEFAULT NULL COMMENT '电影年份',
  `area` varchar(50) DEFAULT NULL COMMENT '地域',
  `type` varchar(50) DEFAULT NULL COMMENT '类型',
  `down_method` varchar(50) DEFAULT NULL COMMENT '下载方式',
  `name` varchar(255) DEFAULT NULL COMMENT '电影名称',
  `size` varchar(52) DEFAULT NULL COMMENT '格式和大小',
  `subtitles` varchar(50) DEFAULT NULL COMMENT '中文字幕或者其他',
  `sharpness` varchar(50) DEFAULT NULL COMMENT '清晰度',
  `desc` varchar(100) DEFAULT NULL COMMENT '描述',
  `vip` int(11) DEFAULT '0' COMMENT '0 : 不需要vip',
  `cover` varchar(255) DEFAULT NULL COMMENT '电影封面',
  `content_text` longtext COMMENT '演员等信息',
  `imgs` varchar(1024) DEFAULT NULL COMMENT '内容里面的图片',
  `user_name` varchar(52) DEFAULT NULL COMMENT '用户名称',
  `head_img` varchar(255) DEFAULT NULL COMMENT '用户头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `film_id` (`film_id`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;



CREATE TABLE `dianying_id` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '电影id表',
  `film_id` int(11) NOT NULL,
  `type` int(4) DEFAULT NULL COMMENT '0：正常',
  `page_num` int(11) DEFAULT NULL,
  `intime` datetime DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `film_id` (`film_id`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE `fake_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '用户昵称',
  `head_img` varchar(255) DEFAULT NULL COMMENT '头像',
  `intime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;