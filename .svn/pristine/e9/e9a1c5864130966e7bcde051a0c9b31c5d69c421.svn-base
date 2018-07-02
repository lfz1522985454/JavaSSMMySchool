package com.bdqn.tcmp.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.dto.TopicDTO;
import com.bdqn.tcmp.entity.Topic;

public interface TopicService {

	/**
	 * 
	 * ��ѯȫ��
	 * 
	 * @return
	 */
	List<Topic> selectTopicAll();

	/**
	 * ����dto��ѯ ��̬SQL
	 * 
	 * @param dto
	 * @return
	 */
	List<Topic> selectTopicByWhere(TopicDTO dto);

	/**
	 * ����������ѯ ���ص���ʵ�����
	 * 
	 * @return
	 */
	Topic selectTopicByTopicId(@Param("TopicId") Integer TopicId);

	/**
	 * ɾ����Ϣ
	 * 
	 * @param TopicId
	 * @return
	 */
	Boolean deleteTopicById(@Param("TopicId") Integer TopicId);

	/**
	 * ������Ϣ ��̬SQL
	 * 
	 * @param topic
	 * @return
	 */
	Boolean insertTopic(Topic topic);

	/**
	 * �޸���Ϣ ��̬SQL
	 * 
	 * @param topic
	 * @return
	 */
	Boolean updateTopicById(Topic topic);

	/**
	 * 查询该知识点除去已做过的前20道题
	 * 
	 * @param skillId
	 * @param start
	 * @return
	 */
	List<Topic> selectTopicBySkillId(@Param("skillId") Integer skillId, @Param("start") Integer start);

	/**
	 * 返回该知识点的总个数
	 * 
	 * @param skillId
	 * @return
	 */
	Integer selectTopicBySkillIdReturnSkillCount(@Param("skillId") Integer skillId);

	List<Topic> selectTopicBySkillIdCount();

	/**
	 * 依据知识点编号，查询对应的测试试题
	 * @param skillId 知识点编号
	 * @return  试题列表
	 */
	List<Topic> selectTopicListBySkillId(Integer skillId);
}
