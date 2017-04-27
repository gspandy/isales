/**
* @Company 青鸟软通   
* @Title: CommentsQueryDTO.java 
* @Package com.haier.isales.moments.dto 
* @author Cao  Rui   
* @date 2014-11-22 下午7:49:25 
* @version V1.0   
*/ 
package com.haier.isales.moments.dto;

import java.io.Serializable;
import java.util.List;

/** 
 * @ClassName: CommentsQueryDTO 
 * @Description: 
 *  
 */
public class CommentsQueryDTO implements Serializable{
	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = -7525561699032257159L;
	/** 
	* @Fields id : 唯一标识
	*/
	private Long id;

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
	* @Fields createId : 添加人id
	*/
	private Long createId;
	
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
	* @Fields currentUserId : 查询条件：当前登录用户。而不是本内容的作者		
	*/ 
	private Long currentUserId;

	/** 
	 * @Fields tableNameSuffix : 表名后缀,朋友圈分表存储历史信息以增加查询效率
	 * 目前业务为近一个月内的数据存储到t_isales_comments表;
	 * 一个月以上六个月以内迁移到t_isales_comments1表;六个月以上迁移到t_isales_comments2表
	 * 后期可能会拆分出多于三个表,但是也会按照时间的方式,命名为表1、表2、表3、表4 这样的形式
	 * 所以为了使dao的查询方法通用，将表名后缀作为参数传入mapper文件。
	*/ 
	private String tableNameSuffix;	
	
	/** 
	* @Fields currentUserLabelGroups : 用户当前所在的圈子
	*/ 
	private List<String> currentUserLabelGroups;	
		
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
	 * @Description: 属性 sourceId 的get方法 
	 * @return sourceId
	 */
	public Long getSourceId() {
		return sourceId;
	}
	/**
	 * @Description: 属性 sourceId 的set方法 
	 * @param sourceId 
	 */
	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}
	/**
	 * @Description: 属性 sourceUserid 的get方法 
	 * @return sourceUserid
	 */
	public Long getSourceUserid() {
		return sourceUserid;
	}
	/**
	 * @Description: 属性 sourceUserid 的set方法 
	 * @param sourceUserid 
	 */
	public void setSourceUserid(Long sourceUserid) {
		this.sourceUserid = sourceUserid;
	}
	/**
	 * @Description: 属性 sourceUsername 的get方法 
	 * @return sourceUsername
	 */
	public String getSourceUsername() {
		return sourceUsername;
	}
	/**
	 * @Description: 属性 sourceUsername 的set方法 
	 * @param sourceUsername 
	 */
	public void setSourceUsername(String sourceUsername) {
		this.sourceUsername = sourceUsername;
	}
	/**
	 * @Description: 属性 sourceUsercode 的get方法 
	 * @return sourceUsercode
	 */
	public String getSourceUsercode() {
		return sourceUsercode;
	}
	/**
	 * @Description: 属性 sourceUsercode 的set方法 
	 * @param sourceUsercode 
	 */
	public void setSourceUsercode(String sourceUsercode) {
		this.sourceUsercode = sourceUsercode;
	}
	/**
	 * @Description: 属性 parentId 的get方法 
	 * @return parentId
	 */
	public Long getParentId() {
		return parentId;
	}
	/**
	 * @Description: 属性 parentId 的set方法 
	 * @param parentId 
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
	 * @Description: 属性 parentUserid 的get方法 
	 * @return parentUserid
	 */
	public Long getParentUserid() {
		return parentUserid;
	}
	/**
	 * @Description: 属性 parentUserid 的set方法 
	 * @param parentUserid 
	 */
	public void setParentUserid(Long parentUserid) {
		this.parentUserid = parentUserid;
	}
	/**
	 * @Description: 属性 parentUsername 的get方法 
	 * @return parentUsername
	 */
	public String getParentUsername() {
		return parentUsername;
	}
	/**
	 * @Description: 属性 parentUsername 的set方法 
	 * @param parentUsername 
	 */
	public void setParentUsername(String parentUsername) {
		this.parentUsername = parentUsername;
	}
	/**
	 * @Description: 属性 parentUsercode 的get方法 
	 * @return parentUsercode
	 */
	public String getParentUsercode() {
		return parentUsercode;
	}
	/**
	 * @Description: 属性 parentUsercode 的set方法 
	 * @param parentUsercode 
	 */
	public void setParentUsercode(String parentUsercode) {
		this.parentUsercode = parentUsercode;
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
	 * @Description: 属性 currentUserId 的get方法 
	 * @return currentUserId
	 */
	public Long getCurrentUserId() {
		return currentUserId;
	}
	/**
	 * @Description: 属性 currentUserId 的set方法 
	 * @param currentUserId 
	 */
	public void setCurrentUserId(Long currentUserId) {
		this.currentUserId = currentUserId;
	}
	/**
	 * @Description: 属性 tableNameSuffix 的get方法 
	 * @return tableNameSuffix
	 */
	public String getTableNameSuffix() {
		return tableNameSuffix;
	}
	/**
	 * @Description: 属性 tableNameSuffix 的set方法 
	 * @param tableNameSuffix 
	 */
	public void setTableNameSuffix(String tableNameSuffix) {
		this.tableNameSuffix = tableNameSuffix;
	}
	/**
	 * @Description: 属性 currentUserLabelGroups 的get方法 
	 * @return currentUserLabelGroups
	 */
	public List<String> getCurrentUserLabelGroups() {
		return currentUserLabelGroups;
	}
	/**
	 * @Description: 属性 currentUserLabelGroups 的set方法 
	 * @param currentUserLabelGroups 
	 */
	public void setCurrentUserLabelGroups(List<String> currentUserLabelGroups) {
		this.currentUserLabelGroups = currentUserLabelGroups;
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
	
	/*=================toString=================*/
	/**
	* <p>Description:CommentsQueryDTO 自动生成的toString方法</p> 
	* @author Guo  Yuchao   
	* @date 2015-1-7 下午7:15:10 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "CommentsQueryDTO [id=" + id + ", sourceId=" + sourceId
				+ ", sourceUserid=" + sourceUserid + ", sourceUsername="
				+ sourceUsername + ", sourceUsercode=" + sourceUsercode
				+ ", parentId=" + parentId + ", parentUserid=" + parentUserid
				+ ", parentUsername=" + parentUsername + ", parentUsercode="
				+ parentUsercode + ", status=" + status + ", createId="
				+ createId + ", labelGroups=" + labelGroups + ", type=" + type
				+ ", currentUserId=" + currentUserId + ", tableNameSuffix="
				+ tableNameSuffix + ", currentUserLabelGroups="
				+ currentUserLabelGroups + "]";
	}	
	
	
}
