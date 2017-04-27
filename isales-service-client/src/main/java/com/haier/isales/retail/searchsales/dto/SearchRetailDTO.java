/**
* @Company 青鸟软通   
* @Title: SearchRetailDTO.java 
* @Package com.haier.isales.retail.searchsales.dto 
* @author John zhao   
* @date 2015-3-9 上午10:29:14 
* @version V1.0   
*/ 
package com.haier.isales.retail.searchsales.dto;

import java.io.Serializable;

/** 
 * @ClassName: SearchRetailDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class SearchRetailDTO implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1501901060579261658L;
	
	/** 
	* @Fields ygid : 员工号
	*/ 
	private String ygid;
	/** 
	* @Fields kssj : 开始时间（格式为yyyy-mm-dd）
	*/ 
	private String kssj;
	/** 
	* @Fields jssj : 截止时间（格式为yyyy-mm-dd） 
	*/ 
	private String jssj; 
	/** 
	* @Fields cpx : 产品线(101,102等)
	*/ 
	private String cpx; 
	/** 
	* @Fields product : 产品编码（例：CB0K30B0M）
	*/ 
	private String product; 
	/** 
	* @Fields sflr : 是否验证（未验证、已验证、验证失败）
	*/ 
	private String sflr;
	/** 
	* @Fields ismember : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private String ismember;
	/** 
	* @Fields start : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private int pageNo; 
	/** 
	* @Fields limit : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private int pageSize;
	
	/*===================getters & setters==================*/
	/**
	 * @Description: 属性 ygid 的get方法 
	 * @return ygid
	 */
	public String getYgid() {
		return ygid;
	}
	/**
	 * @Description: 属性 ygid 的set方法 
	 * @param ygid 
	 */
	public void setYgid(String ygid) {
		this.ygid = ygid;
	}
	/**
	 * @Description: 属性 kssj 的get方法 
	 * @return kssj
	 */
	public String getKssj() {
		return kssj;
	}
	/**
	 * @Description: 属性 kssj 的set方法 
	 * @param kssj 
	 */
	public void setKssj(String kssj) {
		this.kssj = kssj;
	}
	/**
	 * @Description: 属性 jssj 的get方法 
	 * @return jssj
	 */
	public String getJssj() {
		return jssj;
	}
	/**
	 * @Description: 属性 jssj 的set方法 
	 * @param jssj 
	 */
	public void setJssj(String jssj) {
		this.jssj = jssj;
	}
	/**
	 * @Description: 属性 cpx 的get方法 
	 * @return cpx
	 */
	public String getCpx() {
		return cpx;
	}
	/**
	 * @Description: 属性 cpx 的set方法 
	 * @param cpx 
	 */
	public void setCpx(String cpx) {
		this.cpx = cpx;
	}
	/**
	 * @Description: 属性 product 的get方法 
	 * @return product
	 */
	public String getProduct() {
		return product;
	}
	/**
	 * @Description: 属性 product 的set方法 
	 * @param product 
	 */
	public void setProduct(String product) {
		this.product = product;
	}
	/**
	 * @Description: 属性 sflr 的get方法 
	 * @return sflr
	 */
	public String getSflr() {
		return sflr;
	}
	/**
	 * @Description: 属性 sflr 的set方法 
	 * @param sflr 
	 */
	public void setSflr(String sflr) {
		this.sflr = sflr;
	}
	/**
	 * @Description: 属性 ismember 的get方法 
	 * @return ismember
	 */
	public String getIsmember() {
		return ismember;
	}
	/**
	 * @Description: 属性 ismember 的set方法 
	 * @param ismember 
	 */
	public void setIsmember(String ismember) {
		this.ismember = ismember;
	}
	/**
	 * @Description: 属性 pageNo 的get方法 
	 * @return pageNo
	 */
	public int getPageNo() {
		return pageNo;
	}
	/**
	 * @Description: 属性 pageNo 的set方法 
	 * @param pageNo 
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	/**
	 * @Description: 属性 pageSize 的get方法 
	 * @return pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}
	/**
	 * @Description: 属性 pageSize 的set方法 
	 * @param pageSize 
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
