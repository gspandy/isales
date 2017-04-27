/**
* @Company 青鸟软通   
* @Title: MomentsDomain.java 
* @Package com.haier.isales.moments.domain 
* @author Liu Wenjie   
* @date 2014年11月22日  15:38:31 
* @version V1.0   
*/ 
package com.haier.isales.moments.domain;

import java.io.Serializable;

/** 
 * @ClassName: MomentsDomain 
 * t_isales_moments 自动生成的对应的实体对象   
 *  
 */
public class MomentsDomain implements Serializable{
	private static final long serialVersionUID = -1416641911933L;

	public static final String STATUS_ENABLE = "101"; //可用
	public static final String STATUS_DISABLE = "102"; //不可用

	private Long id;//主键

	private String content;//内容

	private String status;//状态

	private String type;//类型

	private String location;//评论位置

	private String labelGroups;//发布的圈子，发布时选择的圈子，圈子即标签组，存储所选标签组的id即可，
	//用"#"和标签组的id组合，并且用"|"隔开。比如选择了id为1、3、123的三个标签组，则组合后的格式如下:#1#|#3#|#123#

	private String snapshot;//引用内容的快照，引用的内容目前有销售记录、经验。

	private Long createId;//添加人id

	private java.util.Date createTime;//添加时间
	
	private String createName;//添加人name

	private String createUsercode;//添加人工号

	private Long updateId;//修改人id

	private String updateName;//修改人name

	private java.util.Date updateTime;//修改时间

	private String updateUsercode;//修改人工号

	private Integer browseCount;//浏览次数

	private Integer postCount;//转发次数
	
	private Integer likeCount;//被赞数

	private Integer dislikeCount;//被踩数
	
	private Integer commentsCount;//评论数
		
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
	 * 属性 location 的get方法 
	 * @return id
	 */
	public String getLocation() {
		return this.location;
	}
	/**
	 * 属性 location 的set方法 
	 * @param id 
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * 属性 labelGroups 的get方法 
	 * @return id
	 */
	public String getLabelGroups() {
		return this.labelGroups;
	}
	/**
	 * 属性 labelGroups 的set方法 
	 * @param id 
	 */
	public void setLabelGroups(String labelGroups) {
		this.labelGroups = labelGroups;
	}
	/**
	 * 属性 snapshot 的get方法 
	 * @return id
	 */
	public String getSnapshot() {
		return this.snapshot;
	}
	/**
	 * 属性 snapshot 的set方法 
	 * @param id 
	 */
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
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
	 * 属性 createUsercode 的get方法 
	 * @return id
	 */
	public String getCreateUsercode() {
		return this.createUsercode;
	}
	/**
	 * 属性 createUsercode 的set方法 
	 * @param id 
	 */
	public void setCreateUsercode(String createUsercode) {
		this.createUsercode = createUsercode;
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
	 * 属性 updateUsercode 的get方法 
	 * @return id
	 */
	public String getUpdateUsercode() {
		return this.updateUsercode;
	}
	/**
	 * 属性 updateUsercode 的set方法 
	 * @param id 
	 */
	public void setUpdateUsercode(String updateUsercode) {
		this.updateUsercode = updateUsercode;
	}
	/**
	 * 属性 browseCount 的get方法 
	 * @return id
	 */
	public Integer getBrowseCount() {
		return this.browseCount;
	}
	/**
	 * 属性 browseCount 的set方法 
	 * @param id 
	 */
	public void setBrowseCount(Integer browseCount) {
		this.browseCount = browseCount;
	}
	/**
	 * 属性 postCount 的get方法 
	 * @return id
	 */
	public Integer getPostCount() {
		return this.postCount;
	}
	/**
	 * 属性 postCount 的set方法 
	 * @param id 
	 */
	public void setPostCount(Integer postCount) {
		this.postCount = postCount;
	}
	/**
	 * 属性 likeCount 的get方法 
	 * @return id
	 */
	public Integer getLikeCount() {
		return this.likeCount;
	}
	/**
	 * 属性 likeCount 的set方法 
	 * @param id 
	 */
	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}
	/**
	 * 属性 dislikeCount 的get方法 
	 * @return id
	 */
	public Integer getDislikeCount() {
		return this.dislikeCount;
	}
	/**
	 * 属性 dislikeCount 的set方法 
	 * @param id 
	 */
	public void setDislikeCount(Integer dislikeCount) {
		this.dislikeCount = dislikeCount;
	}
	/**
	 * 属性 commentsCount 的get方法 
	 * @return id
	 */
	public Integer getCommentsCount() {
		return this.commentsCount;
	}
	/**
	 * 属性 commentsCount 的set方法 
	 * @param id 
	 */
	public void setCommentsCount(Integer commentsCount) {
		this.commentsCount = commentsCount;
	}

	/*====================hashCode and equals ====================*/
    /**
	* <p>Description: MomentsDomain 自动生成的hashcode方法</p> 
	* @author Liu Wenjie   
	* @date 2014年11月22日  15:38:31
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
	* <p>Description:MomentsDomain 自动生成的equals方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月22日  15:38:31
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		MomentsDomain other =(MomentsDomain) obj;

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
	* <p>Description:MomentsDomain 自动生成的toString方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月22日  15:38:31 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "MomentsDomain [" +
					"id=" + id + "," + 
					"content=" + content + "," + 
					"status=" + status + "," + 
					"type=" + type + "," + 
					"location=" + location + "," + 
					"labelGroups=" + labelGroups + "," + 
					"snapshot=" + snapshot + "," + 
					"createId=" + createId + "," + 
					"createTime=" + createTime + "," + 
					"createName=" + createName + "," + 
					"createUsercode=" + createUsercode + "," + 
					"updateId=" + updateId + "," + 
					"updateName=" + updateName + "," + 
					"updateTime=" + updateTime + "," + 
					"updateUsercode=" + updateUsercode + "," + 
					"browseCount=" + browseCount + "," + 
					"postCount=" + postCount + "," + 
					"likeCount=" + likeCount + "," + 
					"dislikeCount=" + dislikeCount + "," + 
					"commentsCount=" + commentsCount + "," + 
				"]";
	}
	
	
}
