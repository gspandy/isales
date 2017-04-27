/**
* @Company 青鸟软通   
* @Title: ProductsParamDTO.java 
* @Package com.haier.isales.products.dto 
* @author John zhao   
* @date 2015-1-27 下午4:18:39 
* @version V1.0   
*/ 
package com.haier.isales.products.dto;

import java.io.Serializable;

/** 
 * @ClassName: ProductsParamDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsParamDTO implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -2666267098060800104L;

	/** 
	* @Fields id : 主键，无实际意义
	*/
	private Long id;
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
	* @Fields paramsCode : 参数项
	*/
	private String paramsCode;
	/** 
	* @Fields paramsName : 参数项名称
	*/
	private String paramsName;
	/** 
	* @Fields paramsValue : 参数值
	*/
	private String paramsValue;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
	
	/*================getters & setters=================*/
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
	 * @Description: 属性 paramsCode 的get方法 
	 * @return paramsCode
	 */
	public String getParamsCode() {
		return paramsCode;
	}
	/**
	 * @Description: 属性 paramsCode 的set方法 
	 * @param paramsCode 
	 */
	public void setParamsCode(String paramsCode) {
		this.paramsCode = paramsCode;
	}
	/**
	 * @Description: 属性 paramsName 的get方法 
	 * @return paramsName
	 */
	public String getParamsName() {
		return paramsName;
	}
	/**
	 * @Description: 属性 paramsName 的set方法 
	 * @param paramsName 
	 */
	public void setParamsName(String paramsName) {
		this.paramsName = paramsName;
	}
	/**
	 * @Description: 属性 paramsValue 的get方法 
	 * @return paramsValue
	 */
	public String getParamsValue() {
		return paramsValue;
	}
	/**
	 * @Description: 属性 paramsValue 的set方法 
	 * @param paramsValue 
	 */
	public void setParamsValue(String paramsValue) {
		this.paramsValue = paramsValue;
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
	
	/*==================toString=======================*/
	/**
	* <p>Description:ProductsParamDTO自动生成的toString方法 </p> 
	* @author John zhao   
	* @date 2015-1-27 下午4:19:18 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductsParamDTO [id=" + id + ", metadataid=" + metadataid + ", modelno=" + modelno + ", viewname="
				+ viewname + ", paramsCode=" + paramsCode + ", paramsName=" + paramsName + ", paramsValue="
				+ paramsValue + ", remark=" + remark + "]";
	}
	
	/*================hashCode & equals===================*/
	/**
	* <p>Description: ProductsParamDTO自动生成的hashCode方法</p> 
	* @author John zhao   
	* @date 2015-1-27 下午4:19:23 
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((metadataid == null) ? 0 : metadataid.hashCode());
		result = prime * result + ((modelno == null) ? 0 : modelno.hashCode());
		result = prime * result + ((paramsCode == null) ? 0 : paramsCode.hashCode());
		result = prime * result + ((paramsName == null) ? 0 : paramsName.hashCode());
		result = prime * result + ((paramsValue == null) ? 0 : paramsValue.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((viewname == null) ? 0 : viewname.hashCode());
		return result;
	}
	/**
	* <p>Description: ProductsParamDTO自动生成的equals方法</p> 
	* @author John zhao   
	* @date 2015-1-27 下午4:19:23 
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
		ProductsParamDTO other = (ProductsParamDTO) obj;
		if (id == null) {
			if (other.id != null){
				return false;
			}
		} else if (!id.equals(other.id)){
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
		if (paramsCode == null) {
			if (other.paramsCode != null){
				return false;
			}
		} else if (!paramsCode.equals(other.paramsCode)){
			return false;
		}
		if (paramsName == null) {
			if (other.paramsName != null){
				return false;
			}
		} else if (!paramsName.equals(other.paramsName)){
			return false;
		}
		if (paramsValue == null) {
			if (other.paramsValue != null){
				return false;
			}
		} else if (!paramsValue.equals(other.paramsValue)){
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
