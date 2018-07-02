package com.bdqn.tcmp.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.dto.ApprovalDTO;
import com.bdqn.tcmp.entity.Approval;
import com.bdqn.tcmp.service.ApprovalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("approval")
public class ApprovalController {
    @Resource
    private ApprovalService approvalService;
    @RequestMapping("/selectApprovalByPage.do")
    @ResponseBody
    public Map<String,Object> selectApprovalByPage(ApprovalDTO dto){
        Map<String,Object> map = new HashMap<String,Object>();
        dto.setPageSize(10);
        dto.setRowCount(approvalService.selectApprovalCountByWhere(dto));
        System.out.println(dto.getRowCount());
        map.put("page",dto);
        map.put("approvalInfoList",approvalService.selectApprovalByPage(dto));
        System.out.println("待我审批信息:"+ JSON.toJSONString(map));
        return map;
    }
    //根据teacherId判断dutyId
    @RequestMapping("/selectTeacherDutyByTeacherId.do")
    @ResponseBody
    public Map<String,Object> selectTeacherDutyByTeacherId(Integer teacherId) {
        Map<String, Object> map = new HashMap<String, Object>();
        int dutyId = approvalService.selectTeacherDutyByTeacherId(teacherId);
        map.put("dutyId",dutyId);
        return map;
    }
    //教员审批
    @RequestMapping("/updateApprovalByJY.do")
    @ResponseBody
    public Map<String,Object> updateApprovalByJY(ApprovalDTO dto){
        Map<String, Object> map = new HashMap<String, Object>();
        int row = approvalService.updateApprovalByJY(dto);
        map.put("row",row);
        return map;
    }
    //班主任审批
    @RequestMapping("/updateApprovalByBZR.do")
    @ResponseBody
    public Map<String,Object> updateApprovalByBZR(ApprovalDTO dto){
        Map<String, Object> map = new HashMap<String, Object>();
        int row = approvalService.updateApprovalByBZR(dto);
        map.put("row",row);
        return map;
    }


}
