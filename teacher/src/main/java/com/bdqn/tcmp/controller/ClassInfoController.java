package com.bdqn.tcmp.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.dto.ClassDTO;
import com.bdqn.tcmp.entity.ClassInfo;
import com.bdqn.tcmp.service.ClassInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Controller
@RequestMapping("/classInfo")
public class ClassInfoController {
    @Resource
    private ClassInfoService classInfoService;

    @ResponseBody
    @RequestMapping("/selectClass.do")
    public Map<String, Object> selectClassByPage(ClassDTO dto) {
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(5);
//		dto.setPageIndex(2);
        dto.setRowCount(classInfoService.selectClassCount(dto));
        System.out.println(dto.getRowCount());
        map.put("page", dto);
        map.put("classInfoList", classInfoService.selectClassAll(dto));
        System.out.println(map);
        System.out.println("班级信息:" + JSON.toJSONString(map));
        return map;
    }

    @ResponseBody
    @RequestMapping("/selectHeadTeacher.do")
    public Map<String, Object> selectHeadTeacher() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("teacherList", classInfoService.selectHeadTeacherAll());
        System.out.println(map);
        System.out.println("老师信息:" + JSON.toJSONString(map));
        return map;
    }

    @ResponseBody
    @RequestMapping("/selClassById")
    public Map<String, Object> selectClassById(int classId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("classByList", classInfoService.selectClassById(classId));
        System.out.println(map);
        System.out.println("条件查询班级信息:" + JSON.toJSONString(map));
        return map;
    }

    @ResponseBody
    @RequestMapping("/updClassById")
    public boolean updateClassById(ClassInfo classInfo) {
        System.out.println("进入修改班级");
        boolean flag = false;
        try {
            flag = this.classInfoService.updateClass(classInfo);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;
    }

    @ResponseBody
    @RequestMapping("/delClassById")
    public boolean delClassById(int classId) {
        System.out.println("进入停用班级");
        boolean flag = false;
        try {
            flag = this.classInfoService.deleteClass(classId);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;
    }

    @ResponseBody
    @RequestMapping("/addClass")
    public boolean addClass(ClassInfo classInfo) {
        System.out.println("进入新建班级");
        System.out.println(classInfo.toString());
        boolean flag = false;
        try {
            flag = this.classInfoService.addClass(classInfo);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 查询所有班级，动态绑定下拉框数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/selClass.do")
    public List<ClassInfo> selectClassList() {
        System.out.println("班级编号和名称:" + classInfoService.selectClassList());
        return this.classInfoService.selectClassList();
    }

    @ResponseBody
    @RequestMapping("/SelClassByTeacherId.do")
    public Map<String, Object> selectClassByTeacherId(Integer teacherId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("classList", classInfoService.selectClassByTeacherId(teacherId));
        System.out.println(map);
        System.out.println("根据教师ID返回他所带的班级:" + JSON.toJSONString(map));
        return map;
    }


    @ResponseBody
    @RequestMapping("/selectClassId.do")
    public Map<String, Object> selectClassId(String className) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (className != null && className != "") {
            map.put("classid", classInfoService.selectClassId(className).getClassId());
        } else {
            map.put("classid", "");
        }
//		System.out.println("返回教师ID"+JSON.toJSONString(map));
        return map;
    }

    @ResponseBody
    @RequestMapping("/selectClassInfo.do")
    public List<ClassInfo> selectClassInfo(Integer teacherId) {
        return this.classInfoService.selectClassInfo(teacherId);
    }
}
