/**
* @Company 青鸟软通   
* @Title: ProductLineDomain.java 
* @Package com.haier.isales.products.productsinfoapp.domain 
* @author John.zhao   
* @date 2015-1-30 上午9:43:07 
* @version V1.0   
*/ 
package com.haier.isales.products.productsinfoapp.domain;

import java.io.Serializable;

/** 
 * @ClassName: ProductLineDomain 
 * TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductLineDomain implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -5864932154239774681L;

	/** 
	* @Fields proLineCode : 产业编码
	*/
	private String proLineCode;
	/** 
	* @Fields proLineName : 产业名
	*/
	private String proLineName;
	/**
	 * 属性 proLineCode 的get方法 
	 * @return proLineCode
	 */
	public String getProLineCode() {
		return proLineCode;
	}
	/**
	 * 属性 proLineCode 的set方法 
	 * @param proLineCode 
	 */
	public void setProLineCode(String proLineCode) {
		this.proLineCode = proLineCode;
	}
	/**
	 * 属性 proLineName 的get方法 
	 * @return proLineName
	 */
	public String getProLineName() {
		return proLineName;
	}
	/**
	 * 属性 proLineName 的set方法 
	 * @param proLineName 
	 */
	public void setProLineName(String proLineName) {
		this.proLineName = proLineName;
	}
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-1-30 上午9:44:46 
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
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-1-30 上午9:44:46 
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
		ProductLineDomain other = (ProductLineDomain) obj;
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
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-1-30 上午9:44:41 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductLineDomain [proLineCode=" + proLineCode + ", proLineName=" + proLineName + "]";
	}
	
}
