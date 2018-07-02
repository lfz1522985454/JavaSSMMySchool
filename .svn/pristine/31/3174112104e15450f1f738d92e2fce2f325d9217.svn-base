package com.bdqn.tcmp.entity;
import java.io.Serializable;
import java.util.Date;

/**
 * 实体类
 * @author admin
 */
public class Article implements Serializable{
		/*对于日期类型需要使用的注解
			@DateTimeFormat(pattern="yyyy-MM-dd")
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
			@JSONField(format = "yyyy-MM-dd")    解决json乱码
		*/
    /**
     * 文章编号
     */
    private Integer articleID;
    /**
     * 标题
     */
    private String articleTitle;
    /**
     * 图片
     */
    private String image;
    /**
     * 文章内容
     */
    private String articleContent;
    /**
     * 文章类型（说句心里话，班级新鲜事)
     */
    private Integer articleType;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 作者
     */
    private String author;


    public Integer getArticleID() {
        return articleID;
    }

    public void setArticleID(Integer articleID) {
        this.articleID = articleID;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * --无参构造方法
     */
    public Article()
    {
    }
    /**
     * --有参构造方法
     * @param articleID 文章编号
     * @param articleTitle 标题
     * @param image 图片
     * @param articleContent 文章内容
     * @param articleType 文章类型（说句心里话，班级新鲜事)
     * @param createDate 创建时间
     * @param author 作者
     */
    public Article
    (
            Integer articleID,
            String articleTitle,
            String image,
            String articleContent,
            Integer articleType,
            Date createDate,
            String author
    )
    {
        this.articleID      = articleID;
        this.articleTitle   = articleTitle;
        this.image          = image;
        this.articleContent = articleContent;
        this.articleType    = articleType;
        this.createDate     = createDate;
        this.author         = author;

    }

}
