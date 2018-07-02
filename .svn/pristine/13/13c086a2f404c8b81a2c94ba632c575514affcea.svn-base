package com.bdqn.tcmp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.mapper.SpecialTrainMapper;
import com.bdqn.tcmp.entity.SpecialTrain;
import com.bdqn.tcmp.service.SpecialTrainSercice;

@Service("specialTrainSercice")
public class SpecialTrainSerciceImpl implements SpecialTrainSercice {

	@Resource
	private SpecialTrainMapper specialTrainMapper;


	public Integer insertspecialTrain(SpecialTrain obj) {
		// TODO Auto-generated method stub
		return specialTrainMapper.insertspecialTrain(obj);
	}


	public List<SpecialTrain> selectSpecialTrainByStudentAndSkillId(Integer studentId, Integer skillId) {
		// TODO Auto-generated method stub
		return specialTrainMapper.selectSpecialTrainByStudentAndSkillId(studentId, skillId);
	}


	public List<SpecialTrain> selectSpecialTrainPHByClassId(Integer classId) {
		// TODO Auto-generated method stub
		return specialTrainMapper.selectSpecialTrainPHByClassId(classId);
	}


	public Integer selectSpecialTrainBySkillIdAndStudentIdReturnCount(Integer studentId, Integer skillId) {
		// TODO Auto-generated method stub
		return specialTrainMapper.selectSpecialTrainBySkillIdAndStudentIdReturnCount(studentId, skillId);
	}


	public Integer updateSpecialTrainBySkillIdAndStudentId(Integer studentId, Integer skillId) {
		// TODO Auto-generated method stub
		return specialTrainMapper.updateSpecialTrainBySkillIdAndStudentId(studentId, skillId);
	}


	public List<SpecialTrain> selectSpecialTrainByStudentAndSkillCount(Integer studentId) {
		// TODO Auto-generated method stub
		return specialTrainMapper.selectSpecialTrainByStudentAndSkillCount(studentId);
	}


	public List<SpecialTrain> selectSpecialTrainPH() {
		// TODO Auto-generated method stub
		return specialTrainMapper.selectSpecialTrainPH();
	}

}
