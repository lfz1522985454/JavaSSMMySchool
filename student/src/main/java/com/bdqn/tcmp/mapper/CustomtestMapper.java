package com.bdqn.tcmp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.entity.Customtest;

public interface CustomtestMapper {

	// 查询全部
	List<Customtest> selectCustomtestByClassId(@Param("classId") Integer classId);
}
