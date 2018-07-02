package com.bdqn.tcmp.entity;

import java.io.Serializable;
import java.util.Date;

public class SpecialTrainTest implements Serializable {

	private int id;
	private String specialtrainName;
	private Integer studentId;
	private String studentName;
	private Integer count;
	private Integer score;
	private Date createTime;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecialtrainName() {
		return specialtrainName;
	}

	public void setSpecialtrainName(String specialtrainName) {
		this.specialtrainName = specialtrainName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public SpecialTrainTest(int id, String specialtrainName, Integer studentId, String studentName, Integer count,
			Integer score, Date createTime) {
		super();
		this.id = id;
		this.specialtrainName = specialtrainName;
		this.studentId = studentId;
		this.studentName = studentName;
		this.count = count;
		this.score = score;
		this.createTime = createTime;
	}

	public SpecialTrainTest() {
		super();
		// TODO Auto-generated constructor stub
	}

}
