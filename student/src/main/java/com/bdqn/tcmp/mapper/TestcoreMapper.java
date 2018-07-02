package com.bdqn.tcmp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.entity.Testscore;

public interface TestcoreMapper {

	/**
	 * 查询测试报告
	 * 
	 * @param stuId
	 * @param customId
	 * @return
	 */
	List<Testscore> selectTestCoreByStudentIdAndCustomId(@Param("studentId") Integer stuId,
                                                         @Param("customId") Integer customId);

	Integer insertTestScore(Testscore test);

 	List<Testscore> selectTestscoreByStudentId(@Param("studentId") Integer studentId);
 	
 	Integer updateTestScore(@Param("scoreId") Integer scoreId);
}
