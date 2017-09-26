/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50716
Source Host           : 127.0.0.1:3306
Source Database       : imooc

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-09-26 12:00:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `accid` int(11) NOT NULL,
  `money` double(8,2) NOT NULL DEFAULT '0.00' COMMENT '金额'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', '0.00');
INSERT INTO `account` VALUES ('2', '110.00');

-- ----------------------------
-- Table structure for teacher_student_ref
-- ----------------------------
DROP TABLE IF EXISTS `teacher_student_ref`;
CREATE TABLE `teacher_student_ref` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_id` int(11) NOT NULL COMMENT '关联教师ID',
  `student_id` int(11) NOT NULL COMMENT '关联学生ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='教师与学生关系表';

-- ----------------------------
-- Records of teacher_student_ref
-- ----------------------------
INSERT INTO `teacher_student_ref` VALUES ('1', '1', '17');

-- ----------------------------
-- Table structure for t_department
-- ----------------------------
DROP TABLE IF EXISTS `t_department`;
CREATE TABLE `t_department` (
  `depa_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '部门ID 主键',
  `depa_name` varchar(50) NOT NULL COMMENT '部门名称',
  `depa_no` int(8) NOT NULL COMMENT '部门编号',
  `is_del` int(8) DEFAULT '0' COMMENT '是否删除',
  `depa_status` int(8) NOT NULL COMMENT '状态 0生效 1禁用',
  PRIMARY KEY (`depa_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_department
-- ----------------------------
INSERT INTO `t_department` VALUES ('1', '财务部update', '1007', null, '0');
INSERT INTO `t_department` VALUES ('2', '业务部save', '1001', null, '0');
INSERT INTO `t_department` VALUES ('3', '事业部', '1003', null, '0');
INSERT INTO `t_department` VALUES ('4', '安全部update', '1002', null, '0');
INSERT INTO `t_department` VALUES ('5', '安全防御部', '1006', null, '0');
INSERT INTO `t_department` VALUES ('6', '测试部门', '10009', '0', '0');

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) NOT NULL,
  `name` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('17', '10', 'AAA');
INSERT INTO `t_student` VALUES ('18', '20', 'BBB');

-- ----------------------------
-- Table structure for t_tearcher
-- ----------------------------
DROP TABLE IF EXISTS `t_tearcher`;
CREATE TABLE `t_tearcher` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_age` int(11) NOT NULL,
  `t_name` varchar(50) NOT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_tearcher
-- ----------------------------
INSERT INTO `t_tearcher` VALUES ('1', '18', 'zhangsan');
INSERT INTO `t_tearcher` VALUES ('2', '28', 'lisi');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) NOT NULL COMMENT '用户名',
  `pass_word` varchar(50) NOT NULL COMMENT '密码',
  `email` varchar(50) NOT NULL COMMENT '邮箱',
  `nick_name` varchar(50) NOT NULL COMMENT '昵称',
  `reg_time` varchar(50) NOT NULL COMMENT '注册日期',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='用户';

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '1', '123', '123@qq.com', 'ss', '2017');
INSERT INTO `t_user` VALUES ('2', 'joe', '123456', 'joe@qq.com', 'spring boot', '2017-09-16 11:39:41');
INSERT INTO `t_user` VALUES ('3', 'joe123', '123456', 'joe@qq.com', 'spring boot', '2017-09-16 11:40:02');
INSERT INTO `t_user` VALUES ('4', 'joe spring b', '123456', 'joe@qq.com', 'spring boot', '2017-09-16 12:03:12');
