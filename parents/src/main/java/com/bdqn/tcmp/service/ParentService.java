package com.bdqn.tcmp.service;

import com.bdqn.tcmp.entity.Parent;
import org.apache.ibatis.annotations.Param;

public interface ParentService {
    /**
     * 家长端首页登录
     * @param parentCode 家长用户名
     * @param password  家长密码
     * @return  登录返回一个家长对象
     */
    Parent parentLogin(@Param("parentCode")String parentCode, @Param("password")String password);
}
