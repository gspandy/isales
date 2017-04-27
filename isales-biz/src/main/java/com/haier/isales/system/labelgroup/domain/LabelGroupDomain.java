/**
* @Company 青鸟软通   
* @Title: LabelGroupDomain.java 
* @Package com.haier.isales.system.labelGroup.domain 
* @author Guo Yuchao   
* @date 2014年11月11日  15:58:02 
* @version V1.0   
*/ 
package com.haier.isales.system.labelgroup.domain;

import java.io.Serializable;

/** 
 * @ClassName: LabelGroupDomain 
 * t_qn_label_group 自动生成的对应的实体对象   
 *  
 */
public class LabelGroupDomain implements Serializable{
	private static final long serialVersionUID = -1415692682609L;

	private Long groupId;    //标签组id

	private String groupName;    //标签组名称

	private String groupStatus;    //标签状态,101：有效，102：无效。 默认为101，

	private boolean isShared;    //创建人确定是否共享该标签组

	private Long updateId;    //修改人id

	private String updateName;    //修改人姓名

	private java.util.Date updateTime;    //修改时间

	private Long createId;    //添加人id

	private String createName;    //添加人姓名

	private java.util.Date createTime;    //添加时间
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * 属性 groupId 的get方法 
	 * @return id
	 */
	public Long getGroupId() {
		return this.groupId;
	}
	/**
	 * 属性 groupId 的set方法 
	 * @param id 
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	/**
	 * 属性 groupName 的get方法 
	 * @return id
	 */
	public String getGroupName() {
		return this.groupName;
	}
	/**
	 * 属性 groupName 的set方法 
	 * @param id 
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * 属性 groupStatus 的get方法 
	 * @return id
	 */
	public String getGroupStatus() {
		return this.groupStatus;
	}
	/**
	 * 属性 groupStatus 的set方法 
	 * @param id 
	 */
	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
	}
	/**
	 * 属性 isShared 的get方法 
	 * @return id
	 */
	public boolean getIsShared() {
		return this.isShared;
	}
	/**
	 * 属性 isShared 的set方法 
	 * @param id 
	 */
	public void setIsShared(boolean isShared) {
		this.isShared = isShared;
	}
	/**
	 * 属性 updateId 的get方法 
	 * @return id
	 */
	public Long getUpdateId() {
		return this.updateId;
	}
	/**
	 * 属性 updateId 的set方法 
	 * @param id 
	 */
	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}
	/**
	 * 属性 updateName 的get方法 
	 * @return id
	 */
	public String getUpdateName() {
		return this.updateName;
	}
	/**
	 * 属性 updateName 的set方法 
	 * @param id 
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
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
	 * 属性 createId 的get方法 
	 * @return id
	 */
	public Long getCreateId() {
		return this.createId;
	}
	/**
	 * 属性 createId 的set方法 
	 * @param id 
	 */
	public void setCreateId(Long createId) {
		this.createId = createId;
	}
	/**
	 * 属性 createName 的get方法 
	 * @return id
	 */
	public String getCreateName() {
		return this.createName;
	}
	/**
	 * 属性 createName 的set方法 
	 * @param id 
	 */
	public void setCreateName(String createName) {
		this.createName = createName;
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
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: LabelGroupDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2014年11月11日  15:58:02
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((groupId == null) ? 0 : groupId.hashCode());
		return result;
	}
	/**
	* <p>Description:LabelGroupDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月11日  15:58:02
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
		LabelGroupDomain other =(LabelGroupDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (groupId == null) {if (other.groupId != null){ return false;} else if (!groupId.equals(other.groupId)){ return false;}}
		*/
		if (groupId == null) {
			if (other.groupId != null){ 
				return false;
			}
		}else if (!groupId.equals(other.groupId)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:LabelGroupDomain 自动生成的toString方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月11日  15:58:02 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "LabelGroupDomain [" +
					"groupId=" + groupId + "," + 
					"groupName=" + groupName + "," + 
					"groupStatus=" + groupStatus + "," + 
					"isShared=" + isShared + "," + 
					"updateId=" + updateId + "," + 
					"updateName=" + updateName + "," + 
					"updateTime=" + updateTime + "," + 
					"createId=" + createId + "," + 
					"createName=" + createName + "," + 
					"createTime=" + createTime + "," + 
				"]";
	}
	
	
}
