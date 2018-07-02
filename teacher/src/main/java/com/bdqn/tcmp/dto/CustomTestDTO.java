package com.bdqn.tcmp.dto;

import com.bdqn.tcmp.util.Page;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class CustomTestDTO extends Page{
	
	private String questionName;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date startDate;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endDate;
	private String teacherName;
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

	@Override
	public String toString() {
		return "CustomTestDTO{" +
				"questionName='" + questionName + '\'' +
				", startDate=" + startDate +
				", endDate=" + endDate +
				", teacherName='" + teacherName + '\'' +
				'}';
	}
}
