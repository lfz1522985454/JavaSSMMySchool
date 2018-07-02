package com.bdqn.tcmp.entity;
import java.io.Serializable;

/**
 * 实体类
 * @author admin
 */
public class Homework implements Serializable{
		/*对于日期类型需要使用的注解
			@DateTimeFormat(pattern="yyyy-MM-dd")
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
			@JSONField(format = "yyyy-MM-dd")    解决json乱码
		*/
	/**
	 * 作业编号
	 */
	private Integer workid;
	/**
	 * 作业名称
	 */
	private String workname;
	/**
	 * 班级编号
	 */
	private Integer classid;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 作业详情
	 */
	private String workdetail;
	/**
	 * 发送类型（1,2,3,4）
	 */
	private String sendType;

	/**
	 * --无参构造方法
	 */
	public Homework()
	{
	}
	/**
	 * --有参构造方法
	 * @param workid 作业编号
	 * @param workname 作业名称
	 * @param classid 班级编号
	 * @param remark 备注
	 * @param workdetail 作业详情
	 * @param sendType 发送类型（1,2,3,4）
	 */
	public Homework
	(
			Integer workid,
			String workname,
			Integer classid,
			String remark,
			String workdetail,
			String sendType
	)
	{
		this.workid     = workid;
		this.workname   = workname;
		this.classid    = classid;
		this.remark     = remark;
		this.workdetail = workdetail;
		this.sendType   = sendType;

	}
	/**
	 * 读取作业编号(类型:int 大小:0)
	 * @return 得到的作业编号
	 */
	public Integer getWorkid(){
		return workid;
	}

	/**
	 * 读取作业名称(类型:varchar 大小:765)
	 * @return 得到的作业名称
	 */
	public String getWorkname(){
		return workname;
	}

	/**
	 * 读取班级编号(类型:int 大小:0)
	 * @return 得到的班级编号
	 */
	public Integer getClassid(){
		return classid;
	}

	/**
	 * 读取备注(类型:varchar 大小:1500)
	 * @return 得到的备注
	 */
	public String getRemark(){
		return remark;
	}

	/**
	 * 读取作业详情(类型:varchar 大小:765)
	 * @return 得到的作业详情
	 */
	public String getWorkdetail(){
		return workdetail;
	}

	/**
	 * 读取发送类型（1,2,3,4）(类型:varchar 大小:765)
	 * @return 得到的发送类型（1,2,3,4）
	 */
	public String getSendType(){
		return sendType;
	}

	/**
	 * 设置作业编号(类型:int 大小:0)
	 * @param workid 要设置作业编号的值
	 */
	public void setWorkid(Integer workid){
		this.workid=workid;
	}

	/**
	 * 设置作业名称(类型:varchar 大小:765)
	 * @param workname 要设置作业名称的值
	 */
	public void setWorkname(String workname){
		this.workname=workname;
	}

	/**
	 * 设置班级编号(类型:int 大小:0)
	 * @param classid 要设置班级编号的值
	 */
	public void setClassid(Integer classid){
		this.classid=classid;
	}

	/**
	 * 设置备注(类型:varchar 大小:1500)
	 * @param remark 要设置备注的值
	 */
	public void setRemark(String remark){
		this.remark=remark;
	}

	/**
	 * 设置作业详情(类型:varchar 大小:765)
	 * @param workdetail 要设置作业详情的值
	 */
	public void setWorkdetail(String workdetail){
		this.workdetail=workdetail;
	}

	/**
	 * 设置发送类型（1,2,3,4）(类型:varchar 大小:765)
	 * @param sendType 要设置发送类型（1,2,3,4）的值
	 */
	public void setSendType(String sendType){
		this.sendType=sendType;
	}
}
