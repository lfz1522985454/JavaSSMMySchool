package com.bdqn.tcmp.service;

import com.bdqn.tcmp.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleService {
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体
     * @return 受影响行数
     */
    int insertRole(Role entity);
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Role对象
     */
    Role selectRoleByID(int id);
    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体
     * @return 受影响行数
     */
    int updateRole(Role entity);

    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    int updateRoleEnabledByID(@Param("id")int id, @Param("value")int value);
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    int deleteRole(int id);
    /**
     * 查询全部数据
     * @return Role对象集合
     */
    List<Role> selectRoleAll();
    //根据角色Id 查看角色的权限ID
    List<Integer> selectRoleAuthorityIdByRoleId(Integer roleId);
}
