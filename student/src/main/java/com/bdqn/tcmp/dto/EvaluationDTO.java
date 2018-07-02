package com.bdqn.tcmp.dto;

import java.io.Serializable;
public class EvaluationDTO implements Serializable{
    /**
     * 当前登录的学生学号
     */
    private Integer studentId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 评价起始时间
     */
    private String startDate;
    /**
     * 评价结束时间
     */
    private String endDate;
}
