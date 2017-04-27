/**
* @Company 青鸟软通   
* @Title: LabelDomain.java 
* @Package com.haier.isales.system.label.domain 
* @author Guo Yuchao   
* @date 2014年11月11日  15:35:06 
* @version V1.0   
*/ 
package com.haier.isales.system.dto;

import java.io.Serializable;

/** 
 * @ClassName: LabelDomain 
 * @Description: t_qn_label 自动生成的对应的实体对象   
 *  
 */
public class LabelDTO implements Serializable{
	private static final long serialVersionUID = -1415691306242L;

	/** 
	* @Fields labelId : 标签id
	*/
	private Long labelId;
	/** 
	 * @Fields labelCode : 标签编号
	 */
	private String labelCode;
	/** 
	* @Fields labelName : 标签名称
	*/
	private String labelName;
	/** 
	* @Fields parentOrg : 父级组织的编号
	*/
	private String parentOrg;
	/** 
	* @Fields labelLevel : 组织所处的层级
	*/
	private String labelLevel;
	/** 
	* @Fields labelSeq : 组织的序列，是orgcode的顺序组合，用_分割
	*/
	private String labelSeq;
	/** 
	* @Fields labelStatus : 标签状态,101：有效，102：无效。 默认为101，
	*/
	private String labelStatus;
	/** 
	* @Fields updateId : 修改人id
	*/
	private Long updateId;
	/** 
	* @Fields updateName : 修改人姓名
	*/
	private String updateName;
	/** 
	* @Fields updateTime : 修改时间
	*/
	private java.util.Date updateTime;
	/** 
	* @Fields createId : 添加人id
	*/
	private Long createId;
	/** 
	* @Fields createName : 添加人姓名
	*/
	private String createName;
	/** 
	* @Fields createTime : 添加时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields labelIds : 根据多个Id查询标签 多个用","分隔
	*/ 
	private String labelIds;
	
	/*=========================getter and setter ===================*/
	/**
	 * @Description: 属性 labelId 的get方法 
	 * @return id
	 */
	public Long getLabelId() {
		return this.labelId;
	}
	/**
	 * @Description: 属性 labelId 的set方法 
	 * @param id 
	 */
	public void setLabelId(Long labelId) {
		this.labelId = labelId;
	}
	/**
	 * @Description: 属性 labelName 的get方法 
	 * @return id
	 */
	public String getLabelName() {
		return this.labelName;
	}
	/**
	 * @Description: 属性 labelName 的set方法 
	 * @param id 
	 */
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}
	/**
	 * @Description: 属性 parentOrg 的get方法 
	 * @return id
	 */
	public String getParentOrg() {
		return this.parentOrg;
	}
	/**
	 * @Description: 属性 parentOrg 的set方法 
	 * @param id 
	 */
	public void setParentOrg(String parentOrg) {
		this.parentOrg = parentOrg;
	}
	/**
	 * @Description: 属性 labelLevel 的get方法 
	 * @return id
	 */
	public String getLabelLevel() {
		return this.labelLevel;
	}
	/**
	 * @Description: 属性 labelLevel 的set方法 
	 * @param id 
	 */
	public void setLabelLevel(String labelLevel) {
		this.labelLevel = labelLevel;
	}
	/**
	 * @Description: 属性 labelSeq 的get方法 
	 * @return id
	 */
	public String getLabelSeq() {
		return this.labelSeq;
	}
	/**
	 * @Description: 属性 labelSeq 的set方法 
	 * @param id 
	 */
	public void setLabelSeq(String labelSeq) {
		this.labelSeq = labelSeq;
	}
	/**
	 * @Description: 属性 labelStatus 的get方法 
	 * @return id
	 */
	public String getLabelStatus() {
		return this.labelStatus;
	}
	/**
	 * @Description: 属性 labelStatus 的set方法 
	 * @param id 
	 */
	public void setLabelStatus(String labelStatus) {
		this.labelStatus = labelStatus;
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
	 * @Description: 属性 labelIds 的get方法 
	 * @return labelIds
	 */
	public String getLabelIds() {
		return labelIds;
	}
	/**
	 * @Description: 属性 labelIds 的set方法 
	 * @param labelIds 
	 */
	public void setLabelIds(String labelIds) {
		this.labelIds = labelIds;
	}
/**
	 * @Description: 属性 labelCode 的get方法 
	 * @return labelCode
	 */
	public String getLabelCode() {
		return labelCode;
	}
	/**
	 * @Description: 属性 labelCode 的set方法 
	 * @param labelCode 
	 */
	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}
	
    /*====================toString ====================*/
	/**
	* <p>Description:LabelDTO自动生成的toString方法 </p> 
	* @author Cao Rui
	* @date 2015-1-7 下午6:58:29 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "LabelDTO [labelId=" + labelId + ", labelCode=" + labelCode
				+ ", labelName=" + labelName + ", parentOrg=" + parentOrg
				+ ", labelLevel=" + labelLevel + ", labelSeq=" + labelSeq
				+ ", labelStatus=" + labelStatus + ", updateId=" + updateId
				+ ", updateName=" + updateName + ", updateTime=" + updateTime
				+ ", createId=" + createId + ", createName=" + createName
				+ ", createTime=" + createTime + ", labelIds=" + labelIds + "]";
	}
}
