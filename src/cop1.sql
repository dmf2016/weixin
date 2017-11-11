/*
Navicat Oracle Data Transfer
Oracle Client Version : 11.2.0.1.0

Source Server         : dsew
Source Server Version : 110200
Source Host           : 10.0.30.113:1521
Source Schema         : COP

Target Server Type    : MYSQL
Target Server Version : 50099
File Encoding         : 65001

Date: 2017-11-10 11:45:31
*/


-- ----------------------------
-- Table structure for DEMO_TABLE
-- ----------------------------
DROP TABLE IF EXISTS `DEMO_TABLE`;
CREATE TABLE `DEMO_TABLE` (
`ID`  varchar(32) NULL ,
`NAME`  varchar(100) NULL 
)

;

-- ----------------------------
-- Records of DEMO_TABLE
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for E9NET_APP
-- ----------------------------
DROP TABLE IF EXISTS `E9NET_APP`;
CREATE TABLE `E9NET_APP` (
`ID`  decimal(18,0) NOT NULL COMMENT '应用id' ,
`USER_ID`  decimal(18,0) NULL COMMENT '用户id' ,
`APP_NAME`  varchar(100) NULL COMMENT '应用名称' ,
`SMS_TYPE`  varchar(50) NULL COMMENT '短信类型：多个用逗号隔开。' ,
`SIGN_FLAG`  decimal(5,0) NULL COMMENT '是否需要签名：1要签名; 2不要签名 ' ,
`SIGN_CH`  varchar(30) NULL COMMENT '中文签名' ,
`SIGN_EN`  varchar(30) NULL COMMENT '英文签名' ,
`SIGN_STATUS`  decimal(5,0) NULL COMMENT '签名状态：1未配置、2审核中、3审核通过、4审核不通过' ,
`STATUS`  decimal(5,0) NULL COMMENT '应用状态：0上线中,1停用,-1表示删除' ,
`REMARKS`  text NULL COMMENT '备注' ,
PRIMARY KEY (`ID`)
)
COMMENT='应用表'

;

-- ----------------------------
-- Records of E9NET_APP
-- ----------------------------
BEGIN;
INSERT INTO `E9NET_APP` VALUES ('1', null, '4444', 'on', '1', null, null, null, '-1', '4444'), ('2', null, '33', '1,2', '2', null, null, '1', '0', '333'), ('6', null, '888', '2,3', '1', '4444', null, '3', '0', '44444'), ('14', '44', '44444', null, null, null, null, '1', '0', '44444'), ('7', null, 'QQ应用', '1,3', '2', '111', null, '3', '1', '1111'), ('9', null, '4444', '1', '1', 'ttt', null, '3', '0', 'tttt'), ('3', null, '666666', '1,2', '1', null, null, '1', '-1', '66666'), ('4', null, '666666', '1', '2', null, null, '1', '-1', '66666'), ('5', null, '666666', '1,3', '1', null, null, '1', '0', '66666'), ('8', null, 'ffff', '1,3', '1', null, null, '1', '0', 'ffff'), ('10', '44', '444', '1', '1', 'ffff', null, '3', '0', '88888'), ('11', '44', '7777', '1,3', '1', '[][][][][[][][[', null, '3', '0', '33333'), ('12', '44', '8888888', '1,3', '1', 'uuuuuuu', null, '3', '-1', null), ('13', '44', '555555', '1,3', '2', '555', null, '3', '0', '555');
COMMIT;

-- ----------------------------
-- Table structure for E9NET_OPERATE_LOG
-- ----------------------------
DROP TABLE IF EXISTS `E9NET_OPERATE_LOG`;
CREATE TABLE `E9NET_OPERATE_LOG` (
`ID`  decimal(18,0) NOT NULL COMMENT '主键id' ,
`USER_ID`  decimal(18,0) NOT NULL COMMENT '用户id' ,
`DO_OBJECT`  varchar(100) NULL COMMENT '被操作对象' ,
`CONTENT`  text NULL COMMENT '内容' ,
`OPERATE_TIME`  datetime NULL COMMENT '创建时间' ,
PRIMARY KEY (`ID`)
)
COMMENT='操作日志表'

;

-- ----------------------------
-- Records of E9NET_OPERATE_LOG
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for E9NET_TEMPLATE
-- ----------------------------
DROP TABLE IF EXISTS `E9NET_TEMPLATE`;
CREATE TABLE `E9NET_TEMPLATE` (
`ID`  decimal(18,0) NOT NULL COMMENT '模板编号' ,
`APP_ID`  decimal(18,0) NOT NULL COMMENT '应用ID' ,
`NAME`  varchar(200) NULL COMMENT '模板名称' ,
`CONTENT`  text NULL COMMENT '模板内容' ,
`TEMPLATE_TYPE`  decimal(5,0) NULL COMMENT '模板类型,0：全部;1：短信;2：语音；3：语音验证码' ,
`SMS_TYPE`  decimal(5,0) NULL COMMENT '短信类型：1验证码短信、2通知短信、3推广短信。单选。' ,
`CHECK_USER`  varchar(100) NULL COMMENT '审批人' ,
`CHECK_ORIGIN`  text NULL COMMENT '审核不通过原因' ,
`STATUS`  decimal(5,0) NULL COMMENT '状态：0在线中，1停用，2待审核，3审核通过，4审核不通过,-1删除' ,
`CREATE_TIME`  datetime NULL COMMENT '创建时间' ,
`UPDATE_TIME`  datetime NULL COMMENT '最近更新时间' ,
`REMARK`  text NULL COMMENT '备注' ,
`PRIORITY`  decimal(5,0) NULL COMMENT '模板优先级，1为有优先级，2为没有优先级' ,
PRIMARY KEY (`ID`)
)
COMMENT='短信模板表'

;

-- ----------------------------
-- Records of E9NET_TEMPLATE
-- ----------------------------
BEGIN;
INSERT INTO `E9NET_TEMPLATE` VALUES ('2', '2', null, null, null, null, null, null, '0', null, null, null, null), ('3', '2', null, null, null, null, null, null, '0', null, null, null, null), ('4', '2', '4444444', null, null, null, null, null, '0', null, null, null, null), ('5', '2', '4444444', null, '1', null, null, null, '0', '2017-09-13 00:00:00', '2017-09-13 00:00:00', null, null), ('6', '2', '5434565433456', null, null, null, null, null, '0', '2017-09-13 00:00:00', '2017-09-13 00:00:00', null, null), ('7', '2', 'rr', 'rrrrrr', null, '1', null, null, '0', '2017-09-13 00:00:00', '2017-09-13 00:00:00', null, null), ('8', '2', null, null, null, '1', null, null, '0', '2017-09-13 00:00:00', '2017-09-13 00:00:00', null, null), ('9', '6', 'uuuu', 'uuuuuuuuuu', null, '2', null, null, '0', '2017-09-14 00:00:00', '2017-09-14 00:00:00', null, null);
COMMIT;

-- ----------------------------
-- Table structure for E9NET_USER_RENEW_LOG
-- ----------------------------
DROP TABLE IF EXISTS `E9NET_USER_RENEW_LOG`;
CREATE TABLE `E9NET_USER_RENEW_LOG` (
`ID`  decimal(18,0) NOT NULL COMMENT '订单号(主键ID)' ,
`USER_ID`  decimal(18,0) NOT NULL COMMENT '用户表ID' ,
`ACCOUNT_TYPE`  decimal(5,0) NULL COMMENT '续费类型：1已收款；2赠送；10系统退费；' ,
`AMOUNT`  decimal(30,4) NOT NULL COMMENT '交易金额' ,
`BEFORE_BALANCE`  decimal(30,4) NULL COMMENT '操作前金额' ,
`AFTER_BALANCE`  decimal(30,4) NULL COMMENT '操作后金额' ,
`OPT_USER_ID`  decimal(18,0) NULL COMMENT '操作人ID' ,
`OPERATOR_TYPE`  decimal(5,0) NULL COMMENT '操作类型：0为用户，1为后台财务，' ,
`TRADE_DATE`  datetime NULL COMMENT '操作时间' ,
`BACK_DATE`  varchar(22) NULL COMMENT '退费时间' ,
`REMARK`  text NULL COMMENT '备注' ,
PRIMARY KEY (`ID`)
)
COMMENT='用户续费日志'

;

-- ----------------------------
-- Records of E9NET_USER_RENEW_LOG
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for SEND_SMS_INFO
-- ----------------------------
DROP TABLE IF EXISTS `SEND_SMS_INFO`;
CREATE TABLE `SEND_SMS_INFO` (
`SEND_SMS_INFO_ID`  decimal(18,0) NULL COMMENT '主键ID' ,
`SEND_PHONE`  varchar(12) NULL COMMENT '发送号码' ,
`SEND_IP`  varchar(100) NULL COMMENT '发送IP' ,
`SEND_DATE`  datetime NULL COMMENT '发送时间' ,
`SEND_TYPE`  decimal(65,30) NULL COMMENT '1、短信验证码，2、语音通知' 
)

;

-- ----------------------------
-- Records of SEND_SMS_INFO
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for SYS_BUTTONS
-- ----------------------------
DROP TABLE IF EXISTS `SYS_BUTTONS`;
CREATE TABLE `SYS_BUTTONS` (
`ID`  decimal(18,0) NOT NULL COMMENT '按钮ID' ,
`MODULE_ID`  decimal(5,0) NULL COMMENT '模块ID' ,
`BUTTON_NAME`  varchar(150) NOT NULL COMMENT '按钮名称' ,
`IMAGE_PATH`  varchar(150) NULL COMMENT '按钮图片地址' ,
`REMARK`  varchar(150) NULL COMMENT '按钮备注' ,
`ONCLICK`  varchar(150) NULL COMMENT '按钮触发事件,点击该按钮时调用该方法' ,
`BUTTON_KEY`  varchar(100) NULL COMMENT '按钮权限值' ,
`BUTTON_URL`  varchar(100) NULL COMMENT '按钮url' ,
PRIMARY KEY (`ID`)
)
COMMENT='系统按钮表'

;

-- ----------------------------
-- Records of SYS_BUTTONS
-- ----------------------------
BEGIN;
INSERT INTO `SYS_BUTTONS` VALUES ('2', '2', '删除', '/images/delete.gif', '删除用户', 'delete_click', 'user:deleteBath', '/user/deleteBatch.html'), ('3', '2', '修改', '/images/edit.gif', '修改用户', 'edit_click', 'user:edit', '/user/edit.html'), ('4', '3', '新增', '/images/add.gif', '新增角色', 'add_click', 'role:add', '/role/add.html'), ('5', '3', '删除', '/images/delete.gif', '删除角色', 'delete_click', 'role:deleteBatch', '/role/deleteBatch.html '), ('6', '3', '修改', '/images/edit.gif', '修改角色', 'edit_click', 'role:edit', '/role/edit.html'), ('7', '2', '查询', '/images/queue.gif', '查询用户', 'queue_click', 'user:query', '/user/user_list'), ('8', '3', '分配权限', '/images/queue.gif', '分配权限', 'queue_click', 'role:permission', '/role/permission.html'), ('9', '5', '新增', '/images/add.gif', '新增应用', 'add_click', 'app:add', '/app/add.html'), ('10', '6', '查询', '/images/queue.gif', '查询应用', 'queue_click', 'app:query', '/add/app_list.html'), ('14', '6', '上线', '/images/edit.gif', '上线应用', 'onLine_click', 'e9netApp:onLine', '/e9netApp/onLine.html'), ('15', '6', '停用', '/images/edit.gif', '停用应用', 'stop_click', 'e9netApp:stop', '/e9netApp/stop.html '), ('16', '6', '修改签名', '/images/edit.gif', '修改签名', 'editSign_click', 'e9netApp:editSign', '/e9netApp/editSign.html'), ('17', '6', '短信模板管理', '/images/edit.gif', '短信模板管理', 'smsM_click', 'e9netApp:smsM', '/e9netApp/smsM.html '), ('18', '6', '配置通道', '/images/edit.gif', '配置通道', 'orgCfg_click', 'e9netApp:orgCfg', '/e9netApp/orgCfg.html'), ('1', '2', '新增', '/images/add.gif', '新增', 'add_click', 'user:add', '/user/add.html'), ('11', '6', '新增', '/images/add.gif', '新增应用', 'add_click', 'e9netApp:add', '/e9netApp/add.html'), ('12', '6', '删除', '/images/delete.gif', '删除应用', 'delete_click', 'e9netApp:deleteBatch', '/e9netApp/deleteBatch.html '), ('13', '6', '修改', '/images/edit.gif', '修改应用', 'edit_click', 'e9netApp:edit', '/e9netApp/edit.html');
COMMIT;

-- ----------------------------
-- Table structure for SYS_MODULE_ROLE
-- ----------------------------
DROP TABLE IF EXISTS `SYS_MODULE_ROLE`;
CREATE TABLE `SYS_MODULE_ROLE` (
`ID`  decimal(18,0) NOT NULL COMMENT 'ID' ,
`MODULE_ID`  decimal(18,0) NULL COMMENT '模块ID' ,
`ROLE_ID`  decimal(18,0) NULL COMMENT '角色ID' ,
`BUTTON_ID`  decimal(18,0) NULL COMMENT '按钮ID' ,
PRIMARY KEY (`ID`)
)
COMMENT='角色模块关系表'

;

-- ----------------------------
-- Records of SYS_MODULE_ROLE
-- ----------------------------
BEGIN;
INSERT INTO `SYS_MODULE_ROLE` VALUES ('676', '2', '51', '1'), ('677', '2', '51', '2'), ('234', '3', '32', '6'), ('235', '3', '32', '8'), ('232', '2', '23', '1'), ('233', '2', '23', '7'), ('404', '1', '29', null), ('405', '2', '29', null), ('406', '2', '29', '1'), ('678', '2', '51', '3'), ('734', '3', '147', null), ('735', '3', '147', '6'), ('674', '1', '51', null), ('407', '2', '29', '2'), ('675', '2', '51', null), ('736', '3', '147', '8'), ('748', '2', '147', '2'), ('743', '3', '147', null), ('744', '3', '147', '4'), ('745', '3', '147', '5'), ('746', '2', '147', null), ('747', '2', '147', '1'), ('749', '2', '147', '3'), ('750', '2', '147', '7'), ('681', '3', '54', '8'), ('694', '6', '2', '14'), ('727', '1', '147', null), ('679', '1', '54', null), ('680', '3', '54', null), ('613', '2', '44', '1'), ('614', '2', '44', '2'), ('615', '2', '44', '3'), ('616', '2', '44', '7'), ('611', '1', '44', null), ('612', '2', '44', null), ('689', '2', '111', '3'), ('690', '2', '111', '7'), ('687', '1', '111', null), ('688', '2', '111', null), ('374', '2', '2', '1'), ('375', '2', '2', '2'), ('376', '2', '2', '3'), ('377', '2', '2', '7'), ('378', '3', '2', null), ('379', '3', '2', '4'), ('380', '3', '2', '5'), ('381', '3', '2', '6'), ('382', '3', '2', '8'), ('383', '4', '2', null), ('384', '5', '2', null), ('372', '1', '2', null), ('373', '2', '2', null), ('385', '5', '2', '9'), ('386', '6', '2', null), ('387', '6', '2', '10'), ('651', '5', '47', '9'), ('652', '6', '47', null), ('514', '2', '31', '1'), ('515', '2', '31', '2'), ('653', '6', '47', '10'), ('654', '4', '49', null), ('655', '5', '49', null), ('649', '4', '47', null), ('512', '1', '31', null), ('513', '2', '31', null), ('650', '5', '47', null), ('656', '5', '49', '9'), ('657', '6', '49', null), ('658', '6', '49', '10'), ('691', '6', '2', '11'), ('692', '6', '2', '12'), ('693', '6', '2', '13');
COMMIT;

-- ----------------------------
-- Table structure for SYS_MODULES
-- ----------------------------
DROP TABLE IF EXISTS `SYS_MODULES`;
CREATE TABLE `SYS_MODULES` (
`ID`  decimal(18,0) NOT NULL COMMENT '模块ID' ,
`MODULE_FID`  decimal(18,0) NOT NULL COMMENT '模块父ID' ,
`MODULE_NAME`  varchar(150) NOT NULL COMMENT '模块名称' ,
`MODULE_KEY`  varchar(64) NOT NULL COMMENT '模块key值' ,
`MODULE_URL`  varchar(150) NULL COMMENT '模块链接url' ,
`MD_ORDER`  decimal(5,0) NULL COMMENT '模块排列顺序' ,
`CREATE_TIME`  datetime NULL COMMENT '创建时间' ,
`ICON`  varchar(20) NULL COMMENT '图标' ,
PRIMARY KEY (`ID`)
)
COMMENT='系统模块表'

;

-- ----------------------------
-- Records of SYS_MODULES
-- ----------------------------
BEGIN;
INSERT INTO `SYS_MODULES` VALUES ('1', '0', '用户管理', 'system', null, '10', '2017-08-03 14:29:15', 'fa fa-flask'), ('2', '1', '用户列表', 'system:user', '/user/userListUI.html', '11', '2017-08-03 14:29:15', null), ('3', '1', '角色管理', 'system:role', '/role/roleListUI.html', '12', '2017-08-03 14:29:15', null), ('4', '0', '应用管理', 'appManager', null, '20', '2017-08-03 14:29:15', 'fa fa-th'), ('5', '4', '新增应用', 'appManager:appAdd', '/app/add', '21', '2017-08-10 14:21:08', null), ('6', '4', '应用列表', 'appManager:appList', '/e9netApp/e9netAppListUI.html', '22', '2017-08-10 14:21:08', null);
COMMIT;

-- ----------------------------
-- Table structure for SYS_ROLE
-- ----------------------------
DROP TABLE IF EXISTS `SYS_ROLE`;
CREATE TABLE `SYS_ROLE` (
`ID`  decimal(18,0) NOT NULL COMMENT '角色ID' ,
`ROLE_NAME`  varchar(150) NOT NULL COMMENT '角色名称' ,
`ROLE_TYPE`  decimal(5,0) NOT NULL COMMENT '角色类型:0代表默认角色，1代表普通角色' ,
`STATUS`  decimal(5,0) NOT NULL COMMENT '状态：0代表正常，-1代表删除' ,
`AGENT_ID`  decimal(5,0) NULL COMMENT '角色所属：0所有，1前台 ， 2后台' ,
`REMARK`  varchar(150) NULL COMMENT '角色备注' ,
`CREATE_TIME`  datetime NULL COMMENT '创建时间' ,
PRIMARY KEY (`ID`)
)
COMMENT='系统角色表'

;

-- ----------------------------
-- Records of SYS_ROLE
-- ----------------------------
BEGIN;
INSERT INTO `SYS_ROLE` VALUES ('53', 'wrfer33', '1', '-1', '0', 'dffgf', '2017-08-22 00:00:00'), ('69', 'dmf测试89', '0', '0', '1', '测试用', '2017-08-28 00:00:00'), ('72', 'dmf测试89', '0', '0', '1', '测试用', '2017-08-28 00:00:00'), ('75', 'dsds', '0', '0', '0', 'sdsdsd', '2017-08-28 00:00:00'), ('76', 'sdsds', '0', '0', '0', 'sdsdsd', '2017-08-28 00:00:00'), ('77', 'sdsds', '0', '0', '0', 'sdsdsd', '2017-08-28 00:00:00'), ('78', 'sdsds', '0', '0', '0', 'sdsdsd', '2017-08-28 00:00:00'), ('79', 'dddsgdf', '0', '0', '0', 'dfdfd', '2017-08-28 00:00:00'), ('80', 'dddsgdf', '0', '0', '0', 'dfdfd', '2017-08-28 00:00:00'), ('81', 'sddf', '0', '0', '0', 'dfdfd', '2017-08-28 00:00:00'), ('82', 'dmf', '0', '0', '0', 'sdsd', '2017-08-28 00:00:00'), ('83', 'dmf', '0', '0', '0', 'sdsd', '2017-08-28 00:00:00'), ('84', 'dmf', '0', '0', '0', 'sdsd', '2017-08-28 00:00:00'), ('85', 'dmf', '0', '0', '0', 'sdsd', '2017-08-28 00:00:00'), ('86', 'dmf', '0', '0', '0', 'sdsd', '2017-08-28 00:00:00'), ('87', 'dsds444', '0', '0', '0', 'sdsd', '2017-08-28 00:00:00'), ('88', 'dsds444', '0', '0', '0', 'sdsd', '2017-08-28 00:00:00'), ('89', 'vfdf', '0', '0', '0', 'dfdf', '2017-08-28 00:00:00'), ('90', 'vfdf', '0', '0', '0', 'dfdf', '2017-08-28 00:00:00'), ('91', 'vfdf', '0', '0', '0', 'dfdf', '2017-08-28 00:00:00'), ('92', 'vfdf', '0', '0', '0', 'dfdf', '2017-08-28 00:00:00'), ('93', 'vfdf', '0', '0', '0', 'dfdf', '2017-08-28 00:00:00'), ('94', 'vfdf', '0', '0', '0', 'dfdf', '2017-08-28 00:00:00'), ('95', 'werfer', '0', '0', '1', 'ererer', '2017-08-28 00:00:00'), ('96', 'werfer', '0', '0', '1', 'ererer', '2017-08-28 00:00:00'), ('97', 'werfer', '0', '0', '1', 'ererer', '2017-08-28 00:00:00'), ('98', 'werfer', '0', '0', '1', 'ererer', '2017-08-28 00:00:00'), ('102', 'dgf', '0', '0', '0', 'fgfg', '2017-08-29 00:00:00'), ('103', 'dgf', '0', '0', '0', 'fgfg', '2017-08-29 00:00:00'), ('111', 'dmf测试89', '0', '0', '1', '测试用', '2017-08-29 00:00:00'), ('112', 'sdf', '0', '0', '0', 'sds', '2017-08-29 00:00:00'), ('113', 'dmf测试89', '0', '0', '1', '测试用', '2017-08-29 00:00:00'), ('114', 'dmf测试89', '0', '0', '1', '测试用', '2017-08-29 00:00:00'), ('116', 'dmf测试89', '0', '0', '1', '测试用', '2017-08-30 00:00:00'), ('125', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-04 00:00:00'), ('128', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-04 00:00:00'), ('133', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-07 00:00:00'), ('134', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-07 00:00:00'), ('141', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-12 00:00:00'), ('142', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-12 00:00:00'), ('145', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-12 00:00:00'), ('152', 'dmf测试89', '0', '0', '1', '测试用', '2017-10-26 00:00:00'), ('42', '中国好男人', '1', '0', '0', '中国好男人', '2017-08-18 00:00:00'), ('43', '中国好男人', '1', '0', '0', '中国好男人', '2017-08-18 00:00:00'), ('44', '中国人民共和国', '1', '0', '2', '中国人民共和国', '2017-08-18 00:00:00'), ('46', '11', '1', '0', '0', '11', '2017-08-18 00:00:00'), ('54', 'dmfgg333', '1', '0', '0', 'dfg', '2017-08-23 00:00:00'), ('55', 'fvd', '1', '0', '0', 'dfdf', '2017-08-23 00:00:00'), ('61', 'dmf测试89', '1', '0', '1', '测试用', '2017-08-23 00:00:00'), ('62', 'dmf测试89', '1', '0', '1', '测试用', '2017-08-23 00:00:00'), ('64', 'dmf测试89', '1', '0', '1', '测试用', '2017-08-24 00:00:00'), ('65', 'dmf测试89', '1', '0', '1', '测试用', '2017-08-25 00:00:00'), ('66', 'dmf测试89', '1', '0', '1', '测试用', '2017-08-25 00:00:00'), ('100', 'dmf测试89', '0', '0', '1', '测试用', '2017-08-29 00:00:00'), ('101', 'dmf测试89', '0', '0', '1', '测试用', '2017-08-29 00:00:00'), ('104', 'Guozy', '0', '0', '1', 'Guozy', '2017-08-29 00:00:00'), ('105', 'Guozy', '0', '0', '1', 'Guozy', '2017-08-29 00:00:00'), ('106', 'Guozy', '0', '0', '1', 'Guozy', '2017-08-29 00:00:00'), ('107', 'Guozy', '0', '0', '1', 'Guozy', '2017-08-29 00:00:00'), ('108', 'Guozy', '0', '0', '1', 'Guozy', '2017-08-29 00:00:00'), ('109', 'Garry', '0', '0', '1', 'Garry', '2017-08-29 00:00:00'), ('110', 'GarryGuozy', '0', '-1', '1', 'GarryGuozy', '2017-08-29 00:00:00'), ('115', 'dmf测试89', '0', '0', '1', '测试用', '2017-08-30 00:00:00'), ('118', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-01 00:00:00'), ('119', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-02 00:00:00'), ('120', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-02 00:00:00'), ('121', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-04 00:00:00'), ('124', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-04 00:00:00'), ('126', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-04 00:00:00'), ('129', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-05 00:00:00'), ('132', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-07 00:00:00'), ('138', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-12 00:00:00'), ('139', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-12 00:00:00'), ('140', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-12 00:00:00'), ('143', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-12 00:00:00'), ('144', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-12 00:00:00'), ('147', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-12 00:00:00'), ('150', 'dmf测试89', '0', '0', '1', '测试用', '2017-10-26 00:00:00'), ('155', 'dmf测试89', '0', '0', '1', '测试用', '2017-10-26 00:00:00'), ('50', '开发人员', '1', '0', '2', '开发人员', '2017-08-21 00:00:00'), ('51', '测试人员4', '1', '0', '2', '测试人员', '2017-08-21 00:00:00'), ('127', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-04 00:00:00'), ('146', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-12 00:00:00'), ('151', 'dmf测试89', '0', '0', '1', '测试用', '2017-10-26 00:00:00'), ('153', 'dmf测试89', '0', '0', '1', '测试用', '2017-10-26 00:00:00'), ('2', '管理员', '1', '0', '2', '后台管理员', '2017-07-14 09:22:59'), ('3', '普通用户', '1', '0', '2', '尊敬的李？', '2017-07-14 09:22:59'), ('4', '普通用户1', '1', '0', '2', '普通用户1', '2017-07-14 09:22:59'), ('5', '普通用户2', '1', '0', '2', '普通用户2', '2017-07-14 09:22:59'), ('6', '普通用户3', '1', '0', '2', '普通用户3', '2017-07-14 09:22:59'), ('7', '普通用户4', '1', '0', '2', '普通用户4', '2017-07-14 09:22:59'), ('8', '普通用户5', '1', '0', '2', '普通用户5', '2017-07-14 09:23:00'), ('9', '普通用户6', '1', '0', '2', '普通用户6', '2017-07-14 09:23:00'), ('10', '普通用户7', '1', '0', '2', '普通用户7', '2017-07-14 09:23:00'), ('11', '普通用户8', '1', '0', '2', '普通用户8', '2017-07-14 09:23:00'), ('12', '业务员', '1', '0', '2', '业务员', '2017-07-14 14:30:40'), ('13', '业务员1', '1', '0', '2', '业务员1', '2017-07-14 14:30:40'), ('14', '业务员2', '1', '0', '2', '业务员2', '2017-07-14 14:30:40'), ('15', '业务员3', '1', '0', '2', '业务员3', '2017-07-14 14:30:40'), ('16', '业务员4', '1', '0', '2', '业务员4', '2017-07-14 14:30:40');
INSERT INTO `SYS_ROLE` VALUES ('17', '业务员5', '1', '0', '2', '业务员5', '2017-07-14 14:30:40'), ('18', '业务员6', '1', '0', '2', '业务员6', '2017-07-14 14:30:41'), ('19', '业务员7', '1', '0', '2', '业务员7', '2017-07-14 14:30:41'), ('20', '业务员8', '1', '0', '2', '业务员8', '2017-07-14 14:30:41'), ('21', '业务员9', '1', '0', '2', '业务员8', '2017-07-14 14:30:41'), ('22', '业务员10', '1', '0', '2', '业务员8', '2017-07-14 14:30:41'), ('23', '审核人员', '1', '0', '2', '审核人员', '2017-07-14 14:31:12'), ('24', '审核人员1', '1', '0', '2', '审核人员1', '2017-07-14 14:31:12'), ('25', '审核人员2', '1', '0', '2', '审核人员2', '2017-07-14 14:31:12'), ('26', '审核人员3', '1', '0', '2', '审核人员3', '2017-07-14 14:31:12'), ('27', '审核人员4', '1', '0', '2', '审核人员4', '2017-07-14 14:31:12'), ('28', '审核人员5', '1', '0', '2', '审核人员5', '2017-07-14 14:31:12'), ('29', '审核人员6', '1', '0', '2', '审核人员6', '2017-07-14 14:31:12'), ('30', '审核人员7', '1', '0', '2', '审核人员7', '2017-07-14 00:00:00'), ('31', '审核人员8', '1', '0', '2', '审核人员8', '2017-07-14 00:00:00'), ('32', '审核人员9', '1', '0', '2', '审核人员8', '2017-07-14 00:00:00'), ('33', '审核人员12455555555', '1', '0', '1', '5555555', '2017-07-14 00:00:00'), ('1', '管理员', '0', '0', '2', '超则管理员角色,默认角色不能从界面修改权限', '2017-08-28 10:30:33'), ('70', 'dmf测试89', '0', '0', '1', '测试用', '2017-08-28 00:00:00'), ('99', 'dfvd', '0', '0', '0', 'dfdfd', '2017-08-28 00:00:00'), ('122', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-04 00:00:00'), ('123', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-04 00:00:00'), ('131', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-05 00:00:00'), ('148', 'dmf测试89', '0', '0', '1', '测试用', '2017-10-16 00:00:00'), ('149', 'dmf测试89', '0', '0', '1', '测试用', '2017-10-16 00:00:00'), ('154', 'dmf测试89', '0', '0', '1', '测试用', '2017-10-26 00:00:00'), ('157', 'dmf测试89', '0', '0', '1', '测试用', '2017-10-26 00:00:00'), ('45', '333', '1', '0', '0', '3333', '2017-08-18 00:00:00'), ('47', 'dmf', '1', '0', '1', 'sdsds', '2017-08-21 00:00:00'), ('48', 'dmf1', '1', '0', '0', 'sdsdsdsd5555', '2017-08-21 00:00:00'), ('49', 'dfdfd', '1', '0', '0', 'adww', '2017-08-21 00:00:00'), ('52', '棒棒', '1', '-1', '0', 'uij', '2017-08-21 00:00:00'), ('63', 'dmf测试89', '1', '0', '1', '测试用', '2017-08-24 00:00:00'), ('67', 'dmf测试89', '1', '0', '1', '测试用', '2017-08-25 00:00:00'), ('68', 'dmf测试89', '1', '0', '1', '测试用', '2017-08-25 00:00:00'), ('71', 'sdfd', '0', '0', '0', 'dfdfd', '2017-08-28 00:00:00'), ('73', 'sdfd', '0', '0', '0', 'dfdfd', '2017-08-28 00:00:00'), ('74', 'sfd', '0', '0', '0', 'dfdf', '2017-08-28 00:00:00'), ('117', 'dmf测试89', '0', '0', '1', '测试用', '2017-08-30 00:00:00'), ('130', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-05 00:00:00'), ('135', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-12 00:00:00'), ('136', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-12 00:00:00'), ('137', 'dmf测试89', '0', '0', '1', '测试用', '2017-09-12 00:00:00'), ('156', 'dmf测试89', '0', '0', '1', '测试用', '2017-10-26 00:00:00');
COMMIT;

-- ----------------------------
-- Table structure for SYS_USER
-- ----------------------------
DROP TABLE IF EXISTS `SYS_USER`;
CREATE TABLE `SYS_USER` (
`ID`  decimal(18,0) NOT NULL COMMENT '用户表ID' ,
`USER_NAME`  varchar(150) NOT NULL COMMENT '用户名称' ,
`USER_TYPE`  decimal(5,0) NOT NULL COMMENT '用户类型:0为后台用户，1前台用户' ,
`LOGIN_NAME`  varchar(150) NOT NULL COMMENT '登陆名称' ,
`LOGIN_PASS`  varchar(150) NOT NULL COMMENT '登陆密码' ,
`LOGIN_IP`  varchar(50) NULL COMMENT '登陆IP' ,
`STATUS`  decimal(5,0) NOT NULL COMMENT '0代表正常，1代表停用，-1代表删除' ,
`CREATE_DATE`  datetime NOT NULL COMMENT '创建时间' ,
`MOBILEPHONE`  varchar(50) NULL COMMENT '手机' ,
`PHONE`  varchar(150) NULL COMMENT '电话' ,
`EMAIL`  varchar(150) NULL COMMENT 'Email' ,
`REMARK`  text NULL COMMENT '备注' ,
`IS_DEFAULT`  decimal(5,0) NOT NULL COMMENT '0代表系统默认用户表，1代表系统新建' ,
`OPERATE_SERIAL`  varchar(50) NULL COMMENT '上级操作影响顺列' ,
`LAST_LOGIN_DATE`  datetime NULL COMMENT '上次登录时间' ,
`CREDENTIALS_SALT`  varchar(200) NULL COMMENT '加密盐' ,
`ACCOUNT_SID`  varchar(32) NULL COMMENT '开发者主帐号' ,
`TOKEN`  varchar(32) NULL COMMENT '开发者令牌' ,
`IMAGE_CODE`  varchar(100) NULL COMMENT '图片验证码' ,
`SMS_CODE`  varchar(50) NULL COMMENT '短信验证码' ,
`COMPANY_NAME`  varchar(200) NULL COMMENT '公司名称' ,
`AUTH_STATUS`  decimal(5,0) NULL COMMENT '认证状态:0未认证 1 已认证' ,
`BALANCE`  decimal(30,4) NULL COMMENT '账户余额' ,
`MT_PRICE`  decimal(15,4) NULL COMMENT '短信下行单价' ,
`MO_PRICE`  decimal(15,4) NULL COMMENT '短信下行单价' ,
`TRADE`  decimal(5,0) NULL COMMENT '所属行业' ,
`LOCATION`  varchar(100) NULL COMMENT '所在位置' ,
`BUSINESS_LICENSE`  varchar(100) NULL COMMENT '营业执照' ,
`UNIFIED_CREDIT_ID`  varchar(36) NULL COMMENT '统一社会信用代码' ,
PRIMARY KEY (`ID`)
)
COMMENT='用户表'

;

-- ----------------------------
-- Records of SYS_USER
-- ----------------------------
BEGIN;
INSERT INTO `SYS_USER` VALUES ('44', '管理员', '1', 'admin', 'e00cf25ad42683b3df678c61f42c6bda', null, '0', '2017-07-31 00:00:00', null, null, null, null, '0', '0', '2017-08-10 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('45', '5555555555332', '1', '555555555', '555555555', null, '-1', '2017-07-31 00:00:00', null, null, null, null, '0', '0', '2017-08-09 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('46', '3232313213123', '0', '3232313213123', '3232313213123', null, '-1', '2017-07-31 00:00:00', null, null, null, null, '0', '0', '2017-07-31 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('47', '3141234321432', '0', '3141234321432', '3141234321432', null, '-1', '2017-07-31 00:00:00', null, null, null, null, '0', '0', '2017-07-31 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('48', '4444444444444444444', '1', '人3232', '4444444444444444444', null, '-1', '2017-07-31 00:00:00', null, null, null, null, '0', '0', '2017-08-01 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('49', '444', '1', '333333333333333333333', '333333333333333333333', null, '0', '2017-07-31 00:00:00', null, null, null, null, '0', '0', '2017-08-09 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('50', '333333333333333333333', '0', '333333333333333333333', '333333333333333333333', null, '0', '2017-07-31 00:00:00', null, null, null, null, '0', '0', '2017-07-31 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('51', '333333333333333333333', '0', '333333333333333333333', '333333333333333333333', null, '0', '2017-07-31 00:00:00', null, null, null, null, '0', '0', '2017-07-31 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('52', '333333333333333333333', '0', '333333333333333333333', '333333333333333333333', null, '0', '2017-07-31 00:00:00', null, null, null, null, '0', '0', '2017-07-31 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('53', '333333333333333333333', '0', '333333333333333333333', '333333333333333333333', null, '0', '2017-07-31 00:00:00', null, null, null, null, '0', '0', '2017-08-02 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('54', '333333333333333333333', '0', '333333333333333333333', '333333333333333333333', null, '-1', '2017-07-31 00:00:00', null, null, null, null, '0', '0', '2017-07-31 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('55', '555555', '0', '555555', '555555', null, '-1', '2017-07-31 00:00:00', null, null, null, null, '0', '0', '2017-07-31 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('58', '343333333333333', '1', '343333333333333', '343333333333333', '343333333333333', '-1', '2017-08-01 00:00:00', null, null, null, null, '0', '0', '2017-08-01 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('43', '111111', '0', '111111', '111111', null, '0', '2017-07-31 00:00:00', null, null, null, null, '0', '0', '2017-07-31 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('56', '444444', '0', '444444', '444444', null, '-1', '2017-08-01 00:00:00', null, null, null, null, '0', '0', '2017-08-01 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('61', 'werwer', '0', 'wrewr', '123456', null, '-1', '2017-08-02 00:00:00', null, null, null, null, '0', '0', '2017-08-03 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('62', '234234235', '0', 'qwewqe', '123456', '2', '-1', '2017-08-02 00:00:00', null, null, null, null, '0', '0', '2017-08-02 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('63', 'dfdfdf', '0', '111111', '111111', null, '-1', '2017-08-07 00:00:00', null, null, null, null, '0', '0', '2017-08-07 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('65', '34532', '0', 'UserController', 'UserController', null, '0', '2017-08-10 00:00:00', null, null, null, null, '0', '0', '2017-08-10 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('68', '5555533', '1', '345678', '345678', null, '0', '2017-08-16 00:00:00', null, null, null, null, '0', '0', '2017-08-17 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('59', 'wwwwww', '0', 'wwwwww', 'wwwwww', null, '-1', '2017-08-01 00:00:00', null, null, null, null, '0', '0', '2017-08-01 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('70', 'dmf', '0', 'dmf11', '111111', null, '0', '2017-08-29 00:00:00', null, null, null, 'dfdfd', '0', '0', '2017-08-29 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('66', '村妓d4444', '1', 'sdsds', '123456', null, '0', '2017-08-11 00:00:00', null, null, null, null, '0', '0', '2017-08-16 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('67', '33424', '0', '343', '111111', null, '-1', '2017-08-15 00:00:00', null, null, null, null, '0', '0', '2017-08-15 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('60', '555555555555555555555555555', '0', '555555555555555555555555555', '555555555555555555555555555', null, '-1', '2017-08-01 00:00:00', null, null, null, null, '0', '0', '2017-08-01 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('64', 'fedgte', '0', 'erer', '111111', '1212', '0', '2017-08-08 00:00:00', null, null, null, null, '0', '0', '2017-08-08 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('69', '45673566', '0', '5633333', '5633333', null, '0', '2017-08-18 00:00:00', null, null, null, null, '0', '0', '2017-08-22 00:00:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
COMMIT;

-- ----------------------------
-- Table structure for SYS_USER_BALANCE
-- ----------------------------
DROP TABLE IF EXISTS `SYS_USER_BALANCE`;
CREATE TABLE `SYS_USER_BALANCE` (
`ID`  decimal(18,0) NOT NULL COMMENT '主建id(取自己sys_user表id)' ,
`LOGIN_NAME`  varchar(150) NULL COMMENT '用户名称' ,
`BALANCE`  decimal(30,4) NULL COMMENT '用户余额' ,
`CREATE_DATE`  datetime NULL COMMENT '创建时间' ,
`UPDATE_DATE`  datetime NULL COMMENT '更新时间' ,
PRIMARY KEY (`ID`)
)
COMMENT='用户余额表'

;

-- ----------------------------
-- Records of SYS_USER_BALANCE
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for SYS_USER_ROLE
-- ----------------------------
DROP TABLE IF EXISTS `SYS_USER_ROLE`;
CREATE TABLE `SYS_USER_ROLE` (
`ID`  decimal(18,0) NOT NULL COMMENT 'ID' ,
`USER_ID`  decimal(18,0) NULL COMMENT '用户表ID' ,
`ROLE_ID`  decimal(18,0) NULL COMMENT '角色ID' ,
PRIMARY KEY (`ID`)
)
COMMENT='用户角色关系表'

;

-- ----------------------------
-- Records of SYS_USER_ROLE
-- ----------------------------
BEGIN;
INSERT INTO `SYS_USER_ROLE` VALUES ('1', '44', '2');
COMMIT;

-- ----------------------------
-- Indexes structure for table E9NET_APP
-- ----------------------------

-- ----------------------------
-- Indexes structure for table E9NET_OPERATE_LOG
-- ----------------------------

-- ----------------------------
-- Indexes structure for table E9NET_TEMPLATE
-- ----------------------------

-- ----------------------------
-- Indexes structure for table E9NET_USER_RENEW_LOG
-- ----------------------------

-- ----------------------------
-- Indexes structure for table SYS_BUTTONS
-- ----------------------------

-- ----------------------------
-- Indexes structure for table SYS_MODULE_ROLE
-- ----------------------------

-- ----------------------------
-- Indexes structure for table SYS_MODULES
-- ----------------------------

-- ----------------------------
-- Indexes structure for table SYS_ROLE
-- ----------------------------

-- ----------------------------
-- Indexes structure for table SYS_USER
-- ----------------------------

-- ----------------------------
-- Indexes structure for table SYS_USER_BALANCE
-- ----------------------------

-- ----------------------------
-- Indexes structure for table SYS_USER_ROLE
-- ----------------------------
