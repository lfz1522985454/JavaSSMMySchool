package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.entity.EvaluationTopic;
import com.bdqn.tcmp.mapper.EvaluationTopicMapper;
import com.bdqn.tcmp.service.EvaluationTopicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务逻辑层接口实现类
 *
 * @author admin
 */
@Service("evaluationTopicService")
public class EvaluationTopicServiceImpl implements EvaluationTopicService {
    @Resource
    private EvaluationTopicMapper evaluationTopicMapper;

    public List<EvaluationTopic> selectEvaluationTopicByEvaluationID(int evaluationID) {
        return this.evaluationTopicMapper.selectEvaluationTopicByEvaluationID(evaluationID);
    }
}
