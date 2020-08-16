-- ----------------------------
-- 商品信息表
-- ----------------------------
CREATE TABLE `product`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `cid` int(11) NOT NULL COMMENT '商品分类',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商品名称',
  `pro_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '随机的一个商品编码',
  `keyword` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关键字，方便用户搜索',
  `img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '商品图片url',
  `price` decimal(10, 2) NOT NULL COMMENT '最低配置的价格，为了吸引用户点击',
  `desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT '' COMMENT '商品描述，简介，广告词',
  `status` tinyint(1) NOT NULL DEFAULT 1 COMMENT '状态：-1 已删除 0 下架 1 上架',
  `create_date` datetime(0) NOT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- 商品类目表（商品分类）
-- ----------------------------
CREATE TABLE `prod_category`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `pid` int(10) NOT NULL COMMENT '上一级分类id，0为最高分类 1 为二级分类 数字越大 分类越后',
  `ord` int(3) NOT NULL COMMENT '排序',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '分类名称',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- 商品图片表，一个商品对应多张图片，可能还有视频
-- ----------------------------
CREATE TABLE `prod_img`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `prod_id` bigint(20) NOT NULL COMMENT '商品ID',
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '图片路径',
  `create_time` datetime(0) NOT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- 商品详情表
-- ----------------------------
CREATE TABLE `prod_detail`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `product_id` bigint(20) NOT NULL COMMENT '商品id，关联product表',
  `contents` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '商品详情表',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- 商品属性key表
-- ----------------------------
CREATE TABLE `property_key`  (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `cid` int(10) NOT NULL COMMENT '与商品信息表中的cid对应 与商品类目表中的ID对应',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '例如：颜色 版本 尺寸',
  `is_sale` tinyint(255) NOT NULL COMMENT '是否销售属性：0否 1 是',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- 商品属性value表
-- ----------------------------
CREATE TABLE `property_value`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name_id` bigint(20) NOT NULL COMMENT '属性名称id，关联property_key表id',
  `value` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '属性值',
  `img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '属性图片',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- 商品 属性名 属性值 关联表 property
-- ----------------------------
CREATE TABLE `prod_property`  (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `product_id` bigint(20) NOT NULL COMMENT '商品ID,关联product表ID',
  `key_id` bigint(20) NOT NULL COMMENT '类目属性名id,关联property_key表id',
  `value_id` bigint(20) NOT NULL COMMENT '类目属性值id,关联property_value表id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- 商品库存量表 product_sku 此表为关键表，根据商品的属性和属性值来判定商品的价格和库存量
-- ----------------------------
CREATE TABLE `product_sku`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `product_id` bigint(20) NOT NULL COMMENT '商品ID，关联product表ID',
  `properties` text CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '属性键值对，property_key；property_value 关联两张表的ID',
  `price` decimal(10, 2) NOT NULL COMMENT '商品价格',
  `cost` decimal(10, 2) NOT NULL COMMENT '商品成本，可有可无值',
  `stock` int(10) NOT NULL COMMENT '库存',
  `weight` double(10, 2) NULL DEFAULT NULL COMMENT '重量，克',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;


