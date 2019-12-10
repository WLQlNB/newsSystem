/*
Navicat MySQL Data Transfer

Source Server         : work
Source Server Version : 50727
Source Host           : localhost:3306
Source Database       : news

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2019-12-09 17:49:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_news
-- ----------------------------
DROP TABLE IF EXISTS `t_news`;
CREATE TABLE `t_news` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `context` varchar(500) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=35 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_news
-- ----------------------------
INSERT INTO `t_news` VALUES ('34', '央行出手，稳定离岸人民币汇率）', '本报记者 李司坤\r\n\r\n当离岸与在岸人民币5日双双破“7”后，中国监管当局开始做出应对。中国人民银行(央行)6日宣布，将于本月14日在香港发行300亿元人民币央行票据。对外经贸大学国际经济研究院院长桑百川6日对《环球时报》记者表示，该消息代表央行确实开始出手稳定汇率了。\r\n\r\n央行官网发布消息称，为完善香港人民币债券收益率曲线，中国人民银行将于2019年8月14日在香港发行两期人民币央行票据，总发行量为300亿元，其中3个月期央行票据200亿元，1年期央行票据100亿元。\r\n');

-- ----------------------------
-- Table structure for t_theme
-- ----------------------------
DROP TABLE IF EXISTS `t_theme`;
CREATE TABLE `t_theme` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `nid` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `nid` (`nid`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_theme
-- ----------------------------
INSERT INTO `t_theme` VALUES ('1', '国际新闻', null);
INSERT INTO `t_theme` VALUES ('2', '国内新闻', '34');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_bin NOT NULL,
  `sex` varchar(20) COLLATE utf8_bin NOT NULL,
  `password` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2019007 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('2019001', '张三', '男', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `t_user` VALUES ('2019002', '李四', '男', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `t_user` VALUES ('2019003', '王五', '男', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `t_user` VALUES ('2019004', '小红', '女', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `t_user` VALUES ('2019005', '小明', '男', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `t_user` VALUES ('2019006', '小雪', '女', 'e10adc3949ba59abbe56e057f20f883e');
