package com.bdqn.tcmp.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.bdqn.tcmp.util.Page;


public class ProgressDTO extends Page{
	private String studentName;
	private int classId;
	private int opicTypeId;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date startDate;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endDate;
	
	
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
	public int getOpicTypeId() {
		return opicTypeId;
	}
	public void setOpicTypeId(int opicTypeId) {
		this.opicTypeId = opicTypeId;
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

	public String toString() {
		return "ProgressDTO [studentName=" + studentName + ", classId=" + classId + ", opicTypeId=" + opicTypeId
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
}
