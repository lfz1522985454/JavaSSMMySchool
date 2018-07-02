package com.bdqn.tcmp.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 实体类
 *
 * @author admin
 */
public class Custromjl implements Serializable {
    /**
     * 平均分
     */
    /*对于日期类型需要使用的注解
        @DateTimeFormat(pattern="yyyy-MM-dd")
        @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
        @JSONField(format = "yyyy-MM-dd")    解决json乱码
    */
    private List<String> examScoreArr;
    private List<String> studentIdArr;
    private String studentName;
    private double sumScore;
    /**
     * 学生历考总题数
     */
    private Integer count;
    private double avg;
    private String stringDate;

    public double getSumScore() {
        return sumScore;
    }

    public void setSumScore(double sumScore) {
        this.sumScore = sumScore;
    }

    public String getStringDate() {
        return stringDate;
    }

    public void setStringDate(String stringDate) {
        this.stringDate = stringDate;
    }

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
    private Date startDate;
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
     * 及格率
     */
    private double pjf;
    /**
     * 接受json数据
     */
    private String jsonString;

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    public List<String> getExamScoreArr() {
        return examScoreArr;
    }

    public void setExamScoreArr(List<String> examScoreArr) {
        this.examScoreArr = examScoreArr;
    }

    public List<String> getStudentIdArr() {
        return studentIdArr;
    }

    public void setStudentIdArr(List<String> studentIdArr) {
        this.studentIdArr = studentIdArr;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getJgsl() {
        return jgsl;
    }

    public void setJgsl(String jgsl) {
        this.jgsl = jgsl;
    }

    public double getPjf() {
        return pjf;
    }

    public void setPjf(double pjf) {
        this.pjf = pjf;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
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
/**
 * --无参构造方法
 */
}
