package com.bdqn.tcmp.dto;

import java.util.Date;

import com.bdqn.tcmp.util.Page;

public class SelfTestDTO extends Page{
	private String studentName;
	private int classId;
	private Date testDate;
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
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String toString() {
		return "SelfTestDTO [studentName=" + studentName + ", classId=" + classId + ", testDate=" + testDate
				+ ", endDate=" + endDate + "]";
	}
	
}
