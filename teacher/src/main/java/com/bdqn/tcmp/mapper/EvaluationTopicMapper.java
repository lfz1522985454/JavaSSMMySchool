package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.entity.EvaluationTopic;

import java.util.List;

public interface EvaluationTopicMapper {
    /**
     * 根据评测的ID查询每个人的测评信息
     * @param evaluationID
     * @return
     */
    List<EvaluationTopic> selectEvaluationTopicByEvaluationID(Integer evaluationID);

}
