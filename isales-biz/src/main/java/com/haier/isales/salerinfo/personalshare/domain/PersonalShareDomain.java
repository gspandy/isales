/**
* @Company 青鸟软通   
* @Title: PersonalShareDomain.java 
* @Package com.haier.isales.salerInfo.personalShare.domain 
* @author Guo Yuchao   
* @date 2014年11月17日  16:15:36 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalshare.domain;

import java.io.Serializable;

/** 
 * @ClassName: PersonalShareDomain 
 * t_isales_personal_share 自动生成的对应的实体对象   
 *  
 */
public class PersonalShareDomain implements Serializable{
	private static final long serialVersionUID = -1416212136293L;
	public static final String SHARE_TYPE_TO_NONE = "101";//未分享 
	public static final String SHARE_TYPE_TO_EVERYONE = "102";//已分享
	public static final String SHARE_TYPE_TO_MYFRIEND = "103";
	public static final String SAVE_TYPE_TODO = "101";//备忘
	public static final String SAVE_TYPE_EXPERIENCE = "102";//经验
	
	/** 
	* @Fields id : id
	*/
	private Long id;
	/** 
	* @Fields title : 标题
	*/
	private String title;
	/** 
	* @Fields content : 内容
	*/
	private String content;
	/** 
	* @Fields userId : 用户id
	*/
	private Long userId;
	/** 
	* @Fields loginName : 用户登录名
	*/
	private String loginName;
	/** 
	* @Fields userCode : 用户员工号
	*/
	private String userCode;
	/** 
	* @Fields updateTime : 修改时间
	*/
	private java.util.Date updateTime;
	/** 
	* @Fields createTime : 添加时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields needRemind : 是否需要提醒
	*/
	private String needRemind;
	/** 
	* @Fields remindTime : 提醒时间
	*/
	private java.util.Date remindTime;
	/** 
	* @Fields status : 状态
	*/
	private String status;
	/** 
	* @Fields type : 类型,备忘101，经验102
	*/
	private String type;
	/** 
	* @Fields shareType : 分享类型
	*/
	private String shareType;
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
	 * 属性 userId 的get方法 
	 * @return id
	 */
	public Long getUserId() {
		return this.userId;
	}
	/**
	 * 属性 userId 的set方法 
	 * @param id 
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 属性 loginName 的get方法 
	 * @return id
	 */
	public String getLoginName() {
		return this.loginName;
	}
	/**
	 * 属性 loginName 的set方法 
	 * @param id 
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/**
	 * 属性 userCode 的get方法 
	 * @return id
	 */
	public String getUserCode() {
		return this.userCode;
	}
	/**
	 * 属性 userCode 的set方法 
	 * @param id 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
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
	 * 属性 needRemind 的get方法 
	 * @return id
	 */
	public String getNeedRemind() {
		return this.needRemind;
	}
	/**
	 * 属性 needRemind 的set方法 
	 * @param id 
	 */
	public void setNeedRemind(String needRemind) {
		this.needRemind = needRemind;
	}
	/**
	 * 属性 remindTime 的get方法 
	 * @return id
	 */
	public java.util.Date getRemindTime() {
		return this.remindTime;
	}
	/**
	 * 属性 remindTime 的set方法 
	 * @param id 
	 */
	public void setRemindTime(java.util.Date remindTime) {
		this.remindTime = remindTime;
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
	 * 属性 shareType 的get方法 
	 * @return id
	 */
	public String getShareType() {
		return this.shareType;
	}
	/**
	 * 属性 shareType 的set方法 
	 * @param id 
	 */
	public void setShareType(String shareType) {
		this.shareType = shareType;
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
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: PersonalShareDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2014年11月17日  16:15:36
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
	* <p>Description:PersonalShareDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月17日  16:15:36
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
		PersonalShareDomain other =(PersonalShareDomain) obj;
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
	* <p>Description:PersonalShareDomain 自动生成的toString方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月17日  16:15:36 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "PersonalShareDomain [" +
					"id=" + id + "," + 
					"title=" + title + "," + 
					"content=" + content + "," + 
					"userId=" + userId + "," + 
					"loginName=" + loginName + "," + 
					"userCode=" + userCode + "," + 
					"updateTime=" + updateTime + "," + 
					"createTime=" + createTime + "," + 
					"needRemind=" + needRemind + "," + 
					"remindTime=" + remindTime + "," + 
					"status=" + status + "," + 
					"type=" + type + "," + 
					"shareType=" + shareType + "," + 
					"browseCount=" + browseCount + "," + 
					"postCount=" + postCount + "," + 
					"likeCount=" + likeCount + "," + 
					"dislikeCount=" + dislikeCount + "," + 
				"]";
	}
	
	
}
