/**
* @Company 青鸟软通   
* @Title: WsPrototypeDTO.java 
* @Package com.haier.isales.prototype.dto 
* @author Guo Yuchao   
* @date 2014-12-24 下午4:55:59 
* @version V1.0   
*/ 
package com.haier.isales.prototype.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/** 
 * @ClassName: WsPrototypeDTO 
 * @Description: hmms样机接口封装dto
 *  
 */
public class WsPrototypeDTO implements Serializable{
	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = 3238810949485137630L;
	
	private String tradeOgNo;//			必填		提报样机对应工贸编号(12A01)						
	private String productSortNo;//				必填		提报样机对应产品线编号(AA)						
	private String custNo;//				必填		提报样机对应的门店编号（87,88码）						
	private String barCode;//				必填		提报样机的条码						
	private String createrEid	;//			必填		提报人员工编号						
	private String isDownReason;//				下市必填		下市可出样的样机必须写下市原因
	
	
	private String saleRegionCode;//				必填		销售区域							string
	private String productno;//				必填		样机型号编码							string
	private String productName;//				必填		样机型号名称							string
	private BigDecimal salePrice;//				必填		成交价							BigDecimal
	private String outDate;
	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-12-24 下午4:57:29  
	*/ 
	public WsPrototypeDTO() {
		super();
	}
	/**
	 * @Description: 属性 tradeOgNo 的get方法 
	 * @return tradeOgNo
	 */
	public String getTradeOgNo() {
		return tradeOgNo;
	}
	/**
	 * @Description: 属性 tradeOgNo 的set方法 
	 * @param tradeOgNo 
	 */
	public void setTradeOgNo(String tradeOgNo) {
		this.tradeOgNo = tradeOgNo;
	}
	/**
	 * @Description: 属性 productSortNo 的get方法 
	 * @return productSortNo
	 */
	public String getProductSortNo() {
		return productSortNo;
	}
	/**
	 * @Description: 属性 productSortNo 的set方法 
	 * @param productSortNo 
	 */
	public void setProductSortNo(String productSortNo) {
		this.productSortNo = productSortNo;
	}
	/**
	 * @Description: 属性 custNo 的get方法 
	 * @return custNo
	 */
	public String getCustNo() {
		return custNo;
	}
	/**
	 * @Description: 属性 custNo 的set方法 
	 * @param custNo 
	 */
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	/**
	 * @Description: 属性 barCode 的get方法 
	 * @return barCode
	 */
	public String getBarCode() {
		return barCode;
	}
	/**
	 * @Description: 属性 barCode 的set方法 
	 * @param barCode 
	 */
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	/**
	 * @Description: 属性 createrEid 的get方法 
	 * @return createrEid
	 */
	public String getCreaterEid() {
		return createrEid;
	}
	/**
	 * @Description: 属性 createrEid 的set方法 
	 * @param createrEid 
	 */
	public void setCreaterEid(String createrEid) {
		this.createrEid = createrEid;
	}
	/**
	 * @Description: 属性 isDownReason 的get方法 
	 * @return isDownReason
	 */
	public String getIsDownReason() {
		return isDownReason;
	}
	/**
	 * @Description: 属性 isDownReason 的set方法 
	 * @param isDownReason 
	 */
	public void setIsDownReason(String isDownReason) {
		this.isDownReason = isDownReason;
	}
	/**
	 * @Description: 属性 saleRegionCode 的get方法 
	 * @return saleRegionCode
	 */
	public String getSaleRegionCode() {
		return saleRegionCode;
	}
	/**
	 * @Description: 属性 saleRegionCode 的set方法 
	 * @param saleRegionCode 
	 */
	public void setSaleRegionCode(String saleRegionCode) {
		this.saleRegionCode = saleRegionCode;
	}
	/**
	 * @Description: 属性 productno 的get方法 
	 * @return productno
	 */
	public String getProductno() {
		return productno;
	}
	/**
	 * @Description: 属性 productno 的set方法 
	 * @param productno 
	 */
	public void setProductno(String productno) {
		this.productno = productno;
	}
	/**
	 * @Description: 属性 productName 的get方法 
	 * @return productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @Description: 属性 productName 的set方法 
	 * @param productName 
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @Description: 属性 salePrice 的get方法 
	 * @return salePrice
	 */
	public BigDecimal getSalePrice() {
		return salePrice;
	}
	/**
	 * @Description: 属性 salePrice 的set方法 
	 * @param salePrice 
	 */
	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}
	/**
	 * @Description: 属性 outDate 的get方法 
	 * @return outDate
	 */
	public String getOutDate() {
		return outDate;
	}
	/**
	 * @Description: 属性 outDate 的set方法 
	 * @param outDate 
	 */
	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:09:14 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "WsPrototypeDTO [tradeOgNo=" + tradeOgNo + ", productSortNo="
				+ productSortNo + ", custNo=" + custNo + ", barCode=" + barCode
				+ ", createrEid=" + createrEid + ", isDownReason="
				+ isDownReason + ", saleRegionCode=" + saleRegionCode
				+ ", productno=" + productno + ", productName=" + productName
				+ ", salePrice=" + salePrice + ", outDate=" + outDate + "]";
	}
	
}
