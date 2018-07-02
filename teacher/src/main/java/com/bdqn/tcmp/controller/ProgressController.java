package com.bdqn.tcmp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.dto.ProgressDTO;
import com.bdqn.tcmp.service.ProcessService;

@Controller
@RequestMapping("progress")
public class ProgressController {
	@Resource
	private ProcessService processService;

	@ResponseBody
	@RequestMapping("/selectProgress.do")
	public Map<String,Object> selectClassByPage(ProgressDTO dto){
		Map<String, Object> map = new HashMap<String, Object>();
		dto.setPageSize(5);
		System.out.println(dto.toString());
//		dto.setPageIndex(1);
		dto.setRowCount(processService.selectProgressCount(dto));
		System.out.println(dto.getRowCount());
		map.put("page", dto);
		map.put("processList", processService.selectProgressByPage(dto));
		System.out.println(map);
		System.out.println("学习进度信息:"+JSON.toJSONString(map));
		return map;
	}

}
