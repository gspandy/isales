/**
* @Company 青鸟软通   
* @Title: LabelGroupDomain.java 
* @Package com.haier.isales.system.labelGroup.domain 
* @author Guo Yuchao   
* @date 2014年11月11日  15:58:02 
* @version V1.0   
*/ 
package com.haier.isales.system.dto;

import java.io.Serializable;

/** 
 * @ClassName: LabelGroupDomain 
 * @Description: t_qn_label_group 自动生成的对应的实体对象   
 *  
 */
public class LabelGroupDTO implements Serializable{
	private static final long serialVersionUID = -1415692682609L;

	/** 
	* @Fields groupId : 标签组id
	*/
	private Long groupId;
	/** 
	* @Fields groupName : 标签组名称
	*/
	private String groupName;
	/** 
	* @Fields groupStatus : 标签状态,101：有效，102：无效。 默认为101，
	*/
	private String groupStatus;
	/** 
	* @Fields isShared : 创建人确定是否共享该标签组
	*/
	private boolean isShared;
	/** 
	* @Fields updateId : 修改人id
	*/
	private Long updateId;
	/** 
	* @Fields updateName : 修改人姓名
	*/
	private String updateName;
	/** 
	* @Fields updateTime : 修改时间
	*/
	private java.util.Date updateTime;
	/** 
	* @Fields createId : 添加人id
	*/
	private Long createId;
	/** 
	* @Fields createName : 添加人姓名
	*/
	private String createName;
	/** 
	* @Fields createTime : 添加时间
	*/
	private java.util.Date createTime;	
	/** 
	* @Fields groupIds : 按groupId查询时使用，可以传多个，以","分隔  
	*/ 
	private String groupIds;
	
	/*=========================getter and setter ===================*/
	/**
	 * @Description: 属性 groupId 的get方法 
	 * @return id
	 */
	public Long getGroupId() {
		return this.groupId;
	}
	/**
	 * @Description: 属性 groupId 的set方法 
	 * @param id 
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	/**
	 * @Description: 属性 groupName 的get方法 
	 * @return id
	 */
	public String getGroupName() {
		return this.groupName;
	}
	/**
	 * @Description: 属性 groupName 的set方法 
	 * @param id 
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * @Description: 属性 groupStatus 的get方法 
	 * @return id
	 */
	public String getGroupStatus() {
		return this.groupStatus;
	}
	/**
	 * @Description: 属性 groupStatus 的set方法 
	 * @param id 
	 */
	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
	}
	/**
	 * @Description: 属性 isShared 的get方法 
	 * @return id
	 */
	public boolean getIsShared() {
		return this.isShared;
	}
	/**
	 * @Description: 属性 isShared 的set方法 
	 * @param id 
	 */
	public void setIsShared(boolean isShared) {
		this.isShared = isShared;
	}
	/**
	 * @Description: 属性 updateId 的get方法 
	 * @return id
	 */
	public Long getUpdateId() {
		return this.updateId;
	}
	/**
	 * @Description: 属性 updateId 的set方法 
	 * @param id 
	 */
	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}
	/**
	 * @Description: 属性 updateName 的get方法 
	 * @return id
	 */
	public String getUpdateName() {
		return this.updateName;
	}
	/**
	 * @Description: 属性 updateName 的set方法 
	 * @param id 
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
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
	 * @Description: 属性 createId 的get方法 
	 * @return id
	 */
	public Long getCreateId() {
		return this.createId;
	}
	/**
	 * @Description: 属性 createId 的set方法 
	 * @param id 
	 */
	public void setCreateId(Long createId) {
		this.createId = createId;
	}
	/**
	 * @Description: 属性 createName 的get方法 
	 * @return id
	 */
	public String getCreateName() {
		return this.createName;
	}
	/**
	 * @Description: 属性 createName 的set方法 
	 * @param id 
	 */
	public void setCreateName(String createName) {
		this.createName = createName;
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
	 * @Description: 属性 isShared 的set方法 
	 * @param isShared 
	 */
	public void setShared(boolean isShared) {
		this.isShared = isShared;
	}
/**
	 * @Description: 属性 groupIds 的get方法 
	 * @return groupIds
	 */
	public String getGroupIds() {
		return groupIds;
	}
	/**
	 * @Description: 属性 groupIds 的set方法 
	 * @param groupIds 
	 */
	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
	}
	
	/*=====================toString====================*/
	/**
	* <p>Description: LabelGroupDTO自动生成的toString方法</p> 
	* @author Cao Rui
	* @date 2015-1-7 下午6:58:49 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "LabelGroupDTO [groupId=" + groupId + ", groupName=" + groupName
				+ ", groupStatus=" + groupStatus + ", isShared=" + isShared
				+ ", updateId=" + updateId + ", updateName=" + updateName
				+ ", updateTime=" + updateTime + ", createId=" + createId
				+ ", createName=" + createName + ", createTime=" + createTime
				+ ", groupIds=" + groupIds + "]";
	}
}
