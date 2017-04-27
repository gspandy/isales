/**
* @Company 青鸟软通   
* @Title: ProductsInfoSearchDTO.java 
* @Package com.haier.isales.products.dto 
* @author John zhao   
* @date 2015-1-28 下午3:43:33 
* @version V1.0   
*/ 
package com.haier.isales.products.dto;

import java.io.Serializable;

/** 
 * @ClassName: ProductsInfoSearchDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsInfoSearchDTO implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -8632705521063011206L;
	/**
	* @Fields modelno : 型号编码/型号名称
	*/
	private String modelNoName;
	/** 
	* @Fields proLineCode : 产业编码
	*/
	private String proLineCode;
	/** 
	* @Fields proLineName : 产业名
	*/
	private String proLineName;
	/** 
	* @Fields salesChannel : 大渠道
	*/
	private String salesChannel;
	
	/*=====================getters & setters=====================*/
	/**
	 * @Description: 属性 modelNoName 的get方法 
	 * @return modelNoName
	 */
	public String getModelNoName() {
		return modelNoName;
	}
	/**
	 * @Description: 属性 modelNoName 的set方法 
	 * @param modelNoName 
	 */
	public void setModelNoName(String modelNoName) {
		this.modelNoName = modelNoName;
	}
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
	/**
	 * @Description: 属性 salesChannel 的get方法 
	 * @return salesChannel
	 */
	public String getSalesChannel() {
		return salesChannel;
	}
	/**
	 * @Description: 属性 salesChannel 的set方法 
	 * @param salesChannel 
	 */
	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}
	
	/*====================toString=====================*/
	/**
	* <p>Description: ProductsInfoSearchDTO自动生成的toString方法</p> 
	* @author John zhao   
	* @date 2015-1-28 下午4:19:50 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductsInfoSearchDTO [modelNoName=" + modelNoName + ", proLineCode=" + proLineCode + ", proLineName="
				+ proLineName + ", salesChannel=" + salesChannel + "]";
	}
	
	/*===================hashCode & equals=====================*/
	/**
	* <p>Description: ProductsInfoSearchDTO自动生成的hashCode方法</p> 
	* @author John zhao   
	* @date 2015-1-28 下午4:20:05 
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modelNoName == null) ? 0 : modelNoName.hashCode());
		result = prime * result + ((proLineCode == null) ? 0 : proLineCode.hashCode());
		result = prime * result + ((proLineName == null) ? 0 : proLineName.hashCode());
		result = prime * result + ((salesChannel == null) ? 0 : salesChannel.hashCode());
		return result;
	}
	/**
	* <p>Description:ProductsInfoSearchDTO自动生成的equals方法 </p> 
	* @author John zhao   
	* @date 2015-1-28 下午4:20:05 
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
		ProductsInfoSearchDTO other = (ProductsInfoSearchDTO) obj;
		if (modelNoName == null) {
			if (other.modelNoName != null){
				return false;
			}
		} else if (!modelNoName.equals(other.modelNoName)){
			return false;
		}
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
		if (salesChannel == null) {
			if (other.salesChannel != null){
				return false;
			}
		} else if (!salesChannel.equals(other.salesChannel)){
			return false;
		}
		return true;
	}
}
