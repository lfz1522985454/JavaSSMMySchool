package com.bdqn.tcmp.controller;



import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.dto.CustomTestDTO;
import com.bdqn.tcmp.entity.CustomTest;
import com.bdqn.tcmp.service.CustomTestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("customTest")
public class CustomTestController {
	@Resource
	private CustomTestService customTestService;

	@ResponseBody
	@RequestMapping("/customByPage.do")
	public Map<String,Object> selectCustomTestByPage(CustomTestDTO dto){
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(dto.toString());
		dto.setPageSize(5);
//		dto.setPageIndex(1);
		dto.setRowCount(customTestService.selectCustomTestCount(dto));
		System.out.println(dto.getRowCount());
		map.put("page", dto);
		map.put("customList", customTestService.selectCustomTestByPage(dto));
		System.out.println(map);
		System.out.println("定制测试信息:"+JSON.toJSONString(map));
		return map;
	}

	@ResponseBody
	@RequestMapping("/insertCustom.do")
	public boolean insertCustom(CustomTest customTest){
		System.out.println("进入增加定制测试");
		boolean flag=false;
		try {
			flag=customTestService.insertCustomTest(customTest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	//根据教师Id 查询月考平均分
	@ResponseBody
	@RequestMapping("/appCustomTestCount.do")
	public Map<String,Object> selectCustomTestForAppByTeacherId(Integer teacherId){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("customTestCount",customTestService.selectCustomTestForAppByTeacherId(teacherId));
		return map;
	}

}
