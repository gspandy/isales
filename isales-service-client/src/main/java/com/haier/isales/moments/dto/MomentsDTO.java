/**
* @Company 青鸟软通   
* @Title: MomentsDTO.java 
* @Package com.haier.isales.moments.dto 
* @author Cao Rui   
* @date 2014-11-20 下午7:33:39 
* @version V1.0   
*/ 
package com.haier.isales.moments.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/** 
 * @ClassName: MomentsDTO 
 * @Description: 
 *  
 */
public class MomentsDTO implements Serializable{
	private static final long serialVersionUID = -1416471950233L;

	/** 
	* @Fields id : 
	*/
	private Long id;	
	/** 
	* @Fields content : 内容
	*/
	private String content;
	/** 
	* @Fields status : 状态
	*/
	private String status;
	/** 
	* @Fields type : 类型
	*/
	private String type;
	/** 
	* @Fields labelGroups : 发布的圈子，发布时选择的圈子，圈子即标签组，存储所选标签组的id即可，用"#"和标签组的id组合，并且用"|"隔开。
            比如选择了id为1、3、123的三个标签组，则组合后的格式如下:#1#|#3#|#123#
	*/
	private String labelGroups;
	/** 
	* @Fields snapshot : 引用内容的快照，引用的内容目前有销售记录、经验。
	*/
	private String snapshot;
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
	* @Fields browseCount : 浏览次数
	*/
	private Integer browseCount;
	/** 
	* @Fields postCount : 转发次数
	*/
	private Integer postCount;
	/** 
	* @Fields likeCount : 被赞数
	*/
	private Integer likeCount;
	/** 
	* @Fields dislikeCount : 被踩数
	*/
	private Integer dislikeCount;
	/** 
	* @Fields commentsCount : 评论数
	*/
	private Integer commentsCount;
	/** 
	* @Fields location : 评论位置
	*/ 
	private String location	;	
	/** 
	* @Fields createTimeShow : 将发表分享的时间，转成字符串显示给前台
	*/ 
	private String createTimeShow; 
	/** 
	* @Fields operatorId : 额外属性，通过用户关联:发布这条内容的用户id
	*/ 
	private Long operatorId;
	/** 
	* @Fields headPortraitId : 额外属性，通过用户关联：用户头像id
	*/ 
	private Long headPortraitId;
	/** 
	* @Fields userName : 额外属性，通过用户关联：用户姓名
	*/ 
	private String userName;
	/** 
	* @Fields orgName : 额外属性，通过用户关联：用户所属的中心名称
	*/ 
	private String orgName;
	
	/*==================getter、setter========================*/
	/**
	 * @Description: 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @Description: 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @Description: 属性 labelGroups 的get方法 
	 * @return labelGroups
	 */
	public String getLabelGroups() {
		return labelGroups;
	}

	/**
	 * @Description: 属性 labelGroups 的set方法 
	 * @param labelGroups 
	 */
	public void setLabelGroups(String labelGroups) {
		this.labelGroups = labelGroups;
	}

	/**
	 * @Description: 属性 snapshot 的get方法 
	 * @return snapshot
	 */
	public String getSnapshot() {
		return snapshot;
	}

	/**
	 * @Description: 属性 snapshot 的set方法 
	 * @param snapshot 
	 */
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	/**
	 * @Description: 属性 createId 的get方法 
	 * @return createId
	 */
	public Long getCreateId() {
		return createId;
	}

	/**
	 * @Description: 属性 createId 的set方法 
	 * @param createId 
	 */
	public void setCreateId(Long createId) {
		this.createId = createId;
	}

	/**
	 * @Description: 属性 createTime 的get方法 
	 * @return createTime
	 */
	public java.util.Date getCreateTime() {
		return createTime;
	}

	/**
	 * @Description: 属性 createTime 的set方法 
	 * @param createTime 
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @Description: 属性 createName 的get方法 
	 * @return createName
	 */
	public String getCreateName() {
		return createName;
	}

	/**
	 * @Description: 属性 createName 的set方法 
	 * @param createName 
	 */
	public void setCreateName(String createName) {
		this.createName = createName;
	}

	/**
	 * @Description: 属性 updateId 的get方法 
	 * @return updateId
	 */
	public Long getUpdateId() {
		return updateId;
	}

	/**
	 * @Description: 属性 updateId 的set方法 
	 * @param updateId 
	 */
	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}

	/**
	 * @Description: 属性 updateName 的get方法 
	 * @return updateName
	 */
	public String getUpdateName() {
		return updateName;
	}

	/**
	 * @Description: 属性 updateName 的set方法 
	 * @param updateName 
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	/**
	 * @Description: 属性 updateTime 的get方法 
	 * @return updateTime
	 */
	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @Description: 属性 updateTime 的set方法 
	 * @param updateTime 
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @Description: 属性 browseCount 的get方法 
	 * @return browseCount
	 */
	public Integer getBrowseCount() {
		return browseCount;
	}

	/**
	 * @Description: 属性 browseCount 的set方法 
	 * @param browseCount 
	 */
	public void setBrowseCount(Integer browseCount) {
		this.browseCount = browseCount;
	}

	/**
	 * @Description: 属性 postCount 的get方法 
	 * @return postCount
	 */
	public Integer getPostCount() {
		return postCount;
	}

	/**
	 * @Description: 属性 postCount 的set方法 
	 * @param postCount 
	 */
	public void setPostCount(Integer postCount) {
		this.postCount = postCount;
	}

	/**
	 * @Description: 属性 likeCount 的get方法 
	 * @return likeCount
	 */
	public Integer getLikeCount() {
		return likeCount;
	}

	/**
	 * @Description: 属性 likeCount 的set方法 
	 * @param likeCount 
	 */
	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}

	/**
	 * @Description: 属性 dislikeCount 的get方法 
	 * @return dislikeCount
	 */
	public Integer getDislikeCount() {
		return dislikeCount;
	}

	/**
	 * @Description: 属性 dislikeCount 的set方法 
	 * @param dislikeCount 
	 */
	public void setDislikeCount(Integer dislikeCount) {
		this.dislikeCount = dislikeCount;
	}

	/**
	 * @Description: 属性 commentsCount 的get方法 
	 * @return commentsCount
	 */
	public Integer getCommentsCount() {
		return commentsCount;
	}

	/**
	 * @Description: 属性 commentsCount 的set方法 
	 * @param commentsCount 
	 */
	public void setCommentsCount(Integer commentsCount) {
		this.commentsCount = commentsCount;
	}

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
	 * @Description: 属性 headPortraitId 的get方法 
	 * @return headPortraitId
	 */
	public Long getHeadPortraitId() {
		return headPortraitId;
	}

	/**
	 * @Description: 属性 headPortraitId 的set方法 
	 * @param headPortraitId 
	 */
	public void setHeadPortraitId(Long headPortraitId) {
		this.headPortraitId = headPortraitId;
	}

	/**
	 * @Description: 属性 userName 的get方法 
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @Description: 属性 userName 的set方法 
	 * @param userName 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @Description: 属性 orgName 的get方法 
	 * @return orgName
	 */
	public String getOrgName() {
		return orgName;
	}

	/**
	 * @Description: 属性 orgName 的set方法 
	 * @param orgName 
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/**
	 * @Description: 属性 location 的get方法 
	 * @return location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @Description: 属性 location 的set方法 
	 * @param location 
	 */
	public void setLocation(String location) {
		this.location = location;
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
	
	/*================toString=================*/
	/**
	* <p>Description: MomentsDTO自动生成的toString方法</p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:05:30 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "MomentsDTO [id=" + id + ", content=" + content + ", status="
				+ status + ", type=" + type + ", labelGroups=" + labelGroups
				+ ", snapshot=" + snapshot + ", createId=" + createId
				+ ", createTime=" + createTime + ", createName=" + createName
				+ ", updateId=" + updateId + ", updateName=" + updateName
				+ ", updateTime=" + updateTime + ", browseCount=" + browseCount
				+ ", postCount=" + postCount + ", likeCount=" + likeCount
				+ ", dislikeCount=" + dislikeCount + ", commentsCount="
				+ commentsCount + ", location=" + location
				+ ", createTimeShow=" + createTimeShow + ", operatorId="
				+ operatorId + ", headPortraitId=" + headPortraitId
				+ ", userName=" + userName + ", orgName=" + orgName + "]";
	}
}
