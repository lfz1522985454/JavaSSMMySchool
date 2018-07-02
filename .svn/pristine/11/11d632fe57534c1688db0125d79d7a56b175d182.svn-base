package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.CustomTestDTO;
import com.bdqn.tcmp.dto.CustomTestResultDTO;
import com.bdqn.tcmp.entity.CustomTest;
import com.bdqn.tcmp.mapper.CustomTestMapper;
import com.bdqn.tcmp.service.CustomTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("customTestService")
public class CustomTestServiceImpl implements CustomTestService {
	
	@Resource
	private CustomTestMapper customTestMapper;

	public boolean insertCustomTest(CustomTest customTest) {
		return this.customTestMapper.insertCustomTest(customTest)>0?true:false;
	}


	public List<CustomTest> selectCustomTestByPage(CustomTestDTO dto) {
		return this.customTestMapper.selectCustomTestByPage(dto);
	}




	public List<CustomTestResultDTO> selectCustomTestForAppByTeacherId(Integer teacherId) {
		return this.customTestMapper.selectCustomTestForAppByTeacherId(teacherId);
	}

	public List<CustomTestResultDTO> selectStudentMonthScoreForAppByTeacherId(Integer teacherId) {
		return this.customTestMapper.selectStudentMonthScoreForAppByTeacherId(teacherId);
	}

	public boolean delCustomById(Integer customId) {
		return this.customTestMapper.delCustomById(customId)>0?true:false;
	}


	public Integer selectCustomTestCount(CustomTestDTO dto) {
		return this.customTestMapper.selectCustomTestCount(dto);
	}

	

}
