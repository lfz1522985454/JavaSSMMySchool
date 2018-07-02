package com.bdqn.tcmp.weixin.service.impl;

import com.bdqn.tcmp.weixin.mapper.ApproveMapper;
import com.bdqn.tcmp.weixin.service.ApproveService;
import com.bdqn.tcmp.weixin.pojo.ApproveParam;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("approveService")
public class ApproveServiceImpl implements ApproveService {
    @Resource
    private ApproveMapper approveMapper;


    public int updateUserOpenID(ApproveParam param) {
        return this.approveMapper.updateUserOpenID(param);
    }


    public List<String> selectParentAll() {
        return this.approveMapper.selectParentAll();
    }


    public List<String> selectParentByClassID(Integer classID) {
        return this.approveMapper.selectParentByClassID(classID);
    }


    public List<String> selectParentByStuID(Integer stuID) {
        return this.approveMapper.selectParentByStuID(stuID);
    }


    public String selectParentByID(Integer id) {
        return this.approveMapper.selectParentByID(id);
    }


    public List<String> selectTeacherAll() {
        return this.approveMapper.selectTeacherAll();
    }


    public List<String> selectTeacherByDuty(Integer dutyID) {
        return this.approveMapper.selectTeacherByDuty(dutyID);
    }


    public List<String> selectTeacherByStuID(String stuID) {
        return this.approveMapper.selectTeacherByStuID(stuID);
    }


    public String selectTeacherByID(Integer id) {
        return this.approveMapper.selectTeacherByID(id);
    }


    public List<String> selectStudentAll() {
        return this.approveMapper.selectStudentAll();
    }


    public List<String> selectStudentByClassID(Integer classID) {
        return this.approveMapper.selectStudentByClassID(classID);
    }


    public String selectStudentByID(Integer id) {
        return this.approveMapper.selectStudentByID(id);
    }


    public List<String> selectStudentByTeaID(Integer teaID) {
        return this.approveMapper.selectStudentByTeaID(teaID);
    }
}
