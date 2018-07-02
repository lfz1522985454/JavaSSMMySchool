package com.bdqn.tcmp.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类
 *
 * @author admin
 */
public class Notice implements Serializable {
    private Integer noticeID;
    private String noticeTitle;
    private String noticePic;
    private String attachment;
    private Date createDate;
    private String visibleLevel;
    private String informWay;
    private String content;
    private Integer teacherID;
    private String teacherName;

    public Notice(Integer noticeID, String noticeTitle, String noticePic, String attachment, Date createDate, String visibleLevel, String informWay, String content, Integer teacherID, String teacherName) {
        this.noticeID = noticeID;
        this.noticeTitle = noticeTitle;
        this.noticePic = noticePic;
        this.attachment = attachment;
        this.createDate = createDate;
        this.visibleLevel = visibleLevel;
        this.informWay = informWay;
        this.content = content;
        this.teacherID = teacherID;
        this.teacherName = teacherName;
    }

    public Notice() {
    }

    public Integer getNoticeID() {
        return noticeID;
    }

    public void setNoticeID(Integer noticeID) {
        this.noticeID = noticeID;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticePic() {
        return noticePic;
    }

    public void setNoticePic(String noticePic) {
        this.noticePic = noticePic;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getVisibleLevel() {
        return visibleLevel;
    }

    public void setVisibleLevel(String visibleLevel) {
        this.visibleLevel = visibleLevel;
    }

    public String getInformWay() {
        return informWay;
    }

    public void setInformWay(String informWay) {
        this.informWay = informWay;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "noticeID=" + noticeID +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", noticePic='" + noticePic + '\'' +
                ", attachment='" + attachment + '\'' +
                ", createDate=" + createDate +
                ", visibleLevel='" + visibleLevel + '\'' +
                ", informWay='" + informWay + '\'' +
                ", content='" + content + '\'' +
                ", teacherID=" + teacherID +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
