package com.bdqn.tcmp.entity;
import java.io.Serializable;
/**
 * 实体类
 * @author admin
 */
public class Workstudent implements Serializable{
		/*对于日期类型需要使用的注解
			@DateTimeFormat(pattern="yyyy-MM-dd")
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
			@JSONField(format = "yyyy-MM-dd")    解决json乱码
		*/
	/**
	 * 编号
	 */
	private Integer detailid;
	/**
	 * 作业编号
	 */
	private Integer workid;
	/**
	 * 学生编号
	 */
	private Integer studentid;

	/**
	 * --无参构造方法
	 */
	public Workstudent()
	{
	}
	/**
	 * --有参构造方法
	 * @param detailid 编号
	 * @param workid 作业编号
	 * @param studentid 学生编号
	 */
	public Workstudent
	(
			Integer detailid,
			Integer workid,
			Integer studentid
	)
	{
		this.detailid  = detailid;
		this.workid    = workid;
		this.studentid = studentid;

	}

	public Integer getDetailid() {
		return detailid;
	}

	public void setDetailid(Integer detailid) {
		this.detailid = detailid;
	}

	public Integer getWorkid() {
		return workid;
	}

	public void setWorkid(Integer workid) {
		this.workid = workid;
	}

	public Integer getStudentid() {
		return studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
}
