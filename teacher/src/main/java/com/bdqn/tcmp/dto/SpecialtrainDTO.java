package com.bdqn.tcmp.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.bdqn.tcmp.util.Page;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SpecialtrainDTO extends Page {
    private Integer studentId;
    private String studentName;
    private int classId;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date startTime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date endTime;

    public SpecialtrainDTO() {
    }

    public SpecialtrainDTO(Integer studentId, String studentName, int classId, Date startTime, Date endTime) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.classId = classId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
