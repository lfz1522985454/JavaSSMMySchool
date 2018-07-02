package com.bdqn.tcmp.service;

import com.bdqn.tcmp.dto.WorklogDTO;
import com.bdqn.tcmp.entity.Worklog;

import java.util.List;

/**
 * 业务逻辑层接口
 * @author admin
 */
public interface WorklogService{
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体
	 * @return 受影响行数
	 */
	int insertWorklog(Worklog entity);
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return Worklog对象
	 */
	Worklog selectWorklogByID(int id);
	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体
	 * @return 受影响行数
	 */
	int updateWorklog(Worklog entity);

	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	int updateWorklogEnabledByID(int id,int value);
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	int deleteWorklog(int id);
	/**
	 * 查询全部数据
	 * @return Worklog对象集合
	 */
	List<Worklog> selectWorklogAll();
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return Worklog对象集合
	 */
	List<Worklog> selectWorklogByWhere(WorklogDTO dto);

	/**
	 * 根据条件查询满足条件的记录数
	 * @param dto
	 *            实体类查询条件
	 * @return 满足条件的记录数
	 */
	int selectWorklogCountByWhere(WorklogDTO dto);
	/**
	 * 得到数据表Worklog满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return Worklog对象集合
	 */
	List<Worklog> selectWorklogByPage(WorklogDTO dto);
}
    


