package com.bdqn.tcmp.dto;

import com.bdqn.tcmp.util.Page;

public class EvaluationTeacherDTO extends Page {
    private String teacherName;
    private String beginDate;
    private String endDate;
    private Integer detailID;
    private String state;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }


    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getDetailID() {
        return detailID;
    }

    public void setDetailID(Integer detailID) {
        this.detailID = detailID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "EvaluationTeacherDTO{" +
                "teacherName='" + teacherName + '\'' +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", detailID='" + detailID + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
