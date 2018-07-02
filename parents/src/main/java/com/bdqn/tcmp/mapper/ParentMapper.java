package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.entity.Parent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 家长数据访问层接口
 * @author 姚国旺
 */
public interface ParentMapper {
    /**
     * 根据学生编号查询
     * @return
     */
    List<Parent> selectParentName(@Param("studentId") Integer studentId);

    /**
     * 家长端首页登录
     * @param parentCode 家长用户名
     * @param password  家长密码
     * @return  登录返回一个家长对象
     */
    Parent parentLogin(@Param("parentCode")String parentCode,@Param("password")String password);
}
