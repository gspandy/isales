/**
* @Company 青鸟软通   
* @Title: ProModelDomain.java 
* @Package com.haier.isales.basicInfo.proModel.domain 
* @author Guo  Yuchao   
* @date 2014年11月15日  11:51:37 
* @version V1.0   
*/ 
package com.haier.isales.basicinfo.promodel.dto;

import java.io.Serializable;

/** 
 * @ClassName: ProModelDTO 
 * @Description: t_isales_pro_model 自动生成的对应的实体对象   
 *  
 */
public class ProModelDTO implements Serializable{
	private static final long serialVersionUID = -1416022897295L;

	/** 
	* @Fields prodcode : 产品型号编码，产品的条码前9位即型号编码
	*/
	private String prodcode;
	/** 
	* @Fields prdn : 产品型号名称
	*/
	private String prdn;
	/** 
	* @Fields categoryE : 产品组编码
	*/
	private String categoryE;
	/** 
	* @Fields categoryEName : 产品组名称
	*/
	private String categoryEName;
	/** 
	* @Fields proBrandName : 品牌
	*/
	private String proBrandName;
	/** 
	* @Fields markDate : 上市时间
	*/
	private java.util.Date markDate;
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * @Description: 属性 prodcode 的get方法 
	 * @return id
	 */
	public String getProdcode() {
		return this.prodcode;
	}
	/**
	 * @Description: 属性 prodcode 的set方法 
	 * @param id 
	 */
	public void setProdcode(String prodcode) {
		this.prodcode = prodcode;
	}
	/**
	 * @Description: 属性 prdn 的get方法 
	 * @return id
	 */
	public String getPrdn() {
		return this.prdn;
	}
	/**
	 * @Description: 属性 prdn 的set方法 
	 * @param id 
	 */
	public void setPrdn(String prdn) {
		this.prdn = prdn;
	}
	/**
	 * @Description: 属性 categoryE 的get方法 
	 * @return id
	 */
	public String getCategoryE() {
		return this.categoryE;
	}
	/**
	 * @Description: 属性 categoryE 的set方法 
	 * @param id 
	 */
	public void setCategoryE(String categoryE) {
		this.categoryE = categoryE;
	}
	/**
	 * @Description: 属性 categoryEName 的get方法 
	 * @return id
	 */
	public String getCategoryEName() {
		return this.categoryEName;
	}
	/**
	 * @Description: 属性 categoryEName 的set方法 
	 * @param id 
	 */
	public void setCategoryEName(String categoryEName) {
		this.categoryEName = categoryEName;
	}
	/**
	 * @Description: 属性 proBrandName 的get方法 
	 * @return id
	 */
	public String getProBrandName() {
		return this.proBrandName;
	}
	/**
	 * @Description: 属性 proBrandName 的set方法 
	 * @param id 
	 */
	public void setProBrandName(String proBrandName) {
		this.proBrandName = proBrandName;
	}
	/**
	 * @Description: 属性 markDate 的get方法 
	 * @return id
	 */
	public java.util.Date getMarkDate() {
		return this.markDate;
	}
	/**
	 * @Description: 属性 markDate 的set方法 
	 * @param id 
	 */
	public void setMarkDate(java.util.Date markDate) {
		this.markDate = markDate;
	}
	
	/*======================= toString =======================*/
	/**
	* <p>Description:ProModelDTO自动生成的toString方法 </p> 
	* @author Guo  Yuchao   
	* @date 2015-1-7 下午7:10:18 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProModelDTO [prodcode=" + prodcode + ", prdn=" + prdn
				+ ", categoryE=" + categoryE + ", categoryEName="
				+ categoryEName + ", proBrandName=" + proBrandName
				+ ", markDate=" + markDate + "]";
	}
}
