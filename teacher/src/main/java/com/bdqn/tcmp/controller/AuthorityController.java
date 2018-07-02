package com.bdqn.tcmp.controller;

import com.alibaba.fastjson.JSONObject;
import com.bdqn.tcmp.entity.Authority;
import com.bdqn.tcmp.service.AuthorityService;
import com.bdqn.tcmp.util.TreeList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("authority")
public class AuthorityController {
    @Resource
    private AuthorityService authorityService;

    @RequestMapping("/selectAuthorityAll.do")
    @ResponseBody
    public Map<String,Object> selectAuthorityAll(Integer parentId) {
        Map<String,Object> map  = new HashMap<String,Object>();
        List<Authority> list = this.authorityService.selectAuthorityAll(parentId);
        System.out.println(list);
        TreeList tree = new TreeList(list);
        List<Authority> listTree = tree.buildTree();
        map.put("authorityInfo",listTree);
        String str = JSONObject.toJSONString(map);
        System.out.println(str);
        return map;
    }

    @RequestMapping("/selectAuthorityCatalog.do")
    @ResponseBody
    public Map<String,Object> selectAuthorityCatalog() {
        Map<String,Object> map  = new HashMap<String,Object>();
        map.put("catalogInfo",this.authorityService.selectAuthorityCatalog());
        return map;
    }


}
