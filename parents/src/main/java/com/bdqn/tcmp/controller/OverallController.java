package com.bdqn.tcmp.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.dto.OverallDTO;
import com.bdqn.tcmp.service.OverallService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/myclass")
public class OverallController {
    @Resource
    private OverallService overallService;

    /*
    *
    * 根据家长编号来查询学生的综合评价
    * */
    @RequestMapping("/getOverallResult.do")
    @ResponseBody
    public List<OverallDTO> overallDTOList(Integer parentId){
        return this.overallService.getOverallResult(parentId);
    }





}
