/**
* @Company 青鸟软通   
* @Title: DictionaryPK.java 
* @Package com.haier.isales.system.dictionary.domain 
* @author Guo Yuchao   
* @date 2014-11-4 下午1:25:20 
* @version V1.0   
*/ 
package com.haier.isales.system.dto;

import java.io.Serializable;

/** 
 * @ClassName: DictionaryPK 
 * @Description: 数据字典主键 
 *  
 */
public class DictionaryPK implements Serializable {

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = -3526616451629940452L;
    private String businTypeId;
    private String businId;
	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-11-4 下午1:26:00  
	*/ 
	public DictionaryPK() {
	}
	public DictionaryPK(String businTypeId, String businId) {
		this.businId = businId;
		this.businTypeId = businTypeId;
	}
	/**
	 * @Description: 属性 businTypeId 的get方法 
	 * @return businTypeId
	 */
	public String getBusinTypeId() {
		return businTypeId;
	}
	/**
	 * @Description: 属性 businTypeId 的set方法 
	 * @param businTypeId 
	 */
	public void setBusinTypeId(String businTypeId) {
		this.businTypeId = businTypeId;
	}
	/**
	 * @Description: 属性 businId 的get方法 
	 * @return businId
	 */
	public String getBusinId() {
		return businId;
	}
	/**
	 * @Description: 属性 businId 的set方法 
	 * @param businId 
	 */
	public void setBusinId(String businId) {
		this.businId = businId;
	}
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午6:54:23 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "DictionaryPK [businTypeId=" + businTypeId + ", businId="
				+ businId + "]";
	}
    
}
