package com.bdqn.tcmp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdqn.tcmp.entity.Customtest;
import com.bdqn.tcmp.service.CustomtestService;

@Controller
@RequestMapping("custom")
public class CustomtestController {
	@Resource
	private CustomtestService service;

	@RequestMapping("selectCustomtest")
	@ResponseBody
	public List<Customtest> selectCustomtest(Integer classId) {
		List<Customtest> str = service.selectCustomtestByClassId(classId);
		return str;
	}
}
