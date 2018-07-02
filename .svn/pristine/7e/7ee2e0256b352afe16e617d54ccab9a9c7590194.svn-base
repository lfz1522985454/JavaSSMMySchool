package com.bdqn.tcmp.entity;
import java.io.Serializable;
import java.util.Date;
/**
 * 实体类
 * @author admin
 */
public class Blog implements Serializable{
		/*对于日期类型需要使用的注解
			@DateTimeFormat(pattern="yyyy-MM-dd")
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
			@JSONField(format = "yyyy-MM-dd")    解决json乱码
		*/
    /**
     * 博客编号
     */
    private Integer blogID;
    /**
     * 标题
     */
    private String title;
    /**
     * 文章类型
     */
    private Integer articleType;
    /**
     * 博客分类
     */
    private Integer blogType;
    /**
     * 摘要
     */
    private String summary;
    /**
     * 学生编号
     */
    private Integer studentID;
    /**
     * 老师编号
     */
    private Integer teacherID;
    /**
     * 缩略图
     */
    private String thumbnail;
    /**
     * 内容
     */
    private String content;
    /**
     * 点击次数
     */
    private Integer clickCount;
    /**
     * 是否推荐
     */
    private Integer isRecommended;
    /**
     * 是否置顶
     */
    private Integer isTop;
    /**
     * 是否启用
     */
    private Integer isEnabled;
    /**
     * 创建日期
     */
    private Date createDate;


    /*连表查询*/
    private Integer teacherId;

    private String teacherName;

    private Integer studentId;

    private String studentName;

    private Integer dictionaryID;

    private String articleName;

    private String blogName;

    private Integer classId;

    private String className;

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

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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

    public Integer getDictionaryID() {
        return dictionaryID;
    }

    public void setDictionaryID(Integer dictionaryID) {
        this.dictionaryID = dictionaryID;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public Blog(Integer blogID, String title, Integer articleType, Integer blogType, String summary, Integer studentID, Integer teacherID, String thumbnail, String content, Integer clickCount, Integer isRecommended, Integer isTop, Integer isEnabled, Date createDate, Integer teacherId, String teacherName, Integer studentId, String studentName, Integer dictionaryID, String articleName, String blogName) {
        this.blogID = blogID;
        this.title = title;
        this.articleType = articleType;
        this.blogType = blogType;
        this.summary = summary;
        this.studentID = studentID;
        this.teacherID = teacherID;
        this.thumbnail = thumbnail;
        this.content = content;
        this.clickCount = clickCount;
        this.isRecommended = isRecommended;
        this.isTop = isTop;
        this.isEnabled = isEnabled;
        this.createDate = createDate;
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.studentId = studentId;
        this.studentName = studentName;
        this.dictionaryID = dictionaryID;
        this.articleName = articleName;
        this.blogName = blogName;
    }

    /**
     * --无参构造方法
     */
    public Blog()
    {
    }
    /**
     * --有参构造方法
     * @param blogID 博客编号
     * @param title 标题
     * @param articleType 文章类型
     * @param blogType 博客分类
     * @param summary 摘要
     * @param studentID 学生编号
     * @param teacherID 老师编号
     * @param thumbnail 缩略图
     * @param content 内容
     * @param clickCount 点击次数
     * @param isRecommended 是否推荐
     * @param isTop 是否置顶
     * @param isEnabled 是否启用
     * @param createDate 创建日期
     */
    public Blog
    (
            Integer blogID,
            String title,
            Integer articleType,
            Integer blogType,
            String summary,
            Integer studentID,
            Integer teacherID,
            String thumbnail,
            String content,
            Integer clickCount,
            Integer isRecommended,
            Integer isTop,
            Integer isEnabled,
            Date createDate
    )
    {
        this.blogID        = blogID;
        this.title         = title;
        this.articleType   = articleType;
        this.blogType      = blogType;
        this.summary       = summary;
        this.studentID     = studentID;
        this.teacherID     = teacherID;
        this.thumbnail     = thumbnail;
        this.content       = content;
        this.clickCount    = clickCount;
        this.isRecommended = isRecommended;
        this.isTop         = isTop;
        this.isEnabled     = isEnabled;
        this.createDate    = createDate;

    }

    public Integer getBlogID() {
        return blogID;
    }

    public void setBlogID(Integer blogID) {
        this.blogID = blogID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public Integer getBlogType() {
        return blogType;
    }

    public void setBlogType(Integer blogType) {
        this.blogType = blogType;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Integer getIsRecommended() {
        return isRecommended;
    }

    public void setIsRecommended(Integer isRecommended) {
        this.isRecommended = isRecommended;
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogID=" + blogID +
                ", title='" + title + '\'' +
                ", articleType=" + articleType +
                ", blogType=" + blogType +
                ", summary='" + summary + '\'' +
                ", studentID=" + studentID +
                ", teacherID=" + teacherID +
                ", thumbnail='" + thumbnail + '\'' +
                ", content='" + content + '\'' +
                ", clickCount=" + clickCount +
                ", isRecommended=" + isRecommended +
                ", isTop=" + isTop +
                ", isEnabled=" + isEnabled +
                ", createDate=" + createDate +
                ", teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", dictionaryID=" + dictionaryID +
                ", articleName='" + articleName + '\'' +
                ", blogName='" + blogName + '\'' +
                '}';
    }
}
