package com.bdqn.tcmp.dto;

import java.io.Serializable;
import java.text.DecimalFormat;

public class SpecialtrainResultDTO implements Serializable {
    //学生ID
    private Integer studentId;
    //学生姓名
    private String studentName;
    //总题数
    private Integer sumNumber;
    //正确题数
    private Integer rightNumber;
    //总用时
    private Integer sumTime;
    //班级名称
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getSumNumber() {
        return sumNumber;
    }

    public void setSumNumber(Integer sumNumber) {
        this.sumNumber = sumNumber;
    }

    public Integer getRightNumber() {
        return rightNumber;
    }

    public void setRightNumber(Integer rightNumber) {
        this.rightNumber = rightNumber;
    }

    public Integer getSumTime() {
        return sumTime;
    }

    public void setSumTime(Integer sumTime) {
        this.sumTime = sumTime;
    }

}
