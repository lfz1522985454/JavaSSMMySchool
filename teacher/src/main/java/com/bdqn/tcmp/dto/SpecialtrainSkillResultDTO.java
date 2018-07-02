package com.bdqn.tcmp.dto;

import java.io.Serializable;

public class SpecialtrainSkillResultDTO implements Serializable{
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
    //技能ID--三级
    private Integer skillId;
    //技能ID的父级ID--二级
    private Integer fatherId;
    //技能名称--三级
    private String skillName;

    public SpecialtrainSkillResultDTO() {
    }

    public SpecialtrainSkillResultDTO(Integer studentId, String studentName, Integer sumNumber, Integer rightNumber, Integer sumTime, String className, Integer skillId, Integer fatherId, String skillName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sumNumber = sumNumber;
        this.rightNumber = rightNumber;
        this.sumTime = sumTime;
        this.className = className;
        this.skillId = skillId;
        this.fatherId = fatherId;
        this.skillName = skillName;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
}
