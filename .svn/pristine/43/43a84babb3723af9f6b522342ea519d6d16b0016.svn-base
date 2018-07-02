package com.bdqn.tcmp.entity;

import java.io.Serializable;

/**
 * 实体类
 *
 * @author admin
 */
public class EvaluationTopic implements Serializable {
        /*对于日期类型需要使用的注解
            @DateTimeFormat(pattern="yyyy-MM-dd")
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
			@JSONField(format = "yyyy-MM-dd")    解决json乱码
		*/
    /**
     *
     */
    private Integer evaluationTopicID;
    /**
     *
     */
    private Integer etID;
    /**
     *
     */
    private Integer evaluationID;
    /**
     *
     */
    private Integer topicNumber;
    /**
     *
     */
    private String subjectOptions;

    private Integer score;

    /**
     * --无参构造方法
     */
    public EvaluationTopic() {
    }

    /**
     * --有参构造方法
     *
     * @param evaluationTopicID
     * @param etID
     * @param topicNumber
     * @param subjectOptions
     */
    public EvaluationTopic
    (
            Integer evaluationTopicID,
            Integer etID,
            Integer evaluationID,
            Integer topicNumber,
            String subjectOptions,
            Integer score
    ) {
        this.evaluationTopicID = evaluationTopicID;
        this.etID = etID;
        this.evaluationID = evaluationID;
        this.topicNumber = topicNumber;
        this.subjectOptions = subjectOptions;
        this.score = score;

    }

    /**
     * 读取(类型:int 大小:0)
     *
     * @return 得到的
     */
    public Integer getEvaluationTopicID() {
        return evaluationTopicID;
    }

    /**
     * 读取(类型:int 大小:0)
     *
     * @return 得到的
     */
    public Integer getEtID() {
        return etID;
    }

    /**
     * 读取(类型:int 大小:0)
     *
     * @return 得到的
     */
    public Integer getTopicNumber() {
        return topicNumber;
    }

    /**
     * 读取(类型:varchar 大小:33)
     *
     * @return 得到的
     */
    public String getSubjectOptions() {
        return subjectOptions;
    }

    /**
     * 设置(类型:int 大小:0)
     *
     * @param evaluationTopicID 要设置的值
     */
    public void setEvaluationTopicID(Integer evaluationTopicID) {
        this.evaluationTopicID = evaluationTopicID;
    }

    /**
     * 设置(类型:int 大小:0)
     *
     * @param etID 要设置的值
     */
    public void setEtID(Integer etID) {
        this.etID = etID;
    }

    /**
     * 设置(类型:int 大小:0)
     *
     * @param topicNumber 要设置的值
     */
    public void setTopicNumber(Integer topicNumber) {
        this.topicNumber = topicNumber;
    }

    /**
     * 设置(类型:varchar 大小:33)
     *
     * @param subjectOptions 要设置的值
     */
    public void setSubjectOptions(String subjectOptions) {
        this.subjectOptions = subjectOptions;
    }

    public Integer getEvaluationID() {
        return evaluationID;
    }

    public void setEvaluationID(Integer evaluationID) {
        this.evaluationID = evaluationID;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "EvaluationTopic{" +
                "evaluationTopicID=" + evaluationTopicID +
                ", etID=" + etID +
                ", evaluationID=" + evaluationID +
                ", topicNumber=" + topicNumber +
                ", subjectOptions='" + subjectOptions + '\'' +
                '}';
    }
}
