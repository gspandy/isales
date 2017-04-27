package com.haier.isales.settings.domain;

import java.io.Serializable;
import java.util.Date;

public class SettingItemsValueUserDomain implements Serializable{

	private static final long serialVersionUID = -2608581377214832986L;
	
	/** 
	* @Fields itemId : 设置项id
	*/ 
	private Long itemId;
	/** 
	* @Fields operatorId : 用户id
	*/ 
	private Long operatorId;
	/** 
	* @Fields valueId : 设置项 的值id
	*/ 
	private Long valueId;
	/** 
	* @Fields valueCode : 设置项的值编码
	*/ 
	private String valueCode;
	/** 
	* @Fields updateTime : 修改时间
	*/ 
	private Date updateTime;
	/** 
	* @Fields createTime : 创建时间
	*/ 
	private Date createTime;
	/** 
	* @Fields remark : 备注
	*/ 
	private String remark;
	
	//============getters&setters==============
	/**
	 * 属性 itemId 的get方法 
	 * @return itemId
	 */
	public Long getItemId() {
		return itemId;
	}
	/**
	 * 属性 itemId 的set方法 
	 * @param itemId 
	 */
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	/**
	 * 属性 operatorId 的get方法 
	 * @return operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}
	/**
	 * 属性 operatorId 的set方法 
	 * @param operatorId 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * 属性 valueId 的get方法 
	 * @return valueId
	 */
	public Long getValueId() {
		return valueId;
	}
	/**
	 * 属性 valueId 的set方法 
	 * @param valueId 
	 */
	public void setValueId(Long valueId) {
		this.valueId = valueId;
	}
	/**
	 * 属性 valueCode 的get方法 
	 * @return valueCode
	 */
	public String getValueCode() {
		return valueCode;
	}
	/**
	 * 属性 valueCode 的set方法 
	 * @param valueCode 
	 */
	public void setValueCode(String valueCode) {
		this.valueCode = valueCode;
	}
	/**
	 * 属性 updateTime 的get方法 
	 * @return updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 属性 updateTime 的set方法 
	 * @param updateTime 
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 属性 createTime 的get方法 
	 * @return createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 属性 createTime 的set方法 
	 * @param createTime 
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 属性 remark 的get方法 
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 属性 remark 的set方法 
	 * @param remark 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	//=============toString================
	/**
	* <p>Description: </p> 
	* @author Shao Jingkai   
	* @date 2015-6-9 上午11:41:21 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "SettingItemsValueUserDomain [itemId=" + itemId
				+ ", operatorId=" + operatorId + ", valueId=" + valueId
				+ ", valueCode=" + valueCode + ", updateTime=" + updateTime
				+ ", createTime=" + createTime + ", remark=" + remark + "]";
	}
}
