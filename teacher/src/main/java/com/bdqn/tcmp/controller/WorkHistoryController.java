
package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.dto.WorkhistoryDTO;
import com.bdqn.tcmp.entity.Workhistory;
import com.bdqn.tcmp.service.WorkhistoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("workhistory")
public class WorkHistoryController {
	@Resource
	private WorkhistoryService workHistoryService;
	/**
	 * 向插入数据
	 * @param entity
	 *            带有要插入数据的实体类
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/add.do",method = RequestMethod.POST)
	public int insertworkhistory(Workhistory entity){
		return workHistoryService.insertWorkhistory(entity);
	}
	/**
	 * 根据主键查询一个数据
	 * @param id
	 *            表的主键
	 * @return workhistory对象
	 */
	@ResponseBody
	@RequestMapping(value = "/byid.do",method = RequestMethod.POST)
	public Workhistory selectworkhistoryByID(int id){
		return workHistoryService.selectWorkhistoryByID(id);
	}
	/**
	 * 根据主键查询一个数据
	 * @param studentId  学生的主键
	 * @return workhistory对象
	 */
	@ResponseBody
	@RequestMapping(value = "/WorkhistoryReturnOne.do")
	public Workhistory selectWorkhistoryByStudenrIdReturnOne(Integer studentId){
		return workHistoryService.selectWorkhistoryByStudenrIdReturnOne(studentId);
	}

	/**
	 * 修改数据
	 * @param entity
	 *            带有要修改数据的实体类
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/edit.do")
	public int updateworkhistory(Workhistory entity){
		return workHistoryService.updateWorkhistory(entity);
	}
	/**
	 * 修改的启用状态
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/isen.do")
	public int updateworkhistoryEnabledByID(int id,int value){
		return workHistoryService.updateWorkhistoryEnabledByID(id,value);
	}
	/**
	 * 删除指定主键的数据
	 * @param id
	 *            表的主键
	 * @return 受影响行数
	 */
	@ResponseBody
	@RequestMapping(value = "/del.do",method = RequestMethod.POST)
	public int deleteworkhistory(int id){
		return workHistoryService.deleteWorkhistory(id);
	}
	/**
	 * 查询全部数据
	 * @return workhistory对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/all.do",method = RequestMethod.POST)
	public List<Workhistory> selectworkhistoryAll(){
		return workHistoryService.selectWorkhistoryAll();
	}
//	/**
//	 * 根据条件查询数据
//	 * @param dto
//	 *            实体类查询条件
//	 * @return workhistory对象集合
//	 */
//	@ResponseBody
//	@RequestMapping(value = "/where.do")
//	public Map<String, Object> selectworkhistoryByWhere(WorkhistoryDTO dto){
//		List<Workhistory> data = this.workHistoryService.selectWorkhistoryByWhere(dto);;//data
//
//		/*拿到所有得ID*/
//		List<Integer> studentIdList = new ArrayList<Integer>();
//		for (int i = 0; i < data.size(); i++) {
//			studentIdList.add(data.get(i).getStudentID());
//		}
//		/*去除重复的ID*/
//		List<Integer> tempStudentList = new ArrayList<Integer>();
//		for (int i = 0; i < studentIdList.size(); i++) {
//			if (!tempStudentList.contains(studentIdList.get(i))) {
//				tempStudentList.add(studentIdList.get(i));
//			}
//		}
//		List<List<Workhistory>> lsData = new ArrayList<List<Workhistory>>();
//
//		for (int i = 0; i < tempStudentList.size(); i++) {
//			List<Workhistory> asdf = new ArrayList<Workhistory>();
//			for (int j = 0; j < data.size(); j++) {
//				if (tempStudentList.get(i) == data.get(j).getStudentID()) {
//					asdf.add(data.get(j));
//				}
//			}
//			lsData.add(asdf);
//
//		}
//		Map<String, Object> map = new HashMap<String, Object>();
//		// map.put("studentListWeek", this.studentService.selectStudentByClassIdWeek(classId));
//		map.put("studentListMonth", lsData);
//		System.out.println("-------------------------------------" + map);
//		return map;
//	}
	/**
	 * 根据条件查询数据
	 * @param dto
	 *            实体类查询条件
	 * @return workhistory对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/where.do")
	public List<Workhistory> selectworkhistoryByWhere(WorkhistoryDTO dto){
		List<Workhistory> list = workHistoryService.selectWorkhistoryByWhere(dto);
		for (Workhistory workhistory : list) {
			System.out.println(list.toString());
		}
		return list;
	}

	/**
	 * 得到数据表workhistory满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return workhistory对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/page.do",method = RequestMethod.POST)
	public Map<String, Object> selectworkhistoryByPage(WorkhistoryDTO dto){
		Map<String, Object> map = new HashMap<String, Object>();
		dto.setPageSize(5);
		dto.setRowCount(workHistoryService.selectWorkhistoryCountByWhere(dto));
		map.put("page", dto);
		map.put("workhistoryList", workHistoryService.selectWorkhistoryByPage(dto));
		return map;
	}

	/**
	 * 得到数据表workhistory满足查询条件的分页记录
	 * @param dto
	 *            实体类查询条件
	 * @return workhistory对象集合
	 */
	@ResponseBody
	@RequestMapping(value = "/selectWorkHistoryByStudentIdAndpage.do")
	public Map<String, Object> selectWorkHistoryByStudentIdAndpage(WorkhistoryDTO dto){
		Map<String, Object> map = new HashMap<String, Object>();
		dto.setPageSize(5);
		dto.setRowCount(workHistoryService.selectWorkhistoryCountByWhere(dto));
		map.put("page", dto);
		map.put("workhistoryByStudentId", workHistoryService.selectWorkhistoryByStudentId(dto));
		return map;
	}
}
