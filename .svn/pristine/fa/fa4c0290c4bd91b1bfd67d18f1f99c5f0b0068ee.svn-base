package com.bdqn.tcmp.service;

import com.bdqn.tcmp.entity.Skill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SkillService {
	/**
	 * 查询全部知识点
	 *
	 * @return
	 */
	List<Skill> selectSkillAll();

	/**
	 * 姚国旺
	 * 根据fatherId 和 optionTypeId 来查询知识点
	 * @return
	 */
	List<Skill> selectSillAllCount(@Param("skillId") Integer skillId,@Param("opicTypeId") Integer opicTypeId);
	/**
	 * 姚国旺
	 * 根据fatherId查询对应上级下面的所有知识点
	 * @param fatherId
	 * @return
	 */
	List<Skill> selectSkillById(@Param("fatherId") Integer fatherId);


}
