package com.bdqn.tcmp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.entity.Testscore;
import com.bdqn.tcmp.service.TestcoreService;

@Controller
@RequestMapping("testcore")
public class TestcoreController {

	@Resource
	private TestcoreService testcoreService;

	@RequestMapping("testcoreSelect")
	@ResponseBody
	public List<Testscore> testcoreSelect(Integer StudentId, Integer customId) {
		return testcoreService.selectTestCoreByStudentIdAndCustomId(StudentId, customId);
	}

	@RequestMapping("insertTesCore")
	@ResponseBody
	public Boolean insertTesCore(Testscore obj) {
		return testcoreService.insertTestScore(obj) > 0 ? true : false;
	}

	@RequestMapping(value = "selectTestscoreByStudentId")
	@ResponseBody
	public List<Testscore> selectTestscoreByStudentId(Integer studentId) {
		return testcoreService.selectTestscoreByStudentId(studentId);

	}

	@RequestMapping(value = "updateTestScoreTest")
	@ResponseBody
	public boolean updateTestScoreTest(Integer scoreId) {

		return testcoreService.updateTestScore(scoreId) > 0 ? true : false;

	}
}
