package com.bdqn.tcmp.entity;

import java.io.Serializable;
import java.util.Date;

public class Taskdetail implements Serializable {

    private Integer detailId;
    private String detailName;
    private Integer taskId;
    private Integer studentId;
    private Integer isComplete;
    private Date completeDate;
    private Integer isDelay;
    private String studentName;
    private String imgFilePath;
    private String taskName;
    private Date beginDate;
    private Date endDate;

    private Integer TaskState;
    private String remark;
    private Integer visibleLevel;
    private Integer classId;
    private Integer fstudentId;

    public Taskdetail(Integer detailId, String detailName, Integer taskId, Integer studentId, Integer isComplete, Date completeDate, Integer isDelay, String studentName, String imgFilePath, String taskName, Date beginDate, Date endDate, Integer taskState, String remark, Integer visibleLevel, Integer classId, Integer fstudentId) {
        this.detailId = detailId;
        this.detailName = detailName;
        this.taskId = taskId;
        this.studentId = studentId;
        this.isComplete = isComplete;
        this.completeDate = completeDate;
        this.isDelay = isDelay;
        this.studentName = studentName;
        this.imgFilePath = imgFilePath;
        this.taskName = taskName;
        this.beginDate = beginDate;
        this.endDate = endDate;
        TaskState = taskState;
        this.remark = remark;
        this.visibleLevel = visibleLevel;
        this.classId = classId;
        this.fstudentId = fstudentId;
    }

    public Taskdetail() {
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public Integer getIsDelay() {
        return isDelay;
    }

    public void setIsDelay(Integer isDelay) {
        this.isDelay = isDelay;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getImgFilePath() {
        return imgFilePath;
    }

    public void setImgFilePath(String imgFilePath) {
        this.imgFilePath = imgFilePath;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getTaskState() {
        return TaskState;
    }

    public void setTaskState(Integer taskState) {
        TaskState = taskState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getVisibleLevel() {
        return visibleLevel;
    }

    public void setVisibleLevel(Integer visibleLevel) {
        this.visibleLevel = visibleLevel;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getFstudentId() {
        return fstudentId;
    }

    public void setFstudentId(Integer fstudentId) {
        this.fstudentId = fstudentId;
    }
}
