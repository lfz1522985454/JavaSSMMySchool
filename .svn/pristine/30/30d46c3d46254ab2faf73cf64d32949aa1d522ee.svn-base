package com.bdqn.tcmp.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.mapper.TestcoreMapper;
import com.bdqn.tcmp.entity.Testscore;
import com.bdqn.tcmp.service.TestcoreService;

@Service
public class TestcoreServiceImpl implements TestcoreService {

	@Resource
	private TestcoreMapper testcoreMapper;


	public List<Testscore> selectTestCoreByStudentIdAndCustomId(Integer stuId, Integer customId) {
		// TODO Auto-generated method stub
		return testcoreMapper.selectTestCoreByStudentIdAndCustomId(stuId, customId);
	}


	public Integer insertTestScore(Testscore test) {
		// TODO Auto-generated method stub
		return testcoreMapper.insertTestScore(test);
	}

	


	public List<Testscore> selectTestscoreByStudentId(Integer studentId) {
		List<Testscore> listNew = new ArrayList<Testscore>();
		List<Testscore> list = testcoreMapper.selectTestscoreByStudentId(studentId);
		for (Testscore testscore : list) {
			if (!testscore.getStudentAnswer().equals(testscore.getModelAnswer())&&testscore.getIsEnable()==0) {
				listNew.add(testscore);
			}
		}
		for (Testscore testscore : listNew) {
			System.out.println(testscore.getModelAnswer() + "\t" + testscore.getStudentAnswer());
		}
		return listNew;
	}


	public Integer updateTestScore(Integer scoreId) {
		// TODO Auto-generated method stub
		return testcoreMapper.updateTestScore(scoreId);
	}

}
