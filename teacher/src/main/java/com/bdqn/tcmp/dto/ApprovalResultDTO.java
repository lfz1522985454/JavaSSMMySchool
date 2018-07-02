package com.bdqn.tcmp.dto;

import java.io.Serializable;
import java.util.Date;
//接收待我审批的查询结果
public class ApprovalResultDTO implements Serializable{
    private Integer studentId;
    private String studentName;
    private Integer classId;
    private String className;
    private Integer approvalID;
    private Integer approvalType;
    private String attrName;
    private Date beginDate;
    private Date endDate;
    private Double diffDate;
    private String reason;
    private String image;
    private Integer jyAgree;
    private Date jyAgreeDate;
    private Integer bzrAgree;
    private Date bzrAgreeDate;

    public ApprovalResultDTO() {
    }

    public ApprovalResultDTO(Integer studentId, String studentName, Integer classId, String className, Integer approvalID, Integer approvalType, String attrName, Date beginDate, Date endDate, Double diffDate, String reason, String image, Integer jyAgree, Date jyAgreeDate, Integer bzrAgree, Date bzrAgreeDate) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.classId = classId;
        this.className = className;
        this.approvalID = approvalID;
        this.approvalType = approvalType;
        this.attrName = attrName;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.diffDate = diffDate;
        this.reason = reason;
        this.image = image;
        this.jyAgree = jyAgree;
        this.jyAgreeDate = jyAgreeDate;
        this.bzrAgree = bzrAgree;
        this.bzrAgreeDate = bzrAgreeDate;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Integer getApprovalID() {
        return approvalID;
    }

    public void setApprovalID(Integer approvalID) {
        this.approvalID = approvalID;
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

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getApprovalType() {
        return approvalType;
    }

    public void setApprovalType(Integer approvalType) {
        this.approvalType = approvalType;
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

    public Double getDiffDate() {
        return diffDate;
    }

    public void setDiffDate(Double diffDate) {
        this.diffDate = diffDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getJyAgree() {
        return jyAgree;
    }

    public void setJyAgree(Integer jyAgree) {
        this.jyAgree = jyAgree;
    }

    public Date getJyAgreeDate() {
        return jyAgreeDate;
    }

    public void setJyAgreeDate(Date jyAgreeDate) {
        this.jyAgreeDate = jyAgreeDate;
    }

    public Integer getBzrAgree() {
        return bzrAgree;
    }

    public void setBzrAgree(Integer bzrAgree) {
        this.bzrAgree = bzrAgree;
    }

    public Date getBzrAgreeDate() {
        return bzrAgreeDate;
    }

    public void setBzrAgreeDate(Date bzrAgreeDate) {
        this.bzrAgreeDate = bzrAgreeDate;
    }
}
