package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.entity.Parent;
import com.bdqn.tcmp.mapper.ParentMapper;
import com.bdqn.tcmp.service.ParentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("parentService")
public class ParentServiceImpl implements ParentService{

    @Resource
    private ParentMapper parentMapper;

    /**
     * 家长端登录的具体业务逻辑实现
     * @param parentCode 家长用户名
     * @param password  家长密码
     * @return
     */
    public Parent parentLogin(String parentCode, String password) {
        return this.parentMapper.parentLogin(parentCode,password);
    }
}
