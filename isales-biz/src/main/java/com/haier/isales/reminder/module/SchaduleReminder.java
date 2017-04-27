/**
* @Company 青鸟软通   
* @Title: SchaduleReminder.java 
* @Package com.haier.isales.reminder.module 
* @author Liu Wenjie   
* @date 2014-11-14 下午8:51:32 
* @version V1.0   
*/ 
package com.haier.isales.reminder.module;

import java.io.Serializable;
import java.util.List;

import com.haier.isales.system.user.model.UserGroupModule;

/** 
 * @ClassName: SchaduleReminder 
 * @Description: 在service保存对应的消息推送的功能方法 
 *  
 */
public class SchaduleReminder implements Serializable{

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = 4769120706415016058L;
	
	/** 
	* @Fields appName : app名称，推送系统中使用的app对应名称，在本系统中固定值为ISALES(固定值取决于数据库的设置)
	*/
	private String appName;
	
	public static final String ISALES = "ISALES";
	/** 
	* @Fields pushType : 推送类型，目前有APNS 和 MQTT  两种(默认值取决于数据库的默认值 )
	*/
	private ReminderPushType pushType;
	
	public enum ReminderPushType{
		APNS,MQTT;
	}
	/** 
	* @Fields typeCode : 手机端推送的消息类型，目前有三类，ADV (广告类)；COM (普通的)；ENG(有条数限制)(默认值取决于数据库的默认值 )
	*/
	private ReminderTypeCode typeCode;
	
	public enum ReminderTypeCode{
		ADV,COM,ENG;
	}
	/** 
	* @Fields title : 消息标题(必填)
	*/
	private String title;
	/** 
	* @Fields content : 消息内容（必填）
	*/
	private String content;
	/** 
	* @Fields aliveTime : 消息保留时间，时长，单位为毫秒（默认值取决于数据库）
	*/
	private Long aliveTime;
	/** 
	* @Fields user : 接收消息用户,用户信息是id的组合，例如【"123","1234】
	*/
	private List<String> userList;
	/** 
	* @Fields userGroup : 接收消息用户组,是一个用户组，形如【"123","1234】
	*/
	private List<UserGroupModule> userGroupList;
	/** 
	* @Fields hasUserGroupChild : 是否包含用户组子集
	*/
	private boolean hasUserGroupChild = true;
	/** 
	* @Fields excludedUserGroup : 排除的用户组
	*/
	private List<UserGroupModule> excludedUserGroupList; 
	/** 
	* @Fields hasExcludedUserGroupChild : 是否包含排除用户组子集
	*/
	private boolean hasExcludedUserGroupChild = false;
	/** 
	* @Fields pusher : 推送消息用户
	*/
	private String pusher;
	/** 
	* @Fields pusherGroup : 推送消息用户组
	*/
	private String pusherGroup;
	
	/** 
	* @Fields type : 消息类型，在isales系统中定义的本消息的类型，目前还没有定义
	*/
	private String type;
	/** 
	* @Fields sourceId : 源数据id 
	*/
	private String sourceId;
	/** 
	* @Fields sourceType : 源数据类型,TODO 对应的功能模块编码，目前还没有设计
	*/
	private String sourceType;
	/**
	 * @Description: 属性 appName 的get方法 
	 * @return appName
	 */
	public String getAppName() {
		return appName;
	}
	/**
	 * @Description: 属性 appName 的set方法 
	 * @param appName 
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}
	/**
	 * @Description: 属性 title 的get方法 
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @Description: 属性 title 的set方法 
	 * @param title 
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @Description: 属性 content 的get方法 
	 * @return content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @Description: 属性 content 的set方法 
	 * @param content 
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @Description: 属性 aliveTime 的get方法 
	 * @return aliveTime
	 */
	public Long getAliveTime() {
		return aliveTime;
	}
	/**
	 * @Description: 属性 aliveTime 的set方法 
	 * @param aliveTime 
	 */
	public void setAliveTime(Long aliveTime) {
		this.aliveTime = aliveTime;
	}
	/**
	 * @Description: 属性 pusher 的get方法 
	 * @return pusher
	 */
	public String getPusher() {
		return pusher;
	}
	/**
	 * @Description: 属性 pusher 的set方法 
	 * @param pusher 
	 */
	public void setPusher(String pusher) {
		this.pusher = pusher;
	}
	/**
	 * @Description: 属性 pusherGroup 的get方法 
	 * @return pusherGroup
	 */
	public String getPusherGroup() {
		return pusherGroup;
	}
	/**
	 * @Description: 属性 pusherGroup 的set方法 
	 * @param pusherGroup 
	 */
	public void setPusherGroup(String pusherGroup) {
		this.pusherGroup = pusherGroup;
	}
	/**
	 * @Description: 属性 type 的get方法 
	 * @return type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @Description: 属性 type 的set方法 
	 * @param type 
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @Description: 属性 sourceId 的get方法 
	 * @return sourceId
	 */
	public String getSourceId() {
		return sourceId;
	}
	/**
	 * @Description: 属性 sourceId 的set方法 
	 * @param sourceId 
	 */
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	/**
	 * @Description: 属性 sourceType 的get方法 
	 * @return sourceType
	 */
	public String getSourceType() {
		return sourceType;
	}
	/**
	 * @Description: 属性 sourceType 的set方法 
	 * @param sourceType 
	 */
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	/**
	 * @Description: 属性 userList 的get方法 
	 * @return userList
	 */
	public List<String> getUserList() {
		return userList;
	}
	/**
	 * @Description: 属性 userList 的set方法 
	 * @param userList 
	 */
	public void setUserList(List<String> userList) {
		this.userList = userList;
	}
	/**
	 * @Description: 属性 userGroupList 的get方法 
	 * @return userGroupList
	 */
	public List<UserGroupModule> getUserGroupList() {
		return userGroupList;
	}
	/**
	 * @Description: 属性 userGroupList 的set方法 
	 * @param userGroupList 
	 */
	public void setUserGroupList(List<UserGroupModule> userGroupList) {
		this.userGroupList = userGroupList;
	}
	/**
	 * @Description: 属性 hasUserGroupChild 的get方法 
	 * @return hasUserGroupChild
	 */
	public boolean isHasUserGroupChild() {
		return hasUserGroupChild;
	}
	/**
	 * @Description: 属性 hasUserGroupChild 的set方法 
	 * @param hasUserGroupChild 
	 */
	public void setHasUserGroupChild(boolean hasUserGroupChild) {
		this.hasUserGroupChild = hasUserGroupChild;
	}
	
	/**
	 * @Description: 属性 excludedUserGroupList 的get方法 
	 * @return excludedUserGroupList
	 */
	public List<UserGroupModule> getExcludedUserGroupList() {
		return excludedUserGroupList;
	}
	/**
	 * @Description: 属性 excludedUserGroupList 的set方法 
	 * @param excludedUserGroupList 
	 */
	public void setExcludedUserGroupList(List<UserGroupModule> excludedUserGroupList) {
		this.excludedUserGroupList = excludedUserGroupList;
	}
	/**
	 * @Description: 属性 hasExcludedUserGroupChild 的get方法 
	 * @return hasExcludedUserGroupChild
	 */
	public boolean isHasExcludedUserGroupChild() {
		return hasExcludedUserGroupChild;
	}
	/**
	 * @Description: 属性 hasExcludedUserGroupChild 的set方法 
	 * @param hasExcludedUserGroupChild 
	 */
	public void setHasExcludedUserGroupChild(boolean hasExcludedUserGroupChild) {
		this.hasExcludedUserGroupChild = hasExcludedUserGroupChild;
	}
	/**
	 * @Description: 属性 pushType 的get方法 
	 * @return pushType
	 */
	public ReminderPushType getPushType() {
		return pushType;
	}
	/**
	 * @Description: 属性 pushType 的set方法 
	 * @param pushType 
	 */
	public void setPushType(ReminderPushType pushType) {
		this.pushType = pushType;
	}
	/**
	 * @Description: 属性 typeCode 的get方法 
	 * @return typeCode
	 */
	public ReminderTypeCode getTypeCode() {
		return typeCode;
	}
	/**
	 * @Description: 属性 typeCode 的set方法 
	 * @param typeCode 
	 */
	public void setTypeCode(ReminderTypeCode typeCode) {
		this.typeCode = typeCode;
	}
	
}
