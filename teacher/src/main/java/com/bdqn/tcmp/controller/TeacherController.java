package com.bdqn.tcmp.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.aipface.GetSimilarity_Base64;
import com.bdqn.tcmp.dto.TeacherDTO;
import com.bdqn.tcmp.entity.Teacher;
import com.bdqn.tcmp.service.TeacherService;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    private TeacherService teacherService = null;

    @RequestMapping("/selectTeacherIdAll.do")
    @ResponseBody
    public List<Teacher> selectTeacherIdAll() {
        System.out.println("进入查询教师Controller");
        return this.teacherService.selectTeacherAll();
    }

    @RequestMapping("selectTeacherCount.do")
    @ResponseBody
    public Teacher selectTeacherCount(TeacherDTO dto) {
        System.out.println("进入教师登录查询总行");
        System.out.println("用户名:" + dto.getTeacherName());
        System.out.println("密    码:" + dto.getPassword());
        Teacher teacher=teacherService.selectCountTeacher(dto);
        if(teacher ==null ){
            teacher = new Teacher();
        }
        return teacher;
    }

    //注册
    @RequestMapping("insertTeacher.do")
    @ResponseBody
    public boolean insertTeacher(Teacher teacher) {
        return this.teacherService.insertTeacher(teacher);
    }

    @ResponseBody
    @RequestMapping("/teacherPage.do")
    public Map<String, Object> selectClassByPage(TeacherDTO dto) {
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(5);
//		dto.setPageIndex(2);
        dto.setRowCount(this.teacherService.selectTeacherByPageCount(dto));
        System.out.println(dto.getRowCount());
        map.put("page", dto);
        map.put("teacherList", teacherService.selectByPage(dto));
        System.out.println(map);
        System.out.println("教师信息:" + JSON.toJSONString(map));
        return map;
    }

    @RequestMapping("selectTeacherId.do")
    @ResponseBody
    public Map<String, Object> selectTeacherId(String teacherName) {
        Map<String, Object> map = new HashMap<String, Object>();

        if (teacherName != null && teacherName != "") {
            map.put("TeacherId", teacherService.selectTeacherId(teacherName));
        } else {
            map.put("TeacherId", "");
        }
//		System.out.println(map);
//		System.out.println("返回数据"+JSON.toJSONString(map));
        return map;
    }


    @RequestMapping("getRenLianBase64.do")
    @ResponseBody
    public String getRenlian(String base) {
        System.out.println();
        UUID imgName = UUID.randomUUID();
        String basePath = base.substring(22);
        // String path = System.getProperty("user.dir");
        GetSimilarity_Base64 t = new GetSimilarity_Base64(basePath, "bdqn", 1,
                "C:\\Program Files\\ExemSystemImg\\" + imgName + ".jpg");
        JSONObject json = t.getSimlarity();
        return json.toString();
    }

    @ResponseBody
    @RequestMapping("/selectTeacherByTeacherUUIDTest.do")
    public Teacher selectTeacherByTeacherUUIDTest(String teacherUUID) {
        System.out.println("進入進入======================");
        return this.teacherService.selectTeacherByTeacherUUID(teacherUUID);
    }

    @ResponseBody
    @RequestMapping("/selectTeacherByAttrNameTest.do")
    public List<Teacher> selectTeacherByAttrNameTest(Integer dutyId) {
        return this.teacherService.selectTeacherByAttrName(dutyId);
    }
}
