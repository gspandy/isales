/**
* @Company 青鸟软通   
* @Title: ReminderBpmDomain.java 
* @Package com.haier.isales.reminder.domain 
* @author Cao Rui   
* @date 2015年06月12日  10:34:50 
* @version V1.0   
*/ 
package com.haier.isales.reminder.dto;

import java.io.Serializable;

/** 
 * @ClassName: ReminderBpmDomain 
 * @Description: t_isales_reminder_bpm 自动生成的对应的实体对象   
 *  
 */
public class ReminderBpmDTO implements Serializable{
	private static final long serialVersionUID = -1434075890945L;

	/** 
	* @Fields id : 主键，无实际意义
	*/
	private Long id;
	/** 
	* @Fields operatorId : 设置项编码
	*/
	private String operatorId;
	/** 
	* @Fields userCode : 值编码
	*/
	private String userCode;
	/** 
	* @Fields userName : 设置项名称
	*/
	private String userName;
	/** 
	* @Fields bpmProcessId : bpm流程id
	*/
	private String bpmProcessId;
	/** 
	* @Fields bpmIssueTitle : 问题标题
	*/
	private String bpmIssueTitle;
	/** 
	* @Fields bpmIssueContent : 问题内容
	*/
	private String bpmIssueContent;
	/** 
	* @Fields valueStatus : 状态，101：新建；102：已通知
	*/
	private String status;
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
		
	/*=========================getter and setter ===================*/
	/**
	 * @Description: 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * @Description: 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @Description: 属性 operatorId 的get方法 
	 * @return id
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	/**
	 * @Description: 属性 operatorId 的set方法 
	 * @param id 
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * @Description: 属性 userCode 的get方法 
	 * @return id
	 */
	public String getUserCode() {
		return this.userCode;
	}
	/**
	 * @Description: 属性 userCode 的set方法 
	 * @param id 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	 * @Description: 属性 userName 的get方法 
	 * @return id
	 */
	public String getUserName() {
		return this.userName;
	}
	/**
	 * @Description: 属性 userName 的set方法 
	 * @param id 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @Description: 属性 bpmProcessId 的get方法 
	 * @return id
	 */
	public String getBpmProcessId() {
		return this.bpmProcessId;
	}
	/**
	 * @Description: 属性 bpmProcessId 的set方法 
	 * @param id 
	 */
	public void setBpmProcessId(String bpmProcessId) {
		this.bpmProcessId = bpmProcessId;
	}
	/**
	 * @Description: 属性 bpmIssueTitle 的get方法 
	 * @return id
	 */
	public String getBpmIssueTitle() {
		return this.bpmIssueTitle;
	}
	/**
	 * @Description: 属性 bpmIssueTitle 的set方法 
	 * @param id 
	 */
	public void setBpmIssueTitle(String bpmIssueTitle) {
		this.bpmIssueTitle = bpmIssueTitle;
	}
	/**
	 * @Description: 属性 bpmIssueContent 的get方法 
	 * @return id
	 */
	public String getBpmIssueContent() {
		return this.bpmIssueContent;
	}
	/**
	 * @Description: 属性 bpmIssueContent 的set方法 
	 * @param id 
	 */
	public void setBpmIssueContent(String bpmIssueContent) {
		this.bpmIssueContent = bpmIssueContent;
	}
	/**
	 * @Description: 属性 valueStatus 的get方法 
	 * @return id
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * @Description: 属性 valueStatus 的set方法 
	 * @param id 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @Description: 属性 updateTime 的get方法 
	 * @return id
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	/**
	 * @Description: 属性 updateTime 的set方法 
	 * @param id 
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @Description: 属性 createTime 的get方法 
	 * @return id
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * @Description: 属性 createTime 的set方法 
	 * @param id 
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @Description: 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * @Description: 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/*==================== toString() ====================*/
	/**
	* <p>Description:ReminderBpmDomain 自动生成的toString方法 </p> 
	* @author Guo Yuchao 
	* @date 2015年06月12日  10:34:50 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ReminderBpmDTO [" +
					"id=" + id + "," + 
					"operatorId=" + operatorId + "," + 
					"userCode=" + userCode + "," + 
					"userName=" + userName + "," + 
					"bpmProcessId=" + bpmProcessId + "," + 
					"bpmIssueTitle=" + bpmIssueTitle + "," + 
					"bpmIssueContent=" + bpmIssueContent + "," + 
					"status=" + status + "," + 
					"updateTime=" + updateTime + "," + 
					"createTime=" + createTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
}
