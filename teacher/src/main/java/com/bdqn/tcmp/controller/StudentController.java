package com.bdqn.tcmp.controller;


import com.bdqn.tcmp.dto.CheckHomeWorkDTO;
import com.bdqn.tcmp.dto.StudentDTO;
import com.bdqn.tcmp.entity.Student;
import com.bdqn.tcmp.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    /**
     * 依据考试编号查询出需要表扬和批评的学生列表
     *
     * @param classId
     * @param questionId
     * @return
     */
    @RequestMapping("/getStudentMapForScoreResult.do")
    @ResponseBody
    public Map<String, Object> getStudentMapForScoreResult(Integer classId, Integer questionId) {
        System.out.println(classId + "*******************" + questionId);
        return this.studentService.getStudentForResultMess(classId, questionId);
    }

    @RequestMapping("/selectStudentByCheckHomeWork")
    @ResponseBody
    public List<Student> selectStudentByCheckHomeWork(CheckHomeWorkDTO dto) {
        return studentService.selectStudentByWorkLog(dto);
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

    @RequestMapping("/insertStudent")
    @ResponseBody
    public boolean insertStudent(Student stu) {
        if (this.studentService.insertStudent(stu) > 0) {
            return true;
        } else {
            return false;
        }
    }

    //    /{excelList}
    @RequestMapping(value = "/insertStuExcel.do", method = RequestMethod.POST)
    @ResponseBody
    public boolean insertExcelStu(Student student) {

        return this.studentService.insertStuExcel(student);
    }

    @RequestMapping("/selectStudentAll")
    @ResponseBody
    public List<Student> selectStudentAllTest() {
        return studentService.selectStudentAll();
    }


    @RequestMapping("/page.do")
    @ResponseBody
    public Map<String, Object> selectStudentAndClass(StudentDTO dto) {
        dto.setPageSize(45);

        dto.setRowCount(this.studentService.selectCount(dto));
        System.out.println("总行数:" + this.studentService.selectCount(dto));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("page", dto.getRowCount());
        System.out.println(map);
        List<Student> sutList = this.studentService.selectStudent(dto);
        for (Student stu : sutList) {
//			System.out.println(stu.getStudentId());
//			List<Parent> parentsList=parentService.selectParentName(stu.getStudentId());
//			StringBuffer parentNames = new StringBuffer();
//			for (int i = 0; i < parentsList.size(); i++) {
//				parentNames.append(parentsList.get(i).getParentName()+" ");
//			}
//			stu.setParentName(parentNames.toString());
//			for (Parent parent:stu.getParentList()) {
//				System.out.print(parent.getParentName()+"  ");
//			}
        }
        map.put("studentList", sutList);
        return map;
    }

    @RequestMapping("/selectStudentByClassId")
    @ResponseBody
    public List<Student> selectStudentByClassId(Integer classId) {
        return studentService.selectStudentByClassId(classId);
    }

    @RequestMapping("/selStuByClassId.do")
    @ResponseBody
    public Map<String, Object> selectStudentByClassIdDay(Integer classId) {

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("studentList", this.studentService.selectStudentByClassIdDay(classId));
        System.out.println("-------------------------------------" + map);
        return map;
    }

    @RequestMapping("/selectStudentByClassIdWeek.do")
    @ResponseBody
    public Map<String, Object> selectStudentByClassIdWeek(Integer classId) {
        List<Student> data = this.studentService.selectStudentByClassIdWeek(classId);//data

        /*拿到所有得ID*/
        List<Integer> studentIdList = new ArrayList<Integer>();
        for (int i = 0; i < data.size(); i++) {
            studentIdList.add(data.get(i).getStudentId());
        }
        /*去除重复的ID*/
        List<Integer> tempStudentList = new ArrayList<Integer>();
        for (int i = 0; i < studentIdList.size(); i++) {
            if (!tempStudentList.contains(studentIdList.get(i))) {
                tempStudentList.add(studentIdList.get(i));
            }
        }
        List<List<Student>> lsData = new ArrayList<List<Student>>();
        for (int i = 0; i < tempStudentList.size(); i++) {
            List<Student> asdf = new ArrayList<Student>();
            for (int j = 0; j < data.size(); j++) {
                if (tempStudentList.get(i) == data.get(j).getStudentId()) {
                    asdf.add(data.get(j));
                }
            }
            lsData.add(asdf);

        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("studentListWeek", lsData);
        System.out.println("-------------------------------------" + map);
        return map;
    }

    @RequestMapping("/selectStudentByClassIdMonth.do")
    @ResponseBody
    public Map<String, Object> selectStudentByClassIdMonth(Integer classId) {
        List<Student> data = this.studentService.selectStudentByClassIdMonth(classId);//data

        /*拿到所有得ID*/
        List<Integer> studentIdList = new ArrayList<Integer>();
        for (int i = 0; i < data.size(); i++) {
            studentIdList.add(data.get(i).getStudentId());
        }
        /*去除重复的ID*/
        List<Integer> tempStudentList = new ArrayList<Integer>();
        for (int i = 0; i < studentIdList.size(); i++) {
            if (!tempStudentList.contains(studentIdList.get(i))) {
                tempStudentList.add(studentIdList.get(i));
            }
        }
        List<List<Student>> lsData = new ArrayList<List<Student>>();

        for (int i = 0; i < tempStudentList.size(); i++) {
            List<Student> asdf = new ArrayList<Student>();
            for (int j = 0; j < data.size(); j++) {
                if (tempStudentList.get(i) == data.get(j).getStudentId()) {
                    asdf.add(data.get(j));
                }
            }
            lsData.add(asdf);

        }
        Map<String, Object> map = new HashMap<String, Object>();
        // map.put("studentListWeek", this.studentService.selectStudentByClassIdWeek(classId));
        map.put("studentListMonth", lsData);
        System.out.println("-------------------------------------" + map);
        return map;
    }


    @RequestMapping("/selectStudentByClassIdYear.do")
    @ResponseBody
    public Map<String, Object> selectStudentByClassIdYear(Integer classId) {
        List<Student> data = this.studentService.selectStudentByClassIdYear(classId);//data

        /*拿到所有得ID*/
        List<Integer> studentIdList = new ArrayList<Integer>();
        for (int i = 0; i < data.size(); i++) {
            studentIdList.add(data.get(i).getStudentId());
        }
        /*去除重复的ID*/
        List<Integer> tempStudentList = new ArrayList<Integer>();
        for (int i = 0; i < studentIdList.size(); i++) {
            if (!tempStudentList.contains(studentIdList.get(i))) {
                tempStudentList.add(studentIdList.get(i));
            }
        }
        List<List<Student>> lsData = new ArrayList<List<Student>>();

        for (int i = 0; i < tempStudentList.size(); i++) {
            List<Student> asdf = new ArrayList<Student>();
            for (int j = 0; j < data.size(); j++) {
                if (tempStudentList.get(i) == data.get(j).getStudentId()) {
                    asdf.add(data.get(j));
                }
            }
            lsData.add(asdf);

        }
        Map<String, Object> map = new HashMap<String, Object>();
        // map.put("studentListWeek", this.studentService.selectStudentByClassIdWeek(classId));
        map.put("studentListYear", lsData);
        System.out.println("-------------------------------------" + map);
        return map;
    }


}

