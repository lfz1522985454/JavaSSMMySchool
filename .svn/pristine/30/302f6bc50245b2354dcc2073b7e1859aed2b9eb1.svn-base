package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.mapper.StuParentMapper;
import com.bdqn.tcmp.service.StuParentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("stuParentService")
public class StuParentServiceImpl implements StuParentService{

    @Resource
    private StuParentMapper stuParentMapper;

    /**
     * 依据学生学号，查询出对应的家长编号
     * @param studentId 要查询的学生编号
     * @return
     */
    public Integer getParentIdByStudentId(Integer studentId) {
        return this.stuParentMapper.getParentIdByStudentId(studentId);
    }
}
