package com.bdqn.tcmp.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdqn.tcmp.aipface.GetSimilarity_Base64;
import com.bdqn.tcmp.aipface.SetSimilarity_Base64;
import com.bdqn.tcmp.entity.Topic;
import com.bdqn.tcmp.service.TopicService;

@Controller
@RequestMapping("/topic")
public class TopicController {

	@Resource
	private TopicService topicService = null;

	@RequestMapping("selectAll")
	@ResponseBody
	public List<Topic> selectAll() {
		return topicService.selectTopicAll();
	}

	@RequestMapping("getRenLianBase64")
	@ResponseBody
	public String getRenlian(String base,HttpServletRequest request) {
		UUID imgName = UUID.randomUUID();
		String basePath = base.substring(22);
		// String path = System.getProperty("user.dir");

		GetSimilarity_Base64 t = new GetSimilarity_Base64(basePath, "bdqn", 1,
				request.getSession().getServletContext().getRealPath("/upload")+ File.separator + imgName + ".jpg");
		JSONObject json = t.getSimlarity();
		return json.toString();
	}

	@RequestMapping("setRenLianBase64")
	@ResponseBody
	public String setRenlian(String base, String uid, String userInfo,HttpServletRequest request) {
		System.out.println("----------------人脸采集");
		System.out.println("UUID：" + uid);
		UUID imgName = UUID.randomUUID();
		String basePath = base.substring(22);
		SetSimilarity_Base64 t = new SetSimilarity_Base64(basePath, uid, userInfo, "bdqn",
				request.getSession().getServletContext().getRealPath("/upload")+File.separator + imgName + ".jpg");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&77"+request.getSession().getServletContext().getRealPath("/upload"));
		JSONObject json = t.setSimlarity();
		return json.toString();
	}

	@RequestMapping("selectTopicBySkillId")
	@ResponseBody
	public List<Topic> selectTopicBySkillId(Integer skillId, Integer start) {
		System.out.println("开始位置：" + start);
		return topicService.selectTopicBySkillId(skillId, start);
	}

	@RequestMapping("selectTopicBySkillIdCount")
	@ResponseBody
	public List<Topic> selectTopicBySkillIdCountTest() {
		return topicService.selectTopicBySkillIdCount();
	}

	// selectTopicBySkillIdReturnSkillCount
	@RequestMapping("selectTopicBySkillIdReturnSkillCount")
	@ResponseBody
	public Integer selectTopicBySkillIdReturnSkillCount(Integer skillId) {
		return topicService.selectTopicBySkillIdReturnSkillCount(skillId);
	}

	/**
	 * 依据知识点编号，查询出对应的试题列表
	 * @param skillId 知识点编号
	 * @return  试题列表
	 */
	@RequestMapping("/getTopicListBySkillId.do")
	@ResponseBody
	public List<Topic> getTopicListBySkillId(Integer skillId){
		return this.topicService.selectTopicListBySkillId(skillId);
	}
}
