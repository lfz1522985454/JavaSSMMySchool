package com.bdqn.tcmp.service;

import com.bdqn.tcmp.dto.WorkstudentDTO;
import com.bdqn.tcmp.entity.Homework_WorkHistory;
import com.bdqn.tcmp.entity.Workstudent;

import java.util.List;

/**
 * 业务逻辑层接口
 * @author admin
 */
public interface WorkstudentService{
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体
	 * @return 受影响行数
	 */
	int insertWorkstudent(Workstudent entity);
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体
	 * @return 受影响行数
	 */
	int insertWorkstudent(Homework_WorkHistory entity);
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return Workstudent对象
	 */
	Workstudent selectWorkstudentByID(int id);
	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体
	 * @return 受影响行数
	 */
	int updateWorkstudent(Workstudent entity);

	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	int updateWorkstudentEnabledByID(int id,int value);
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	int deleteWorkstudent(int id);
	/**
	 * 查询全部数据
	 * @return Workstudent对象集合
	 */
	List<Workstudent> selectWorkstudentAll();
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return Workstudent对象集合
	 */
	List<Workstudent> selectWorkstudentByWhere(WorkstudentDTO dto);

	/**
	 * 根据条件查询满足条件的记录数
	 * @param dto
	 *            实体类查询条件
	 * @return 满足条件的记录数
	 */
	int selectWorkstudentCountByWhere(WorkstudentDTO dto);
	/**
	 * 得到数据表Workstudent满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return Workstudent对象集合
	 */
	List<Workstudent> selectWorkstudentByPage(WorkstudentDTO dto);
}
    


