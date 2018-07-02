package com.bdqn.tcmp.entity;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类
 * @author admin
 */
public class Approval implements Serializable{
		/*对于日期类型需要使用的注解
			@DateTimeFormat(pattern="yyyy-MM-dd")
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
			@JSONField(format = "yyyy-MM-dd")    解决json乱码
		*/
    /**
     * 编号
     */
    private Integer approvalID;
    /**
     * 请假类型
     */
    private Integer approvalType;
    /**
     * 开始时间
     */
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date beginDate;
    /**
     * 结束时间
     */
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date endDate;
    /**
     * 差异时间
     */
    private Double diffDate;
    /**
     * 请假事由
     */
    private String reason;
    /**
     * 图片（病假条）
     */
    private String image;
    /**
     * 审批的教员
     */
    private Integer approvalJY;
    /**
     * 审批的班主任
     */
    private Integer approvalBZR;
    /**
     * 教员是否同意
     */
    private Integer jyAgree;
    /**
     * 班主任是否同意
     */
    private Integer bzrAgree;
    /**
     * 教员审批时间
     */
    private Date jyAgreeDate;
    /**
     * 班主任审批时间
     */
    private Date bzrAgreeDate;
    /**
     * 请假学生ID
     */
    private Integer studentId;
    /**
     * --无参构造方法
     */
    public Approval()
    {
    }
    /**
     * --有参构造方法
     * @param approvalID 编号
     * @param approvalType 请假类型
     * @param beginDate 开始时间
     * @param endDate 结束时间
     * @param diffDate 差异时间
     * @param reason 请假事由
     * @param image 图片（病假条）
     * @param approvalJY 审批的教员
     * @param approvalBZR 审批的班主任
     * @param jyAgree 教员是否同意
     * @param bzrAgree 班主任是否同意
     * @param jyAgreeDate 教员审批时间
     * @param bzrAgreeDate 班主任审批时间
     */
    public Approval
    (
            Integer approvalID,
            Integer approvalType,
            Date beginDate,
            Date endDate,
            Double diffDate,
            String reason,
            String image,
            Integer approvalJY,
            Integer approvalBZR,
            Integer jyAgree,
            Integer bzrAgree,
            Date jyAgreeDate,
            Date bzrAgreeDate
    )
    {
        this.approvalID   = approvalID;
        this.approvalType = approvalType;
        this.beginDate    = beginDate;
        this.endDate      = endDate;
        this.diffDate     = diffDate;
        this.reason       = reason;
        this.image        = image;
        this.approvalJY   = approvalJY;
        this.approvalBZR  = approvalBZR;
        this.jyAgree      = jyAgree;
        this.bzrAgree     = bzrAgree;
        this.jyAgreeDate  = jyAgreeDate;
        this.bzrAgreeDate = bzrAgreeDate;

    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * 读取编号(类型:int 大小:0)
     * @return 得到的编号
     */
    public Integer getApprovalID(){
        return approvalID;
    }

    /**
     * 读取请假类型(类型:int 大小:0)
     * @return 得到的请假类型
     */
    public Integer getApprovalType(){
        return approvalType;
    }

    /**
     * 读取开始时间(类型:datetime 大小:0)
     * @return 得到的开始时间
     */
    public Date getBeginDate(){
        return beginDate;
    }

    /**
     * 读取结束时间(类型:datetime 大小:0)
     * @return 得到的结束时间
     */
    public Date getEndDate(){
        return endDate;
    }

    /**
     * 读取差异时间(类型:double 大小:0)
     * @return 得到的差异时间
     */
    public Double getDiffDate(){
        return diffDate;
    }

    /**
     * 读取请假事由(类型:varchar 大小:765)
     * @return 得到的请假事由
     */
    public String getReason(){
        return reason;
    }

    /**
     * 读取图片（病假条）(类型:varchar 大小:765)
     * @return 得到的图片（病假条）
     */
    public String getImage(){
        return image;
    }

    /**
     * 读取审批的教员(类型:int 大小:0)
     * @return 得到的审批的教员
     */
    public Integer getApprovalJY(){
        return approvalJY;
    }

    /**
     * 读取审批的班主任(类型:int 大小:0)
     * @return 得到的审批的班主任
     */
    public Integer getApprovalBZR(){
        return approvalBZR;
    }

    /**
     * 读取教员是否同意(类型:int 大小:0)
     * @return 得到的教员是否同意
     */
    public Integer getJyAgree(){
        return jyAgree;
    }

    /**
     * 读取班主任是否同意(类型:int 大小:0)
     * @return 得到的班主任是否同意
     */
    public Integer getBzrAgree(){
        return bzrAgree;
    }

    /**
     * 读取教员审批时间(类型:datetime 大小:0)
     * @return 得到的教员审批时间
     */
    public Date getJyAgreeDate(){
        return jyAgreeDate;
    }

    /**
     * 读取班主任审批时间(类型:datetime 大小:0)
     * @return 得到的班主任审批时间
     */
    public Date getBzrAgreeDate(){
        return bzrAgreeDate;
    }

    /**
     * 设置编号(类型:int 大小:0)
     * @param approvalID 要设置编号的值
     */
    public void setApprovalID(Integer approvalID){
        this.approvalID=approvalID;
    }

    /**
     * 设置请假类型(类型:int 大小:0)
     * @param approvalType 要设置请假类型的值
     */
    public void setApprovalType(Integer approvalType){
        this.approvalType=approvalType;
    }

    /**
     * 设置开始时间(类型:datetime 大小:0)
     * @param beginDate 要设置开始时间的值
     */
    public void setBeginDate(Date beginDate){
        this.beginDate=beginDate;
    }

    /**
     * 设置结束时间(类型:datetime 大小:0)
     * @param endDate 要设置结束时间的值
     */
    public void setEndDate(Date endDate){
        this.endDate=endDate;
    }

    /**
     * 设置差异时间(类型:double 大小:0)
     * @param diffDate 要设置差异时间的值
     */
    public void setDiffDate(Double diffDate){
        this.diffDate=diffDate;
    }

    /**
     * 设置请假事由(类型:varchar 大小:765)
     * @param reason 要设置请假事由的值
     */
    public void setReason(String reason){
        this.reason=reason;
    }

    /**
     * 设置图片（病假条）(类型:varchar 大小:765)
     * @param image 要设置图片（病假条）的值
     */
    public void setImage(String image){
        this.image=image;
    }

    /**
     * 设置审批的教员(类型:int 大小:0)
     * @param approvalJY 要设置审批的教员的值
     */
    public void setApprovalJY(Integer approvalJY){
        this.approvalJY=approvalJY;
    }

    /**
     * 设置审批的班主任(类型:int 大小:0)
     * @param approvalBZR 要设置审批的班主任的值
     */
    public void setApprovalBZR(Integer approvalBZR){
        this.approvalBZR=approvalBZR;
    }

    /**
     * 设置教员是否同意(类型:int 大小:0)
     * @param jyAgree 要设置教员是否同意的值
     */
    public void setJyAgree(Integer jyAgree){
        this.jyAgree=jyAgree;
    }

    /**
     * 设置班主任是否同意(类型:int 大小:0)
     * @param bzrAgree 要设置班主任是否同意的值
     */
    public void setBzrAgree(Integer bzrAgree){
        this.bzrAgree=bzrAgree;
    }

    /**
     * 设置教员审批时间(类型:datetime 大小:0)
     * @param jyAgreeDate 要设置教员审批时间的值
     */
    public void setJyAgreeDate(Date jyAgreeDate){
        this.jyAgreeDate=jyAgreeDate;
    }

    /**
     * 设置班主任审批时间(类型:datetime 大小:0)
     * @param bzrAgreeDate 要设置班主任审批时间的值
     */
    public void setBzrAgreeDate(Date bzrAgreeDate){
        this.bzrAgreeDate=bzrAgreeDate;
    }

    @Override
    public String toString() {
        return "Approval{" +
                "approvalID=" + approvalID +
                ", approvalType=" + approvalType +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", diffDate=" + diffDate +
                ", reason='" + reason + '\'' +
                ", image='" + image + '\'' +
                ", approvalJY=" + approvalJY +
                ", approvalBZR=" + approvalBZR +
                ", jyAgree=" + jyAgree +
                ", bzrAgree=" + bzrAgree +
                ", jyAgreeDate=" + jyAgreeDate +
                ", bzrAgreeDate=" + bzrAgreeDate +
                ", studentId=" + studentId +
                '}';
    }

}
