package com.bdqn.tcmp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.mapper.CustomtestMapper;
import com.bdqn.tcmp.entity.Customtest;
import com.bdqn.tcmp.service.CustomtestService;

@Service("customtestService")
public class CustomtestServiceImpl implements CustomtestService {
	@Resource
	private CustomtestMapper customtestMapper;


	public List<Customtest> selectCustomtestByClassId(Integer classId) {
		// TODO Auto-generated method stub
		return customtestMapper.selectCustomtestByClassId(classId);
	}

	

	

}
