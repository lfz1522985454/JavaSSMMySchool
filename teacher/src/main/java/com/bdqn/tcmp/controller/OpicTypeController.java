package com.bdqn.tcmp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.service.OpictypeService;

@Controller
@RequestMapping("opicType")
public class OpicTypeController {
	@Resource
	private OpictypeService opictypeService;
	@ResponseBody
	@RequestMapping("/selectOpicty")
	public Map<String,Object> selectOpicty(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("opictyList",opictypeService.selectOpictypeAll());
		System.out.println(map);
		System.out.println("题目类型:"+JSON.toJSONString(map));
		return map;
	}

}
