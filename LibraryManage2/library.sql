/*
 Navicat Premium Data Transfer

 Source Server         : ZHYone
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : library

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 12/03/2021 21:46:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ϵͳ���',
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '�û���',
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '��¼����',
  `type` int(11) DEFAULT NULL COMMENT '���ࣺ\r\n            ��ͨ����Ա :0\r\n            ϵͳ����Ա�� 1',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '���ݿ����Ա��\r\n  ��Ϊ��ͨ����Ա ϵͳ����Ա' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (2, 'admin', '123456', 0);
INSERT INTO `admin` VALUES (7, 'ZHYone', '949949', 1);

-- ----------------------------
-- Table structure for book_info
-- ----------------------------
DROP TABLE IF EXISTS `book_info`;
CREATE TABLE `book_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `author` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `publish` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ISBN` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '��׼���',
  `introduction` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '��Ľ���',
  `language` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '����',
  `price` double DEFAULT NULL COMMENT '�۸���Ϣ',
  `pub_date` date DEFAULT NULL COMMENT '����ʱ��',
  `type_id` int(10) DEFAULT NULL COMMENT '����ͼ�������е�id',
  `status` int(10) DEFAULT NULL COMMENT '0 未借出\r\n1 已经借出',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'ͼ�����Ϣ��' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book_info
-- ----------------------------
INSERT INTO `book_info` VALUES (1, '小王子', '安东尼·德·圣埃克苏佩里', '北京时代华文书局', '9787569922783', '【中英双语版】小王子（全2册）中英文双语版 圣埃克苏佩里著小王子英文版原版小说世界名著学生课外读物畅销书籍', '中文/英文', 49.8, '2021-02-11', 1, 0);
INSERT INTO `book_info` VALUES (8, '工科分析化学', '黄荣斌', '高等教育出版社', '9787040473100', '高教正版 浙江工业大学 工科分析化学 黄荣斌 高等教育出版社教材 大学教材考试辅导书籍考研用书 理工类', '中文', 32.8, '2021-02-11', 4, 0);
INSERT INTO `book_info` VALUES (3, '活着', '余华', '作家出版社', '9787506365437', '余华作品 原版长篇民国历史小说电影原著小说 中国当代文学小说', '中文', 28, '2021-02-11', 1, 0);
INSERT INTO `book_info` VALUES (4, '战国策', '张洁', '北京联合出版公司', '9787550243750', '史学经典共4册 战国策 国语 史记 三国志 中华国学经典精粹畅销书历史地理读本 中国通史中医古籍 全注全译 青少年中小学课外阅读', '中文', 12, '2021-02-11', 2, 1);
INSERT INTO `book_info` VALUES (11, '彩绘全注全译全解史记', '[西汉] 司马迁著；郑晨 编', '北京联合出版公司', '9787550237063', '白话文精装正版 全注全译全解史记 司马迁著 国学经典藏书文白对照 中国通史 青少年版历史知识读物图书', '中文', 75, '2021-02-11', 2, NULL);
INSERT INTO `book_info` VALUES (12, 'C Primer Plus 第6版 中文版', '姜佑', '人民邮电出版社', '9787115521637', 'C Primer Plus 第6版 中文版第六版 c语言程序设计经典教材书初学c计算机语言基础编程开发零基础入门到精通教程 C++编程书籍', '中文/英文', 108, '2021-02-11', 28, NULL);
INSERT INTO `book_info` VALUES (13, 'Java编程思想第4版', '埃克尔 陈昊鹏（译）', '机械工业出版社', '9787111213826', 'Java编程思想 第4版中文版 thinking in java语言程序设计零基础自学 java从入门到精通 核心技术教程教材编程语言JAVA书籍计算机', '中文/英文', 108, '2021-02-11', 28, NULL);
INSERT INTO `book_info` VALUES (14, 'C语言课程设计与游戏开发实践教程', '童晶 丁海军 金永霞 周小芹', '清华大学出版社', '9787302472407', 'C语言是一门重要的基础课程，但传统教材一般偏向于语法规则的介绍，实例偏数学算法，过于抽象、趣味性不强。针对这些问题，本书把游戏开发实践应用于C语言课程设计教学，课程设计中尽量站在初学者的角度，降低开发游戏的难度，不超出所学知识范围，逐步提高读者对编程的兴趣和能力。本书的授课方法已在实际教学中验证，大一学生普遍能写出数千行代码的复杂游戏，编程能力显著提升。', '中文/英文', 39, '2021-02-11', 28, NULL);
INSERT INTO `book_info` VALUES (15, '莫泊桑短篇小说集', '莫泊桑', '黑龙江科学技术出版社', '9787538869330', '文学畅销书，小说无数次被改编为戏剧和影视作品风靡全球，北大教授、安徒生文学奖获得者曹文轩倾情推荐。\n[法] 莫泊桑 著', '中文', 43.8, '2021-02-11', 1, 0);
INSERT INTO `book_info` VALUES (16, '溶剂 化工产品手册（第六版）', '解一军 杨宇婴 习峥辉 高晓哲', '化学工业出版社', '9787122263520', '正版 化工产品手册（第六版）溶剂 新版化工产品手册 溶剂产品溶液品种工业技术书 化学工业溶剂与增塑剂的生产工业技术书籍', '中文', 89, '2021-02-11', 4, 1);
INSERT INTO `book_info` VALUES (17, '天然产物生物合成 化学原理与酶学机制', '（美）克里斯托弗. 沃尔什、唐奕（著）；胡友财（译）', '化学工业出版社', '9787122369413', '2020版 天然产物生物合成 化学原理与酶学机制 天然产物形成的化学逻辑 天然产物生物合成途径中关键酶的结构生物学 原版引进丛书', '中文', 328, '2021-02-11', 4, NULL);
INSERT INTO `book_info` VALUES (18, '生物信息学与功能基因组学 原著第三版', '（美）乔纳森&middot;佩夫斯纳（Jonathan,Pevsner）著', '化学工业出版社', '9787122344106', '生物信息学与功能基因组学 原著第三版 生物信息学基因组学遗传学基因基因组医学国际知名生物信息学专家精心打造的经典信息学著作', '中文', 298, '2021-02-12', 4, NULL);
INSERT INTO `book_info` VALUES (19, '医学免疫学', '褚以微', '复旦大学出版社', '9787309117219', '医学免疫学（博学middot;基础医学本科核心课程系列教材） 储以微 复旦大学出版社 图书籍', '中文', 72, '2021-02-12', 30, NULL);
INSERT INTO `book_info` VALUES (20, 'SIFIC医院感染预防与控制临床实践指引', '胡必杰', '上海科学技术出版社', '9787547816998', '正版2013胡必杰SIFIC医院感染预防与控制临床实践指引预防医学培训教材感染学理论医药卫生正版图书籍上海科学技术出版社有限公司', '中文', 68, '2021-02-12', 30, NULL);
INSERT INTO `book_info` VALUES (21, '神经解剖学', '蒋文华', '复旦大学出版社', '9787309031195', '神经解剖学//基础医学系列 蒋文华 复旦大学出版社 图书籍 神经科学相关研究生的教材', '中文', 62, '2021-02-12', 30, NULL);
INSERT INTO `book_info` VALUES (22, '临床神经解剖学（著）； 张刚利 吉宏明 陈胜利（译）', 'Stephen G. Waxman', '江苏凤凰科学技术出版社', '9787571300302', '【正版图书】 床神经解剖学 原著第28版 神经系统疾病定位诊断学 脊骨神经功能听觉视觉前庭脑神经解剖 生理临床内科医学专业知识', '中文', 150, '2021-02-12', 30, NULL);

-- ----------------------------
-- Table structure for class_info
-- ----------------------------
DROP TABLE IF EXISTS `class_info`;
CREATE TABLE `class_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 31 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'ͼ��ķ���� ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of class_info
-- ----------------------------
INSERT INTO `class_info` VALUES (1, '（I）文学', ' 文学相关书籍');
INSERT INTO `class_info` VALUES (2, '（K）历史、地理', '历史、地理相关书籍');
INSERT INTO `class_info` VALUES (4, '（TQ）化学工业', '化学工业相关书籍');
INSERT INTO `class_info` VALUES (28, '（TP）计算机技术、自动化技术', ' 计算机技术、自动化技术方面的书籍');
INSERT INTO `class_info` VALUES (30, '（R）医药、卫生', ' 医药、卫生相关书籍');

-- ----------------------------
-- Table structure for lend_list
-- ----------------------------
DROP TABLE IF EXISTS `lend_list`;
CREATE TABLE `lend_list`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ϵͳ���',
  `book_id` int(11) DEFAULT NULL COMMENT '��ı��',
  `reader_id` int(11) DEFAULT NULL COMMENT '����id',
  `lend_date` datetime(0) DEFAULT NULL COMMENT '���ʱ��',
  `back_date` datetime(0) DEFAULT NULL COMMENT '�黹ʱ��',
  `type` int(10) DEFAULT NULL COMMENT '�黹ͼ�����ͣ�\r\n              0�������黹\r\n              1�����ڹ黹\r\n              2������黹\r\n              3����ʧ����\r\n              4������',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '��ע',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '���黹����ؼ�¼��Ϣ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lend_list
-- ----------------------------
INSERT INTO `lend_list` VALUES (17, 16, 7, '2021-02-11 16:32:57', '2021-02-11 16:35:49', 2, NULL);
INSERT INTO `lend_list` VALUES (18, 4, 7, '2021-02-12 07:56:40', NULL, NULL, NULL);
INSERT INTO `lend_list` VALUES (16, 15, 7, '2021-02-11 16:32:57', '2021-02-11 16:33:46', 0, NULL);
INSERT INTO `lend_list` VALUES (14, 1, 2, '2021-02-11 16:32:17', NULL, NULL, NULL);
INSERT INTO `lend_list` VALUES (15, 3, 2, '2021-02-11 16:32:17', '2021-02-11 16:37:13', 1, NULL);

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '����',
  `create_date` date DEFAULT NULL COMMENT '����ʱ��',
  `author` int(11) DEFAULT NULL COMMENT '������',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '������Ϣ��' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES (6, '测试1', '2021-02-11', 1);

-- ----------------------------
-- Table structure for reader_card
-- ----------------------------
DROP TABLE IF EXISTS `reader_card`;
CREATE TABLE `reader_card`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '��¼����',
  `password` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '����',
  `number` int(10) DEFAULT NULL COMMENT '借书数量',
  `name` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '��������',
  `sex` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '�Ա�',
  `birthday` date DEFAULT NULL COMMENT '��������',
  `address` varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '��ַ',
  `tel` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '�绰',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '����',
  `creat_date` datetime(0) DEFAULT NULL,
  `cjr` int(11) DEFAULT NULL,
  `cardnumber` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '���Ŀ���ͼ�鿨��' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reader_card
-- ----------------------------
INSERT INTO `reader_card` VALUES (2, 'zx', '123456', 6, '张昕', '女', '1995-10-19', NULL, '5678904567890', 'zhangxin@163.com', NULL, NULL, '19951019019');
INSERT INTO `reader_card` VALUES (7, 'qqdd', '123456', 6, '袁一琦', '女', NULL, NULL, '7896765697', 'yuanyiqi@qq.com', NULL, NULL, '20000319017');

SET FOREIGN_KEY_CHECKS = 1;
