package com.bdqn.tcmp.mapper;

import java.util.List;

import com.bdqn.tcmp.dto.SelfTestDTO;
import com.bdqn.tcmp.entity.SelfTest;

public interface SelfTestMapper {

	/**
	 * 条件查询自测统计表总行数
	 * @return
	 */
	int selectSelfTestCount(SelfTestDTO dto);

	/**
	 * 根据学生编号查询该学生所做的总题数
	 * @return
	 */
	int selectSelfTestIsCorrect(int studentId);

	/**
	 * 分页查询自测统计表
	 * @return
	 */
	List<SelfTest> selectSelfTestByPage(SelfTestDTO dto);

}
