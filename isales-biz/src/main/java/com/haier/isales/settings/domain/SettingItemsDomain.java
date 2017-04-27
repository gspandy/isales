package com.haier.isales.settings.domain;

import java.io.Serializable;
import java.util.Date;

public class SettingItemsDomain implements Serializable{

	private static final long serialVersionUID = 8256712336767738142L;
	
	/** 
	* @Fields id : 主键
	*/ 
	private Long id;
	/** 
	* @Fields itemCode : 设置项编码
	*/ 
	private String itemCode;
	/** 
	* @Fields itemName : 设置项名称
	*/ 
	private String itemName;
	/** 
	* @Fields itemDesc : 设置项描述
	*/ 
	private String itemDesc;
	/** 
	* @Fields itemStatus : 状态，判断是否显示
	*/ 
	private String itemStatus;
	/** 
	* @Fields itemSort : 显示顺序
	*/ 
	private String itemSort;
	/** 
	* @Fields itemLevel : 层级
	*/ 
	private String itemLevel;
	/** 
	* @Fields isLeaf : 是否叶子节点
	*/ 
	private String isLeaf;
	/** 
	* @Fields parentId : 父节点id
	*/ 
	private Long parentId;
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
	
	//=================getters&setters=================
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
	 * 属性 itemCode 的get方法 
	 * @return itemCode
	 */
	public String getItemCode() {
		return itemCode;
	}
	/**
	 * 属性 itemCode 的set方法 
	 * @param itemCode 
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
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
	 * 属性 itemDesc 的get方法 
	 * @return itemDesc
	 */
	public String getItemDesc() {
		return itemDesc;
	}
	/**
	 * 属性 itemDesc 的set方法 
	 * @param itemDesc 
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	/**
	 * 属性 itemStatus 的get方法 
	 * @return itemStatus
	 */
	public String getItemStatus() {
		return itemStatus;
	}
	/**
	 * 属性 itemStatus 的set方法 
	 * @param itemStatus 
	 */
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	/**
	 * 属性 itemSort 的get方法 
	 * @return itemSort
	 */
	public String getItemSort() {
		return itemSort;
	}
	/**
	 * 属性 itemSort 的set方法 
	 * @param itemSort 
	 */
	public void setItemSort(String itemSort) {
		this.itemSort = itemSort;
	}
	/**
	 * 属性 itemLevel 的get方法 
	 * @return itemLevel
	 */
	public String getItemLevel() {
		return itemLevel;
	}
	/**
	 * 属性 itemLevel 的set方法 
	 * @param itemLevel 
	 */
	public void setItemLevel(String itemLevel) {
		this.itemLevel = itemLevel;
	}
	/**
	 * 属性 isLeaf 的get方法 
	 * @return isLeaf
	 */
	public String getIsLeaf() {
		return isLeaf;
	}
	/**
	 * 属性 isLeaf 的set方法 
	 * @param isLeaf 
	 */
	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}
	/**
	 * 属性 parentId 的get方法 
	 * @return parentId
	 */
	public Long getParentId() {
		return parentId;
	}
	/**
	 * 属性 parentId 的set方法 
	 * @param parentId 
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
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
	//=====================toString=========================
	/**
	* <p>Description: </p> 
	* @author Shao Jingkai   
	* @date 2015-6-9 上午11:25:45 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "SettingItemsDomain [id=" + id + ", itemCode=" + itemCode
				+ ", itemName=" + itemName + ", itemDesc=" + itemDesc
				+ ", itemStatus=" + itemStatus + ", itemSort=" + itemSort
				+ ", itemLevel=" + itemLevel + ", isLeaf=" + isLeaf
				+ ", parentId=" + parentId + ", updateTime=" + updateTime
				+ ", createTime=" + createTime + ", remark=" + remark + "]";
	}
	
}
