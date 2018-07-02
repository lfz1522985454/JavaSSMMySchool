package com.bdqn.tcmp.weixin.mapper;

import com.bdqn.tcmp.weixin.pojo.ApproveParam;

import java.util.List;

public interface ApproveMapper {
    int updateUserOpenID(ApproveParam param);
    List<String> selectParentAll();
    List<String> selectParentByClassID(Integer classID);
    List<String> selectParentByStuID(Integer stuID);
    String selectParentByID(Integer id);
    List<String> selectTeacherAll();
    List<String> selectTeacherByDuty(Integer dutyID);
    List<String> selectTeacherByStuID(String stuID);
    String selectTeacherByID(Integer id);
    List<String> selectStudentAll();
    List<String> selectStudentByClassID(Integer classID);
    String selectStudentByID(Integer id);
    List<String> selectStudentByTeaID(Integer teaID);
}
