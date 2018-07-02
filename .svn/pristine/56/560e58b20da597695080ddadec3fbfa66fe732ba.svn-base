package com.bdqn.tcmp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.bdqn.tcmp.dto.TopicDTO;
import com.bdqn.tcmp.entity.Topic;

public interface TopicMapper {

	List<Topic> selectTopicAll();

	List<Topic> selectTopicByWhere(TopicDTO dto);

	Topic selectTopicByTopicId(@Param("TopicId") Integer TopicId);

	Integer deleteTopicById(@Param("TopicId") Integer TopicId);

	Integer insertTopic(Topic topic);

	Integer updateTopicById(Topic topic);

	/**
	 * ��ѯ��֪ʶ���ȥ��������ǰ20����
	 * 
	 * @param skillId
	 * @param start
	 * @return
	 */
	List<Topic> selectTopicBySkillId(@Param("skillId") Integer skillId, @Param("start") Integer start);

	/**
	 * ���ظ�֪ʶ����ܸ���
	 * 
	 * @param skillId
	 * @return
	 */
	Integer selectTopicBySkillIdReturnSkillCount(@Param("skillId") Integer skillId);

	// ��ѯ֪ʶ����ĸ��� ѡ����
	List<Topic> selectTopicBySkillIdCount();


	/**
	 * 依据知识点编号，查询对应的测试试题
	 * @param skillId 知识点编号
	 * @return  试题列表
	 */
	List<Topic> selectTopicListBySkillId(Integer skillId);
}