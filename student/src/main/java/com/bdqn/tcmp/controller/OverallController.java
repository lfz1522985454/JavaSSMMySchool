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
@RequestMapping("/stu")
public class OverallController {
    @Resource
    private OverallService overallService;


    /* @RequestMapping("/getOverallResult.do")
     @ResponseBody
     public Map<String, Object> getOverallResult(OveralPageDTO dto) {
         Map<String, Object> map = new HashMap<String, Object>();
         dto.setPageSize(5);
         dto.setClassId(2);
         dto.setRowCount(overallService.getOveralCount(dto));
         map.put("page", dto);
         map.put("list", overallService.getOverallResult(dto));
         System.out.println("量化评价:" + JSON.toJSONString(map));
         return map;

     }*/
    @RequestMapping("/getOverallResult.do")
    @ResponseBody
    public List<OverallDTO> getOverallResult(Integer studentId) {
        List<OverallDTO> list = this.overallService.getOverallResult(studentId);
        System.out.println(studentId + "1111111111111111111");
       /* Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(5);
        dto.setClassId(2);
        dto.setRowCount(overallService.getOveralCount(dto));
        map.put("page", dto);
        map.put("list", overallService.getOverallResult(dto));*/
        System.out.println("量化评价:" + JSON.toJSONString(list));
        return list;

    }


}
