package com.bdqn.tcmp.dto;

import com.bdqn.tcmp.util.Page;

public class StudentDTO extends Page {
	private String studentName;
	private Integer classId;
	private String phone;
	private String parentName;
	private String idCard;

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "StudentDTO{" +
				"studentName='" + studentName + '\'' +
				", classId=" + classId +
				", phone='" + phone + '\'' +
				", parentName='" + parentName + '\'' +
				", idCard='" + idCard + '\'' +
				'}';
	}
}
