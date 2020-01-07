DROP TABLE IF EXISTS `w_word`;
CREATE TABLE `w_word`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `word_content` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '词条内容',
  `creat_time` datetime(0) NULL DEFAULT NULL,
  `is_delete` tinyint(255) NULL DEFAULT NULL COMMENT '删除标志',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '词条表' ROW_FORMAT = Dynamic;