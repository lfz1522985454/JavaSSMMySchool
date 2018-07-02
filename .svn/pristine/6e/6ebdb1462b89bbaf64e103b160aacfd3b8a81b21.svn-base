package com.bdqn.tcmp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdqn.tcmp.entity.Class;
import com.bdqn.tcmp.service.ClassService;

@Controller
@RequestMapping("Class")
public class ClassController {

	@Resource
	private ClassService classService;

	@RequestMapping("selectClassAll")
	@ResponseBody
	public List<Class> selectClassAll() {
		return classService.selectClassAll();
	}

}
