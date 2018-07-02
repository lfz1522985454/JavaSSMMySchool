package com.bdqn.tcmp.service;

import com.bdqn.tcmp.dto.HomeworkDTO;
import com.bdqn.tcmp.entity.Homework;
import com.bdqn.tcmp.entity.Homework_WorkHistory;

import java.util.List;

/**
 * 业务逻辑层接口
 * @author admininserthomework
 */
public interface HomeworkService{
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体
	 * @return 受影响行数
	 */
	int insertHomework(Homework entity);
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体
	 * @return 受影响行数
	 */
	int insertHomeworkReturnId(Homework_WorkHistory entity);
	/**
	 * 向插入数据
	 * @param entity  带有要插入数据的实体
	 * @return 受影响行数
	 */
	int insertHomework(Homework_WorkHistory entity);
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return Homework对象
	 */
	Homework selectHomeworkByID(int id);
	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体
	 * @return 受影响行数
	 */
	int updateHomework(Homework entity);

	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	int updateHomeworkEnabledByID(int id,int value);
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	int deleteHomework(int id);
	/**
	 * 查询全部数据
	 * @return Homework对象集合
	 */
	List<Homework> selectHomeworkAll();
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return Homework对象集合
	 */
	List<Homework> selectHomeworkByWhere(HomeworkDTO dto);

	/**
	 * 根据条件查询满足条件的记录数
	 * @param dto
	 *            实体类查询条件
	 * @return 满足条件的记录数
	 */
	int selectHomeworkCountByWhere(HomeworkDTO dto);
	/**
	 * 得到数据表Homework满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return Homework对象集合
	 */
	List<Homework> selectHomeworkByPage(HomeworkDTO dto);
	/**
	 * 根据主键查询一个数据
	 * @param classId 表的主键
	 * @return Homework集合对象
	 */
	List<Homework> selectHomeworkByClassID(Integer classId);
	/**
	 * 根据班级编号和阶段查询数据
	 * @param classId 表的主键
	 * @param stage 阶段
	 * @return Homework集合对象
	 */
	List<Homework> selectHomeworkByClassIdAndStage(Integer classId, Integer stage);



}
    


