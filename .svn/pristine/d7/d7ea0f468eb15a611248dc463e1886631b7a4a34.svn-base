package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.EvaluationDTO;
import com.bdqn.tcmp.entity.Evaluation;
import com.bdqn.tcmp.mapper.EvaluationMapper;
import com.bdqn.tcmp.service.EvaluationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("evaluationService")
public class EvaluationServiceImpl implements EvaluationService {

    @Resource
    private EvaluationMapper evaluationMapper;

    /**
     * 依据当前登录的家长编号，查询对应的孩子的评价列表
     * @param evaluationDTO 家长编号,评价开始时间，评价结束时间
     * @return
     */
    public List<Evaluation> getCommonsByParentId(EvaluationDTO evaluationDTO) {
        return this.evaluationMapper.getCommonsByParentId(evaluationDTO);
    }
}
