-- 6月6日更新
ALTER TABLE `approval`
ADD COLUMN `studentId`  int(11) NULL AFTER `bzrAgreeDate`;
ALTER TABLE `student`
MODIFY COLUMN `studentCode`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '登录用户名' AFTER `uuId`,
MODIFY COLUMN `custromjCount`  int(11) NULL DEFAULT 0 AFTER `age`;


ALTER TABLE 	activities	 COMMENT='志愿服务';
ALTER TABLE 	activitiesdetail	 COMMENT='志愿服务明细';
ALTER TABLE 	approval	 COMMENT='待我审批';
ALTER TABLE 	article	 COMMENT='文章';
ALTER TABLE 	attendancel	 COMMENT='学生考勤';
ALTER TABLE 	blog	 COMMENT='博客';
ALTER TABLE 	blogmessage	 COMMENT='博客留言';
ALTER TABLE 	class	 COMMENT='班级';
ALTER TABLE 	classroom	 COMMENT='班级关联摄像头';
ALTER TABLE 	customtest	 COMMENT='定制测试';
ALTER TABLE 	custromjl	 COMMENT='定制测试记录';
ALTER TABLE 	dictionary	 COMMENT='数据字典';
ALTER TABLE 	dictionarydetail	 COMMENT='数据字典明细';
ALTER TABLE 	duty	 COMMENT='职务';
ALTER TABLE 	employment	 COMMENT='就业情况';
ALTER TABLE 	evaluation	 COMMENT='老师点评';
ALTER TABLE 	evaluationdetail	 COMMENT='老师点评明细';
ALTER TABLE 	evaluationteacher	 COMMENT='评教评学（老师测评）';
ALTER TABLE 	evateacherdetail	 COMMENT='测评明细';
ALTER TABLE 	graduationexam	 COMMENT='结业考试';
ALTER TABLE 	homework	 COMMENT='家庭作业';
ALTER TABLE 	lesson	 COMMENT='班级课表';
ALTER TABLE 	mailbox	 COMMENT='校长信箱';
ALTER TABLE 	notice	 COMMENT='公告通知';
ALTER TABLE 	opictype	 COMMENT='题目类型';
ALTER TABLE 	parent	 COMMENT='家长信息';
ALTER TABLE 	progress	 COMMENT='自学进度';
ALTER TABLE 	questiondetail	 COMMENT='定制试卷明细表';
ALTER TABLE 	questionpaper	 COMMENT='定制试卷表';
ALTER TABLE 	situation	 COMMENT='学员情况';
ALTER TABLE 	skill	 COMMENT='知识点';
ALTER TABLE 	specialtrain	 COMMENT='技能自测明细';
ALTER TABLE 	specialtrainscore	 COMMENT='技能自测成绩';
ALTER TABLE 	specialtraintest	 COMMENT='技能自测主表';
ALTER TABLE 	student	 COMMENT='学生信息';
ALTER TABLE 	task	 COMMENT='任务计划';
ALTER TABLE 	taskdetail	 COMMENT='任务明细';
ALTER TABLE 	teacher	 COMMENT='教师信息';
ALTER TABLE 	testbg	 COMMENT='统一测试报告表';
ALTER TABLE 	testscore	 COMMENT='定制测试明细表';
ALTER TABLE 	topic	 COMMENT='试题信息';
ALTER TABLE 	visit	 COMMENT='回访记录';
ALTER TABLE 	vote	 COMMENT='参与决策';
ALTER TABLE 	votedetail	 COMMENT='参与决策明细';
ALTER TABLE 	workhistory	 COMMENT='作业历史记录';
ALTER TABLE 	workimages	 COMMENT='作业截图';
ALTER TABLE 	worklog	 COMMENT='作业日志记录';
ALTER TABLE 	workplan	 COMMENT='作业生成计划';
ALTER TABLE 	workstudent	 COMMENT='学生作业表';


DROP TABLE IF EXISTS `dictionary`;
CREATE TABLE `dictionary` (
  `dictionaryID` int(11) NOT NULL AUTO_INCREMENT COMMENT '字典编号',
  `dictionaryName` varchar(255) DEFAULT NULL COMMENT '名称',
  `dictionaryCode` varchar(255) DEFAULT NULL,
  `isEnabled` int(11) DEFAULT '1' COMMENT '是否启用',
  PRIMARY KEY (`dictionaryID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dictionary
-- ----------------------------
INSERT INTO `dictionary` VALUES ('1', '考试类型', 'examType', '1');
INSERT INTO `dictionary` VALUES ('2', '职务类型', 'teacherType', '1');
INSERT INTO `dictionary` VALUES ('3', '题目类型', 'opictypeType', '1');
INSERT INTO `dictionary` VALUES ('4', '考勤类型', 'arriveType', '1');
INSERT INTO `dictionary` VALUES ('5', '请假类型', 'leaveType', '1');

DROP TABLE IF EXISTS `dictionarydetail`;
CREATE TABLE `dictionarydetail` (
  `detailID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `dictionaryID` int(11) DEFAULT NULL COMMENT '字典编号',
  `attrName` varchar(255) DEFAULT NULL COMMENT '属性名称',
  `showOrder` int(11) DEFAULT NULL COMMENT '显示顺序',
  `isEnabled` int(11) DEFAULT '1' COMMENT '是否启用',
  PRIMARY KEY (`detailID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dictionarydetail
-- ----------------------------
INSERT INTO `dictionarydetail` VALUES ('1', '1', '日考', '1', '1');
INSERT INTO `dictionarydetail` VALUES ('2', '1', '周考', '2', '1');
INSERT INTO `dictionarydetail` VALUES ('3', '1', '月考', '3', '1');
INSERT INTO `dictionarydetail` VALUES ('4', '2', '校长', '3', '1');
INSERT INTO `dictionarydetail` VALUES ('5', '2', '教学主管', '2', '1');
INSERT INTO `dictionarydetail` VALUES ('6', '2', '就业主管', '3', '1');
INSERT INTO `dictionarydetail` VALUES ('7', '2', '教员', '4', '1');
INSERT INTO `dictionarydetail` VALUES ('8', '2', '班主任', '5', '1');
INSERT INTO `dictionarydetail` VALUES ('9', '3', '选择', '1', '1');
INSERT INTO `dictionarydetail` VALUES ('10', '3', '填空', '2', '1');
INSERT INTO `dictionarydetail` VALUES ('11', '3', '判断', '3', '1');
INSERT INTO `dictionarydetail` VALUES ('12', '3', '简答', '4', '1');
INSERT INTO `dictionarydetail` VALUES ('13', '3', '上机', '5', '1');
INSERT INTO `dictionarydetail` VALUES ('14', '4', '正常', '1', '1');
INSERT INTO `dictionarydetail` VALUES ('15', '4', '迟到', '2', '1');
INSERT INTO `dictionarydetail` VALUES ('16', '4', '请假', '3', '1');
INSERT INTO `dictionarydetail` VALUES ('17', '4', '旷课', '4', '1');
INSERT INTO `dictionarydetail` VALUES ('18', '4', '早退', '5', '1');
INSERT INTO `dictionarydetail` VALUES ('19', '5', '病假', '1', '1');
INSERT INTO `dictionarydetail` VALUES ('20', '5', '事假', '2', '1');



-- 6月5日更新

ALTER TABLE `parent`
  MODIFY COLUMN `address`  varchar(255) NOT NULL COMMENT '地址' AFTER `password`,
  MODIFY COLUMN `loginIp`  varchar(30) NOT NULL COMMENT '最后登录ip' AFTER `address`;

ALTER TABLE `parent`
  DROP COLUMN `studentID`;
-- 学生和家长对应表
CREATE TABLE `stuparent` (
  `stuParentID`  int NOT NULL AUTO_INCREMENT COMMENT '编号' ,
  `studentID`  int NULL COMMENT '学生编号' ,
  `parentID`  int NULL COMMENT '家长编号' ,
  PRIMARY KEY (`stuParentID`)
);

-- 6月4日更新
ALTER TABLE `specialtrain`
ADD COLUMN `totalTime`  int NULL COMMENT '总用时' AFTER `skillIdcount`;

ALTER TABLE `workhistory`
ADD COLUMN `isComplete`  smallint NULL COMMENT '是否完成' AFTER `createDate`;

ALTER TABLE `specialtrain`
ADD COLUMN `submitTime`  datetime NULL COMMENT '提交时间' AFTER `totalTime`;

-- 表名称说明
ALTER TABLE 	activities	 COMMENT='志愿服务';
ALTER TABLE 	activitiesdetail	 COMMENT='志愿服务明细';
ALTER TABLE 	approval	 COMMENT='待我审批';
ALTER TABLE 	article	 COMMENT='文章';
ALTER TABLE 	attendancel	 COMMENT='学生考勤';
ALTER TABLE 	blog	 COMMENT='博客';
ALTER TABLE 	blogmessage	 COMMENT='博客留言';
ALTER TABLE 	class	 COMMENT='班级';
ALTER TABLE 	classroom	 COMMENT='班级关联摄像头';
ALTER TABLE 	customtest	 COMMENT='定制测试';
ALTER TABLE 	custromjl	 COMMENT='定制测试记录';
ALTER TABLE 	dictionary	 COMMENT='数据字典';
ALTER TABLE 	dictionarydetail	 COMMENT='数据字典明细';
ALTER TABLE 	duty	 COMMENT='职务';
ALTER TABLE 	employment	 COMMENT='就业情况';
ALTER TABLE 	evaluation	 COMMENT='老师点评';
ALTER TABLE 	evaluationdetail	 COMMENT='老师点评明细';
ALTER TABLE 	evaluationteacher	 COMMENT='评教评学（老师测评）';
ALTER TABLE 	evateacherdetail	 COMMENT='测评明细';
ALTER TABLE 	graduationexam	 COMMENT='结业考试';
ALTER TABLE 	homework	 COMMENT='家庭作业';
ALTER TABLE 	lesson	 COMMENT='班级课表';
ALTER TABLE 	mailbox	 COMMENT='校长信箱';
ALTER TABLE 	notice	 COMMENT='公告通知';
ALTER TABLE 	opictype	 COMMENT='题目类型';
ALTER TABLE 	parent	 COMMENT='家长信息';
ALTER TABLE 	progress	 COMMENT='自学进度';
ALTER TABLE 	questiondetail	 COMMENT='定制试卷明细表';
ALTER TABLE 	questionpaper	 COMMENT='定制试卷表';
ALTER TABLE 	situation	 COMMENT='学员情况';
ALTER TABLE 	skill	 COMMENT='知识点';
ALTER TABLE 	specialtrain	 COMMENT='技能自测明细';
ALTER TABLE 	specialtrainscore	 COMMENT='技能自测成绩';
ALTER TABLE 	specialtraintest	 COMMENT='技能自测主表';
ALTER TABLE 	student	 COMMENT='学生信息';
ALTER TABLE 	task	 COMMENT='任务计划';
ALTER TABLE 	taskdetail	 COMMENT='任务明细';
ALTER TABLE 	teacher	 COMMENT='教师信息';
ALTER TABLE 	testbg	 COMMENT='统一测试报告表';
ALTER TABLE 	testscore	 COMMENT='定制测试明细表';
ALTER TABLE 	topic	 COMMENT='试题信息';
ALTER TABLE 	visit	 COMMENT='回访记录';
ALTER TABLE 	vote	 COMMENT='参与决策';
ALTER TABLE 	votedetail	 COMMENT='参与决策明细';
ALTER TABLE 	workhistory	 COMMENT='作业历史记录';
ALTER TABLE 	workimages	 COMMENT='作业截图';
ALTER TABLE 	worklog	 COMMENT='作业日志记录';
ALTER TABLE 	workplan	 COMMENT='作业生成计划';
ALTER TABLE 	workstudent	 COMMENT='学生作业表';
