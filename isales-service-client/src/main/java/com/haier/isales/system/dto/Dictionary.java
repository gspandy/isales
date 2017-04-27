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
public class Dictionary implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private DictionaryPK dictionaryPK;
    private String businName;
    private Integer privilege;
    private Character status;
    private String keyword;
    
	private String businTypeName;
    public Dictionary() {
    }


    public String getBusinName() {
        return businName;
    }

    public void setBusinName(String businName) {
        this.businName = businName;
    }

    public Integer getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Integer privilege) {
        this.privilege = privilege;
    }

    public Character getStatus() {
        return status;
    }

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
	 * @Description: 属性 dictionaryPK 的get方法 
	 * @return dictionaryPK
	 */
	public DictionaryPK getDictionaryPK() {
		return dictionaryPK;
	}


	/**
	 * @Description: 属性 dictionaryPK 的set方法 
	 * @param dictionaryPK 
	 */
	public void setDictionaryPK(DictionaryPK dictionaryPK) {
		this.dictionaryPK = dictionaryPK;
	}


	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午6:54:13 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "Dictionary [dictionaryPK=" + dictionaryPK + ", businName="
				+ businName + ", privilege=" + privilege + ", status=" + status
				+ ", keyword=" + keyword + ", businTypeName=" + businTypeName
				+ "]";
	}






}
