package com.bdqn.tcmp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.mapper.StudentMapper;
import com.bdqn.tcmp.entity.Student;
import com.bdqn.tcmp.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

	@Resource
	private StudentMapper studentMapper;


	public Student selectStudentByStudentCodeAndStudentPassword(String studentCode, String studentPassword) {
		// TODO Auto-generated method stub
		return studentMapper.selectStudentByStudentCodeAndStudentPassword(studentCode, studentPassword);
	}


	public Student selectStudentByUUID(String uuId) {
		// TODO Auto-generated method stub
		return studentMapper.selectStudentByUUID(uuId);
	}


	public Integer insertStudentInit(Student stu) {
		// TODO Auto-generated method stub
		return studentMapper.insertStudentInit(stu);
	}


	public Integer selectStudentByStudentCode(String studentCode) {
		// TODO Auto-generated method stub
		return studentMapper.selectStudentByStudentCode(studentCode);
	}


	public Integer updateStudentInfo(Student stu) {
		// TODO Auto-generated method stub
		return studentMapper.updateStudentInfo(stu);
	}


	public Integer updateStudentByStudentId(Integer custromjCount, Integer studentId) {
		// TODO Auto-generated method stub
		return studentMapper.updateStudentByStudentId(custromjCount, studentId);
	}


	public Integer selectStudetCustromjCount(Integer studentId) {
		// TODO Auto-generated method stub
		return studentMapper.selectStudetCustromjCount(studentId);
	}


	public List<Student> selectStudentPH() {
		// TODO Auto-generated method stub
		return studentMapper.selectStudentPH();
	}


	public boolean updateImgPath(String uuid, Integer studentId) {
		// TODO Auto-generated method stub
		return studentMapper.updateImgPath(uuid, studentId);
	}


	public List<Student> selectStudentAll() {
		// TODO Auto-generated method stub
		return studentMapper.selectStudentAll();
	}


	public boolean updateStudentBySwAndNg(Integer studentId, double sw, double ng) {
		// TODO Auto-generated method stub
		return studentMapper.updateStudentBySwAndNg(studentId, sw, ng);
	}

	public List<Student> selectStudentByClassId(Integer classId) {
		return studentMapper.selectStudentByClassId(classId);
	}

}
