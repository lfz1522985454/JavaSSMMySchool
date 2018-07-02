package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.entity.Evaluation;

public interface EvaluationMapper {

    /**
     * 保存评价记录  （基于主键回填）
     * @param evaluation   要添加的对象
     * @return   主键回填的id在从表中使用
     */
    Integer saveEvaluationReturnID(Evaluation evaluation);
}
