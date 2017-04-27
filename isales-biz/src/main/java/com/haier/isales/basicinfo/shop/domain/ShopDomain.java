/**
* @Company 青鸟软通   
* @Title: ShopDomain.java 
* @Package com.haier.isales.basicinfo.shop.domain 
* @author Guo Yuchao   
* @date 2014年11月21日  16:50:43 
* @version V1.0   
*/ 
package com.haier.isales.basicinfo.shop.domain;

import java.io.Serializable;

/** 
 * @ClassName: ShopDomain 
 * t_isales_shop 自动生成的对应的实体对象   
 *  
 */
public class ShopDomain implements Serializable{
	private static final long serialVersionUID = -1416559843840L;
	public static final String DEL_FLAG_SHOP_CLOSED = "1"; //门店关闭状态（是否关闭）:1.闭店,0.开店.闭店不能录销量但是有直销员
	public static final String DEL_FLAG_SHOP_OPEN = "0"; //门店关闭状态（是否关闭）:1.闭店,0.开店.闭店不能录销量但是有直销员
	public static final String[] POST_CODE_CAN_POST = {"2","3"}; //客户属性，1：客户，3：客户/门店，2或其他：客户    只有2和3可以录销量

	/** 
	* @Fields shopCode : 门店编码
	*/
	private String shopCode;
	/** 
	* @Fields shopName : 门店名称
	*/
	private String shopName;
	/** 
	* @Fields orgCode : 中心编码
	*/
	private String orgCode;
	/** 
	* @Fields orgName : 中心名称
	*/
	private String orgName;
	/** 
	* @Fields delFlag : 门店关闭状态（是否关闭）:1.闭店,0.开店.闭店不能录销量但是有直销员
	*/
	private String delFlag;
	/** 
	* @Fields postCode : 客户属性，1：客户，3：客户/门店，2或其他：客户
            只有2和3可以录销量
	*/
	private String postCode;
	
	// 添加PA_CODE 
	private String paCode;
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * 属性 shopCode 的get方法 
	 * @return id
	 */
	public String getShopCode() {
		return this.shopCode;
	}
	/**
	 * 属性 shopCode 的set方法 
	 * @param id 
	 */
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}
	/**
	 * 属性 shopName 的get方法 
	 * @return id
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * 属性 shopName 的set方法 
	 * @param id 
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * 属性 orgCode 的get方法 
	 * @return id
	 */
	public String getOrgCode() {
		return this.orgCode;
	}
	/**
	 * 属性 orgCode 的set方法 
	 * @param id 
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	/**
	 * 属性 orgName 的get方法 
	 * @return id
	 */
	public String getOrgName() {
		return this.orgName;
	}
	/**
	 * 属性 orgName 的set方法 
	 * @param id 
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	/**
	 * 属性 delFlag 的get方法 
	 * @return id
	 */
	public String getDelFlag() {
		return this.delFlag;
	}
	/**
	 * 属性 delFlag 的set方法 
	 * @param id 
	 */
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	/**
	 * 属性 postCode 的get方法 
	 * @return id
	 */
	public String getPostCode() {
		return this.postCode;
	}
	/**
	 * 属性 postCode 的set方法 
	 * @param id 
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * @return the paCode
	 */
	public String getPaCode() {
		return paCode;
	}
	/**
	 * @param paCode the paCode to set
	 */
	public void setPaCode(String paCode) {
		this.paCode = paCode;
	}
/*====================hashCode and equals ====================*/
/**
	* <p>Description: ShopDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2014年11月21日  16:50:43
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((shopCode == null) ? 0 : shopCode.hashCode());
		return result;
	}
	/**
	* <p>Description:ShopDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月21日  16:50:43
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
		ShopDomain other =(ShopDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (shopCode == null) {if (other.shopCode != null){ return false;} else if (!shopCode.equals(other.shopCode)){ return false;}}
		*/
		if (shopCode == null) {
			if (other.shopCode != null){ 
				return false;
			}
		}else if (!shopCode.equals(other.shopCode)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:ShopDomain 自动生成的toString方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月21日  16:50:43 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ShopDomain [" +
					"shopCode=" + shopCode + "," + 
					"shopName=" + shopName + "," + 
					"orgCode=" + orgCode + "," + 
					"orgName=" + orgName + "," + 
					"delFlag=" + delFlag + "," + 
					"postCode=" + postCode + "," + 
				"]";
	}
	
	
}
