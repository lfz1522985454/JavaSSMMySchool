package com.bdqn.tcmp.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类
 *
 * @author admin
 */
public class Specialtrain implements Serializable {
        /*对于日期类型需要使用的注解
            @DateTimeFormat(pattern="yyyy-MM-dd")
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
			@JSONField(format = "yyyy-MM-dd")    解决json乱码
		*/
    /**
     * 编号
     */
    private Integer specialtrainId;
    /**
     * 知识点编号
     */
    private Integer skillId;
    /**
     * 本次做题数
     */
    private Integer count;
    /**
     * 本次正确数
     */
    private Integer correctCount;
    /**
     * 学号
     */
    private Integer studentId;
    /**
     * 班级编号
     */
    private Integer classId;
    /**
     * 完成数
     */
    private Integer skillIdcount;
    /**
     * 总用时
     */
    private Integer totalTime;
    /**
     * 提交时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date submitTime;


    private String className;

    private String studentName;

    private double meanTime;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMeanTime() {
        return meanTime;
    }

    public void setMeanTime(double meanTime) {
        this.meanTime = meanTime;
    }

    /**
     * --无参构造方法
     */
    public Specialtrain() {
    }

    /**
     * --有参构造方法
     *
     * @param specialtrainId 编号
     * @param skillId        知识点编号
     * @param count          本次做题数
     * @param correctCount   本次正确数
     * @param studentId      学号
     * @param classId        班级编号
     * @param skillIdcount   完成数
     * @param totalTime      总用时
     * @param submitTime      提交时间
     */
    public Specialtrain(Integer specialtrainId, Integer skillId, Integer count, Integer correctCount, Integer studentId, Integer classId, Integer skillIdcount, Integer totalTime, Date submitTime) {
        this.specialtrainId = specialtrainId;
        this.skillId = skillId;
        this.count = count;
        this.correctCount = correctCount;
        this.studentId = studentId;
        this.classId = classId;
        this.skillIdcount = skillIdcount;
        this.totalTime = totalTime;
        this.submitTime = submitTime;
    }



    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Integer getSpecialtrainId() {
        return specialtrainId;
    }

    public void setSpecialtrainId(Integer specialtrainId) {
        this.specialtrainId = specialtrainId;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCorrectCount() {
        return correctCount;
    }

    public void setCorrectCount(Integer correctCount) {
        this.correctCount = correctCount;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getSkillIdcount() {
        return skillIdcount;
    }

    public void setSkillIdcount(Integer skillIdcount) {
        this.skillIdcount = skillIdcount;
    }

    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }
}
