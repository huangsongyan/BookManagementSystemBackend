/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 80028
Source Host           : localhost:3306
Source Database       : book_management_system

Target Server Type    : MYSQL
Target Server Version : 80028
File Encoding         : 65001

Date: 2024-02-29 09:58:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `book_id` bigint NOT NULL AUTO_INCREMENT,
  `book_title` varchar(50) DEFAULT NULL,
  `author` varchar(50) DEFAULT NULL,
  `publication_year` year DEFAULT NULL,
  `isbn` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `cover` varchar(100) DEFAULT NULL,
  `brief_info` text,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '红楼梦', '曹雪芹', '1996', '123456', 'https://img1.doubanio.com/view/subject/s/public/s1070959.jpg', '都云作者痴，谁解其中味？');
INSERT INTO `book` VALUES ('4', '活着  ', '余华', '2012', 'xxx', 'https://img9.doubanio.com/view/subject/s/public/s29869926.jpg', '生的苦难与伟大');
INSERT INTO `book` VALUES ('5', '哈利·波特', 'J.K.罗琳 (J.K.Rowling) / 苏农', '2008', 'xxx', 'https://img9.doubanio.com/view/subject/s/public/s29101586.jpg', '从9¾站台开始的旅程');
INSERT INTO `book` VALUES ('6', '百年孤独', '加西亚·马尔克斯', '2011', 'xxx', 'https://img1.doubanio.com/view/subject/s/public/s27237850.jpg', '魔幻现实主义文学代表作');
INSERT INTO `book` VALUES ('7', '三国演义', '[明] 罗贯中', '1998', '1998', 'https://img3.doubanio.com/view/subject/s/public/s1076932.jpg', '是非成败转头空');
INSERT INTO `book` VALUES ('8', '安徒生童话故事集', '（丹麦）安徒生 ', '1997', 'sdasd', 'https://img3.doubanio.com/view/subject/s/public/s1034062.jpg', '为了争取未来的一代');
INSERT INTO `book` VALUES ('9', '天龙八部', '金庸', '1994', 'gggg', 'https://img9.doubanio.com/view/subject/s/public/s26018275.jpg', '有情皆孽，无人不冤');
INSERT INTO `book` VALUES ('10', '野草', '鲁迅', '1973', 'gggaa', 'https://img2.doubanio.com/view/subject/s/public/s34099301.jpg', '我以这一丛野草，在明与暗，生与死，过去与未来之际，献于友与仇，人与兽，爱者与不爱者之前作证。');

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('8');
