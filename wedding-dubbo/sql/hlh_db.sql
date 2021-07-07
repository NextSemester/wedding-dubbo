/*
Navicat MySQL Data Transfer

Source Server         : fist
Source Server Version : 80013
Source Host           : 127.0.0.1:3306
Source Database       : hlh_db

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2021-07-07 22:30:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_hotel
-- ----------------------------
DROP TABLE IF EXISTS `tb_hotel`;
CREATE TABLE `tb_hotel` (
  `hotel_id` int(11) NOT NULL,
  `hotel_name` varchar(45) NOT NULL,
  `hotel_address` varchar(45) NOT NULL,
  `hotel_tel` varchar(45) NOT NULL,
  `hotel_star` varchar(45) NOT NULL,
  PRIMARY KEY (`hotel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_hotel
-- ----------------------------
INSERT INTO `tb_hotel` VALUES ('1', '重庆南温泉丽筠酒店', '中国重庆巴南区南泉街道南泉路7号', '(023)88128888', 'width:80%');
INSERT INTO `tb_hotel` VALUES ('2', '湘域中餐厅', '重庆天地商业主楼D205', '(023)63700600', 'width:40%');
INSERT INTO `tb_hotel` VALUES ('3', '中天大酒楼', '重庆市渝中区青年路18号(新世纪商场旁)', '023-63739898', 'width:40%');
INSERT INTO `tb_hotel` VALUES ('4', '芸笙餐饮管理有限公司', '江北区观音桥盈嘉中心L7', '（023）88752922', 'width:40%');
INSERT INTO `tb_hotel` VALUES ('5', '礼宴天下', '北滨路368号金源时代广场5楼', '(023)61866666', 'width:80%');
INSERT INTO `tb_hotel` VALUES ('6', '鑫缘至尊渔港（至尊店）', '重庆市江北区（大剧院旁）打渔湾码头', '（023）88607777', 'width:40%');
INSERT INTO `tb_hotel` VALUES ('7', '新华酒店', '重庆市渝中区解放碑青年路9号7楼（英利国际附近）', '(023)63557777', 'width:40%');
INSERT INTO `tb_hotel` VALUES ('8', '锦禧大酒楼（大石坝店）', '大石坝东原D7新新PAPK 4层', '(023)67537099,(023)67537899', 'width:40%');
INSERT INTO `tb_hotel` VALUES ('9', '会利元大饭店', '洋河北路六号附二楼', '(023)67616462', 'width:40%');
INSERT INTO `tb_hotel` VALUES ('10', '洪崖洞大酒店', '重庆市渝中区解放碑沧白路56号洪崖洞大酒店', '(023)63992888', 'width:40%');

-- ----------------------------
-- Table structure for tb_img
-- ----------------------------
DROP TABLE IF EXISTS `tb_img`;
CREATE TABLE `tb_img` (
  `img_id` int(11) NOT NULL,
  `img_add` varchar(45) NOT NULL,
  `tb_hotel_hotel_id` int(11) DEFAULT NULL,
  `tb_room_room_id` int(11) DEFAULT NULL,
  `tb_package_package_id` int(11) DEFAULT NULL,
  `tb_information_info_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`img_id`),
  KEY `fk_tb_img_tb_hotel1_idx` (`tb_hotel_hotel_id`),
  KEY `fk_tb_img_tb_room1_idx` (`tb_room_room_id`),
  KEY `fk_tb_img_tb_package1_idx` (`tb_package_package_id`),
  KEY `fk_tb_img_tb_information1_idx` (`tb_information_info_id`),
  CONSTRAINT `fk_tb_img_tb_hotel1` FOREIGN KEY (`tb_hotel_hotel_id`) REFERENCES `tb_hotel` (`hotel_id`),
  CONSTRAINT `fk_tb_img_tb_information1` FOREIGN KEY (`tb_information_info_id`) REFERENCES `tb_information` (`info_id`),
  CONSTRAINT `fk_tb_img_tb_package1` FOREIGN KEY (`tb_package_package_id`) REFERENCES `tb_package` (`package_id`),
  CONSTRAINT `fk_tb_img_tb_room1` FOREIGN KEY (`tb_room_room_id`) REFERENCES `tb_room` (`room_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_img
-- ----------------------------
INSERT INTO `tb_img` VALUES ('1', 'img/msF58469607Jg.jpg', '1', null, null, null);
INSERT INTO `tb_img` VALUES ('2', 'img/LSN54767537nb.jpg', '2', null, null, null);
INSERT INTO `tb_img` VALUES ('3', 'img/Hbp54860401oB.jpg', '3', null, null, null);
INSERT INTO `tb_img` VALUES ('4', 'img/kSa56681558Sg.jpg', '4', null, null, null);
INSERT INTO `tb_img` VALUES ('5', 'img/Yrm54858716fa.jpg', '5', null, null, null);
INSERT INTO `tb_img` VALUES ('6', 'img/VnI54859050Vt.jpg', '6', null, null, null);
INSERT INTO `tb_img` VALUES ('7', 'img/Lgz54859459lz.jpg', '7', null, null, null);
INSERT INTO `tb_img` VALUES ('8', 'img/RLw54847315Zt.jpg', '8', null, null, null);
INSERT INTO `tb_img` VALUES ('9', 'img/Svv54845919lM.jpg', '9', null, null, null);
INSERT INTO `tb_img` VALUES ('10', 'img/lml54845184qD.jpg', '10', null, null, null);
INSERT INTO `tb_img` VALUES ('11', 'img/woX62017152YC.jpg', null, '1', null, null);
INSERT INTO `tb_img` VALUES ('12', 'img/xYI58407928hh.jpg', null, '2', null, null);
INSERT INTO `tb_img` VALUES ('13', 'img/Fjh58408087nH.jpg', null, '3', null, null);
INSERT INTO `tb_img` VALUES ('14', 'img/QIH58408321sf.jpg', null, '4', null, null);
INSERT INTO `tb_img` VALUES ('15', 'img/cNX58409716jf.jpg', null, '5', null, null);
INSERT INTO `tb_img` VALUES ('16', 'img/cNX58409716jf.jpg', null, '6', null, null);
INSERT INTO `tb_img` VALUES ('17', 'img/cNX58409716jf.jpg', null, '7', null, null);
INSERT INTO `tb_img` VALUES ('18', 'img/cNX58409716jf.jpg', null, '8', null, null);
INSERT INTO `tb_img` VALUES ('19', 'img/cNX58409716jf.jpg', null, '9', null, null);
INSERT INTO `tb_img` VALUES ('20', 'img/cNX58409716jf.jpg', null, '10', null, null);
INSERT INTO `tb_img` VALUES ('21', 'img/cNX58409716jf.jpg', null, '11', null, null);
INSERT INTO `tb_img` VALUES ('22', 'img/cNX58409716jf.jpg', null, '12', null, null);
INSERT INTO `tb_img` VALUES ('23', 'img/cNX58409716jf.jpg', null, '13', null, null);
INSERT INTO `tb_img` VALUES ('24', 'img/cNX58409716jf.jpg', null, '14', null, null);
INSERT INTO `tb_img` VALUES ('25', 'img/cNX58409716jf.jpg', null, '15', null, null);
INSERT INTO `tb_img` VALUES ('26', 'img/cNX58409716jf.jpg', null, '16', null, null);
INSERT INTO `tb_img` VALUES ('27', 'img/cNX58409716jf.jpg', null, '17', null, null);
INSERT INTO `tb_img` VALUES ('28', 'img/cNX58409716jf.jpg', null, '18', null, null);
INSERT INTO `tb_img` VALUES ('29', 'img/cNX58409716jf.jpg', null, '19', null, null);
INSERT INTO `tb_img` VALUES ('30', 'img/ZBO58408845Lm.jpg', null, null, '1', null);
INSERT INTO `tb_img` VALUES ('31', 'img/ZBO58408845Lm.jpg', null, null, '2', null);
INSERT INTO `tb_img` VALUES ('32', 'img/ZBO58408845Lm.jpg', null, null, '3', null);
INSERT INTO `tb_img` VALUES ('33', 'img/ZBO58408845Lm.jpg', null, null, '4', null);
INSERT INTO `tb_img` VALUES ('34', 'img/ZBO58408845Lm.jpg', null, null, '5', null);
INSERT INTO `tb_img` VALUES ('35', 'img/ZBO58408845Lm.jpg', null, null, '6', null);
INSERT INTO `tb_img` VALUES ('36', 'img/ZBO58408845Lm.jpg', null, null, '7', null);
INSERT INTO `tb_img` VALUES ('37', 'img/ZBO58408845Lm.jpg', null, null, '8', null);
INSERT INTO `tb_img` VALUES ('38', 'img/ZBO58408845Lm.jpg', null, null, '9', null);
INSERT INTO `tb_img` VALUES ('39', 'img/ZBO58408845Lm.jpg', null, null, '10', null);
INSERT INTO `tb_img` VALUES ('40', 'img/ZBO58408845Lm.jpg', null, null, '11', null);
INSERT INTO `tb_img` VALUES ('41', 'img/ZBO58408845Lm.jpg', null, null, '12', null);
INSERT INTO `tb_img` VALUES ('42', 'img/ZBO58408845Lm.jpg', null, null, '13', null);
INSERT INTO `tb_img` VALUES ('43', 'img/ZBO58408845Lm.jpg', null, null, '14', null);
INSERT INTO `tb_img` VALUES ('44', 'img/ZBO58408845Lm.jpg', null, null, '15', null);
INSERT INTO `tb_img` VALUES ('45', 'img/ZBO58408845Lm.jpg', null, null, '16', null);
INSERT INTO `tb_img` VALUES ('46', 'img/ZBO58408845Lm.jpg', null, null, '17', null);
INSERT INTO `tb_img` VALUES ('47', 'img/ZBO58408845Lm.jpg', null, null, '18', null);
INSERT INTO `tb_img` VALUES ('48', 'img/ZBO58408845Lm.jpg', null, null, '19', null);
INSERT INTO `tb_img` VALUES ('49', 'img/ZBO58408845Lm.jpg', null, null, '20', null);
INSERT INTO `tb_img` VALUES ('50', 'img/ZBO58408845Lm.jpg', null, null, '21', null);
INSERT INTO `tb_img` VALUES ('51', 'img/ZBO58408845Lm.jpg', null, null, '22', null);
INSERT INTO `tb_img` VALUES ('52', 'img/ZBO58408845Lm.jpg', null, null, '23', null);
INSERT INTO `tb_img` VALUES ('53', 'img/ZBO58408845Lm.jpg', null, null, '24', null);
INSERT INTO `tb_img` VALUES ('54', 'img/ZBO58408845Lm.jpg', null, null, '25', null);
INSERT INTO `tb_img` VALUES ('55', 'img/ZBO58408845Lm.jpg', null, null, '26', null);
INSERT INTO `tb_img` VALUES ('56', 'img/ZBO58408845Lm.jpg', null, null, '27', null);
INSERT INTO `tb_img` VALUES ('57', 'img/ZBO58408845Lm.jpg', null, null, '28', null);
INSERT INTO `tb_img` VALUES ('58', 'img/ZBO58408845Lm.jpg', null, null, '29', null);
INSERT INTO `tb_img` VALUES ('59', 'img/ZBO58408845Lm.jpg', null, null, '30', null);
INSERT INTO `tb_img` VALUES ('60', 'img/ZBO58408845Lm.jpg', null, null, '31', null);
INSERT INTO `tb_img` VALUES ('61', 'img/ZBO58408845Lm.jpg', null, null, '32', null);
INSERT INTO `tb_img` VALUES ('62', 'img/ZBO58408845Lm.jpg', null, null, '33', null);
INSERT INTO `tb_img` VALUES ('63', 'img/cNX58409716jf.jpg', null, '20', null, null);

-- ----------------------------
-- Table structure for tb_information
-- ----------------------------
DROP TABLE IF EXISTS `tb_information`;
CREATE TABLE `tb_information` (
  `info_id` int(11) NOT NULL,
  `info_star_level` varchar(45) NOT NULL,
  `info_decorate_time` varchar(45) NOT NULL,
  `info_subscription` varchar(45) NOT NULL,
  `info_service_fee` varchar(45) NOT NULL,
  `info_enter_fee` varchar(45) NOT NULL,
  `info_dressing_room` varchar(45) NOT NULL,
  `info_bus` varchar(45) NOT NULL,
  `info_microphone` varchar(45) NOT NULL,
  `info_projector` varchar(45) NOT NULL,
  `info_tablecloth` varchar(45) NOT NULL,
  `info_electric_charge` varchar(45) NOT NULL,
  `info_amusement` varchar(45) NOT NULL,
  `info_coordinatesA` varchar(45) NOT NULL,
  `info_coordinatesB` varchar(45) DEFAULT NULL,
  `tb_hotel_hotel_id` int(11) NOT NULL,
  PRIMARY KEY (`info_id`),
  KEY `fk_tb_information_tb_hotel_idx` (`tb_hotel_hotel_id`),
  CONSTRAINT `fk_tb_information_tb_hotel` FOREIGN KEY (`tb_hotel_hotel_id`) REFERENCES `tb_hotel` (`hotel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_information
-- ----------------------------
INSERT INTO `tb_information` VALUES ('1', '国际五星', '2015年12月', '5000元', '10%服务费+6%增值税费', '无', '有', '轨道3号线转327/309/168/302南泉站下', '5支', '有', '香槟色、红色、白色', '无', '机麻', '106.55161', '29.395001', '1');
INSERT INTO `tb_information` VALUES ('2', '特色餐饮', '2012年', '2000元', '无', '无', '提供一个包房', '1.261、503、875（嘉宾路化龙桥', '免费提供2个无线话筒', '无', '不可换', '免费', '免费提供2桌机麻', '106.516706', '29.558478', '2');
INSERT INTO `tb_information` VALUES ('3', '特色餐厅', '无', '1000元--2000元', '无', '无', '送一间化妆间', '公交：462、465、413路', '2个，无线话筒', '无', '否', '否', '免费使用，不限制数量', '106.581949', '29.563544', '3');
INSERT INTO `tb_information` VALUES ('4', '特色餐饮', '无', '1000元', '无', '无', '赠送一个包间', '轻轨3号线观音桥下车，2号口出来即到', '2个无线麦克风', '无', '不可换', '免费', '无', '106.540343', '29.57906', '4');
INSERT INTO `tb_information` VALUES ('5', '特色餐厅', '0年', '20%', '无', '3000元', '送包间', '127路 127路区间 168路 617', '2个无线', '有', '红色、香槟色', '免费', '4桌宴席送一桌，超出50元一桌', '106.530609', '29.562697', '5');
INSERT INTO `tb_information` VALUES ('6', '特色餐厅', '无', '5000', '5%', '无', '赠送化妆间', '轻轨6号线，大剧院下车，步行1公里即到', '2个无线麦克风', '有，3米*3米', '可换', '无', '每十桌送三桌手搓麻将', '106.587432', '29.580672', '6');
INSERT INTO `tb_information` VALUES ('7', '特色餐厅', '无', '每桌100元', '无', '西式300元，中式500元', '无婚房，有包房作化妆间', '402、462、465、612', '2个，无线话筒', '无', '否', '否', '有，免费7桌', '106.582062', '29.563115', '7');
INSERT INTO `tb_information` VALUES ('8', '特色餐饮', '2014年', '100元/桌', '3元/人', '无', '赠送化妆间一个', '113路 114路 115路 133路 ', '有', '无', '白色', '免费', '有套餐、无赠送', '106.503862', '29.576975', '8');
INSERT INTO `tb_information` VALUES ('9', '特色餐厅', '0年', '2000元', '菜品的6%', '800元', '赠送化妆间', '地铁：1、2、3号线 公交：401、40', '有', '2个无线', '白色', '免费', '免费15台机麻', '106.540752', '29.592695', '9');
INSERT INTO `tb_information` VALUES ('10', '特色餐饮', '无', '场地定金1000，确定菜品交20%订金', '我要', '无', '满20桌送婚房', '111/151/181/262/466/', '3个，无线话筒', '有，宽2米*高1.5米', '是', '否', '免费，满20桌送4桌，可累加', '106.58621', '29.568328', '10');

-- ----------------------------
-- Table structure for tb_package
-- ----------------------------
DROP TABLE IF EXISTS `tb_package`;
CREATE TABLE `tb_package` (
  `package_id` int(11) NOT NULL,
  `package_name` varchar(45) NOT NULL,
  `package_price` int(11) NOT NULL,
  `package_content` varchar(45) NOT NULL,
  `package_sales` int(11) NOT NULL,
  `package_menuA` varchar(45) DEFAULT NULL,
  `package_menuB` varchar(45) DEFAULT NULL,
  `tb_hotel_hotel_id` int(11) NOT NULL,
  PRIMARY KEY (`package_id`),
  KEY `fk_tb_package_tb_hotel1_idx` (`tb_hotel_hotel_id`),
  CONSTRAINT `fk_tb_package_tb_hotel1` FOREIGN KEY (`tb_hotel_hotel_id`) REFERENCES `tb_hotel` (`hotel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_package
-- ----------------------------
INSERT INTO `tb_package` VALUES ('1', '1699元套餐', '1699', '6个冷菜、1个汤、10个热菜、2个点心、1个主食、1盘水果', '0', 'img/pPk58408883vI.jpg', 'img/Rna58408892bL.jpg', '1');
INSERT INTO `tb_package` VALUES ('2', '1999元套餐', '1999', '6个冷菜、1个汤、10个热菜、2个点心、1个主食、1盘水果', '0', 'img/NYd58409204TV.jpg', 'img/BJl58409211yq.jpg', '1');
INSERT INTO `tb_package` VALUES ('3', '湘域午餐1188元', '1188', '12个热菜、6个凉菜、1个小吃、1个汤品、1个鲜榨、3个赠送', '0', 'img/EDy55818048Mq.jpg', null, '2');
INSERT INTO `tb_package` VALUES ('4', '湘域午餐1388元', '1388', '11个热菜、6个凉菜、1个小吃、1个汤品、1个鲜榨、3个赠送', '0', 'img/PiF55818155vv.jpg', null, '2');
INSERT INTO `tb_package` VALUES ('5', '中天大酒店午餐999元', '999', '11个热菜、6个凉菜、1个小吃、1个汤、1个果拼。', '0', 'img/bzk55809938yI.jpg', null, '3');
INSERT INTO `tb_package` VALUES ('6', '中天大酒店午餐1099元', '1099', '11个热菜、6个凉菜、1个小吃、1个汤、1个果拼。', '0', 'img/mPK55810054bb.jpg', null, '3');
INSERT INTO `tb_package` VALUES ('7', '中天大酒店晚餐350元', '350', '8个热菜，3个凉菜，1个主食，1个汤', '0', 'img/wfe55810610xD.jpg', 'img/waw55810617FN.jpg', '3');
INSERT INTO `tb_package` VALUES ('8', '698元婚宴套餐', '698', '6个凉菜，11个热菜，一份汤。2份小吃', '0', 'img/dBE57090903iw.jpg', null, '4');
INSERT INTO `tb_package` VALUES ('9', '888元婚宴套餐', '888', '6个凉菜，11个热菜，一份汤，2份小吃', '0', 'img/ZVY57092032bx.jpg', null, '4');
INSERT INTO `tb_package` VALUES ('10', '298元晚餐套餐', '298', '2个凉菜，11个热菜，一份汤', '0', 'img/Lyx57092014us.jpg', null, '4');
INSERT INTO `tb_package` VALUES ('11', '398元婚宴套餐', '398', '3个凉菜，11个热菜，一份汤', '0', 'img/SPn57092046Jz.jpg', null, '4');
INSERT INTO `tb_package` VALUES ('12', '礼宴天下午餐1188元', '1188', '11个热菜、7个凉菜、1个小吃、1个汤、1个果盘赠送', '0', 'img/SGw56334797SY.jpg', null, '5');
INSERT INTO `tb_package` VALUES ('13', '礼宴天下1388元', '1388', '11个热菜、7个凉菜、1个小吃、1个汤、1个果盘赠送', '0', null, null, '5');
INSERT INTO `tb_package` VALUES ('14', '礼宴天下晚餐498元', '498', '9个热菜，3个凉菜，1个汤，1个主食赠送', '0', 'img/UBD56334111CW.jpg', null, '5');
INSERT INTO `tb_package` VALUES ('15', '礼宴天下晚餐598元', '598', '9个热菜、4个凉菜、1个汤、1个主食赠品', '0', 'img/Unr56334272sD.jpg', null, '5');
INSERT INTO `tb_package` VALUES ('16', '鑫缘至尊渔港880元餐', '880', '6个凉菜，9个热菜，1个汤，1份点心', '0', null, null, '6');
INSERT INTO `tb_package` VALUES ('17', '鑫缘至尊渔港998元餐', '998', '6个凉菜，9个热菜，1个汤，1份点心', '0', null, null, '6');
INSERT INTO `tb_package` VALUES ('18', '鑫缘至尊渔港余宴398元餐', '398', '3个凉菜，8个热菜，1个汤', '0', null, null, '6');
INSERT INTO `tb_package` VALUES ('19', '鑫缘至尊渔港余宴468元餐', '468', '3个凉菜，9个热菜，1个汤', '0', null, null, '6');
INSERT INTO `tb_package` VALUES ('20', '新华酒店午餐888元', '888', '12个热菜、7个凉菜、1个小吃、1个汤、1个果盘', '0', 'img/NeU55732110Io.jpg', null, '7');
INSERT INTO `tb_package` VALUES ('21', '新华酒店午餐998元', '998', '12个热菜、7个凉菜、2个小吃、1个汤、1个果盘', '0', 'img/sdy55732256eJ.jpg', null, '7');
INSERT INTO `tb_package` VALUES ('22', '新华酒店晚餐368元', '368', '9个热菜、1个汤、1份小吃', '0', 'img/uFj55732757CU.jpg', null, '7');
INSERT INTO `tb_package` VALUES ('23', '新华酒店晚餐428元', '428', '10个热菜、2个凉菜、1个汤、1份小吃', '0', 'img/wVZ55732859Ug.jpg', null, '7');
INSERT INTO `tb_package` VALUES ('24', '锦禧饭店午餐799元', '799', '11个热菜、2个凉菜、1个小吃、1个果拼、1个汤', '0', 'img/zpZ56052584ex.jpg', null, '8');
INSERT INTO `tb_package` VALUES ('25', '锦禧饭店晚餐398元/桌', '398', '12个热菜、7个凉菜、1个小吃、1个果拼、1个汤', '0', 'img/LYt56052672rN.jpg', null, '8');
INSERT INTO `tb_package` VALUES ('26', '锦禧饭店午餐929元', '929', '9个热菜、1个凉菜、1个汤', '0', 'img/ThN56052354im.jpg', null, '8');
INSERT INTO `tb_package` VALUES ('27', '锦禧饭店晚餐328元', '328', '7个热菜、1个凉菜、1个汤', '0', 'img/oSE56052476aR.jpg', null, '8');
INSERT INTO `tb_package` VALUES ('28', '会利元大饭店688元', '688', '10个热菜、5个凉菜、1个汤、2个小吃、1个果盘', '0', 'img/oTo55987298FU.jpg', null, '9');
INSERT INTO `tb_package` VALUES ('29', '会利元大饭店午餐888元', '888', '11个热菜、5个凉菜、1个汤、2个小吃、1个果盘', '0', 'img/zyz55987473QF.jpg', null, '9');
INSERT INTO `tb_package` VALUES ('30', '会利元晚餐388元', '388', '10个热菜，1个汤', '0', 'img/ZbF55986868cW.jpg', null, '9');
INSERT INTO `tb_package` VALUES ('31', '会利元大饭店晚餐488元', '488', '10个热菜，1个汤', '0', 'img/Nmi55986969Va.jpg', null, '9');
INSERT INTO `tb_package` VALUES ('32', '洪崖洞晚餐388元', '388', '10道热菜、4道凉菜、1道点心、1道汤', '0', 'img/vCw55710617cu.jpg', null, '10');
INSERT INTO `tb_package` VALUES ('33', '洪崖洞午餐898元', '898', '12道热菜、6道凉菜、1道点心、1道汤、一道水果', '0', 'img/jZW55710885NC.jpg', null, '10');

-- ----------------------------
-- Table structure for tb_room
-- ----------------------------
DROP TABLE IF EXISTS `tb_room`;
CREATE TABLE `tb_room` (
  `room_id` int(11) NOT NULL,
  `room_name` varchar(45) NOT NULL,
  `room_height` varchar(45) NOT NULL,
  `room_min_fee` varchar(45) NOT NULL,
  `room_form` varchar(45) NOT NULL,
  `room_pillar` varchar(45) NOT NULL,
  `room_dinner` varchar(45) NOT NULL,
  `room_electric_fee` varchar(45) NOT NULL,
  `room_split` varchar(45) NOT NULL,
  `room_area` varchar(45) NOT NULL,
  `room_lamplight` varchar(45) NOT NULL,
  `room_LED` varchar(45) NOT NULL,
  `room_tables` varchar(45) NOT NULL,
  `tb_hotel_hotel_id` int(11) NOT NULL,
  PRIMARY KEY (`room_id`),
  KEY `fk_tb_room_tb_hotel1_idx` (`tb_hotel_hotel_id`),
  CONSTRAINT `fk_tb_room_tb_hotel1` FOREIGN KEY (`tb_hotel_hotel_id`) REFERENCES `tb_hotel` (`hotel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_room
-- ----------------------------
INSERT INTO `tb_room` VALUES ('1', '龙泉厅', '6.5米', '20桌', '长方形', '无', '无赠送', '免费', '可拆分2个300平方米', '600平方米', '无', '无', '40桌', '1');
INSERT INTO `tb_room` VALUES ('2', '4号厅', '8米', '5桌起', '正方形', '无', '无赠送', '免费', '不可', '162平方米', '无', '无', '12桌', '1');
INSERT INTO `tb_room` VALUES ('3', '中庭', '不限', '无', '长方形', '有', '无赠送', '免费', '不可', '300人', '无', '无', '300人', '1');
INSERT INTO `tb_room` VALUES ('4', '草坪', '不限', '无', '长方形', '无', '无赠送', '免费', '不可', '200人', '无', '无', '200人', '1');
INSERT INTO `tb_room` VALUES ('5', '教堂', '10米', '无', '长方形', '无', '无', '无', '不可', '200人', '无', '无', '200人', '1');
INSERT INTO `tb_room` VALUES ('6', '湘域厅', '2.5米', '699元/桌', '长方形', '1个', '有套餐、无赠送', '免费', '可分区域', '无', '无', '无', '8桌', '2');
INSERT INTO `tb_room` VALUES ('7', '1号厅', '2.6米', '999元', '长方形', '无', '有套餐，无赠送', '否', '否', '200平方米', '无', '无', '22桌', '3');
INSERT INTO `tb_room` VALUES ('8', '2号厅', '2.6米', '999元', '长方形', '无', '有套餐，无赠送', '否', '否', '160平方米', '无', '无', '10桌', '3');
INSERT INTO `tb_room` VALUES ('9', '大厅', '4米', '面议', '长方形', '有', '有', '免费', '不可拆分', '暂无', '免费', '500元', '30桌', '4');
INSERT INTO `tb_room` VALUES ('10', '玫瑰厅 6F', '5米', '1388元/桌', '长方形', '无', '有套餐无赠送', '免费', '可拆分为两个厅', '1065平方米', '有', '3000元', '65桌', '5');
INSERT INTO `tb_room` VALUES ('11', '星光大厅 5F', '5米', '1188元/桌', '长方形', '无', '有套餐无赠送', '免费', '可拆分两个厅', '1250平方米', '有', '3000元', '90桌', '5');
INSERT INTO `tb_room` VALUES ('12', '巴渝大厅 5F', '5米', '1188元/桌', '长方形', '无', '有套餐无赠送', '免费', '可拆分为两个厅', '1000平方米', '有', '3000元', '55桌', '5');
INSERT INTO `tb_room` VALUES ('13', '百合厅 6F', '6米', '998元/桌', '圆形', '无', '有套餐无赠送', '免费', '不可', '380平方米', '有', '无', '18桌', '5');
INSERT INTO `tb_room` VALUES ('14', '小厅', '暂无', '暂无', '长方形', '6根', '有', '无', '不可拆分', '暂无', '无', '无', '16', '6');
INSERT INTO `tb_room` VALUES ('15', '大厅', '暂无', '暂无', '长方形', '6根', '有', '无', '不可拆分', '暂无', '无', '3500元', '40桌', '6');
INSERT INTO `tb_room` VALUES ('16', '大厅', '4米', '无', '长方形', '有', '有套餐，无赠送', '否', '否', '无', '有', '费用：1000元，长3米*高6米', '40桌', '7');
INSERT INTO `tb_room` VALUES ('17', '大厅', '3.5米', '4万', '长方形', '4个', '有套餐，无赠送', '300元', '不可拆分', '0平方米', '无', '500元', '46桌', '8');
INSERT INTO `tb_room` VALUES ('18', '大厅', '4米', '1088元/桌', '长方形', '6个', '有套餐，无赠送', '免费', '不可拆分', '0平方米', '有', '无', '30桌', '9');
INSERT INTO `tb_room` VALUES ('19', '贵宾楼', '	4米', '无', '长方形', '有', '有套餐，无赠送', '	无', '无', '无', '无', '费用1200元，大小：高2.34米*长6', '50桌', '10');
INSERT INTO `tb_room` VALUES ('20', '半山花园', '无', '无', '无', '无', '有套餐，无赠送', '否', '否', '无', '无', '无', '无', '10');

-- ----------------------------
-- Table structure for tb_shoppingcart
-- ----------------------------
DROP TABLE IF EXISTS `tb_shoppingcart`;
CREATE TABLE `tb_shoppingcart` (
  `shoppingcart_id` varchar(45) NOT NULL,
  `shoppingcart_time` varchar(45) DEFAULT NULL,
  `shoppingcart_name` varchar(45) DEFAULT NULL,
  `shoppingcart_type` varchar(45) DEFAULT NULL,
  `shoppingcart_place` varchar(45) DEFAULT NULL,
  `shoppingcart_price` varchar(45) DEFAULT NULL,
  `shoppingcart_count` varchar(45) DEFAULT NULL,
  `tb_user_user_tel` varchar(45) DEFAULT NULL,
  `shoppingcart_img` varchar(45) DEFAULT NULL,
  `shoppingcart_hotelname` varchar(45) DEFAULT NULL,
  `checked` int(11) NOT NULL,
  PRIMARY KEY (`shoppingcart_id`),
  KEY `fk_tb_shoppingcart_tb_user1_idx` (`tb_user_user_tel`),
  CONSTRAINT `fk_tb_shoppingcart_tb_user1` FOREIGN KEY (`tb_user_user_tel`) REFERENCES `tb_user` (`user_tel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_shoppingcart
-- ----------------------------
INSERT INTO `tb_shoppingcart` VALUES ('1589695337180', '2020--05-17 02:02:17', '重庆南温泉丽筠酒店1699元套餐', 'B款', '4号厅', '1699', '5', '15527630737', 'img/msF58469607Jg.jpg', '重庆南温泉丽筠酒店', '1');
INSERT INTO `tb_shoppingcart` VALUES ('1589696346990', '2020--05-17 02:19:06', '重庆南温泉丽筠酒店1699元套餐', 'B款', '教堂', '1699', '2', '15527630737', 'img/msF58469607Jg.jpg', '重庆南温泉丽筠酒店', '1');
INSERT INTO `tb_shoppingcart` VALUES ('1589699417995', '2020--05-17 03:10:17', '重庆南温泉丽筠酒店1699元套餐', 'A款', '龙泉厅', '1699', '3', '15527630737', 'img/ZBO58408845Lm.jpg', '重庆南温泉丽筠酒店', '1');
INSERT INTO `tb_shoppingcart` VALUES ('1625645293690', '2021--07-07 04:08:13', '重庆南温泉丽筠酒店1699元套餐', 'B款', '4号厅', '1699.0', '2', '15527630737', 'img/ZBO58408845Lm.jpg', '重庆南温泉丽筠酒店', '1');
INSERT INTO `tb_shoppingcart` VALUES ('20171430600087413', '2017-05-06 09:59:15', '洪崖洞午餐898元', 'A款', '半山花园', '898', '1', '13367206935', 'img/ZBO58408845Lm.jpg', '洪崖洞大酒店', '1');
INSERT INTO `tb_shoppingcart` VALUES ('20171731226743102', '2017-05-06 16:22:05', '中天大酒店晚餐350元', 'B款', '1号厅', '350', '8', '13237117999', 'ing/img/ZBO58408845Lm.jpg', '中天大酒楼', '1');
INSERT INTO `tb_shoppingcart` VALUES ('2017203610859423', '2017-05-05 21:23:38', '中天大酒店午餐999元', 'A款', '1号厅', '999', '3', '13260621887', 'img/ZBO58408845Lm.jpg', '中天大酒楼', '1');
INSERT INTO `tb_shoppingcart` VALUES ('20172086972746', '2017-05-05 13:37:22', '中天大酒店午餐999元', 'B款', '1号厅', '999', '1', '13260621887', 'img/ZBO58408845Lm.jpg', '中天大酒楼', '1');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_headPortrait` varchar(45) DEFAULT NULL,
  `user_nickname` varchar(45) DEFAULT NULL,
  `user_sex` varchar(45) DEFAULT NULL,
  `user_city` varchar(45) DEFAULT NULL,
  `user_IDcard` varchar(45) DEFAULT NULL,
  `user_add` varchar(45) DEFAULT NULL,
  `user_postcode` varchar(45) DEFAULT NULL,
  `user_QQ` varchar(45) DEFAULT NULL,
  `user_tel` varchar(45) DEFAULT NULL,
  `user_password` varchar(45) DEFAULT NULL,
  `user_realname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_nickname_UNIQUE` (`user_nickname`),
  UNIQUE KEY `user_tel_UNIQUE` (`user_tel`),
  UNIQUE KEY `user_QQ_UNIQUE` (`user_QQ`),
  UNIQUE KEY `user_IDcard_UNIQUE` (`user_IDcard`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'null', '塔拉夏123', 'null', '河南省焦作市武陟县', '42900419950520133822', '北京市北京市市辖区东城区', '429004', '86963554612312', '13260621887', '0o000o', 'xv');
INSERT INTO `tb_user` VALUES ('2', null, null, null, null, null, null, null, null, '15527630737', '123456', null);
INSERT INTO `tb_user` VALUES ('3', null, null, null, null, null, null, null, null, '13260621886', '123456', null);
INSERT INTO `tb_user` VALUES ('9', null, null, null, null, null, null, null, null, '13260621889', '0o000o', null);
INSERT INTO `tb_user` VALUES ('10', null, null, null, null, null, null, null, null, '13260621881', '0o000o', null);
INSERT INTO `tb_user` VALUES ('11', null, null, null, null, null, null, null, null, '13260621880', '123456', null);
INSERT INTO `tb_user` VALUES ('21', null, null, null, null, null, null, null, null, '13260621997', '0o000o', null);
INSERT INTO `tb_user` VALUES ('22', null, null, null, null, null, null, null, null, '13260628899', '123000', null);
INSERT INTO `tb_user` VALUES ('24', null, null, null, null, null, null, null, null, '13260621897', '123456', null);
INSERT INTO `tb_user` VALUES ('25', null, null, null, null, null, null, null, null, '13367206935', '0o000o', null);
INSERT INTO `tb_user` VALUES ('26', 'null', '', 'null', '北京市北京市市辖区东城区', '', null, '', '', '13237117999', '123456', '11111');
INSERT INTO `tb_user` VALUES ('29', null, null, null, null, null, null, null, null, '1552asd', '', null);
INSERT INTO `tb_user` VALUES ('30', null, null, null, null, null, null, null, null, 'dsadsa', 'sad', null);
INSERT INTO `tb_user` VALUES ('31', null, null, null, null, null, null, null, null, 'dsadsa1', '123', null);
INSERT INTO `tb_user` VALUES ('32', null, null, null, null, null, null, null, null, 'dsadsa111', 'qwe', null);
