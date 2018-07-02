package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.entity.Role;
import com.bdqn.tcmp.mapper.RoleMapper;
import com.bdqn.tcmp.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;
    public int insertRole(Role entity) {
        return this.roleMapper.insertRole(entity);
    }

    public Role selectRoleByID(int id) {
        return this.roleMapper.selectRoleByID(id);
    }

    public int updateRole(Role entity) {
        return this.roleMapper.updateRole(entity);
    }

    public int updateRoleEnabledByID(int id, int value) {
        return this.roleMapper.updateRoleEnabledByID(id,value);
    }

    public int deleteRole(int id) {
        return this.roleMapper.deleteRole(id);
    }

    public List<Role> selectRoleAll() {
        return this.roleMapper.selectRoleAll();
    }

    public List<Integer> selectRoleAuthorityIdByRoleId(Integer roleId) {
        return this.roleMapper.selectRoleAuthorityIdByRoleId(roleId);
    }
}
