CREATE TABLE `demo_po`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- data row
-- ----------------------------
INSERT INTO `demo_po` VALUES (1);

SET FOREIGN_KEY_CHECKS = 1;
