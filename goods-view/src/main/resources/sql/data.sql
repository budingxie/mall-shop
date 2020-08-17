-- ----------------------------
-- 分类表 数据
-- ----------------------------
INSERT INTO `prod_category`(`id`, `pid`, `ord`, `name`, `create_time`) VALUES (1, 0, 1, '男装女装', '2020-08-17 11:42:43');
INSERT INTO `prod_category`(`id`, `pid`, `ord`, `name`, `create_time`) VALUES (2, 1, 1, '潮流女装', '2020-08-17 11:44:02');
INSERT INTO `prod_category`(`id`, `pid`, `ord`, `name`, `create_time`) VALUES (3, 1, 1, '时尚男装', '2020-08-17 11:44:26');
INSERT INTO `prod_category`(`id`, `pid`, `ord`, `name`, `create_time`) VALUES (4, 1, 1, '羽绒服', '2020-08-17 11:45:05');
INSERT INTO `prod_category`(`id`, `pid`, `ord`, `name`, `create_time`) VALUES (5, 1, 1, '秋冬外套', '2020-08-17 11:45:29');
INSERT INTO `prod_category`(`id`, `pid`, `ord`, `name`, `create_time`) VALUES (6, 2, 1, '新品', '2020-08-17 11:46:05');
INSERT INTO `prod_category`(`id`, `pid`, `ord`, `name`, `create_time`) VALUES (7, 2, 1, '连衣裙', '2020-08-17 11:46:19');

-- ----------------------------
-- 商品表 数据
-- ----------------------------
INSERT INTO `product`(`id`, `cid`, `name`, `pro_no`, `keyword`, `img`, `price`, `desc`, `status`, `create_date`) VALUES (1, 6, '【抢新价！限时限量！】2色+春夏个性九分破洞牛仔女裤', '7547', '新品，牛仔裤', '//budingxie.img.com/xinpin/abc.jpg', 80.70, '', 1, '2020-08-17 11:52:40');
INSERT INTO `product`(`id`, `cid`, `name`, `pro_no`, `keyword`, `img`, `price`, `desc`, `status`, `create_date`) VALUES (2, 7, '新款不规则裙裤假两件a字高腰显瘦修身半身裙短裤裙女夏外穿', '1623', '新品，连衣裙', '//budingxie.img.com/xinpin/egs.jpg', 100.00, '', 1, '2020-08-17 12:27:32');

-- ----------------------------
-- 属性表 数据，比如 衣服尺寸、颜色
-- ----------------------------