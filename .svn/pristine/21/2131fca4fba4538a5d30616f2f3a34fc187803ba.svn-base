package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.CheckHomeWorkDTO;
import com.bdqn.tcmp.dto.WorkimagesDTO;
import com.bdqn.tcmp.entity.Workimages;
import com.bdqn.tcmp.mapper.WorkimagesMapper;
import com.bdqn.tcmp.service.WorkimagesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务逻辑层接口实现类
 * @author admin
 */
@Service("workimagesService")
public class WorkimagesServiceImpl implements WorkimagesService{
	@Resource
	private WorkimagesMapper workimagesMapper;
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体类
	 * @return 受影响行数
	 */
	public int insertWorkimages(Workimages entity){
		return workimagesMapper.insertWorkimages(entity);
	}
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return Workimages对象
	 */
	public Workimages selectWorkimagesByID(int id){
		return workimagesMapper.selectWorkimagesByID(id);
	}

	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体类
	 * @return 受影响行数
	 */
	public int updateWorkimages(Workimages entity){
		return workimagesMapper.updateWorkimages(entity);
	}
	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	public int updateWorkimagesEnabledByID(int id,int value){
		return workimagesMapper.updateWorkimagesEnabledByID(id,value);
	}
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	public int deleteWorkimages(int id){
		return workimagesMapper.deleteWorkimages(id);
	}
	/**
	 * 查询全部数据
	 * @return Workimages对象集合
	 */
	public List<Workimages> selectWorkimagesAll(){
		return workimagesMapper.selectWorkimagesAll();
	}
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return Workimages对象集合
	 */
	public List<Workimages> selectWorkimagesByWhere(WorkimagesDTO dto){
		return workimagesMapper.selectWorkimagesByWhere(dto);
	}

	/**
	 * 根据条件查询满足条件的记录数
	 * @param dto
	 *            实体类查询条件
	 * @return 满足条件的记录数
	 */
	public int selectWorkimagesCountByWhere(WorkimagesDTO dto){
		return workimagesMapper.selectWorkimagesCountByWhere(dto);
	}
	/**
	 * 得到数据表Workimages满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return Workimages对象集合
	 */
	public List<Workimages> selectWorkimagesByPage(WorkimagesDTO dto){
		return workimagesMapper.selectWorkimagesByPage(dto);
	}

	public List<Workimages> selectWorkImageByStudentIdAndWorkId(CheckHomeWorkDTO dto) {
		 return this.workimagesMapper.selectWorkImageByStudentIdAndWorkId(dto);
	}


}
    


