package com.bdqn.tcmp.dto;

import java.io.Serializable;

public class CustomTestResultDTO implements Serializable{
    private Integer examMonth;
    private Integer classId;
    private String className;
    private Integer studentId;
    private String studentName;
    private Integer score;
    private Double scoreAvg;

    public CustomTestResultDTO() {
    }

    public CustomTestResultDTO(Integer examMonth, Integer classId, String className, Integer studentId, String studentName, Integer score, Double scoreAvg) {
        this.examMonth = examMonth;
        this.classId = classId;
        this.className = className;
        this.studentId = studentId;
        this.studentName = studentName;
        this.score = score;
        this.scoreAvg = scoreAvg;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
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

    public Integer getExamMonth() {
        return examMonth;
    }

    public void setExamMonth(Integer examMonth) {
        this.examMonth = examMonth;
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

    public Double getScoreAvg() {
        return scoreAvg;
    }

    public void setScoreAvg(Double scoreAvg) {
        this.scoreAvg = scoreAvg;
    }
}
