/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : sms

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 01/08/2019 17:47:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sms_config
-- ----------------------------
DROP TABLE IF EXISTS `sms_config`;
CREATE TABLE `sms_config`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `profile` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `platform` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `config` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `created` datetime(0) DEFAULT NULL,
  `creator` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `modified` datetime(0) DEFAULT NULL,
  `modifier` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_config
-- ----------------------------
INSERT INTO `sms_config` VALUES (1, 'test', 'alibaba', '{\"appId\":\"xxx\", \"appSecret\":\"xxx\"}', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sms_template
-- ----------------------------
DROP TABLE IF EXISTS `sms_template`;
CREATE TABLE `sms_template`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `template_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `platform` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_template
-- ----------------------------
INSERT INTO `sms_template` VALUES (1, 'SMS_10001', 'test', '亲爱的{},你的短信{}已发送,请查收');

SET FOREIGN_KEY_CHECKS = 1;
