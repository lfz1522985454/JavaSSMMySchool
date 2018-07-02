package com.bdqn.tcmp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.mapper.SpecialTrainTestMapper;
import com.bdqn.tcmp.entity.SpecialTrainTest;
import com.bdqn.tcmp.service.*;

@Service("specialTrainTestService")
public class SpecialTrainTestServiceImpl implements SpecialTrainTestService {

	@Resource
	private SpecialTrainTestMapper specialTrainTestMapper;


	public List<SpecialTrainTest> selectSpecialTrainTestByStudentId(Integer studentId) {
		// TODO Auto-generated method stub
		return specialTrainTestMapper.selectSpecialTrainTestByStudentId(studentId);
	}


	public List<SpecialTrainTest> selectSpecialTraiinTestCount(Integer studentId) {
		// TODO Auto-generated method stub
		return specialTrainTestMapper.selectSpecialTraiinTestCount(studentId);
	}


	public Integer insertSpecialTrainTest(SpecialTrainTest specialTrainTest) {
		// TODO Auto-generated method stub
		return specialTrainTestMapper.insertSpecialTrainTest(specialTrainTest);
	}

}
