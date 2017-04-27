package com.haier.isales.settings.domain;

import java.io.Serializable;

public class UserSettingItemsDomain implements Serializable{

	private static final long serialVersionUID = 7882487826640354959L;
	
	private Long operatorId;
	private String itemName;
	private Long valueId;
	private String valueName;
	//============getters&setters==============
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
	 * 属性 itemName 的get方法 
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 属性 itemName 的set方法 
	 * @param itemName 
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
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
}
