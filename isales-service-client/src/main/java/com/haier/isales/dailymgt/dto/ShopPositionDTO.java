/**
* @Company 青鸟软通   
* @Title: ShopPositionDTO.java 
* @Package com.haier.isales.dailymgt.dto 
* @author John zhao   
* @date 2015-3-2 下午2:38:54 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.dto;

import java.io.Serializable;

/** 
 * @ClassName: ShopPositionDTO 
 * @Description: 
 *  
 */
public class ShopPositionDTO implements Serializable {

	/** 
	* @Fields serialVersionUID : 版本号
	*/ 
	private static final long serialVersionUID = -293490630994176604L;

	/** 
	* @Fields inShop : 是否在门店中
	*/ 
	private boolean inShop;
	/** 
	* @Fields distance : 距离
	*/ 
	private double distance;
	
	//==================getters & setters========================
	/**
	 * @Description: 属性 inShop 的get方法 
	 * @return inShop
	 */
	public boolean isInShop() {
		return inShop;
	}

	/**
	 * @Description: 属性 inShop 的set方法 
	 * @param inShop 
	 */
	public void setInShop(boolean inShop) {
		this.inShop = inShop;
	}

	/**
	 * @Description: 属性 distance 的get方法 
	 * @return distance
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * @Description: 属性 distance 的set方法 
	 * @param distance 
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	//==================toString===================
	/**
	* <p>Description: ShopPositionDTO自动生成的toString方法</p> 
	* @author John zhao   
	* @date 2015-3-5 下午12:26:52 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ShopPositionDTO [inShop=" + inShop + ", distance=" + distance
				+ "]";
	}
}
