/**
* @Company 青鸟软通   
* @Title: PersonalShareDomain.java 
* @Package com.haier.isales.salerInfo.personalShare.domain 
* @author Guo Yuchao   
* @date 2014年11月14日  14:18:26 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalshare.dto;

import java.io.Serializable;

/** 
 * @ClassName: PersonalShareDomain 
 * @Description: isales_personal_share 自动生成的对应的实体对象   
 *  
 */
public class PersonalShareDTO implements Serializable{
	private static final long serialVersionUID = -1415945906288L;
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
	 * @Description: 属性 userId 的get方法 
	 * @return id
	 */
	public Long getUserId() {
		return this.userId;
	}
	/**
	 * @Description: 属性 userId 的set方法 
	 * @param id 
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @Description: 属性 loginName 的get方法 
	 * @return id
	 */
	public String getLoginName() {
		return this.loginName;
	}
	/**
	 * @Description: 属性 loginName 的set方法 
	 * @param id 
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/**
	 * @Description: 属性 userCode 的get方法 
	 * @return id
	 */
	public String getUserCode() {
		return this.userCode;
	}
	/**
	 * @Description: 属性 userCode 的set方法 
	 * @param id 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
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
	 * @Description: 属性 needRemind 的get方法 
	 * @return id
	 */
	public String getNeedRemind() {
		return this.needRemind;
	}
	/**
	 * @Description: 属性 needRemind 的set方法 
	 * @param id 
	 */
	public void setNeedRemind(String needRemind) {
		this.needRemind = needRemind;
	}
	/**
	 * @Description: 属性 remindTime 的get方法 
	 * @return id
	 */
	public java.util.Date getRemindTime() {
		return this.remindTime;
	}
	/**
	 * @Description: 属性 remindTime 的set方法 
	 * @param id 
	 */
	public void setRemindTime(java.util.Date remindTime) {
		this.remindTime = remindTime;
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
	 * @Description: 属性 shareType 的get方法 
	 * @return id
	 */
	public String getShareType() {
		return this.shareType;
	}
	/**
	 * @Description: 属性 shareType 的set方法 
	 * @param id 
	 */
	public void setShareType(String shareType) {
		this.shareType = shareType;
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
/*====================hashCode and equals ====================*/
/**
	* <p>Description: PersonalShareDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2014年11月14日  14:18:26
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
	* @date 2014年11月14日  14:18:26
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
		PersonalShareDTO other =(PersonalShareDTO) obj;
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
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:11:44 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "PersonalShareDTO [id=" + id + ", title=" + title + ", content="
				+ content + ", userId=" + userId + ", loginName=" + loginName
				+ ", userCode=" + userCode + ", updateTime=" + updateTime
				+ ", createTime=" + createTime + ", needRemind=" + needRemind
				+ ", remindTime=" + remindTime + ", status=" + status
				+ ", type=" + type + ", shareType=" + shareType
				+ ", browseCount=" + browseCount + ", postCount=" + postCount
				+ ", likeCount=" + likeCount + ", dislikeCount=" + dislikeCount
				+ "]";
	}

		

	
	
}
