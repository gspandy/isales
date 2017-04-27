/**
 * @Company 青鸟软通   
 * @Title: ResourceDTO.java 
 * @Package com.haier.isales.system.dto 
 * @author Liu Wenjie   
 * @date 2014-11-13 上午10:49:24 
 * @version V1.0   
 */
package com.haier.isales.system.dto;

import java.io.Serializable;

/**
 * @ClassName: ResourceDTO
 * @Description: 资源的DTO对象
 * 
 */
public class ResourceDTO implements Serializable {

	/**
	 * @Fields serialVersionUID :
	 */
	private static final long serialVersionUID = 2646478171405839503L;
	/**
	 * @Fields functionUrl : 访问url的核心，不包括前缀和后缀
	 */
	private String functionUrl;
	/**
	 * @Fields unitCode : url所属功能集合的编号
	 */
	private String unitCode;
	/**
	 * @Fields functionName : 简要描述此url的功能
	 */
	private String functionName;
	/**
	 * @Fields isCheck : 是否需要权限验证(Y,N)
	 */
	private String isCheck;
	/**
	 * @Fields functionType : 类型：暂定为 1.action 2. jsp
	 */
	private String functionType;

	/* =========================getter and setter =================== */

	/**
	 * @Description: 属性 functionUrl 的get方法
	 * @return id
	 */
	public String getFunctionUrl() {
		return this.functionUrl;
	}

	/**
	 * @Description: 属性 functionUrl 的set方法
	 * @param id
	 */
	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
	}

	/**
	 * @Description: 属性 unitCode 的get方法
	 * @return id
	 */
	public String getUnitCode() {
		return this.unitCode;
	}

	/**
	 * @Description: 属性 unitCode 的set方法
	 * @param id
	 */
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	/**
	 * @Description: 属性 functionName 的get方法
	 * @return id
	 */
	public String getFunctionName() {
		return this.functionName;
	}

	/**
	 * @Description: 属性 functionName 的set方法
	 * @param id
	 */
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	/**
	 * @Description: 属性 isCheck 的get方法
	 * @return id
	 */
	public String getIsCheck() {
		return this.isCheck;
	}

	/**
	 * @Description: 属性 isCheck 的set方法
	 * @param id
	 */
	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}

	/**
	 * @Description: 属性 functionType 的get方法
	 * @return id
	 */
	public String getFunctionType() {
		return this.functionType;
	}

	/**
	 * @Description: 属性 functionType 的set方法
	 * @param id
	 */
	public void setFunctionType(String functionType) {
		this.functionType = functionType;
	}

	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午6:56:47 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ResourceDTO [functionUrl=" + functionUrl + ", unitCode="
				+ unitCode + ", functionName=" + functionName + ", isCheck="
				+ isCheck + ", functionType=" + functionType + "]";
	}

	

}
