package com.bdqn.tcmp.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.entity.SpecialTrainTest;

public interface SpecialTrainTestService {
	/**
	 * 查询该学生所有的展现训练每次20道生成的试题
	 * 
	 * @param studentId
	 * @return
	 */
	List<SpecialTrainTest> selectSpecialTrainTestByStudentId(@Param("studentId") Integer studentId);

	/**
	 * 查询该学生本周做题情况 个数
	 * 
	 * @param studentId
	 * @return
	 */
	List<SpecialTrainTest> selectSpecialTraiinTestCount(@Param("studentId") Integer studentId);

	/**
	 * 增加 并返回标识列
	 *
	 * @param specialTrainTest
	 * @return
	 */
	Integer insertSpecialTrainTest(SpecialTrainTest specialTrainTest);
}
