package com.bdqn.tcmp.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.entity.SpecialTrain;

public interface SpecialTrainSercice {
	/**
	 * 增加
	 * 
	 * @param obj
	 * @return
	 */
	Integer insertspecialTrain(SpecialTrain obj);

	/**
	 * 表示该学生的该知识点做题信息
	 * 
	 * @param studentId
	 * @param skillId
	 * @return
	 */
	List<SpecialTrain> selectSpecialTrainByStudentAndSkillId(@Param("studentId") Integer studentId,
                                                             @Param("skillId") Integer skillId);

	/**
	 * 查看本班级所有学生的刷题数量
	 * 
	 * @return
	 */
	List<SpecialTrain> selectSpecialTrainPHByClassId(@Param("classId") Integer classId);

	/**
	 * 查看全校的学生刷题数量
	 * 
	 * @return
	 */
	List<SpecialTrain> selectSpecialTrainPH();

	/**
	 * 查询该学生的该知识点总答题数
	 * 
	 * @param studentId
	 * @param skillId
	 * @return
	 */
	Integer selectSpecialTrainBySkillIdAndStudentIdReturnCount(@Param("studentId") Integer studentId,
                                                               @Param("skillId") Integer skillId);

	/**
	 * 修改该知识点总答题数 可变
	 * 
	 * @param studentId
	 * @param skillId
	 * @return
	 */
	Integer updateSpecialTrainBySkillIdAndStudentId(@Param("studentId") Integer studentId,
                                                    @Param("skillId") Integer skillId);

	/**
	 * 加载该学生所有知识点已做题数
	 * 
	 * @param studentId
	 * @return
	 */
	List<SpecialTrain> selectSpecialTrainByStudentAndSkillCount(@Param("studentId") Integer studentId);

}
