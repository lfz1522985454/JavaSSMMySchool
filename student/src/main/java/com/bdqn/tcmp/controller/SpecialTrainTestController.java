package com.bdqn.tcmp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdqn.tcmp.entity.SpecialTrainTest;
import com.bdqn.tcmp.service.SpecialTrainTestService;

@Controller
@RequestMapping("SpecialTrainTest")
public class SpecialTrainTestController {

	@Resource
	private SpecialTrainTestService specialTrainTestService;
	@RequestMapping("selectSpecialTrainTestServiceById")
	@ResponseBody
	public List<SpecialTrainTest> selectSpecialTrainTestServiceById(Integer studentId) {
		return specialTrainTestService.selectSpecialTrainTestByStudentId(studentId);
	}
	@RequestMapping("selectSpecialTraiinTestCountTest")
	@ResponseBody
	public List<SpecialTrainTest> selectSpecialTraiinTestCount(Integer studentId) {
		return specialTrainTestService.selectSpecialTraiinTestCount(studentId);
	}
	@RequestMapping("insertSpecialTrainTest")
	@ResponseBody
	public Integer insertSpecialTrainTestT(SpecialTrainTest specialTrainTest) {
		specialTrainTestService.insertSpecialTrainTest(specialTrainTest);
		return specialTrainTest.getId();
	}
}
