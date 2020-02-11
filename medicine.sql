/*
Navicat MySQL Data Transfer

Source Server         : sql
Source Server Version : 50550
Source Host           : localhost:3306
Source Database       : medicine

Target Server Type    : MYSQL
Target Server Version : 50550
File Encoding         : 65001

Date: 2016-06-23 19:58:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for medicineinformation
-- ----------------------------
DROP TABLE IF EXISTS `medicineinformation`;
CREATE TABLE `medicineinformation` (
  `name` char(40) NOT NULL,
  `company` char(40) NOT NULL,
  `number` int(4) NOT NULL,
  `price` int(4) NOT NULL,
  `mainfunction` char(40) NOT NULL,
  PRIMARY KEY (`name`,`company`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of medicineinformation
-- ----------------------------
INSERT INTO `medicineinformation` VALUES ('a', 'a', '11', '12', 'as');
INSERT INTO `medicineinformation` VALUES ('b', 'b', '1', '120', 'as');
INSERT INTO `medicineinformation` VALUES ('板蓝根', '一正药业', '100', '10', '感冒流涕');
INSERT INTO `medicineinformation` VALUES ('板蓝根', '吉林药业', '100', '10', '感冒流涕');
INSERT INTO `medicineinformation` VALUES ('板蓝根颗粒', 'a', '200', '50', '感冒');
INSERT INTO `medicineinformation` VALUES ('阿司匹林', '吉林药业', '100', '50', '感冒发烧');
SET FOREIGN_KEY_CHECKS=1;
