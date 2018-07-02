package com.bdqn.tcmp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.mapper.OpictypeMapper;
import com.bdqn.tcmp.entity.Opictype;
import com.bdqn.tcmp.service.OpictypeService;

@Service("opictypeService")
public class OpictypeServiceImpl implements OpictypeService {

	@Resource
	private OpictypeMapper opictypeMapper;
	

	public List<Opictype> selectOpictypeAll() {
		// TODO Auto-generated method stub
		return this.opictypeMapper.selectOpictypeAll();
	}

}
