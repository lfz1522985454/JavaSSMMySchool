package com.bdqn.tcmp.service;

import com.bdqn.tcmp.dto.CheckHomeWorkDTO;
import com.bdqn.tcmp.dto.StudentDTO;
import com.bdqn.tcmp.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentService {
	// 查询所有学生
	List<Student> selectStudentAll();

	List<Student> selectStudent(StudentDTO dto);

	/**
	 * 添加学生
	 * @param student 学生对象
	 * @return
	 */
	int insertStudent(Student student);

	/**
	 * Excel表格导入时添加学生
	 * @param student
	 * @return
	 */
	boolean insertStuExcel(Student student);

	int selectCount(StudentDTO dto);


	/**
	 *  姚国旺
	 * 按照编号查学生
	 * @param studentId 学生编号
	 * @return
	 */
	Student selectById(@Param("studentId") Integer studentId);


	/**
	 * 修改学生信息
	 *
	 * @param stu
	 * @return
	 */
	Integer updateStudentInfo(Student stu);

	/**
	 * 朱晓宇创建
	 * 用来查询该班级下的学生
	 * @param classId 班级编号
	 * @return 所有学生信息
	 */
	List<Student> selectStudentByClassId(Integer classId);

	/**
	 * 根据班级查询本班所有学生考勤今日（不加分页）
	 * @param classId
	 * @return
	 */
	List<Student> selectStudentByClassIdDay(@Param("classId") Integer classId);
	/**
	 * 根据班级查询本班所有学生考勤--周（不加分页）
	 * @param classId
	 * @return
	 */
	List<Student> selectStudentByClassIdWeek(@Param("classId") Integer classId);
	/**
	 * 根据班级查询本班所有学生考勤--月（不加分页）
	 * @param classId
	 * @return
	 */
	List<Student> selectStudentByClassIdMonth(@Param("classId") Integer classId);
	/**
	 * 根据班级查询本班所有学生考勤（不加分页）
	 * @param classId
	 * @return
	 */
	List<Student> selectStudentByClassIdYear(@Param("classId") Integer classId);


	/**
	 *依据班级编号，和考试编号，查询出所有的点评记录
	 * @param classId
	 * @param questionId
	 * @return
	 */
	Map<String,Object> getStudentForResultMess(@Param("classId") Integer classId,@Param("questionId") Integer questionId);
	/**
	 * 朱晓宇创建
	 * 查询学生作业完成情况
	 * @param dto 条件实体类
	 * @return 所有学生信息
	 */
	List<Student> selectStudentByWorkLog(CheckHomeWorkDTO dto);

}
