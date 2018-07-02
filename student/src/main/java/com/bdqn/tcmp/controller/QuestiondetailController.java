package com.bdqn.tcmp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdqn.tcmp.entity.Questiondetail;
import com.bdqn.tcmp.service.QuersiondetailService;

@Controller
@RequestMapping("Questiondetail")
public class QuestiondetailController {

	@Resource
	private QuersiondetailService quersiondetailService;

	@RequestMapping("selectQuestiondetailById")
	@ResponseBody
	public List<Questiondetail> selectQuestiondetailById(Integer questionId) {
		return quersiondetailService.selectQuestiondetailByQuestionId(questionId);
	}

}
