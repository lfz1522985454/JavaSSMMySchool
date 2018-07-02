package com.bdqn.tcmp.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdqn.tcmp.aipface.QueryUserCount;
import com.bdqn.tcmp.base64.Base64Image;
import com.bdqn.tcmp.entity.Student;
import com.bdqn.tcmp.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Resource
	private StudentService studentService;

	@RequestMapping(value = "/loginByStudentCodeAndStudentPassword", method = RequestMethod.POST)
	@ResponseBody
	public Student loginByStudentCodeAndStudentPassword(String studentCode, String studentPassword) {
		Student stu = studentService.selectStudentByStudentCodeAndStudentPassword(studentCode, studentPassword);
		return stu;
	}

	/**
	 * 检查用户是否已经录入人脸
	 *
	 * @param uid
	 * @param groupId
	 * @return
	 */
	@RequestMapping("/queryUserCount")
	@ResponseBody
	public String queryUserCount(String uid, String groupId) throws JSONException {
		System.out.println("------------------------检查用户是否已经录入人脸");
		QueryUserCount q = new QueryUserCount(uid, groupId);
		JSONObject json = q.sample();
		return json.toString(2);

	}

	@RequestMapping("/loginByUUId")
	@ResponseBody
	public Student loginByStudentCode(String uuId) {
		Student stu = studentService.selectStudentByUUID(uuId);
		return stu;
	}

	@RequestMapping("/insertStudentInit")
	@ResponseBody
	public boolean insertStudentInit(Student stu) {
		System.out.println("---------进入注册信息");
		System.out.println("账号：" + stu.getStudentCode());
		System.out.println("姓名：" + stu.getStudentName());
		System.out.println("密码：" + stu.getStudentPassword());
		System.out.println("uuId：" + stu.getUuId());
		System.out.println("classId：" + stu.getClassId());
		if (studentService.insertStudentInit(stu) > 0) {
			System.out.println("注册成功");
			return true;
		} else {
			System.out.println("注册失败");
			return false;
		}

	}

	@RequestMapping("/selectStudentByStudentCode")
	@ResponseBody
	public boolean selectStudentByStudentCode(String studentCode) {
		if (studentService.selectStudentByStudentCode(studentCode) > 0) {
			return true;
		} else {
			return false;
		}
	}

	@RequestMapping("/updateStudentInfo")
	@ResponseBody
	public boolean updateStudentInfo(Student stu) {

		if (studentService.updateStudentInfo(stu) > 0) {
			return true;
		} else {
			return false;
		}
	}

	@RequestMapping("/updateStudentByStudentId")
	@ResponseBody
	public boolean updateStudentByStudentIdtTest(Integer custromjCount, Integer studentId) {
		System.out.println("custromjCount：" + custromjCount);
		System.out.println("studentId：" + studentId);
		if (studentService.updateStudentByStudentId(custromjCount, studentId) > 0) {
			return true;
		} else {
			return false;
		}
	}

	@RequestMapping("/selectStudetCustromjCount")
	@ResponseBody
	public Integer selectStudetCustromjCount(Integer studentId) {
		return studentService.selectStudetCustromjCount(studentId);

	}

	@RequestMapping("/selectStudentPH")
	@ResponseBody
	public List<Student> selectStudentPHTest() {
		return studentService.selectStudentPH();
	}

	// 上传头像
	@RequestMapping("/updateImgPath")
	@ResponseBody
	public boolean updateImgPath(HttpServletRequest request, String base64, Integer studentId) {
		String basePath = base64.substring(22);
		UUID imgName = UUID.randomUUID();

		boolean pathIS = Base64Image.GenerateImage(basePath,
				request.getSession().getServletContext().getRealPath(File.separator + "upload\\" + imgName + ".jpg"));
		if (pathIS) {
			// imgName插入数据库
			return studentService.updateImgPath(imgName.toString(), studentId);
		} else {
			return false;
		}
	}

	@RequestMapping("/selectStudentAll")
	@ResponseBody
	public List<Student> selectStudentAllTest() {

		return studentService.selectStudentAll();
	}

	@RequestMapping("/updateStudentBySwAndNg")
	@ResponseBody
	public boolean updateStudentBySwAndNg(Integer studentId, double sw, double ng) {
		return studentService.updateStudentBySwAndNg(studentId, sw, ng);
	}


	//selectStudentByClassId
	@RequestMapping("/selectStudentByClassId")
	@ResponseBody
	public List<Student> selectStudentByClassId(Integer classId) {
		return studentService.selectStudentByClassId(classId);
	}
}
