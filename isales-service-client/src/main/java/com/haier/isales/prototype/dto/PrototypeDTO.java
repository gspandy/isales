/**
* @Company 青鸟软通   
* @Title: PrototypeDTO.java 
* @Package com.haier.isales.prototype.domain 
* @author Guo Yuchao   
* @date 2014年12月25日  14:01:04 
* @version V1.0   
*/ 
package com.haier.isales.prototype.dto;

import java.io.Serializable;

/** 
 * @ClassName: PrototypeDTO 
 * @Description: t_isales_prototype 自动生成的对应的实体对象   
 *  
 */
public class PrototypeDTO implements Serializable{
	private static final long serialVersionUID = -1419487264049L;

	/** 
	* @Fields id : 主键
	*/
	private Long id;
	/** 
	* @Fields stationName : 经营体名称
	*/
	private String stationName;
	/** 
	* @Fields productSortNo : 产品类
	*/
	private String productSortNo;
	/** 
	* @Fields productLine : 产品线
	*/
	private String productLine;
	/** 
	* @Fields productLineName : 产品线名称
	*/
	private String productLineName;
	/** 
	* @Fields shopId : 门店信息
	*/
	private String shopId;
	/** 
	* @Fields tradeOrgCode : 工贸
	*/
	private String tradeOrgCode;
	/** 
	* @Fields barcode : 条码
	*/
	private String barcode;
	/** 
	* @Fields productModelCode : 型号编码
	*/
	private String productModelCode;
	/** 
	* @Fields productModelName : 型号名称
	*/
	private String productModelName;
	/** 
	* @Fields price : 标准供价
	*/
	private java.math.BigDecimal price;
	/** 
	* @Fields discountScale : 折扣
	*/
	private java.math.BigDecimal discountScale;
	/** 
	* @Fields outDate : 出样日期
	*/
	private String sampleOutDate;
	/** 
	* @Fields status : 状态
	*/
	private String status;
	/** 
	* @Fields imgId : 样机图片
	*/
	private Long imgId;
	/** 
	* @Fields remark : 备注,本系统中添加的字段，预留以存储一些信息。在同步数据时对方数据库中没有对应的字段
	*/
	private String remark;
	private java.math.BigDecimal salePrice;//核销价格
	private String userCode;//员工号 样机核销接口使用
	private String isDownReason;//出（上）样下市必填		出样的已下市样机必须写原因
	private String shareImages;//样机分享时展示的图片 存在attachment中  多个用","分隔
	
	private String yjstate;
	
	/*=========================getter and setter ===================*/
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
	 * @Description: 属性 stationName 的get方法 
	 * @return stationName
	 */
	public String getStationName() {
		return stationName;
	}


	/**
	 * @Description: 属性 stationName 的set方法 
	 * @param stationName 
	 */
	public void setStationName(String stationName) {
		this.stationName = stationName;
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
	 * @Description: 属性 productLine 的get方法 
	 * @return productLine
	 */
	public String getProductLine() {
		return productLine;
	}


	/**
	 * @Description: 属性 productLine 的set方法 
	 * @param productLine 
	 */
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}


	/**
	 * @Description: 属性 productLineName 的get方法 
	 * @return productLineName
	 */
	public String getProductLineName() {
		return productLineName;
	}


	/**
	 * @Description: 属性 productLineName 的set方法 
	 * @param productLineName 
	 */
	public void setProductLineName(String productLineName) {
		this.productLineName = productLineName;
	}


	/**
	 * @Description: 属性 shopId 的get方法 
	 * @return shopId
	 */
	public String getShopId() {
		return shopId;
	}


	/**
	 * @Description: 属性 shopId 的set方法 
	 * @param shopId 
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}


	/**
	 * @Description: 属性 tradeOrgCode 的get方法 
	 * @return tradeOrgCode
	 */
	public String getTradeOrgCode() {
		return tradeOrgCode;
	}


	/**
	 * @Description: 属性 tradeOrgCode 的set方法 
	 * @param tradeOrgCode 
	 */
	public void setTradeOrgCode(String tradeOrgCode) {
		this.tradeOrgCode = tradeOrgCode;
	}


	/**
	 * @Description: 属性 barcode 的get方法 
	 * @return barcode
	 */
	public String getBarcode() {
		return barcode;
	}


	/**
	 * @Description: 属性 barcode 的set方法 
	 * @param barcode 
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}


	/**
	 * @Description: 属性 productModelCode 的get方法 
	 * @return productModelCode
	 */
	public String getProductModelCode() {
		return productModelCode;
	}


	/**
	 * @Description: 属性 productModelCode 的set方法 
	 * @param productModelCode 
	 */
	public void setProductModelCode(String productModelCode) {
		this.productModelCode = productModelCode;
	}


	/**
	 * @Description: 属性 productModelName 的get方法 
	 * @return productModelName
	 */
	public String getProductModelName() {
		return productModelName;
	}


	/**
	 * @Description: 属性 productModelName 的set方法 
	 * @param productModelName 
	 */
	public void setProductModelName(String productModelName) {
		this.productModelName = productModelName;
	}


	/**
	 * @Description: 属性 price 的get方法 
	 * @return price
	 */
	public java.math.BigDecimal getPrice() {
		return price;
	}


	/**
	 * @Description: 属性 price 的set方法 
	 * @param price 
	 */
	public void setPrice(java.math.BigDecimal price) {
		this.price = price;
	}


	/**
	 * @Description: 属性 discountScale 的get方法 
	 * @return discountScale
	 */
	public java.math.BigDecimal getDiscountScale() {
		return discountScale;
	}


	/**
	 * @Description: 属性 discountScale 的set方法 
	 * @param discountScale 
	 */
	public void setDiscountScale(java.math.BigDecimal discountScale) {
		this.discountScale = discountScale;
	}





	/**
	 * @Description: 属性 sampleOutDate 的get方法 
	 * @return sampleOutDate
	 */
	public String getSampleOutDate() {
		return sampleOutDate;
	}


	/**
	 * @Description: 属性 sampleOutDate 的set方法 
	 * @param sampleOutDate 
	 */
	public void setSampleOutDate(String sampleOutDate) {
		this.sampleOutDate = sampleOutDate;
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
	 * @Description: 属性 imgId 的get方法 
	 * @return imgId
	 */
	public Long getImgId() {
		return imgId;
	}


	/**
	 * @Description: 属性 imgId 的set方法 
	 * @param imgId 
	 */
	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}


	/**
	 * @Description: 属性 remark 的get方法 
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}


	/**
	 * @Description: 属性 remark 的set方法 
	 * @param remark 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @Description: 属性 salePrice 的get方法 
	 * @return salePrice
	 */
	public java.math.BigDecimal getSalePrice() {
		return salePrice;
	}
	/**
	 * @Description: 属性 salePrice 的set方法 
	 * @param salePrice 
	 */
	public void setSalePrice(java.math.BigDecimal salePrice) {
		this.salePrice = salePrice;
	}
	/**
	 * @Description: 属性 userCode 的get方法 
	 * @return userCode
	 */
	public String getUserCode() {
		return userCode;
	}
	/**
	 * @Description: 属性 userCode 的set方法 
	 * @param userCode 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
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


	public String getShareImages() {
		return shareImages;
	}


	public void setShareImages(String shareImages) {
		this.shareImages = shareImages;
	}
	

	/*==================== toString() ====================*/

	public String getYjstate() {
		return yjstate;
	}


	public void setYjstate(String yjstate) {
		this.yjstate = yjstate;
	}


	@Override
	public String toString() {
		return "PrototypeDTO [id=" + id + ", stationName=" + stationName
				+ ", productSortNo=" + productSortNo + ", productLine="
				+ productLine + ", productLineName=" + productLineName
				+ ", shopId=" + shopId + ", tradeOrgCode=" + tradeOrgCode
				+ ", barcode=" + barcode + ", productModelCode="
				+ productModelCode + ", productModelName=" + productModelName
				+ ", price=" + price + ", discountScale=" + discountScale
				+ ", sampleOutDate=" + sampleOutDate + ", status=" + status
				+ ", imgId=" + imgId + ", remark=" + remark + ", salePrice="
				+ salePrice + ", userCode=" + userCode + ", isDownReason="
				+ isDownReason + ", shareImages=" + shareImages + ",yjstate="+yjstate+"]";
	}




	
}
