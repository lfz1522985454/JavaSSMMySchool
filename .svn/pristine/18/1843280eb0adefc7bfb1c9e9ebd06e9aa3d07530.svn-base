package com.bdqn.tcmp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdqn.tcmp.entity.SpecialtrainScore;
import com.bdqn.tcmp.service.SpecialtrainScoreService;
@Controller
@RequestMapping("specialtrainScore")
public class SpecialtrainScoreController {

	@Resource
	private SpecialtrainScoreService specialtrainScoreService;
	@RequestMapping("insertSpecialtrainScore")
	@ResponseBody
	public Integer insertSpecialtrainScore(SpecialtrainScore test) {
		return specialtrainScoreService.insertSpecialtrainScore(test);
	}
	// 查询出该学生在专项训练的错题信息
	@RequestMapping("selectSpecialtrainScoreByStudentId")
	@ResponseBody
	public List<SpecialtrainScore> selectSpecialtrainScoreByStudentId(Integer studentId) {
		return specialtrainScoreService.selectSpecialtrainScoreByStudentId(studentId);
	}
	// 修改 updateSpecialtrainScoreById
	@RequestMapping("updateSpecialtrainScoreById")
	@ResponseBody
	public boolean updateSpecialtrainScoreById(Integer scoreId) {
		return specialtrainScoreService.updateSpecialtrainScoreById(scoreId) > 0 ? true : false;
	}
	@RequestMapping("selectSpecialtrainScoreByStudentIdAndTestId")
	@ResponseBody
	public List<SpecialtrainScore> selectSpecialtrainScoreByStudentIdAndTestId(Integer studentId, Integer testId) {
		return specialtrainScoreService.selectSpecialtrainScoreByStudentIdAndTestId(studentId, testId);
	}

}
