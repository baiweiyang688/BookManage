/*
 Navicat Premium Data Transfer

 Source Server         : 123
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 11/03/2021 23:59:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_one
-- ----------------------------
DROP TABLE IF EXISTS `t_one`;
CREATE TABLE `t_one`  (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_one
-- ----------------------------
INSERT INTO `t_one` VALUES (1, '威哥真牛啊');
INSERT INTO `t_one` VALUES (2, '威哥偶像');
INSERT INTO `t_one` VALUES (3, '4645646');
INSERT INTO `t_one` VALUES (4, 'adaasdasd');
INSERT INTO `t_one` VALUES (5, '威大少爷少爷');
INSERT INTO `t_one` VALUES (6, '威哥真的牛');
INSERT INTO `t_one` VALUES (7, '威哥真牛');
INSERT INTO `t_one` VALUES (8, '牛逼的威少');
INSERT INTO `t_one` VALUES (9, '威哥吊炸天');
INSERT INTO `t_one` VALUES (10, '威哥勇往直前');
INSERT INTO `t_one` VALUES (11, '威哥壮志凌云');
INSERT INTO `t_one` VALUES (12, '73767');
INSERT INTO `t_one` VALUES (13, '434345');
INSERT INTO `t_one` VALUES (14, '445345');
INSERT INTO `t_one` VALUES (15, '谢谢威哥！！！');
INSERT INTO `t_one` VALUES (16, '大阿达');

SET FOREIGN_KEY_CHECKS = 1;
