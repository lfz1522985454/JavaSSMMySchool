package com.bdqn.tcmp.entity;
import java.io.Serializable;
import java.util.Date;
/**
 * 实体类
 * @author admin
 */
public class Attendancel implements Serializable{
		/*对于日期类型需要使用的注解
			@DateTimeFormat(pattern="yyyy-MM-dd")
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
			@JSONField(format = "yyyy-MM-dd")    解决json乱码
		*/
    /**
     * 编号
     */
    private Integer attendanceID;
    /**
     * 班级
     */
    private Integer classID;
    /**
     * 学号
     */
    private Integer studentID;
    /**
     * 来校时间
     */
    private Date toSchool;
    /**
     * 离校时间
     */
    private Date leaveSchool;
    /**
     * 考勤状态(正常，请假，迟到，早退，旷课)
     */
    private Integer state;
    /**
     * 上课日期
     */
    private Date classDate;

    public Attendancel(Integer attendanceID, Integer classID, Integer studentID, Date toSchool, Date leaveSchool, Integer state, Date classDate) {
        this.attendanceID = attendanceID;
        this.classID = classID;
        this.studentID = studentID;
        this.toSchool = toSchool;
        this.leaveSchool = leaveSchool;
        this.state = state;
        this.classDate = classDate;
    }

    public Attendancel() {
    }

    public Integer getAttendanceID() {
        return attendanceID;
    }

    public void setAttendanceID(Integer attendanceID) {
        this.attendanceID = attendanceID;
    }

    public Integer getClassID() {
        return classID;
    }

    public void setClassID(Integer classID) {
        this.classID = classID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public Date getToSchool() {
        return toSchool;
    }

    public void setToSchool(Date toSchool) {
        this.toSchool = toSchool;
    }

    public Date getLeaveSchool() {
        return leaveSchool;
    }

    public void setLeaveSchool(Date leaveSchool) {
        this.leaveSchool = leaveSchool;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getClassDate() {
        return classDate;
    }

    public void setClassDate(Date classDate) {
        this.classDate = classDate;
    }
}
