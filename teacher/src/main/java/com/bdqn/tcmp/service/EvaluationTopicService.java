package com.bdqn.tcmp.service;

import com.bdqn.tcmp.entity.EvaluationTopic;

import java.util.List;

/**
 * 业务逻辑层接口
 *
 * @author admin
 */
public interface EvaluationTopicService {
    /**
     * 根据评测的ID查询每个人的测评信息
     *
     * @param evaluationID
     * @return
     */
    List<EvaluationTopic> selectEvaluationTopicByEvaluationID(int evaluationID);
}
