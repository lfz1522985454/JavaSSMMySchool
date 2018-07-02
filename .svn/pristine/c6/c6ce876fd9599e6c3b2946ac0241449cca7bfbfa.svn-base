package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.dto.WorkplanDTO;
import com.bdqn.tcmp.entity.Workplan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 数据访问层接口
 * @author admin
 */
public interface WorkplanMapper{
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体
	 * @return 受影响行数
	 */
	int insertWorkplan(Workplan entity);
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return Workplan对象
	 */
	Workplan selectWorkplanByID(int id);
	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体
	 * @return 受影响行数
	 */
	int updateWorkplan(Workplan entity);

	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	int updateWorkplanEnabledByID(@Param("id")int id, @Param("value")int value);
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	int deleteWorkplan(int id);
	/**
	 * 查询全部数据
	 * @return Workplan对象集合
	 */
	List<Workplan> selectWorkplanAll();
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return Workplan对象集合
	 */
	List<Workplan> selectWorkplanByWhere(WorkplanDTO dto);

	/**
	 * 根据条件查询满足条件的记录数
	 * @param dto
	 *            实体类查询条件
	 * @return 满足条件的记录数
	 */
	int selectWorkplanCountByWhere(WorkplanDTO dto);
	/**
	 * 得到数据表Workplan满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return Workplan对象集合
	 */
	List<Workplan> selectWorkplanByPage(WorkplanDTO dto);
}
    


