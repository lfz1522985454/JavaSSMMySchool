package com.bdqn.tcmp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.dto.SelfTestDTO;
import com.bdqn.tcmp.mapper.SelfTestMapper;
import com.bdqn.tcmp.entity.SelfTest;
import com.bdqn.tcmp.service.SelfTestService;
@Service("selfTestService")
public class SelfTestServiceImpl implements SelfTestService {
	@Resource
	private SelfTestMapper selfTestMapper;

	public int selectSelfTestCount(SelfTestDTO dto) {
		System.out.println("进入自测统计分页查询返回总行数selectSelfTestCount");
		return this.selfTestMapper.selectSelfTestCount(dto);
	}


	public List<SelfTest> selectSelfTestByPage(SelfTestDTO dto) {
		System.out.println("进入自测统计分页查询selectSelfTestByPage");
		// TODO Auto-generated method stub
		return this.selfTestMapper.selectSelfTestByPage(dto);
	}


	public int selectSelfTestIsCorrect(int studentId) {
		System.out.println("进入自测统计查询学生做题总数selectSelfTestIsCorrect");
		// TODO Auto-generated method stub
		return this.selfTestMapper.selectSelfTestIsCorrect(studentId);
	}

}
