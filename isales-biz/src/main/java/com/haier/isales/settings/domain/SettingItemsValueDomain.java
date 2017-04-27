package com.haier.isales.settings.domain;

import java.io.Serializable;
import java.util.Date;

public class SettingItemsValueDomain implements Serializable{


	private static final long serialVersionUID = 8158213989730499271L;
	
	/** 
	* @Fields id : 主键
	*/ 
	private Long id;
	/** 
	* @Fields itemId : 设置项id
	*/ 
	private String itemId;
	/** 
	* @Fields valueCode : 值编码
	*/ 
	private String valueCode;
	/** 
	* @Fields valueName : 设置项名称
	*/ 
	private String valueName;
	/** 
	* @Fields valueDesc : 设置项描述
	*/ 
	private String valueDesc;
	/** 
	* @Fields valueStatus : 状态，根据状态排毒按是否显示
	*/ 
	private String valueStatus;
	/** 
	* @Fields valueSort : 显示顺序
	*/ 
	private String valueSort;
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
	
	//==============getters&setters==================
	/**
	 * 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 属性 itemId 的get方法 
	 * @return itemId
	 */
	public String getItemId() {
		return itemId;
	}
	/**
	 * 属性 itemId 的set方法 
	 * @param itemId 
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
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
	 * 属性 valueName 的get方法 
	 * @return valueName
	 */
	public String getValueName() {
		return valueName;
	}
	/**
	 * 属性 valueName 的set方法 
	 * @param valueName 
	 */
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}
	/**
	 * 属性 valueDesc 的get方法 
	 * @return valueDesc
	 */
	public String getValueDesc() {
		return valueDesc;
	}
	/**
	 * 属性 valueDesc 的set方法 
	 * @param valueDesc 
	 */
	public void setValueDesc(String valueDesc) {
		this.valueDesc = valueDesc;
	}
	/**
	 * 属性 valueStatus 的get方法 
	 * @return valueStatus
	 */
	public String getValueStatus() {
		return valueStatus;
	}
	/**
	 * 属性 valueStatus 的set方法 
	 * @param valueStatus 
	 */
	public void setValueStatus(String valueStatus) {
		this.valueStatus = valueStatus;
	}
	/**
	 * 属性 valueSort 的get方法 
	 * @return valueSort
	 */
	public String getValueSort() {
		return valueSort;
	}
	/**
	 * 属性 valueSort 的set方法 
	 * @param valueSort 
	 */
	public void setValueSort(String valueSort) {
		this.valueSort = valueSort;
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
	
	//===============toString================
	/**
	* <p>Description: </p> 
	* @author Shao Jingkai   
	* @date 2015-6-9 上午11:34:30 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "SettingItemsValue [id=" + id + ", itemId=" + itemId
				+ ", valueCode=" + valueCode + ", valueName=" + valueName
				+ ", valueDesc=" + valueDesc + ", valueStatus=" + valueStatus
				+ ", valueSort=" + valueSort + ", updateTime=" + updateTime
				+ ", createTime=" + createTime + ", remark=" + remark + "]";
	}
}
