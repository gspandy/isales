package com.haier.isales.workguide.dto;

import java.io.Serializable;

public class WorkguideDTO implements Serializable{

	private static final long serialVersionUID = -7600951505792998926L;
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
	* @Fields jobJumpUrl : 跳转地址
	*/
	private String jobJumpUrl;
	/** 
	* @Fields jobJumpType : 跳转方式
	*/
	private String jobJumpType;
	/** 
	* @Fields jobIcon : 任务图标
	*/ 
	private String jobIcon;
	/** 
	* @Fields jobBgcolor : 任务背景色
	*/ 
	private String jobBgcolor;
	/** 
	* @Fields jobStatus : 工作完成状态
	*/ 
	private String jobStatus;
	/** 
	* @Fields itemDesc : 任务简介
	*/
	private String jobDesc;
	
	/*===========getters&setters=============*/
	/**
	 * @Description: 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @Description: 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @Description: 属性 jobCode 的get方法 
	 * @return jobCode
	 */
	public String getJobCode() {
		return jobCode;
	}
	/**
	 * @Description: 属性 jobCode 的set方法 
	 * @param jobCode 
	 */
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}
	/**
	 * @Description: 属性 jobName 的get方法 
	 * @return jobName
	 */
	public String getJobName() {
		return jobName;
	}
	/**
	 * @Description: 属性 jobName 的set方法 
	 * @param jobName 
	 */
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	/**
	 * @Description: 属性 jobStatus 的get方法 
	 * @return jobStatus
	 */
	public String getJobStatus() {
		return jobStatus;
	}
	/**
	 * @Description: 属性 jobStatus 的set方法 
	 * @param jobStatus 
	 */
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}
	/**
	 * @Description: 属性 jobDesc 的get方法 
	 * @return jobDesc
	 */
	public String getJobDesc() {
		return jobDesc;
	}
	/**
	 * @Description: 属性 jobDesc 的set方法 
	 * @param jobDesc 
	 */
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	/**
	 * @Description: 属性 jobJumpUrl 的get方法 
	 * @return jobJumpUrl
	 */
	public String getJobJumpUrl() {
		return jobJumpUrl;
	}
	/**
	 * @Description: 属性 jobJumpUrl 的set方法 
	 * @param jobJumpUrl 
	 */
	public void setJobJumpUrl(String jobJumpUrl) {
		this.jobJumpUrl = jobJumpUrl;
	}
	/**
	 * @Description: 属性 jobJumpType 的get方法 
	 * @return jobJumpType
	 */
	public String getJobJumpType() {
		return jobJumpType;
	}
	/**
	 * @Description: 属性 jobJumpType 的set方法 
	 * @param jobJumpType 
	 */
	public void setJobJumpType(String jobJumpType) {
		this.jobJumpType = jobJumpType;
	}
	/**
	 * @Description: 属性 jobIcon 的get方法 
	 * @return jobIcon
	 */
	public String getJobIcon() {
		return jobIcon;
	}
	/**
	 * @Description: 属性 jobIcon 的set方法 
	 * @param jobIcon 
	 */
	public void setJobIcon(String jobIcon) {
		this.jobIcon = jobIcon;
	}
	/**
	 * @Description: 属性 jobBgcolor 的get方法 
	 * @return jobBgcolor
	 */
	public String getJobBgcolor() {
		return jobBgcolor;
	}
	/**
	 * @Description: 属性 jobBgcolor 的set方法 
	 * @param jobBgcolor 
	 */
	public void setJobBgcolor(String jobBgcolor) {
		this.jobBgcolor = jobBgcolor;
	}
}
