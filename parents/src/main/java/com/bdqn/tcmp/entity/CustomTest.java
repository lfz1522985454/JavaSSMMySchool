package com.bdqn.tcmp.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 定制测试pojo
 */
public class CustomTest implements Serializable{
	/**
	 * 测试编号
	 */
	private int customId;

	/**
	 * 试卷编号
	 */
	private int questionId;
	/**
	 * 试卷名称
	 */
	private String questionName;

	/**
	 * 班级编号
	 */
	private int classId;
	/**
	 * 教师编号
	 */
	private int createdBy;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date creationDate;
	/**
	 * 开始时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date startDate;
	/**
	 * 结束时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endDate;
	private String className;
	/**
	 * 创建教师
	 */
	private String teacherName;
	/**
	 * 考试学员
	 */
	private String studentName;

	private int isEnable;

	private int examType;

	public int getExamType() {
		return examType;
	}

	public void setExamType(int examType) {
		this.examType = examType;
	}

	public int getCustomId() {
		return customId;
	}

	public void setCustomId(int customId) {
		this.customId = customId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(int isEnable) {
		this.isEnable = isEnable;
	}


	public String toString() {
		return "CustomTest [customId=" + customId + ", questionId=" + questionId + ", questionName=" + questionName
				+ ", classId=" + classId + ", createdBy=" + createdBy + ", creationDate=" + creationDate
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", className=" + className + ", teacherName="
				+ teacherName + ", studentName=" + studentName + ", isEnable=" + isEnable + "]";
	}




}
