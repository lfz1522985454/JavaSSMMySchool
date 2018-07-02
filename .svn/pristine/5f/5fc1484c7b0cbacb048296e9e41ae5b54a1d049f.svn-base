
package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.dto.CheckHomeWorkDTO;
import com.bdqn.tcmp.dto.WorkimagesDTO;
import com.bdqn.tcmp.entity.Workimages;
import com.bdqn.tcmp.service.WorkimagesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("workimages")
public class WorkImagesController {
	@Resource
	private WorkimagesService workimagesService;
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体类
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/add.do",method = RequestMethod.POST)
	public int insertworkimages(Workimages entity){
		return workimagesService.insertWorkimages(entity);
	}
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return workimages对象
	 */
	@ResponseBody
	@RequestMapping(value = "/byid.do",method = RequestMethod.POST)
	public Workimages selectworkimagesByID(int id){
		return workimagesService.selectWorkimagesByID(id);
	}

	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体类
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/edit.do",method = RequestMethod.POST)
	public int updateWorkimages(Workimages entity){
		return workimagesService.updateWorkimages(entity);
	}
	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/isen.do",method = RequestMethod.POST)
	public int updateWorkimagesEnabledByID(int id,int value){
		return workimagesService.updateWorkimagesEnabledByID(id,value);
	}
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/del.do",method = RequestMethod.POST)
	public int deleteWorkimages(int id){
		return workimagesService.deleteWorkimages(id);
	}
	/**
	 * 查询全部数据
	 * @return Workimages对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/all.do",method = RequestMethod.POST)
	public List<Workimages> selectWorkimagesAll(){
		return workimagesService.selectWorkimagesAll();
	}
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return Workimages对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/where.do",method = RequestMethod.POST)
	public List<Workimages> selectWorkimagesByWhere(WorkimagesDTO dto){
		return workimagesService.selectWorkimagesByWhere(dto);
	}

	/**
	 * 得到数据表Workimages满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return Workimages对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/page.do",method = RequestMethod.POST)
	public Map<String, Object> selectWorkimagesByPage(WorkimagesDTO dto){
		Map<String, Object> map = new HashMap<String, Object>();
		dto.setPageSize(5);
		dto.setRowCount(workimagesService.selectWorkimagesCountByWhere(dto));
		map.put("page", dto);
		map.put("WorkimagesList", workimagesService.selectWorkimagesByPage(dto));
		return map;
	}
	/**
	 * 查询全部数据
	 * @return Workimages对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/WorkImageByStudentIdAndWorkId.do")
	public List<Workimages> selectWorkImageByStudentIdAndWorkId(CheckHomeWorkDTO dto){
		return this.workimagesService.selectWorkImageByStudentIdAndWorkId(dto);
	}
}
