package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.dto.EvaluationDTO;
import com.bdqn.tcmp.entity.Evaluation;
import com.bdqn.tcmp.service.EvaluationService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("/evaluation")
@Controller
public class EvaluationController {

    @Resource
    private EvaluationService evaluationService;

    /**
     * 依据当前登录的学生编号，查询对应的孩子的评价列表
     * @param evaluationDTO 学生编号，评价开始时间，评价结束时间
     * @return
     */
    @RequestMapping("/getCommonsByStudentId.do")
    @ResponseBody
    public List<Evaluation> getCommonsByStudentId(EvaluationDTO evaluationDTO){
        System.out.println(evaluationDTO.getStartDate());
        System.out.println(evaluationDTO.getEndDate());
            return this.evaluationService.getCommonsByStudentId(evaluationDTO);
    }
}
