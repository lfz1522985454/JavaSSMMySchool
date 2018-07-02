package com.bdqn.tcmp.entity;
import java.io.Serializable;
import java.util.Date;
/**
 * 实体类
 * @author admin
 */
public class Worklog implements Serializable{
		/*对于日期类型需要使用的注解
			@DateTimeFormat(pattern="yyyy-MM-dd")
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
			@JSONField(format = "yyyy-MM-dd")    解决json乱码
		*/
	/**
	 * 日志编号
	 */
	private Integer logid;
	/**
	 * 开始时间
	 */
	private Date beginDate;
	/**
	 * 结束时间
	 */
	private Date endDate;
	/**
	 * 差异时间
	 */
	private Integer diffDate;
	/**
	 * 输入字数
	 */
	private Integer wordCount;
	/**
	 * 最后登录IP
	 */
	private String lastIP;
	/**
	 * 年级编号
	 */
	private Integer classid;
	/**
	 * 学生编号
	 */
	private Integer stuid;
	/**
	 * 作业编号
	 */
	private Integer workid;

	/**
	 * --无参构造方法
	 */
	public Worklog()
	{
	}
	/**
	 * --有参构造方法
	 * @param logid 日志编号
	 * @param beginDate 开始时间
	 * @param endDate 结束时间
	 * @param diffDate 差异时间
	 * @param wordCount 输入字数
	 * @param lastIP 最后登录IP
	 * @param classid 年级编号
	 * @param stuid 学生编号
	 * @param workid 作业编号
	 */
	public Worklog
	(
			Integer logid,
			Date beginDate,
			Date endDate,
			Integer diffDate,
			Integer wordCount,
			String lastIP,
			Integer classid,
			Integer stuid,
			Integer workid
	)
	{
		this.logid     = logid;
		this.beginDate = beginDate;
		this.endDate   = endDate;
		this.diffDate  = diffDate;
		this.wordCount = wordCount;
		this.lastIP    = lastIP;
		this.classid   = classid;
		this.stuid     = stuid;
		this.workid    = workid;

	}

	public Integer getLogid() {
		return logid;
	}

	public void setLogid(Integer logid) {
		this.logid = logid;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getDiffDate() {
		return diffDate;
	}

	public void setDiffDate(Integer diffDate) {
		this.diffDate = diffDate;
	}

	public Integer getWordCount() {
		return wordCount;
	}

	public void setWordCount(Integer wordCount) {
		this.wordCount = wordCount;
	}

	public String getLastIP() {
		return lastIP;
	}

	public void setLastIP(String lastIP) {
		this.lastIP = lastIP;
	}

	public Integer getClassid() {
		return classid;
	}

	public void setClassid(Integer classid) {
		this.classid = classid;
	}

	public Integer getStuid() {
		return stuid;
	}

	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}

	public Integer getWorkid() {
		return workid;
	}

	public void setWorkid(Integer workid) {
		this.workid = workid;
	}

	private Workimages workimages;

	public Workimages getWorkimages() {
		return workimages;
	}

	public void setWorkimages(Workimages workimages) {
		this.workimages = workimages;
	}
}
