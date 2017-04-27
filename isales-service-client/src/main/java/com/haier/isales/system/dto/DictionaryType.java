/**
* @Company 青鸟软通   
* @Title: Dictionary.java 
* @Package com.jbinfo.ecms.sys.entity 
* @author Liu Wenjie   
* @date 2013-11-19 上午10:26:04 
* @version V1.0   
*/ 
package com.haier.isales.system.dto;

import java.io.Serializable;

/** 
 * @ClassName: Dictionary 
 * @Description: 业务字典表对应的实体映射
 *  
 */
public class DictionaryType implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String businTypeId;
	private String businTypeName;
	

    public DictionaryType() {
    }


 


	/**
	 * @Description: 属性 busintypeId 的get方法 
	 * @return busintypeId
	 */
	public String getBusinTypeId() {
		return businTypeId;
	}


	/**
	 * @Description: 属性 busintypeId 的set方法 
	 * @param busintypeId 
	 */
	public void setBusinTypeId(String businTypeId) {
		this.businTypeId = businTypeId;
	}


	/**
	 * @Description: 属性 busintypeName 的get方法 
	 * @return busintypeName
	 */
	public String getBusinTypeName() {
		return businTypeName;
	}


	/**
	 * @Description: 属性 busintypeName 的set方法 
	 * @param busintypeName 
	 */
	public void setBusinTypeName(String businTypeName) {
		this.businTypeName = businTypeName;
	}





	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午6:54:34 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "DictionaryType [businTypeId=" + businTypeId
				+ ", businTypeName=" + businTypeName + "]";
	}






}
