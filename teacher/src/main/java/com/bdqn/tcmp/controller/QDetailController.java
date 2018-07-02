package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.entity.QuestionDetail;
import com.bdqn.tcmp.entity.Topic;
import com.bdqn.tcmp.service.QDetailService;
import com.bdqn.tcmp.service.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("questionDetail")
public class QDetailController {
	@Resource
	private TopicService topicService;
	@Resource
	private QDetailService quersiondetailService;

	@RequestMapping("questiondetailInsert.do")
	@ResponseBody
	public boolean selectQuestiondetailInsert(QuestionDetail questiondetail,Integer opicTypeId,Integer count) {
		boolean Identification = false;
		System.out.println(questiondetail.toString() + "  count" + count);
		// 按照知识点取出,该知识点下的所有topicId
		List<Topic> listTopic = topicService.selectTopicWhereSkillId(questiondetail.getSkillId(),opicTypeId);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <count; i++) {
			int num=new Random().nextInt(listTopic.size());
			if(list.contains(num)){
				i--;
			}else{
				list.add(num);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			questiondetail.setTopicId(listTopic.get(list.get(i)).getTopicId());
			Identification= quersiondetailService.insertQuestionDetail(questiondetail);
		}
		return Identification;

	}

}
