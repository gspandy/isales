package com.haier.isales.quartz.yangji.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author wangp
 *
 */

public class YangjiDomain implements Serializable{

	/**
	 *  样机实体类
	 */
	private static final long serialVersionUID = -3493168797006228723L;
	
	
	private Long id;
	private String key;//样机标识
	private String storeCode;//门店编码：获取当前直销员的门店名称
	private String storeName;//门店名称：获取当前直销员的门店信息
	private String modelCode;//型号编码：获取当前的型号信息
	private String industryCode;//产业编码：获取当前的产业信息
	private String industryName;//产业名称：获取当前的产业名称
	private String operStatus;//状态【qianshou:签收;shangyang:上样】
	private Date operDate;//物流签收时间
	private String yangjiType;//样机类型
	private String barNum;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getStoreCode() {
		return storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public String getIndustryCode() {
		return industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}
	public String getIndustryName() {
		return industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	public String getOperStatus() {
		return operStatus;
	}
	public void setOperStatus(String operStatus) {
		this.operStatus = operStatus;
	}
	public Date getOperDate() {
		return operDate;
	}
	public void setOperDate(Date operDate) {
		this.operDate = operDate;
	}
	public String getYangjiType() {
		return yangjiType;
	}
	public void setYangjiType(String yangjiType) {
		this.yangjiType = yangjiType;
	}
	public String getBarNum() {
		return barNum;
	}
	public void setBarNum(String barNum) {
		this.barNum = barNum;
	}
	@Override
	public String toString() {
		return "YangjiDomain [id=" + id + ", key=" + key + ", storeCode=" + storeCode + ", storeName=" + storeName
				+ ", modelCode=" + modelCode + ", industryCode=" + industryCode + ", industryName=" + industryName
				+ ", operStatus=" + operStatus + ", operDate=" + operDate + ", yangjiType=" + yangjiType + ", barNum="
				+ barNum + "]";
	}
	

}
