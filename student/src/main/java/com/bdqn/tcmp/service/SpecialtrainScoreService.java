package com.bdqn.tcmp.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.entity.SpecialtrainScore;

public interface SpecialtrainScoreService {
	/**
	 * 增加 专项训练用户选择的和操作的
	 * 
	 * @param test
	 * @return
	 */
	Integer insertSpecialtrainScore(SpecialtrainScore test);

	/**
	 * 查询用户专项训练所有的操作
	 * 
	 * @param studentId
	 * @return
	 */
	List<SpecialtrainScore> selectSpecialtrainScoreByStudentId(@Param("studentId") Integer studentId);

	/**
	 * 修改为禁用
	 * 
	 * @param scoreId
	 * @return
	 */
	Integer updateSpecialtrainScoreById(@Param("scoreId") Integer scoreId);

	/**
	 * 查看解析
	 * 
	 * @param studentId
	 * @param testId
	 * @return
	 */
	List<SpecialtrainScore> selectSpecialtrainScoreByStudentIdAndTestId(@Param("studentId") Integer studentId,
                                                                        @Param("test") Integer testId);

}
