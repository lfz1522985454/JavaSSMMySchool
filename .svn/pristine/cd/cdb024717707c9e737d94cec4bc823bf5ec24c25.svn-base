package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.ClassDTO;
import com.bdqn.tcmp.entity.ClassInfo;
import com.bdqn.tcmp.mapper.ClassInfoMapper;
import com.bdqn.tcmp.service.ClassInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("classInfoService")
public class ClassInfoServiceImpl implements ClassInfoService {
    @Resource
    private ClassInfoMapper classInfoMapper;

    public List<ClassInfo> selectClassAll(ClassDTO dto) {
        return this.classInfoMapper.selectClassAll(dto);
    }

    public Integer selectClassCount(ClassDTO dto) {
        return this.classInfoMapper.selectClassCount(dto);
    }
    public List<ClassInfo> selectHeadTeacherAll() {
        return this.classInfoMapper.selectHeadTeacherAll();
    }

//    public List<HeadTeacher> selectHeadTeacherAll() {
//        return this.classInfoMapper.selectHeadTeacherAll();
//    }

    public boolean updateClass(ClassInfo classInfo) {
        return this.classInfoMapper.updateClass(classInfo) > 0 ? true : false;
    }

    public List<ClassInfo> selectClassById(Integer classId) {
        return this.classInfoMapper.selectClassById(classId);
    }

    public boolean deleteClass(Integer classId) {
        return this.classInfoMapper.deleteClass(classId) > 0 ? true : false;
    }

    public boolean addClass(ClassInfo classInfo) {
        return this.classInfoMapper.addClass(classInfo) > 0 ? true : false;
    }


    public List<ClassInfo> selectClassList() {
        return this.classInfoMapper.selectClassList();
    }


    public ClassInfo selectClassId(String className) {
        return this.classInfoMapper.selectClassId(className);
    }
    public List<ClassInfo> selectClassInfo(Integer teacherId) {
        return this.classInfoMapper.selectClassInfo(teacherId);
    }


    public List<ClassInfo> selectClassByTeacherId(Integer teacherId) {
        return this.classInfoMapper.selectClassByTeacherId(teacherId);
    }


}
