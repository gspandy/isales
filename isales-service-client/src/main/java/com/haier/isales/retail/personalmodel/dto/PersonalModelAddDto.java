/**
* @Company 青鸟软通   
* @Title: PersonalModelAddDto.java 
* @Package com.haier.isales.retail.personalmodel 
* @author Cao Rui   
* @date 2014-12-3 上午11:02:31 
* @version V1.0   
*/ 
package com.haier.isales.retail.personalmodel.dto;

import java.io.Serializable;

/** 
 * @ClassName: PersonalModelAddDto 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class PersonalModelAddDto implements Serializable{

	private static final long serialVersionUID = -1417575363197L;

	/** 
	* @Fields modelCode : 产品型号编码
	*/
	private String modelCode;
	/** 
	* @Fields operatorId : 用户id
	*/
	private Long operatorId;
	
	/*=========================getter and setter ===================*/
	/**
	 * @Description: 属性 modelCode 的get方法 
	 * @return modelCode
	 */
	public String getModelCode() {
		return modelCode;
	}
	/**
	 * @Description: 属性 modelCode 的set方法 
	 * @param modelCode 
	 */
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	/**
	 * @Description: 属性 operatorId 的get方法 
	 * @return operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}
	/**
	 * @Description: 属性 operatorId 的set方法 
	 * @param operatorId 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	
	/*===================toString==================*/
	/**
	* <p>Description: PersonalModelAddDto自动生成的toString方法</p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:09:28 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "PersonalModelAddDto [modelCode=" + modelCode + ", operatorId="
				+ operatorId + "]";
	}
}
