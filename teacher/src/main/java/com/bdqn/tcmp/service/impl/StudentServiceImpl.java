package com.bdqn.tcmp.service.impl;


import com.bdqn.tcmp.dto.CheckHomeWorkDTO;
import com.bdqn.tcmp.dto.ResultMessDTO;
import com.bdqn.tcmp.dto.StudentDTO;
import com.bdqn.tcmp.dto.TeacherReviewDTO;
import com.bdqn.tcmp.entity.Student;
import com.bdqn.tcmp.mapper.StudentMapper;
import com.bdqn.tcmp.service.StudentService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

	@Resource
	private StudentMapper studentMapper;


	public Integer updateStudentInfo(Student stu) {
		return studentMapper.updateStudentInfo(stu);
	}

	public List<Student> selectStudentByClassId(Integer classId) {
		return studentMapper.selectStudentByClassId(classId);
	}


	public List<Student> selectStudentByClassIdDay(Integer classId) {
		return  studentMapper.selectStudentByClassIdDay(classId);
	}

	public List<Student> selectStudentByClassIdWeek(Integer classId) {
		
		return studentMapper.selectStudentByClassIdWeek(classId);
	}

	public List<Student> selectStudentByClassIdMonth(Integer classId) {
		return studentMapper.selectStudentByClassIdMonth(classId);
	}

	public List<Student> selectStudentByClassIdYear(Integer classId) {
		return studentMapper.selectStudentByClassIdYear(classId);
	}


	public List<Student> selectStudentByWorkLog(CheckHomeWorkDTO dto) {
		return 	this.studentMapper.selectStudentByWorkLog(dto);
	}


	public List<Student> selectStudentAll() {
		return studentMapper.selectStudentAll();
	}


	public List<Student> selectStudent(StudentDTO dto) {
		return studentMapper.selectStudent(dto);
	}


	public int insertStudent(Student student) {
		return this.studentMapper.insertStudent(student);
	}


	@Transactional
	public boolean insertStuExcel(Student student) {
		System.out.println("getJsonString:" + student.getJsonString());
		boolean flag=false;
		JSONArray jsonArray = new JSONArray(student.getJsonString());
		System.out.println("jsonArray.length():"+jsonArray.length());
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < jsonArray.length();i++ ) {
			JSONObject obj = jsonArray.getJSONObject(i);//将数组中的数据转为对象类型
			Student stu = new Student();//给对象赋值
			stu.setStudentName(obj.get("studentName").toString());
			stu.setEmergencyNumber(obj.get("emergencyNumber").toString());
			stu.setStudentPassword(obj.get("studentPassword").toString());
			stu.setPhone(obj.get("phone").toString());
			stu.setAge(obj.get("age").toString());
			stu.setEmail(obj.get("email").toString());
			stu.setAddress(obj.get("address").toString());
			stu.setRemark(obj.get("remark").toString());
			this.studentMapper.insertStudent(stu);
		}

		return true;
	}

	public int selectCount(StudentDTO dto) {

		return this.studentMapper.selectCount(dto);
	}


	public Student selectById(Integer studentId) {

		return this.studentMapper.selectById(studentId);
	}

	/**
	 *依据班级编号，查询出
	 * 				班级前10名
	 * 				成绩低于平均分的
	 * 				比较上次考试前进5名和以上的
	 * 				比较上次考试后退5名和以上的
	 * 				学生的，电话，邮箱，家长的电话，邮箱，学生姓名，学生学号
	 * @param classId
	 * @param questionId
	 * @return
	 */
	public Map<String, Object> getStudentForResultMess(Integer classId, Integer questionId) {
		Map<String,Object> stuMap=new HashMap<String, Object>();
		//获取不带有排名的本次考试的学生列表
		List<ResultMessDTO> listCurrent=this.studentMapper.getCurrentQuestionScore(classId,questionId);
		//给本次考试学生设置排名
		for(int i=0;i<listCurrent.size();i++){
			listCurrent.get(i).setCurrentRank(i+1);
		}
		//获取不带有排名的上次考试的学生列表
		List<ResultMessDTO> listLast=this.studentMapper.getCurrentQuestionScore(classId,questionId);
		//给本次考试的学生设置排名
		for(int i=0;i<listLast.size();i++){
			listLast.get(i).setLastRank(i+1);
		}
		//前进超过5个名词的学生列表
		List<TeacherReviewDTO> driveMoreFiveStudentList=new ArrayList<TeacherReviewDTO>();
		//后退超过5个名词的学生列表
		List<TeacherReviewDTO> backMoreFiveStudentList=new ArrayList<TeacherReviewDTO>();
		for(ResultMessDTO obj:listCurrent){
			for (ResultMessDTO temp:listLast){
				//确保是同一个学生
				if(obj.getStudentId()==temp.getStudentId()){
					//上次成绩排名-本次成绩排名》=5就是前进了5名
					if(temp.getLastRank()-obj.getCurrentRank()>=5){
						driveMoreFiveStudentList.add(this.studentMapper.getStudentObjByStudentId(temp.getStudentId()));
					}
					//本次成绩排名-上次成绩排名》=5就是后退了5名
					if(obj.getCurrentRank()-temp.getLastRank()>=5){
						backMoreFiveStudentList.add(this.studentMapper.getStudentObjByStudentId(temp.getStudentId()));
					}
				}
			}
		}
		//获取平均分
		Double average=this.studentMapper.getAverage(classId,questionId);
		System.out.println("***********************班级平均分是："+average);
		//获取班级前10名，封装到Map中
		List<TeacherReviewDTO> stuListTop10=this.studentMapper.selectStudentByClassAndQuestionTOP10(classId,questionId);
		//前进5个和以上的排名的学生列表，放进Map中
		stuMap.put("driverStudent",driveMoreFiveStudentList);
		//后退5个和以上的排名的学生列表，放进Map中
		stuMap.put("backStudent",backMoreFiveStudentList);
		//班级前10名的学生列表，放进Map中
		stuMap.put("top",stuListTop10);
		//低于班级平均分的学生也放到Map中
		List<TeacherReviewDTO> underAverageList=this.studentMapper.underAverageStudentList(classId,questionId);
		stuMap.put("underAverageList",underAverageList);
		return stuMap;
	}
}
