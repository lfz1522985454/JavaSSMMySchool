package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.TeacherDTO;
import com.bdqn.tcmp.entity.Teacher;
import com.bdqn.tcmp.mapper.TeacherMapper;
import com.bdqn.tcmp.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherMapper teacherMapper;

    public List<Teacher> selectTeacherAll() {
        System.out.println("进入查询教师Service");
        return this.teacherMapper.selectTeacherAll();
    }

    public Teacher selectCountTeacher(TeacherDTO dto) {
        System.out.println("进入教师登录查询总行Service");
        return this.teacherMapper.selectCountTeacher(dto);
    }


    public boolean insertTeacher(Teacher teacher) {
        return this.teacherMapper.insertTeacher(teacher) > 0 ? true : false;
    }

    public boolean updateTeacher(Teacher teacher) {
        return this.teacherMapper.updateTeacher(teacher) > 0 ? true : false;
    }


    public Teacher selectTeacherId(String teacherName) {
        return this.teacherMapper.selectTeacherId(teacherName);
    }


    public Teacher selectTeacherByTeacherUUID(String TeacherUUID) {
        return this.teacherMapper.selectTeacherByTeacherUUID(TeacherUUID);
    }

    public List<Teacher> selectTeacherByAttrName(Integer dutyId) {
        return this.teacherMapper.selectTeacherByAttrName(dutyId);
    }

    public List<Teacher> selectByPage(TeacherDTO dto) {
        return this.teacherMapper.selectByPage(dto);
    }


    public Integer selectTeacherByPageCount(TeacherDTO dto) {
        return this.teacherMapper.selectTeacherByPageCount(dto);
    }

}
