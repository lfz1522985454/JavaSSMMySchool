package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.entity.Parent;
import com.bdqn.tcmp.mapper.ParentMapper;
import com.bdqn.tcmp.service.ParentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("parentService")
public class ParentServiceImpl implements ParentService {

    @Resource
    private ParentMapper parentMapper;

    public List<Parent> selectParentName(Integer studentId) {
        return this.parentMapper.selectParentName(studentId);
    }
}
