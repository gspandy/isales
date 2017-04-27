/**
* @Company 青鸟软通   
* @Title: PrototypeDomain.java 
* @Package com.haier.isales.prototype.domain 
* @author John.zhao   
* @date 2015年01月04日  10:31:07 
* @version V1.0   
*/ 
package com.haier.isales.prototype.domain;

import java.io.Serializable;

/** 
 * @ClassName: PrototypeDomain 
 * t_isales_prototype 自动生成的对应的实体对象   
 *  
 */
public class PrototypeDomain implements Serializable{
	private static final long serialVersionUID = -1420338666964L;

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
	private java.util.Date outDate;
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
	
	/**
	 * 是否在柜
	 */
	private String yjstate;
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 属性 stationName 的get方法 
	 * @return id
	 */
	public String getStationName() {
		return this.stationName;
	}
	/**
	 * 属性 stationName 的set方法 
	 * @param id 
	 */
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	/**
	 * 属性 productSortNo 的get方法 
	 * @return id
	 */
	public String getProductSortNo() {
		return this.productSortNo;
	}
	/**
	 * 属性 productSortNo 的set方法 
	 * @param id 
	 */
	public void setProductSortNo(String productSortNo) {
		this.productSortNo = productSortNo;
	}
	/**
	 * 属性 productLine 的get方法 
	 * @return id
	 */
	public String getProductLine() {
		return this.productLine;
	}
	/**
	 * 属性 productLine 的set方法 
	 * @param id 
	 */
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}
	/**
	 * 属性 productLineName 的get方法 
	 * @return id
	 */
	public String getProductLineName() {
		return this.productLineName;
	}
	/**
	 * 属性 productLineName 的set方法 
	 * @param id 
	 */
	public void setProductLineName(String productLineName) {
		this.productLineName = productLineName;
	}
	/**
	 * 属性 shopId 的get方法 
	 * @return id
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * 属性 shopId 的set方法 
	 * @param id 
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	/**
	 * 属性 tradeOrgCode 的get方法 
	 * @return id
	 */
	public String getTradeOrgCode() {
		return this.tradeOrgCode;
	}
	/**
	 * 属性 tradeOrgCode 的set方法 
	 * @param id 
	 */
	public void setTradeOrgCode(String tradeOrgCode) {
		this.tradeOrgCode = tradeOrgCode;
	}
	/**
	 * 属性 barcode 的get方法 
	 * @return id
	 */
	public String getBarcode() {
		return this.barcode;
	}
	/**
	 * 属性 barcode 的set方法 
	 * @param id 
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	/**
	 * 属性 productModelCode 的get方法 
	 * @return id
	 */
	public String getProductModelCode() {
		return this.productModelCode;
	}
	/**
	 * 属性 productModelCode 的set方法 
	 * @param id 
	 */
	public void setProductModelCode(String productModelCode) {
		this.productModelCode = productModelCode;
	}
	/**
	 * 属性 productModelName 的get方法 
	 * @return id
	 */
	public String getProductModelName() {
		return this.productModelName;
	}
	/**
	 * 属性 productModelName 的set方法 
	 * @param id 
	 */
	public void setProductModelName(String productModelName) {
		this.productModelName = productModelName;
	}
	/**
	 * 属性 price 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getPrice() {
		return this.price;
	}
	/**
	 * 属性 price 的set方法 
	 * @param id 
	 */
	public void setPrice(java.math.BigDecimal price) {
		this.price = price;
	}
	/**
	 * 属性 discountScale 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getDiscountScale() {
		return this.discountScale;
	}
	/**
	 * 属性 discountScale 的set方法 
	 * @param id 
	 */
	public void setDiscountScale(java.math.BigDecimal discountScale) {
		this.discountScale = discountScale;
	}
	/**
	 * 属性 outDate 的get方法 
	 * @return id
	 */
	public java.util.Date getOutDate() {
		return this.outDate;
	}
	/**
	 * 属性 outDate 的set方法 
	 * @param id 
	 */
	public void setOutDate(java.util.Date outDate) {
		this.outDate = outDate;
	}
	/**
	 * 属性 status 的get方法 
	 * @return id
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * 属性 status 的set方法 
	 * @param id 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 属性 imgId 的get方法 
	 * @return id
	 */
	public Long getImgId() {
		return this.imgId;
	}
	/**
	 * 属性 imgId 的set方法 
	 * @param id 
	 */
	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}
	/**
	 * 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getYjstate() {
		return yjstate;
	}
	public void setYjstate(String yjstate) {
		this.yjstate = yjstate;
	}
/*====================hashCode and equals ====================*/
/**
	* <p>Description: PrototypeDomain 自动生成的hashcode方法</p> 
	* @author John.zhao   
	* @date 2015年01月04日  10:31:07
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((id == null) ? 0 : id.hashCode());
		return result;
	}
	/**
	* <p>Description:PrototypeDomain 自动生成的equals方法 </p> 
	* @author John.zhao   
	* @date 2015年01月04日  10:31:07
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PrototypeDomain other =(PrototypeDomain) obj;

		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (id == null) {if (other.id != null){ return false;} else if (!id.equals(other.id)){ return false;}}
		*/
		if (id == null) {
			if (other.id != null){ 
				return false;
			}
		}else if (!id.equals(other.id)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:PrototypeDomain 自动生成的toString方法 </p> 
	* @author John.zhao   
	* @date 2015年01月04日  10:31:07 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "PrototypeDomain [" +
					"id=" + id + "," + 
					"stationName=" + stationName + "," + 
					"productSortNo=" + productSortNo + "," + 
					"productLine=" + productLine + "," + 
					"productLineName=" + productLineName + "," + 
					"shopId=" + shopId + "," + 
					"tradeOrgCode=" + tradeOrgCode + "," + 
					"barcode=" + barcode + "," + 
					"productModelCode=" + productModelCode + "," + 
					"productModelName=" + productModelName + "," + 
					"price=" + price + "," + 
					"discountScale=" + discountScale + "," + 
					"outDate=" + outDate + "," + 
					"status=" + status + "," + 
					"imgId=" + imgId + "," + 
					"remark=" + remark + "," + 
					"yjstate=" + yjstate+"]";
	}
	
	
}
