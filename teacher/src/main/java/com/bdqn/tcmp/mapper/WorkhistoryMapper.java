package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.dto.WorkhistoryDTO;
import com.bdqn.tcmp.entity.Homework_WorkHistory;
import com.bdqn.tcmp.entity.Workhistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 数据访问层接口
 * @author admin
 */
public interface WorkhistoryMapper{
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体
	 * @return 受影响行数
	 */
	int insertWorkhistory(Homework_WorkHistory entity);
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体
	 * @return 受影响行数
	 */
	int insertWorkhistory(Workhistory entity);
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return Workhistory对象
	 */
	Workhistory selectWorkhistoryByID(int id);
	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体
	 * @return 受影响行数
	 */
	int updateWorkhistory(Workhistory entity);

	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	int updateWorkhistoryEnabledByID(@Param("id")int id, @Param("value")int value);
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	int deleteWorkhistory(int id);
	/**
	 * 查询全部数据
	 * @return Workhistory对象集合
	 */
	List<Workhistory> selectWorkhistoryAll();
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return Workhistory对象集合
	 */
	List<Workhistory> selectWorkhistoryByWhere(WorkhistoryDTO dto);

	/**
	 * 根据条件查询满足条件的记录数
	 * @param dto
	 *            实体类查询条件
	 * @return 满足条件的记录数
	 */
	int selectWorkhistoryCountByWhere(WorkhistoryDTO dto);
	/**
	 * 得到数据表Workhistory满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return Workhistory对象集合
	 */
	List<Workhistory> selectWorkhistoryByPage(WorkhistoryDTO dto);

	/**
	 * 得到该学生的历史作业记录
	 * @param dto 查询条件
	 * @return 所有作业信息的集合
	 */
	List<Workhistory> selectWorkhistoryByStudentId( WorkhistoryDTO dto);

	/**
	 * 根据该学生查询改学校的作业信息
	 * @param studentId 学生id
	 * @return 一条作业信息
	 */
	Workhistory selectWorkhistoryByStudenrIdReturnOne(@Param("studentId") Integer studentId);
}
    


