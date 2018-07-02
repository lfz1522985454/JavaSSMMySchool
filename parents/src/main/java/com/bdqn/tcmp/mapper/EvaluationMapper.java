package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.dto.EvaluationDTO;
import com.bdqn.tcmp.entity.Evaluation;

import java.util.List;

public interface EvaluationMapper{

    /**
     * 家长端依据家长登录编号，查询出家长对应的孩子的评价列表
     * @param evaluationDTO 家长编号,评价日期的起始和结束日期
     * @return 评价列表
     */
    List<Evaluation> getCommonsByParentId(EvaluationDTO evaluationDTO);
}
