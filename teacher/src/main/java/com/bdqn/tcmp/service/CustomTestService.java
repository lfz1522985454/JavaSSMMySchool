package com.bdqn.tcmp.service;

import com.bdqn.tcmp.dto.CustomTestDTO;
import com.bdqn.tcmp.dto.CustomTestResultDTO;
import com.bdqn.tcmp.entity.CustomTest;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomTestService {
	/**
	 * 添加定制测试
	 * @return
	 */
	boolean insertCustomTest(CustomTest customTest);

	/**
	 * 定制测试表返回总行
	 * @return
	 */
	Integer selectCustomTestCount(CustomTestDTO dto);
	/**
	 * 分页查询定制测试
	 * @return
	 */
	List<CustomTest> selectCustomTestByPage(CustomTestDTO dto);

	//根据教师Id 查询班级最近6个月月考平均分
	List<CustomTestResultDTO> selectCustomTestForAppByTeacherId(Integer teacherId);
	//根据教师Id 查询每个学生的最近6个月的成绩
	List<CustomTestResultDTO> selectStudentMonthScoreForAppByTeacherId(Integer teacherId);

	/**
	 * 停用定制测试
	 * @param customId
	 * @return
	 */
	boolean delCustomById(@Param("customId") Integer customId);
}
