/**
* @Company 青鸟软通   
* @Title: ProductsFAQDomain.java 
* @Package com.haier.isales.products.productsfaq.domain 
* @author John.Zhao   
* @date 2015年01月22日  15:55:07 
* @version V1.0   
*/ 
package com.haier.isales.products.heretemp.productsfaq.domain;

import java.io.Serializable;

/** 
 * @ClassName: ProductsFAQDomain 
 * t_isales_products_faq_temp 自动生成的对应的实体对象   
 *  
 */
public class ProductsFAQDomain implements Serializable{
	private static final long serialVersionUID = -1421913307855L;

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
	* @Fields synchronousTime : 该条数据同步的时间
	*/
	private java.util.Date synchronousTime;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 属性 faqmetadataid 的get方法 
	 * @return id
	 */
	public Long getFaqmetadataid() {
		return this.faqmetadataid;
	}
	/**
	 * 属性 faqmetadataid 的set方法 
	 * @param id 
	 */
	public void setFaqmetadataid(Long faqmetadataid) {
		this.faqmetadataid = faqmetadataid;
	}
	/**
	 * 属性 metadataid 的get方法 
	 * @return id
	 */
	public Long getMetadataid() {
		return this.metadataid;
	}
	/**
	 * 属性 metadataid 的set方法 
	 * @param id 
	 */
	public void setMetadataid(Long metadataid) {
		this.metadataid = metadataid;
	}
	/**
	 * 属性 fname 的get方法 
	 * @return id
	 */
	public String getFname() {
		return this.fname;
	}
	/**
	 * 属性 fname 的set方法 
	 * @param id 
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * 属性 ffilename 的get方法 
	 * @return id
	 */
	public String getFfilename() {
		return this.ffilename;
	}
	/**
	 * 属性 ffilename 的set方法 
	 * @param id 
	 */
	public void setFfilename(String ffilename) {
		this.ffilename = ffilename;
	}
	/**
	 * 属性 synchronousTime 的get方法 
	 * @return id
	 */
	public java.util.Date getSynchronousTime() {
		return this.synchronousTime;
	}
	/**
	 * 属性 synchronousTime 的set方法 
	 * @param id 
	 */
	public void setSynchronousTime(java.util.Date synchronousTime) {
		this.synchronousTime = synchronousTime;
	}
	/**
	 * 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: ProductsFAQDomain 自动生成的hashcode方法</p> 
	* @author John.Zhao   
	* @date 2015年01月22日  15:55:07
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((id == null) ? 0 : id.hashCode());
		return result;
	}
	/**
	* <p>Description:ProductsFAQDomain 自动生成的equals方法 </p> 
	* @author John.Zhao   
	* @date 2015年01月22日  15:55:07
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
		ProductsFAQDomain other =(ProductsFAQDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (id == null) {if (other.id != null){ return false;} else if (!id.equals(other.id)){ return false;}}
		*/
		if (id == null) {
			if (other.id != null){ 
				return false;
			}
		}else if (!id.equals(other.id)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:ProductsFAQDomain 自动生成的toString方法 </p> 
	* @author John.Zhao   
	* @date 2015年01月22日  15:55:07 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductsFAQDomain [" +
					"id=" + id + "," + 
					"faqmetadataid=" + faqmetadataid + "," + 
					"metadataid=" + metadataid + "," + 
					"fname=" + fname + "," + 
					"ffilename=" + ffilename + "," + 
					"synchronousTime=" + synchronousTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
