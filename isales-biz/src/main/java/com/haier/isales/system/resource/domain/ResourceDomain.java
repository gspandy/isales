/**
* @Company 青鸟软通   
* @Title: ResourceDomain.java 
* @Package com.haier.isales.system.resource.domain 
* @author Liu Wenjie   
* @date 2014年11月12日  22:16:36 
* @version V1.0   
*/ 
package com.haier.isales.system.resource.domain;

import java.io.Serializable;

/** 
 * @ClassName: ResourceDomain 
 * t_qn_resource 自动生成的对应的实体对象   
 *  
 */
public class ResourceDomain implements Serializable{
	private static final long serialVersionUID = -1415801796843L;

	private String functionUrl;		//地址

	private String unitCode;		//url所属功能集合的编号

	private String functionName;		//简要描述此url的功能

	private String isCheck;		//是否需要权限验证(Y,N)

	private String functionType;		//类型：暂定为 1.action 2. jsp
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * 属性 functionUrl 的get方法 
	 * @return id
	 */
	public String getFunctionUrl() {
		return this.functionUrl;
	}
	/**
	 * 属性 functionUrl 的set方法 
	 * @param id 
	 */
	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
	}
	/**
	 * 属性 unitCode 的get方法 
	 * @return id
	 */
	public String getUnitCode() {
		return this.unitCode;
	}
	/**
	 * 属性 unitCode 的set方法 
	 * @param id 
	 */
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	/**
	 * 属性 functionName 的get方法 
	 * @return id
	 */
	public String getFunctionName() {
		return this.functionName;
	}
	/**
	 * 属性 functionName 的set方法 
	 * @param id 
	 */
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	/**
	 * 属性 isCheck 的get方法 
	 * @return id
	 */
	public String getIsCheck() {
		return this.isCheck;
	}
	/**
	 * 属性 isCheck 的set方法 
	 * @param id 
	 */
	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}
	/**
	 * 属性 functionType 的get方法 
	 * @return id
	 */
	public String getFunctionType() {
		return this.functionType;
	}
	/**
	 * 属性 functionType 的set方法 
	 * @param id 
	 */
	public void setFunctionType(String functionType) {
		this.functionType = functionType;
	}
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: ResourceDomain 自动生成的hashcode方法</p> 
	* @author Liu Wenjie   
	* @date 2014年11月12日  22:16:36
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((functionUrl == null) ? 0 : functionUrl.hashCode());
		return result;
	}
	/**
	* <p>Description:ResourceDomain 自动生成的equals方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月12日  22:16:36
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
		ResourceDomain other =(ResourceDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (functionUrl == null) {if (other.functionUrl != null){ return false;} else if (!functionUrl.equals(other.functionUrl)){ return false;}}
		*/
		if (functionUrl == null) {
			if (other.functionUrl != null){ 
				return false;
			}
		}else if (!functionUrl.equals(other.functionUrl)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:ResourceDomain 自动生成的toString方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月12日  22:16:36 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ResourceDomain [" +
					"functionUrl=" + functionUrl + "," + 
					"unitCode=" + unitCode + "," + 
					"functionName=" + functionName + "," + 
					"isCheck=" + isCheck + "," + 
					"functionType=" + functionType + "," + 
				"]";
	}
	
	
}
