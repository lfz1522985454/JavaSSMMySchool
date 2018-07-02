package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.entity.Parent;
import com.bdqn.tcmp.service.ParentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/parent")
public class ParentController{

    @Resource
    private ParentService parentService;

    /**
     * 家长登录的控制器实现
     * @param parentCode  家长的用户名
     * @param password  家长的密码
     * @return   登录成功之后，返回的家长对象
     */
    @RequestMapping("/parentLogin.do")
    @ResponseBody
    public Parent parentLogin(String parentCode,String password){
        return this.parentService.parentLogin(parentCode,password);
    }
}
