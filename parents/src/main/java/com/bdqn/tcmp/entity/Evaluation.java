package com.bdqn.tcmp.entity;

import javafx.scene.chart.PieChart;

import java.io.Serializable;
import java.util.Date;

/**
 * 老师点评主表
 */
public class Evaluation implements Serializable{
    /**
     * 评价编号
     */
    private Integer evaluationId;
    /*
    *评价类型
     */
    private Integer  evaluationType;
    /**
     * 评价试题编号
     */
    private Integer  questionId;
    /**
     * 评价内容
     */
    private String   comments;
    /**
     * 评价发送方式
     */
    private String sendType;

    private Date evaluationDate;

    public Date getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(Date evaluationDate) {
        this.evaluationDate = evaluationDate;
    }

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getEvaluationType() {
        return evaluationType;
    }

    public void setEvaluationType(Integer evaluationType) {
        this.evaluationType = evaluationType;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }
}
