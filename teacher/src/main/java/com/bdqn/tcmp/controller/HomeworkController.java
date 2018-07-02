
package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.dto.HomeworkDTO;
import com.bdqn.tcmp.entity.Homework;
import com.bdqn.tcmp.entity.Homework_WorkHistory;
import com.bdqn.tcmp.service.HomeworkService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/homework")
public class HomeworkController {
	@Resource
	private HomeworkService homeworkService;
	/**
	 * 向插入数据
	 * @param entity 带有要插入数据的实体类
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/add.do",method = RequestMethod.POST)
	public int inserthomeworkAndWorkHistory(Homework_WorkHistory entity){
		return this.homeworkService.insertHomeworkReturnId(entity);
	}
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return homework对象
	 */
	@ResponseBody
	@RequestMapping(value = "/byid.do",method = RequestMethod.POST)
	public Homework selecthomeworkByID(int id){
		return homeworkService.selectHomeworkByID(id);
	}

	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体类
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/edit.do",method = RequestMethod.POST)
	public int updatehomework(Homework entity){
		return homeworkService.updateHomework(entity);
	}
	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/isen.do",method = RequestMethod.POST)
	public int updatehomeworkEnabledByID(int id,int value){
		return homeworkService.updateHomeworkEnabledByID(id,value);
	}
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/del.do",method = RequestMethod.POST)
	public int deletehomework(int id){
		return homeworkService.deleteHomework(id);
	}
	/**
	 * 查询全部数据
	 * @return homework对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/all.do")
	public List<Homework> selecthomeworkAll(){
		return homeworkService.selectHomeworkAll();
	}
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return homework对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/where.do",method = RequestMethod.POST)
	public List<Homework> selecthomeworkByWhere(HomeworkDTO dto){
		return homeworkService.selectHomeworkByWhere(dto);
	}

	/**
	 * 得到数据表homework满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return homework对象集合
	 */
	@ResponseBody
	@RequestMapping("/page.do")
	public Map<String, Object> selecthomeworkByPage(HomeworkDTO dto){
		Map<String, Object> map = new HashMap<String, Object>();
		dto.setPageSize(5);
		dto.setRowCount(homeworkService.selectHomeworkCountByWhere(dto));
		map.put("page", dto);
		map.put("homeworkList", homeworkService.selectHomeworkByPage(dto));
		return map;
	}
	/**
	 * 根据班级编号查询数据
	 * @param  classId 班级编号
	 * @return homework对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/classId.do")
	public List<Homework> selecthomeworkByWhere(Integer classId){
		return homeworkService.selectHomeworkByClassID(classId);
	}
	@ResponseBody
	@RequestMapping(value = "/selectHomeworkByClassIdAndStage.do")
	public List<Homework> selectHomeworkByClassIdAndStage(Integer classId,Integer stage){
		return homeworkService.selectHomeworkByClassIdAndStage(classId,stage);
	}

}
