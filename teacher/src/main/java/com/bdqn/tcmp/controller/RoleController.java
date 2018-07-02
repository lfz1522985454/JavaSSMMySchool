package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("role")
public class RoleController {
    @Resource
    private RoleService roleService;
    @RequestMapping("/selectAll.do")
    @ResponseBody
    public Map<String,Object> selectAll(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("roleInfo",roleService.selectRoleAll());
        return map;
    }
    @RequestMapping("/selectRoleAuthorityIdByRoleId.do")
    @ResponseBody
    public Map<String,Object> selectRoleAuthorityIdByRoleId(Integer roleId){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("RoleAuthorityInfo",roleService.selectRoleAuthorityIdByRoleId(roleId));
        return map;
    }
}
