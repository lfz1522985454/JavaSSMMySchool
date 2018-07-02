package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.TopicDTO;
import com.bdqn.tcmp.entity.Topic;
import com.bdqn.tcmp.mapper.TopicMapper;
import com.bdqn.tcmp.service.TopicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("topicService")
public class TopicServiceImpl implements TopicService {

	@Resource
	private TopicMapper topicMapper;

	public TopicMapper getTopicMapper() {
		return topicMapper;
	}

	public void setTopicMapper(TopicMapper topicMapper) {
		this.topicMapper = topicMapper;
	}


	public List<Topic> selectTopicAll() {
		// TODO Auto-generated method stub
		return topicMapper.selectTopicAll();
	}


	public List<Topic> selectTopicByWhere(TopicDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}


	public Topic selectTopicByTopicId(Integer TopicId) {
		// TODO Auto-generated method stub
		return null;
	}


	public Boolean deleteTopicById(Integer TopicId) {
		// TODO Auto-generated method stub
		return null;
	}


	public Boolean insertTopic(Topic topic) {
		return this.topicMapper.insertTopic(topic) > 0 ? true : false;
	}


	public Boolean updateTopicById(Topic topic) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Topic> selectTopicWhereSkillId(Integer skillId,Integer opicTypeId) {
		return this.topicMapper.selectTopicWhereSkillId(skillId,opicTypeId);
	}


}
