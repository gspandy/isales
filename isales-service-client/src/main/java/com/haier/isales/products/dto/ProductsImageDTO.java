/**
* @Company 青鸟软通   
* @Title: ProductsImageDTO.java 
* @Package com.haier.isales.products.dto 
* @author John zhao   
* @date 2015-1-27 上午10:58:43 
* @version V1.0   
*/ 
package com.haier.isales.products.dto;

import java.io.Serializable;

/** 
 * @ClassName: ProductsImageDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsImageDTO implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -5575268408997746979L;
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
	* @Fields remark : 备注
	*/
	private String remark;
	
	/*===================getters & setters===================*/
	/**
	 * @Description: 属性 appendixid 的get方法 
	 * @return appendixid
	 */
	public Long getAppendixid() {
		return appendixid;
	}
	/**
	 * @Description: 属性 appendixid 的set方法 
	 * @param appendixid 
	 */
	public void setAppendixid(Long appendixid) {
		this.appendixid = appendixid;
	}
	/**
	 * @Description: 属性 fileext 的get方法 
	 * @return fileext
	 */
	public String getFileext() {
		return fileext;
	}
	/**
	 * @Description: 属性 fileext 的set方法 
	 * @param fileext 
	 */
	public void setFileext(String fileext) {
		this.fileext = fileext;
	}
	/**
	 * @Description: 属性 appfile 的get方法 
	 * @return appfile
	 */
	public String getAppfile() {
		return appfile;
	}
	/**
	 * @Description: 属性 appfile 的set方法 
	 * @param appfile 
	 */
	public void setAppfile(String appfile) {
		this.appfile = appfile;
	}
	/**
	 * @Description: 属性 appdesc 的get方法 
	 * @return appdesc
	 */
	public String getAppdesc() {
		return appdesc;
	}
	/**
	 * @Description: 属性 appdesc 的set方法 
	 * @param appdesc 
	 */
	public void setAppdesc(String appdesc) {
		this.appdesc = appdesc;
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
	 * @Description: 属性 modelno 的get方法 
	 * @return modelno
	 */
	public String getModelno() {
		return modelno;
	}
	/**
	 * @Description: 属性 modelno 的set方法 
	 * @param modelno 
	 */
	public void setModelno(String modelno) {
		this.modelno = modelno;
	}
	/**
	 * @Description: 属性 viewname 的get方法 
	 * @return viewname
	 */
	public String getViewname() {
		return viewname;
	}
	/**
	 * @Description: 属性 viewname 的set方法 
	 * @param viewname 
	 */
	public void setViewname(String viewname) {
		this.viewname = viewname;
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
	
	/*====================toString=========================*/
	/**
	* <p>Description: ProductsImageDTO自动生成的toString方法</p> 
	* @author John zhao   
	* @date 2015-1-27 上午11:45:02 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductsImageDTO [appendixid=" + appendixid + ", fileext=" + fileext + ", appfile=" + appfile
				+ ", appdesc=" + appdesc + ", metadataid=" + metadataid + ", modelno=" + modelno + ", viewname="
				+ viewname + ", remark=" + remark + "]";
	}
	
	/*===================hashCode & equals======================*/
	/**
	* <p>Description: ProductsImageDTO自动生成的hashCode方法</p> 
	* @author John zhao   
	* @date 2015-1-27 上午11:45:11 
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appdesc == null) ? 0 : appdesc.hashCode());
		result = prime * result + ((appendixid == null) ? 0 : appendixid.hashCode());
		result = prime * result + ((appfile == null) ? 0 : appfile.hashCode());
		result = prime * result + ((fileext == null) ? 0 : fileext.hashCode());
		result = prime * result + ((metadataid == null) ? 0 : metadataid.hashCode());
		result = prime * result + ((modelno == null) ? 0 : modelno.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((viewname == null) ? 0 : viewname.hashCode());
		return result;
	}
	/**
	* <p>Description:ProductsImageDTO自动生成的equals方法 </p> 
	* @author John zhao   
	* @date 2015-1-27 上午11:45:11 
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
		ProductsImageDTO other = (ProductsImageDTO) obj;
		if (appdesc == null) {
			if (other.appdesc != null){
				return false;
			}
		} else if (!appdesc.equals(other.appdesc)){
			return false;
		}
		if (appendixid == null) {
			if (other.appendixid != null){
				return false;
			}
		} else if (!appendixid.equals(other.appendixid)){
			return false;
		}
		if (appfile == null) {
			if (other.appfile != null){
				return false;
			}
		} else if (!appfile.equals(other.appfile)){
			return false;
		}
		if (fileext == null) {
			if (other.fileext != null){
				return false;
			}
		} else if (!fileext.equals(other.fileext)){
			return false;
		}
		if (metadataid == null) {
			if (other.metadataid != null){
				return false;
			}
		} else if (!metadataid.equals(other.metadataid)){
			return false;
		}
		if (modelno == null) {
			if (other.modelno != null){
				return false;
			}
		} else if (!modelno.equals(other.modelno)){
			return false;
		}
		if (remark == null) {
			if (other.remark != null){
				return false;
			}
		} else if (!remark.equals(other.remark)){
			return false;
		}
		if (viewname == null) {
			if (other.viewname != null){
				return false;
			}
		} else if (!viewname.equals(other.viewname)){
			return false;
		}
		return true;
	}
}
