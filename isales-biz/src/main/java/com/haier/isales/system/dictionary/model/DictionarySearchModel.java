/**
* @Company 青鸟软通   
* @Title: DictionaryDomain.java 
* @Package com.jbinfo.ecms.sys.domain 
* @author Liu Wenjie   
* @date 2013-11-19 上午10:40:46 
* @version V1.0   
*/ 
package com.haier.isales.system.dictionary.model;

import com.haier.isales.common.CommonSearchModel;
import com.haier.isales.system.dto.Dictionary;

/** 
 * @ClassName: DictionaryDomain 
 * @Description: 业务字典对应的领域对象
 *  
 */
public class DictionarySearchModel extends CommonSearchModel<Dictionary>{

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = 8860135081061498256L;
	
	private String busintypeId; //业务字典类型的id
    private String businId;  //业务字典的具体值
	private String businName; //业务字典类型对应的名称
    private Integer privilege; 
    private Character status; //当前是否可用状态  ‘0’ 不可用 ‘1’ 可用
    private String keyword;//Guoyuchao 20140312 添加描述的关键字
    
    
    /*==========getter and setter =========*/
	/**
	 * @Description: 属性 busintypeId 的get方法 
	 * @return busintypeId
	 */
	public String getBusintypeId() {
		return busintypeId;
	}
	/**
	 * @Description: 属性 busintypeId 的set方法 
	 * @param busintypeId 
	 */
	public void setBusintypeId(String busintypeId) {
		this.busintypeId = busintypeId;
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
	 * @Description: 属性 businName 的get方法 
	 * @return businName
	 */
	public String getBusinName() {
		return businName;
	}
	/**
	 * @Description: 属性 businName 的set方法 
	 * @param businName 
	 */
	public void setBusinName(String businName) {
		this.businName = businName;
	}
	/**
	 * @Description: 属性 privilege 的get方法 
	 * @return privilege
	 */
	public Integer getPrivilege() {
		return privilege;
	}
	/**
	 * @Description: 属性 privilege 的set方法 
	 * @param privilege 
	 */
	public void setPrivilege(Integer privilege) {
		this.privilege = privilege;
	}
	/**
	 * @Description: 属性 status 的get方法 
	 * @return status
	 */
	public Character getStatus() {
		return status;
	}
	/**
	 * @Description: 属性 status 的set方法 
	 * @param status 
	 */
	public void setStatus(Character status) {
		this.status = status;
	}

	/**
	 * @Description: 属性 keyword 的get方法 
	 * @return keyword
	 */
	public String getKeyword() {
		return keyword;
	}
	/**
	 * @Description: 属性 keyword 的set方法 
	 * @param keyword 
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	/**
	* @Description:<p>TODO  </p> 
	* @author Liu Wenjie   
	* @date 2013-11-19 上午11:07:46 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "DictionaryDomain ===[ busintypeId=" + busintypeId 
				   + " businId=" + businId 
				   + " businName=" + businName
				   + " status=" + status
				   + " ]";
	}
}
