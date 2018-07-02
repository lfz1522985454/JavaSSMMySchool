package com.bdqn.tcmp.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.dto.SpecialtrainDTO;
import com.bdqn.tcmp.service.SpecialtrainService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("specialtrain")
public class SpecialtrainController {
    @Resource
    private SpecialtrainService specialtrainService;
    @RequestMapping("/selectSpecialtrainByPage.do")
    @ResponseBody
    public Map<String,Object> selectSpecialtrainByPage(SpecialtrainDTO dto){
        Map<String,Object> map = new HashMap<String,Object>();
        dto.setPageSize(10);
        dto.setRowCount(specialtrainService.selectSpecialtrainCountByWhere(dto));
        System.out.println(dto.getRowCount());
        map.put("page",dto);
        map.put("specialtrainInfoList",specialtrainService.selectSpecialtrainByPage(dto));
        System.out.println("自测统计信息:"+ JSON.toJSONString(map));
        return map;
    }
    @RequestMapping("/selectSpecialtrainAndSkillByStudentId.do")
    @ResponseBody
    public Map<String,Object> selectSpecialtrainAndSkillByStudentId(SpecialtrainDTO dto){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("selectSpecialtrainAndSkillByStudentIdList",specialtrainService.selectSpecialtrainAndSkillByStudentId(dto));
        return map;
    }
    @RequestMapping("/selectFatherNameByFatherId.do")
    @ResponseBody
    public Map<String,Object> selectFatherNameByFatherId(Integer fatherId){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("selectFatherNameByFatherId",specialtrainService.selectFatherNameByFatherId(fatherId));
        return map;
    }
}
