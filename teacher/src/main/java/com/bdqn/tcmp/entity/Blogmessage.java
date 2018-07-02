package com.bdqn.tcmp.entity;
import java.io.Serializable;
import java.util.Date;
/**
 * 实体类
 * @author admin
 */
public class Blogmessage implements Serializable{
		/*对于日期类型需要使用的注解
			@DateTimeFormat(pattern="yyyy-MM-dd")
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
			@JSONField(format = "yyyy-MM-dd")    解决json乱码
		*/
    /**
     * 留言ID
     */
    private Integer messageID;
    /**
     * 博客编号
     */
    private Integer blogID;
    /**
     * 留言人ID
     */
    private Integer personID;
    /**
     * 留言内容
     */
    private String messageContent;
    /**
     * 留言时间
     */
    private Date createDate;
    /**
     * 父级留言人
     */
    private Integer parentID;

    public Blogmessage(Integer messageID, Integer blogID, Integer personID, String messageContent, Date createDate, Integer parentID) {
        this.messageID = messageID;
        this.blogID = blogID;
        this.personID = personID;
        this.messageContent = messageContent;
        this.createDate = createDate;
        this.parentID = parentID;
    }

    public Blogmessage() {
    }

    public Integer getMessageID() {
        return messageID;
    }

    public void setMessageID(Integer messageID) {
        this.messageID = messageID;
    }

    public Integer getBlogID() {
        return blogID;
    }

    public void setBlogID(Integer blogID) {
        this.blogID = blogID;
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }
}
