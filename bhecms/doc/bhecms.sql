/*
Navicat MySQL Data Transfer

Source Server         : bhecms
Source Server Version : 50528
Source Host           : 192.168.1.136:3306
Source Database       : bhecms

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2015-08-21 18:02:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_article
-- ----------------------------
DROP TABLE IF EXISTS `t_article`;
CREATE TABLE `t_article` (
  `uuid` varchar(32) NOT NULL,
  `classId` bigint(20) NOT NULL COMMENT '分类id',
  `title` varchar(255) NOT NULL COMMENT '标题',
  `subTitle` varchar(64) DEFAULT NULL COMMENT '副标题',
  `content` text NOT NULL COMMENT '文章内容',
  `author` varchar(32) NOT NULL COMMENT '作者UUID',
  `isShow` int(1) NOT NULL DEFAULT '0' COMMENT '是否显示 1：是 0：否',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `isExtraUrl` int(1) DEFAULT NULL COMMENT '是否外链',
  `extralUrl` varchar(512) DEFAULT NULL COMMENT '外链地址',
  `titleColor` varchar(16) DEFAULT NULL COMMENT '标题颜色',
  `isBold` int(1) DEFAULT NULL COMMENT '是否加粗',
  `summary` varchar(1024) DEFAULT NULL COMMENT '摘要',
  `isAutoCreateSummary` int(1) DEFAULT NULL COMMENT '是否自动创建摘要',
  `fromWhere` varchar(64) DEFAULT NULL COMMENT '来源',
  `readPermission` int(1) DEFAULT NULL COMMENT '浏览权限',
  `topLevel` int(11) DEFAULT NULL COMMENT '固顶级别 0 10 20 30 40 值越高排序越高',
  `rank` int(11) DEFAULT NULL COMMENT '排序',
  `articleType` varchar(32) DEFAULT NULL COMMENT '文章内容类型,字典表(普通,图文,焦点,头条,推荐,草稿,幻灯)',
  `templateid` bigint(20) DEFAULT NULL COMMENT '模板ID',
  `hasAtachment` int(1) DEFAULT NULL COMMENT '是否有附件, 相应的附件表',
  `hasMedia` int(1) DEFAULT NULL COMMENT '是否有多媒体,相应的附件表',
  `isDownPic` int(1) DEFAULT NULL COMMENT '是否下载网络图片到本地存储',
  `price` decimal(8,2) DEFAULT NULL COMMENT '价格',
  `status` int(1) DEFAULT NULL COMMENT '状态 0正常 1删除 2草稿',
  `hits` int(11) DEFAULT NULL COMMENT '点击数',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章主表, 注意,文章请使用UUID, 而不是ID, ';

-- ----------------------------
-- Records of t_article
-- ----------------------------
INSERT INTO `t_article` VALUES ('01c3c3052ff840ca97e2aa53b0469336', '77', '重庆宇田公司2014年取得辉煌的业绩212', '简短标题', '<p>测试</p>', 'e12123132123123132132132132132', '0', '2015-08-05 10:37:28', '1', 'URL', '标题颜色1', '1', '摘要', '1', '来源', '3', '4', '5', '图文', '16', '8', '9', null, '11.00', '0', null);
INSERT INTO `t_article` VALUES ('0b6b82d2476a4c8e9ccd8e99c2bbc991', '3', '2015农历新年寄语', '', '<p>2015农历新年寄语2015农历新年寄语2015农历新年寄语</p>', 'e12123132123123132132132132132', '0', '2015-08-14 09:40:38', '1', '', '', '1', '', '1', '', null, null, null, null, null, null, null, null, null, '0', null);
INSERT INTO `t_article` VALUES ('bfba4bbfcb684554928fc04a58d20402', '3', '全市汽车销售行业典型不公平合同格式条款及点评意见（系列点评之二）', '', '<p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">一、乙方要求以车辆贷款方式付款的，应在甲方指定的金融机构申请汽车消费贷款。乙方在签订本合同后，应向甲方支付首付款人民币元（或定金人民币元），调查费人民币元。金融机构审查后不同意贷款的，甲方应在三日内通知乙方并退还乙方首付款（或定金），但调查费不予退还，甲乙双方可解除本合同。如乙方要求继续履行本合同的，车辆的结算方式应按一次性付款方式结算。若乙方不配合金融公司审查，或存在其他违约行为给甲方造成经济损失的，甲方有权不予返还乙方定金，其不足部份有权继续向乙方追偿。</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">点评意见：银监发〔２０１２〕３号文件规定：“银行业金融机构应依法承担贷款业务及其他服务中产生的尽职调查、押品评估等相关成本，不得将经营成本以费用形式转嫁给客户”。故该条关于乙方作为汽车购买方向经营者支付“调查费”的规定，于法无据，加重了消费者的责任。此外，经营者指定金融机构办理汽车贷款，排除了消费者的自主选择权</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">二、双方对车辆质量认定有争议的，以国家汽车质量监督检验部门的书面意见为处理争议的依据，鉴定费由提出鉴定申请人承担。</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">点评意见：根据《重庆市消费者权益保护条例》第四十三条规定，鉴定、检测费用由经营者预付，并根据鉴定、检测结论，由责任方承担；双方都有责任的，按责任大小由双方分担。显然条款中关于“鉴定费由提出鉴定申请人承担”的规定，不符合法律精神，对消费者是不利的，属加重消费者责任的条款。</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">三、除非甲方书面另行通知，乙方无论因何种原因没有收到甲方的交车通知，甲方有义务在本合同约定交车截止日前将车交付给乙方；乙方有义务于本合同约定交车截止日的当日工作时间到甲方处接车，否则视为乙方无正当理由拒绝接车，自交车通知确定的交付使用之日或本合同约定交车截止日起视为已交付，该车毁损、灭失的风险由乙方承担。自甲方通知提车之日或本合同约定交车截止日次日起，甲方有权另行处理。</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">点评意见：《合同法》第五条规定，“当事人应当遵循公平原则确定各方的权利和义务”。该条规定消费者未在交车截止日期前及时接车,车辆毁损、灭失的风险责任转移给消费者承担，但同时又规定经营者保留车辆的处分权，合同双方权利义务的设置不对等，有违合同公平原则，属于加重消费者责任的条款。</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">四、情势变迁</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">1.在本合同签定后履行完毕前，如遇政府进行宏观调控，修订和颁行相关法律政策及税收政策，导致车辆价格上涨，双方按新价格履行；</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">2.由于生产商技术改进、产品更新而导致车辆价格变动，则甲、乙双方按新价格履行。</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">点评意见：该条以情势变迁为由，预先就车辆价格作出特别规定，使消费者的购车价格处于不确定状态，不符合《合同法》关于情势变更的法律精神。同时，只规定“车辆价格上涨，双方按新价格履行”，也有违合同公平原则。该条有将经营者的商业风险转嫁给消费者，加重消费者责任之嫌。</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">五、如乙方要求甲方送车到指定地点，一切费用与风险由乙方负责承担。</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">点评意见：根据《合同法》第一百四十二条规定，标的物毁损、灭失的风险，在标的物交付之前由出卖人承担，交付之后由买受人承担。该条将车辆交付前的风险转嫁于消费者，属于加重消费者责任的条款。</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">六、贷款期限两年或以上的除一次性缴纳第一年保险费外，另需缴纳续保保证金 元；乙方在第二年至贷款期限年为止的情况下，保证金才能退还给购车人。否则，该保证金即作为违约金归甲方所有。</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">点评意见：该条关于缴纳续保保证金的规定,是在向消费者销售车辆时，附加了不合理的条件，排除了消费者的自主选择权，属于扩大经营者的权利、加重消费者责任的条款。</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">七、需方支付购车定金后，不支付车款，或提出解除合同时，需方无权收回定金，定金作为违约金归供方所有。需方未按合同约定的时间支付车款，必须支付供方违约金，其标准为未付车款按每天1%支付。需方未按时提车，未通知供方，需方应支付供方保管费，每天按100元计算。在合同约定的时间，供方未能交付需方定购的车辆，供方应及时将情况通知需方，如果未通知，应按每天＿元向需方支付违约金。</p><p style=\"font-family: 微软雅黑; font-size: 14px; text-indent: 2em; white-space: normal; background-color: rgb(255, 255, 255);\">点评意见：《合同法》第五条规定，“当事人应当遵循公平原则确定各方的权利和义务”。该条规定了消费者未按时支付车款和未按时提车时，应承担的无权收回定金或按未付车款每天1%支付违约金以及每天按100元交保管费的责任；而对于经营者未按约定交付车辆的情形,只设定通知需方的责任，在不通知的情形下，才按每天＿元向需方支付违约金。对双方权利义务的设定不公平，有违合同公平原则。</p><p><br/></p>', 'e12123132123123132132132132132', '0', '2015-08-15 10:24:39', '1', '', '', '0', '', '0', '', null, null, null, null, null, null, null, null, null, '0', null);
INSERT INTO `t_article` VALUES ('ca7c8e74a9c745448166ff8b986b7414', '80', '公司历史', '简短标题', '<p><img src=\"http://192.168.1.39:8081/uedit/2015/0714/1439516516106069206.png\" title=\"1439516516106069206.png\" alt=\"aboutus.png\"/></p><p style=\"font-family: 微软雅黑; line-height: 32px; color: rgb(148, 148, 148); font-size: 12px; white-space: normal;\">重庆宇田丹增机电技术有限公司最早成立于1991年，从1995年开始，公司开始专业经营清洁设备，酒店用品，公司注册资金316万元，流动奖金2300万元。公司有关联企业：重庆宇田环卫工程有限公司，注册资金510万元；重庆梅履泰安防技术有限公司，注册资金128万元。</p><p style=\"font-family: 微软雅黑; line-height: 32px; color: rgb(148, 148, 148); font-size: 12px; white-space: normal;\">2007年，与有144年制造经验的美国坦能TENNANT清洁设备公司合作，成为中国地区的战略经销商。公司还与行业巨头佛山市嘉得力清洁科技股份有限公司、东莞汇乐环保股份有限公司、无锡市华信安全设备有限公司紧密合作。 公司已经累计为重庆及周边地区的工厂、环卫、酒店、物业销售、租赁出3万余台清洁设备、环卫设备、高压清洗机等，为3900余位客户服务。特别是近五年来，公司的保洁工程、清洗工程、租赁服务和个人安全防护用品销售有了较快的发展。</p><p style=\"font-family: 微软雅黑; line-height: 32px; color: rgb(148, 148, 148); font-size: 12px; white-space: normal;\">公司经过20余年的发展，已经成为重庆地区清洁设备、环卫设备、工业吸尘器、烟尘净化器、高压清洗机、个人安全防护用品、保洁最有实力的公司之一。我们为客户提供销售、租赁、工程承包系列服务，公司拥有租赁、保洁设备1610万元公司将在下一个5年计划末期，营业额超过1亿元。</p><p><br/></p>', 'e12123132123123132132132132132', '0', '2015-08-05 10:38:07', '1', 'URL', '标题颜色', '1', '摘要', '1', '来源', '1', '1', '1', '图文', '1', '1', '1', null, '1.00', '0', null);
INSERT INTO `t_article` VALUES ('cfd927f9253a465eb7d91f6ac0f05c18', '75', '公司介绍', '公司介绍', '<p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 宋体, SimSun; color: rgb(0, 0, 0);\"><img src=\"http://192.168.1.39:8081/uedit/2015/0721/1440147391613026578.png\" title=\"1440147391613026578.png\" alt=\"QQ截图20150821165625.png\" style=\"float: right;\"/><span style=\"font-size: 14px; font-family: 黑体, SimHei;\">重庆宇田丹增机电技术有限公司最早成 立于1991年，从1995年开始，公司开始专业经营清洁设备，酒店用品，公司&nbsp;</span></span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\">注册资金316万元，流动奖金2300万元。公司有关联企业：重庆宇田环卫工程有限公司，注册资金510万元；重庆梅&nbsp;</span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\">履泰安防技术有限公司，注册资金128万元。</span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\"><br/></span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\">2007年，与有144年制造经验的美国坦能TENNANT清洁设备公司合作，成为中国地区的战略经销商。公司还与行业巨&nbsp;</span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\">头佛山市嘉得力清洁科技股份有限公司、东莞汇乐环保股份有限公司、无锡市华信安全设备有限公司紧密合作。&nbsp;</span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\">公司已经累计为重庆及周边地区的工厂、环卫、酒店、物业销售、租赁出3万余台清洁设备、环卫设备、高压清洗&nbsp;</span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\">机等，为3900余位客户服务。特别是近五年来，公司的保洁工程、清洗工程、租赁服务和个人安全防护用品销售&nbsp;</span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\">有了较快的发展。</span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\"><br/></span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\">公司经过20余年的发展，已经成为重庆地区清洁设备、环卫设备、工业吸尘器、烟尘净化器、高压清洗机、个人&nbsp;</span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\">安全防护用品、保洁最有实力的公司之一。我们为客户提供销售、租赁、工程承包系列服务，公司拥有租赁、保&nbsp;</span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\">洁设备1610万元。公司将在下一个5年计划末期，营业额超过1亿元</span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\"><br/></span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\">公司始终坚持经营三原则：“诚信守法，处事光明，立业贸易”，始终致力于环境、清洁、健康、安全技术的的&nbsp;</span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\">传播者和践行者。</span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\"><br/></span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\">公司管理架构：<br/>法务办、顾问办、行政办、人力资源部、财务部、仓储物流部（普洛斯仓库、金紫山仓库）、清洁环卫设备销售&nbsp;</span></p><p style=\"font-family: 微软雅黑; color: rgb(127, 127, 127); font-size: 12px; line-height: 13.4290904998779px; white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"font-size: 14px; font-family: 黑体, SimHei; color: rgb(0, 0, 0);\">部、安防用品销售部、设备租赁部、维修部、保洁工程部、成都办事处、贵阳办事处、西安办事处。</span></p><p><br/></p>', 'e12123132123123132132132132132', '0', '2015-08-21 09:49:14', '1', '', 'red', '0', '', '1', '', null, null, '1', null, null, null, null, null, null, '0', null);
INSERT INTO `t_article` VALUES ('d5c1f8dbb07440c4a7e1b366491525b8', '77', '宇田公司的清洁设备租赁业务正在如荼的展开 重庆宇田诚聘精英', '简短标题', '<p><br/></p><p>测试</p>', 'e12123132123123132132132132132', '0', '2015-08-05 14:51:26', '1', 'URL', '标题颜色', '1', '摘要', '1', '来源', '1', '1', '1', '图文', '1', '1', '1', null, '1.00', '0', null);
INSERT INTO `t_article` VALUES ('e2e98ebbbfb9403f814be7f55f129d1f', '77', '美国TENNANT荣获《福布斯》授予“美国最佳100家小企业奖”', '美国TENNANT荣获《福布斯》', '<p>美国TENNANT荣获《福布斯》美国TENNANT荣获《福布斯》美国TENNANT荣获《福布斯》</p>', 'e12123132123123132132132132132', '0', '2015-08-14 16:25:16', '0', '', '', '1', '', '1', '', null, null, null, null, null, null, null, null, null, '0', null);

-- ----------------------------
-- Table structure for t_article_attachment
-- ----------------------------
DROP TABLE IF EXISTS `t_article_attachment`;
CREATE TABLE `t_article_attachment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `articleid` bigint(20) DEFAULT NULL,
  `attachmentid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章附件表';

-- ----------------------------
-- Records of t_article_attachment
-- ----------------------------

-- ----------------------------
-- Table structure for t_article_class
-- ----------------------------
DROP TABLE IF EXISTS `t_article_class`;
CREATE TABLE `t_article_class` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `nameCn` varchar(255) NOT NULL COMMENT '分类名称',
  `showInNav` int(1) NOT NULL COMMENT '是否显示在菜单中 1：显示 0 否',
  `parentId` int(11) NOT NULL COMMENT '父节点id',
  `type` int(1) DEFAULT NULL COMMENT '文类类型 0 列表 1单页',
  `resoureceid` bigint(20) DEFAULT NULL COMMENT '所属栏目, 绑定类型',
  `description` varchar(512) DEFAULT NULL COMMENT '说明',
  `nameEn` varchar(512) DEFAULT NULL COMMENT '英文名，供查询用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8 COMMENT='文章分类';

-- ----------------------------
-- Records of t_article_class
-- ----------------------------
INSERT INTO `t_article_class` VALUES ('75', '公司介绍', '1', '0', '1', '61', '对公司的介绍', 'companyprofile');
INSERT INTO `t_article_class` VALUES ('76', '关于我们', '1', '0', '1', '7', '关于我们', 'aboutUs');
INSERT INTO `t_article_class` VALUES ('77', '新闻中心', '1', '0', '0', '64', '新闻的信息', 'newsCenter');
INSERT INTO `t_article_class` VALUES ('78', '联系方式', '1', '0', '1', '7', '联系方式', 'contactWay');
INSERT INTO `t_article_class` VALUES ('80', '公司历史', '1', '0', '1', '61', '公司历史的介绍', 'companyhistory');

-- ----------------------------
-- Table structure for t_article_keywords
-- ----------------------------
DROP TABLE IF EXISTS `t_article_keywords`;
CREATE TABLE `t_article_keywords` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `articleId` bigint(20) NOT NULL COMMENT '文章id',
  `name` varchar(50) NOT NULL COMMENT '关键字名称',
  `createTime` datetime NOT NULL COMMENT '关键字创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3124 DEFAULT CHARSET=utf8 COMMENT='文章关键字';

-- ----------------------------
-- Records of t_article_keywords
-- ----------------------------
INSERT INTO `t_article_keywords` VALUES ('31', '1', '', '0000-00-00 00:00:00');
INSERT INTO `t_article_keywords` VALUES ('131', '12', '', '0000-00-00 00:00:00');
INSERT INTO `t_article_keywords` VALUES ('3123', '2', '', '0000-00-00 00:00:00');

-- ----------------------------
-- Table structure for t_log_login
-- ----------------------------
DROP TABLE IF EXISTS `t_log_login`;
CREATE TABLE `t_log_login` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userid` varchar(32) DEFAULT NULL COMMENT '用户ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `ip` varchar(16) DEFAULT NULL COMMENT 'IP地址',
  `title` varchar(16) DEFAULT NULL COMMENT '标题或者类型, 与字段表关联,或者自定义',
  `description` varchar(64) DEFAULT NULL COMMENT '描述',
  `isDelete` int(1) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_log_login
-- ----------------------------

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `orderNo` varchar(13) NOT NULL COMMENT '流水号,订单编号',
  `typeid` int(11) NOT NULL COMMENT '订单类型id',
  `userid` varchar(32) NOT NULL COMMENT '下单人Id',
  `pricePer` char(10) DEFAULT NULL COMMENT '商品单价',
  `totalPrice` decimal(10,2) NOT NULL COMMENT '总价',
  `count` int(11) NOT NULL COMMENT '数量',
  `preferentialPrice` decimal(10,2) DEFAULT NULL COMMENT '优惠价格',
  `preferentialId` int(11) DEFAULT NULL COMMENT '优惠方式Id',
  `payPrice` decimal(10,2) DEFAULT NULL COMMENT '实际付款金额',
  `createTime` datetime DEFAULT NULL COMMENT '下单时间',
  `payStatus` int(1) DEFAULT NULL COMMENT '支付状态',
  `payment` int(1) DEFAULT NULL COMMENT '付款方式',
  `payTime` datetime DEFAULT NULL COMMENT '付款时间',
  `cancelTime` datetime DEFAULT NULL COMMENT '取消时间',
  `cancelReason` text COMMENT '取消原因',
  `buyerName` varchar(32) DEFAULT NULL COMMENT '买家姓名',
  `buyerPhone` varchar(32) DEFAULT NULL COMMENT '买家电话',
  `leaveMsg` varchar(512) DEFAULT NULL COMMENT '买家留言',
  `conuntry` varchar(50) DEFAULT NULL COMMENT '收货地址国家',
  `province` varchar(50) DEFAULT NULL COMMENT '收货地址省',
  `city` varchar(50) DEFAULT NULL COMMENT '收货地址市',
  `districts` varchar(50) DEFAULT NULL COMMENT '收货地址区',
  `address` varchar(255) DEFAULT NULL COMMENT '收货详细地址',
  `cityLevel` varchar(50) DEFAULT NULL COMMENT '收货地址城市级别',
  `level` int(11) DEFAULT NULL COMMENT '订单层级，每增加一次向上增加',
  `orderType` int(11) DEFAULT NULL COMMENT '订单类型(0订购订单,1租赁订单)',
  `auditStatus` int(1) DEFAULT NULL COMMENT '审核状态，0 未审核，1已通过，2已退回',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('11', '5454646545', '1', 'e12123132123123132132132132132', null, '150.00', '30', '10.00', '0', '10007.00', '2015-08-01 11:31:09', '0', '0', '2015-08-05 11:31:05', '2015-08-05 11:31:07', '', '王五4', '15556421654', '49', '中国', '重庆', '重庆', '渝北', '中国重庆重庆渝北龙山街道', '', '1', '1', '1');
INSERT INTO `t_order` VALUES ('12', '4445641554', '1', 'e12123132123123132132132132132', null, '222.00', '11', '12.00', '0', '50005.00', '2015-08-07 17:35:16', '0', '0', '2015-08-05 17:35:20', '2015-08-08 17:35:23', '', '李四www', '15568446513', '54ew', '中国', '重庆', '重庆', '南岸区', '中国重庆重庆渝北龙山街道', '', '1', '0', '2');
INSERT INTO `t_order` VALUES ('13', '655464450', '1', 'e12123132123123132132132132132', null, '688.00', '27', '13.00', '0', '1545.00', '2015-08-05 17:35:16', '0', '0', '2015-08-05 17:35:16', '2015-08-05 17:35:16', '', '张三44', '18955123546', '5453', '中国', '重庆', '重庆', '沙坪坝', '中国重庆重庆渝北龙山街道', '', '1', '0', '0');

-- ----------------------------
-- Table structure for t_order_cart
-- ----------------------------
DROP TABLE IF EXISTS `t_order_cart`;
CREATE TABLE `t_order_cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `productid` varchar(32) DEFAULT NULL COMMENT '产品UUID',
  `count` int(11) DEFAULT NULL COMMENT '数量',
  `createUser` varchar(32) DEFAULT NULL COMMENT '购买者',
  `createTime` datetime DEFAULT NULL COMMENT '时间',
  `unit` varchar(32) DEFAULT NULL COMMENT '单位 直接将产品单位写入',
  `isrent` int(1) DEFAULT NULL COMMENT '是否属于租赁',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='购物车';

-- ----------------------------
-- Records of t_order_cart
-- ----------------------------
INSERT INTO `t_order_cart` VALUES ('1', 'f5ff657a31d14117ae819c9a18702cdb', '5', 'e12123132123123132132132132132', '2015-08-21 12:45:01', null, null);

-- ----------------------------
-- Table structure for t_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `t_order_detail`;
CREATE TABLE `t_order_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `orderCode` varchar(50) NOT NULL COMMENT '订单流水号',
  `productId` bigint(20) NOT NULL COMMENT '商品编号',
  `skuCode` varchar(20) NOT NULL COMMENT '商品sku分组编码',
  `productName` varchar(225) NOT NULL COMMENT '商品名称',
  `price` decimal(10,2) NOT NULL COMMENT '单价',
  `count` int(11) NOT NULL COMMENT '商品数量',
  `userId` bigint(20) NOT NULL COMMENT '购买人Id',
  `fixedPrice` decimal(8,2) DEFAULT NULL COMMENT '一口价',
  `salesPromotion` int(1) DEFAULT NULL COMMENT '促销(0普通,1限时)字典表',
  `isSalesPromotion` int(1) DEFAULT NULL COMMENT '是否启用促销',
  `payAstrict` int(11) DEFAULT NULL COMMENT '支付限制(0全额,1只允许订金)',
  `collectionAccount` varchar(32) DEFAULT NULL COMMENT '收款帐号',
  `isIncludeRevenue` int(11) DEFAULT NULL COMMENT '是否含税',
  `storeCount` int(11) NOT NULL COMMENT '库存数量',
  `isSubscribeCode` int(11) DEFAULT NULL COMMENT '是否启用预约码',
  `warnNum` int(11) NOT NULL COMMENT '商品报警数量',
  `minSaleNum` int(11) DEFAULT NULL COMMENT '最小销售数量',
  `maxSaleNum` int(11) DEFAULT NULL COMMENT '最大销售数量',
  `presentExp` int(11) DEFAULT NULL COMMENT '赠送积分',
  `isMoreSize` int(1) DEFAULT NULL COMMENT '开启更多规格属性',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='订单详情';

-- ----------------------------
-- Records of t_order_detail
-- ----------------------------
INSERT INTO `t_order_detail` VALUES ('1', '5454646545', '14', '', '', '10.00', '226', '1', null, null, null, null, null, null, '0', null, '0', null, null, null, null);
INSERT INTO `t_order_detail` VALUES ('2', '5454646545', '17', '', '', '12.00', '120', '1', null, null, null, null, null, null, '0', null, '0', null, null, null, null);
INSERT INTO `t_order_detail` VALUES ('3', '4445641554', '12', '', '', '55.00', '200', '1', null, null, null, null, null, null, '0', null, '0', null, null, null, null);
INSERT INTO `t_order_detail` VALUES ('4', '655464450', '20', '', '', '165.00', '503', '1', null, null, null, null, null, null, '0', null, '0', null, null, null, null);

-- ----------------------------
-- Table structure for t_order_print
-- ----------------------------
DROP TABLE IF EXISTS `t_order_print`;
CREATE TABLE `t_order_print` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `createUser` varchar(32) DEFAULT NULL COMMENT '操作用户',
  `createTime` datetime DEFAULT NULL COMMENT '时间',
  `orderid` varchar(13) DEFAULT NULL COMMENT '订单ID',
  `printCount` int(11) DEFAULT NULL COMMENT '打印数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单打印';

-- ----------------------------
-- Records of t_order_print
-- ----------------------------

-- ----------------------------
-- Table structure for t_order_type
-- ----------------------------
DROP TABLE IF EXISTS `t_order_type`;
CREATE TABLE `t_order_type` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '订单类型名称',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='订单类型';

-- ----------------------------
-- Records of t_order_type
-- ----------------------------
INSERT INTO `t_order_type` VALUES ('1', '现货订单', '2015-08-05 10:57:23');
INSERT INTO `t_order_type` VALUES ('2', '预定订单', '2015-08-05 10:57:23');
INSERT INTO `t_order_type` VALUES ('3', '预购订单', '2015-08-05 11:27:13');

-- ----------------------------
-- Table structure for t_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_permission`;
CREATE TABLE `t_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nameCn` varchar(32) DEFAULT NULL COMMENT '权限名称',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父ID',
  `value` varchar(512) DEFAULT NULL COMMENT '值',
  `description` varchar(1024) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限';

-- ----------------------------
-- Records of t_permission
-- ----------------------------

-- ----------------------------
-- Table structure for t_permission_group
-- ----------------------------
DROP TABLE IF EXISTS `t_permission_group`;
CREATE TABLE `t_permission_group` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `nameCn` varchar(64) DEFAULT NULL,
  `parentid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限组, 用于更好的管理相应的权限,用户可以预设相应的权限组备用';

-- ----------------------------
-- Records of t_permission_group
-- ----------------------------

-- ----------------------------
-- Table structure for t_permission_group_link
-- ----------------------------
DROP TABLE IF EXISTS `t_permission_group_link`;
CREATE TABLE `t_permission_group_link` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `permissionid` bigint(20) DEFAULT NULL,
  `groupid` bigint(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_5` (`permissionid`),
  KEY `FK_Reference_6` (`groupid`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`groupid`) REFERENCES `t_permission_group` (`id`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`permissionid`) REFERENCES `t_permission` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限,权限组中间表';

-- ----------------------------
-- Records of t_permission_group_link
-- ----------------------------

-- ----------------------------
-- Table structure for t_permission_resource
-- ----------------------------
DROP TABLE IF EXISTS `t_permission_resource`;
CREATE TABLE `t_permission_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `permissionId` bigint(20) NOT NULL COMMENT '权限id',
  `resourceId` bigint(20) DEFAULT NULL COMMENT '资源id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限资源表,中间表';

-- ----------------------------
-- Records of t_permission_resource
-- ----------------------------

-- ----------------------------
-- Table structure for t_product
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `uuid` varchar(32) DEFAULT '' COMMENT '产品ID',
  `productNo` varchar(15) DEFAULT NULL COMMENT '产品编号10位数',
  `nameCn` varchar(256) NOT NULL COMMENT '产品名称',
  `nameEn` varchar(256) DEFAULT NULL,
  `modelName` varchar(512) DEFAULT NULL COMMENT '商品型号',
  `type` int(1) DEFAULT NULL COMMENT '商品类型：0正常 1赠品,为赠品时是否可销售',
  `count` int(11) DEFAULT NULL COMMENT '库存数量',
  `price` decimal(10,2) DEFAULT NULL COMMENT '原价',
  `status` int(1) DEFAULT NULL COMMENT '产品状态(上架1  下架0  )',
  `hits` int(11) DEFAULT NULL COMMENT '点击数',
  `keywords` varchar(225) DEFAULT NULL COMMENT '产品关键字，空格隔开',
  `description` varchar(4096) DEFAULT NULL COMMENT '产品说明，具体介绍',
  `warnNum` int(11) DEFAULT NULL COMMENT '商品报警数量',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(4096) DEFAULT NULL COMMENT '产品备注，仅商家可见',
  `articleId` bigint(20) DEFAULT NULL COMMENT '产品关联文章id',
  `showType` int(1) DEFAULT NULL COMMENT '展示类型,字典表(推荐,热点,精彩,滚动,幻灯,允许评论)',
  `clazzid` bigint(11) DEFAULT NULL COMMENT '产品分类ID',
  `brandid` bigint(11) DEFAULT NULL COMMENT '品牌ID',
  `providerid` bigint(11) DEFAULT NULL COMMENT '供应商ID',
  `unit` varchar(32) DEFAULT NULL COMMENT '商品单位,字典表中取',
  `validity` int(11) DEFAULT NULL COMMENT '有效期',
  `introduce` varchar(2048) DEFAULT NULL COMMENT '简介',
  `canSale` int(1) DEFAULT NULL COMMENT '能否销售',
  `hasFreight` int(11) DEFAULT NULL COMMENT '是否需要运费',
  `weight` decimal(8,2) DEFAULT NULL COMMENT '重量',
  `bulk` decimal(8,2) DEFAULT NULL COMMENT '体积',
  `level` int(11) DEFAULT NULL COMMENT '优先级',
  `saleType` varchar(32) DEFAULT NULL COMMENT '销售类型,字典表,(实物,电子,虚拟)',
  `color` varchar(16) DEFAULT NULL COMMENT '颜色',
  `size` varchar(32) DEFAULT NULL COMMENT '规格',
  `isdelete` int(1) DEFAULT NULL,
  `userkey` varchar(32) DEFAULT NULL,
  `sayCount` int(11) DEFAULT NULL COMMENT '销量',
  `commonSort` varchar(20) DEFAULT NULL COMMENT '通用分类',
  `productivity` varchar(512) DEFAULT NULL COMMENT '工作效率',
  `isrent` int(1) DEFAULT NULL COMMENT '是否属于租赁 1 是 0否',
  `appliesField` varchar(512) DEFAULT NULL COMMENT '适用场地',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8 COMMENT='产品主表 存放产品通用信息';

-- ----------------------------
-- Records of t_product
-- ----------------------------
INSERT INTO `t_product` VALUES ('17', 'f5ff657a31d14117ae819c9a18702cdb', '56', '尺寸', null, null, null, '45', '10.00', '1', null, '', null, null, '2015-08-04 16:33:56', '2015-08-15 09:20:43', null, null, '1', '2', '2', null, '', null, null, null, null, '0.00', '0.00', '100', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('20', 'c9b4e27d68394fbdb87040ae3794d495', '56', '痴痴缠缠', null, null, null, '1110', '10.00', '1', null, '', null, null, '2015-08-04 16:35:03', '2015-08-14 09:48:40', null, null, '1', '2', '2', null, '', null, null, null, null, '0.00', '0.00', '10', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('22', '3106c6ffa9624392903c701816f3e699', '34', '鹅鹅鹅饿鹅鹅鹅饿鹅鹅鹅饿鹅鹅鹅饿', null, null, null, '10', '10.00', '1', null, '', null, null, '2015-08-07 11:01:56', '2015-08-15 10:56:07', null, null, '1', '2', '2', null, '', null, null, null, null, '0.00', '0.00', '1', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('23', '5775fdab3e5040bc80b777ac7c57da4b', '1', '速度', 'ss', null, null, null, '10.00', '1', null, null, 'sdfsdf', null, '2015-08-08 10:18:41', null, null, null, null, '2', '2', null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('27', '5c66ea41b3da43069a54d783e6f68901', '23', 'Tfboys', null, null, null, '15', '10000.00', '1', null, 'Tfboys', null, null, '2015-08-18 09:57:12', '2015-08-18 09:59:55', null, null, '1', '2', '2', null, 'TF家族', null, null, null, null, '0.00', '0.00', '23', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('29', '2701a1de62bb442fbf6de06b0792c26d', 'e23', '四叶草', null, null, null, '32', '23.00', '1', null, '', null, null, '2015-08-18 10:09:51', null, null, null, null, '24', '2', null, '衡山科技', null, null, null, null, '0.00', '0.00', '32', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('30', 'c5f536a357c7447094896fe941f01e5f', '2', '矿泉水', null, null, null, '200', '2800.00', '1', null, '', null, null, '2015-08-18 10:19:24', null, null, null, '1', '24', '2', null, '', null, null, null, null, '0.00', '0.00', '1', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('34', 'b30d14cd92194738a64aa36b6f591269', '4', '可乐', null, null, null, '100', '2223.00', '1', null, '2', null, null, '2015-08-18 10:50:36', null, null, null, null, '24', '14', null, '8', null, null, null, null, '0.00', '0.00', '2', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('35', '3f9b1121cf6e4be29cf3b0d2dc074f84', '53', '唯艺', null, null, null, '51', '2000.00', '1', null, '2', null, null, '2015-08-18 10:50:44', null, null, null, '1', '18', '14', null, '8', null, null, null, null, '0.00', '0.00', '5', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('36', '180b09d750f54969b86180e767d5bba3', '7', '果汁', null, null, null, '64', '1304.00', '1', null, '2', null, null, '2015-08-18 10:50:52', null, null, null, '1', '18', '14', null, '8', null, null, null, null, '0.00', '0.00', '2', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('37', 'f1b47693477e4f22990b4c363b6ddf60', '9', '牛奶', null, null, null, '84', '13354.00', '1', null, '2', null, null, '2015-08-18 10:51:00', '2015-08-18 11:01:49', null, null, null, '19', '2', null, '8', null, null, null, null, '0.00', '0.00', '1', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('38', '59c31afacb634913a30a8f6196b23665', '46', '可乐', null, null, null, '100', '4006.00', '1', null, '2', null, null, '2015-08-18 11:07:59', null, null, null, '1', '19', '14', null, '8', null, null, null, null, '0.00', '0.00', '2', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('39', '15a96b656a2048abbd6c08d2af51155c', '4', '唯艺', null, null, null, '51', '1203.00', '1', null, '2', null, null, '2015-08-18 11:08:07', null, null, null, '1', '307', '14', null, '8', null, null, null, null, '0.00', '0.00', '5', null, null, null, '0', null, null, null, null, '1', null);
INSERT INTO `t_product` VALUES ('40', '301759a588234396a4bef35b32d3e9cc', '8', '果汁', null, null, null, '64', '1800.00', '1', null, '2', null, null, '2015-08-18 11:08:16', null, null, null, '1', '308', '14', null, '8', null, null, null, null, '0.00', '0.00', '2', null, null, null, '0', null, null, null, null, '1', null);
INSERT INTO `t_product` VALUES ('41', 'c7f33bb284474c469e54296c82cd0f40', '56', '牛奶', null, null, null, '84', '12000.00', '1', null, '2', null, null, '2015-08-18 11:08:24', null, null, null, null, '307', '14', null, '8', null, null, null, null, '0.00', '0.00', '1', null, null, null, '0', null, null, null, null, '1', null);
INSERT INTO `t_product` VALUES ('42', '0d45f38e3f0142bdbff15dcb7835d50f', '2', '可乐', null, null, null, '100', '5000.00', '1', null, '2', null, null, '2015-08-18 11:09:36', null, null, null, '1', '307', '14', null, '8', null, null, null, null, '0.00', '0.00', '2', null, null, null, '0', null, null, null, null, '1', null);
INSERT INTO `t_product` VALUES ('43', '03082a8c121143c8a1ddee33d9d547d0', '9', '唯艺', null, null, null, '51', '3.00', '1', null, '2', null, null, '2015-08-18 11:09:44', null, null, null, null, null, '14', null, '8', null, null, null, null, '0.00', '0.00', '5', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('44', '746f75aca75f46db99bbfe1b429996b4', '67', '果汁', null, null, null, '64', '2.00', '1', null, '2', null, null, '2015-08-18 11:09:52', null, null, null, '1', null, '14', null, '8', null, null, null, null, '0.00', '0.00', '2', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('45', 'c2ae2dac6aa94aa9b1ef3d503ad8cf04', '5', '星星', null, null, null, '84', '31111111.00', '0', null, '2', null, null, '2015-08-18 11:10:00', '2015-08-19 15:10:41', null, null, null, null, '2', null, '8', null, null, null, null, '0.00', '0.00', '1', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('46', 'a397075d26f942f38d86352fda32cf32', '43', '带灰尘控制功能的电瓶供电地面抛光机', null, 'x211', null, '100', '18000.00', '1', null, '带灰尘控制功能', null, null, '2015-08-18 14:20:19', '2015-08-19 15:45:30', null, null, '1', '2', '2', null, '元', null, null, null, null, '0.00', '0.00', '1000', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('47', 'e52e1f0f16a84ca4aca1708e58e0fa25', '45', '是的', null, null, null, '231', '12312.00', '1', null, '', null, null, '2015-08-20 17:22:29', null, null, null, null, null, '2', null, '2131', null, '12321 ', null, null, '0.00', '0.00', '12312', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('48', 'c6f51795ba81451cb86fc8262aac69c9', '64', '撒旦', null, null, null, '12', '12.00', '1', null, '', null, null, '2015-08-20 17:25:39', null, null, null, null, null, '2', null, '12', null, '的的参赛', null, null, '0.00', '0.00', '21', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('49', '5834b4d978c845b6b510efe4283128e8', '3', '的d', null, null, null, '21', '5.00', '0', null, '', null, null, '2015-08-20 17:27:01', null, null, null, null, null, '2', null, '4', null, '1', null, null, '0.00', '0.00', '2', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('50', 'e36138775fbb4a2d9ad46e207cd4c977', '4', '23v', null, null, null, '2', '3.00', '1', null, 'we', null, null, '2015-08-20 17:27:15', null, null, null, null, null, '2', null, '2', null, '2', null, null, '0.00', '0.00', '4', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('51', 'f945186c671d4eacba3429666b3ab022', '65', '额', null, null, null, '2', '2.00', '1', null, '', null, null, '2015-08-20 17:31:52', null, null, null, null, null, '2', null, '2', null, '1', null, null, '0.00', '0.00', '1', null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `t_product` VALUES ('52', 'f7eb9aadb8cb43cc8ecd73e85f657f53', '45', 'we', null, null, null, '1', '12.00', '0', null, 'qw', null, null, '2015-08-21 09:18:21', null, null, null, null, null, '2', null, 'q', null, '12', null, null, '0.00', '0.00', '1', null, null, null, '0', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for t_product_attachment
-- ----------------------------
DROP TABLE IF EXISTS `t_product_attachment`;
CREATE TABLE `t_product_attachment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL COMMENT '附件名称',
  `url` varchar(512) DEFAULT NULL COMMENT '附件存放的绝对路径',
  `hdUrl` varchar(512) DEFAULT NULL COMMENT '高清地址',
  `status` int(1) DEFAULT NULL COMMENT '附件状态, 0 可用 1 不可用',
  `createTime` datetime NOT NULL COMMENT '上传时间',
  `attachmentType` int(1) DEFAULT NULL COMMENT '附件类型0 图片 1视频 ',
  `keyid` varchar(32) DEFAULT NULL,
  `ismain` int(1) DEFAULT NULL,
  `fileModule` varchar(20) DEFAULT NULL COMMENT '所属模块',
  `uuid` varchar(32) DEFAULT NULL,
  `title` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=utf8 COMMENT='附件';

-- ----------------------------
-- Records of t_product_attachment
-- ----------------------------
INSERT INTO `t_product_attachment` VALUES ('16', 'QQ浏览器截图_20150729165218_162BC50AFBC34ba38F4FE051AD5F1C2C.jpg', 'product/30798cb9faac45e78d7613c6b0ea9968/1439361073183.jpg', null, '1', '2015-08-12 14:31:13', '0', '30798cb9faac45e78d7613c6b0ea9968', '0', 'productSpecImg', '5ad080fb40f34a0d93fc1cb8b3de8155', null);
INSERT INTO `t_product_attachment` VALUES ('18', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/30798cb9faac45e78d7613c6b0ea9968/1439361112707.jpg', null, '1', '2015-08-12 14:31:52', '0', '30798cb9faac45e78d7613c6b0ea9968', '1', 'productInfoImg', '8da03ec1a20e4d2c9af74a2d1d4586e3', null);
INSERT INTO `t_product_attachment` VALUES ('19', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/860f81082dc0467aac29ef0963ce5644/1439361449719.jpg', null, '1', '2015-08-12 14:37:29', '0', '860f81082dc0467aac29ef0963ce5644', '1', 'productInfoImg', 'fdde0486ed1c4d01a72c0f2d2098850b', null);
INSERT INTO `t_product_attachment` VALUES ('20', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/799ad7e337bd475c9b3c4b1e1ace6415/1439361474884.jpg', null, '1', '2015-08-12 14:37:55', '0', '799ad7e337bd475c9b3c4b1e1ace6415', '1', 'productInfoImg', 'e1d27dea6c6b48069792597a575507a8', null);
INSERT INTO `t_product_attachment` VALUES ('21', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/34a6341b75544b1fae23188cabdc1e86/1439361601878.jpg', null, '1', '2015-08-12 14:40:01', '0', '34a6341b75544b1fae23188cabdc1e86', '1', 'productInfoImg', 'af5867028b744b668aab8af67fa1b304', null);
INSERT INTO `t_product_attachment` VALUES ('22', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/d1eca16cf3464e94806235cb1700dbf2/1439364029598.jpg', null, '1', '2015-08-12 15:20:29', '0', 'd1eca16cf3464e94806235cb1700dbf2', null, 'productSpecImg', '23a0e8aa5e964a2ab35398de3d43f83b', null);
INSERT INTO `t_product_attachment` VALUES ('24', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/706f5bae643741bd9bf69bdd1fea59b3/1439364326240.jpg', null, '1', '2015-08-12 15:25:26', '0', '706f5bae643741bd9bf69bdd1fea59b3', null, 'productSpecImg', '475edb7be9bc463294deec6239f3cc49', null);
INSERT INTO `t_product_attachment` VALUES ('25', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/c8bec6ddbd774365978de0ac08935030/1439366982934.jpg', null, '1', '2015-08-12 16:09:43', '0', 'c8bec6ddbd774365978de0ac08935030', null, 'productSpecImg', '13a95dd4ca6a4d75956e7a4a4b3f9fd3', null);
INSERT INTO `t_product_attachment` VALUES ('26', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/fa76bc5392334217b3f99c60cf9084be/1439368936872.jpg', null, '1', '2015-08-12 16:42:16', '0', 'fa76bc5392334217b3f99c60cf9084be', null, 'productInfoImg', '7e8c0d5267c64dc7a60a69bef5cd6405', null);
INSERT INTO `t_product_attachment` VALUES ('27', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/b04e3931871740b4a02a73a13d6e3921/1439368953625.jpg', null, '1', '2015-08-12 16:42:33', '0', 'b04e3931871740b4a02a73a13d6e3921', null, 'productSpecImg', 'f78a16d1aaaf4b2abeb216a343eff524', null);
INSERT INTO `t_product_attachment` VALUES ('28', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/c357fd30461849939a8edde62dcab49b/1439368966944.jpg', null, '1', '2015-08-12 16:42:47', '0', 'c357fd30461849939a8edde62dcab49b', null, 'productSpecImg', 'ea84c13397fc4d70a9a18c0ebe5de1d0', null);
INSERT INTO `t_product_attachment` VALUES ('29', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/b57abb561e5b4706a343b62b1a210c9c/1439368982144.jpg', null, '1', '2015-08-12 16:43:02', '0', 'b57abb561e5b4706a343b62b1a210c9c', null, 'productSpecImg', '50b2ca58cf554d1387b2ef3ac8be6c8f', null);
INSERT INTO `t_product_attachment` VALUES ('30', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/0e06003e8e604fbd96480acdaa4c1159/1439369040294.jpg', null, '1', '2015-08-12 16:44:00', '0', '0e06003e8e604fbd96480acdaa4c1159', null, 'productSpecImg', 'cf2304bbd9124392ba254887439574a8', null);
INSERT INTO `t_product_attachment` VALUES ('31', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/7de72205dc9a441b8b014516b0889894/1439376752555.jpg', null, '1', '2015-08-12 18:52:32', '0', '7de72205dc9a441b8b014516b0889894', null, 'productSpecImg', '2dcb0b4292ac4a54bed22e3364861572', '11111');
INSERT INTO `t_product_attachment` VALUES ('32', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/377ae0ec5f104f0487fc23eadc541411/1439376817409.jpg', null, '1', '2015-08-12 18:53:37', '0', '377ae0ec5f104f0487fc23eadc541411', null, 'productSpecImg', '5137c5f1e5d848afbab8ab422fb20175', '11111');
INSERT INTO `t_product_attachment` VALUES ('33', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/3e8da38f97f24fb9be69ab3e31820584/1439376940449.jpg', null, '1', '2015-08-12 18:55:40', '0', '3e8da38f97f24fb9be69ab3e31820584', null, 'productSpecImg', 'd226a14d769940428f792ec1e9495be1', '111111');
INSERT INTO `t_product_attachment` VALUES ('34', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/d0d0b0c3ca36461891f622612124e33e/1439377641534.jpg', null, '1', '2015-08-12 19:07:21', '0', 'd0d0b0c3ca36461891f622612124e33e', null, 'productSpecImg', '320812c76b45424aa03816e6fde5997a', '11111');
INSERT INTO `t_product_attachment` VALUES ('35', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/87d177c9fc874cf482b7e5d9e0806dbc/1439377679046.jpg', null, '1', '2015-08-12 19:07:59', '0', '87d177c9fc874cf482b7e5d9e0806dbc', null, 'productSpecImg', '7ce940d3a81d4538b6412e0eddb14c2f', '111');
INSERT INTO `t_product_attachment` VALUES ('36', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/ec95088c99e845a0bb1bf94e3bfd7198/1439377813024.jpg', null, '1', '2015-08-12 19:10:13', '0', 'ec95088c99e845a0bb1bf94e3bfd7198', null, 'productSpecImg', '33575ba9649e49af814b4fa981e92ced', '111');
INSERT INTO `t_product_attachment` VALUES ('37', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/a09d1370ed9a4f1787d5f74a322b1f76/1439377896230.jpg', null, '1', '2015-08-12 19:11:36', '0', 'a09d1370ed9a4f1787d5f74a322b1f76', null, 'productSpecImg', '32ffef105b9645589498c2c9df7c817a', null);
INSERT INTO `t_product_attachment` VALUES ('38', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/a09d1370ed9a4f1787d5f74a322b1f76/1439377942875.jpg', null, '1', '2015-08-12 19:12:26', '0', 'a09d1370ed9a4f1787d5f74a322b1f76', null, 'productSpecImg', '66fd3f9b0c84489eaea7b3beaada489c', null);
INSERT INTO `t_product_attachment` VALUES ('39', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/4e78044e85164b9dba3fe7e14fc7ebe9/1439377992954.jpg', null, '1', '2015-08-12 19:13:13', '0', '4e78044e85164b9dba3fe7e14fc7ebe9', null, 'productSpecImg', '2ace27947ebf4a628b2968ba7689bdd4', '');
INSERT INTO `t_product_attachment` VALUES ('40', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/4e78044e85164b9dba3fe7e14fc7ebe9/1439378031421.jpg', null, '1', '2015-08-12 19:13:51', '0', '4e78044e85164b9dba3fe7e14fc7ebe9', null, 'productInfoImg', '4bf0197376f742afa1439f79897e2f28', null);
INSERT INTO `t_product_attachment` VALUES ('41', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/4e78044e85164b9dba3fe7e14fc7ebe9/1439378042545.jpg', null, '1', '2015-08-12 19:14:02', '0', '4e78044e85164b9dba3fe7e14fc7ebe9', null, 'productSpecImg', '0e894d28fede4cc8a51e84bc1f4fddd3', '1111111');
INSERT INTO `t_product_attachment` VALUES ('42', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/4e78044e85164b9dba3fe7e14fc7ebe9/1439378057801.jpg', null, '1', '2015-08-12 19:14:18', '0', '4e78044e85164b9dba3fe7e14fc7ebe9', null, 'productSpecImg', 'ba7a95085806413398488d0bef3066bc', '收拾收拾');
INSERT INTO `t_product_attachment` VALUES ('43', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/3974933c5a8649a4aa15e0fd5e45489b/1439378726718.jpg', null, '1', '2015-08-12 19:25:26', '0', '3974933c5a8649a4aa15e0fd5e45489b', null, 'productSpecImg', '0d874932dc94412cb3083036748e828d', '电饭锅电饭锅');
INSERT INTO `t_product_attachment` VALUES ('44', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/02706251e8ee425eae156d3162ce92ab/1439378832296.jpg', null, '1', '2015-08-12 19:27:12', '0', '02706251e8ee425eae156d3162ce92ab', null, 'productSpecImg', 'e0098baf41ab43b7b527e70cab6b9c2f', '规格');
INSERT INTO `t_product_attachment` VALUES ('46', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/d97a700312774805b49625bae2c64707/1439379597238.jpg', null, '1', '2015-08-12 19:39:57', '0', 'd97a700312774805b49625bae2c64707', null, 'productSpecImg', '260fdb731b3244ad8449d2722007d72b', '111');
INSERT INTO `t_product_attachment` VALUES ('47', 'QQ浏览器截图_20150729165218_162BC50AFBC34ba38F4FE051AD5F1C2C.jpg', 'product/d97a700312774805b49625bae2c64707/1439379612659.jpg', null, '1', '2015-08-12 19:40:12', '0', 'd97a700312774805b49625bae2c64707', null, 'productSpecImg', 'f1e984251d1f475794a622b6bd7cd798', '555555555555555555555555');
INSERT INTO `t_product_attachment` VALUES ('48', 'QQ浏览器截图_20150729165218_162BC50AFBC34ba38F4FE051AD5F1C2C.jpg', 'product/d97a700312774805b49625bae2c64707/1439379653415.jpg', null, '1', '2015-08-12 19:40:53', '0', 'd97a700312774805b49625bae2c64707', null, 'productInfoImg', 'a226485bf0f141c3971a57fb93680da1', null);
INSERT INTO `t_product_attachment` VALUES ('49', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/d97a700312774805b49625bae2c64707/1439379653604.jpg', null, '1', '2015-08-12 19:40:53', '0', 'd97a700312774805b49625bae2c64707', null, 'productInfoImg', '90362ab6691f413196f094a65f3b880d', null);
INSERT INTO `t_product_attachment` VALUES ('50', 'QQ浏览器截图_20150729165218_162BC50AFBC34ba38F4FE051AD5F1C2C.jpg', 'product/409f43111edf4b70bf455ac4c8e3dda8/1439382285252.jpg', null, '1', '2015-08-12 20:24:45', '0', '409f43111edf4b70bf455ac4c8e3dda8', null, 'productInfoImg', 'f187095e54a842caa46f7710234dfe66', null);
INSERT INTO `t_product_attachment` VALUES ('51', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/409f43111edf4b70bf455ac4c8e3dda8/1439382285487.jpg', null, '1', '2015-08-12 20:24:45', '0', '409f43111edf4b70bf455ac4c8e3dda8', null, 'productInfoImg', '644e947ed0d34d61a4505595c1d94bcd', null);
INSERT INTO `t_product_attachment` VALUES ('52', '花.png', 'product/fd42033e8e5c4075b1f2d07b613eec6e/1439427901421.png', null, '1', '2015-08-13 09:05:01', '0', 'fd42033e8e5c4075b1f2d07b613eec6e', null, null, '6f614e7e18724d2eada4c188118fbd6a', null);
INSERT INTO `t_product_attachment` VALUES ('53', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/d795ad69593f40a08225cf30ef457e05/1439429520176.jpg', null, '1', '2015-08-13 09:32:00', '0', 'd795ad69593f40a08225cf30ef457e05', null, 'productInfoImg', '0fcd7c792c624745b6b3742c20b8db33', null);
INSERT INTO `t_product_attachment` VALUES ('54', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/c820735362d74cc7aca633a5733d1cea/1439431573994.jpg', null, '1', '2015-08-13 10:06:14', '0', 'c820735362d74cc7aca633a5733d1cea', null, 'productSpecImg', '2683d70ed3b541ff9630961cdbb0913c', '111111');
INSERT INTO `t_product_attachment` VALUES ('55', '1.bmp', 'product/9162b84b905b441dbf934e0be727125d/1439435526283.bmp', null, '1', '2015-08-13 11:12:32', '0', '9162b84b905b441dbf934e0be727125d', null, null, '99cc3e640f13497ab2eb26e593ebe476', null);
INSERT INTO `t_product_attachment` VALUES ('56', '1.bmp', 'product/9162b84b905b441dbf934e0be727125d/1439436156224.bmp', null, '1', '2015-08-13 11:22:55', '0', '9162b84b905b441dbf934e0be727125d', null, null, '2c243cf054a24e879b3c3d0fa4cda764', null);
INSERT INTO `t_product_attachment` VALUES ('58', '1.bmp', 'product/7fb8a268c8a44798a32cddc998998643/1439440355235.bmp', null, '1', '2015-08-13 12:32:54', '0', '7fb8a268c8a44798a32cddc998998643', null, null, '01ef62ec14a64536a1a78565c6c07800', null);
INSERT INTO `t_product_attachment` VALUES ('59', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/551acba2fe0f49639a14b433a1f6967b/1439452641229.jpg', null, '1', '2015-08-13 15:57:21', '0', '551acba2fe0f49639a14b433a1f6967b', '1', 'productInfoImg', 'f8f1fa3873f04bf793666f77715799fe', null);
INSERT INTO `t_product_attachment` VALUES ('60', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/5775fdab3e5040bc80b777ac7c57da4b/1439453409062.jpg', null, '1', '2015-08-13 16:10:09', '0', '5775fdab3e5040bc80b777ac7c57da4b', '1', 'productInfoImg', '0ffdae631320453389fd632c280f3502', null);
INSERT INTO `t_product_attachment` VALUES ('62', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/551acba2fe0f49639a14b433a1f6967b/1439457275503.jpg', null, '1', '2015-08-13 17:14:49', '0', '551acba2fe0f49639a14b433a1f6967b', '0', 'productInfoImg', '447b3f76c5e5434fa2545b41e22a350f', null);
INSERT INTO `t_product_attachment` VALUES ('64', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/551acba2fe0f49639a14b433a1f6967b/1439458713846.jpg', null, '1', '2015-08-13 17:38:33', '0', '551acba2fe0f49639a14b433a1f6967b', '0', 'productInfoImg', 'ebe5c4812ccd4863b92cd06aacd2e795', null);
INSERT INTO `t_product_attachment` VALUES ('65', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/551acba2fe0f49639a14b433a1f6967b/1439516145340.jpg', null, '1', '2015-08-14 09:35:45', '0', '551acba2fe0f49639a14b433a1f6967b', null, 'productInfoImg', 'eef385a8b06f49c28b500cfc05d488bc', null);
INSERT INTO `t_product_attachment` VALUES ('68', 'QQ浏览器截图_20150729165218_162BC50AFBC34ba38F4FE051AD5F1C2C.jpg', 'product/c9b4e27d68394fbdb87040ae3794d495/1439516891528.jpg', null, '1', '2015-08-14 09:48:11', '0', 'c9b4e27d68394fbdb87040ae3794d495', '1', 'productInfoImg', 'f5507a9ea00c44c2804935e34db2d7de', null);
INSERT INTO `t_product_attachment` VALUES ('69', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/551acba2fe0f49639a14b433a1f6967b/1439516950205.jpg', null, '1', '2015-08-14 09:49:10', '0', '551acba2fe0f49639a14b433a1f6967b', null, 'productSpecImg', 'a3a4d121130e41b5a0a87080bbbef36e', '00000');
INSERT INTO `t_product_attachment` VALUES ('70', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/3106c6ffa9624392903c701816f3e699/1439531208958.jpg', null, '1', '2015-08-14 13:46:49', '0', '3106c6ffa9624392903c701816f3e699', '0', 'productInfoImg', '0c56403f4eb6479db23a7e3f5b738971', null);
INSERT INTO `t_product_attachment` VALUES ('71', 'QQ浏览器截图_20150729165218_162BC50AFBC34ba38F4FE051AD5F1C2C.jpg', 'product/3106c6ffa9624392903c701816f3e699/1439531214412.jpg', null, '1', '2015-08-14 13:46:55', '0', '3106c6ffa9624392903c701816f3e699', '1', 'productInfoImg', '096a0a78222542858e23419e6ebca37b', null);
INSERT INTO `t_product_attachment` VALUES ('72', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/985b0148f66d408fab691c7aa61adc40/1439610579656.jpg', null, '1', '2015-08-15 11:49:39', '0', '985b0148f66d408fab691c7aa61adc40', null, 'productInfoImg', '4077048cf9684be7ab70be1cc202585e', null);
INSERT INTO `t_product_attachment` VALUES ('73', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/985b0148f66d408fab691c7aa61adc40/1439610586218.jpg', null, '1', '2015-08-15 11:49:46', '0', '985b0148f66d408fab691c7aa61adc40', null, 'productInfoImg', '34a698daadba4aed9c0280b534393c1c', null);
INSERT INTO `t_product_attachment` VALUES ('74', '1438846939222825.jpg', 'product/5c66ea41b3da43069a54d783e6f68901/1439863128993.jpg', null, '1', '2015-08-18 09:58:49', '0', '5c66ea41b3da43069a54d783e6f68901', null, 'productInfoImg', 'e0613c336e7d4a3f8e694dd8b15f5ccb', null);
INSERT INTO `t_product_attachment` VALUES ('75', 'QQ截图20150818141837.png', 'product/a397075d26f942f38d86352fda32cf32/1439878759462.png', null, '1', '2015-08-18 14:19:19', '0', 'a397075d26f942f38d86352fda32cf32', '1', 'productInfoImg', '1c73b10da50c48a7bf324268531565b4', null);
INSERT INTO `t_product_attachment` VALUES ('80', '007.jpg', 'product/3fa17fa4621a4ca0aa82e9b3d9a280ec/1439968173619.jpg', null, '1', '2015-08-19 15:09:53', '0', '3fa17fa4621a4ca0aa82e9b3d9a280ec', '1', 'productInfoImg', '565945f46c0f47e88241a9eeb040f4d3', null);
INSERT INTO `t_product_attachment` VALUES ('81', '007.jpg', 'product/c2ae2dac6aa94aa9b1ef3d503ad8cf04/1439968233367.jpg', null, '1', '2015-08-19 15:10:33', '0', 'c2ae2dac6aa94aa9b1ef3d503ad8cf04', '1', 'productInfoImg', 'bc18a1da6584422f8a9af755604c2003', null);
INSERT INTO `t_product_attachment` VALUES ('82', 'aboutus.png', 'product/a397075d26f942f38d86352fda32cf32/1439969481114.png', null, '1', '2015-08-19 15:31:21', '0', 'a397075d26f942f38d86352fda32cf32', null, 'productSpecImg', 'c0d43cbfc7754f338ca108497c7b00f9', '规格1');
INSERT INTO `t_product_attachment` VALUES ('83', 'pi_banner02.png', 'product/a397075d26f942f38d86352fda32cf32/1439969498689.png', null, '1', '2015-08-19 15:31:38', '0', 'a397075d26f942f38d86352fda32cf32', null, 'productSpecImg', 'ddd593232ca149648ca5f977ff1d488e', '规格2');
INSERT INTO `t_product_attachment` VALUES ('84', 'a27cc6a6ace02dfe14d6075cf32c898a.jpg', 'product/a397075d26f942f38d86352fda32cf32/1439969516941.jpg', null, '1', '2015-08-19 15:31:57', '0', 'a397075d26f942f38d86352fda32cf32', null, 'productInfoImg', '7acb42bf2ba34a33a5bc779c04f7e76f', null);
INSERT INTO `t_product_attachment` VALUES ('85', '41b3a1041f210b0df7d06b67189ef217.jpg', 'product/a397075d26f942f38d86352fda32cf32/1439969524188.jpg', null, '1', '2015-08-19 15:32:04', '0', 'a397075d26f942f38d86352fda32cf32', null, 'productInfoImg', '8e4d0f2c871d4ca2b79f4a81101d6045', null);
INSERT INTO `t_product_attachment` VALUES ('87', 'QQ截图20150818141654.png', 'product/a397075d26f942f38d86352fda32cf32/1439970289631.png', null, '1', '2015-08-19 15:44:49', '0', 'a397075d26f942f38d86352fda32cf32', null, 'productInfoImg', 'ad1157a3873a49d4a0e7242eeb4628a4', null);
INSERT INTO `t_product_attachment` VALUES ('88', 'page1_pic11.jpg', 'product/a397075d26f942f38d86352fda32cf32/1439970328362.jpg', null, '1', '2015-08-19 15:45:28', '0', 'a397075d26f942f38d86352fda32cf32', null, 'productInfoImg', '7cfdef4dcd8f479699bafd30c457c430', null);

-- ----------------------------
-- Table structure for t_product_attribute
-- ----------------------------
DROP TABLE IF EXISTS `t_product_attribute`;
CREATE TABLE `t_product_attribute` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `categoryid` bigint(20) NOT NULL COMMENT '产品分类id',
  `name` varchar(50) NOT NULL COMMENT '属性名称',
  `inputType` int(1) NOT NULL COMMENT '添加属性的时候，这个值是手工输入（0）还是选择输入（1）',
  `valueList` varchar(225) DEFAULT NULL COMMENT '当inputType为1时，存放候选值，空格区分',
  `isIndex` int(1) NOT NULL COMMENT '属性是否可以检索：0：不可以，1：关键字检索，2：范围检索\r\n            例如：',
  `rank` int(11) NOT NULL COMMENT '属性显示顺序，越大越考后',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `orgid` int(11) DEFAULT NULL COMMENT '组织公司ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='产品类型属性列表名称';

-- ----------------------------
-- Records of t_product_attribute
-- ----------------------------
INSERT INTO `t_product_attribute` VALUES ('1', '0', '', '0', null, '0', '0', null, null);

-- ----------------------------
-- Table structure for t_product_attribute_value
-- ----------------------------
DROP TABLE IF EXISTS `t_product_attribute_value`;
CREATE TABLE `t_product_attribute_value` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `productId` bigint(20) NOT NULL COMMENT '商品ID',
  `attributeId` bigint(20) NOT NULL COMMENT '属性名ID',
  `valueList` varchar(255) NOT NULL COMMENT '属性值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='具体商品的属性值';

-- ----------------------------
-- Records of t_product_attribute_value
-- ----------------------------

-- ----------------------------
-- Table structure for t_product_brand
-- ----------------------------
DROP TABLE IF EXISTS `t_product_brand`;
CREATE TABLE `t_product_brand` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `nameCn` varchar(64) NOT NULL COMMENT '品牌名称',
  `nameEn` varchar(64) DEFAULT NULL COMMENT '英文名,没有则拼音',
  `logoUrl` varchar(512) DEFAULT NULL COMMENT '品牌logo',
  `description` varchar(512) DEFAULT NULL COMMENT '品牌描述,介绍',
  `webUrl` varchar(512) DEFAULT NULL COMMENT '品牌网址',
  `rank` int(11) DEFAULT NULL COMMENT '排序字段，数字越大越靠后',
  `isShow` int(1) DEFAULT NULL COMMENT '是否展示该品牌，1：展示，0：否',
  `recommendLevel` int(11) DEFAULT NULL COMMENT '推荐等级 0 10 20三级',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='产品品牌';

-- ----------------------------
-- Records of t_product_brand
-- ----------------------------
INSERT INTO `t_product_brand` VALUES ('2', '坦能9', '', null, 'asdasd', '', '11', '1', '1');
INSERT INTO `t_product_brand` VALUES ('14', '嘉得力', '', null, '', '', '6', null, '4');
INSERT INTO `t_product_brand` VALUES ('16', '其他', '', null, '55555', '', '4', null, '3');
INSERT INTO `t_product_brand` VALUES ('21', 'rt n', 'ty', null, '', '', null, null, null);
INSERT INTO `t_product_brand` VALUES ('25', 'sad', '', null, '', '', null, null, null);
INSERT INTO `t_product_brand` VALUES ('27', 'you', '', null, '', '', null, null, null);

-- ----------------------------
-- Table structure for t_product_category
-- ----------------------------
DROP TABLE IF EXISTS `t_product_category`;
CREATE TABLE `t_product_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `nameCn` varchar(90) DEFAULT NULL COMMENT '类目名称',
  `nameEn` varchar(255) DEFAULT NULL COMMENT '英文名称',
  `keywords` varchar(255) DEFAULT NULL COMMENT '分类关键字',
  `description` varchar(4096) DEFAULT NULL COMMENT '栏目介绍',
  `parentId` bigint(11) DEFAULT NULL COMMENT '分类父id',
  `rank` int(11) DEFAULT NULL COMMENT '排序，越大越靠后',
  `unit` varchar(50) DEFAULT NULL COMMENT '该分类单位',
  `isShow` int(1) DEFAULT NULL COMMENT '是否展示在导航栏上',
  `resourceid` bigint(20) DEFAULT NULL COMMENT '所属栏目',
  `type` int(11) DEFAULT NULL COMMENT '类型(系统,外部,单页面)',
  `templateid` bigint(20) DEFAULT NULL COMMENT '模板ID',
  `picUrl` varchar(512) DEFAULT NULL COMMENT '图片地址',
  `picHdUrl` varchar(512) DEFAULT NULL COMMENT '高清图地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=311 DEFAULT CHARSET=utf8 COMMENT='产品分类';

-- ----------------------------
-- Records of t_product_category
-- ----------------------------
INSERT INTO `t_product_category` VALUES ('1', '清洁产品', null, null, null, '0', null, null, null, '57', null, null, null, null);
INSERT INTO `t_product_category` VALUES ('2', '手推式洗地机', null, null, null, '1', '1', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('3', '驾驶式洗地机', null, null, null, '1', '2', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('4', '手推式扫地机', null, null, null, '1', '3', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('5', '驾驶式扫地机', null, null, null, '1', '4', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('6', '扫洗一体机', '', '', '', '1', '5', '', null, null, null, null, '', '');
INSERT INTO `t_product_category` VALUES ('7', '市政环卫清洁', '6', '电视机', '', '1', '6', '3', null, null, null, null, '', '');
INSERT INTO `t_product_category` VALUES ('8', '地毯抽洗机', null, null, null, '1', '7', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('9', '石材晶面翻新机', null, null, null, '1', '8', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('10', '多功能擦地机', null, null, null, '1', '9', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('11', '吸尘器 吸尘吸水机', null, null, null, '1', '10', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('12', '石材翻新机', null, null, null, '1', '11', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('13', '高压水枪', null, null, null, '1', '13', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('14', '清洁工具', null, null, null, '1', '14', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('15', '中央集尘系统', null, null, null, '1', '15', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('16', '清洁剂', null, null, null, '1', '16', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('17', '安全防护', null, null, null, '0', '0', null, null, '58', null, null, null, null);
INSERT INTO `t_product_category` VALUES ('18', '听力防护', null, null, null, '17', '1', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('19', '眼部防护', null, null, null, '17', '2', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('20', '面部防护', 'xidiji', '洗地机', '洗地机', '17', '3', '辆', null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('21', '头部防护', null, null, null, '17', '4', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('22', '手部防护', null, null, null, '17', '5', null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('23', '工业吸尘器', '工业吸尘器', null, null, '0', null, null, null, '59', null, null, null, null);
INSERT INTO `t_product_category` VALUES ('24', '工业吸油机', null, null, null, '23', null, null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('25', '工业集尘器', null, null, null, '23', null, null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('26', '烟尘净化器', null, null, null, '23', null, null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('27', '中央集尘系统', null, null, null, '23', null, null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('28', '行业配套吸尘器', null, null, null, '23', null, null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('29', '非标定制集尘器', null, null, null, '23', null, null, null, null, null, null, null, null);
INSERT INTO `t_product_category` VALUES ('306', '租赁服务', '', '', '', '0', null, '', '1', '60', '1', null, null, null);
INSERT INTO `t_product_category` VALUES ('307', '洗地机租赁', '', '', '', '306', null, '', '1', '60', '1', null, null, null);
INSERT INTO `t_product_category` VALUES ('308', '扫地机租赁', '', '', '', '306', null, '', '1', '60', '1', null, null, null);
INSERT INTO `t_product_category` VALUES ('309', '扫地洗地一体机租赁', '', '', '', '306', null, '', '1', '60', '1', null, null, null);
INSERT INTO `t_product_category` VALUES ('310', '市政环卫设备租赁', '', '', '', '306', null, '', '1', '60', '1', null, null, null);

-- ----------------------------
-- Table structure for t_product_class
-- ----------------------------
DROP TABLE IF EXISTS `t_product_class`;
CREATE TABLE `t_product_class` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `name` varchar(60) NOT NULL COMMENT '产品类型名称',
  `enabled` int(1) NOT NULL COMMENT '类型状态，1：可用，0：不可用',
  `categoryid` bigint(20) DEFAULT NULL COMMENT '所属类别',
  `showType` int(1) DEFAULT NULL COMMENT '显示类型(文字,图片)',
  `picUrl` varchar(512) DEFAULT NULL COMMENT '图片路径',
  `hasProduct` int(1) DEFAULT NULL COMMENT '是否有产品0 没有 1有',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品类型';

-- ----------------------------
-- Records of t_product_class
-- ----------------------------

-- ----------------------------
-- Table structure for t_product_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_product_comment`;
CREATE TABLE `t_product_comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `productid` varchar(32) DEFAULT NULL COMMENT '产品ID',
  `createUser` varchar(32) DEFAULT NULL COMMENT '评价者',
  `createTime` datetime DEFAULT NULL COMMENT '时间',
  `content` varchar(2048) DEFAULT NULL COMMENT '内容',
  `level` int(2) DEFAULT NULL COMMENT '评论等级, 用于追评',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品评论 评价';

-- ----------------------------
-- Records of t_product_comment
-- ----------------------------

-- ----------------------------
-- Table structure for t_product_detailed
-- ----------------------------
DROP TABLE IF EXISTS `t_product_detailed`;
CREATE TABLE `t_product_detailed` (
  `uuid` varchar(32) DEFAULT NULL,
  `param` varchar(4096) DEFAULT NULL COMMENT '技术参数',
  `lease` varchar(4096) DEFAULT NULL COMMENT '租赁说明',
  `description` varchar(4096) DEFAULT NULL COMMENT '产品说明，具体介绍',
  `remark` varchar(4096) DEFAULT NULL COMMENT '产品备注，仅商家可见'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品详细';

-- ----------------------------
-- Records of t_product_detailed
-- ----------------------------
INSERT INTO `t_product_detailed` VALUES ('5583719574db45f6abb503057f516d71', '', null, '<p>1</p>', null);
INSERT INTO `t_product_detailed` VALUES ('fb5e7e6d2bc64d769af52b59931b9e9e', '', null, '<p>111</p>', null);
INSERT INTO `t_product_detailed` VALUES ('fb5e7e6d2bc64d769af52b59931b9e9e', '', null, '<p>111</p>', null);
INSERT INTO `t_product_detailed` VALUES ('3828695a2e304caeaa94823fb5950d30', '', null, '<p>11</p>', null);
INSERT INTO `t_product_detailed` VALUES ('d97a700312774805b49625bae2c64707', '<p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p>士大夫士大夫</p><p></p>', null, '<p>sdfsfsdfsdf</p>', null);
INSERT INTO `t_product_detailed` VALUES (null, '1<p>111111111111</p>', '<p>11111111</p>', '', null);
INSERT INTO `t_product_detailed` VALUES (null, '<p>111111111111</p>', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('551acba2fe0f49639a14b433a1f6967b', '1<p>000000000</p>', '<p>111111111</p>', '<p>sdfsfsdfsdf</p>', null);
INSERT INTO `t_product_detailed` VALUES ('3106c6ffa9624392903c701816f3e699', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('c9b4e27d68394fbdb87040ae3794d495', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('f5ff657a31d14117ae819c9a18702cdb', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('5c66ea41b3da43069a54d783e6f68901', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('bb6331ff3ea843f492c335ee6764b457', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('2701a1de62bb442fbf6de06b0792c26d', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('c5f536a357c7447094896fe941f01e5f', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('165b20b061004b51a0664a8b18a52bfd', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('1f292cf910a942818fd9769d7aae97f3', '', '', '<p>aaaaaaaaaaaaaa</p>', null);
INSERT INTO `t_product_detailed` VALUES ('59cf49912ef342c0ae482eeee45e69e8', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('b30d14cd92194738a64aa36b6f591269', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('3f9b1121cf6e4be29cf3b0d2dc074f84', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('180b09d750f54969b86180e767d5bba3', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('f1b47693477e4f22990b4c363b6ddf60', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('59c31afacb634913a30a8f6196b23665', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('15a96b656a2048abbd6c08d2af51155c', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('301759a588234396a4bef35b32d3e9cc', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('c7f33bb284474c469e54296c82cd0f40', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('0d45f38e3f0142bdbff15dcb7835d50f', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('03082a8c121143c8a1ddee33d9d547d0', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('746f75aca75f46db99bbfe1b429996b4', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('c2ae2dac6aa94aa9b1ef3d503ad8cf04', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('a397075d26f942f38d86352fda32cf32', '', '', '<p><img src=\"http://192.168.1.39:8081/uedit/2015/0718/1439878632652011581.png\" title=\"1439878632652011581.png\" alt=\"QQ截图20150818141654.png\"/></p>', null);
INSERT INTO `t_product_detailed` VALUES ('e52e1f0f16a84ca4aca1708e58e0fa25', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('c6f51795ba81451cb86fc8262aac69c9', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('5834b4d978c845b6b510efe4283128e8', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('e36138775fbb4a2d9ad46e207cd4c977', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('f945186c671d4eacba3429666b3ab022', '', '', '', null);
INSERT INTO `t_product_detailed` VALUES ('f7eb9aadb8cb43cc8ecd73e85f657f53', '', '', '', null);

-- ----------------------------
-- Table structure for t_product_filter
-- ----------------------------
DROP TABLE IF EXISTS `t_product_filter`;
CREATE TABLE `t_product_filter` (
  `uuid` varchar(32) NOT NULL,
  `categoryid` bigint(20) NOT NULL COMMENT '分类id',
  `name` varchar(128) NOT NULL COMMENT '属性名称',
  `valuemin` varchar(11) DEFAULT NULL COMMENT '最小值',
  `valuemax` varchar(11) DEFAULT NULL COMMENT '最大值',
  `value` varchar(32) DEFAULT NULL COMMENT '属性对应值',
  `unit` varchar(32) DEFAULT NULL COMMENT '单位',
  `isshow` int(1) DEFAULT NULL COMMENT '是否显示0不显示，1显示',
  `author` varchar(32) DEFAULT NULL COMMENT '创建人',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品属性筛选';

-- ----------------------------
-- Records of t_product_filter
-- ----------------------------
INSERT INTO `t_product_filter` VALUES ('54cfa7e398d24be29f96b918a1b76c90', '1', '测试1', '25', '6666', '', '元', '0', 'e12123132123123132132132132132', '2015-08-20 17:56:12');
INSERT INTO `t_product_filter` VALUES ('d42e2f1900464247ba2d5f6380bc32f1', '1', '测试', '13', '4444', '', '元', '0', 'e12123132123123132132132132132', '2015-08-20 17:56:01');

-- ----------------------------
-- Table structure for t_product_material
-- ----------------------------
DROP TABLE IF EXISTS `t_product_material`;
CREATE TABLE `t_product_material` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `nameCn` varchar(64) NOT NULL COMMENT '中文名',
  `nameEn` varchar(64) NOT NULL COMMENT '英文名',
  `picUrl` varchar(512) NOT NULL COMMENT '图片地址',
  `description` varchar(2048) DEFAULT NULL COMMENT '描述',
  `interfaceUrl` varchar(512) DEFAULT NULL COMMENT '接口地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物流公司';

-- ----------------------------
-- Records of t_product_material
-- ----------------------------

-- ----------------------------
-- Table structure for t_product_provider
-- ----------------------------
DROP TABLE IF EXISTS `t_product_provider`;
CREATE TABLE `t_product_provider` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nameCn` varchar(256) DEFAULT NULL COMMENT '供应商中文名',
  `nameEn` varchar(256) DEFAULT NULL COMMENT '英文名',
  `parentid` int(11) DEFAULT NULL,
  `description` varchar(512) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='供应商';

-- ----------------------------
-- Records of t_product_provider
-- ----------------------------

-- ----------------------------
-- Table structure for t_product_sku_name
-- ----------------------------
DROP TABLE IF EXISTS `t_product_sku_name`;
CREATE TABLE `t_product_sku_name` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `categoryId` bigint(20) NOT NULL COMMENT '产品分类ID',
  `name` varchar(50) NOT NULL COMMENT 'sku属性名称',
  `inputType` int(1) NOT NULL COMMENT '属性值输入方式1固定值，2输入',
  `valueList` varchar(225) DEFAULT NULL COMMENT '当inputType为1时，存放候选值，空格区分',
  `rank` int(11) NOT NULL COMMENT '排序，越大越靠后',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='不同类型的sku属性名称 即销售属性';

-- ----------------------------
-- Records of t_product_sku_name
-- ----------------------------

-- ----------------------------
-- Table structure for t_product_sku_value
-- ----------------------------
DROP TABLE IF EXISTS `t_product_sku_value`;
CREATE TABLE `t_product_sku_value` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `code` varchar(20) NOT NULL COMMENT '分组编码 16进制 16位编码',
  `productId` bigint(20) NOT NULL COMMENT '产品ID',
  `attributeId` bigint(20) NOT NULL COMMENT '属性名ID',
  `value` varchar(50) NOT NULL COMMENT '属性值',
  `count` int(11) NOT NULL COMMENT '数量',
  `price` decimal(10,2) NOT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品SKU(某类商品的特殊字段';

-- ----------------------------
-- Records of t_product_sku_value
-- ----------------------------

-- ----------------------------
-- Table structure for t_product_solutions
-- ----------------------------
DROP TABLE IF EXISTS `t_product_solutions`;
CREATE TABLE `t_product_solutions` (
  `uuid` varchar(32) NOT NULL,
  `title` varchar(512) DEFAULT NULL COMMENT '标题',
  `appliesment` varchar(1024) DEFAULT NULL COMMENT '适用环境',
  `procategoryid` varchar(2048) DEFAULT NULL COMMENT '相关推荐产品  用json 格式处理  如：【{"sortid":"12","prpuuid":"12312312123132123132"},{}】',
  `prochampion` varchar(2048) DEFAULT NULL COMMENT '销售冠军    用json 格式处理  如：【{"sortid":"12","prpuuid":"12312312123132123132"},{}】',
  `Customer` varchar(2048) DEFAULT NULL COMMENT '主要客户 和客户名录表相关联  用json 格式处理  如：【{"sortid":"12"】',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='解决方案';

-- ----------------------------
-- Records of t_product_solutions
-- ----------------------------
INSERT INTO `t_product_solutions` VALUES ('5d95c5d93968419f8d59ab5e8471dce4', 'weqweqwe', 'qweqweqw', '[{\"sortid\":\"1\",\"pros\":[{\"uuid\":\"5c66ea41b3da43069a54d783e6f68901\"},{\"uuid\":\"a397075d26f942f38d86352fda32cf32\"},{\"uuid\":\"5775fdab3e5040bc80b777ac7c57da4b\"},{\"uuid\":\"3106c6ffa9624392903c701816f3e699\"}]}]', '[{\"id\":\"f7eb9aadb8cb43cc8ecd73e85f657f53\"},{\"id\":\"f945186c671d4eacba3429666b3ab022\"},{\"id\":\"e36138775fbb4a2d9ad46e207cd4c977\"},{\"id\":\"5834b4d978c845b6b510efe4283128e8\"}]', '[{\"id\":\"8\"}]');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nameCn` varchar(32) DEFAULT NULL COMMENT '角色名',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='角色, ';

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', '11', '0');
INSERT INTO `t_role` VALUES ('2', '11', '0');
INSERT INTO `t_role` VALUES ('3', '测试long', null);
INSERT INTO `t_role` VALUES ('4', '测试long', null);
INSERT INTO `t_role` VALUES ('5', '测试long', null);
INSERT INTO `t_role` VALUES ('6', '测试long', null);
INSERT INTO `t_role` VALUES ('7', '测试long', null);

-- ----------------------------
-- Table structure for t_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_role_permission`;
CREATE TABLE `t_role_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `roleid` bigint(20) DEFAULT NULL,
  `permissionid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_3` (`roleid`),
  KEY `FK_Reference_4` (`permissionid`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`permissionid`) REFERENCES `t_permission` (`id`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`roleid`) REFERENCES `t_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色,权限中间表';

-- ----------------------------
-- Records of t_role_permission
-- ----------------------------

-- ----------------------------
-- Table structure for t_survey
-- ----------------------------
DROP TABLE IF EXISTS `t_survey`;
CREATE TABLE `t_survey` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL COMMENT '调查标题',
  `status` int(1) DEFAULT NULL COMMENT '0:正常调查中，1：已结束 2:定时开始结束',
  `count` int(11) NOT NULL DEFAULT '0' COMMENT '此调查参与人数',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `createUser` varchar(32) DEFAULT NULL COMMENT '创建者',
  `startTime` datetime DEFAULT NULL COMMENT '开始时间',
  `endTime` datetime DEFAULT NULL COMMENT '结束时间',
  `clazzid` varchar(32) DEFAULT NULL COMMENT '类型ID,类型ID在字典表中',
  `type` int(1) DEFAULT NULL COMMENT '类型0单选 1多选',
  `isMust` int(1) DEFAULT NULL COMMENT '是否必须选择,至少一项0可以不选 1至少一项',
  `rank` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='调查';

-- ----------------------------
-- Records of t_survey
-- ----------------------------

-- ----------------------------
-- Table structure for t_survey_item
-- ----------------------------
DROP TABLE IF EXISTS `t_survey_item`;
CREATE TABLE `t_survey_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `surveyId` bigint(20) NOT NULL COMMENT '调查id',
  `title` varchar(512) DEFAULT NULL COMMENT '标题',
  `count` int(11) DEFAULT NULL COMMENT '投票数',
  `rank` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='调查答案';

-- ----------------------------
-- Records of t_survey_item
-- ----------------------------
INSERT INTO `t_survey_item` VALUES ('16', '111231', null, null, null);
INSERT INTO `t_survey_item` VALUES ('17', '111231', null, null, null);

-- ----------------------------
-- Table structure for t_sys_attachment
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_attachment`;
CREATE TABLE `t_sys_attachment` (
  `uuid` varchar(32) NOT NULL,
  `name` varchar(64) DEFAULT NULL COMMENT '附件名称',
  `url` varchar(512) DEFAULT NULL COMMENT '附件地址',
  `type` int(1) DEFAULT NULL COMMENT '附件类型，０文件　１媒体文件',
  `hdUrl` varchar(512) DEFAULT NULL COMMENT '高清地址',
  `description` varchar(1024) DEFAULT NULL COMMENT '描述',
  `createUser` bigint(20) DEFAULT NULL COMMENT '创建人',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `isDelete` int(1) DEFAULT NULL COMMENT '是否删除，０删除，１保留',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='附件表';

-- ----------------------------
-- Records of t_sys_attachment
-- ----------------------------
INSERT INTO `t_sys_attachment` VALUES ('0882d4f11a3348ca80b13f8b81d523ce', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/0882d4f11a3348ca80b13f8b81d523ce/1439277730721.jpg', null, null, null, null, '2015-08-11 15:22:10', null);
INSERT INTO `t_sys_attachment` VALUES ('089d8137ae7249f99be09f31537ba18b', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/089d8137ae7249f99be09f31537ba18b/1439277214275.jpg', null, null, null, null, '2015-08-11 15:13:34', null);
INSERT INTO `t_sys_attachment` VALUES ('12ec414c66c14b8ebf2afc9ac9bcf050', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/12ec414c66c14b8ebf2afc9ac9bcf050/1439277288222.jpg', null, null, null, null, '2015-08-11 15:14:48', null);
INSERT INTO `t_sys_attachment` VALUES ('14e79793daaf4622a43ddbac73ff9697', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/14e79793daaf4622a43ddbac73ff9697/1439276920335.jpg', null, null, null, null, '2015-08-11 15:08:40', null);
INSERT INTO `t_sys_attachment` VALUES ('1cb3a262560d4e1ca69095321eb59955', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/1cb3a262560d4e1ca69095321eb59955/1439276292522.jpg', null, null, null, null, '2015-08-11 14:58:18', null);
INSERT INTO `t_sys_attachment` VALUES ('275369ef162a46e7a1934c0256e26923', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/275369ef162a46e7a1934c0256e26923/1439277325892.jpg', null, null, null, null, '2015-08-11 15:15:25', null);
INSERT INTO `t_sys_attachment` VALUES ('2fd3a214f8084db8a50a512c08c81ca5', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/2fd3a214f8084db8a50a512c08c81ca5/1439277573620.jpg', null, null, null, null, '2015-08-11 15:19:33', null);
INSERT INTO `t_sys_attachment` VALUES ('459ec28b6ffb4c79a4743d5d22e8849e', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/459ec28b6ffb4c79a4743d5d22e8849e/1439277171544.jpg', null, null, null, null, '2015-08-11 15:12:51', null);
INSERT INTO `t_sys_attachment` VALUES ('55e82ffd3e8f4a33adc42827aa61da8c', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/55e82ffd3e8f4a33adc42827aa61da8c/1439351224374.jpg', null, null, null, null, '2015-08-12 11:47:06', null);
INSERT INTO `t_sys_attachment` VALUES ('5ca01113e88a464cb64e64b2e045b711', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/5ca01113e88a464cb64e64b2e045b711/1439277356457.jpg', null, null, null, null, '2015-08-11 15:15:56', null);
INSERT INTO `t_sys_attachment` VALUES ('657602d26f364e32b6946335e3182138', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/657602d26f364e32b6946335e3182138/1439276949246.jpg', null, null, null, null, '2015-08-11 15:09:09', null);
INSERT INTO `t_sys_attachment` VALUES ('a4e444c38cb54055b5a99817966b9d81', 'TB1bCQNIFXXXXXFXXXXXXXXXXXX_!!0-item_pic_jpg_480x480Q90.jpg', 'product/a4e444c38cb54055b5a99817966b9d81/1439277685882.jpg', null, null, null, null, '2015-08-11 15:21:25', null);
INSERT INTO `t_sys_attachment` VALUES ('d098eb565943404c9fa974f8dcd4fbf1', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/d098eb565943404c9fa974f8dcd4fbf1/1439276655520.jpg', null, null, null, null, '2015-08-11 15:04:15', null);
INSERT INTO `t_sys_attachment` VALUES ('ed0d02419d524f6a85c94e155873ac56', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/ed0d02419d524f6a85c94e155873ac56/1439276793042.jpg', null, null, null, null, '2015-08-11 15:06:33', null);
INSERT INTO `t_sys_attachment` VALUES ('f6104f79ae76489d8d97c6b2be71d8b3', 'QQ浏览器截图_20150729165218_162BC50AFBC34ba38F4FE051AD5F1C2C.jpg', 'product/f6104f79ae76489d8d97c6b2be71d8b3/1439276250140.jpg', null, null, null, null, '2015-08-11 14:57:30', null);
INSERT INTO `t_sys_attachment` VALUES ('f8e54bd0fe0948e09de1dbf5ccd0b896', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/f8e54bd0fe0948e09de1dbf5ccd0b896/1439276675229.jpg', null, null, null, null, '2015-08-11 15:04:36', null);
INSERT INTO `t_sys_attachment` VALUES ('f9f3368c1e72429f832205751765bb91', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/f9f3368c1e72429f832205751765bb91/1439276758364.jpg', null, null, null, null, '2015-08-11 15:05:59', null);
INSERT INTO `t_sys_attachment` VALUES ('fe3cc9c9ea3c4be4a2dd294c36b2d9a3', 'QQ浏览器截图_20150729165221_06B0593FA264464a9F1A3E74075C26E0.jpg', 'product/fe3cc9c9ea3c4be4a2dd294c36b2d9a3/1439277453589.jpg', null, null, null, null, '2015-08-11 15:17:33', null);

-- ----------------------------
-- Table structure for t_sys_carousel
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_carousel`;
CREATE TABLE `t_sys_carousel` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `url` varchar(128) DEFAULT NULL COMMENT '图片地址',
  `type` int(1) DEFAULT NULL COMMENT '图片类型1首页轮播图',
  `title` varchar(128) DEFAULT NULL COMMENT '图标标题',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `description` varchar(512) DEFAULT NULL COMMENT '图片说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8 COMMENT='轮播图片地址';

-- ----------------------------
-- Records of t_sys_carousel
-- ----------------------------
INSERT INTO `t_sys_carousel` VALUES ('40', 'other/fb053062d707469eac69aad82c7d99e0/1440058328952.jpg', '1', '风景', '2015-08-20 16:12:10', '');
INSERT INTO `t_sys_carousel` VALUES ('41', 'other/d1ab6267641249ad85e70e2f5983b382/1440058336025.jpg', '1', '', '2015-08-20 16:12:16', '');
INSERT INTO `t_sys_carousel` VALUES ('42', 'other/d823068daec449e7af2a5eac926bf736/1440058341999.jpg', '1', '', '2015-08-20 16:12:23', '');
INSERT INTO `t_sys_carousel` VALUES ('43', 'other/4f267e18d99d499b8aaa972a94daf53b/1440058347972.jpg', '1', '卡通', '2015-08-20 16:12:28', '');
INSERT INTO `t_sys_carousel` VALUES ('44', 'other/5b66bb1f8a32422ea1b2652f49f9fb6f/1440058352643.jpeg', '1', '', '2015-08-20 16:12:33', '');
INSERT INTO `t_sys_carousel` VALUES ('45', 'other/b54f697495cf4f3eb7458c18841b3ace/1440058357765.jpg', '1', '', '2015-08-20 16:12:38', '');

-- ----------------------------
-- Table structure for t_sys_dict
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_dict`;
CREATE TABLE `t_sys_dict` (
  `uuid` varchar(32) NOT NULL,
  `nameCn` varchar(32) DEFAULT NULL COMMENT '中文名',
  `nameEn` varchar(32) NOT NULL COMMENT '英文名, 调用值',
  `content` varchar(2048) DEFAULT NULL COMMENT '内容,值',
  `description` varchar(1024) DEFAULT NULL COMMENT '描述',
  `parentid` varchar(32) DEFAULT NULL COMMENT '父ID',
  `createUser` varchar(32) DEFAULT NULL COMMENT '创建者',
  `orgid` int(11) DEFAULT NULL COMMENT '所属组织',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(1) unsigned zerofill DEFAULT '0' COMMENT '状态0正常 1禁用',
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `nameEn` (`nameEn`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典表, 存储系统中所有静态键值对,key,value值, 主要用于系统静态值, 不易改变,在系统启动时即填入到系统内存';

-- ----------------------------
-- Records of t_sys_dict
-- ----------------------------
INSERT INTO `t_sys_dict` VALUES ('0ce4cbdd3c1611e59a2b8c89a5e173c7', null, 'ftpport', '21', null, null, null, null, null, null);
INSERT INTO `t_sys_dict` VALUES ('20ed77942e8111e59a2b8c89a5e173c7', '系统管理', 'sysSetting', null, '用户进行系统管理', null, null, '1', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed7aa62e8111e59a2b8c89a5e173c7', '站点设置', 'siteSetting', null, '用户对网站进行设置', '20ed77942e8111e59a2b8c89a5e173c7', null, '2', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed7bef2e8111e59a2b8c89a5e173c7', '基本信息', 'basicInfo', null, '网站基本信息设置', '20ed7aa62e8111e59a2b8c89a5e173c7', null, '3', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed7d782e8111e59a2b8c89a5e173c7', '网站名称', 'webSiteName', '233呃呃呃3232111', '用户网站的名字', '20ed7bef2e8111e59a2b8c89a5e173c7', null, '4', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed7ead2e8111e59a2b8c89a5e173c7', '简称', 'webSiteNameAbbrevia', '宇田', '用户网站名字的简称', '20ed7bef2e8111e59a2b8c89a5e173c7', null, '5', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed7fdb2e8111e59a2b8c89a5e173c7', '关键字', 'keyWord', '1', '网站关键字', '20ed7bef2e8111e59a2b8c89a5e173c7', null, '6', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed80ff2e8111e59a2b8c89a5e173c7', '描述', 'describe', '2', '网站的描述', '20ed7bef2e8111e59a2b8c89a5e173c7', null, '7', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed82042e8111e59a2b8c89a5e173c7', '域名', 'domainName', '3', null, '20ed7bef2e8111e59a2b8c89a5e173c7', null, '8', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed83152e8111e59a2b8c89a5e173c7', '路径', 'sitePath', '4', null, '20ed7bef2e8111e59a2b8c89a5e173c7', null, '9', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed84392e8111e59a2b8c89a5e173c7', '域名别名', 'domainAliases', '5', null, '20ed7bef2e8111e59a2b8c89a5e173c7', null, '10', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed85622e8111e59a2b8c89a5e173c7', '站点访问路径', 'siteAccessPath', '7', null, '20ed7bef2e8111e59a2b8c89a5e173c7', null, '11', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed86792e8111e59a2b8c89a5e173c7', '动态页后缀', 'dynamicPagesSuffix', '2', null, '20ed7bef2e8111e59a2b8c89a5e173c7', null, '12', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed878d2e8111e59a2b8c89a5e173c7', '访问协议', 'accessProtocol', '1', null, '20ed7bef2e8111e59a2b8c89a5e173c7', null, '13', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed889b2e8111e59a2b8c89a5e173c7', '', 'ftpip', '192.168.1.39', null, null, null, null, null, null);
INSERT INTO `t_sys_dict` VALUES ('20ed89b22e8111e59a2b8c89a5e173c7', '开启回收站', 'recycleBin', null, '是否直接删除还是放入回收站', '20ed7bef2e8111e59a2b8c89a5e173c7', null, '15', null, '1');
INSERT INTO `t_sys_dict` VALUES ('20ed8ac92e8111e59a2b8c89a5e173c7', '公司信息', 'companyInfo', null, '该网站的公司信息', '20ed7aa62e8111e59a2b8c89a5e173c7', null, '16', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed8bdd2e8111e59a2b8c89a5e173c7', '名称', 'companyName', '323333311', '公司名称', '20ed8ac92e8111e59a2b8c89a5e173c7', null, '17', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed8cf62e8111e59a2b8c89a5e173c7', '规模', 'companyScale', '3', null, '20ed8ac92e8111e59a2b8c89a5e173c7', null, '18', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed8e042e8111e59a2b8c89a5e173c7', '行业', 'companyIndustry', '1', null, '20ed8ac92e8111e59a2b8c89a5e173c7', null, '19', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed8f312e8111e59a2b8c89a5e173c7', '地址', 'companyAddress', '地址', null, '20ed8ac92e8111e59a2b8c89a5e173c7', null, '20', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed904d2e8111e59a2b8c89a5e173c7', '联系方式', 'companyContactway', '联系方式', null, '20ed8ac92e8111e59a2b8c89a5e173c7', null, '21', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed917b2e8111e59a2b8c89a5e173c7', '简介', 'companyIntro', '简介', null, '20ed8ac92e8111e59a2b8c89a5e173c7', null, '22', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed94182e8111e59a2b8c89a5e173c7', '企业LOGO', 'companyLOGO', '企业LOGO', null, '20ed8ac92e8111e59a2b8c89a5e173c7', null, '23', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed954b2e8111e59a2b8c89a5e173c7', '位置', 'companySite', '位置', null, '20ed8ac92e8111e59a2b8c89a5e173c7', null, '24', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed96682e8111e59a2b8c89a5e173c7', '全局配置', 'globalConfig', null, null, '20ed77942e8111e59a2b8c89a5e173c7', null, '25', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed977c2e8111e59a2b8c89a5e173c7', '登陆设置', 'loginSetting', null, null, '20ed96682e8111e59a2b8c89a5e173c7', null, '26', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed988d2e8111e59a2b8c89a5e173c7', '是否永久开启验证码', 'perpetualVCode', '0', null, '20ed977c2e8111e59a2b8c89a5e173c7', null, '27', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed99a02e8111e59a2b8c89a5e173c7', '错误次数开启验证码', 'errorCountVCode', '0', null, '20ed977c2e8111e59a2b8c89a5e173c7', null, '28', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed9afa2e8111e59a2b8c89a5e173c7', '登陆跳转页面设置', 'loginPageSetting', null, null, '20ed977c2e8111e59a2b8c89a5e173c7', null, '29', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed9c232e8111e59a2b8c89a5e173c7', '登陆错误时间', 'loginWrongTime', null, null, '20ed977c2e8111e59a2b8c89a5e173c7', null, '30', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed9d3e2e8111e59a2b8c89a5e173c7', '邮件服务器', 'mailServers', '55455@qq.com', null, '20ed977c2e8111e59a2b8c89a5e173c7', null, '31', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed9e582e8111e59a2b8c89a5e173c7', '用户名', 'mailUserName', 'testkt', null, '20ed977c2e8111e59a2b8c89a5e173c7', null, '32', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20ed9f602e8111e59a2b8c89a5e173c7', '密码', 'mailPassword', 'kklwekj', null, '20ed977c2e8111e59a2b8c89a5e173c7', null, '33', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20eda07b2e8111e59a2b8c89a5e173c7', '端口', 'mailPort', '8888', null, '20ed977c2e8111e59a2b8c89a5e173c7', null, '34', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20eda1972e8111e59a2b8c89a5e173c7', '找回密码标题', 'retrievePasswordTitle', '找回密码', null, '20ed977c2e8111e59a2b8c89a5e173c7', null, '35', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20eda2bf2e8111e59a2b8c89a5e173c7', '找回密码内容', 'retrievePasswordContent', '<html>找回密码</html>', null, '20ed977c2e8111e59a2b8c89a5e173c7', null, '36', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20eda40f2e8111e59a2b8c89a5e173c7', '会员注册标题', 'registTitle', '会员注册标题', null, '20ed977c2e8111e59a2b8c89a5e173c7', null, '37', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20eda5362e8111e59a2b8c89a5e173c7', '注册内容', 'registContent', '内容', '注册后发送的消息', '20ed977c2e8111e59a2b8c89a5e173c7', null, '38', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20eda6692e8111e59a2b8c89a5e173c7', '会员设置', 'memberSetting', null, null, '20ed96682e8111e59a2b8c89a5e173c7', null, '39', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20eda7762e8111e59a2b8c89a5e173c7', '是否开放会员功能', 'disparkMember', '1', null, '20eda6692e8111e59a2b8c89a5e173c7', null, '40', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20eda8842e8111e59a2b8c89a5e173c7', '是否开放注册', 'disparkRegist', '0', null, '20eda6692e8111e59a2b8c89a5e173c7', null, '41', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20eda9a52e8111e59a2b8c89a5e173c7', '注册审核', 'registAudit', '0', null, '20eda6692e8111e59a2b8c89a5e173c7', null, '42', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edaacc2e8111e59a2b8c89a5e173c7', '用户名最小长度', 'userNameLengthMin', '22', null, '20eda6692e8111e59a2b8c89a5e173c7', null, '43', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edabdf2e8111e59a2b8c89a5e173c7', '用户名最大长度', 'userNameLengthMax', null, null, '20eda6692e8111e59a2b8c89a5e173c7', null, '44', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edad0d2e8111e59a2b8c89a5e173c7', '用户头像宽高', 'userAvatarWH', '55,66', null, '20eda6692e8111e59a2b8c89a5e173c7', null, '45', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edae332e8111e59a2b8c89a5e173c7', '密码最小长度', 'passwordlengthMin', '6', null, '20eda6692e8111e59a2b8c89a5e173c7', null, '46', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edb1052e8111e59a2b8c89a5e173c7', '密码最大长度', 'passwordLengthMax', null, null, '20eda6692e8111e59a2b8c89a5e173c7', null, '47', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edb2252e8111e59a2b8c89a5e173c7', '用户名保留字', 'userNameRetention', 'admin', '用户名不能注册的名字', '20eda6692e8111e59a2b8c89a5e173c7', null, '48', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edb3412e8111e59a2b8c89a5e173c7', '水印设置', 'watermarkSetting', null, null, '20ed96682e8111e59a2b8c89a5e173c7', null, '49', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edb45c2e8111e59a2b8c89a5e173c7', '开启水印', 'watermarkOpen', '0', '是否开启水印', '20edb3412e8111e59a2b8c89a5e173c7', null, '50', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edb57b2e8111e59a2b8c89a5e173c7', '水印宽高', 'watermarkWH', '32,323', '水印宽高', '20edb3412e8111e59a2b8c89a5e173c7', null, '51', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edb6ae2e8111e59a2b8c89a5e173c7', '水印图片', 'watermarkImg', '0b9f793fe73a4f33a8682e4b495dd516.jpg', '添加水印的图片', '20edb3412e8111e59a2b8c89a5e173c7', null, '52', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edb7bd2e8111e59a2b8c89a5e173c7', '水印文字信息', 'watermarkText', '444rer', '水印文字', '20edb3412e8111e59a2b8c89a5e173c7', null, '53', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edb8ec2e8111e59a2b8c89a5e173c7', '颜色', 'watermarkColor', '55', null, '20edb3412e8111e59a2b8c89a5e173c7', null, '54', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edba032e8111e59a2b8c89a5e173c7', '透明度', 'watermarkLucid', '3232', null, '20edb3412e8111e59a2b8c89a5e173c7', null, '55', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edbb2c2e8111e59a2b8c89a5e173c7', '位置', 'watermarkLocate', '3', null, '20edb3412e8111e59a2b8c89a5e173c7', null, '56', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edbc562e8111e59a2b8c89a5e173c7', '水平偏移', 'watermarkHorizontalShift', null, null, '20edb3412e8111e59a2b8c89a5e173c7', null, '57', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edbd7e2e8111e59a2b8c89a5e173c7', '垂直偏移', 'VerticalOffset', null, null, '20edb3412e8111e59a2b8c89a5e173c7', null, '58', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edbe9b2e8111e59a2b8c89a5e173c7', '接口设置', 'portSetting', null, null, '20ed96682e8111e59a2b8c89a5e173c7', null, '59', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edbfa72e8111e59a2b8c89a5e173c7', 'QQ登陆', 'qqLogin', 'eweewe', null, '20edbe9b2e8111e59a2b8c89a5e173c7', null, '60', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edc0c12e8111e59a2b8c89a5e173c7', '微博登陆', 'microblogLogin', 'ewrrr2', null, '20edbe9b2e8111e59a2b8c89a5e173c7', null, '61', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edc1d82e8111e59a2b8c89a5e173c7', '微信登陆', 'weChatLogin', '32323', null, '20edbe9b2e8111e59a2b8c89a5e173c7', null, '62', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edc2e62e8111e59a2b8c89a5e173c7', '是否开放本站接口', 'webSitePort', '0', null, '20edbe9b2e8111e59a2b8c89a5e173c7', null, '63', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edc4012e8111e59a2b8c89a5e173c7', '是否开放地址名称', 'webSiteUrl', 'ewer2323', '对应接口URL', '20edbe9b2e8111e59a2b8c89a5e173c7', null, '64', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edc51c2e8111e59a2b8c89a5e173c7', '其他设置', 'otherSetting', null, null, '20ed96682e8111e59a2b8c89a5e173c7', null, '65', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edc6382e8111e59a2b8c89a5e173c7', '多少天定义为new', 'newDay', null, null, '20edc51c2e8111e59a2b8c89a5e173c7', null, '66', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edc7482e8111e59a2b8c89a5e173c7', 'new图片', 'newImg', null, null, '20edc51c2e8111e59a2b8c89a5e173c7', null, '67', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edc85e2e8111e59a2b8c89a5e173c7', '文章列表预览部分内容', 'articleListContent', null, null, '20edc51c2e8111e59a2b8c89a5e173c7', null, '68', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edcbe92e8111e59a2b8c89a5e173c7', '模型管理', 'modelManager', null, null, '20ed77942e8111e59a2b8c89a5e173c7', null, '71', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edcf0b2e8111e59a2b8c89a5e173c7', '广告管理', 'advertManager', null, null, '20ed77942e8111e59a2b8c89a5e173c7', null, '72', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edd03e2e8111e59a2b8c89a5e173c7', '首页轮播', 'flashview', null, null, '20edcf0b2e8111e59a2b8c89a5e173c7', null, '73', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edd1572e8111e59a2b8c89a5e173c7', '广告位管理', 'AdPositionIdManager', null, null, '20edcf0b2e8111e59a2b8c89a5e173c7', null, '74', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edd2812e8111e59a2b8c89a5e173c7', '其他设置', 'sysOtherSetting', null, null, '20ed77942e8111e59a2b8c89a5e173c7', null, '75', null, '0');
INSERT INTO `t_sys_dict` VALUES ('20edd3a32e8111e59a2b8c89a5e173c7', '友情链接', 'blogroll', null, null, '20ed77942e8111e59a2b8c89a5e173c7', null, '76', null, '0');
INSERT INTO `t_sys_dict` VALUES ('34b2abca3c1611e59a2b8c89a5e173c7', null, 'ftppwd', '123456', null, null, null, null, null, null);
INSERT INTO `t_sys_dict` VALUES ('b1794c6d39a411e59a2b8c89a5e173c7', '文章类型', 'articleType', null, null, 'f0daa37c39a411e59a2b8c89a5e173c7', null, null, null, '0');
INSERT INTO `t_sys_dict` VALUES ('b22bfeff3c1511e59a2b8c89a5e173c7', null, 'ftpusername', 'bjy', null, null, null, null, null, null);
INSERT INTO `t_sys_dict` VALUES ('b7f4fbef368f11e59a2b8c89a5e173c7', '水印类型', 'watermarkType', '1', null, '20edb3412e8111e59a2b8c89a5e173c7', null, null, null, '0');
INSERT INTO `t_sys_dict` VALUES ('c394bd1e39a411e59a2b8c89a5e173c7', '普通', 'generalArticle', null, null, 'b1794c6d39a411e59a2b8c89a5e173c7', null, null, null, '0');
INSERT INTO `t_sys_dict` VALUES ('c394c01939a411e59a2b8c89a5e173c7', '图文', 'graphicArticle', null, null, 'b1794c6d39a411e59a2b8c89a5e173c7', null, null, null, '0');
INSERT INTO `t_sys_dict` VALUES ('c394c16f39a411e59a2b8c89a5e173c7', '焦点', 'focusArticle', null, null, 'b1794c6d39a411e59a2b8c89a5e173c7', null, null, null, '0');
INSERT INTO `t_sys_dict` VALUES ('c394c2a939a411e59a2b8c89a5e173c7', '头条', 'headlinesArticle', null, null, 'b1794c6d39a411e59a2b8c89a5e173c7', null, null, null, '0');
INSERT INTO `t_sys_dict` VALUES ('c394c3d039a411e59a2b8c89a5e173c7', '推荐', 'recommendArticle', null, null, 'b1794c6d39a411e59a2b8c89a5e173c7', null, null, null, '0');
INSERT INTO `t_sys_dict` VALUES ('c394c4f539a411e59a2b8c89a5e173c7', '草稿', 'draftArticle', null, null, 'b1794c6d39a411e59a2b8c89a5e173c7', null, null, null, '0');
INSERT INTO `t_sys_dict` VALUES ('c394c60b39a411e59a2b8c89a5e173c7', '幻灯', 'slideArticle', null, null, 'b1794c6d39a411e59a2b8c89a5e173c7', null, null, null, '0');
INSERT INTO `t_sys_dict` VALUES ('d3adcb86344011e59a2b8c89a5e173c7', '公司性质', 'companyProperty', '1', null, '20ed8ac92e8111e59a2b8c89a5e173c7', null, null, null, '0');
INSERT INTO `t_sys_dict` VALUES ('ecb5a69b369311e59a2b8c89a5e173c7', '水印字体大小', 'watermarkFontSize', '12', null, '20edb3412e8111e59a2b8c89a5e173c7', null, null, null, '0');
INSERT INTO `t_sys_dict` VALUES ('f0daa37c39a411e59a2b8c89a5e173c7', '文章管理', 'articleManage', null, null, null, null, null, null, '0');

-- ----------------------------
-- Table structure for t_sys_link
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_link`;
CREATE TABLE `t_sys_link` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `url` varchar(512) NOT NULL COMMENT '链接',
  `logoURL` varchar(512) DEFAULT NULL COMMENT '链接logo',
  `name` varchar(50) NOT NULL COMMENT '展示名称',
  `rank` int(11) NOT NULL COMMENT '排序 越大越靠后',
  `status` int(1) NOT NULL COMMENT '状态 1 显示 0 隐藏',
  `decription` varchar(512) DEFAULT NULL COMMENT '备注',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='友情链接';

-- ----------------------------
-- Records of t_sys_link
-- ----------------------------
INSERT INTO `t_sys_link` VALUES ('1', 'other/1439609487277.jpg', 'www.baidu.com1', '11', '1', '0', null, '2015-08-15 11:04:36');

-- ----------------------------
-- Table structure for t_sys_message
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_message`;
CREATE TABLE `t_sys_message` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` int(1) NOT NULL COMMENT '0:留言 1：投诉',
  `content` varchar(4096) NOT NULL COMMENT '内容',
  `createTime` datetime NOT NULL COMMENT '发表时间',
  `userId` bigint(20) NOT NULL COMMENT '用户id，如果不是注册用户就为0',
  `nickName` varchar(50) DEFAULT NULL COMMENT '如果不是注册用户：发表人昵称',
  `email` varchar(50) DEFAULT NULL COMMENT '如果不是注册用户：联系邮箱',
  `phone` varchar(20) DEFAULT NULL COMMENT '如果不是注册用户：联系电话',
  `status` int(1) NOT NULL DEFAULT '0' COMMENT '0:未处理，1：已处理',
  `returnContent` varchar(2048) DEFAULT NULL COMMENT '回复内容',
  `returnUserKey` varchar(32) DEFAULT NULL COMMENT '回复的用户',
  `returnTime` datetime DEFAULT NULL COMMENT '回复时间',
  `isShowReturn` int(1) DEFAULT NULL COMMENT '回复后是否显示给所有人看 0显示 1仅显示给发起人 2不显示',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='留言,投诉';

-- ----------------------------
-- Records of t_sys_message
-- ----------------------------

-- ----------------------------
-- Table structure for t_sys_resource
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_resource`;
CREATE TABLE `t_sys_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nameCn` varchar(255) NOT NULL COMMENT '名称',
  `nameEn` varchar(255) DEFAULT NULL COMMENT '英文名称',
  `code` varchar(20) DEFAULT NULL COMMENT '代码代号,英文',
  `url` varchar(512) DEFAULT NULL,
  `parentid` int(11) NOT NULL COMMENT '父id',
  `description` varchar(255) DEFAULT NULL COMMENT '备注',
  `status` int(1) DEFAULT NULL COMMENT '状态,0显示1不显示2禁用3草稿',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `templateid` bigint(20) DEFAULT NULL COMMENT '模板ID',
  `metaTitle` varchar(512) DEFAULT NULL COMMENT 'meta标题',
  `metaKeyWord` varchar(2048) DEFAULT NULL COMMENT 'meta关键字',
  `metaDescrption` varchar(2048) DEFAULT NULL COMMENT 'meta描述',
  `rank` int(11) DEFAULT NULL COMMENT '排序',
  `isNewWindowsOpen` int(1) DEFAULT NULL COMMENT '是否新窗口打开',
  `isDigg` int(1) DEFAULT NULL COMMENT '是否可以点赞',
  `isShare` int(1) DEFAULT NULL COMMENT '是否可以分享',
  `isComment` int(1) DEFAULT NULL COMMENT '是否可以评论',
  `browerPermission` int(1) DEFAULT NULL COMMENT '浏览权限, 开或关, 关联互权限表',
  `extraUrl` varchar(512) DEFAULT NULL COMMENT '外部地址',
  `picUrl` varchar(512) DEFAULT NULL COMMENT '小图片地址(主要用于标题)',
  `pidHDUrl` varchar(512) DEFAULT NULL COMMENT '高清图地址(主要用于内容等大图)',
  `operationAfterVerify` int(1) DEFAULT NULL COMMENT '审核后的操作0 不能修改删除, 1 修改后退回, 2修改后不变',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8 COMMENT='资源,如栏目,菜单,导航等 主要为导航管理';

-- ----------------------------
-- Records of t_sys_resource
-- ----------------------------
INSERT INTO `t_sys_resource` VALUES ('1', '的', 's', 's', '', '1', '', '0', '2015-08-21 09:15:15', null, '', '', '', null, '0', '0', '0', '0', null, '', null, null, null);
INSERT INTO `t_sys_resource` VALUES ('6', '保洁承包', 'cleaningcontractors', 'cleaningcontractors', '/web/product/productList.html', '0', '', '0', '2015-08-21 09:15:19', null, '保洁承包', '保洁承包', '保洁承包', '5', '0', '0', '0', '0', null, '', null, null, null);
INSERT INTO `t_sys_resource` VALUES ('7', '解决方案', 'solution', 'solution', '/web/product/toSolutions.html', '0', '', '0', '2015-08-21 09:15:22', null, '解决方案', '解决方案', '解决方案', '6', '0', '0', '0', '0', null, '', null, null, null);
INSERT INTO `t_sys_resource` VALUES ('8', '客户名录', 'customerlist', 'customerlist', '', '0', '', '0', '2015-08-21 09:15:25', null, '客户名录', '客户名录', '客户名录', '7', '0', '0', '0', '0', null, '', null, null, null);
INSERT INTO `t_sys_resource` VALUES ('11', '合作品牌', null, '', null, '1', null, '0', '2015-08-10 15:29:16', null, null, null, null, '0', null, null, null, null, null, null, null, null, null);
INSERT INTO `t_sys_resource` VALUES ('12', '新闻中心', '', null, '/admin/navigatebar/toNavigateBarIndex.html', '1', '', '0', '2015-08-20 15:51:43', null, '', '', '', '0', '0', '0', '0', '0', null, '', null, null, null);
INSERT INTO `t_sys_resource` VALUES ('56', '企业概况', 'Company Profile', 'companyprofile', '/web/article/toContentPage.html', '0', '网站公司描述', '0', '2015-08-21 09:15:29', null, '企业概况', '企业概况', '网站公司描述', '1', '0', '0', '0', '0', null, '', null, null, null);
INSERT INTO `t_sys_resource` VALUES ('57', '清洁设备', 'Cleaning Equipment', 'cleaningequipment', '/web/product/productList.html', '0', '', '0', '2015-08-21 09:15:32', null, '清洁设备', '清洁设备', '清洁设备的产品', '2', '0', '0', '0', '0', null, '', null, null, null);
INSERT INTO `t_sys_resource` VALUES ('58', '安全防护', 'Security', 'protectionProduct', '/web/product/productList.html', '0', '', '0', '2015-08-20 17:46:18', null, '安全防护', '安全防护', '安全防护', '3', '0', '0', '0', '0', null, '', null, null, null);
INSERT INTO `t_sys_resource` VALUES ('59', '工业吸尘器', 'industrialcacuum', 'industrialcacuum', '/web/product/productList.html', '0', '', '0', '2015-08-20 17:47:02', null, '工业吸尘器', '工业吸尘器', '工业吸尘器', '4', '0', '0', '0', '0', null, '', null, null, null);
INSERT INTO `t_sys_resource` VALUES ('60', '租赁服务', 'rentalservice', 'rentalservice', '/web/product/productList.html', '0', '', '0', '2015-08-20 17:48:29', null, '租赁服务', '租赁服务', '租赁服务', '4', '0', '0', '0', '0', null, '', null, null, null);
INSERT INTO `t_sys_resource` VALUES ('61', '公司介绍', 'companyprofile', 'companyprofile', '/web/article/toContentPage.html', '56', '', '0', '2015-08-21 09:18:39', null, '公司介绍', '公司介绍', '公司介绍', '1', '0', '0', '0', '0', null, '', null, null, null);
INSERT INTO `t_sys_resource` VALUES ('62', '公司文化', 'companyculture', 'companyculture', '/web/article/toContentPage.html', '56', '', '0', '2015-08-21 09:19:04', null, '公司文化', '公司文化', '公司文化', '2', '0', '0', '0', '0', null, '', null, null, null);
INSERT INTO `t_sys_resource` VALUES ('63', '合作品牌', 'cooperationbrand', 'cooperationbrand', '/web/article/toContentPage.html', '56', '', '0', '2015-08-21 09:19:33', null, '合作品牌', '合作品牌', '合作品牌', '3', '0', '0', '0', '0', null, '', null, null, null);
INSERT INTO `t_sys_resource` VALUES ('64', '新闻中心', 'newscenter', 'newscenter', '', '56', '', '0', '2015-08-21 09:19:58', null, '新闻中心', '新闻中心', '新闻中心', '4', '0', '0', '0', '0', null, '', null, null, null);

-- ----------------------------
-- Table structure for t_template
-- ----------------------------
DROP TABLE IF EXISTS `t_template`;
CREATE TABLE `t_template` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `name` varchar(255) NOT NULL COMMENT '模板名称',
  `content` text NOT NULL COMMENT '模板类容',
  `classId` int(11) DEFAULT NULL COMMENT '模板Id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='模板';

-- ----------------------------
-- Records of t_template
-- ----------------------------
INSERT INTO `t_template` VALUES ('1', '', '', null);

-- ----------------------------
-- Table structure for t_template_class
-- ----------------------------
DROP TABLE IF EXISTS `t_template_class`;
CREATE TABLE `t_template_class` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `name` text NOT NULL COMMENT '分类名称 比如：短信模板，邮件模板',
  `status` int(1) NOT NULL COMMENT '状态',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模板分类';

-- ----------------------------
-- Records of t_template_class
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户自增长ID',
  `uuid` varchar(32) DEFAULT NULL COMMENT '用户KEY, UUID 用户交流使用UUID',
  `userName` varchar(32) DEFAULT NULL COMMENT '用户名',
  `password` varchar(32) DEFAULT NULL COMMENT '密码,采用MD5加密',
  `phone` varchar(16) DEFAULT NULL COMMENT '手机号',
  `email` varchar(64) DEFAULT NULL COMMENT '邮箱',
  `lastLoginTime` datetime DEFAULT NULL COMMENT '登陆次数',
  `createTime` datetime DEFAULT NULL COMMENT '登陆时间,即注册时间, 此表数据不可删除,只可作废',
  `createUser` varchar(32) DEFAULT NULL COMMENT '创建者, 自注册用户为空',
  `isDelete` int(1) DEFAULT NULL COMMENT '删除 0正常1删除',
  `loginCount` int(11) DEFAULT NULL,
  `isAdmin` bit(1) DEFAULT NULL COMMENT '是否管理员账号 0 否 1是',
  `status` int(11) DEFAULT NULL COMMENT '状态 0或空正常,1禁用 2永久冻结 3时间冻结 4临时帐号(时间段)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='通用用户用, 分严格角色等级, 系统管理员, 管理员, 用户';

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'e12123132123123132132132132132', 'admin', 'dc483e80a7a0bd9ef71d8cf973673924', '15203652369', '532623596@qq.com', '2015-08-21 17:17:17', '2015-07-07 14:17:42', null, null, '1359', '', '0');
INSERT INTO `t_user` VALUES ('2', '1fe6a64e2a264bf9bc22b4ef5e987ced', 'aaa', 'dc483e80a7a0bd9ef71d8cf973673924', '3332323', 'dsds@qq.com', '2015-08-21 16:49:58', null, null, null, '20', '', '0');
INSERT INTO `t_user` VALUES ('4', '95d13a161ac94f7882a2165cfa2eefa6', 'abc44', 'dc483e80a7a0bd9ef71d8cf973673924', '1335474884322', 'abac@qq.com', '2015-08-18 15:58:36', '2015-08-03 16:34:06', 'e12123132123123132132132132132', null, '2', '\0', '1');
INSERT INTO `t_user` VALUES ('5', '042f77c7f6ee4dc5b848956da66a77e1', 'admmm', 'dc483e80a7a0bd9ef71d8cf973673924', '155645', '11245@qq.com', null, '2015-08-13 11:13:36', 'e12123132123123132132132132132', null, '0', '\0', null);
INSERT INTO `t_user` VALUES ('6', 'd3858c42bea34913826f49c94b5ba084', 'ddd', 'dc483e80a7a0bd9ef71d8cf973673924', '1555646666', '4444@qq.com', null, '2015-08-13 11:21:38', 'e12123132123123132132132132132', null, '0', '\0', null);
INSERT INTO `t_user` VALUES ('7', 'b6f0e320108a40d283926c90363d8cd3', '11111', '6b10bd53feb317a221abb27b54bd8150', '11111', '11111', '2015-08-21 09:10:24', '1970-01-01 08:00:00', null, '0', '4', null, null);
INSERT INTO `t_user` VALUES ('10', 'd7b6b6fca49a4019a2a2ae8a4cf290cf', '用户名/手机号/邮箱', '5690dddfa28ae085d23518a035707282', 'qw', 'wewq', '2015-08-18 11:16:38', '1970-01-01 08:00:00', null, '0', '1', null, null);
INSERT INTO `t_user` VALUES ('12', 'dc71e0211c204fc884921a93a51ca980', 'bbb', 'dc483e80a7a0bd9ef71d8cf973673924', '12345678910', '10@qq.com', null, '2015-08-18 15:42:48', '1fe6a64e2a264bf9bc22b4ef5e987ced', null, '0', '\0', null);
INSERT INTO `t_user` VALUES ('13', 'b4545c9236a14910bc7bb57b768c2e93', '用户名/手机号/邮箱', 'fc490ca45c00b1249bbe3554a4fdf6fb', '56', '56', null, '1970-01-01 08:00:00', null, '0', null, null, null);
INSERT INTO `t_user` VALUES ('14', '916a5dc872d24c15a1d3f20fe6121bb5', '用户名/手机号/邮箱', 'fc490ca45c00b1249bbe3554a4fdf6fb', '56', '56', null, '1970-01-01 08:00:00', null, '0', null, null, null);
INSERT INTO `t_user` VALUES ('15', '1e0059e596ae41c3b89c20afb6eb7553', '用户名/手机号/邮箱', 'fc490ca45c00b1249bbe3554a4fdf6fb', '56', '56', null, '1970-01-01 08:00:00', null, '0', null, null, null);
INSERT INTO `t_user` VALUES ('16', '4c9a3822c55d4ac98756164d32bc9407', '用户名/手机号/邮箱', 'fc490ca45c00b1249bbe3554a4fdf6fb', '56', '56', null, '1970-01-01 08:00:00', null, '0', null, null, null);
INSERT INTO `t_user` VALUES ('17', 'ebed764fd8fd4c038a4cd99f152de059', 'qqq', 'dc483e80a7a0bd9ef71d8cf973673924', '12345678910', '1293456@qq.com', null, '2015-08-20 09:58:14', 'e12123132123123132132132132132', null, '0', '', '0');
INSERT INTO `t_user` VALUES ('18', 'dea6be4540794627869ef40c0f63292c', '用户名/手机号/邮箱', '67cec38b7231939572b8f4caef60be46', '', '', null, '1970-01-01 08:00:00', null, '0', null, null, null);

-- ----------------------------
-- Table structure for t_user_address
-- ----------------------------
DROP TABLE IF EXISTS `t_user_address`;
CREATE TABLE `t_user_address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `country` varchar(50) NOT NULL COMMENT '国家',
  `province` varchar(50) NOT NULL COMMENT '省',
  `city` varchar(50) NOT NULL COMMENT '市',
  `districts` varchar(50) NOT NULL COMMENT '区县',
  `address` varchar(255) NOT NULL COMMENT '具体地址',
  `isDefault` int(1) NOT NULL COMMENT '是否是默认地址：1：是 0 否',
  `userkey` varchar(32) NOT NULL COMMENT '所属用户Id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户的不同地址,';

-- ----------------------------
-- Records of t_user_address
-- ----------------------------

-- ----------------------------
-- Table structure for t_user_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_user_customer`;
CREATE TABLE `t_user_customer` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '自增长id',
  `title` varchar(32) DEFAULT NULL COMMENT '标题',
  `logo` varchar(128) DEFAULT NULL COMMENT 'logo',
  `url` varchar(128) DEFAULT NULL COMMENT '链接地址',
  `isshow` int(1) DEFAULT NULL COMMENT '是否展示1显示0不显示',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COMMENT='客服名录';

-- ----------------------------
-- Records of t_user_customer
-- ----------------------------
INSERT INTO `t_user_customer` VALUES ('8', '测试5', 'other/8b0f2f9abf2b45f4a470c5a20ad5b667/1439453931402.bmp', 'www.weather.com.cn', '0', '2015-08-13 16:19:23');
INSERT INTO `t_user_customer` VALUES ('9', '测试6', 'other/16499bce8f3c40249e95331a6cbbdc0f/1439454011240.bmp', 'www.autohome.com.cn', '1', '2015-08-13 16:20:33');
INSERT INTO `t_user_customer` VALUES ('10', '测试7', 'other/e577b8580f5544e2852e585fb499e3fb/1439454097082.bmp', 'www.weather.com.cn', '0', '2015-08-13 16:21:59');
INSERT INTO `t_user_customer` VALUES ('22', '测试', '', '1111', '1', '2015-08-17 16:41:39');
INSERT INTO `t_user_customer` VALUES ('23', '添加测试', '', 'www.baidu.com', '1', '2015-08-17 16:42:29');
INSERT INTO `t_user_customer` VALUES ('27', '1', '', '若', '1', '2015-08-21 10:57:38');
INSERT INTO `t_user_customer` VALUES ('28', '1', '', '1', '1', '2015-08-21 10:59:22');
INSERT INTO `t_user_customer` VALUES ('29', '的', '', '', '1', '2015-08-21 15:53:51');

-- ----------------------------
-- Table structure for t_user_detail
-- ----------------------------
DROP TABLE IF EXISTS `t_user_detail`;
CREATE TABLE `t_user_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userkey` varchar(32) NOT NULL COMMENT '用户KEY,作为主要使用',
  `nameEn` varchar(32) DEFAULT NULL COMMENT '中文名',
  `nameCn` varchar(32) DEFAULT NULL COMMENT '英文名',
  `bith` datetime DEFAULT NULL COMMENT '生日',
  `age` int(2) DEFAULT NULL COMMENT '年龄',
  `gender` int(1) DEFAULT NULL COMMENT '性别',
  `position` varchar(32) DEFAULT NULL COMMENT '职位,字典表中取',
  `orgid` int(11) DEFAULT NULL COMMENT '组织ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `createUser` varchar(32) DEFAULT NULL COMMENT '创建者',
  `usergroupid` bigint(20) DEFAULT NULL COMMENT '用户组ID',
  `qq` varchar(50) DEFAULT NULL COMMENT 'QQ',
  `address` varchar(512) DEFAULT NULL COMMENT '地址',
  `description` varchar(1024) DEFAULT NULL COMMENT '介绍',
  `interest` varchar(2048) DEFAULT NULL COMMENT '兴趣,才开始使用分隔',
  PRIMARY KEY (`id`,`userkey`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='用户详情, 用户可能会自己添加或删除相应的系统,系统字段不可删除  ';

-- ----------------------------
-- Records of t_user_detail
-- ----------------------------
INSERT INTO `t_user_detail` VALUES ('1', 'de04da8dd4c149eeb2044ec155069755', '323', null, '2015-07-15 08:00:00', null, '0', null, null, null, null, null, '3232323', 'eeee', '3ewew', 'wewrewr');
INSERT INTO `t_user_detail` VALUES ('2', '9da239a15a85465b8b1c5f75258d0339', '323', null, '2015-07-15 08:00:00', null, '0', null, null, null, null, null, '3232323', 'eeee', '3ewew', 'wewrewr');
INSERT INTO `t_user_detail` VALUES ('3', '1fe6a64e2a264bf9bc22b4ef5e987ced', 'eee', null, '2015-07-31 08:00:00', null, '0', null, null, null, null, null, '3232', '323ewe', 'ewewe', '323232');
INSERT INTO `t_user_detail` VALUES ('4', '9719fcc82637439db5ca63c5710648ff', 'sd', null, null, null, '1', null, null, null, null, null, '3232323', 'ds', null, 'dsds');
INSERT INTO `t_user_detail` VALUES ('5', '95d13a161ac94f7882a2165cfa2eefa6', 'abc', null, '2011-08-10 08:00:00', null, '0', null, null, null, null, null, '553354445', 'abcdkkkk', null, 'eeeee');
INSERT INTO `t_user_detail` VALUES ('6', 'e12123132123123132132132132132', 'adminsssss', '超级管理员123', '2015-08-02 08:00:00', null, '0', null, null, null, null, null, '28773847', '重庆。。。。', 'eeeeeeeeeeeeeeee', 'dasfdsasd');
INSERT INTO `t_user_detail` VALUES ('7', '042f77c7f6ee4dc5b848956da66a77e1', '张三', null, null, null, '0', null, null, null, null, null, null, null, null, null);
INSERT INTO `t_user_detail` VALUES ('8', 'd3858c42bea34913826f49c94b5ba084', 'ddww', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_user_detail` VALUES ('9', 'dc71e0211c204fc884921a93a51ca980', 'mlj', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_user_detail` VALUES ('10', 'ebed764fd8fd4c038a4cd99f152de059', null, null, null, null, '1', null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for t_user_group
-- ----------------------------
DROP TABLE IF EXISTS `t_user_group`;
CREATE TABLE `t_user_group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nameCn` varchar(32) DEFAULT NULL COMMENT '角色名',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父ID',
  `maxAttachment` int(11) DEFAULT NULL COMMENT '每日上传附件最大尺寸',
  `maxAttachmentAll` int(11) DEFAULT NULL COMMENT '总上传附件尺寸',
  `allowSuffix` varchar(512) DEFAULT NULL COMMENT '允许上传后缀',
  `canComment` int(1) DEFAULT NULL COMMENT '是否允许评论',
  `isShowCommentVerify` int(1) DEFAULT NULL COMMENT '是否显示评论验证码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员组, 用以区分哪些会员';

-- ----------------------------
-- Records of t_user_group
-- ----------------------------

-- ----------------------------
-- Table structure for t_user_message
-- ----------------------------
DROP TABLE IF EXISTS `t_user_message`;
CREATE TABLE `t_user_message` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `fromUserId` varchar(32) NOT NULL COMMENT '发送方',
  `toUserId` varchar(32) NOT NULL COMMENT '接收方',
  `content` text NOT NULL COMMENT '内容 xml',
  `status` int(1) NOT NULL COMMENT '消息状态, 字典表, 0未回复 1已回复 ',
  `createTime` datetime NOT NULL COMMENT '发送时间',
  `isSee` int(1) NOT NULL COMMENT '是否查看',
  `title` varchar(1024) DEFAULT NULL,
  `fromId` bigint(20) DEFAULT NULL COMMENT '回复的记录ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='用户交流信息，站内信';

-- ----------------------------
-- Records of t_user_message
-- ----------------------------
INSERT INTO `t_user_message` VALUES ('37', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', 'dsfsdf', '0', '2015-08-20 09:36:30', '1', 'fdsfdcf', null);
INSERT INTO `t_user_message` VALUES ('38', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', 'asfsewdfc', '0', '2015-08-20 09:53:52', '1', 'sdqwaedfc', null);
INSERT INTO `t_user_message` VALUES ('48', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '哈哈', '0', '2015-08-20 10:04:49', '1', '山东五千三', '43');
INSERT INTO `t_user_message` VALUES ('49', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '的', '0', '2015-08-20 10:05:18', '1', '等等', '44');
INSERT INTO `t_user_message` VALUES ('52', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '地方的人', '0', '2015-08-20 11:08:01', '1', 'gfvr', '51');
INSERT INTO `t_user_message` VALUES ('53', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '个人', '0', '2015-08-20 11:09:03', '1', 'ty', '51');
INSERT INTO `t_user_message` VALUES ('55', 'e12123132123123132132132132132', 'e12123132123123132132132132132', '22222222222222222222222', '1', '2015-08-20 11:26:10', '1', '22222222222222222222222222', '53');
INSERT INTO `t_user_message` VALUES ('60', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '发到wee', '0', '2015-08-20 11:50:04', '1', '东方热电', '55');
INSERT INTO `t_user_message` VALUES ('62', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '但是', '1', '2015-08-20 11:56:12', '1', '是的', '56');
INSERT INTO `t_user_message` VALUES ('63', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '发工人房', '0', '2015-08-20 12:05:56', '1', 'rtr', '56');
INSERT INTO `t_user_message` VALUES ('64', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '费GV', '1', '2015-08-20 12:16:51', '1', 'vcv', '56');
INSERT INTO `t_user_message` VALUES ('65', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '个', '0', '2015-08-20 12:19:41', '1', '而非人', '55');
INSERT INTO `t_user_message` VALUES ('66', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '的地方人', '0', '2015-08-20 13:39:19', '1', '国办发', '56');
INSERT INTO `t_user_message` VALUES ('67', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '地方', '0', '2015-08-20 13:41:28', '1', '地方', '56');
INSERT INTO `t_user_message` VALUES ('68', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '发到', '0', '2015-08-20 13:48:41', '1', '赋给', '56');
INSERT INTO `t_user_message` VALUES ('69', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '人', '0', '2015-08-20 13:48:52', '1', '如图', '54');
INSERT INTO `t_user_message` VALUES ('70', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', 'dscfds', '0', '2015-08-21 14:50:49', '1', 'dsf', '55');
INSERT INTO `t_user_message` VALUES ('71', '1fe6a64e2a264bf9bc22b4ef5e987ced', '1fe6a64e2a264bf9bc22b4ef5e987ced', '啊啊啊', '1', '2015-08-21 16:22:00', '1', '啊啊啊', null);
INSERT INTO `t_user_message` VALUES ('72', 'e12123132123123132132132132132', 'e12123132123123132132132132132', 'bbbb', '1', '2015-08-21 16:25:17', '1', 'bbb', '71');
INSERT INTO `t_user_message` VALUES ('73', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '阿斯顿飞才是', '0', '2015-08-21 16:27:41', '0', 'dfds', '72');
INSERT INTO `t_user_message` VALUES ('74', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '地方', '0', '2015-08-21 16:27:54', '0', '地方', null);
INSERT INTO `t_user_message` VALUES ('75', 'e12123132123123132132132132132', 'e12123132123123132132132132132', 'zxzX', '1', '2015-08-21 16:28:41', '1', 'zxzx', null);
INSERT INTO `t_user_message` VALUES ('76', 'e12123132123123132132132132132', '1fe6a64e2a264bf9bc22b4ef5e987ced', '个地方都是', '0', '2015-08-21 16:28:59', '0', 'fgf', '75');

-- ----------------------------
-- Table structure for t_user_org
-- ----------------------------
DROP TABLE IF EXISTS `t_user_org`;
CREATE TABLE `t_user_org` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `nameCn` varchar(32) DEFAULT NULL,
  `parentid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='组织机构';

-- ----------------------------
-- Records of t_user_org
-- ----------------------------

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userdetailid` bigint(20) DEFAULT NULL,
  `roleid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_1` (`userdetailid`),
  KEY `FK_Reference_2` (`roleid`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`roleid`) REFERENCES `t_role` (`id`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`userdetailid`) REFERENCES `t_user_detail` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色,中间表';

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
