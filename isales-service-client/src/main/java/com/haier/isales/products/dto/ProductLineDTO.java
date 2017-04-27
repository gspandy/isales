/**
* @Company 青鸟软通   
* @Title: ProductLineDTO.java 
* @Package com.haier.isales.products.dto 
* @author John.zhao   
* @date 2015-1-30 上午10:02:30 
* @version V1.0   
*/ 
package com.haier.isales.products.dto;

import java.io.Serializable;

/** 
 * @ClassName: ProductLineDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductLineDTO implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -528611604020892540L;

	/** 
	* @Fields proLineCode : 产业编码
	*/
	private String proLineCode;
	/** 
	* @Fields proLineName : 产业名
	*/
	private String proLineName;
	
	/*======================getters & setters======================*/
	/**
	 * @Description: 属性 proLineCode 的get方法 
	 * @return proLineCode
	 */
	public String getProLineCode() {
		return proLineCode;
	}
	/**
	 * @Description: 属性 proLineCode 的set方法 
	 * @param proLineCode 
	 */
	public void setProLineCode(String proLineCode) {
		this.proLineCode = proLineCode;
	}
	/**
	 * @Description: 属性 proLineName 的get方法 
	 * @return proLineName
	 */
	public String getProLineName() {
		return proLineName;
	}
	/**
	 * @Description: 属性 proLineName 的set方法 
	 * @param proLineName 
	 */
	public void setProLineName(String proLineName) {
		this.proLineName = proLineName;
	}
	
	/*===========================toString===========================*/
	/**
	* <p>Description: ProductLineDTO自动生成的toString方法</p> 
	* @author John zhao   
	* @date 2015-1-30 上午10:13:12 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductLineDTO [proLineCode=" + proLineCode + ", proLineName=" + proLineName + "]";
	}
	
	/*==========================hashCode & equals==========================*/
	/**
	* <p>Description: ProductLineDTO自动生成的hashCode方法</p> 
	* @author John zhao   
	* @date 2015-1-30 上午10:13:20 
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((proLineCode == null) ? 0 : proLineCode.hashCode());
		result = prime * result + ((proLineName == null) ? 0 : proLineName.hashCode());
		return result;
	}
	/**
	* <p>Description:ProductLineDTO自动生成的equals方法 </p> 
	* @author John zhao   
	* @date 2015-1-30 上午10:13:20 
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
		ProductLineDTO other = (ProductLineDTO) obj;
		if (proLineCode == null) {
			if (other.proLineCode != null){
				return false;
			}
		} else if (!proLineCode.equals(other.proLineCode)){
			return false;
		}
		if (proLineName == null) {
			if (other.proLineName != null){
				return false;
			}
		} else if (!proLineName.equals(other.proLineName)){
			return false;
		}
		return true;
	}
	
}
