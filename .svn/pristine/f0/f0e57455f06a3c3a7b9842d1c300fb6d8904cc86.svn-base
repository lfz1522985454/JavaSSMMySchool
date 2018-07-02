
package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.dto.WorkplanDTO;
import com.bdqn.tcmp.entity.Workplan;
import com.bdqn.tcmp.service.WorkplanService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("workplan")
public class WorkPlanController {
	@Resource
	private WorkplanService workplanService;
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体类
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/add.do",method = RequestMethod.POST)
	public int insertworkplan(Workplan entity){
		return workplanService.insertWorkplan(entity);
	}
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return workplan对象
	 */
	@ResponseBody
	@RequestMapping(value = "/byid.do",method = RequestMethod.POST)
	public Workplan selectworkplanByID(int id){
		return workplanService.selectWorkplanByID(id);
	}

	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体类
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/edit.do",method = RequestMethod.POST)
	public int updateworkplan(Workplan entity){
		return workplanService.updateWorkplan(entity);
	}
	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/isen.do",method = RequestMethod.POST)
	public int updateworkplanEnabledByID(int id,int value){
		return workplanService.updateWorkplanEnabledByID(id,value);
	}
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/del.do",method = RequestMethod.POST)
	public int deleteworkplan(int id){
		return workplanService.deleteWorkplan(id);
	}
	/**
	 * 查询全部数据
	 * @return workplan对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/all.do",method = RequestMethod.POST)
	public List<Workplan> selectworkplanAll(){
		return workplanService.selectWorkplanAll();
	}
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return workplan对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/where.do",method = RequestMethod.POST)
	public List<Workplan> selectworkplanByWhere(WorkplanDTO dto){
		return workplanService.selectWorkplanByWhere(dto);
	}

	/**
	 * 得到数据表workplan满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return workplan对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/page.do",method = RequestMethod.POST)
	public Map<String, Object> selectworkplanByPage(WorkplanDTO dto){
		Map<String, Object> map = new HashMap<String, Object>();
		dto.setPageSize(5);
		dto.setRowCount(workplanService.selectWorkplanCountByWhere(dto));
		map.put("page", dto);
		map.put("workplanList", workplanService.selectWorkplanByPage(dto));
		return map;
	}
}
