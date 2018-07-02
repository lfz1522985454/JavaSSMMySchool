package com.bdqn.tcmp.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.dto.ProgressDTO;
import com.bdqn.tcmp.dto.SelfTestDTO;
import com.bdqn.tcmp.entity.SelfTest;
import com.bdqn.tcmp.service.SelfTestService;

@Controller
@RequestMapping("selfTest")
public class SelfTestController {

	@Resource
	private SelfTestService selfTestService;
	@ResponseBody
	@RequestMapping("/selectSelfTest.do")
	public Map<String,Object> selectClassByPage(SelfTestDTO dto){
		System.out.println("进入自测统计分页查询Controller");
		Map<String, Object> map = new HashMap<String, Object>();
		dto.setPageSize(5);
		dto.setPageIndex(1);
		dto.setRowCount(selfTestService.selectSelfTestCount(dto));
		System.out.println(dto.getRowCount());
		map.put("page", dto);
		List<SelfTest> selfTestInfo=selfTestService.selectSelfTestByPage(dto);
		for (SelfTest selfTest : selfTestInfo) {
			System.out.println("输出自测统计学生编号："+selfTest.getStudentId());
			//设置总题数
			selfTest.setCountAnswer(selfTestService.selectSelfTestIsCorrect(selfTest.getStudentId()));
			System.out.println("学生编号:"+selfTest.getStudentId()+"    对应做题总数:"+selfTest.getCountAnswer());
			int count=selfTest.getCountAnswer();//总题数
			System.out.println("count:"+count);
			int correct=selfTest.getCountCorrect();//正确题数
			System.out.println("correct"+correct);
			double correctRate = new BigDecimal((float)selfTest.getCountCorrect()/selfTest.getCountAnswer()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			int Rate=(int) (correctRate*100);
			selfTest.setCorrectRate(Rate);//将计算好的正确率赋值到实体类
			System.out.println("correctRate"+correctRate+"    Rate"+Rate);

		}
		map.put("selfTestList", selfTestInfo);
		System.out.println(map);
		System.out.println("自测统计信息:"+JSON.toJSONString(map));
		return map;

	}
}
