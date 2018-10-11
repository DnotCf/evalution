/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : xve

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-06-18 12:26:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin_info
-- ----------------------------
DROP TABLE IF EXISTS `admin_info`;
CREATE TABLE `admin_info` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `role_id` int(20) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_info
-- ----------------------------
INSERT INTO `admin_info` VALUES ('1', 'zhangsan', '123456', '1');

-- ----------------------------
-- Table structure for class_info
-- ----------------------------
DROP TABLE IF EXISTS `class_info`;
CREATE TABLE `class_info` (
  `id` int(11) DEFAULT NULL,
  `class_name` varchar(20) DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  `enter_time` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class_info
-- ----------------------------
INSERT INTO `class_info` VALUES ('1', '计科', '计算机', '2018-05-01');
INSERT INTO `class_info` VALUES ('2', '电子', '电子工程', '2018-05-15');
INSERT INTO `class_info` VALUES ('3', '舞蹈', '舞蹈学院', '2018-06-18');
INSERT INTO `class_info` VALUES ('4', '金融管理', '金融管理', '2018-06-04');

-- ----------------------------
-- Table structure for course_info
-- ----------------------------
DROP TABLE IF EXISTS `course_info`;
CREATE TABLE `course_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  `student_evalute` int(2) DEFAULT '0',
  `teacher_evalute` varchar(20) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course_info
-- ----------------------------
INSERT INTO `course_info` VALUES ('1', '101', '数据库', '1', '1', '0', '0');
INSERT INTO `course_info` VALUES ('2', '102', 'web', '1', '2', '1', '1');
INSERT INTO `course_info` VALUES ('3', '103', '高数', '1', '3', '1', '0');
INSERT INTO `course_info` VALUES ('4', '104', '物理', '2', '6', '1', '0');
INSERT INTO `course_info` VALUES ('5', '105', '代数', '1', '5', '0', '0');
INSERT INTO `course_info` VALUES ('6', '106', '体育', '2', '6', '1', '0');
INSERT INTO `course_info` VALUES ('7', '107', '政治', '1', '7', '0', '0');
INSERT INTO `course_info` VALUES ('8', '108', '离散', '1', '13', '1', '0');
INSERT INTO `course_info` VALUES ('9', '109', '舞蹈', '1', '10', '0', '0');
INSERT INTO `course_info` VALUES ('12', '105', '中间件', '1', '4', '0', '0');
INSERT INTO `course_info` VALUES ('13', '1111', '环境', '1', '7', '0', '0');
INSERT INTO `course_info` VALUES ('14', '1112', '能源', '1', '7', '1', '0');
INSERT INTO `course_info` VALUES ('23', '4', 'c语言', '1', '21', '0', '0');
INSERT INTO `course_info` VALUES ('24', '5', 'c++程序设计', '1', '20', '0', '0');
INSERT INTO `course_info` VALUES ('26', '6', 'Java程序设计', '1', '24', '1', '0');
INSERT INTO `course_info` VALUES ('27', '7', '体育', '3', '22', '1', '0');
INSERT INTO `course_info` VALUES ('28', '1', '高数', '2', '20', '1', '0');
INSERT INTO `course_info` VALUES ('29', '2', '物理', '1', '25', '1', '0');

-- ----------------------------
-- Table structure for evaluate_info
-- ----------------------------
DROP TABLE IF EXISTS `evaluate_info`;
CREATE TABLE `evaluate_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `is_use` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluate_info
-- ----------------------------
INSERT INTO `evaluate_info` VALUES ('1', '也很艰苦环境科技', '1', '80', '1');

-- ----------------------------
-- Table structure for evaluate_record
-- ----------------------------
DROP TABLE IF EXISTS `evaluate_record`;
CREATE TABLE `evaluate_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` int(11) DEFAULT NULL,
  `evaluate_time` varchar(255) DEFAULT NULL,
  `is_complete` int(11) DEFAULT NULL,
  `target_id` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluate_record
-- ----------------------------
INSERT INTO `evaluate_record` VALUES ('1', '101', null, '1', '1', null);

-- ----------------------------
-- Table structure for evaluate_result
-- ----------------------------
DROP TABLE IF EXISTS `evaluate_result`;
CREATE TABLE `evaluate_result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `evaluate_id` int(11) DEFAULT NULL,
  `record_id` int(11) DEFAULT NULL,
  `score` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluate_result
-- ----------------------------

-- ----------------------------
-- Table structure for evaluations
-- ----------------------------
DROP TABLE IF EXISTS `evaluations`;
CREATE TABLE `evaluations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(20) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluations
-- ----------------------------
INSERT INTO `evaluations` VALUES ('24', 'test刘', '89', '<p>哈哈</p>');
INSERT INTO `evaluations` VALUES ('25', 'test哈哈', '89', '<p>不错</p>');
INSERT INTO `evaluations` VALUES ('26', 'test111', '75', 'n');
INSERT INTO `evaluations` VALUES ('27', 'test刘', '67', 'n');
INSERT INTO `evaluations` VALUES ('28', '老外1', '65', 'n');

-- ----------------------------
-- Table structure for news_info
-- ----------------------------
DROP TABLE IF EXISTS `news_info`;
CREATE TABLE `news_info` (
  `id` int(11) NOT NULL,
  `author` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `status` int(11) NOT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_info
-- ----------------------------

-- ----------------------------
-- Table structure for student_info
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sno` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `sex` enum('女','男') NOT NULL DEFAULT '男',
  `classid` int(11) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES ('17', 'test', '李波', '男', '2', '123456');
INSERT INTO `student_info` VALUES ('18', '2015102003', 'x1', '男', '2', '123456');

-- ----------------------------
-- Table structure for teacher_info
-- ----------------------------
DROP TABLE IF EXISTS `teacher_info`;
CREATE TABLE `teacher_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `department` varchar(255) DEFAULT NULL,
  `teacher_name` varchar(255) DEFAULT NULL,
  `no` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher_info
-- ----------------------------
INSERT INTO `teacher_info` VALUES ('25', '舞蹈', 'test111', '1001', '123456', '男');
INSERT INTO `teacher_info` VALUES ('24', '舞蹈', '老外1', '1005', '123456', '女');
INSERT INTO `teacher_info` VALUES ('21', '金融管理', 'test哈哈', '1003', '123456', '男');
INSERT INTO `teacher_info` VALUES ('19', '计算机', 'test王', '1102', '123456', '女');
INSERT INTO `teacher_info` VALUES ('20', '电子', 'test刘', '10010', '123456', '男');
INSERT INTO `teacher_info` VALUES ('22', '舞蹈系', 'test黄', '1004', '123456', '女');
