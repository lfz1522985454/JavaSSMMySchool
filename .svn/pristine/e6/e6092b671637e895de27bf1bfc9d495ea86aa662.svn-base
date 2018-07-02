
package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.dto.WorkstudentDTO;
import com.bdqn.tcmp.entity.Workstudent;
import com.bdqn.tcmp.service.WorkstudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("workstudent")
public class WorkStudentController {
	@Resource
	private WorkstudentService workstudentService;
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体类
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/add.do",method = RequestMethod.POST)
	public int insertworkstudent(Workstudent entity){
		return workstudentService.insertWorkstudent(entity);
	}
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return workstudent对象
	 */
	@ResponseBody
	@RequestMapping(value = "/byid.do",method = RequestMethod.POST)
	public Workstudent selectworkstudentByID(int id){
		return workstudentService.selectWorkstudentByID(id);
	}

	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体类
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/edit.do",method = RequestMethod.POST)
	public int updateworkstudent(Workstudent entity){
		return workstudentService.updateWorkstudent(entity);
	}
	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/isen.do",method = RequestMethod.POST)
	public int updateworkstudentEnabledByID(int id,int value){
		return workstudentService.updateWorkstudentEnabledByID(id,value);
	}
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/del.do",method = RequestMethod.POST)
	public int deleteworkstudent(int id){
		return workstudentService.deleteWorkstudent(id);
	}
	/**
	 * 查询全部数据
	 * @return workstudent对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/all.do",method = RequestMethod.POST)
	public List<Workstudent> selectworkstudentAll(){
		return workstudentService.selectWorkstudentAll();
	}
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return workstudent对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/where.do",method = RequestMethod.POST)
	public List<Workstudent> selectworkstudentByWhere(WorkstudentDTO dto){
		return workstudentService.selectWorkstudentByWhere(dto);
	}

	/**
	 * 得到数据表workstudent满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return workstudent对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/page.do",method = RequestMethod.POST)
	public Map<String, Object> selectworkstudentByPage(WorkstudentDTO dto){
		Map<String, Object> map = new HashMap<String, Object>();
		dto.setPageSize(5);
		dto.setRowCount(workstudentService.selectWorkstudentCountByWhere(dto));
		map.put("page", dto);
		map.put("workstudentList", workstudentService.selectWorkstudentByPage(dto));
		return map;
	}
}
