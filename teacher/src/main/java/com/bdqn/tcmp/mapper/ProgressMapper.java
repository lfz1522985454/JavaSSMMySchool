package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.dto.ProgressDTO;
import com.bdqn.tcmp.entity.Progress;

import java.util.List;

public interface ProgressMapper {


	/**
	 * 条件查询总行学习进度表总行数
	 * @return
	 */
	Integer selectProgressCount(ProgressDTO dto);
	/**
	 * 分页查询学习进度表
	 * @return
	 */
	List<Progress> selectProgressByPage(ProgressDTO dto);

	Integer selectStudyProgressCount(ProgressDTO dto);

}
