/**
* @Company 青鸟软通   
* @Title: CommentsDomain.java 
* @Package com.haier.isales.moments.domain 
* @author Liu Wenjie   
* @date 2014年11月22日  15:23:00 
* @version V1.0   
*/ 
package com.haier.isales.moments.domain;

import java.io.Serializable;

/** 
 * @ClassName: CommentsDomain 
 * t_isales_comments 自动生成的对应的实体对象   
 *  
 */
public class CommentsDomain implements Serializable{
	private static final long serialVersionUID = -1416640980916L;

	public static final String STATUS_ENABLE = "101" ;
	public static final String STATUS_DISABLE = "102";

	private Long id;			//主键

	private String title;		//标题-预留

	private String content;		//内容

	private String location;		//评论位置

	private Long sourceId;		//被评论的内容id

	private Long sourceUserid;		//被评论内容对应用户id

	private String sourceUsername;		//被评论内容对应用户姓名

	private String sourceUsercode;		//被评论内容对应用户工号

	private Long parentId;		//上一级id，没有则为空值

	private Long parentUserid;		//上一级对应用户id，没有则为空值

	private String parentUsername;		//上一级对应用户姓名，没有则为空值

	private String parentUsercode;		//上一级对应的用户工号，没有则为空值

	private String status;		//状态，101有效，102已删除

	private String labelGroups;		//发表评论的用户，在发表评论时所处的圈子，圈子即标签组，存储标签组的id即可，
	//用"#"和标签组的id组合，并且用"|"隔开。比如选择了id为1、3、123的三个标签组，则组合后的格式如下:#1#|#3#|123#

	private String type;		//类型,101:针对朋友圈分享的评论，其他待以后扩展

	private Long createId;		//添加人id

	private java.util.Date createTime;		//添加时间

	private String createName;		//添加人name

	private String createUsercode;		//添加人工号

	private Long updateId;		//修改人id

	private String updateName;		//修改人name

	private java.util.Date updateTime;		//修改时间

	private String updateUsercode;		//修改人工号
		
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
	 * 属性 sourceId 的get方法 
	 * @return id
	 */
	public Long getSourceId() {
		return this.sourceId;
	}
	/**
	 * 属性 sourceId 的set方法 
	 * @param id 
	 */
	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}
	/**
	 * 属性 sourceUserid 的get方法 
	 * @return id
	 */
	public Long getSourceUserid() {
		return this.sourceUserid;
	}
	/**
	 * 属性 sourceUserid 的set方法 
	 * @param id 
	 */
	public void setSourceUserid(Long sourceUserid) {
		this.sourceUserid = sourceUserid;
	}
	/**
	 * 属性 sourceUsername 的get方法 
	 * @return id
	 */
	public String getSourceUsername() {
		return this.sourceUsername;
	}
	/**
	 * 属性 sourceUsername 的set方法 
	 * @param id 
	 */
	public void setSourceUsername(String sourceUsername) {
		this.sourceUsername = sourceUsername;
	}
	/**
	 * 属性 sourceUsercode 的get方法 
	 * @return id
	 */
	public String getSourceUsercode() {
		return this.sourceUsercode;
	}
	/**
	 * 属性 sourceUsercode 的set方法 
	 * @param id 
	 */
	public void setSourceUsercode(String sourceUsercode) {
		this.sourceUsercode = sourceUsercode;
	}
	/**
	 * 属性 parentId 的get方法 
	 * @return id
	 */
	public Long getParentId() {
		return this.parentId;
	}
	/**
	 * 属性 parentId 的set方法 
	 * @param id 
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
	 * 属性 parentUserid 的get方法 
	 * @return id
	 */
	public Long getParentUserid() {
		return this.parentUserid;
	}
	/**
	 * 属性 parentUserid 的set方法 
	 * @param id 
	 */
	public void setParentUserid(Long parentUserid) {
		this.parentUserid = parentUserid;
	}
	/**
	 * 属性 parentUsername 的get方法 
	 * @return id
	 */
	public String getParentUsername() {
		return this.parentUsername;
	}
	/**
	 * 属性 parentUsername 的set方法 
	 * @param id 
	 */
	public void setParentUsername(String parentUsername) {
		this.parentUsername = parentUsername;
	}
	/**
	 * 属性 parentUsercode 的get方法 
	 * @return id
	 */
	public String getParentUsercode() {
		return this.parentUsercode;
	}
	/**
	 * 属性 parentUsercode 的set方法 
	 * @param id 
	 */
	public void setParentUsercode(String parentUsercode) {
		this.parentUsercode = parentUsercode;
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
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: CommentsDomain 自动生成的hashcode方法</p> 
	* @author Liu Wenjie   
	* @date 2014年11月22日  15:23:00
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
	* <p>Description:CommentsDomain 自动生成的equals方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月22日  15:23:00
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
		CommentsDomain other =(CommentsDomain) obj;

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
	* <p>Description:CommentsDomain 自动生成的toString方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月22日  15:23:00 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "CommentsDomain [" +
					"id=" + id + "," + 
					"title=" + title + "," + 
					"content=" + content + "," + 
					"location=" + location + "," + 
					"sourceId=" + sourceId + "," + 
					"sourceUserid=" + sourceUserid + "," + 
					"sourceUsername=" + sourceUsername + "," + 
					"sourceUsercode=" + sourceUsercode + "," + 
					"parentId=" + parentId + "," + 
					"parentUserid=" + parentUserid + "," + 
					"parentUsername=" + parentUsername + "," + 
					"parentUsercode=" + parentUsercode + "," + 
					"status=" + status + "," + 
					"labelGroups=" + labelGroups + "," + 
					"type=" + type + "," + 
					"createId=" + createId + "," + 
					"createTime=" + createTime + "," + 
					"createName=" + createName + "," + 
					"createUsercode=" + createUsercode + "," + 
					"updateId=" + updateId + "," + 
					"updateName=" + updateName + "," + 
					"updateTime=" + updateTime + "," + 
					"updateUsercode=" + updateUsercode + "," + 
				"]";
	}
}
