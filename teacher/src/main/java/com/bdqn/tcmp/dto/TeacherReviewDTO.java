package com.bdqn.tcmp.dto;

/**
 * 老师点评的数据传输对象
 */
public class TeacherReviewDTO {
    private String studentName;
    private String studentPhone;
    private String parentPhone;
    private String studentEmail;
    private String parentEmail;
    private Integer studentId;
    public TeacherReviewDTO() {
    }

    public TeacherReviewDTO(String studentName, String studentPhone, String parentPhone, String studentEmail, String parentEmail, Integer studentId) {
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.parentPhone = parentPhone;
        this.studentEmail = studentEmail;
        this.parentEmail = parentEmail;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
