package com.bdqn.tcmp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bdqn.tcmp.entity.SpecialTrain;
import com.bdqn.tcmp.service.SpecialTrainSercice;

@Controller
@RequestMapping("SpecialTrain")
public class SpecialTrainController {

	@Resource
	private SpecialTrainSercice specialTrainSercice;

	@RequestMapping("insertspecialTrain")
	@ResponseBody
	public Integer insertspecialTrain(SpecialTrain obj) {
		return specialTrainSercice.insertspecialTrain(obj);
	}

	@RequestMapping("selectSpecialTrainByStudentAndSkillId")
	@ResponseBody
	public List<SpecialTrain> selectSpecialTrainByStudentAndSkillId(Integer studentId, Integer skillId) {
		return specialTrainSercice.selectSpecialTrainByStudentAndSkillId(studentId, skillId);
	}

	@RequestMapping("selectSpecialTrainPHByClassId")
	@ResponseBody
	public List<SpecialTrain> selectSpecialTrainPHByClassId(Integer classId) {
		return specialTrainSercice.selectSpecialTrainPHByClassId(classId);
	}

	@RequestMapping("selectSpecialTrainPH")
	@ResponseBody
	public List<SpecialTrain> selectSpecialTrainPH() {
		return specialTrainSercice.selectSpecialTrainPH();
	}

	@RequestMapping("selectSpecialTrainBySkillIdAndStudentIdReturnCount")
	@ResponseBody
	public Integer selectSpecialTrainBySkillIdAndStudentIdReturnCount(Integer studentId, Integer skillId) {
		return specialTrainSercice.selectSpecialTrainBySkillIdAndStudentIdReturnCount(studentId, skillId);
	}

	@RequestMapping("updateSpecialTrainBySkillIdAndStudentId")
	@ResponseBody
	public Integer updateSpecialTrainBySkillIdAndStudentId(Integer studentId, Integer skillId) {
		return specialTrainSercice.updateSpecialTrainBySkillIdAndStudentId(studentId, skillId);
	}
	// selectSpecialTrainByStudentAndSkillCount

	@RequestMapping("selectSpecialTrainByStudentAndSkillCount")
	@ResponseBody
	public List<SpecialTrain> selectSpecialTrainByStudentAndSkillCount(Integer studentId) {
		return specialTrainSercice.selectSpecialTrainByStudentAndSkillCount(studentId);
	}
}
