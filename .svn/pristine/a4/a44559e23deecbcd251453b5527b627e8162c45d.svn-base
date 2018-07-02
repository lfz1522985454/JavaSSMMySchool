package com.bdqn.tcmp.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类
 *
 * @author admin
 */
public class Workhistory implements Serializable {
    /*对于日期类型需要使用的注解
        @DateTimeFormat(pattern="yyyy-MM-dd")
        @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
        @JSONField(format = "yyyy-MM-dd")    解决json乱码
    */
    private String remark;
    private String workdetail;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private Integer classId;
    /**
     * 记录编号
     */
    private Integer historyID;
    /**
     * 学号
     */
    private Integer studentID;
    /**
     * 作业编号
     */
    private Integer workID;
    /**
     * 标注日期
     */
    private Date createDate;
    /**
     * 是否完成
     */
    private Short isComplete;

    @Override
    public String toString() {
        return "Workhistory{" +
                "classId=" + classId +
                ", historyID=" + historyID +
                ", studentID=" + studentID +
                ", workID=" + workID +
                ", createDate=" + createDate +
                ", isComplete=" + isComplete +
                ", workname='" + workname + '\'' +
                '}';
    }

    /**
     * --无参构造方法
     */
    public Workhistory() {
    }

    /**
     * --有参构造方法
     *
     * @param historyID  记录编号
     * @param studentID  学号
     * @param workID     作业编号
     * @param createDate 标注日期
     * @param isComplete 是否完成
     */
    public Workhistory
    (
            Integer historyID,
            Integer studentID,
            Integer workID,
            Date createDate,
            Short isComplete
    ) {
        this.historyID = historyID;
        this.studentID = studentID;
        this.workID = workID;
        this.createDate = createDate;
        this.isComplete = isComplete;

    }

    public String getWorkdetail() {
        return workdetail;
    }

    public void setWorkdetail(String workdetail) {
        this.workdetail = workdetail;
    }

    /**
     * 读取记录编号(类型:int 大小:0)
     *
     * @return 得到的记录编号
     */
    public Integer getHistoryID() {
        return historyID;
    }

    /**
     * 读取学号(类型:int 大小:0)
     *
     * @return 得到的学号
     */
    public Integer getStudentID() {
        return studentID;
    }

    /**
     * 读取作业编号(类型:int 大小:0)
     *
     * @return 得到的作业编号
     */
    public Integer getWorkID() {
        return workID;
    }

    /**
     * 读取标注日期(类型:datetime 大小:0)
     *
     * @return 得到的标注日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 读取是否完成(类型:smallint 大小:0)
     *
     * @return 得到的是否完成
     */
    public Short getIsComplete() {
        return isComplete;
    }

    /**
     * 设置记录编号(类型:int 大小:0)
     *
     * @param historyID 要设置记录编号的值
     */
    public void setHistoryID(Integer historyID) {
        this.historyID = historyID;
    }

    /**
     * 设置学号(类型:int 大小:0)
     *
     * @param studentID 要设置学号的值
     */
    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    /**
     * 设置作业编号(类型:int 大小:0)
     *
     * @param workID 要设置作业编号的值
     */
    public void setWorkID(Integer workID) {
        this.workID = workID;
    }

    /**
     * 设置标注日期(类型:datetime 大小:0)
     *
     * @param createDate 要设置标注日期的值
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 设置是否完成(类型:smallint 大小:0)
     *
     * @param isComplete 要设置是否完成的值
     */
    public void setIsComplete(Short isComplete) {
        this.isComplete = isComplete;
    }

    private String workname;

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
