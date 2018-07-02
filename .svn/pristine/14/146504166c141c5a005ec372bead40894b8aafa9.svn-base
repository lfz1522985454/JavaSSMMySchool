package com.bdqn.tcmp.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.mapper.SpecialtrainScoreMapper;
import com.bdqn.tcmp.entity.SpecialtrainScore;
import com.bdqn.tcmp.entity.Testscore;
import com.bdqn.tcmp.service.SpecialtrainScoreService;

@Service("SpecialtrainScoreService")
public class SpecialtrainScoreServiceImpl implements SpecialtrainScoreService {
	@Resource
	private SpecialtrainScoreMapper specialtrainScoreMapper;


	public Integer insertSpecialtrainScore(SpecialtrainScore test) {
		// TODO Auto-generated method stub
		return specialtrainScoreMapper.insertSpecialtrainScore(test);
	}


	public List<SpecialtrainScore> selectSpecialtrainScoreByStudentId(Integer studentId) {
		List<SpecialtrainScore> newList = new ArrayList<SpecialtrainScore>();

		List<SpecialtrainScore> list = specialtrainScoreMapper.selectSpecialtrainScoreByStudentId(studentId);
		for (SpecialtrainScore specialtrainScore : list) {
			if (!specialtrainScore.getStudentAnswer().equals(specialtrainScore.getModelAnswer())
					&& specialtrainScore.getIsEnable() == 0) {
				newList.add(specialtrainScore);
			}
		}
		for (SpecialtrainScore specialtrainScore : newList) {
			System.out.println(specialtrainScore.getModelAnswer() + "\t" + specialtrainScore.getStudentAnswer());
		}
		return newList;
	}


	public Integer updateSpecialtrainScoreById(Integer scoreId) {
		// TODO Auto-generated method stub
		return specialtrainScoreMapper.updateSpecialtrainScoreById(scoreId);
	}


	public List<SpecialtrainScore> selectSpecialtrainScoreByStudentIdAndTestId(Integer studentId, Integer testId) {
		// TODO Auto-generated method stub
		return specialtrainScoreMapper.selectSpecialtrainScoreByStudentIdAndTestId(studentId, testId);
	}

}
