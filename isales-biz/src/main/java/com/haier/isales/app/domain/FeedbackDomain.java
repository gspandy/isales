/**
* @Company 青鸟软通   
* @Title: FeedbackDomain.java 
* @Package com.haier.isales.app.domain 
* @author John.zhao   
* @date 2014年12月12日  14:15:38 
* @version V1.0   
*/ 
package com.haier.isales.app.domain;

import java.io.Serializable;

/** 
 * @ClassName: FeedbackDomain 
 * t_isales_feedback 自动生成的对应的实体对象   
 *  
 */
public class FeedbackDomain implements Serializable{
	private static final long serialVersionUID = -1418364938758L;

	private Long id;		//主键

	private Long operatorId;		//用户id

	private String userCode;		// 员工号

	private String operatorName;		//用户姓名

	private String feedbackType;		//反馈类型 101针对app使用的反馈，102针对样机的反馈

	private String feedbackObject;		//反馈对象,用户针对什么数据或者操作进行反馈 

	private String feedbackContent;		//反馈内容

	private java.util.Date feedbackTime;		//反馈时间

	private String contactInformation;		//联系方式，用户在页面填写的联系方式（微信、手机等均可），而非用户对应的员工信息

	private String status;		//状态,101已提交；102已受理 103：已解决 104已关闭 105 作废

	private Long handlerId;		//处理人id

	private String handlerName;		//处理人姓名

	private java.util.Date handlerTime;		//处理时间

	private String handlerContent;		//处理内容

	private String remark;		//备注
	
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
	public Long getOperatorId() {
		return this.operatorId;
	}
	/**
	 * 属性 operatorId 的set方法 
	 * @param id 
	 */
	public void setOperatorId(Long operatorId) {
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
	 * 属性 operatorName 的get方法 
	 * @return id
	 */
	public String getOperatorName() {
		return this.operatorName;
	}
	/**
	 * 属性 operatorName 的set方法 
	 * @param id 
	 */
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	/**
	 * 属性 feedbackType 的get方法 
	 * @return id
	 */
	public String getFeedbackType() {
		return this.feedbackType;
	}
	/**
	 * 属性 feedbackType 的set方法 
	 * @param id 
	 */
	public void setFeedbackType(String feedbackType) {
		this.feedbackType = feedbackType;
	}
	/**
	 * 属性 feedbackObject 的get方法 
	 * @return feedbackObject
	 */
	public String getFeedbackObject() {
		return feedbackObject;
	}
	/**
	 * 属性 feedbackObject 的set方法 
	 * @param feedbackObject 
	 */
	public void setFeedbackObject(String feedbackObject) {
		this.feedbackObject = feedbackObject;
	}
	/**
	 * 属性 feedbackContent 的get方法 
	 * @return id
	 */
	public String getFeedbackContent() {
		return this.feedbackContent;
	}
	/**
	 * 属性 feedbackContent 的set方法 
	 * @param id 
	 */
	public void setFeedbackContent(String feedbackContent) {
		this.feedbackContent = feedbackContent;
	}
	/**
	 * 属性 feedbackTime 的get方法 
	 * @return id
	 */
	public java.util.Date getFeedbackTime() {
		return this.feedbackTime;
	}
	/**
	 * 属性 feedbackTime 的set方法 
	 * @param id 
	 */
	public void setFeedbackTime(java.util.Date feedbackTime) {
		this.feedbackTime = feedbackTime;
	}
	/**
	 * 属性 contactInformation 的get方法 
	 * @return id
	 */
	public String getContactInformation() {
		return this.contactInformation;
	}
	/**
	 * 属性 contactInformation 的set方法 
	 * @param id 
	 */
	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}
	/**
	 * 属性 status 的get方法 
	 * @return id
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * 属性 status 的set方法 
	 * @param id 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 属性 handlerId 的get方法 
	 * @return id
	 */
	public Long getHandlerId() {
		return this.handlerId;
	}
	/**
	 * 属性 handlerId 的set方法 
	 * @param id 
	 */
	public void setHandlerId(Long handlerId) {
		this.handlerId = handlerId;
	}
	/**
	 * 属性 handlerName 的get方法 
	 * @return id
	 */
	public String getHandlerName() {
		return this.handlerName;
	}
	/**
	 * 属性 handlerName 的set方法 
	 * @param id 
	 */
	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}
	/**
	 * 属性 handlerTime 的get方法 
	 * @return id
	 */
	public java.util.Date getHandlerTime() {
		return this.handlerTime;
	}
	/**
	 * 属性 handlerTime 的set方法 
	 * @param id 
	 */
	public void setHandlerTime(java.util.Date handlerTime) {
		this.handlerTime = handlerTime;
	}
	/**
	 * 属性 handlerContent 的get方法 
	 * @return id
	 */
	public String getHandlerContent() {
		return this.handlerContent;
	}
	/**
	 * 属性 handlerContent 的set方法 
	 * @param id 
	 */
	public void setHandlerContent(String handlerContent) {
		this.handlerContent = handlerContent;
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
	* <p>Description: FeedbackDomain 自动生成的hashcode方法</p> 
	* @author John.zhao   
	* @date 2014年12月12日  14:15:38
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
	* <p>Description:FeedbackDomain 自动生成的equals方法 </p> 
	* @author John.zhao   
	* @date 2014年12月12日  14:15:38
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
		FeedbackDomain other =(FeedbackDomain) obj;

		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (id == null) {if (other.id != null){ return false;} else if (!id.equals(other.id)){ return false;}}
		*/
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
	* <p>Description:FeedbackDomain 自动生成的toString方法 </p> 
	* @author John.zhao   
	* @date 2014年12月12日  14:15:38 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "FeedbackDomain [" +
					"id=" + id + "," + 
					"operatorId=" + operatorId + "," + 
					"userCode=" + userCode + "," + 
					"operatorName=" + operatorName + "," + 
					"feedbackType=" + feedbackType + "," + 
					"feedbackContent=" + feedbackContent + "," + 
					"feedbackTime=" + feedbackTime + "," + 
					"contactInformation=" + contactInformation + "," + 
					"status=" + status + "," + 
					"handlerId=" + handlerId + "," + 
					"handlerName=" + handlerName + "," + 
					"handlerTime=" + handlerTime + "," + 
					"handlerContent=" + handlerContent + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
