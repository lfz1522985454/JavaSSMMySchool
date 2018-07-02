package com.bdqn.tcmp.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.entity.Skill;
import com.bdqn.tcmp.service.SkillService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("skill")
public class SkillController {

	@Resource
	private SkillService skillService=null;

	/**
	 * 返回全部skill信息
	 *
	 * @return
	 */
	@ResponseBody
	@RequestMapping("selectSkillAll.do")
	public List<Skill> selectSkillAll(){
		System.out.println("进入查询所有知识点Controller");
		List<Skill> list=skillService.selectSkillAll();
		System.out.println("知识点信息:"+JSON.toJSONString(list));
		return list;
	}

	/**
	 * 查询所有知识点的总个数
	 *
	 * @return
	 */
	@RequestMapping("selectSkillAllCount")
	@ResponseBody
	public List<Skill> selectSkillAllCount(Integer skillId,Integer opicTypeId) {
		System.out.println("skillId:"+skillId+" "+"opicTypeId:"+opicTypeId);
		System.out.println("进入查询所有知识点Controller");
		List<Skill> list=skillService.selectSillAllCount(skillId,opicTypeId);
		System.out.println("所有知识点信息:"+JSON.toJSONString(list));
		return list;
	}

	/**
	 * 根据fatherId查询所有相同fatherId的知识点
	 */
	@RequestMapping("selectSkillById")
	@ResponseBody
	public List<Skill> selectSkillById(Integer fatherId){
		System.out.println("进入根据fatherId查询对应知识点");
		List<Skill> list=skillService.selectSkillById(fatherId);
		System.out.println("所有知识点信息:"+JSON.toJSONString(list));
		return list;
	}


}
