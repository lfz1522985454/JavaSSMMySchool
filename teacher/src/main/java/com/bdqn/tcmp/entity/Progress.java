package com.bdqn.tcmp.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Progress implements Serializable {
    /**
     * 学习进度编号
     */
    private int progressId;
    /**
     * 总题数
     */
    private int topicCount;

    private int alreadySeen;
    /**
     * 知识点编号
     */
    private int skillId;
    /**
     * 题目类型
     */
    private int opicTypeId;
    /**
     * 学生编号
     */
    private int studentId;
    /**
     * 班级编号
     */
    private int classId;
    /**
     * 总学习时长
     */
    private float countStudentTime;

    /**
     * 平均学习时长
     */
    private float avgStudentTime;

    /**
     * 开始时间
     */
    private Date startDate;
    /**
     * 结束时间
     */
    private Date endDate;
    /**
     * 最后一次登录时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;

    /**
     * 学生姓名
     */
    private String studentName;

    /**
     * 班级名称
     */
    private String className;

    public int getProgressId() {
        return progressId;
    }

    public void setProgressId(int progressId) {
        this.progressId = progressId;
    }

    public int getTopicCount() {
        return topicCount;
    }

    public void setTopicCount(int topicCount) {
        this.topicCount = topicCount;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public int getOpicTypeId() {
        return opicTypeId;
    }

    public void setOpicTypeId(int opicTypeId) {
        this.opicTypeId = opicTypeId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public float getCountStudentTime() {
        return countStudentTime;
    }

    public void setCountStudentTime(float countStudentTime) {
        this.countStudentTime = countStudentTime;
    }

    public float getAvgStudentTime() {
        return avgStudentTime;
    }

    public void setAvgStudentTime(float avgStudentTime) {
        this.avgStudentTime = avgStudentTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAlreadySeen() {
        return alreadySeen;
    }

    public void setAlreadySeen(int alreadySeen) {
        this.alreadySeen = alreadySeen;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


}

























