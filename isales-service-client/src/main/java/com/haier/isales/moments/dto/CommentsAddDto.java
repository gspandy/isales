/**
* @Company 青鸟软通   
* @Title: CommentsAddDto.java 
* @Package com.haier.isales.moments.dto 
* @author Liu  Wenjie   
* @date 2014-11-22 下午2:28:57 
* @version V1.0   
*/ 
package com.haier.isales.moments.dto;

import java.io.Serializable;
import java.util.List;

import com.haier.isales.system.dto.UserDTO;

/** 
 * @ClassName: CommentsAddDto 
 * @Description: 增加一条评论时保存的Comments参数
 *  
 */
public class CommentsAddDto implements Serializable{
	/** 
	* @Fields serialVersionUID : 版本号
	*/ 
	private static final long serialVersionUID = -7525561699032257212L;

	/** 
	* @Fields replyTo : 针对的回复id信息
	*/ 
	private Long replyParentId;
	
	/** 
	* @Fields replyMomentsId : 评论针对的原文id
	*/ 
	private Long replyTargetId;
	
	/** 
	* @Fields content : 回复的内容
	*/ 
	private String content;
	
	/** 
	* @Fields location : 用户的所在位置
	*/ 
	private String location;
	
	/** 
	* @Fields currentUser : 当前用户
	*/ 
	private UserDTO currentUser;
	
	/** 
	* @Fields userLabelGroups : 当前用户的LabelGroups参数
	*/ 
	private List<String> userLabelGroups;
	
	
	/*=================getter and setter ================*/

	/**
	 * @Description: 属性 replyParentId 的get方法 
	 * @return replyParentId
	 */
	public Long getReplyParentId() {
		return replyParentId;
	}

	/**
	 * @Description: 属性 replyParentId 的set方法 
	 * @param replyParentId 
	 */
	public void setReplyParentId(Long replyParentId) {
		this.replyParentId = replyParentId;
	}

	/**
	 * @Description: 属性 replyTargetId 的get方法 
	 * @return replyTargetId
	 */
	public Long getReplyTargetId() {
		return replyTargetId;
	}

	/**
	 * @Description: 属性 replyTargetId 的set方法 
	 * @param replyTargetId 
	 */
	public void setReplyTargetId(Long replyTargetId) {
		this.replyTargetId = replyTargetId;
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
	 * @Description: 属性 currentUser 的get方法 
	 * @return currentUser
	 */
	public UserDTO getCurrentUser() {
		return currentUser;
	}

	/**
	 * @Description: 属性 currentUser 的set方法 
	 * @param currentUser 
	 */
	public void setCurrentUser(UserDTO currentUser) {
		this.currentUser = currentUser;
	}

	/**
	 * @Description: 属性 userLabelGroups 的get方法 
	 * @return userLabelGroups
	 */
	public List<String> getUserLabelGroups() {
		return userLabelGroups;
	}

	/**
	 * @Description: 属性 userLabelGroups 的set方法 
	 * @param userLabelGroups 
	 */
	public void setUserLabelGroups(List<String> userLabelGroups) {
		this.userLabelGroups = userLabelGroups;
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
	
	/*=================toString=================*/
	/**
	* <p>Description:CommentsAddDto自动生成的toString方法 </p> 
	* @author Guo  Yuchao   
	* @date 2015-1-7 下午7:14:46 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "CommentsAddDto [replyParentId=" + replyParentId
				+ ", replyTargetId=" + replyTargetId + ", content=" + content
				+ ", location=" + location + ", currentUser=" + currentUser
				+ ", userLabelGroups=" + userLabelGroups + "]";
	}
}
