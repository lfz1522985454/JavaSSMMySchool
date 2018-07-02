package com.bdqn.tcmp.dto;

import java.io.Serializable;

public class AttendancelResultDTO implements Serializable{
    private Integer classId;
    private String className;
    private Integer stuNum;
    private Integer state;
    private String attrName;
    public AttendancelResultDTO() {
    }

    public AttendancelResultDTO(Integer classId, String className, Integer stuNum, Integer state, String attrName) {
        this.classId = classId;
        this.className = className;
        this.stuNum = stuNum;
        this.state = state;
        this.attrName = attrName;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getStuNum() {
        return stuNum;
    }

    public void setStuNum(Integer stuNum) {
        this.stuNum = stuNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
