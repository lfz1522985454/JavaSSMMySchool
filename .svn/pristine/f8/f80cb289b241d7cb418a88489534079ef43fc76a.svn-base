package com.bdqn.tcmp.mapper;

import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.entity.QuestionDetail;

public interface QDetailMapper {

	/**
	 * 添加试题明细
	 * @return
	 */
	boolean insertQuestionDetail(QuestionDetail questiondetail);

	/**
	 * 根据题目编号查询明细表中是否有该题，防止出重复的题
	 */
	Integer selectQuestionDetailByTopicId(@Param("topicId") int topicId);
}
