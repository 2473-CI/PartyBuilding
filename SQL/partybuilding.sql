/*
 Navicat Premium Data Transfer

 Source Server         : 阿里云7月
 Source Server Type    : MySQL
 Source Server Version : 80032
 Source Host           : 47.115.207.245:3309
 Source Schema         : partybuilding

 Target Server Type    : MySQL
 Target Server Version : 80032
 File Encoding         : 65001

 Date: 30/04/2023 20:13:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Interview
-- ----------------------------
DROP TABLE IF EXISTS `Interview`;
CREATE TABLE `Interview`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `interviewee` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '受访者',
  `interviewer` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '采访者',
  `interviewLocation` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '受访地点',
  `context` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '走访内容',
  `interviewTime` datetime NULL DEFAULT NULL COMMENT '走访时间',
  `belongto` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '党支部',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of Interview
-- ----------------------------
INSERT INTO `Interview` VALUES (1, '猹', '陆', '猹大街', '1234455', '2023-04-25 20:36:05', '苏州党支部');

-- ----------------------------
-- Table structure for activity
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `startTime` datetime NULL DEFAULT NULL COMMENT '开始时间',
  `endTime` datetime NULL DEFAULT NULL COMMENT '结束时间',
  `activityAddress` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '活动地址',
  `activityTitle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '活动标题',
  `activityContext` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '活动类容',
  `activityMumber` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '活动人员',
  `belongTo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '党支部',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of activity
-- ----------------------------
INSERT INTO `activity` VALUES (1, '2023-04-13 00:00:00', '2023-04-25 00:00:00', '猹大街', '一起来看看', '找了3只猹', '陆，王', '苏州党支部');

-- ----------------------------
-- Table structure for commend
-- ----------------------------
DROP TABLE IF EXISTS `commend`;
CREATE TABLE `commend`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `commendTitle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '表彰标题',
  `partyName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '所属党支部',
  `commendUserId` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '受表彰的人Id',
  `commendUserName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '收表彰的人名',
  `commendCause` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '被表彰的原因',
  `commendContext` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '被表彰的内容',
  `commendTime` datetime NULL DEFAULT NULL COMMENT '表彰时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of commend
-- ----------------------------

-- ----------------------------
-- Table structure for cost
-- ----------------------------
DROP TABLE IF EXISTS `cost`;
CREATE TABLE `cost`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '姓名',
  `userId` int NULL DEFAULT NULL COMMENT '用户Id',
  `belongto` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '党支部',
  `costNumber` double NULL DEFAULT NULL COMMENT '收缴金额',
  `createTime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '缴纳状态',
  `updateTime` datetime NULL DEFAULT NULL COMMENT '缴纳时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 94 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cost
-- ----------------------------
INSERT INTO `cost` VALUES (76, '游大猹', 1, '苏州党支部', 10, '2023-04-27 22:11:26', '缴费完成', NULL);
INSERT INTO `cost` VALUES (77, 'db', 3, '苏州党支部', 10, '2023-04-27 22:11:26', '缴费完成', NULL);
INSERT INTO `cost` VALUES (78, '王坤', 4, '苏州党支部', 10, '2023-04-27 22:11:26', '缴费完成', NULL);
INSERT INTO `cost` VALUES (79, '12', 12, '苏州党支部', 10, '2023-04-27 22:11:26', '缴费完成', NULL);
INSERT INTO `cost` VALUES (80, '123', 14, '苏州党支部', 10, '2023-04-27 22:11:26', '缴费完成', NULL);
INSERT INTO `cost` VALUES (81, 'jay', 15, '苏州党支部', 10, '2023-04-27 22:11:26', '缴费完成', NULL);
INSERT INTO `cost` VALUES (82, '坤坤', 16, '苏州党支部', 10, '2023-04-27 22:11:26', '缴费完成', NULL);
INSERT INTO `cost` VALUES (83, 'a', 17, '苏州党支部', 10, '2023-04-27 22:11:26', '缴费完成', NULL);
INSERT INTO `cost` VALUES (84, 'chen', 18, '苏州党支部', 10, '2023-04-27 22:11:26', '缴费完成', NULL);
INSERT INTO `cost` VALUES (85, '游大猹', 1, '苏州党支部', 1, '2023-04-27 22:56:45', '待缴费', NULL);
INSERT INTO `cost` VALUES (86, 'db', 3, '苏州党支部', 1, '2023-04-27 22:56:45', '待缴费', NULL);
INSERT INTO `cost` VALUES (87, '王坤', 4, '苏州党支部', 1, '2023-04-27 22:56:45', '待缴费', NULL);
INSERT INTO `cost` VALUES (88, '12', 12, '苏州党支部', 1, '2023-04-27 22:56:45', '待缴费', NULL);
INSERT INTO `cost` VALUES (89, '123', 14, '苏州党支部', 1, '2023-04-27 22:56:45', '待缴费', NULL);
INSERT INTO `cost` VALUES (90, 'jay', 15, '苏州党支部', 1, '2023-04-27 22:56:45', '待缴费', NULL);
INSERT INTO `cost` VALUES (91, '坤坤', 16, '苏州党支部', 1, '2023-04-27 22:56:45', '待缴费', NULL);
INSERT INTO `cost` VALUES (92, 'a', 17, '苏州党支部', 1, '2023-04-27 22:56:45', '待缴费', NULL);
INSERT INTO `cost` VALUES (93, 'chen', 18, '苏州党支部', 1, '2023-04-27 22:56:45', '待缴费', NULL);

-- ----------------------------
-- Table structure for examination
-- ----------------------------
DROP TABLE IF EXISTS `examination`;
CREATE TABLE `examination`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `examinationtitle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '考试标题',
  `examinationstarttime` datetime NULL DEFAULT NULL COMMENT '考试开始时间',
  `examinationendtime` datetime NULL DEFAULT NULL COMMENT '考试结束时间',
  `examination` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '试卷',
  `examinationsubmit` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '提交结果',
  `source` double NULL DEFAULT NULL COMMENT '分数',
  `belongto` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '团支部',
  `userid` int NULL DEFAULT NULL COMMENT '用户Id',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of examination
-- ----------------------------
INSERT INTO `examination` VALUES (3, '测试2', '2023-04-20 00:00:00', '2023-04-17 00:00:00', '/file/download?filename=1682655482025移动应用开发01.docx', '', NULL, '苏州党支部', 1, '游大猹');
INSERT INTO `examination` VALUES (6, '测试', '2023-04-18 00:00:00', '2023-04-13 00:00:00', '/file/download?filename=1682733127869456.docx', '', NULL, '苏州党支部', 1, '游大猹');
INSERT INTO `examination` VALUES (9, '123', '2023-04-29 23:17:57', '2023-04-29 23:17:59', '', '/file/download?filename=1682781486966123.docx', NULL, '苏州党支部', 1, '游大猹');

-- ----------------------------
-- Table structure for expand
-- ----------------------------
DROP TABLE IF EXISTS `expand`;
CREATE TABLE `expand`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `from` int NULL DEFAULT NULL COMMENT '发展人',
  `to` int NULL DEFAULT NULL COMMENT '被发展人',
  `createTime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of expand
-- ----------------------------
INSERT INTO `expand` VALUES (5, 1, 12, '2023-04-25 14:18:22');

-- ----------------------------
-- Table structure for help
-- ----------------------------
DROP TABLE IF EXISTS `help`;
CREATE TABLE `help`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `helpObject` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '帮扶对象姓名',
  `helpObjectCard` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '帮扶对象身份证号',
  `helpObjectAdress` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '帮扶对象地址',
  `helperPartyId` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '帮扶者党员编号',
  `helperName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '帮扶者姓名',
  `helperCard` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '帮扶者身份证',
  `helperAddress` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '帮扶者住址',
  `helperBelongTo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '党支部',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of help
-- ----------------------------
INSERT INTO `help` VALUES (4, 'hhh', '1212321212567', '火星街道办事处', '1223323', '123432', '1234545', '火星街道', '苏州党支部');
INSERT INTO `help` VALUES (5, '21321321', '', '231312', '3123213', '123', '3213213', '123213', '12312');

-- ----------------------------
-- Table structure for life
-- ----------------------------
DROP TABLE IF EXISTS `life`;
CREATE TABLE `life`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `lifeTitle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '标题',
  `lifeSubTitle` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '简介',
  `lifeContext` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '内容',
  `belongTo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '党支部',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of life
-- ----------------------------
INSERT INTO `life` VALUES (3, '党建', '嗨嗨嗨', '123', '苏州党支部');
INSERT INTO `life` VALUES (10, '123', '123', '123', '苏州党支部');
INSERT INTO `life` VALUES (11, '1213323', '43243', '', '苏州党支部');
INSERT INTO `life` VALUES (12, '找猹', '猹1', '猹', '苏州党支部');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int NOT NULL,
  `roleName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '角色名称',
  `roleGrade` int NULL DEFAULT NULL COMMENT '角色等级',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '超级管理员', 1);
INSERT INTO `role` VALUES (2, '分团委老师', 2);
INSERT INTO `role` VALUES (3, '基层支部书记', 2);
INSERT INTO `role` VALUES (4, '党员', 3);
INSERT INTO `role` VALUES (5, '发展党员', 3);
INSERT INTO `role` VALUES (6, '学生', 4);
INSERT INTO `role` VALUES (7, '市民', 4);

-- ----------------------------
-- Table structure for study
-- ----------------------------
DROP TABLE IF EXISTS `study`;
CREATE TABLE `study`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '标题',
  `path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '文件路径',
  `createTime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `belongTo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '所属党支部',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of study
-- ----------------------------
INSERT INTO `study` VALUES (24, '123', '', '2023-03-28 00:00:00', '苏州党支部');
INSERT INTO `study` VALUES (32, '测试', '/file/download?filename=16824784633250416.docx', '2023-04-04 00:00:00', '苏州党支部');
INSERT INTO `study` VALUES (33, '测试2', '/file/download?filename=1682478512466设计文档.docx', '2023-04-13 00:00:00', '苏州党支部');
INSERT INTO `study` VALUES (34, '123', '/file/download?filename=1682478571391123.docx', '2023-04-26 11:09:21', '苏州党支部');
INSERT INTO `study` VALUES (38, '考试1', '/file/download?filename=1682642579595功能文档.docx', '2023-04-10 00:01:00', '苏州党支部');

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `html` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'HTML',
  `css` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'Css',
  `js` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'JS',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of test
-- ----------------------------

-- ----------------------------
-- Table structure for transfer
-- ----------------------------
DROP TABLE IF EXISTS `transfer`;
CREATE TABLE `transfer`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `fromBelongTo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '从哪个各党组织',
  `toBelongTo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '转到哪个党组织',
  `userId` int NULL DEFAULT NULL COMMENT '转移者Id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '转移者姓名',
  `initiator` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '发起人',
  `recipient` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '接受人',
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '状态',
  `createTime` datetime NULL DEFAULT NULL COMMENT '发起时间',
  `updateTime` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '处理时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of transfer
-- ----------------------------
INSERT INTO `transfer` VALUES (1, '苏州党支部', '北京党支部', 1, 'w\'q\'w', '212', '2121', '转接成功', '2023-04-29 20:08:46', '2023-04-29 12:19:12');
INSERT INTO `transfer` VALUES (3, '苏州党支部', '北京党支部', 19, '123', '游大猹', '123', '转接成功', '2023-04-29 20:50:25', '2023-04-29 21:28:41');
INSERT INTO `transfer` VALUES (4, '苏州党支部', '北京党支部', 17, 'a', '游大猹', '123', '拒绝转接', '2023-04-29 21:05:33', '2023-04-29 21:34:44');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '姓名',
  `role` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '身份',
  `identityCard` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '身份证号',
  `partyId` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '党员编号',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '手机号',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邮箱',
  `belongTo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '所属党支部',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '账号',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '游大猹', '超级管理员', '32132321', '01', '13016703849', '2970435887@qq.com', '苏州党支部', 'yr', '202cb962ac59075b964b07152d234b70');
INSERT INTO `user` VALUES (3, 'db', '基层支部书记', '1', '1', '19833343670', 'y.xfl@qq.com', '苏州党支部', 'lwj', '202cb962ac59075b964b07152d234b70');
INSERT INTO `user` VALUES (4, '王坤', '市民', '100000020000000000000000', '000000000200000000001', '19832343670', 'y.x2l@qq.com', '苏州党支部', 'kk', '8d7d8ee069cb0cbbf816bbb65d56947e');
INSERT INTO `user` VALUES (12, '12', '发展党员', '1223', '32123', '3123', '32132', '苏州党支部', '123', '202cb962ac59075b964b07152d234b70');
INSERT INTO `user` VALUES (14, '123456', '市民', '1323242', '232323', '2323232', '323232', '苏州党支部', '121231313', '65355ffd13a9960d7b41fad036e5e2e2');
INSERT INTO `user` VALUES (15, 'jay', '分团委老师', '1234546', '123456', '123456', '123456', '苏州党支部', 'jay', '202cb962ac59075b964b07152d234b70');
INSERT INTO `user` VALUES (16, '坤坤', '超级管理员', '2', '2', '2', '666', '苏州党支部', 'j', '7363a0d0604902af7b70b271a0b96480');
INSERT INTO `user` VALUES (17, 'a', '超级管理员', '9', '9', '9', '9', '苏州党支部', 'l', '202cb962ac59075b964b07152d234b70');
INSERT INTO `user` VALUES (18, 'chen', '分团委老师', '43020102012', '2133', '123123', '13221312231', '苏州党支部', 'chen', '827ccb0eea8a706c4c34a16891f84e7b');
INSERT INTO `user` VALUES (19, '123', '学生', '1231', '121212', '23121212', '21212121', '北京党支部', '121212121', '202cb962ac59075b964b07152d234b70');
INSERT INTO `user` VALUES (20, '121212', '学生', '21212', '21212', '121212', '21212', '苏州党支部', '66666', '202cb962ac59075b964b07152d234b70');
INSERT INTO `user` VALUES (21, 'user1', '超级管理员', '12', '12', '12', '12', '北京党支部', '12', '202cb962ac59075b964b07152d234b70');
INSERT INTO `user` VALUES (22, 'user2', '分团委老师', '666', '666', '666', '6', '北京党支部', '6', '202cb962ac59075b964b07152d234b70');
INSERT INTO `user` VALUES (23, '6', '基层支部书记', '666666666666', '999', '99', '99', '苏州党支部', '999', '202cb962ac59075b964b07152d234b70');

-- ----------------------------
-- Table structure for volunteer
-- ----------------------------
DROP TABLE IF EXISTS `volunteer`;
CREATE TABLE `volunteer`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '姓名',
  `partyId` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '党员编号',
  `startTime` datetime NULL DEFAULT NULL COMMENT '开始时间',
  `endTime` datetime NULL DEFAULT NULL COMMENT '结束时间',
  `volunteerAddress` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '服务地点',
  `volunteerContext` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '服务类容',
  `volunteerTitle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '服务标题',
  `belongTo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '党支部',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of volunteer
-- ----------------------------
INSERT INTO `volunteer` VALUES (1, '游大猹213213', '0000001', '2023-04-15 00:00:00', '2023-04-25 00:00:00', '猹街猹路', '做了嗨嗨嗨', '嗨嗨嗨', '苏州党支部');
INSERT INTO `volunteer` VALUES (4, 'shaih', 'sasas', '2023-04-26 00:00:00', '2023-04-26 00:00:00', '3213', '3213', '3123', 'sasa');

SET FOREIGN_KEY_CHECKS = 1;
