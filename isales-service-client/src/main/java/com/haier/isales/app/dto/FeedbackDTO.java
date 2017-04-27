/**
* @Company 青鸟软通   
* @Title: FeedbackDTO.java 
* @Package com.haier.isales.app.dto 
* @author John zhao   
* @date 2014-12-12 下午2:30:30 
* @version V1.0   
*/ 
package com.haier.isales.app.dto;

import java.io.Serializable;

/** 
 * @ClassName: FeedbackDTO 
 * @Description: 自动生成的对应的实体对象   
 *  
 */
public class FeedbackDTO implements Serializable{
	
	/**
	* @Fields serialVersionUID :  
	*/ 
	private static final long serialVersionUID = -8037358998731221988L;
	/** 
	* @Fields operatorId : 用户id
	*/
	private Long operatorId;
	/** 
	* @Fields userCode : 员工号
	*/
	private String userCode;
	/** 
	* @Fields operatorName : 用户姓名
	*/
	private String operatorName;
	/** 
	* @Fields feedbackType : 反馈类型 101针对app使用的反馈，102针对样机的反馈
	*/
	private String feedbackType;
	/** 
	* @Fields feedbackObject : 反馈对象,用户针对什么数据或者操作进行反馈 
	*/
	private String feedbackObject;
	/** 
	* @Fields feedbackContent : 反馈内容
	*/
	private String feedbackContent;
	/** 
	* @Fields feedbackTime : 反馈时间
	*/
	private java.util.Date feedbackTime;
	/** 
	* @Fields contactInformation : 联系方式，用户在页面填写的联系方式（微信、手机等均可），而非用户对应的员工信息
	*/
	private String contactInformation;
	/** 
	* @Fields status : 状态,101已提交；102已受理 103：已解决 104已关闭 105 作废
	*/
	private String status;
	/** 
	* @Fields handlerId : 处理人id
	*/
	private Long handlerId;
	/** 
	* @Fields handlerName : 处理人姓名
	*/
	private String handlerName;
	/** 
	* @Fields handlerTime : 处理时间
	*/
	private java.util.Date handlerTime;
	/** 
	* @Fields handlerContent : 处理内容
	*/
	private String handlerContent;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
	/** 
	* @Fields wtdlmc : 需求大类名称	文本	单行	50
	*/ 
	private String wtdlmc; 
	/** 
	* @Fields wtxlmc : 需求小类名称	文本	单行	50
	*/ 
	private String wtxlmc;
	/** 
	* @Fields cpz : 产品组	文本	数据字典	100
	*/ 
	private String cpz	;
	/** 
	* @Fields bu : bu	文本	单行	100
	*/ 
	private String bu	;
	/** 
	* @Fields xsqd : 渠道	文本	列表	20
	*/ 
	private String xsqd;
	/** 
	* @Fields handlerCode : 第一处理人工号
	*/ 
	private String handlerCode;
	
	//================getters & setters=================
	/**
	 * @Description: 属性 operatorId 的get方法 
	 * @return operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}
	/**
	 * @Description: 属性 operatorId 的set方法 
	 * @param operatorId 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * @Description: 属性 userCode 的get方法 
	 * @return userCode
	 */
	public String getUserCode() {
		return userCode;
	}
	/**
	 * @Description: 属性 userCode 的set方法 
	 * @param userCode 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	 * @Description: 属性 operatorName 的get方法 
	 * @return operatorName
	 */
	public String getOperatorName() {
		return operatorName;
	}
	/**
	 * @Description: 属性 operatorName 的set方法 
	 * @param operatorName 
	 */
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	/**
	 * @Description: 属性 feedbackType 的get方法 
	 * @return feedbackType
	 */
	public String getFeedbackType() {
		return feedbackType;
	}
	/**
	 * @Description: 属性 feedbackType 的set方法 
	 * @param feedbackType 
	 */
	public void setFeedbackType(String feedbackType) {
		this.feedbackType = feedbackType;
	}
	/**
	 * @Description: 属性 feedbackObject 的get方法 
	 * @return feedbackObject
	 */
	public String getFeedbackObject() {
		return feedbackObject;
	}
	/**
	 * @Description: 属性 feedbackObject 的set方法 
	 * @param feedbackObject 
	 */
	public void setFeedbackObject(String feedbackObject) {
		this.feedbackObject = feedbackObject;
	}
	/**
	 * @Description: 属性 feedbackContent 的get方法 
	 * @return feedbackContent
	 */
	public String getFeedbackContent() {
		return feedbackContent;
	}
	/**
	 * @Description: 属性 feedbackContent 的set方法 
	 * @param feedbackContent 
	 */
	public void setFeedbackContent(String feedbackContent) {
		this.feedbackContent = feedbackContent;
	}
	/**
	 * @Description: 属性 feedbackTime 的get方法 
	 * @return feedbackTime
	 */
	public java.util.Date getFeedbackTime() {
		return feedbackTime;
	}
	/**
	 * @Description: 属性 feedbackTime 的set方法 
	 * @param feedbackTime 
	 */
	public void setFeedbackTime(java.util.Date feedbackTime) {
		this.feedbackTime = feedbackTime;
	}
	/**
	 * @Description: 属性 contactInformation 的get方法 
	 * @return contactInformation
	 */
	public String getContactInformation() {
		return contactInformation;
	}
	/**
	 * @Description: 属性 contactInformation 的set方法 
	 * @param contactInformation 
	 */
	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}
	/**
	 * @Description: 属性 status 的get方法 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @Description: 属性 status 的set方法 
	 * @param status 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @Description: 属性 handlerId 的get方法 
	 * @return handlerId
	 */
	public Long getHandlerId() {
		return handlerId;
	}
	/**
	 * @Description: 属性 handlerId 的set方法 
	 * @param handlerId 
	 */
	public void setHandlerId(Long handlerId) {
		this.handlerId = handlerId;
	}
	/**
	 * @Description: 属性 handlerName 的get方法 
	 * @return handlerName
	 */
	public String getHandlerName() {
		return handlerName;
	}
	/**
	 * @Description: 属性 handlerName 的set方法 
	 * @param handlerName 
	 */
	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}
	/**
	 * @Description: 属性 handlerTime 的get方法 
	 * @return handlerTime
	 */
	public java.util.Date getHandlerTime() {
		return handlerTime;
	}
	/**
	 * @Description: 属性 handlerTime 的set方法 
	 * @param handlerTime 
	 */
	public void setHandlerTime(java.util.Date handlerTime) {
		this.handlerTime = handlerTime;
	}
	/**
	 * @Description: 属性 handlerContent 的get方法 
	 * @return handlerContent
	 */
	public String getHandlerContent() {
		return handlerContent;
	}
	/**
	 * @Description: 属性 handlerContent 的set方法 
	 * @param handlerContent 
	 */
	public void setHandlerContent(String handlerContent) {
		this.handlerContent = handlerContent;
	}
	/**
	 * @Description: 属性 remark 的get方法 
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @Description: 属性 remark 的set方法 
	 * @param remark 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getWtdlmc() {
		return wtdlmc;
	}
	public void setWtdlmc(String wtdlmc) {
		this.wtdlmc = wtdlmc;
	}
	public String getWtxlmc() {
		return wtxlmc;
	}
	public void setWtxlmc(String wtxlmc) {
		this.wtxlmc = wtxlmc;
	}
	public String getCpz() {
		return cpz;
	}
	public void setCpz(String cpz) {
		this.cpz = cpz;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public String getXsqd() {
		return xsqd;
	}
	public void setXsqd(String xsqd) {
		this.xsqd = xsqd;
	}
	public String getHandlerCode() {
		return handlerCode;
	}
	public void setHandlerCode(String handlerCode) {
		this.handlerCode = handlerCode;
	}
	
	//=================toString====================
	/**
	* <p>Description: FeedbackDTO自动生成的toString方法</p> 
	* @author John zhao   
	* @date 2014-12-12 下午2:30:30 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "FeedbackDTO [operatorId=" + operatorId + ", userCode="
				+ userCode + ", operatorName=" + operatorName
				+ ", feedbackType=" + feedbackType + ", feedbackObject="
				+ feedbackObject + ", feedbackContent=" + feedbackContent
				+ ", feedbackTime=" + feedbackTime + ", contactInformation="
				+ contactInformation + ", status=" + status + ", handlerId="
				+ handlerId + ", handlerName=" + handlerName + ", handlerTime="
				+ handlerTime + ", handlerContent=" + handlerContent
				+ ", remark=" + remark + ", wtdlmc=" + wtdlmc + ", wtxlmc="
				+ wtxlmc + ", cpz=" + cpz + ", bu=" + bu + ", xsqd=" + xsqd
				+ ", handlerCode=" + handlerCode + "]";
	}
	
}
