package com.bdqn.tcmp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdqn.tcmp.entity.Skill;

import com.bdqn.tcmp.service.SkillService;

@Controller
@RequestMapping("/skill")
public class SkillController {

    @Resource
    private SkillService skillService = null;

    /**
     * 查询一级菜单
     * @return
     */
    @RequestMapping("/selFather")
    @ResponseBody
    public List<Skill> selFather() {
        return skillService.selectFather();
    }


    /**
     * 依据一级菜单选中的，动态绑定二级和三级菜单数据
     * @param fatherId
     * @return
     */
    @RequestMapping("/getChildMenu.do")
    @ResponseBody
    public  List<Skill> selSecondMenu(Integer fatherId){
            return this.skillService.selectSkillByFatherId(fatherId);
    }

    @RequestMapping("selById")
    @ResponseBody
    public List<Skill> selById() {
        return skillService.selectSkillNameById();
    }
}
