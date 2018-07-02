package com.bdqn.tcmp.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.bdqn.tcmp.util.Page;

public class QPaperDTO  extends Page{
	private String questionName;
	private String teacherName;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date beginTime;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endTime;
	private int quertionType;
	
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getQuertionType() {
		return quertionType;
	}
	public void setQuertionType(int quertionType) {
		this.quertionType = quertionType;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String toString() {
		return "QPaperDTO [questionName=" + questionName + ", teacherName=" + teacherName + ", beginTime=" + beginTime
				+ ", endTime=" + endTime + ", quertionType=" + quertionType + "]";
	}
	
	
}
