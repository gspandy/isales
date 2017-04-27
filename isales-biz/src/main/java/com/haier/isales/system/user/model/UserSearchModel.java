/**
* @Company 青鸟软通   
* @Title: UserSearchModel.java 
* @Package com.haier.isales.system.user.model 
* @author Guo Yuchao   
* @date 2014-10-28 上午10:08:18 
* @version V1.0   
*/ 
package com.haier.isales.system.user.model;

import java.io.Serializable;

/** 
 * @ClassName: UserSearchModel 
 * @Description: 用户查询类 
 *  
 */
public class UserSearchModel  implements Serializable{

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = -6820708716611885339L;
	public static final String STRING_ARRAY_SEPARATOR = ",";//字符串中split为数值的分隔符
	private Long operatorId; // BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '用户的唯一标识',
	private String orgCode; // VARCHAR(255) DEFAULT NULL COMMENT '组织编号',
	private String operatorName; //VARCHAR(60) NOT NULL COMMENT '用户昵称',
	private String loginName;
	
	private String orgSeq;//按照组织编号查询用户是使用 GuoYuchao 2014-11-10 15:20:35
	private String orgType;//组织类型 "actual"实体组织，"virtual"虚拟组织
	
	private String includeLabelIds;//根据多个Id查询标签 多个用","分隔 需要的
	private String excludeLabelIds;//根据多个Id查询标签 多个用","分隔  排除的 比如山东省的但是排除青岛的直销员
	private String includeLGroupIds;//按groupId查询时使用，可以传多个，以","分隔  需要的 
	private String excludeLabelGroupIds;//按groupId查询时使用，可以传多个，以","分隔  排除的 比如山东省的但是排除青岛的直销员
	
	
	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-10-28 上午10:09:34  
	*/ 
	public UserSearchModel() {
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
	 * @Description: 属性 orgCode 的get方法 
	 * @return orgCode
	 */
	public String getOrgCode() {
		return orgCode;
	}
	/**
	 * @Description: 属性 orgCode 的set方法 
	 * @param orgCode 
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	/**
	 * @Description: 属性 operatorName 的get方法 
	 * @return operatorName
	 */
	public String getOperatorName() {
		return operatorName;
	}
	/**
	 * @Description: 属性 operatorName 的set方法 
	 * @param operatorName 
	 */
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	/**
	 * @Description: 属性 loginName 的get方法 
	 * @return loginName
	 */
	public String getLoginName() {
		return loginName;
	}
	/**
	 * @Description: 属性 loginName 的set方法 
	 * @param loginName 
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/**
	 * @Description: 属性 orgSeq 的get方法 
	 * @return orgSeq
	 */
	public String getOrgSeq() {
		return orgSeq;
	}
	/**
	 * @Description: 属性 orgSeq 的set方法 
	 * @param orgSeq 
	 */
	public void setOrgSeq(String orgSeq) {
		this.orgSeq = orgSeq;
	}
	/**
	 * @Description: 属性 orgType 的get方法 
	 * @return orgType
	 */
	public String getOrgType() {
		return orgType;
	}
	/**
	 * @Description: 属性 orgType 的set方法 
	 * @param orgType 
	 */
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	/**
	 * @Description: 属性 includeLabelIds 的get方法 
	 * @return includeLabelIds
	 */
	public String getIncludeLabelIds() {
		return includeLabelIds;
	}
	/**
	 * @Description: 属性 includeLabelIds 的set方法 
	 * @param includeLabelIds 
	 */
	public void setIncludeLabelIds(String includeLabelIds) {
		this.includeLabelIds = includeLabelIds;
	}
	/**
	 * @Description: 属性 excludeLabelIds 的get方法 
	 * @return excludeLabelIds
	 */
	public String getExcludeLabelIds() {
		return excludeLabelIds;
	}
	/**
	 * @Description: 属性 excludeLabelIds 的set方法 
	 * @param excludeLabelIds 
	 */
	public void setExcludeLabelIds(String excludeLabelIds) {
		this.excludeLabelIds = excludeLabelIds;
	}
	/**
	 * @Description: 属性 includeLGroupIds 的get方法 
	 * @return includeLGroupIds
	 */
	public String getIncludeLGroupIds() {
		return includeLGroupIds;
	}
	/**
	 * @Description: 属性 includeLGroupIds 的set方法 
	 * @param includeLGroupIds 
	 */
	public void setIncludeLGroupIds(String includeLGroupIds) {
		this.includeLGroupIds = includeLGroupIds;
	}
	/**
	 * @Description: 属性 excludeLabelGroupIds 的get方法 
	 * @return excludeLabelGroupIds
	 */
	public String getExcludeLabelGroupIds() {
		return excludeLabelGroupIds;
	}
	/**
	 * @Description: 属性 excludeLabelGroupIds 的set方法 
	 * @param excludeLabelGroupIds 
	 */
	public void setExcludeLabelGroupIds(String excludeLabelGroupIds) {
		this.excludeLabelGroupIds = excludeLabelGroupIds;
	}
	
	

}
