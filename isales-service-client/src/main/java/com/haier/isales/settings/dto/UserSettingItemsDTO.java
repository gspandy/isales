package com.haier.isales.settings.dto;

import java.io.Serializable;

public class UserSettingItemsDTO  implements Serializable{

	private static final long serialVersionUID = -4527123360602951167L;
	private Long operatorId;
	private String itemName;
	private Long valueId;
	private String valueName;
	//============getters&setters==============
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
	 * @Description: 属性 itemName 的get方法 
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @Description: 属性 itemName 的set方法 
	 * @param itemName 
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @Description: 属性 valueId 的get方法 
	 * @return valueId
	 */
	public Long getValueId() {
		return valueId;
	}
	/**
	 * @Description: 属性 valueId 的set方法 
	 * @param valueId 
	 */
	public void setValueId(Long valueId) {
		this.valueId = valueId;
	}
	/**
	 * @Description: 属性 valueName 的get方法 
	 * @return valueName
	 */
	public String getValueName() {
		return valueName;
	}
	/**
	 * @Description: 属性 valueName 的set方法 
	 * @param valueName 
	 */
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}
}
