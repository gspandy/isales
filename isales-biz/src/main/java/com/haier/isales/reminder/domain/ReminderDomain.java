/**
* @Company 青鸟软通   
* @Title: ReminderDomain.java 
* @Package com.haier.isales.reminder.domain 
* @author Liu Wenjie   
* @date 2014年11月29日  16:48:56 
* @version V1.0   
*/ 
package com.haier.isales.reminder.domain;

import java.io.Serializable;

/** 
 * @ClassName: ReminderDomain 
 * t_isales_reminder 自动生成的对应的实体对象   
 *  
 */
public class ReminderDomain implements Serializable{
	private static final long serialVersionUID = -1417250936993L;
	
	public static final String SEND_STATUS_NEVER = "101";
	public static final String SEND_STATUS_SUCCESS = "102";
	public static final String SEND_STATUS_FAIL = "103";

	/** 
	* @Fields id : id
	*/
	private Long id;
	/** 
	* @Fields appName : app名称，推送系统中使用的app对应名称，在本系统中固定值为ISALES
	*/
	private String appName;
	/** 
	* @Fields pushType : 推送类型，目前有APNS 和 MQTT  两种
	*/
	private String pushType;
	/** 
	* @Fields typeCode : 手机端推送的消息类型，目前有三类，ADV (广告类)；COM (普通的)；ENG(有条数限制)
	*/
	private String typeCode;
	/** 
	* @Fields title : 消息标题
	*/
	private String title;
	/** 
	* @Fields content : 消息内容
	*/
	private String content;
	/** 
	* @Fields aliveTime : 消息保留时间，时长，单位为毫秒
	*/
	private Long aliveTime;
	/** 
	* @Fields user : 接收消息用户
	*/
	private String user;
	/** 
	* @Fields userGroup : 接收消息用户组
	*/
	private String userGroup;
	/** 
	* @Fields hasUserGroupChild : 是否包含用户组子集
	*/
	private boolean hasUserGroupChild;
	/** 
	* @Fields excludedUserGroup : 排除的用户组
	*/
	private String excludedUserGroup;
	/** 
	* @Fields hasExcludedUserGroupChild : 是否包含排除用户组子集
	*/
	private boolean hasExcludedUserGroupChild;
	/** 
	* @Fields pusher : 推送消息用户
	*/
	private String pusher;
	/** 
	* @Fields pusherGroup : 推送消息用户组
	*/
	private String pusherGroup;
	/** 
	* @Fields type : 消息类型，在isales系统中定义的本消息的类型
	*/
	private String type;
	/** 
	* @Fields sourceId : 源数据id
	*/
	private String sourceId;
	/** 
	* @Fields sourceType : 源数据类型,使用数据字典
	*/
	private String sourceType;
	/** 
	* @Fields createTime : 添加时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields sendStatus : 发送状态,101：未发送；102：发送成功；103：发送失败
	*/
	private String sendStatus;
	/** 
	* @Fields extendedField : 扩展字段
	*/
	private String extendedField;
	/** 
	* @Fields linkUrl : 本提醒的链接
	*/
	private String linkUrl;
	/** 
	* @Fields expectedSendTime : 预计发送时间
	*/
	private java.util.Date expectedSendTime;
	/** 
	* @Fields sendTime : 实际发送时间
	*/
	private java.util.Date sendTime;
	/** 
	* @Fields returnData : 推送服务返回的消息，主要用于发送失败时 服务端返回的异常信息
	*/
	private String returnData;
		
	
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
	 * 属性 appName 的get方法 
	 * @return id
	 */
	public String getAppName() {
		return this.appName;
	}
	/**
	 * 属性 appName 的set方法 
	 * @param id 
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}
	/**
	 * 属性 pushType 的get方法 
	 * @return id
	 */
	public String getPushType() {
		return this.pushType;
	}
	/**
	 * 属性 pushType 的set方法 
	 * @param id 
	 */
	public void setPushType(String pushType) {
		this.pushType = pushType;
	}
	/**
	 * 属性 typeCode 的get方法 
	 * @return id
	 */
	public String getTypeCode() {
		return this.typeCode;
	}
	/**
	 * 属性 typeCode 的set方法 
	 * @param id 
	 */
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	/**
	 * 属性 title 的get方法 
	 * @return id
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * 属性 title 的set方法 
	 * @param id 
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 属性 content 的get方法 
	 * @return id
	 */
	public String getContent() {
		return this.content;
	}
	/**
	 * 属性 content 的set方法 
	 * @param id 
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 属性 aliveTime 的get方法 
	 * @return id
	 */
	public Long getAliveTime() {
		return this.aliveTime;
	}
	/**
	 * 属性 aliveTime 的set方法 
	 * @param id 
	 */
	public void setAliveTime(Long aliveTime) {
		this.aliveTime = aliveTime;
	}
	/**
	 * 属性 user 的get方法 
	 * @return id
	 */
	public String getUser() {
		return this.user;
	}
	/**
	 * 属性 user 的set方法 
	 * @param id 
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * 属性 userGroup 的get方法 
	 * @return id
	 */
	public String getUserGroup() {
		return this.userGroup;
	}
	/**
	 * 属性 userGroup 的set方法 
	 * @param id 
	 */
	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}
	/**
	 * 属性 hasUserGroupChild 的get方法 
	 * @return id
	 */
	public boolean getHasUserGroupChild() {
		return this.hasUserGroupChild;
	}
	/**
	 * 属性 hasUserGroupChild 的set方法 
	 * @param id 
	 */
	public void setHasUserGroupChild(boolean hasUserGroupChild) {
		this.hasUserGroupChild = hasUserGroupChild;
	}
	/**
	 * 属性 excludedUserGroup 的get方法 
	 * @return id
	 */
	public String getExcludedUserGroup() {
		return this.excludedUserGroup;
	}
	/**
	 * 属性 excludedUserGroup 的set方法 
	 * @param id 
	 */
	public void setExcludedUserGroup(String excludedUserGroup) {
		this.excludedUserGroup = excludedUserGroup;
	}
	/**
	 * 属性 hasExcludedUserGroupChild 的get方法 
	 * @return id
	 */
	public boolean getHasExcludedUserGroupChild() {
		return this.hasExcludedUserGroupChild;
	}
	/**
	 * 属性 hasExcludedUserGroupChild 的set方法 
	 * @param id 
	 */
	public void setHasExcludedUserGroupChild(boolean hasExcludedUserGroupChild) {
		this.hasExcludedUserGroupChild = hasExcludedUserGroupChild;
	}
	/**
	 * 属性 pusher 的get方法 
	 * @return id
	 */
	public String getPusher() {
		return this.pusher;
	}
	/**
	 * 属性 pusher 的set方法 
	 * @param id 
	 */
	public void setPusher(String pusher) {
		this.pusher = pusher;
	}
	/**
	 * 属性 pusherGroup 的get方法 
	 * @return id
	 */
	public String getPusherGroup() {
		return this.pusherGroup;
	}
	/**
	 * 属性 pusherGroup 的set方法 
	 * @param id 
	 */
	public void setPusherGroup(String pusherGroup) {
		this.pusherGroup = pusherGroup;
	}
	/**
	 * 属性 type 的get方法 
	 * @return id
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * 属性 type 的set方法 
	 * @param id 
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 属性 sourceId 的get方法 
	 * @return id
	 */
	public String getSourceId() {
		return this.sourceId;
	}
	/**
	 * 属性 sourceId 的set方法 
	 * @param id 
	 */
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	/**
	 * 属性 sourceType 的get方法 
	 * @return id
	 */
	public String getSourceType() {
		return this.sourceType;
	}
	/**
	 * 属性 sourceType 的set方法 
	 * @param id 
	 */
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
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
	 * 属性 sendStatus 的get方法 
	 * @return id
	 */
	public String getSendStatus() {
		return this.sendStatus;
	}
	/**
	 * 属性 sendStatus 的set方法 
	 * @param id 
	 */
	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}
	/**
	 * 属性 extendedField 的get方法 
	 * @return id
	 */
	public String getExtendedField() {
		return this.extendedField;
	}
	/**
	 * 属性 extendedField 的set方法 
	 * @param id 
	 */
	public void setExtendedField(String extendedField) {
		this.extendedField = extendedField;
	}
	/**
	 * 属性 linkUrl 的get方法 
	 * @return id
	 */
	public String getLinkUrl() {
		return this.linkUrl;
	}
	/**
	 * 属性 linkUrl 的set方法 
	 * @param id 
	 */
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	/**
	 * 属性 expectedSendTime 的get方法 
	 * @return id
	 */
	public java.util.Date getExpectedSendTime() {
		return this.expectedSendTime;
	}
	/**
	 * 属性 expectedSendTime 的set方法 
	 * @param id 
	 */
	public void setExpectedSendTime(java.util.Date expectedSendTime) {
		this.expectedSendTime = expectedSendTime;
	}
	/**
	 * 属性 sendTime 的get方法 
	 * @return id
	 */
	public java.util.Date getSendTime() {
		return this.sendTime;
	}
	/**
	 * 属性 sendTime 的set方法 
	 * @param id 
	 */
	public void setSendTime(java.util.Date sendTime) {
		this.sendTime = sendTime;
	}
	/**
	 * 属性 returnData 的get方法 
	 * @return id
	 */
	public String getReturnData() {
		return this.returnData;
	}
	/**
	 * 属性 returnData 的set方法 
	 * @param id 
	 */
	public void setReturnData(String returnData) {
		this.returnData = returnData;
	}
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: ReminderDomain 自动生成的hashcode方法</p> 
	* @author Liu Wenjie   
	* @date 2014年11月29日  16:48:56
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
	* <p>Description:ReminderDomain 自动生成的equals方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月29日  16:48:56
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
		ReminderDomain other =(ReminderDomain) obj;
		
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
	* <p>Description:ReminderDomain 自动生成的toString方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月29日  16:48:56 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ReminderDomain [" +
					"id=" + id + "," + 
					"appName=" + appName + "," + 
					"pushType=" + pushType + "," + 
					"typeCode=" + typeCode + "," + 
					"title=" + title + "," + 
					"content=" + content + "," + 
					"aliveTime=" + aliveTime + "," + 
					"user=" + user + "," + 
					"userGroup=" + userGroup + "," + 
					"hasUserGroupChild=" + hasUserGroupChild + "," + 
					"excludedUserGroup=" + excludedUserGroup + "," + 
					"hasExcludedUserGroupChild=" + hasExcludedUserGroupChild + "," + 
					"pusher=" + pusher + "," + 
					"pusherGroup=" + pusherGroup + "," + 
					"type=" + type + "," + 
					"sourceId=" + sourceId + "," + 
					"sourceType=" + sourceType + "," + 
					"createTime=" + createTime + "," + 
					"sendStatus=" + sendStatus + "," + 
					"extendedField=" + extendedField + "," + 
					"linkUrl=" + linkUrl + "," + 
					"expectedSendTime=" + expectedSendTime + "," + 
					"sendTime=" + sendTime + "," + 
					"returnData=" + returnData + "," + 
				"]";
	}
	
	
}
