package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.entity.Evaluation;
import com.bdqn.tcmp.mapper.EvaluationMapper;
import com.bdqn.tcmp.service.EvaluationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
@Service("evaluationService")
@Transactional
public class EvaluationServiceImpl implements EvaluationService {

    @Resource
    private EvaluationMapper evaluationMapper;

    /**
     * 保存评价记录表，主表
     * @param evaluation   要添加的对象
     * @return
     */
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor={Exception.class})
    public Integer saveEvaluationReturnID(Evaluation evaluation) {
        return this.evaluationMapper.saveEvaluationReturnID(evaluation);
    }
}
