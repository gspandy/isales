/**
* @Company 青鸟软通   
* @Title: ProductsParamAppDomain.java 
* @Package com.haier.isales.products.productsparamapp.domain 
* @author John.Zhao   
* @date 2015年01月27日  15:33:47 
* @version V1.0   
*/ 
package com.haier.isales.products.productsparamapp.domain;

import java.io.Serializable;

/** 
 * @ClassName: ProductsParamAppDomain 
 * t_isales_products_params_summary 自动生成的对应的实体对象   
 *  
 */
public class ProductsParamAppDomain implements Serializable{
	private static final long serialVersionUID = -1422344027551L;

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
	 * 属性 paramsCode 的get方法 
	 * @return id
	 */
	public String getParamsCode() {
		return this.paramsCode;
	}
	/**
	 * 属性 paramsCode 的set方法 
	 * @param id 
	 */
	public void setParamsCode(String paramsCode) {
		this.paramsCode = paramsCode;
	}
	/**
	 * 属性 paramsName 的get方法 
	 * @return id
	 */
	public String getParamsName() {
		return this.paramsName;
	}
	/**
	 * 属性 paramsName 的set方法 
	 * @param id 
	 */
	public void setParamsName(String paramsName) {
		this.paramsName = paramsName;
	}
	/**
	 * 属性 paramsValue 的get方法 
	 * @return id
	 */
	public String getParamsValue() {
		return this.paramsValue;
	}
	/**
	 * 属性 paramsValue 的set方法 
	 * @param id 
	 */
	public void setParamsValue(String paramsValue) {
		this.paramsValue = paramsValue;
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
	* <p>Description: ProductsParamAppDomain 自动生成的hashcode方法</p> 
	* @author John.Zhao   
	* @date 2015年01月27日  15:33:47
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
	* <p>Description:ProductsParamAppDomain 自动生成的equals方法 </p> 
	* @author John.Zhao   
	* @date 2015年01月27日  15:33:47
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
		ProductsParamAppDomain other =(ProductsParamAppDomain) obj;
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
	* <p>Description:ProductsParamAppDomain 自动生成的toString方法 </p> 
	* @author John.Zhao   
	* @date 2015年01月27日  15:33:47 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductsParamAppDomain [" +
					"id=" + id + "," + 
					"metadataid=" + metadataid + "," + 
					"modelno=" + modelno + "," + 
					"viewname=" + viewname + "," + 
					"paramsCode=" + paramsCode + "," + 
					"paramsName=" + paramsName + "," + 
					"paramsValue=" + paramsValue + "," + 
					"synchronousTime=" + synchronousTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
