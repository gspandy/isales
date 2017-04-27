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
import java.util.List;

/** 
 * @ClassName: MomentsDTO 
 * @Description: 
 *  
 */
public class MomentsQueryDTO implements Serializable{
	private static final long serialVersionUID = -1416471950233L;

	/** 
	* @Fields id : 
	*/
	private Long id;	
	/** 
	* @Fields status : 状态
	*/
	private String status;
	/** 
	* @Fields type : 类型
	*/
	private String type;
	/** 
	* @Fields labelGroups : 查询时选择的圈子，
	*/
	private List<String> selectLabelGroups;
	/** 
	* @Fields createId : 添加人id
	*/
	private Long createId;
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
	* @Fields currentUserId : 查询条件：当前登录用户。而不是本内容的作者
	*/ 
	private Long currentUserId;
	/** 
	* @Fields currentUserLabelGroups : 
	*/ 
	private List<String> currentUserLabelGroups;
	/** 
	* @Fields labelGroups : 
	*/ 
	private String labelGroups;
	/** 
	 * @Fields tableNameSuffix : 表名后缀,朋友圈分表存储历史信息以增加查询效率
	 * 目前业务为近一个月内的数据存储到t_isales_moments表;
	 * 一个月以上六个月以内迁移到t_isales_moments1表;六个月以上迁移到t_isales_moments2表
	 * 后期可能会拆分出多于三个表,但是也会按照时间的方式,命名为表1、表2、表3、表4 这样的形式
	 * 所以为了使dao的查询方法通用，将表名后缀作为参数传入mapper文件。
	*/ 
	private String tableNameSuffix;	
	
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
	 * @Description: 属性 selectLabelGroups 的get方法 
	 * @return selectLabelGroups
	 */
	public List<String> getSelectLabelGroups() {
		return selectLabelGroups;
	}

	/**
	 * @Description: 属性 selectLabelGroups 的set方法 
	 * @param selectLabelGroups 
	 */
	public void setSelectLabelGroups(List<String> selectLabelGroups) {
		this.selectLabelGroups = selectLabelGroups;
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
	
	/*===============toString==================*/
	/**
	* <p>Description: MomentsQueryDTO自动生成的toString方法</p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:06:00 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "MomentsQueryDTO [id=" + id + ", status=" + status + ", type="
				+ type + ", selectLabelGroups=" + selectLabelGroups
				+ ", createId=" + createId + ", createName=" + createName
				+ ", updateId=" + updateId + ", updateName=" + updateName
				+ ", currentUserId=" + currentUserId
				+ ", currentUserLabelGroups=" + currentUserLabelGroups
				+ ", labelGroups=" + labelGroups + ", tableNameSuffix="
				+ tableNameSuffix + "]";
	}
}
