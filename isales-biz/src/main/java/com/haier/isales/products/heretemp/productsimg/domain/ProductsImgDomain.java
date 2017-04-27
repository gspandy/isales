/**
* @Company 青鸟软通   
* @Title: ProductsImgDomain.java 
* @Package com.haier.isales.products.productsimg.domain 
* @author John.Zhao   
* @date 2015年01月26日  10:29:24 
* @version V1.0   
*/ 
package com.haier.isales.products.heretemp.productsimg.domain;

import java.io.Serializable;

/** 
 * @ClassName: ProductsImgDomain 
 * t_isales_products_img_temp 自动生成的对应的实体对象   
 *  
 */
public class ProductsImgDomain implements Serializable{
	private static final long serialVersionUID = -1422239364017L;

	/** 
	* @Fields appendixid : 图片id
	*/
	private Long appendixid;
	/** 
	* @Fields fileext : 图片后缀名
	*/
	private String fileext;
	/** 
	* @Fields appfile : 图片url
	*/
	private String appfile;
	/** 
	* @Fields appdesc : 图片描述
	*/
	private String appdesc;
	/** 
	* @Fields metadataid : 产品型号id
	*/
	private Long metadataid;
	/** 
	* @Fields modelno : 产品型号
	*/
	private String modelno;
	/** 
	* @Fields viewname : 产品分类
	*/
	private String viewname;
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
	 * 属性 appendixid 的get方法 
	 * @return id
	 */
	public Long getAppendixid() {
		return this.appendixid;
	}
	/**
	 * 属性 appendixid 的set方法 
	 * @param id 
	 */
	public void setAppendixid(Long appendixid) {
		this.appendixid = appendixid;
	}
	/**
	 * 属性 fileext 的get方法 
	 * @return id
	 */
	public String getFileext() {
		return this.fileext;
	}
	/**
	 * 属性 fileext 的set方法 
	 * @param id 
	 */
	public void setFileext(String fileext) {
		this.fileext = fileext;
	}
	/**
	 * 属性 appfile 的get方法 
	 * @return id
	 */
	public String getAppfile() {
		return this.appfile;
	}
	/**
	 * 属性 appfile 的set方法 
	 * @param id 
	 */
	public void setAppfile(String appfile) {
		this.appfile = appfile;
	}
	/**
	 * 属性 appdesc 的get方法 
	 * @return id
	 */
	public String getAppdesc() {
		return this.appdesc;
	}
	/**
	 * 属性 appdesc 的set方法 
	 * @param id 
	 */
	public void setAppdesc(String appdesc) {
		this.appdesc = appdesc;
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
	 * 属性 modelno 的get方法 
	 * @return id
	 */
	public String getModelno() {
		return this.modelno;
	}
	/**
	 * 属性 modelno 的set方法 
	 * @param id 
	 */
	public void setModelno(String modelno) {
		this.modelno = modelno;
	}
	/**
	 * 属性 viewname 的get方法 
	 * @return id
	 */
	public String getViewname() {
		return this.viewname;
	}
	/**
	 * 属性 viewname 的set方法 
	 * @param id 
	 */
	public void setViewname(String viewname) {
		this.viewname = viewname;
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
	* <p>Description: ProductsImgDomain 自动生成的hashcode方法</p> 
	* @author John.Zhao   
	* @date 2015年01月26日  10:29:24
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((appendixid == null) ? 0 : appendixid.hashCode());
		return result;
	}
	/**
	* <p>Description:ProductsImgDomain 自动生成的equals方法 </p> 
	* @author John.Zhao   
	* @date 2015年01月26日  10:29:24
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
		ProductsImgDomain other =(ProductsImgDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (appendixid == null) {if (other.appendixid != null){ return false;} else if (!appendixid.equals(other.appendixid)){ return false;}}
		*/
		if (appendixid == null) {
			if (other.appendixid != null){ 
				return false;
			}
		}else if (!appendixid.equals(other.appendixid)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:ProductsImgDomain 自动生成的toString方法 </p> 
	* @author John.Zhao   
	* @date 2015年01月26日  10:29:24 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductsImgDomain [" +
					"appendixid=" + appendixid + "," + 
					"fileext=" + fileext + "," + 
					"appfile=" + appfile + "," + 
					"appdesc=" + appdesc + "," + 
					"metadataid=" + metadataid + "," + 
					"modelno=" + modelno + "," + 
					"viewname=" + viewname + "," + 
					"synchronousTime=" + synchronousTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
