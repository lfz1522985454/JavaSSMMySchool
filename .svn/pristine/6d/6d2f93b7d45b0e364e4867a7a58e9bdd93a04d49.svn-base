package com.bdqn.tcmp.service;

import com.bdqn.tcmp.dto.TopicDTO;
import com.bdqn.tcmp.entity.Topic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TopicService {

	/**
	 *
	 * 查询全部
	 *
	 * @return
	 */
	List<Topic> selectTopicAll();

	/**
	 * 根据dto查询 动态SQL
	 *
	 * @param dto
	 * @return
	 */
	List<Topic> selectTopicByWhere(TopicDTO dto);

	/**
	 * 根据主键查询 返回单个实体对象
	 *
	 * @return
	 */
	Topic selectTopicByTopicId(@Param("TopicId") Integer TopicId);

	/**
	 * 删除信息
	 *
	 * @param TopicId
	 * @return
	 */
	Boolean deleteTopicById(@Param("TopicId") Integer TopicId);

	/**
	 * 增加信息 动态SQL
	 *
	 * @param topic
	 * @return
	 */
	Boolean insertTopic(Topic topic);

	/**
	 * 修改信息 动态SQL
	 *
	 * @param topic
	 * @return
	 */
	Boolean updateTopicById(Topic topic);
	/**
	 * 根据知识点返回题
	 *
	 * @param skillId
	 * @return
	 */
	List<Topic> selectTopicWhereSkillId(@Param("skillId") Integer skillId,@Param("opicTypeId") Integer opicTypeId);
}
