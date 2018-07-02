package com.bdqn.tcmp.entity;
import java.io.Serializable;
import java.util.Date;
/**
 * 实体类
 * @author admin
 */
public class Stuparent implements Serializable{
		/*对于日期类型需要使用的注解
			@DateTimeFormat(pattern="yyyy-MM-dd")
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
			@JSONField(format = "yyyy-MM-dd")    解决json乱码
		*/
    /**
     * 编号
     */
    private Integer stuParentID;
    /**
     * 学生编号
     */
    private Integer studentID;
    /**
     * 家长编号
     */
    private Integer parentID;
    private String studentName;
    private String parentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * --无参构造方法
     */
    public Stuparent()
    {
    }
    /**
     * --有参构造方法
     * @param stuParentID 编号
     * @param studentID 学生编号
     * @param parentID 家长编号
     */
    public Stuparent
    (
            Integer stuParentID,
            Integer studentID,
            Integer parentID
    )
    {
        this.stuParentID = stuParentID;
        this.studentID   = studentID;
        this.parentID    = parentID;

    }
    /**
     * 读取编号(类型:int 大小:0)
     * @return 得到的编号
     */
    public Integer getStuParentID(){
        return stuParentID;
    }

    /**
     * 读取学生编号(类型:int 大小:0)
     * @return 得到的学生编号
     */
    public Integer getStudentID(){
        return studentID;
    }

    /**
     * 读取家长编号(类型:int 大小:0)
     * @return 得到的家长编号
     */
    public Integer getParentID(){
        return parentID;
    }

    /**
     * 设置编号(类型:int 大小:0)
     * @param stuParentID 要设置编号的值
     */
    public void setStuParentID(Integer stuParentID){
        this.stuParentID=stuParentID;
    }

    /**
     * 设置学生编号(类型:int 大小:0)
     * @param studentID 要设置学生编号的值
     */
    public void setStudentID(Integer studentID){
        this.studentID=studentID;
    }

    /**
     * 设置家长编号(类型:int 大小:0)
     * @param parentID 要设置家长编号的值
     */
    public void setParentID(Integer parentID){
        this.parentID=parentID;
    }
}
