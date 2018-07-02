package com.bdqn.tcmp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.mapper.QuestiondetailMapper;
import com.bdqn.tcmp.entity.Questiondetail;
import com.bdqn.tcmp.service.QuersiondetailService;

@Service("quersiondetailService")
public class QuersiondetailServiceImpl implements QuersiondetailService {

	@Resource
	private QuestiondetailMapper questiondetailMapper;


	public List<Questiondetail> selectQuestiondetailByQuestionId(Integer questionId) {
		// TODO Auto-generated method stub
		return questiondetailMapper.selectQuestiondetailByQuestionId(questionId);
	}

}
