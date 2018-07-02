package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.dto.CheckHomeWorkDTO;
import com.bdqn.tcmp.dto.WorkimagesDTO;
import com.bdqn.tcmp.entity.Workimages;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 数据访问层接口
 * @author admin
 */
public interface WorkimagesMapper{
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体
	 * @return 受影响行数
	 */
	int insertWorkimages(Workimages entity);
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return Workimages对象
	 */
	Workimages selectWorkimagesByID(int id);
	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体
	 * @return 受影响行数
	 */
	int updateWorkimages(Workimages entity);

	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	int updateWorkimagesEnabledByID(@Param("id")int id, @Param("value")int value);
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	int deleteWorkimages(int id);
	/**
	 * 查询全部数据
	 * @return Workimages对象集合
	 */
	List<Workimages> selectWorkimagesAll();
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return Workimages对象集合
	 */
	List<Workimages> selectWorkimagesByWhere(WorkimagesDTO dto);

	/**
	 * 根据条件查询满足条件的记录数
	 * @param dto
	 *            实体类查询条件
	 * @return 满足条件的记录数
	 */
	int selectWorkimagesCountByWhere(WorkimagesDTO dto);
	/**
	 * 得到数据表Workimages满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return Workimages对象集合
	 */
	List<Workimages> selectWorkimagesByPage(WorkimagesDTO dto);

	/**
	 * 朱晓宇创建
	 * 得到数据表Workimages满足查询条件的记录
	 * @param dto 条件实体类
	 * @return Workimages对象集合
	 */
	List<Workimages> selectWorkImageByStudentIdAndWorkId(CheckHomeWorkDTO dto);


}
    


