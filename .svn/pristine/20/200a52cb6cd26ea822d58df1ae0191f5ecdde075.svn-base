package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.entity.EvaluationDetail;
import com.bdqn.tcmp.mapper.EvaluationDetailMapper;
import com.bdqn.tcmp.service.EvaluationDetailService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("evaluationDetailService")
@Transactional
public class EvaluationDetailServiceImpl implements EvaluationDetailService {

    @Resource
    private EvaluationDetailMapper evaluationDetailMapper;

    /**
     *   从表
     * @param evaluationDetail  评价详情内容
     * @return
     */
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor={Exception.class})
    public Integer saveEvaluationDetail(EvaluationDetail evaluationDetail) {
        return this.evaluationDetailMapper.saveEvaluationDetail(evaluationDetail);
    }
}
