package com.bdqn.tcmp.dto;

/**
 * 量化评价
 */
public class OverallDTO {
    /**
     * 学生id
     */
    private Integer studentId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * 家长id
     */
    private Integer parentID;

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    /**
     * 学生姓名
     */
    private String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * 综合作业
     */
    private Double overalWork;
    /**
     * 考试及格成绩
     */
    private Double overalScore;
    /**
     * 总体考勤
     */
    private Double overalCheck;
    /**
     * 自学进度
     */
    private Double selfStudy;
    /*
    * 博客
    * */
    private Double overalBlogs;

    public Double getOveralWork() {
        return overalWork;
    }

    public void setOveralWork(Double overalWork) {
        this.overalWork = overalWork;
    }

    public Double getOveralScore() {
        return overalScore;
    }

    public void setOveralScore(Double overalScore) {
        this.overalScore = overalScore;
    }

    public Double getOveralCheck() {
        return overalCheck;
    }

    public void setOveralCheck(Double overalCheck) {
        this.overalCheck = overalCheck;
    }

    public Double getSelfStudy() {
        return selfStudy;
    }

    public void setSelfStudy(Double selfStudy) {
        this.selfStudy = selfStudy;
    }

    public Double getOveralBlogs() {
        return overalBlogs;
    }

    public void setOveralBlogs(Double overalBlogs) {
        this.overalBlogs = overalBlogs;
    }

    @Override
    public String toString() {
        return "OverallDTO{" +
                "studentName='" + studentName + '\'' +
                ", overalWork=" + overalWork +
                ", overalScore=" + overalScore +
                ", overalCheck=" + overalCheck +
                ", selfStudy=" + selfStudy +
                ", overalBlogs=" + overalBlogs +
                '}';
    }
}
