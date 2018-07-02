package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.entity.QuestionDetail;
import com.bdqn.tcmp.mapper.QDetailMapper;
import com.bdqn.tcmp.service.QDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("QDetailService")
public class QDetailServiceImpl implements QDetailService {
	@Resource
	private QDetailMapper questionDetailMapper;
	

	public boolean insertQuestionDetail(QuestionDetail questionDetail) {

		return this.questionDetailMapper.insertQuestionDetail(questionDetail);
	}


	public Integer selectQuestionDetailByTopicId(int topicId) {
		return this.questionDetailMapper.selectQuestionDetailByTopicId(topicId);
	}

}
