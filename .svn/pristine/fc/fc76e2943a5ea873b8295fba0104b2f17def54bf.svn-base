package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.WorkstudentDTO;
import com.bdqn.tcmp.entity.Homework_WorkHistory;
import com.bdqn.tcmp.entity.Workstudent;
import com.bdqn.tcmp.mapper.WorkstudentMapper;
import com.bdqn.tcmp.service.WorkstudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务逻辑层接口实现类
 * @author admin
 */
@Service("workstudentService")
public class WorkstudentServiceImpl implements WorkstudentService{
	@Resource
	private WorkstudentMapper workstudentMapper;
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体类
	 * @return 受影响行数
	 */
	public int insertWorkstudent(Workstudent entity){
		return workstudentMapper.insertWorkstudent(entity);
	}

	public int insertWorkstudent(Homework_WorkHistory entity) {
		return workstudentMapper.insertWorkstudentAndHomeWork(entity);
	}


	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return Workstudent对象
	 */
	public Workstudent selectWorkstudentByID(int id){
		return workstudentMapper.selectWorkstudentByID(id);
	}

	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体类
	 * @return 受影响行数
	 */
	public int updateWorkstudent(Workstudent entity){
		return workstudentMapper.updateWorkstudent(entity);
	}
	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	public int updateWorkstudentEnabledByID(int id,int value){
		return workstudentMapper.updateWorkstudentEnabledByID(id,value);
	}
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	public int deleteWorkstudent(int id){
		return workstudentMapper.deleteWorkstudent(id);
	}
	/**
	 * 查询全部数据
	 * @return Workstudent对象集合
	 */
	public List<Workstudent> selectWorkstudentAll(){
		return workstudentMapper.selectWorkstudentAll();
	}
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return Workstudent对象集合
	 */
	public List<Workstudent> selectWorkstudentByWhere(WorkstudentDTO dto){
		return workstudentMapper.selectWorkstudentByWhere(dto);
	}

	/**
	 * 根据条件查询满足条件的记录数
	 * @param dto
	 *            实体类查询条件
	 * @return 满足条件的记录数
	 */
	public int selectWorkstudentCountByWhere(WorkstudentDTO dto){
		return workstudentMapper.selectWorkstudentCountByWhere(dto);
	}
	/**
	 * 得到数据表Workstudent满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return Workstudent对象集合
	 */
	public List<Workstudent> selectWorkstudentByPage(WorkstudentDTO dto){
		return workstudentMapper.selectWorkstudentByPage(dto);
	}
}
    


