package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.entity.EvaluationDetail;

public interface EvaluationDetailMapper {

    /**
     * 添加评价详情(从表)
     * @param evaluationDetail  评价详情内容
     * @return  受影响行数
     */
    Integer saveEvaluationDetail(EvaluationDetail evaluationDetail);

}
