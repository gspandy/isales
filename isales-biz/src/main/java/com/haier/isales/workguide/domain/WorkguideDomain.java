/**
* @Company 青鸟软通   
* @Title: WorkguideDomain.java 
* @Package com.haier.isales.workguide.domain 
* @author Shao Jingkai   
* @date 2015年06月11日  13:49:33 
* @version V1.0   
*/ 
package com.haier.isales.workguide.domain;

import java.io.Serializable;

/** 
 * @ClassName: WorkguideDomain 
 * t_isales_workguide_task 自动生成的对应的实体对象   
 *  
 */
public class WorkguideDomain implements Serializable{
	private static final long serialVersionUID = -1434001773358L;

	/** 
	* @Fields id : 主键，无实际意义
	*/
	private Long id;
	/** 
	* @Fields jobCode : 任务编码
	*/
	private String jobCode;
	/** 
	* @Fields jobName : 任务名称
	*/
	private String jobName;
	/** 
	* @Fields itemDesc : 任务简介
	*/
	private String itemDesc;
	/** 
	* @Fields jobJumpUrl : 跳转地址
	*/
	private String jobJumpUrl;
	/** 
	* @Fields jobJumpType : 跳转方式
	*/
	private String jobJumpType;
	/** 
	* @Fields jobSort : 显示顺序
	*/
	private String jobSort;
	/** 
	* @Fields jobIcon : 任务图标
	*/
	private String jobIcon;
	/** 
	* @Fields jobBgcolor : 任务底色
	*/
	private String jobBgcolor;
	/** 
	* @Fields itemStatus : 状态，根据状态判断是否显示
	*/
	private String itemStatus;
	/** 
	* @Fields updateTime : 修改时间
	*/
	private java.util.Date updateTime;
	/** 
	* @Fields createTime : 创建时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
	/** 
	* @Fields jobStatus : 工作完成状态
	*/ 
	private String jobStatus;
	/** 
	* @Fields jobStatus : 工作完成情况描述
	*/ 
	private String jobDesc;	
	
	/*=========================getter and setter ===================*/
	
	/**
	 * 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 属性 jobCode 的get方法 
	 * @return id
	 */
	public String getJobCode() {
		return this.jobCode;
	}
	/**
	 * 属性 jobCode 的set方法 
	 * @param id 
	 */
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}
	/**
	 * 属性 jobName 的get方法 
	 * @return id
	 */
	public String getJobName() {
		return this.jobName;
	}
	/**
	 * 属性 jobName 的set方法 
	 * @param id 
	 */
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	/**
	 * 属性 itemDesc 的get方法 
	 * @return id
	 */
	public String getItemDesc() {
		return this.itemDesc;
	}
	/**
	 * 属性 itemDesc 的set方法 
	 * @param id 
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	/**
	 * 属性 jobJumpUrl 的get方法 
	 * @return id
	 */
	public String getJobJumpUrl() {
		return this.jobJumpUrl;
	}
	/**
	 * 属性 jobJumpUrl 的set方法 
	 * @param id 
	 */
	public void setJobJumpUrl(String jobJumpUrl) {
		this.jobJumpUrl = jobJumpUrl;
	}
	/**
	 * 属性 jobJumpType 的get方法 
	 * @return id
	 */
	public String getJobJumpType() {
		return this.jobJumpType;
	}
	/**
	 * 属性 jobJumpType 的set方法 
	 * @param id 
	 */
	public void setJobJumpType(String jobJumpType) {
		this.jobJumpType = jobJumpType;
	}
	/**
	 * 属性 jobSort 的get方法 
	 * @return id
	 */
	public String getJobSort() {
		return this.jobSort;
	}
	/**
	 * 属性 jobSort 的set方法 
	 * @param id 
	 */
	public void setJobSort(String jobSort) {
		this.jobSort = jobSort;
	}
	/**
	 * 属性 jobIcon 的get方法 
	 * @return id
	 */
	public String getJobIcon() {
		return this.jobIcon;
	}
	/**
	 * 属性 jobIcon 的set方法 
	 * @param id 
	 */
	public void setJobIcon(String jobIcon) {
		this.jobIcon = jobIcon;
	}
	/**
	 * 属性 jobBgcolor 的get方法 
	 * @return id
	 */
	public String getJobBgcolor() {
		return this.jobBgcolor;
	}
	/**
	 * 属性 jobBgcolor 的set方法 
	 * @param id 
	 */
	public void setJobBgcolor(String jobBgcolor) {
		this.jobBgcolor = jobBgcolor;
	}
	/**
	 * 属性 itemStatus 的get方法 
	 * @return id
	 */
	public String getItemStatus() {
		return this.itemStatus;
	}
	/**
	 * 属性 itemStatus 的set方法 
	 * @param id 
	 */
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	/**
	 * 属性 updateTime 的get方法 
	 * @return id
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	/**
	 * 属性 updateTime 的set方法 
	 * @param id 
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 属性 createTime 的get方法 
	 * @return id
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * 属性 createTime 的set方法 
	 * @param id 
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 属性 jobStatus 的get方法 
	 * @return jobStatus
	 */
	public String getJobStatus() {
		return jobStatus;
	}
	/**
	 * 属性 jobStatus 的set方法 
	 * @param jobStatus 
	 */
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}
	/**
	 * 属性 jobDesc 的get方法 
	 * @return jobDesc
	 */
	public String getJobDesc() {
		return jobDesc;
	}
	/**
	 * 属性 jobDesc 的set方法 
	 * @param jobDesc 
	 */
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
		
}
