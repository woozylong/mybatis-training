/*
Navicat MySQL Data Transfer

Source Server         : aa
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2015-07-05 23:17:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for _user
-- ----------------------------
DROP TABLE IF EXISTS `_user`;
CREATE TABLE `_user` (
  `name` varchar(255) default NULL,
  `age` int(11) default NULL,
  `id` int(3) NOT NULL auto_increment,
  `groupid` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of _user
-- ----------------------------
INSERT INTO `_user` VALUES ('niu', '26', '1', '2');
INSERT INTO `_user` VALUES ('wu', '22', '2', '1');
INSERT INTO `_user` VALUES ('u1', '22', '9', '1');
INSERT INTO `_user` VALUES ('u1', '22', '10', '2');


-- ----------------------------
-- Table structure for _group
-- ----------------------------
DROP TABLE IF EXISTS `_group`;
CREATE TABLE `_group` (
  `_id` int(11) NOT NULL auto_increment,
  `_name` varchar(20) default NULL,
  PRIMARY KEY  (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of _group
-- ----------------------------
INSERT INTO `_group` VALUES ('1', '第一组');
INSERT INTO `_group` VALUES ('2', '第二组');
