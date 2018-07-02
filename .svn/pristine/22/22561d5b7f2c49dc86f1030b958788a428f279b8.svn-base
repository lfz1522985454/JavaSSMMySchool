package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.WorklogDTO;
import com.bdqn.tcmp.entity.Worklog;
import com.bdqn.tcmp.mapper.WorklogMapper;
import com.bdqn.tcmp.service.WorklogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务逻辑层接口实现类
 * @author admin
 */
@Service("worklogService")
public class WorklogServiceImpl implements WorklogService{
	@Resource
	private WorklogMapper worklogMapper;
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体类
	 * @return 受影响行数
	 */
	public int insertWorklog(Worklog entity){
		return worklogMapper.insertWorklog(entity);
	}
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return Worklog对象
	 */
	public Worklog selectWorklogByID(int id){
		return worklogMapper.selectWorklogByID(id);
	}

	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体类
	 * @return 受影响行数
	 */
	public int updateWorklog(Worklog entity){
		return worklogMapper.updateWorklog(entity);
	}
	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	public int updateWorklogEnabledByID(int id,int value){
		return worklogMapper.updateWorklogEnabledByID(id,value);
	}
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	public int deleteWorklog(int id){
		return worklogMapper.deleteWorklog(id);
	}
	/**
	 * 查询全部数据
	 * @return Worklog对象集合
	 */
	public List<Worklog> selectWorklogAll(){
		return worklogMapper.selectWorklogAll();
	}
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return Worklog对象集合
	 */
	public List<Worklog> selectWorklogByWhere(WorklogDTO dto){
		return worklogMapper.selectWorklogByWhere(dto);
	}

	/**
	 * 根据条件查询满足条件的记录数
	 * @param dto
	 *            实体类查询条件
	 * @return 满足条件的记录数
	 */
	public int selectWorklogCountByWhere(WorklogDTO dto){
		return worklogMapper.selectWorklogCountByWhere(dto);
	}
	/**
	 * 得到数据表Worklog满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return Worklog对象集合
	 */
	public List<Worklog> selectWorklogByPage(WorklogDTO dto){
		return worklogMapper.selectWorklogByPage(dto);
	}
}
    


