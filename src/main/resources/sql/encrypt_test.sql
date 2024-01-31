SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for encrypt_test
-- ----------------------------
DROP TABLE IF EXISTS `encrypt_test`;
CREATE TABLE `encrypt_test`  (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` varchar(64) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `var` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1752616456007323649 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of encrypt_test
-- ----------------------------
INSERT INTO `encrypt_test` VALUES (1, 'aa', NULL, 'a');
INSERT INTO `encrypt_test` VALUES (2, 'aa', NULL, 'b');

SET FOREIGN_KEY_CHECKS = 1;
