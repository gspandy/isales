/**
* @Company 青鸟软通   
* @Title: CommentsDTO.java 
* @Package com.haier.isales.moments.dto 
* @author Cao  Rui   
* @date 2014-11-22 下午8:10:05 
* @version V1.0   
*/ 
package com.haier.isales.moments.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/** 
 * @ClassName: CommentsDTO 
 * @Description: 
 *  
 */
public class CommentsDTO implements Serializable{
	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = -7525561699032257214L;

	/** 
	* @Fields id : 唯一标识
	*/
	private Long id;
	/** 
	* @Fields title : 标题-预留
	*/
	private String title;
	/** 
	* @Fields content : 内容
	*/
	private String content;
	/** 
	* @Fields location : 评论位置
	*/
	private String location;
	/** 
	* @Fields sourceId : 被评论的内容id
	*/
	private Long sourceId;
	/** 
	* @Fields sourceUserid : 被评论内容对应用户id
	*/
	private Long sourceUserid;
	/** 
	* @Fields sourceUsername : 被评论内容对应用户姓名
	*/
	private String sourceUsername;
	/** 
	* @Fields sourceUsercode : 被评论内容对应用户工号
	*/
	private String sourceUsercode;
	/** 
	* @Fields parentId : 上一级id，没有则为空值
	*/
	private Long parentId;
	/** 
	* @Fields parentUserid : 上一级对应用户id，没有则为空值
	*/
	private Long parentUserid;
	/** 
	* @Fields parentUsername : 上一级对应用户姓名，没有则为空值
	*/
	private String parentUsername;
	/** 
	* @Fields parentUsercode : 上一级对应的用户工号，没有则为空值
	*/
	private String parentUsercode;
	/** 
	* @Fields status : 状态，101有效，102已删除
	*/
	private String status;
	/** 
	* @Fields labelGroups : 发表评论的用户，在发表评论时所处的圈子，圈子即标签组，存储标签组的id即可，用"#"和标签组的id组合，并且用"|"隔开。
            比如选择了id为1、3、123的三个标签组，则组合后的格式如下:#1#|#3#|123#
	*/
	private String labelGroups;
	/** 
	* @Fields type : 类型,101:针对朋友圈分享的评论，其他待以后扩展
	*/
	private String type;
	/** 
	* @Fields createId : 添加人id
	*/
	private Long createId;
	/** 
	* @Fields createTime : 添加时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields createName : 添加人name
	*/
	private String createName;
	/** 
	* @Fields createUsercode : 添加人工号
	*/
	private String createUsercode;
	/** 
	* @Fields updateId : 修改人id
	*/
	private Long updateId;
	/** 
	* @Fields updateName : 修改人name
	*/
	private String updateName;
	/** 
	* @Fields updateTime : 修改时间
	*/
	private java.util.Date updateTime;
	/** 
	* @Fields updateUsercode : 修改人工号
	*/
	private String updateUsercode;
		
	/** 
	* @Fields createTimeShow : 添加时间转化为字符串显示
	*/ 
	private String createTimeShow;	
	
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
	 * @Description: 属性 title 的get方法 
	 * @return id
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * @Description: 属性 title 的set方法 
	 * @param id 
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @Description: 属性 content 的get方法 
	 * @return id
	 */
	public String getContent() {
		return this.content;
	}
	/**
	 * @Description: 属性 content 的set方法 
	 * @param id 
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @Description: 属性 location 的get方法 
	 * @return id
	 */
	public String getLocation() {
		return this.location;
	}
	/**
	 * @Description: 属性 location 的set方法 
	 * @param id 
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @Description: 属性 sourceId 的get方法 
	 * @return id
	 */
	public Long getSourceId() {
		return this.sourceId;
	}
	/**
	 * @Description: 属性 sourceId 的set方法 
	 * @param id 
	 */
	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}
	/**
	 * @Description: 属性 sourceUserid 的get方法 
	 * @return id
	 */
	public Long getSourceUserid() {
		return this.sourceUserid;
	}
	/**
	 * @Description: 属性 sourceUserid 的set方法 
	 * @param id 
	 */
	public void setSourceUserid(Long sourceUserid) {
		this.sourceUserid = sourceUserid;
	}
	/**
	 * @Description: 属性 sourceUsername 的get方法 
	 * @return id
	 */
	public String getSourceUsername() {
		return this.sourceUsername;
	}
	/**
	 * @Description: 属性 sourceUsername 的set方法 
	 * @param id 
	 */
	public void setSourceUsername(String sourceUsername) {
		this.sourceUsername = sourceUsername;
	}
	/**
	 * @Description: 属性 sourceUsercode 的get方法 
	 * @return id
	 */
	public String getSourceUsercode() {
		return this.sourceUsercode;
	}
	/**
	 * @Description: 属性 sourceUsercode 的set方法 
	 * @param id 
	 */
	public void setSourceUsercode(String sourceUsercode) {
		this.sourceUsercode = sourceUsercode;
	}
	/**
	 * @Description: 属性 parentId 的get方法 
	 * @return id
	 */
	public Long getParentId() {
		return this.parentId;
	}
	/**
	 * @Description: 属性 parentId 的set方法 
	 * @param id 
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
	 * @Description: 属性 parentUserid 的get方法 
	 * @return id
	 */
	public Long getParentUserid() {
		return this.parentUserid;
	}
	/**
	 * @Description: 属性 parentUserid 的set方法 
	 * @param id 
	 */
	public void setParentUserid(Long parentUserid) {
		this.parentUserid = parentUserid;
	}
	/**
	 * @Description: 属性 parentUsername 的get方法 
	 * @return id
	 */
	public String getParentUsername() {
		return this.parentUsername;
	}
	/**
	 * @Description: 属性 parentUsername 的set方法 
	 * @param id 
	 */
	public void setParentUsername(String parentUsername) {
		this.parentUsername = parentUsername;
	}
	/**
	 * @Description: 属性 parentUsercode 的get方法 
	 * @return id
	 */
	public String getParentUsercode() {
		return this.parentUsercode;
	}
	/**
	 * @Description: 属性 parentUsercode 的set方法 
	 * @param id 
	 */
	public void setParentUsercode(String parentUsercode) {
		this.parentUsercode = parentUsercode;
	}
	/**
	 * @Description: 属性 status 的get方法 
	 * @return id
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * @Description: 属性 status 的set方法 
	 * @param id 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @Description: 属性 labelGroups 的get方法 
	 * @return id
	 */
	public String getLabelGroups() {
		return this.labelGroups;
	}
	/**
	 * @Description: 属性 labelGroups 的set方法 
	 * @param id 
	 */
	public void setLabelGroups(String labelGroups) {
		this.labelGroups = labelGroups;
	}
	/**
	 * @Description: 属性 type 的get方法 
	 * @return id
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * @Description: 属性 type 的set方法 
	 * @param id 
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @Description: 属性 createUsercode 的get方法 
	 * @return id
	 */
	public String getCreateUsercode() {
		return this.createUsercode;
	}
	/**
	 * @Description: 属性 createUsercode 的set方法 
	 * @param id 
	 */
	public void setCreateUsercode(String createUsercode) {
		this.createUsercode = createUsercode;
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
	 * @Description: 属性 updateUsercode 的get方法 
	 * @return id
	 */
	public String getUpdateUsercode() {
		return this.updateUsercode;
	}
	/**
	 * @Description: 属性 updateUsercode 的set方法 
	 * @param id 
	 */
	public void setUpdateUsercode(String updateUsercode) {
		this.updateUsercode = updateUsercode;
	}
	/**
	 * @Description: 属性 createTimeShow 的get方法 
	 * @return createTimeShow
	 */
	public String getCreateTimeShow() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		if(null != this.createTime){
			String dateShow = sdf.format(this.createTime);
			this.createTimeShow = dateShow;
		}
		return createTimeShow;
	}
	/**
	 * @Description: 属性 createTimeShow 的set方法 
	 * @param createTimeShow 
	 */
	public void setCreateTimeShow(String createTimeShow) {
		this.createTimeShow = createTimeShow;
	}
	
	/*===================toString======================*/
	/**
	* <p>Description: CommentsDTO自动生成的toString方法</p> 
	* @author Guo  Yuchao   
	* @date 2015-1-7 下午7:14:59 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "CommentsDTO [id=" + id + ", title=" + title + ", content="
				+ content + ", location=" + location + ", sourceId=" + sourceId
				+ ", sourceUserid=" + sourceUserid + ", sourceUsername="
				+ sourceUsername + ", sourceUsercode=" + sourceUsercode
				+ ", parentId=" + parentId + ", parentUserid=" + parentUserid
				+ ", parentUsername=" + parentUsername + ", parentUsercode="
				+ parentUsercode + ", status=" + status + ", labelGroups="
				+ labelGroups + ", type=" + type + ", createId=" + createId
				+ ", createTime=" + createTime + ", createName=" + createName
				+ ", createUsercode=" + createUsercode + ", updateId="
				+ updateId + ", updateName=" + updateName + ", updateTime="
				+ updateTime + ", updateUsercode=" + updateUsercode
				+ ", createTimeShow=" + createTimeShow + "]";
	}
}
