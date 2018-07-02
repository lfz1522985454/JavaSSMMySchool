package com.bdqn.tcmp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.dto.ProgressDTO;
import com.bdqn.tcmp.mapper.ProgressMapper;
import com.bdqn.tcmp.entity.Progress;
import com.bdqn.tcmp.service.ProcessService;
@Service("processService")
public class ProcessServiceImpl implements ProcessService {
	@Resource
	private ProgressMapper processMapper;
	

	public Integer selectProgressCount(ProgressDTO dto) {
	
		return this.processMapper.selectProgressCount(dto);
	}


	public List<Progress> selectProgressByPage(ProgressDTO dto) {

		return this.processMapper.selectProgressByPage(dto);
	}

}
