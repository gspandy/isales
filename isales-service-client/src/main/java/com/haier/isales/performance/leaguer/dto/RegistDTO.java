/**
* @Company 青鸟软通   
* @Title: RegistDTO.java 
* @Package com.haier.isales.performance.leaguer 
* @author Guo Yuchao   
* @date 2014-12-18 下午1:33:41 
* @version V1.0   
*/ 
package com.haier.isales.performance.leaguer.dto;

import java.io.Serializable;

/** 
 * @ClassName: RegistDTO 
 * @Description:查询注册率信息
 *  
 */
public class RegistDTO implements Serializable {

	/** 
	* @Fields serialVersionUID :
	*/ 
	private static final long serialVersionUID = 149826888022083866L;
	/** 
	* @Fields month : 月份
	*/
	private String month;
	/** 
	* @Fields shopId : 门店
	*/
	private String shopId;
	/** 
	* @Fields shopName : 门店名称
	*/
	private String shopName;
	/** 
	* @Fields productLineId : 产品线
	*/
	private String productLineId;
	/** 
	* @Fields productLineName : 旧产品线名称
	*/
	private String productLineName;
	/** 
	* @Fields counts : 销量（已验证）
	*/
	private String counts;
	/** 
	* @Fields registQty : 注册量
	*/
	private String registQty;
	/** 
	* @Fields registRate : 注册率
	*/
	private String registRate;
	
	private String isAscend;//与上月相比是否上升了
	
	private String beforeMonth;//12月前的月份
	
	
	
	
	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-12-18 下午1:56:05  
	*/ 
	public RegistDTO() {
		super();
		
	}
	public RegistDTO(String counts,String registQty,String registRate,String isAscend) {
		super();
		this.counts = counts;
		this.registQty = registQty;
		this.registRate = registRate;
		this.isAscend = isAscend;
	}
	/**
	 * @Description: 属性 month 的get方法 
	 * @return month
	 */
	public String getMonth() {
		return month;
	}
	/**
	 * @Description: 属性 month 的set方法 
	 * @param month 
	 */
	public void setMonth(String month) {
		this.month = month;
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
	 * @Description: 属性 shopName 的get方法 
	 * @return shopName
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * @Description: 属性 shopName 的set方法 
	 * @param shopName 
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * @Description: 属性 productLineId 的get方法 
	 * @return productLineId
	 */
	public String getProductLineId() {
		return productLineId;
	}
	/**
	 * @Description: 属性 productLineId 的set方法 
	 * @param productLineId 
	 */
	public void setProductLineId(String productLineId) {
		this.productLineId = productLineId;
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
	 * @Description: 属性 counts 的get方法 
	 * @return counts
	 */
	public String getCounts() {
		return counts;
	}
	/**
	 * @Description: 属性 counts 的set方法 
	 * @param counts 
	 */
	public void setCounts(String counts) {
		this.counts = counts;
	}
	/**
	 * @Description: 属性 registQty 的get方法 
	 * @return registQty
	 */
	public String getRegistQty() {
		return registQty;
	}
	/**
	 * @Description: 属性 registQty 的set方法 
	 * @param registQty 
	 */
	public void setRegistQty(String registQty) {
		this.registQty = registQty;
	}
	/**
	 * @Description: 属性 registRate 的get方法 
	 * @return registRate
	 */
	public String getRegistRate() {
		return registRate;
	}
	/**
	 * @Description: 属性 registRate 的set方法 
	 * @param registRate 
	 */
	public void setRegistRate(String registRate) {
		this.registRate = registRate;
	}

	/**
	 * @Description: 属性 isAscend 的get方法 
	 * @return isAscend
	 */
	public String getIsAscend() {
		return isAscend;
	}
	/**
	 * @Description: 属性 isAscend 的set方法 
	 * @param isAscend 
	 */
	public void setIsAscend(String isAscend) {
		this.isAscend = isAscend;
	}
	/**
	 * @Description: 属性 beforeMonth 的get方法 
	 * @return beforeMonth
	 */
	public String getBeforeMonth() {
		return beforeMonth;
	}
	/**
	 * @Description: 属性 beforeMonth 的set方法 
	 * @param beforeMonth 
	 */
	public void setBeforeMonth(String beforeMonth) {
		this.beforeMonth = beforeMonth;
	}
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:06:53 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "RegistDTO [month=" + month + ", shopId=" + shopId
				+ ", shopName=" + shopName + ", productLineId=" + productLineId
				+ ", productLineName=" + productLineName + ", counts=" + counts
				+ ", registQty=" + registQty + ", registRate=" + registRate
				+ ", isAscend=" + isAscend + ", beforeMonth=" + beforeMonth
				+ "]";
	}
	
}
