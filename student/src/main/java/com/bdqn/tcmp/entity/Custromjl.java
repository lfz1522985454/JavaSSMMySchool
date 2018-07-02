package com.bdqn.tcmp.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类
 *
 * @author admin
 */
public class Custromjl implements Serializable {


    private Integer questionId;

    private Date startDate;
    private Date endDate;
    private String teacherName;
    private Integer opicTypeId;
    private String opicTypeName;


    /**
     * 平均分
     */
    private Integer parentId;
    private String studentName;
    /**
     * 学生历考总题数
     */
    private Integer count;
    private double avg;
    private double sumScore;
    /**
     * 及格分
     */
    private double jj;
    /**
     * 最高分
     */
    private int max;
    /**
     * 最低分
     */
    private int min;
    /**
     * 考试月分
     */
    private Integer month;
    /**
     * 记录编号
     */
    private Integer testId;
    /**
     * 定制测试编号
     */
    private Integer customId;
    /**
     * 学生编号
     */
    private Integer studentId;
    /**
     * 考试成绩
     */
    private Integer score;
    /**
     * 出题试卷名
     */
    private String questionName;
    /**
     * 考试时间
     */
    private Date creationDate;
    /**
     * 班级名称
     */
    private String className;
    /**
     * 班级id
     */
    private Integer classId;
    /**
     * 及格数量
     */
    private String jgsl;
    /**
     * 未及格数量
     */
    private String wjgsl;
    /**
     * 及格率
     */
    private double pjf;

    public Custromjl(Integer questionId, Date startDate, Date endDate, String teacherName, Integer opicTypeId, String opicTypeName, Integer parentId, String studentName, Integer count, double avg, double sumScore, double jj, int max, int min, Integer month, Integer testId, Integer customId, Integer studentId, Integer score, String questionName, Date creationDate, String className, Integer classId, String jgsl, String wjgsl, double pjf) {
        this.questionId = questionId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teacherName = teacherName;
        this.opicTypeId = opicTypeId;
        this.opicTypeName = opicTypeName;
        this.parentId = parentId;
        this.studentName = studentName;
        this.count = count;
        this.avg = avg;
        this.sumScore = sumScore;
        this.jj = jj;
        this.max = max;
        this.min = min;
        this.month = month;
        this.testId = testId;
        this.customId = customId;
        this.studentId = studentId;
        this.score = score;
        this.questionName = questionName;
        this.creationDate = creationDate;
        this.className = className;
        this.classId = classId;
        this.jgsl = jgsl;
        this.wjgsl = wjgsl;
        this.pjf = pjf;
    }

    public Custromjl() {
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getOpicTypeId() {
        return opicTypeId;
    }

    public void setOpicTypeId(Integer opicTypeId) {
        this.opicTypeId = opicTypeId;
    }

    public String getOpicTypeName() {
        return opicTypeName;
    }

    public void setOpicTypeName(String opicTypeName) {
        this.opicTypeName = opicTypeName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public double getSumScore() {
        return sumScore;
    }

    public void setSumScore(double sumScore) {
        this.sumScore = sumScore;
    }

    public double getJj() {
        return jj;
    }

    public void setJj(double jj) {
        this.jj = jj;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getCustomId() {
        return customId;
    }

    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getJgsl() {
        return jgsl;
    }

    public void setJgsl(String jgsl) {
        this.jgsl = jgsl;
    }

    public String getWjgsl() {
        return wjgsl;
    }

    public void setWjgsl(String wjgsl) {
        this.wjgsl = wjgsl;
    }

    public double getPjf() {
        return pjf;
    }

    public void setPjf(double pjf) {
        this.pjf = pjf;
    }
}
