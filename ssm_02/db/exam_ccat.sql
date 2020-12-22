/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : exam_ccat

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 22/12/2020 11:37:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;


-- ----------------------------
-- Table structure for roominfo
-- ----------------------------
DROP TABLE IF EXISTS `roominfo`;
CREATE TABLE `roominfo`  (
  `room_id` int(11) NOT NULL AUTO_INCREMENT,
  `room_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` date NULL DEFAULT NULL,
  `room_type` int(255) NULL DEFAULT NULL,
  `room_status` int(255) NULL DEFAULT NULL,
  `price` double(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`room_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of roominfo
-- ----------------------------
INSERT INTO `roominfo` VALUES (1, '1001', '2020-12-21', 1, 0, 110.00);
INSERT INTO `roominfo` VALUES (2, '1002', '2020-12-21', 2, 1, 200.00);
INSERT INTO `roominfo` VALUES (3, '1003', '2020-12-16', 3, 0, 888.00);

SET FOREIGN_KEY_CHECKS = 1;
