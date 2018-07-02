package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.WorkplanDTO;
import com.bdqn.tcmp.entity.Workplan;
import com.bdqn.tcmp.mapper.WorkplanMapper;
import com.bdqn.tcmp.service.WorkplanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务逻辑层接口实现类
 * @author admin
 */
@Service("workplanService")
public class WorkplanServiceImpl implements WorkplanService{
	@Resource
	private WorkplanMapper workplanMapper;
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体类
	 * @return 受影响行数
	 */
	public int insertWorkplan(Workplan entity){
		return workplanMapper.insertWorkplan(entity);
	}
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return Workplan对象
	 */
	public Workplan selectWorkplanByID(int id){
		return workplanMapper.selectWorkplanByID(id);
	}

	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体类
	 * @return 受影响行数
	 */
	public int updateWorkplan(Workplan entity){
		return workplanMapper.updateWorkplan(entity);
	}
	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	public int updateWorkplanEnabledByID(int id,int value){
		return workplanMapper.updateWorkplanEnabledByID(id,value);
	}
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	public int deleteWorkplan(int id){
		return workplanMapper.deleteWorkplan(id);
	}
	/**
	 * 查询全部数据
	 * @return Workplan对象集合
	 */
	public List<Workplan> selectWorkplanAll(){
		return workplanMapper.selectWorkplanAll();
	}
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return Workplan对象集合
	 */
	public List<Workplan> selectWorkplanByWhere(WorkplanDTO dto){
		return workplanMapper.selectWorkplanByWhere(dto);
	}

	/**
	 * 根据条件查询满足条件的记录数
	 * @param dto
	 *            实体类查询条件
	 * @return 满足条件的记录数
	 */
	public int selectWorkplanCountByWhere(WorkplanDTO dto){
		return workplanMapper.selectWorkplanCountByWhere(dto);
	}
	/**
	 * 得到数据表Workplan满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return Workplan对象集合
	 */
	public List<Workplan> selectWorkplanByPage(WorkplanDTO dto){
		return workplanMapper.selectWorkplanByPage(dto);
	}
}
    


