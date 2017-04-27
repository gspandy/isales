/**
* @Company 青鸟软通   
* @Title: ProductsClassifyParamsDomain.java 
* @Package com.haier.isales.products.productsclassifyparams.domain 
* @author John.Zhao   
* @date 2015年01月22日  09:41:17 
* @version V1.0   
*/ 
package com.haier.isales.products.heretemp.productsclassifyparams.domain;

import java.io.Serializable;


/** 
 * @ClassName: ProductsClassifyParamsDomain 
 * t_isales_products_classify_params_temp 自动生成的对应的实体对象   
 *  
 */
public class ProductsClassifyParamsDomain implements Serializable{
	private static final long serialVersionUID = -1421890877506L;

	/** 
	* @Fields id : 主键，无实际意义
	*/
	private Long id;
	/** 
	* @Fields viewname : 产品分类
	*/
	private String viewname;
	/** 
	* @Fields paramsCode : 参数项编码
	*/
	private String paramsCode;
	/** 
	* @Fields paramsName : 参数项名称
	*/
	private String paramsName;
	/** 
	* @Fields paramsEnum : 参数枚举值
	*/
	private String paramsEnum;
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
	 * 属性 paramsEnum 的get方法 
	 * @return id
	 */
	public String getParamsEnum() {
		return this.paramsEnum;
	}
	/**
	 * 属性 paramsEnum 的set方法 
	 * @param id 
	 */
	public void setParamsEnum(String paramsEnum) {
		this.paramsEnum = paramsEnum;
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
	* <p>Description: ProductsClassifyParamsDomain 自动生成的hashcode方法</p> 
	* @author John.Zhao   
	* @date 2015年02月04日  13:44:08
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
	* <p>Description:ProductsClassifyParamsDomain 自动生成的equals方法 </p> 
	* @author John.Zhao   
	* @date 2015年02月04日  13:44:08
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
		ProductsClassifyParamsDomain other =(ProductsClassifyParamsDomain) obj;
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
	* <p>Description:ProductsClassifyParamsDomain 自动生成的toString方法 </p> 
	* @author John.Zhao   
	* @date 2015年02月04日  13:44:08 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductsClassifyParamsDomain [" +
					"id=" + id + "," + 
					"viewname=" + viewname + "," + 
					"paramsCode=" + paramsCode + "," + 
					"paramsName=" + paramsName + "," + 
					"paramsEnum=" + paramsEnum + "," + 
					"synchronousTime=" + synchronousTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
