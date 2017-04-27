/**
* @Company 青鸟软通   
* @Title: ProductsFAQAppDTO.java 
* @Package com.haier.isales.products.dto 
* @author John zhao   
* @date 2015-1-28 上午10:33:07 
* @version V1.0   
*/ 
package com.haier.isales.products.dto;

import java.io.Serializable;

/** 
 * @ClassName: ProductsFAQAppDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsFAQAppDTO implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -2879525623092731782L;

	/** 
	* @Fields id : 主键，无实际意义
	*/
	private Long id;
	/** 
	* @Fields faqmetadataid : 常见问题id
	*/
	private Long faqmetadataid;
	/** 
	* @Fields metadataid : 所属型号id
	*/
	private Long metadataid;
	/** 
	* @Fields fname : 常见问题提问
	*/
	private String fname;
	/** 
	* @Fields ffilename : 常见问题解答
	*/
	private String ffilename;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
	
	/*==================getters & setters==================*/
	/**
	 * @Description: 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @Description: 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @Description: 属性 faqmetadataid 的get方法 
	 * @return faqmetadataid
	 */
	public Long getFaqmetadataid() {
		return faqmetadataid;
	}
	/**
	 * @Description: 属性 faqmetadataid 的set方法 
	 * @param faqmetadataid 
	 */
	public void setFaqmetadataid(Long faqmetadataid) {
		this.faqmetadataid = faqmetadataid;
	}
	/**
	 * @Description: 属性 metadataid 的get方法 
	 * @return metadataid
	 */
	public Long getMetadataid() {
		return metadataid;
	}
	/**
	 * @Description: 属性 metadataid 的set方法 
	 * @param metadataid 
	 */
	public void setMetadataid(Long metadataid) {
		this.metadataid = metadataid;
	}
	/**
	 * @Description: 属性 fname 的get方法 
	 * @return fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @Description: 属性 fname 的set方法 
	 * @param fname 
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @Description: 属性 ffilename 的get方法 
	 * @return ffilename
	 */
	public String getFfilename() {
		return ffilename;
	}
	/**
	 * @Description: 属性 ffilename 的set方法 
	 * @param ffilename 
	 */
	public void setFfilename(String ffilename) {
		this.ffilename = ffilename;
	}
	/**
	 * @Description: 属性 remark 的get方法 
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @Description: 属性 remark 的set方法 
	 * @param remark 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
