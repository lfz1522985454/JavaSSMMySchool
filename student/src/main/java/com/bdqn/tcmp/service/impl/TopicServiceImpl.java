package com.bdqn.tcmp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.dto.TopicDTO;
import com.bdqn.tcmp.mapper.TopicMapper;
import com.bdqn.tcmp.entity.Topic;
import com.bdqn.tcmp.service.TopicService;

@Service("topicService")
public class TopicServiceImpl implements TopicService{

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
		// TODO Auto-generated method stub
		return null;
	}


	public Boolean updateTopicById(Topic topic) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Topic> selectTopicBySkillIdCount() {
		// TODO Auto-generated method stub
		return topicMapper.selectTopicBySkillIdCount();
	}

	/**
	 * 依据知识点编号，查询对应的测试试题
	 * @param skillId 知识点编号
	 * @return  试题列表
	 */
	public List<Topic> selectTopicListBySkillId(Integer skillId) {
		return this.topicMapper.selectTopicListBySkillId(skillId);
	}


	public List<Topic> selectTopicBySkillId(Integer skillId, Integer start) {
		// TODO Auto-generated method stub
		return topicMapper.selectTopicBySkillId(skillId, start);
	}


	public Integer selectTopicBySkillIdReturnSkillCount(Integer skillId) {
		// TODO Auto-generated method stub
		return topicMapper.selectTopicBySkillIdReturnSkillCount(skillId);
	}

}
