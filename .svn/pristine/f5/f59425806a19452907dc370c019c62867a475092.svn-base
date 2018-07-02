package com.bdqn.tcmp.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类
 *
 * @author admin
 */
public class EvaluationTeacher implements Serializable {
        /*对于日期类型需要使用的注解
            @DateTimeFormat(pattern="yyyy-MM-dd")
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
			@JSONField(format = "yyyy-MM-dd")    解决json乱码
		*/
    /**
     *
     */
    private Integer evaluationID;
    /**
     *
     */
    private Integer teacherId;

    private String teacherName;
    /**
     *
     */
    private Date createDate;
    /**
     *
     */
    private Integer classId;

    private String className;
    /**
     *
     */
    private String advice;
    /**
     *
     */
    private Integer studentCount;
    /**
     *
     */
    private Double average;
    /**
     *
     */
    private String diffName;
    /**
     *
     */
    private String state;

    private String attrName;

    private double maxScore;

    private double minScore;

    /**
     * --无参构造方法
     */
    public EvaluationTeacher() {
    }


    /**
     * --有参构造方法
     *
     * @param evaluationID
     * @param teacherId
     * @param teacherName
     * @param createDate
     * @param classId
     * @param className
     * @param advice
     * @param studentCount
     * @param average
     * @param diffName
     * @param state
     * @param attrName
     * @param maxScore
     * @param minScore
     */
    public EvaluationTeacher(Integer evaluationID, Integer teacherId, String teacherName, Date createDate, Integer classId, String className, String advice, Integer studentCount, Double average, String diffName, String state, String attrName, double maxScore, double minScore) {
        this.evaluationID = evaluationID;
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.createDate = createDate;
        this.classId = classId;
        this.className = className;
        this.advice = advice;
        this.studentCount = studentCount;
        this.average = average;
        this.diffName = diffName;
        this.state = state;
        this.attrName = attrName;
        this.maxScore = maxScore;
        this.minScore = minScore;
    }


    public Integer getEvaluationID() {
        return evaluationID;
    }

    public void setEvaluationID(Integer evaluationID) {
        this.evaluationID = evaluationID;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public String getDiffName() {
        return diffName;
    }

    public void setDiffName(String diffName) {
        this.diffName = diffName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public double getMinScore() {
        return minScore;
    }

    public void setMinScore(double minScore) {
        this.minScore = minScore;
    }

    @Override
    public String toString() {
        return "EvaluationTeacher{" +
                "evaluationID=" + evaluationID +
                ", teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", createDate=" + createDate +
                ", classId=" + classId +
                ", className='" + className + '\'' +
                ", advice='" + advice + '\'' +
                ", studentCount=" + studentCount +
                ", average=" + average +
                ", diffName='" + diffName + '\'' +
                ", state='" + state + '\'' +
                ", attrName='" + attrName + '\'' +
                ", maxScore=" + maxScore +
                ", minScore=" + minScore +
                '}';
    }
}
