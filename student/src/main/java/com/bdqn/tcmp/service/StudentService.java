package com.bdqn.tcmp.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.entity.Student;

public interface StudentService {

	Student selectStudentByStudentCodeAndStudentPassword(@Param("studentCode") String studentCode,
                                                         @Param("studentPassword") String studentPassword);

	Student selectStudentByUUID(@Param("uuId") String uuId);

	Integer insertStudentInit(Student stu);

	Integer selectStudentByStudentCode(@Param("studentCode") String studentCode);

	/**
	 * 完善学生信息
	 * 
	 * @param stu
	 * @return
	 */
	Integer updateStudentInfo(Student stu);

	// 每次考试完成该考生考试次数加1
	Integer updateStudentByStudentId(@Param("custromjCount") Integer custromjCount,
                                     @Param("studentId") Integer studentId);

	Integer selectStudetCustromjCount(@Param("studentId") Integer studentId);

	// 查询校园风云榜
	List<Student> selectStudentPH();

	// 上传头像
	boolean updateImgPath(@Param("uuid") String uuid, @Param("studentId") Integer studentId);

	// 查询所有学生信息
	List<Student> selectStudentAll();

	// 修改sw,ng
	boolean updateStudentBySwAndNg(@Param("studentId") Integer studentId, @Param("sw") double sw,
                                   @Param("ng") double ng);

	/**
	 * 查询本班级的所有学生信息
	 * @param classId
	 * @return
	 */
	List<Student> selectStudentByClassId(@Param("classId") Integer classId);
}
