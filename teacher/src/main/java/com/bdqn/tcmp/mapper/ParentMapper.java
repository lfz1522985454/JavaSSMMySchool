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
}
