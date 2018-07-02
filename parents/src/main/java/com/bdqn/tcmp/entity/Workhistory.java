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
    /**
     *
     */
    private Integer historyID;
    /**
     *
     */
    private Integer studentID;
    /**
     *
     */
    private Integer workID;
    /**
     *
     */
    private Date createDate;
    /**
     *
     */
    private Integer isComplete;

    public Integer getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
    }

    /**
     * --无参构造方法
     */
    public Workhistory() {
    }

    /**
     * --有参构造方法
     *
     * @param historyID
     * @param studentID
     * @param workID
     * @param createDate
     */
    public Workhistory
    (
            Integer historyID,
            Integer studentID,
            Integer workID,
            Date createDate,
            Integer isComplete
    ) {
        this.historyID = historyID;
        this.studentID = studentID;
        this.workID = workID;
        this.createDate = createDate;
        this.isComplete=isComplete;
    }

    /**
     * 读取(类型:int 大小:0)
     *
     * @return 得到的
     */
    public Integer getHistoryID() {
        return historyID;
    }

    /**
     * 读取(类型:int 大小:0)
     *
     * @return 得到的
     */
    public Integer getStudentID() {
        return studentID;
    }

    /**
     * 读取(类型:int 大小:0)
     *
     * @return 得到的
     */
    public Integer getWorkID() {
        return workID;
    }

    /**
     * 读取(类型:datetime 大小:0)
     *
     * @return 得到的
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置(类型:int 大小:0)
     *
     * @param historyID 要设置的值
     */
    public void setHistoryID(Integer historyID) {
        this.historyID = historyID;
    }

    /**
     * 设置(类型:int 大小:0)
     *
     * @param studentID 要设置的值
     */
    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    /**
     * 设置(类型:int 大小:0)
     *
     * @param workID 要设置的值
     */
    public void setWorkID(Integer workID) {
        this.workID = workID;
    }

    /**
     * 设置(类型:datetime 大小:0)
     *
     * @param createDate 要设置的值
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}