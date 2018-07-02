
package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.dto.WorklogDTO;
import com.bdqn.tcmp.entity.Worklog;
import com.bdqn.tcmp.service.WorklogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("worklog")
public class WorkLogController {
	@Resource
	private WorklogService worklogService;
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体类
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/add.do",method = RequestMethod.POST)
	public int insertworklog(Worklog entity){
		return worklogService.insertWorklog(entity);
	}
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return worklog对象
	 */
	@ResponseBody
	@RequestMapping(value = "/byid.do",method = RequestMethod.POST)
	public Worklog selectworklogByID(int id){
		return worklogService.selectWorklogByID(id);
	}

	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体类
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/edit.do",method = RequestMethod.POST)
	public int updateworklog(Worklog entity){
		return worklogService.updateWorklog(entity);
	}
	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/isen.do",method = RequestMethod.POST)
	public int updateworklogEnabledByID(int id,int value){
		return worklogService.updateWorklogEnabledByID(id,value);
	}
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/del.do",method = RequestMethod.POST)
	public int deleteworklog(int id){
		return worklogService.deleteWorklog(id);
	}
	/**
	 * 查询全部数据
	 * @return worklog对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/all.do",method = RequestMethod.POST)
	public List<Worklog> selectworklogAll(){
		return worklogService.selectWorklogAll();
	}
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return worklog对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/where.do",method = RequestMethod.POST)
	public List<Worklog> selectworklogByWhere(WorklogDTO dto){
		return worklogService.selectWorklogByWhere(dto);
	}

	/**
	 * 得到数据表worklog满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return worklog对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/page.do",method = RequestMethod.POST)
	public Map<String, Object> selectworklogByPage(WorklogDTO dto){
		Map<String, Object> map = new HashMap<String, Object>();
		dto.setPageSize(5);
		dto.setRowCount(worklogService.selectWorklogCountByWhere(dto));
		map.put("page", dto);
		map.put("worklogList", worklogService.selectWorklogByPage(dto));
		return map;
	}
}
