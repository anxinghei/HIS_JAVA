-- phpMyAdmin SQL Dump
-- version phpStudy 2014
-- http://www.phpmyadmin.net
--
-- 主机: 127.0.0.1
-- 生成日期: 2019 �?10 �?21 �?08:10
-- 服务器版本: 5.5.53
-- PHP 版本: 5.6.27

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `hospital`
--

-- --------------------------------------------------------

--
-- 表的结构 `auth_rule`
--

CREATE TABLE IF NOT EXISTS `auth_rule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(50) NOT NULL COMMENT '控制器名称',
  `title` varchar(255) NOT NULL COMMENT '菜单名称',
  `pid` int(11) NOT NULL COMMENT '父菜单id',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='新的权限表，暂时不用' AUTO_INCREMENT=19 ;

--
-- 转存表中的数据 `auth_rule`
--

INSERT INTO `auth_rule` (`id`, `menu_name`, `title`, `pid`) VALUES
(1, 'Index:base_index', '门诊就诊', 0),
(10, '', '药品管理', 0),
(9, '', '挂号管理', 0),
(11, '', '诊疗项目', 0),
(12, '', '数据统计', 0),
(13, '', '诊所信息', 0),
(14, '', '医疗人员', 13),
(15, '', '医生管理', 14),
(16, '', '权限管理', 14),
(17, 'AuthGroup:index', '权限组修改', 16),
(18, 'Member:index', '用户管理', 15);

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_auth_group`
--

CREATE TABLE IF NOT EXISTS `dzm_his_auth_group` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `title` char(100) NOT NULL DEFAULT '' COMMENT '组别名称',
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否显示：1为显示，2不显示',
  `is_manage` tinyint(1) NOT NULL DEFAULT '1' COMMENT '1需要验证权限 2 不需要验证权限.',
  `rules` text NOT NULL COMMENT '用户组拥有的规则id， 多个规则',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8mb4 COMMENT='用户组表' AUTO_INCREMENT=16 ;

--
-- 转存表中的数据 `dzm_his_auth_group`
--

INSERT INTO `dzm_his_auth_group` (`id`, `title`, `status`, `is_manage`, `rules`) VALUES
(1, '管理员', 1, 1, ',1,2,3,4,5,6,7,8,9,11,14,15,16,17,18,19,20,21,23,24,25,26,27,28,30,31,32,33,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,56,57,58,59,60,61,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,104,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,147,148,1213,1214,1215,1216,1217,1218,1219,1220,1223,1224,1225,1226,1227,1228,1229,1230,1231,1232'),
(2, '医生', 1, 1, ',1,2,3,4,5,6,7,8,9,11,14,15,16,17,18,19,20,21,23,24,25,26,27,28,30,31,32,33,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,56,57,58,59,60,61,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,104,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,147,148,1213,1214,1215,1216,1217,1218,1219,1220,1223,1224,1225,1226,1227,1228,1229,1230,1231,1232'),
(3, '护士', 1, 1, ',1,2,3,4,5,6,7,8,9,11,14,15,16,17,18,19,20,21,25,26,27,28,31,32,33,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,104,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,147,148,1213,1214,1219,1220,1223,1224,1225,1226'),
(12, '住院长', 1, 1, ',1'),
(4, '挂号员', 1, 1, ',1,2,3,4,5,8,9,31,35,36,37,38,39,40,41,42,43,44,45,46,47,48,52,53,63,64,70,71,72,73,74,75,76,116,117,118'),
(5, '收费员', 1, 1, ',1,2,3,4,5,6,7,8,9,11,14,15,16,17,18,19,20,21,25,26,27,28,31,32,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,97,99,101,104,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,147,148,1219,1220,1223,1224,1225,1226,1227,1228,1229,1230,1231,1232'),
(6, '发药员', 1, 1, ',1,2,3,4,5'),
(7, '财务', 1, 1, ',1,2,3,4,5'),
(8, '其他人员', 1, 1, ',4');

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_auth_rule`
--

CREATE TABLE IF NOT EXISTS `dzm_his_auth_rule` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `icon` varchar(100) DEFAULT '' COMMENT '图标',
  `menu_name` varchar(100) NOT NULL DEFAULT '' COMMENT '规则唯一标识Controller/action',
  `title` varchar(100) NOT NULL DEFAULT '' COMMENT '菜单名称',
  `pid` smallint(6) NOT NULL DEFAULT '0' COMMENT '父菜单ID ',
  `is_menu` tinyint(1) DEFAULT '1' COMMENT '1:是主菜单 2 否',
  `is_race_menu` tinyint(1) NOT NULL DEFAULT '1' COMMENT '1:是 2:不是',
  `type` tinyint(1) NOT NULL DEFAULT '1',
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `order_list` int(255) DEFAULT '0' COMMENT '排序字段',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8mb4 COMMENT='用户权限表' AUTO_INCREMENT=1233 ;

--
-- 转存表中的数据 `dzm_his_auth_rule`
--

INSERT INTO `dzm_his_auth_rule` (`id`, `icon`, `menu_name`, `title`, `pid`, `is_menu`, `is_race_menu`, `type`, `status`, `order_list`) VALUES
(1, '', 'Index/base_index', '门诊就诊', 0, 1, 1, 1, 1, 1),
(2, 'fa fa-medkit', 'Doctor/index', '新开就诊', 1, 1, 1, 1, 1, 0),
(3, 'fa fa-list', 'Doctor/getVisitList', '就诊列表', 1, 1, 1, 1, 1, 0),
(4, '', 'Doctor/getMedicines', '获取药品', 2, 2, 1, 1, 1, 0),
(5, 'fa fa-calendar', 'Scheduling/Scheduling_list', '医生排班', 53, 1, 1, 1, 1, 0),
(6, 'fa fa-stethoscope', 'Registration/Registration_add', '门诊挂号', 53, 1, 1, 1, 1, 0),
(7, 'fa fa-list-alt', 'Registration/Registration_list', '挂号列表', 53, 1, 1, 1, 1, 0),
(8, 'fa fa-user', 'Patient/index', '患者库', 52, 1, 1, 1, 1, 3),
(9, '', '', '编辑医生排班', 5, 2, 1, 1, 1, 0),
(11, 'fa fa-jpy', 'Doctor/pkgList', '收费发药', 1, 1, 1, 1, 1, 0),
(12, 'fa fa-minus-square', 'Doctor/pkgRefund', '处方退费', 10, 2, 1, 1, 1, 0),
(13, '', 'Doctor/pkgRefundDo', '退费操作', 12, 2, 1, 1, 1, 0),
(14, '', 'Doctor/pkgPay', '收费操作', 11, 2, 1, 1, 1, 0),
(15, '', 'Doctor/pkgShow', '订单明细', 11, 2, 1, 1, 1, 0),
(16, '', '', '数据统计', 0, 1, 1, 1, 1, 7),
(17, 'fa fa-pie-chart', 'IncomeStat/index', '诊所收支', 16, 1, 1, 1, 1, 0),
(18, 'fa fa-suitcase', 'DrugSalesStatistics/index', '药品销售', 16, 1, 1, 1, 1, 0),
(19, 'fa fa-bar-chart', 'Inspectionfee/inspectionStatistics', '诊疗项目', 16, 1, 1, 1, 1, 0),
(20, 'fa fa-signal', 'ReportStatistics/monthlyReport', '年月报表', 16, 1, 1, 1, 1, 0),
(21, 'fa fa-calculator', 'WorkloadStatistics/index', '工作量统计', 16, 1, 1, 1, 1, 0),
(23, 'fa fa-building-o', 'Member/userList', '医疗人员', 52, 1, 1, 1, 1, 1),
(24, '', 'Member/resetPassword', '重置密码', 23, 2, 1, 1, 1, 0),
(25, 'fa fa-drivers-license', 'Department/index', '科室管理', 52, 1, 1, 1, 1, 3),
(26, 'fa fa-id-badge', 'Registeredfee/Registeredfee_list', '挂号费管理', 53, 1, 1, 1, 1, 0),
(27, 'fa fa-money', 'PrescriptionExtracharges/index', '处方附加费', 1, 1, 1, 1, 1, 0),
(28, 'fa fa-sheqel', 'Inspectionfee/index', '诊疗项目', 54, 1, 1, 1, 1, 0),
(30, '', 'AuthGroup/index', '查看职务相关', 23, 2, 1, 1, 1, 0),
(31, '', 'Doctor/getExtracharges', '获取附加费用', 2, 2, 1, 1, 1, 0),
(32, '', '', '药品管理', 0, 1, 1, 1, 1, 4),
(33, 'fa fa-medkit', 'Medicines/index', '药品信息', 32, 1, 1, 1, 1, 0),
(34, 'fa fa-ambulance', 'Supplier/index', '供应商维护', 3299, 1, 1, 1, 1, 0),
(35, '', 'Doctor/getInspectionfee', '获取诊疗项目费用', 2, 2, 1, 1, 1, 0),
(36, '', 'Doctor/getRegistrations', '获取挂号列表', 2, 2, 1, 1, 1, 0),
(37, '', 'Doctor/searchPatientByMobile', '用手机号获取用户信息', 2, 2, 1, 1, 1, 0),
(38, '', 'Doctor/getUserInfo', '获取患者档案', 2, 2, 1, 1, 1, 0),
(39, '', 'Doctor/saveCareInfo', '保存患者历史病历', 2, 2, 1, 1, 1, 0),
(40, '', 'Doctor/getCareHistory', '获取患者历史病历', 2, 2, 1, 1, 1, 0),
(41, '', 'Doctor/getPatientList', '获取患者列表', 2, 2, 1, 1, 1, 0),
(42, '', 'Doctor/savePatient', '保存患者信息', 2, 2, 1, 1, 1, 0),
(43, '', 'Doctor/getPkgList', '获取看病记录', 2, 2, 1, 1, 1, 0),
(44, '', 'Doctor/saveOrder', '保存', 2, 2, 1, 1, 1, 0),
(45, '', 'Doctor/change_ol_pay_part', '更新在线支付额度', 2, 2, 1, 1, 1, 0),
(46, '', 'Doctor/payOrder', '支付订单', 2, 2, 1, 1, 1, 0),
(47, '', 'Doctor/getOnLinePay', '获取在线支付', 2, 2, 1, 1, 1, 0),
(48, '', 'Doctor/getOrder', '显示收费列表', 2, 2, 1, 1, 1, 0),
(49, 'fa fa-shopping-cart', 'Inventory/purchase', '采购入库', 32, 1, 1, 1, 1, 0),
(50, 'fa fa-check', 'BatchesOfInventory/get_list', '入库审核', 32, 1, 1, 1, 1, 0),
(51, 'fa fa-search', 'Inventory/inventory_list', '药品库存', 32, 1, 1, 1, 1, 0),
(52, '', '', '诊所信息', 0, 1, 1, 1, 1, 8),
(53, '', '', '挂号管理', 0, 1, 1, 1, 1, 0),
(54, '', '', '诊疗项目', 0, 1, 1, 1, 1, 3),
(55, '', '', '患者管理', 11111, 1, 1, 1, 1, 6),
(56, '', 'Member/RemoveUserList', '禁用医生列表管理', 23, 2, 1, 1, 1, 0),
(57, '', 'Member/removeUser', '移除医生', 23, 2, 1, 1, 1, 0),
(58, '', 'Member/startUser', '取消禁用', 23, 2, 1, 1, 1, 0),
(59, '', 'Member/index', '添加医生', 23, 2, 1, 1, 1, 0),
(60, '', 'Member/editUser', '编辑医生', 23, 2, 1, 1, 1, 0),
(61, '', 'Member/uploadDocPic', '编辑医生图片', 23, 2, 1, 1, 1, 0),
(63, '', 'Doctor/getCareOrder', '显示看诊列表', 2, 2, 1, 1, 1, 0),
(64, '', 'Doctor/getCareOrderSub', '显示看诊列表明细', 2, 2, 1, 1, 1, 0),
(65, 'fa fa-info-circle', 'Member/myHospitalInfo', '诊所信息', 52, 1, 1, 1, 1, 1),
(66, '', 'Doctor/pkgDone', '完成交易', 11, 2, 1, 1, 1, 0),
(67, '', 'Doctor/pkgRefundDo', '执行退款', 11, 2, 1, 1, 1, 0),
(68, '', 'Doctor/getRefundLog', '查看退款ajax', 11, 2, 1, 1, 1, 0),
(69, '', 'Doctor/pkgIO', '交易信息', 11, 2, 1, 1, 1, 0),
(70, '', 'Patient/editPatient', '编辑患者档案', 8, 2, 1, 1, 1, 0),
(71, '', 'Patient/removePatient', '移除患者', 8, 2, 1, 1, 1, 0),
(72, '', 'Patient/removedLists', '移除患者列表', 8, 2, 1, 1, 1, 0),
(73, '', 'Patient/recoveryPatient', '恢复患者', 8, 2, 1, 1, 1, 0),
(74, '', 'Patient/deletePatient', '删除患者', 8, 2, 1, 1, 1, 0),
(75, '', 'Patient/careHistory', '历史病例', 8, 2, 1, 1, 1, 0),
(76, '', 'Patient/exportExcel', '导出患者信息', 8, 2, 1, 1, 1, 0),
(77, '', 'ReportStatistics/exportMonthlyReport', '月度报表导出', 20, 2, 1, 1, 1, 0),
(78, '', 'ReportStatistics/monthlyReport', '月度报表', 20, 2, 1, 1, 1, 0),
(79, '', 'ReportStatistics/yearReport', '年度报表', 20, 2, 1, 1, 1, 0),
(80, '', 'ReportStatistics/exportYearReport', '年度报表导出', 20, 2, 1, 1, 1, 0),
(81, '', 'Department/addDepartment', '添加科室', 25, 2, 1, 1, 1, 0),
(82, '', 'Department/editDepartment', '编辑科室', 25, 2, 1, 1, 1, 0),
(83, '', 'Department/deleteDepartment', '删除科室', 25, 2, 1, 1, 1, 0),
(84, '', 'PrescriptionExtracharges/addExtraCharges', '添加处方附加费', 27, 2, 1, 1, 1, 0),
(85, '', 'PrescriptionExtracharges/editExtraCharges', '修改处方附加费', 27, 2, 1, 1, 1, 0),
(86, '', 'PrescriptionExtracharges/deleteExtraCharges', '删除处方附加费', 27, 2, 1, 1, 1, 0),
(87, '', 'Inspectionfee/addInspection', '添加检查项目费', 28, 2, 1, 1, 1, 0),
(88, '', 'Inspectionfee/editInspection', '编辑检查项目费', 28, 2, 1, 1, 1, 0),
(89, '', 'Inspectionfee/deleteInspection', '删除检查项目费', 28, 2, 1, 1, 1, 0),
(90, '', 'Dictionary/dictionaryLists', '字典列表', 1226, 2, 1, 1, 1, 0),
(91, '', 'Dictionary/getSubDictionary', '字典子列表', 1226, 2, 1, 1, 1, 0),
(92, '', 'Dictionary/addDictionary', '添加字典', 1226, 2, 1, 1, 1, 0),
(93, '', 'Dictionary/editDictionary', '编辑字典', 1226, 2, 1, 1, 1, 0),
(94, '', 'Dictionary/deleteDictionary', '删除字典', 1226, 2, 1, 1, 1, 0),
(95, '', 'Registeredfee/Registeredfee_edit', '挂号费用编辑', 26, 2, 1, 1, 1, 0),
(96, '', 'Medicines/medicinesLists', '全部药品列表', 33, 2, 1, 1, 1, 0),
(97, '', 'Registeredfee/Registeredfee_add', '挂号费用添加', 26, 2, 1, 1, 1, 0),
(98, '', 'Medicines/addMedicines', '添加药品', 33, 2, 1, 1, 1, 0),
(99, '', 'Registeredfee/getRegisteredfeeInfoByReg_id', '挂号费用弹框赋值', 26, 2, 1, 1, 1, 0),
(100, '', 'Medicines/deleteMedicines', '删除药品', 33, 2, 1, 1, 1, 0),
(101, '', 'Registeredfee/Registeredfee_delete', '挂号费用删除', 26, 2, 1, 1, 1, 0),
(102, '', 'Supplier/addSupplier', '添加供应商', 34, 2, 1, 1, 1, 0),
(103, '', 'Supplier/editSupplier', '编辑供应商', 34, 2, 1, 1, 1, 0),
(104, '', 'Registeredfee/getRegisteredFeeList', '获取挂号费用列表', 26, 2, 1, 1, 1, 0),
(105, '', 'Supplier/deleteSupplier', '删除供应商', 34, 2, 1, 1, 1, 0),
(106, '', 'Registration/getSchedulingList', '门诊挂号获取医生排班信息', 6, 2, 1, 1, 1, 0),
(107, '', 'Registration/change_ol_pay_part', '门诊挂号更新在线支付额度', 6, 2, 1, 1, 1, 0),
(108, '', 'Registration/getOnLinePay', '门诊挂号获取在线支付状态', 6, 2, 1, 1, 1, 0),
(109, '', 'Registration/payOrder', '门诊挂号保存订单', 6, 2, 1, 1, 1, 0),
(110, '', 'Registration/ForAge', '门诊挂号获取年龄', 6, 2, 1, 1, 1, 0),
(111, '', 'Registration/getPatientPool', '门诊挂号获取患者列表', 6, 2, 1, 1, 1, 0),
(112, '', 'Registration/getPatientInfo', '门诊挂号选中患者', 6, 2, 1, 1, 1, 0),
(113, '', 'Registration/getPaylogInfo', '诊所列表获取paylog信息', 7, 2, 1, 1, 1, 0),
(114, '', 'Registration/Registration_quit', '诊所列表更改挂号状态', 7, 2, 1, 1, 1, 0),
(115, '', 'Registration/Registration_cancel', '诊所列表作废', 7, 2, 1, 1, 1, 0),
(116, '', 'Scheduling/Scheduling_edit', '排班弹框', 5, 2, 1, 1, 1, 0),
(117, '', 'Scheduling/Scheduling_change', '更改排班状态', 5, 2, 1, 1, 1, 0),
(118, '', 'Scheduling/export', '排班导出', 5, 2, 1, 1, 1, 0),
(119, '', 'Inventory/getMedicinesList', '采购入库获取药品信息', 49, 2, 1, 1, 1, 0),
(120, '', 'Inventory/submitMedicines', '采购入库添加药品', 49, 2, 1, 1, 1, 0),
(121, '', 'Inventory/submit_purchasing_information', '采购入库添加', 49, 2, 1, 1, 1, 0),
(122, '', 'Inventory/adjust_price', '库存查询 调价', 51, 2, 1, 1, 1, 0),
(123, '', 'Inventory/getInventoryListInfo', '库存查询 获取药品库存列表', 51, 2, 1, 1, 1, 0),
(124, '', 'Inventory/getBatchesOfInventoryListStatusEqTwo', '库存查询 批次库存及价格', 51, 2, 1, 1, 1, 0),
(125, '', 'BatchesOfInventory/delete_batches_of_inventory', '入库审核 删除', 50, 2, 1, 1, 1, 0),
(126, '', 'BatchesOfInventory/getBatchesOfInventoryList', '入库审核 获取审核列表', 50, 2, 1, 1, 1, 0),
(127, '', 'BatchesOfInventory/purchase_list', '入库审核 采购信息列表', 50, 2, 1, 1, 1, 0),
(128, '', 'BatchesOfInventory/delete_purchase', '入库审核 删除采购信息', 50, 2, 1, 1, 1, 0),
(129, '', 'BatchesOfInventory/get_purchase_list', '入库审核 获取采购信息列表', 50, 2, 1, 1, 1, 0),
(130, '', 'BatchesOfInventory/audit', '入库审核 审核', 50, 2, 1, 1, 1, 0),
(131, '', 'DrugSalesStatistics/detailList', '药品销售统计 获取明细列表', 18, 2, 1, 1, 1, 0),
(132, '', 'IncomeStat/getIncomeInfo', '诊所收支统计 获取统计信息', 17, 2, 1, 1, 1, 0),
(133, '', 'IncomeStat/getIncomeList', '诊所收支统计 获取列表信息', 17, 2, 1, 1, 1, 0),
(134, '', 'IncomeStat/export', '诊所收支统计 导出', 17, 2, 1, 1, 1, 0),
(135, '', 'WorkloadStatistics/getClinicFee', '工作量统计 门诊费用统计', 21, 2, 1, 1, 1, 0),
(136, '', 'WorkloadStatistics/getDrugPurchase', '工作量统计 获取挂号费统计', 21, 2, 1, 1, 1, 0),
(137, '', 'WorkloadStatistics/getCareOrderStatistics', '工作量统计 门诊处方统计', 21, 2, 1, 1, 1, 0),
(138, '', 'WorkloadStatistics/getCollectionStatistics', '工作量统计 收费员统计', 21, 2, 1, 1, 1, 0),
(139, '', 'WorkloadStatistics/ClinicFee_export', '工作量统计 门诊费用导出', 21, 2, 1, 1, 1, 0),
(140, '', 'WorkloadStatistics/DrugPurchase_export', '工作量统计 挂号费用导出', 21, 2, 1, 1, 1, 0),
(141, '', 'Registration/registrationRefund', '挂号列表 退号退款', 7, 2, 1, 1, 1, 0),
(142, '', 'Registration/pkgRefundDo', '挂号列表 去退款', 7, 2, 1, 1, 1, 0),
(143, '', 'Registration/registrationGoToPay', '挂号列表 去支付', 7, 2, 1, 1, 1, 0),
(144, '', 'Registration/getRegistrationPayInfo', '挂号列表 获取详细信息', 7, 2, 1, 1, 1, 0),
(145, '', 'Registeredfee/getRepetition', '挂号费用查询重复', 26, 2, 1, 1, 1, 0),
(147, '', 'Doctor/printOrder', '打印处方', 11, 2, 1, 1, 1, 0),
(148, '', 'Inventory/set_early_warning', '库存查询  设置预警', 51, 2, 1, 1, 1, 0),
(1213, '', 'Medicines/editMedicines', '修改药品信息', 33, 2, 1, 1, 1, 0),
(1214, '', 'Medicines/addMedicinesOne', '添加单个药品', 33, 2, 1, 1, 1, 0),
(1215, '', 'AuthGroup/editRuleGroup', '修改人员权限', 23, 2, 1, 1, 1, 0),
(1216, '', 'AuthGroup/addRuleGroup', '新增职位信息', 23, 2, 1, 1, 1, 0),
(1217, '', 'AuthGroup/deleteRuleGroup', '删除职位', 23, 2, 1, 1, 1, 0),
(1218, '', 'AuthGroup/editGroupName', '修改职位名称', 23, 2, 1, 1, 1, 0),
(1219, '', 'Doctor/getRefundLog', '挂号列表退号', 7, 2, 1, 1, 1, 0),
(1220, '', 'Doctor/getPkgList', '查看收费记录', 11, 2, 1, 1, 1, 0),
(1224, '', 'Registeredfee/Registeredfee_sub_delete', '挂号费用 移除子费用', 26, 2, 1, 1, 1, 0),
(1223, '', 'BatchesOfInventory/get_list', '采购 入库审核', 49, 1, 1, 1, 1, 0),
(1225, '', 'Doctor/printPay', '收费打印', 11, 2, 1, 1, 1, 0),
(1226, 'fa fa-book', 'Dictionary/index/type/1', '项目类型', 54, 1, 1, 1, 1, 0),
(1227, 'fa fa-book', 'Dictionary/index', '药品类型', 32, 1, 1, 1, 1, 0),
(1228, '', 'Dictionary/dictionaryLists', '字典列表', 1227, 2, 1, 1, 1, 0),
(1229, '', 'Dictionary/getSubDictionary', '字典子列表', 1227, 2, 1, 1, 1, 0),
(1230, '', 'Dictionary/addDictionary', '添加字典', 1227, 2, 1, 1, 1, 0),
(1231, '', 'Dictionary/editDictionary', '编辑字典', 1227, 2, 1, 1, 1, 0),
(1232, '', 'Dictionary/deleteDictionary', '删除字典', 1227, 2, 1, 1, 1, 0);

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_batches_of_inventory`
--

CREATE TABLE IF NOT EXISTS `dzm_his_batches_of_inventory` (
  `batches_of_inventory_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '批次库存ID',
  `company_id` int(10) NOT NULL COMMENT '诊所ID',
  `supplier_id` int(10) NOT NULL COMMENT '供应商ID',
  `batches_of_inventory_number` bigint(20) NOT NULL COMMENT '采购单编号',
  `purchasing_agent_id` int(10) NOT NULL COMMENT '采购员ID',
  `batches_of_inventory_total_money` decimal(10,2) NOT NULL COMMENT '采购总金额',
  `batches_of_inventory_date` varchar(20) NOT NULL COMMENT '制单日期',
  `batches_of_inventory_status` int(3) NOT NULL DEFAULT '1' COMMENT '审核标记；未审核：1，已审核：2',
  `batches_of_inventory_verifier` int(10) DEFAULT NULL COMMENT '审核人员ID',
  `batches_of_inventory_verifier_date` varchar(20) DEFAULT NULL COMMENT '审核日期',
  `create_time` int(11) NOT NULL COMMENT '创建时间',
  `update_time` int(11) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`batches_of_inventory_id`),
  KEY `company_id` (`company_id`) USING BTREE,
  KEY `supplier_id` (`supplier_id`) USING BTREE,
  KEY `purchasing_agent_id` (`purchasing_agent_id`) USING BTREE,
  KEY `batches_of_inventory_verifier` (`batches_of_inventory_verifier`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批次库存表' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_care_history`
--

CREATE TABLE IF NOT EXISTS `dzm_his_care_history` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `hospital_id` int(10) unsigned DEFAULT '0' COMMENT '医院id',
  `doctor_id` int(10) unsigned DEFAULT '0' COMMENT '医生id',
  `patient_id` int(10) unsigned DEFAULT '0' COMMENT '患者id',
  `department_id` int(10) unsigned DEFAULT '0' COMMENT '科室id',
  `type_id` tinyint(1) unsigned DEFAULT '0' COMMENT '接诊类型：0初诊，1复诊，2急诊',
  `is_contagious` tinyint(1) unsigned DEFAULT '0' COMMENT '是否传染，0否，1是',
  `case_date` date DEFAULT NULL COMMENT '发病日期',
  `addtime` int(10) unsigned DEFAULT '0' COMMENT '插入时间，php时间戳',
  `case_code` varchar(32) DEFAULT NULL COMMENT '诊断编号',
  `case_title` varchar(255) DEFAULT NULL COMMENT '主诉',
  `case_result` text COMMENT '诊断信息',
  `doctor_tips` text COMMENT '医生建议',
  `memo` text COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `hospital_id` (`hospital_id`) USING BTREE,
  KEY `doctor_id` (`doctor_id`) USING BTREE,
  KEY `patient_id` (`patient_id`) USING BTREE,
  KEY `type_id` (`type_id`) USING BTREE,
  KEY `is_contagious` (`is_contagious`) USING BTREE,
  KEY `case_date` (`case_date`) USING BTREE,
  KEY `case_code` (`case_code`) USING BTREE,
  KEY `addtime` (`addtime`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='历史病历' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_care_order`
--

CREATE TABLE IF NOT EXISTS `dzm_his_care_order` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `hospital_id` int(10) unsigned DEFAULT '0' COMMENT '医院id',
  `doctor_id` int(10) unsigned DEFAULT '0' COMMENT '医生id',
  `patient_id` int(10) unsigned DEFAULT '0' COMMENT '患者id',
  `care_history_id` int(10) unsigned DEFAULT '0' COMMENT '关联病历id',
  `pkg_id` int(10) unsigned DEFAULT '0' COMMENT '收费总表care_pkg.id',
  `status` tinyint(1) unsigned DEFAULT '0' COMMENT '状态，0未支付，1已支付，2确认收款，3申请退款，4已退款',
  `label` varchar(128) DEFAULT NULL COMMENT '处方名',
  `num_a` smallint(5) unsigned DEFAULT '1' COMMENT '每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂',
  `num_b` smallint(5) unsigned DEFAULT '1' COMMENT '每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂',
  `num_c` smallint(5) DEFAULT '1' COMMENT '每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂',
  `num_d` smallint(5) DEFAULT '1' COMMENT '每num_a天,num_b剂，服用num_c天，共num_d剂',
  `amount` decimal(10,2) DEFAULT '0.00' COMMENT '单处方金额',
  `all_amount` decimal(10,2) DEFAULT '0.00' COMMENT '处方全额',
  `addtime` int(10) unsigned DEFAULT '0' COMMENT '插入时间，php时间戳',
  `case_code` varchar(32) DEFAULT NULL COMMENT '诊断编号',
  `use_tips` text COMMENT '服药要求',
  `memo` text COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `hospital_id` (`hospital_id`) USING BTREE,
  KEY `doctor_id` (`doctor_id`) USING BTREE,
  KEY `patient_id` (`patient_id`) USING BTREE,
  KEY `addtime` (`addtime`) USING BTREE,
  KEY `case_code` (`case_code`) USING BTREE,
  KEY `dzm_his_care_order_care_history_id_index` (`care_history_id`) USING BTREE,
  KEY `status` (`status`) USING BTREE,
  KEY `pkg_id` (`pkg_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='处方列表' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_care_order_sub`
--

CREATE TABLE IF NOT EXISTS `dzm_his_care_order_sub` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pkg_id` int(10) unsigned DEFAULT '0',
  `fid` int(10) unsigned DEFAULT '0' COMMENT '所属开诊id',
  `type_id` tinyint(1) unsigned DEFAULT '0' COMMENT '分类：0药，1附加费，2检查项目',
  `goods_id` int(10) unsigned DEFAULT '0' COMMENT '商品id，药品id',
  `goods_name` varchar(255) DEFAULT '' COMMENT '药品名',
  `single` decimal(10,2) unsigned DEFAULT '0.00' COMMENT '单剂量',
  `unit` varchar(20) DEFAULT '' COMMENT '单位',
  `price` decimal(10,2) DEFAULT '0.00' COMMENT '单价',
  `num` decimal(10,2) DEFAULT '0.00' COMMENT '用量',
  `amount` decimal(10,2) DEFAULT '0.00' COMMENT '金额',
  `tips` varchar(255) DEFAULT NULL COMMENT '特殊要求，备注',
  PRIMARY KEY (`id`),
  KEY `fid` (`fid`) USING BTREE,
  KEY `goods_id` (`goods_id`) USING BTREE,
  KEY `type_id` (`type_id`) USING BTREE,
  KEY `pkg_id` (`pkg_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='开诊用药明细' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_care_paylog`
--

CREATE TABLE IF NOT EXISTS `dzm_his_care_paylog` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pkg_id` int(10) unsigned DEFAULT NULL COMMENT 'care_pkg.id',
  `platform_code` varchar(128) DEFAULT NULL COMMENT '支付平台交易单号',
  `payment_platform` smallint(5) unsigned DEFAULT '0' COMMENT '支付方式：0现金，1微信，2支付宝，3，4，5....',
  `pay_amount` decimal(10,2) DEFAULT '0.00' COMMENT '支付金额',
  `status` tinyint(1) unsigned DEFAULT '0' COMMENT '状态，0未支付，1已支付',
  `addtime` int(10) unsigned DEFAULT '0' COMMENT '添加时间',
  PRIMARY KEY (`id`),
  KEY `pkg_id` (`pkg_id`) USING BTREE,
  KEY `platform_code` (`platform_code`) USING BTREE,
  KEY `status` (`status`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支付收费记录' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_care_pkg`
--

CREATE TABLE IF NOT EXISTS `dzm_his_care_pkg` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `hospital_id` int(10) unsigned DEFAULT '0',
  `doctor_id` int(10) unsigned DEFAULT '0',
  `patient_id` int(10) unsigned DEFAULT '0',
  `care_history_id` int(10) unsigned DEFAULT '0',
  `registration_id` int(10) unsigned DEFAULT '0' COMMENT '挂号ID',
  `order_code` varchar(64) DEFAULT NULL COMMENT '商户订单号',
  `amount` decimal(10,2) DEFAULT '0.00' COMMENT '应付金额',
  `ol_pay_part` decimal(10,2) DEFAULT '0.00' COMMENT '在线支付部分',
  `type_id` tinyint(1) unsigned DEFAULT '0' COMMENT '收费类型：0就诊处，1挂号处，2问答，3...',
  `status` tinyint(1) unsigned DEFAULT '0' COMMENT '状态:0未支付，1已支付，2确认收款，3申请退款，4已退款,5部分支付,6完成交易（如：已发药），7部分退款',
  `addtime` int(10) unsigned DEFAULT '0' COMMENT '插入时间',
  `op_place` tinyint(1) unsigned DEFAULT '0' COMMENT '操作地点：1售药，2查检项目，3附加费用，4挂号，，，，',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_code` (`order_code`) USING BTREE,
  KEY `hospital_id` (`hospital_id`) USING BTREE,
  KEY `doctor_id` (`doctor_id`) USING BTREE,
  KEY `patient_id` (`patient_id`) USING BTREE,
  KEY `care_history_id` (`care_history_id`) USING BTREE,
  KEY `status` (`status`) USING BTREE,
  KEY `type_id` (`type_id`) USING BTREE,
  KEY `addtime` (`addtime`) USING BTREE,
  KEY `op_place` (`op_place`),
  KEY `registration_id` (`registration_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收费总表' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_care_refundlog`
--

CREATE TABLE IF NOT EXISTS `dzm_his_care_refundlog` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pkg_id` int(10) unsigned DEFAULT NULL COMMENT 'care_pkg.id',
  `order_id` int(10) unsigned DEFAULT '0' COMMENT 'his_care_order.id',
  `platform_code` varchar(128) DEFAULT NULL COMMENT '支付平台交易单号',
  `payment_platform` smallint(5) unsigned DEFAULT '0' COMMENT '支付方式：0现金，1微信，2支付宝，3，4，5....',
  `refund_amount` decimal(10,2) DEFAULT '0.00' COMMENT '支付金额',
  `status` tinyint(1) unsigned DEFAULT '0' COMMENT '状态，0失败，1成功',
  `addtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `adm_uid` int(10) unsigned DEFAULT '0' COMMENT '处理人id',
  `adm_ip` varchar(32) DEFAULT NULL COMMENT '处理人ip',
  `adm_memo` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `pkg_id` (`pkg_id`) USING BTREE,
  KEY `platform_code` (`platform_code`) USING BTREE,
  KEY `status` (`status`) USING BTREE,
  KEY `adm_uid` (`adm_uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='退款记录' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_department`
--

CREATE TABLE IF NOT EXISTS `dzm_his_department` (
  `did` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '科室id',
  `create_time` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '创建时间',
  `update_time` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '编辑时间',
  `department_name` varchar(50) NOT NULL COMMENT '科室名称',
  `department_number` varchar(50) NOT NULL COMMENT '科室编号',
  `hid` int(10) NOT NULL COMMENT '医院id',
  PRIMARY KEY (`did`),
  KEY `editdate` (`update_time`) USING BTREE,
  KEY `department_name` (`department_name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='科室表' AUTO_INCREMENT=17 ;

--
-- 转存表中的数据 `dzm_his_department`
--

INSERT INTO `dzm_his_department` (`did`, `create_time`, `update_time`, `department_name`, `department_number`, `hid`) VALUES
(10, 1379691213, 1566000132, '内科', 'V03', 1),
(11, 1565915283, 1566000123, '外科', 'V09', 1),
(12, 1565915316, 1566000116, '耳鼻喉', 'V10', 1),
(13, 1565915335, 1566000107, '心电图', 'V05', 1),
(14, 1565915351, 1566263219, '彩超', 'V13', 1),
(15, 1565915365, 1566000083, '妇科', 'V06', 1),
(16, 1566010579, 1566010599, '体检', 'V01', 1);

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_dictionary`
--

CREATE TABLE IF NOT EXISTS `dzm_his_dictionary` (
  `did` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '字典字段id',
  `dictionary_name` varchar(50) NOT NULL DEFAULT '' COMMENT '字典名称',
  `parent_id` int(10) NOT NULL DEFAULT '0' COMMENT '父级id',
  `hid` int(10) NOT NULL DEFAULT '0' COMMENT '医院id',
  `type` tinyint(2) unsigned NOT NULL DEFAULT '0' COMMENT '类型  0：系统  1：自建',
  `create_time` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '添加时间',
  `update_time` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '编辑时间',
  `is_del` tinyint(2) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`did`),
  KEY `parent_id` (`parent_id`),
  KEY `hid` (`hid`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='字典表' AUTO_INCREMENT=34 ;

--
-- 转存表中的数据 `dzm_his_dictionary`
--

INSERT INTO `dzm_his_dictionary` (`did`, `dictionary_name`, `parent_id`, `hid`, `type`, `create_time`, `update_time`, `is_del`) VALUES
(1, '药品信息', 0, 0, 0, 1508983676, 0, 1),
(2, '处方信息', 0, 0, 0, 1508983676, 0, 0),
(3, '诊疗项目', 0, 0, 0, 1508983676, 0, 1),
(4, '人员信息', 0, 0, 0, 1508983676, 0, 0),
(5, '生产厂家', 1, 0, 0, 1508983676, 0, 0),
(6, '西药用法', 1, 0, 0, 1508983676, 0, 0),
(8, '发票项目', 1, 0, 0, 1508983676, 0, 0),
(9, '西药备注', 1, 0, 0, 1508983676, 0, 0),
(11, '药品分类', 1, 0, 0, 1508983676, 0, 1),
(12, '药品单位', 1, 0, 0, 1508983676, 0, 0),
(13, '药品剂型', 1, 0, 0, 1508983676, 0, 0),
(14, '诊断信息', 2, 0, 0, 1508983676, 0, 0),
(15, '医嘱信息', 2, 0, 0, 1508983676, 0, 0),
(16, '项目类型', 3, 0, 0, 1508983676, 0, 1),
(17, '项目单位', 3, 0, 0, 1508983676, 0, 0),
(18, '人员分类', 4, 0, 0, 1508983676, 0, 0),
(19, '中草药', 11, 0, 1, 1508983676, 0, 0),
(20, '中成药', 11, 0, 1, 1508983676, 0, 0),
(21, '化验类', 16, 1, 1, 1511948889, 1511948927, 0),
(22, '拍片类', 16, 1, 1, 1511948943, 0, 0),
(24, '处方类型', 1, 0, 0, 1563606234, 0, 1),
(25, '中药处方', 24, 1, 1, 1563606253, 0, 0),
(26, '西医处方', 24, 1, 1, 1563606262, 0, 0),
(27, '西成药', 11, 1, 1, 1564209661, 0, 0),
(28, '分装', 10, 1, 1, 1564215457, 0, 0),
(29, '先煎', 10, 1, 1, 1564215468, 0, 0),
(30, '药水搽拭', 7, 1, 1, 1564538266, 0, 0),
(31, '手术类', 16, 1, 1, 1565338430, 1565342998, 0),
(32, '体检类', 16, 1, 1, 1565921315, 1566001126, 0),
(33, '诊断类', 16, 1, 1, 1565958386, 0, 0);

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_doctor`
--

CREATE TABLE IF NOT EXISTS `dzm_his_doctor` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `true_name` varchar(20) NOT NULL DEFAULT '' COMMENT '用户个人资料真实姓名',
  `age` int(3) DEFAULT '0' COMMENT '年龄',
  `picture` varchar(255) DEFAULT '' COMMENT '头像',
  `sex` tinyint(1) NOT NULL DEFAULT '0' COMMENT '性别 0,空1:男  2:女',
  `background` tinyint(1) NOT NULL DEFAULT '0' COMMENT '学历 1：专科  2：本科  3：研究生  4：博士  5：博士后',
  `phone` varchar(11) NOT NULL DEFAULT '0' COMMENT '手机号',
  `mailbox` varchar(50) NOT NULL DEFAULT '' COMMENT '邮箱',
  `strong` varchar(255) NOT NULL DEFAULT '' COMMENT '擅长',
  `honor` varchar(255) NOT NULL DEFAULT '' COMMENT '荣誉',
  `introduction` text NOT NULL COMMENT '简介',
  `create_time` int(10) NOT NULL COMMENT '注册时间',
  `update_time` int(10) NOT NULL COMMENT '修改时间',
  `uid` int(11) NOT NULL COMMENT '用户表userid',
  PRIMARY KEY (`id`),
  KEY `uid` (`uid`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='医生基本信息表' AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `dzm_his_doctor`
--

INSERT INTO `dzm_his_doctor` (`id`, `true_name`, `age`, `picture`, `sex`, `background`, `phone`, `mailbox`, `strong`, `honor`, `introduction`, `create_time`, `update_time`, `uid`) VALUES
(1, 'root', 0, '', 0, 0, '0', '', '', '', '', 0, 0, 1);

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_hospital`
--

CREATE TABLE IF NOT EXISTS `dzm_his_hospital` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `hospital_name` varchar(20) NOT NULL DEFAULT '' COMMENT '医院名称',
  `picture` varchar(255) DEFAULT '' COMMENT '头像',
  `create_time` int(10) NOT NULL DEFAULT '0' COMMENT '注册时间',
  `hospital_number` varchar(50) NOT NULL DEFAULT '' COMMENT '医院编号',
  `update_time` int(10) NOT NULL DEFAULT '0' COMMENT '修改时间',
  `hid` int(11) NOT NULL COMMENT '用户表userid',
  `address` varchar(255) NOT NULL DEFAULT '' COMMENT '医院地址',
  `owner_name` varchar(20) NOT NULL DEFAULT '' COMMENT '所有者姓名',
  `owner_mobile` varchar(11) NOT NULL DEFAULT '' COMMENT '所有者手机号',
  `owner_post` varchar(50) NOT NULL DEFAULT '' COMMENT '所属者职务',
  `major_field` varchar(255) NOT NULL DEFAULT '' COMMENT '专业方向',
  `introduction` varchar(255) NOT NULL DEFAULT '' COMMENT '诊所简介',
  PRIMARY KEY (`id`),
  KEY `uid` (`hid`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='HIS医院基本信息表' AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `dzm_his_hospital`
--

INSERT INTO `dzm_his_hospital` (`id`, `hospital_name`, `picture`, `create_time`, `hospital_number`, `update_time`, `hid`, `address`, `owner_name`, `owner_mobile`, `owner_post`, `major_field`, `introduction`) VALUES
(1, '测试医院', '', 1511947869, '', 1566010377, 1, '增城区百花路2号力源大夏3楼', '郑工', '', '', '门诊', '    门诊');

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_inspectionfee`
--

CREATE TABLE IF NOT EXISTS `dzm_his_inspectionfee` (
  `ins_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `fee_id` int(11) NOT NULL COMMENT '检查项目自定义ID',
  `mid` int(10) NOT NULL DEFAULT '0' COMMENT '添加用户id',
  `hid` int(10) NOT NULL DEFAULT '0' COMMENT '医院id',
  `inspection_name` varchar(50) NOT NULL DEFAULT '' COMMENT '项目名称',
  `class` varchar(50) NOT NULL DEFAULT '' COMMENT '项目类别',
  `unit_price` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '项目单价',
  `cost` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '项目成本',
  `create_time` int(10) NOT NULL DEFAULT '0' COMMENT '创建时间',
  `update_time` int(10) NOT NULL DEFAULT '0' COMMENT '修改时间',
  `unit` varchar(50) NOT NULL DEFAULT '' COMMENT '单位',
  UNIQUE KEY `pre_id` (`ins_id`) USING BTREE,
  KEY `hid` (`hid`) USING BTREE,
  KEY `inspection_name` (`inspection_name`) USING BTREE,
  KEY `class` (`class`) USING BTREE
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='检查项目费用表' AUTO_INCREMENT=40 ;

--
-- 转存表中的数据 `dzm_his_inspectionfee`
--

INSERT INTO `dzm_his_inspectionfee` (`ins_id`, `fee_id`, `mid`, `hid`, `inspection_name`, `class`, `unit_price`, `cost`, `create_time`, `update_time`, `unit`) VALUES
(30, 1, 1, 1, '一般检查', '体检类', '5.00', '5.00', 1566272131, 0, '次'),
(22, 3, 1, 1, '超声骨密度', '体检类', '15.00', '15.00', 1566271794, 0, '次'),
(31, 15, 1, 1, '碳14呼气试验检测', '体检类', '150.00', '150.00', 1566272180, 0, '次'),
(24, 5, 1, 1, '胸部透视', '体检类', '20.00', '20.00', 1566271893, 0, '次'),
(25, 6, 1, 1, '腹部彩超', '体检类', '100.00', '100.00', 1566271918, 0, '次'),
(23, 9, 1, 1, '耳鼻喉科一般检查', '体检类', '10.00', '10.00', 1566271855, 0, '次'),
(32, 17, 1, 1, '内科检查', '体检类', '10.00', '10.00', 1566272205, 0, '次'),
(26, 8, 1, 1, '外科检查', '体检类', '10.00', '10.00', 1566271947, 0, '次'),
(27, 10, 1, 1, '动脉硬化检测', '体检类', '140.00', '140.00', 1566271983, 0, '次'),
(28, 11, 1, 1, '心电图', '体检类', '30.00', '30.00', 1566272028, 0, '次'),
(29, 12, 1, 1, '肺功能检测', '体检类', '80.00', '80.00', 1566272103, 0, '次'),
(33, 18, 1, 1, '妇科检查', '体检类', '20.00', '20.00', 1566272229, 0, '次'),
(35, 2398, 21, 1, '体检', '体检类', '2398.00', '2398.00', 1566347702, 1566441410, '次'),
(36, 45948, 1, 1, '头颅核磁', '体检类', '680.00', '680.00', 1566604323, 0, '次'),
(37, 45950, 1, 1, '甲状腺核磁', '体检类', '680.00', '680.00', 1566604353, 0, '次'),
(38, 45952, 1, 1, '颈椎核磁', '体检类', '680.00', '680.00', 1566604383, 0, '次'),
(39, 45953, 1, 1, '胸椎核磁', '体检类', '680.00', '680.00', 1566604411, 0, '次');

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_inventory`
--

CREATE TABLE IF NOT EXISTS `dzm_his_inventory` (
  `inventory_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '库存ID',
  `hmr_id` int(10) NOT NULL COMMENT '药品ID',
  `company_id` int(10) NOT NULL COMMENT '诊所ID',
  `inventory_num` bigint(20) NOT NULL COMMENT '库存数量',
  `inventory_unit` varchar(50) NOT NULL COMMENT '单位',
  `inventory_trade_price` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '批发价',
  `inventory_prescription_price` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '处方价',
  `inventory_trade_total_amount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '批发额',
  `inventory_prescription_total_amount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '处方额',
  `early_warning` varchar(50) NOT NULL DEFAULT '0' COMMENT '库存预警',
  `update_time` int(11) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`inventory_id`),
  KEY `hmr_id` (`hmr_id`) USING BTREE,
  KEY `company_id` (`company_id`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='库存表' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_medicines`
--

CREATE TABLE IF NOT EXISTS `dzm_his_medicines` (
  `medicines_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `medicines_number` varchar(60) NOT NULL DEFAULT '' COMMENT '药品编号',
  `medicines_name` varchar(120) NOT NULL DEFAULT '' COMMENT '药品名称',
  `medicines_class` varchar(50) NOT NULL DEFAULT '' COMMENT '药品分类 ',
  `prescription_type` varchar(50) NOT NULL DEFAULT '' COMMENT '处方类型',
  `unit` varchar(50) NOT NULL DEFAULT '' COMMENT '单位（g/条）',
  `conversion` int(10) NOT NULL DEFAULT '1' COMMENT '换算量',
  `specs` varchar(50) NOT NULL DEFAULT '',
  `keywords` varchar(255) NOT NULL DEFAULT '' COMMENT '关键字',
  `create_time` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '创建时间',
  `update_time` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '修改时间',
  `producter` varchar(50) DEFAULT '' COMMENT '生产厂家',
  PRIMARY KEY (`medicines_id`),
  KEY `goods_sn` (`medicines_number`) USING BTREE,
  KEY `last_update` (`update_time`) USING BTREE,
  KEY `medicines_name` (`medicines_name`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='药品信息表' AUTO_INCREMENT=543 ;

--
-- 转存表中的数据 `dzm_his_medicines`
--

INSERT INTO `dzm_his_medicines` (`medicines_id`, `medicines_number`, `medicines_name`, `medicines_class`, `prescription_type`, `unit`, `conversion`, `specs`, `keywords`, `create_time`, `update_time`, `producter`) VALUES
(532, 'dzm485', '当归', '中草药', '中药处方', 'g', 1, '', 'dg', 1564203619, 0, '第三方'),
(533, 'dzm168', '双料喉风散', '中成药', '西医处方', '瓶', 1, '', 'slhfs', 1564208475, 1565259431, '广东嘉应制药股份有限公司'),
(534, 'dzm548', '六味地黄丸', '中成药', '西医处方', '瓶', 1, '', 'lw', 1564209288, 1565259424, ''),
(535, 'dzm945', '蜈蚣', '中成药', '中药处方', '条', 1, '', 'wg', 1564209328, 1565258861, ''),
(536, 'dzm012', '牛黄解毒片', '西成药', '西医处方', '片', 1, '5颗/片', 'nhjdp', 1564211722, 1565254664, '北京同仁堂'),
(537, 'dmz102', '枸杞', '中成药', '中药处方', 'g', 1, 'g', 'w', 1564389813, 1565258391, '佛山'),
(538, 'dsn121', '枇杷露', '中成药', '中药处方', '瓶', 1, '150ml/瓶', '止咳', 1565255222, 0, '康美'),
(539, '1212', '苯丁酸氮芥', '西成药', '西医处方', '瓶', 1, '500g/瓶', '测试', 1565959397, 1565959421, '测试'),
(540, '003', '氮芥', '西成药', '西医处方', '颗', 1, '60g/颗', '氮芥', 1565959717, 0, '测试'),
(541, '0034', '口腔炎喷雾剂', '西成药', '西医处方', 'g', 1, '', '口腔', 1565959817, 0, ''),
(542, '0008', '丁细牙痛胶囊', '西成药', '西医处方', '颗', 1, '10g/颗', '测试', 1565959902, 0, '');

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_member`
--

CREATE TABLE IF NOT EXISTS `dzm_his_member` (
  `uid` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(20) DEFAULT NULL COMMENT '登录名',
  `password` varchar(60) DEFAULT NULL COMMENT '登录密码',
  `create_time` int(10) DEFAULT NULL COMMENT '注册时间',
  `status` tinyint(1) DEFAULT '1' COMMENT '是否允许用户登录( 1 是  2否) 3 删除',
  `p_id` int(11) DEFAULT '1' COMMENT '医院id，用于区分用户类型及其医生所属诊所',
  `type` tinyint(2) DEFAULT '8' COMMENT '1,管理员，2，医生，3.护士，4，挂号员，5，收费员6，发药员，7，财务8，其他人员',
  `department_id` int(11) DEFAULT '1' COMMENT '科室id',
  `rank` tinyint(2) DEFAULT '0' COMMENT '医生级别 0:其他  1:主治医师  2:副主任医师  3:主任医师  4:医士  5:医师  6:助理医师  7:实习医师  8:主管护师  9:护师  10:护士  11:医师助理  12:研究生  13:随访员 ',
  `update_time` int(10) DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`uid`),
  KEY `user_name` (`user_name`) USING BTREE,
  KEY `status` (`status`) USING BTREE,
  KEY `p_id` (`p_id`) USING BTREE,
  KEY `type` (`type`) USING BTREE,
  KEY `department_id` (`department_id`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='HIS用户表' AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `dzm_his_member`
--

INSERT INTO `dzm_his_member` (`uid`, `user_name`, `password`, `create_time`, `status`, `p_id`, `type`, `department_id`, `rank`, `update_time`) VALUES
(1, 'root', 'root', 1, 1, 1, 2, 1, 1, 1);

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_operation_log`
--

CREATE TABLE IF NOT EXISTS `dzm_his_operation_log` (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL COMMENT '用户ID',
  `operation` varchar(64) NOT NULL COMMENT '具体操作',
  `details` varchar(100) NOT NULL,
  `optime` int(10) NOT NULL DEFAULT '0' COMMENT '操作时间',
  PRIMARY KEY (`oid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='诊所系统操作记录表' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_patient_file`
--

CREATE TABLE IF NOT EXISTS `dzm_his_patient_file` (
  `file_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `patient_id` int(10) NOT NULL DEFAULT '0' COMMENT '患者id',
  `emergency_contact_name` varchar(50) NOT NULL DEFAULT '' COMMENT '紧急联系人',
  `emergency_contact_mobile` varchar(11) NOT NULL DEFAULT '' COMMENT '紧急联系人电话',
  `emergency_contact_relation` tinyint(2) NOT NULL DEFAULT '0' COMMENT '紧急联系人关系 1：爸爸  2：妈妈  3：儿子  4：女儿  5：亲戚  6：朋友',
  `left_ear_hearing` tinyint(1) NOT NULL DEFAULT '0' COMMENT '左耳听力 1：正常  2：耳聋',
  `right_ear_hearing` tinyint(1) NOT NULL DEFAULT '0' COMMENT '右耳听力 1：正常  2：耳聋',
  `left_vision` decimal(10,1) NOT NULL COMMENT '左眼视力',
  `update_time` int(10) NOT NULL DEFAULT '0' COMMENT '修改时间',
  `right_vision` decimal(10,1) NOT NULL COMMENT '右眼视力',
  `height` decimal(10,1) NOT NULL COMMENT '身高',
  `weight` decimal(10,1) NOT NULL COMMENT '体重',
  `blood_type` text NOT NULL COMMENT '血型 1:A 2:B 3:AB 4:O    Rh血型 1:阴性 2:阳性',
  `create_time` int(10) NOT NULL DEFAULT '0' COMMENT '创建时间',
  `personal_info` varchar(100) NOT NULL DEFAULT '' COMMENT '个人史',
  `family_info` varchar(100) NOT NULL DEFAULT '' COMMENT '家族史',
  PRIMARY KEY (`file_id`),
  UNIQUE KEY `patient_id` (`patient_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='患者用户档案表' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_prescription_extracharges`
--

CREATE TABLE IF NOT EXISTS `dzm_his_prescription_extracharges` (
  `pre_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `mid` int(10) NOT NULL DEFAULT '0' COMMENT '添加用户id',
  `hid` int(10) NOT NULL DEFAULT '0' COMMENT '医院id',
  `extracharges_name` varchar(50) NOT NULL DEFAULT '' COMMENT '处方附加费名称',
  `fee` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '金额',
  `type` varchar(50) NOT NULL DEFAULT '0' COMMENT '处方类型  0:中药处方  1:西药处方',
  `create_time` int(10) NOT NULL DEFAULT '0' COMMENT '创建时间',
  `update_time` int(10) NOT NULL DEFAULT '0' COMMENT '修改时间',
  UNIQUE KEY `pre_id` (`pre_id`) USING BTREE,
  KEY `extracharges_name` (`extracharges_name`),
  KEY `hid` (`hid`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='处方附加费用表' AUTO_INCREMENT=4 ;

--
-- 转存表中的数据 `dzm_his_prescription_extracharges`
--

INSERT INTO `dzm_his_prescription_extracharges` (`pre_id`, `mid`, `hid`, `extracharges_name`, `fee`, `type`, `create_time`, `update_time`) VALUES
(3, 1, 1, '补挂号费', '1.00', '西医处方', 1563613160, 1565956717);

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_purchase`
--

CREATE TABLE IF NOT EXISTS `dzm_his_purchase` (
  `purchase_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '采购信息ID',
  `medicines_id` int(10) NOT NULL COMMENT '医院药品关联表：hmr_id',
  `batches_of_inventory_id` int(10) NOT NULL COMMENT '批次库存ID',
  `purchase_num` int(10) NOT NULL COMMENT '采购数量',
  `purchase_unit` varchar(50) NOT NULL COMMENT '采购单位',
  `purchase_trade_price` decimal(10,2) NOT NULL COMMENT '批发价',
  `purchase_prescription_price` decimal(10,2) NOT NULL COMMENT '处方价',
  `purchase_trade_total_amount` decimal(10,2) NOT NULL COMMENT '采购批发总额',
  `purchase_prescription_total_amount` decimal(10,2) NOT NULL COMMENT '采购处方总额',
  `create_time` int(11) NOT NULL COMMENT '创建时间',
  `hmr_id` int(10) unsigned DEFAULT '0',
  PRIMARY KEY (`purchase_id`),
  KEY `medicines_id` (`medicines_id`) USING BTREE,
  KEY `batches_of_inventory_id` (`batches_of_inventory_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购信息表' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_registeredfee`
--

CREATE TABLE IF NOT EXISTS `dzm_his_registeredfee` (
  `reg_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `mid` int(11) NOT NULL COMMENT '用户id',
  `company_id` int(11) NOT NULL COMMENT '公司ID',
  `registeredfee_name` varchar(255) NOT NULL COMMENT '挂号费用名称',
  `registeredfee_fee` decimal(8,2) unsigned NOT NULL COMMENT '金额',
  `registeredfee_sub_fee` decimal(8,2) unsigned NOT NULL COMMENT '子费用总数',
  `registeredfee_aggregate_amount` decimal(8,2) unsigned NOT NULL COMMENT '挂号费用总金额',
  `numberOfSub` int(5) NOT NULL COMMENT '子费用数量',
  `create_time` int(10) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`reg_id`),
  KEY `mid` (`mid`) USING BTREE,
  KEY `company_id` (`company_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='挂号费用表' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_registeredfee_sub`
--

CREATE TABLE IF NOT EXISTS `dzm_his_registeredfee_sub` (
  `reg_sub_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `reg_id` int(10) unsigned NOT NULL COMMENT '挂号费用ID',
  `sub_registeredfee_name` varchar(255) NOT NULL COMMENT '挂号费用子名称',
  `sub_registeredfee_fee` decimal(8,2) NOT NULL COMMENT '子费用 ',
  PRIMARY KEY (`reg_sub_id`),
  KEY `reg_id` (`reg_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='挂号费用子表' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_registration`
--

CREATE TABLE IF NOT EXISTS `dzm_his_registration` (
  `registration_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `patient_id` int(10) NOT NULL COMMENT '患者ID',
  `physician_id` int(10) NOT NULL COMMENT '医生ID',
  `operator_id` int(10) NOT NULL COMMENT '操作员ID',
  `company_id` int(10) NOT NULL COMMENT '诊所ID',
  `department_id` int(10) NOT NULL COMMENT '科室ID',
  `registeredfee_id` int(10) NOT NULL COMMENT '挂号费用ID',
  `registration_amount` float(8,2) NOT NULL COMMENT '挂号总金额',
  `registration_number` bigint(20) NOT NULL COMMENT '挂号编号',
  `registration_status` tinyint(2) NOT NULL DEFAULT '1' COMMENT '挂号状态,1为待就诊，3为已退号，2为已就诊,4为作废，5,为未付款,6，为部分支付',
  `scheduling_id` int(10) NOT NULL COMMENT '排班主表ID',
  `scheduling_subsection_id` int(10) NOT NULL COMMENT '排班时段表ID',
  `scheduling_week_id` int(10) NOT NULL COMMENT '排班星期表ID',
  `create_time` int(11) NOT NULL,
  `update_time` int(11) NOT NULL DEFAULT '0' COMMENT '更新时间',
  `pkg_id` int(10) unsigned DEFAULT '0' COMMENT '收费总表care_pkg.id',
  PRIMARY KEY (`registration_id`),
  KEY `patient_id` (`patient_id`) USING BTREE,
  KEY `physician_id` (`physician_id`) USING BTREE,
  KEY `operator_id` (`operator_id`) USING BTREE,
  KEY `company_id` (`company_id`) USING BTREE,
  KEY `department_id` (`department_id`) USING BTREE,
  KEY `registeredfee_id` (`registeredfee_id`) USING BTREE,
  KEY `registration_status` (`registration_status`) USING BTREE,
  KEY `scheduling_id` (`scheduling_id`) USING BTREE,
  KEY `pkg_id` (`pkg_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='门诊挂号' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_scheduling`
--

CREATE TABLE IF NOT EXISTS `dzm_his_scheduling` (
  `scheduling_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `physicianid` int(10) NOT NULL COMMENT '医生ID',
  `department_id` int(10) NOT NULL COMMENT '科室ID',
  `company_id` int(10) NOT NULL COMMENT '诊所ID',
  `start_time_this_week` varchar(50) NOT NULL COMMENT '本周开始时间',
  `end_time_this_week` varchar(50) NOT NULL COMMENT '本周结束时间',
  `create_time` int(11) NOT NULL COMMENT '创建时间',
  `update_time` int(11) NOT NULL DEFAULT '0' COMMENT '更新时间',
  PRIMARY KEY (`scheduling_id`),
  KEY `physicianid` (`physicianid`) USING BTREE,
  KEY `department_id` (`department_id`) USING BTREE,
  KEY `company_id` (`company_id`) USING BTREE,
  KEY `start_time_this_week` (`start_time_this_week`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='我的排班' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_scheduling_subsection`
--

CREATE TABLE IF NOT EXISTS `dzm_his_scheduling_subsection` (
  `scheduling_subsection_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `subsection_type` int(2) NOT NULL COMMENT '每天的时段：上午：1；下午：2；晚上：3；',
  `scheduling_id` int(10) NOT NULL COMMENT '排班id',
  PRIMARY KEY (`scheduling_subsection_id`),
  KEY `subsection_type` (`subsection_type`) USING BTREE,
  KEY `scheduling_id` (`scheduling_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='排班时段表' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_scheduling_week`
--

CREATE TABLE IF NOT EXISTS `dzm_his_scheduling_week` (
  `scheduling_week_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `date` varchar(255) NOT NULL COMMENT '时间',
  `week` int(2) NOT NULL COMMENT '星期一：1；星期二：2；星期三：3；星期四：4；星期五：5；星期六：6；星期日：0',
  `registeredfee_id` int(10) DEFAULT NULL COMMENT '挂号费用ID',
  `scheduling_subsection_id` int(10) unsigned NOT NULL COMMENT '排班分段ID',
  PRIMARY KEY (`scheduling_week_id`),
  KEY `date` (`date`) USING BTREE,
  KEY `week` (`week`) USING BTREE,
  KEY `registeredfee_id` (`registeredfee_id`) USING BTREE,
  KEY `scheduling_subsection_id` (`scheduling_subsection_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='排班星期表' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_storage_log`
--

CREATE TABLE IF NOT EXISTS `dzm_his_storage_log` (
  `log_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '更改价格表',
  `company_id` int(10) NOT NULL COMMENT '诊所ID',
  `purchase_id` int(10) NOT NULL COMMENT '采购信息ID',
  `batches_of_inventory_number` bigint(20) NOT NULL COMMENT '批次库存编号',
  `medicines_id` int(10) NOT NULL COMMENT '药品ID',
  `modifier_id` int(10) NOT NULL COMMENT '修改人ID',
  `new_quantity` int(10) NOT NULL,
  `new_trade_price` decimal(10,2) NOT NULL COMMENT '新批发价',
  `new_prescription_price` decimal(10,2) NOT NULL COMMENT '新处方价',
  `old_quantity` int(10) NOT NULL COMMENT '原数量',
  `old_trade_price` decimal(10,2) NOT NULL COMMENT '原批发价',
  `old_prescription_price` decimal(10,2) NOT NULL COMMENT '原处方价',
  `operation_module` tinyint(3) NOT NULL COMMENT '操作模块；采购：1，审核：2',
  `create_time` int(11) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='入库操作log日志表' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_supplier`
--

CREATE TABLE IF NOT EXISTS `dzm_his_supplier` (
  `sid` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `supplier_name` varchar(100) NOT NULL DEFAULT '' COMMENT '供应商名称',
  `contact_name` varchar(50) NOT NULL DEFAULT '' COMMENT '联系人名称',
  `contact_mobile` varchar(11) NOT NULL DEFAULT '' COMMENT '联系人手机',
  `contact_telephone` varchar(20) NOT NULL DEFAULT '' COMMENT '联系人电话',
  `bank_account` varchar(50) NOT NULL DEFAULT '' COMMENT '银行账号',
  `address` varchar(100) NOT NULL DEFAULT '' COMMENT '供应商地址',
  `hospital_id` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '医院id',
  `create_time` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '创建时间',
  `update_time` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '更新时间',
  PRIMARY KEY (`sid`),
  KEY `hospital_id` (`hospital_id`) USING BTREE,
  KEY `update_time` (`update_time`) USING BTREE,
  KEY `supplier_name` (`supplier_name`),
  KEY `contact_name` (`contact_name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='供应商表' AUTO_INCREMENT=5 ;

--
-- 转存表中的数据 `dzm_his_supplier`
--

INSERT INTO `dzm_his_supplier` (`sid`, `supplier_name`, `contact_name`, `contact_mobile`, `contact_telephone`, `bank_account`, `address`, `hospital_id`, `create_time`, `update_time`) VALUES
(2, '测试供应商', '张小明', '15625430452', '010-34556343', '62543045244475555555', '佛山', 1, 1563624459, 1564471750),
(4, '供应商测试', '请求', '13577477895', '', '7865145464646464', '佛山南海', 1, 1564471853, 1564471860);

-- --------------------------------------------------------

--
-- 表的结构 `dzm_his_work_log`
--

CREATE TABLE IF NOT EXISTS `dzm_his_work_log` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tab_name` varchar(32) DEFAULT '' COMMENT '关联表名',
  `rel_id` int(10) unsigned DEFAULT '0' COMMENT '操作相关id',
  `title` varchar(128) DEFAULT NULL COMMENT '操作说明',
  `addtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '操作时间',
  `session` varchar(255) DEFAULT NULL COMMENT '操作者session',
  `cookie` varchar(255) DEFAULT NULL COMMENT '操作者cookie',
  `ip` varchar(32) DEFAULT NULL COMMENT '操作IP',
  `dev_info` varchar(255) DEFAULT NULL COMMENT '开发信息',
  PRIMARY KEY (`id`),
  KEY `tab_name` (`tab_name`),
  KEY `rel_id` (`rel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='重要操作记录' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `dzm_patient`
--

CREATE TABLE IF NOT EXISTS `dzm_patient` (
  `patient_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) NOT NULL DEFAULT '',
  `mobile` varchar(11) NOT NULL DEFAULT '' COMMENT '患者电话',
  `update_time` int(10) NOT NULL COMMENT '修改时间',
  `sex` tinyint(2) DEFAULT '0' COMMENT '患者性别1男2女',
  `birthday` varchar(50) DEFAULT NULL,
  `id_card` char(18) DEFAULT NULL,
  `mi_card` varchar(128) DEFAULT NULL,
  `address` varchar(120) DEFAULT NULL COMMENT '地址信息',
  `create_time` int(10) NOT NULL DEFAULT '0' COMMENT '注册时间',
  `allergy_info` varchar(100) DEFAULT NULL COMMENT '过敏信息',
  `is_del` tinyint(1) DEFAULT '0' COMMENT '是否移除 0：正常 1：删除',
  PRIMARY KEY (`patient_id`),
  KEY `name` (`name`),
  KEY `tel` (`mobile`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='患者用户表' AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
