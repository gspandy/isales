/**
* @Company 青鸟软通   
* @Title: ReminderBpmDomain.java 
* @Package com.haier.isales.reminder.domain 
* @author Cao Rui   
* @date 2015年06月12日  10:24:50 
* @version V1.0   
*/ 
package com.haier.isales.reminder.domain;

import java.io.Serializable;

/** 
 * @ClassName: ReminderBpmDomain 
 * t_isales_reminder_bpm 自动生成的对应的实体对象   
 *  
 */
public class ReminderBpmDomain implements Serializable{
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
	* @Fields status : 状态，101：新建；102：已通知
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
	 * 属性 operatorId 的get方法 
	 * @return id
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	/**
	 * 属性 operatorId 的set方法 
	 * @param id 
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * 属性 userCode 的get方法 
	 * @return id
	 */
	public String getUserCode() {
		return this.userCode;
	}
	/**
	 * 属性 userCode 的set方法 
	 * @param id 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	 * 属性 userName 的get方法 
	 * @return id
	 */
	public String getUserName() {
		return this.userName;
	}
	/**
	 * 属性 userName 的set方法 
	 * @param id 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 属性 bpmProcessId 的get方法 
	 * @return id
	 */
	public String getBpmProcessId() {
		return this.bpmProcessId;
	}
	/**
	 * 属性 bpmProcessId 的set方法 
	 * @param id 
	 */
	public void setBpmProcessId(String bpmProcessId) {
		this.bpmProcessId = bpmProcessId;
	}
	/**
	 * 属性 bpmIssueTitle 的get方法 
	 * @return id
	 */
	public String getBpmIssueTitle() {
		return this.bpmIssueTitle;
	}
	/**
	 * 属性 bpmIssueTitle 的set方法 
	 * @param id 
	 */
	public void setBpmIssueTitle(String bpmIssueTitle) {
		this.bpmIssueTitle = bpmIssueTitle;
	}
	/**
	 * 属性 bpmIssueContent 的get方法 
	 * @return id
	 */
	public String getBpmIssueContent() {
		return this.bpmIssueContent;
	}
	/**
	 * 属性 bpmIssueContent 的set方法 
	 * @param id 
	 */
	public void setBpmIssueContent(String bpmIssueContent) {
		this.bpmIssueContent = bpmIssueContent;
	}
	/**
	 * 属性 valueStatus 的get方法 
	 * @return id
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * 属性 valueStatus 的set方法 
	 * @param id 
	 */
	public void setStatus(String status) {
		this.status = status;
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
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: ReminderBpmDomain 自动生成的hashcode方法</p> 
	* @author Cao Rui   
	* @date 2015年06月12日  10:24:50
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((id == null) ? 0 : id.hashCode());
		return result;
	}
	/**
	* <p>Description:ReminderBpmDomain 自动生成的equals方法 </p> 
	* @author Cao Rui   
	* @date 2015年06月12日  10:24:50
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ReminderBpmDomain other =(ReminderBpmDomain) obj;
		if (id == null) {
			if (other.id != null){ 
				return false;
			}
		}else if (!id.equals(other.id)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:ReminderBpmDomain 自动生成的toString方法 </p> 
	* @author Cao Rui   
	* @date 2015年06月12日  10:24:50 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ReminderBpmDomain [" +
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
