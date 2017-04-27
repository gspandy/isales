/**
* @Company 青鸟软通   
* @Title: ProductsClassifyDomain.java 
* @Package com.haier.isales.products.productsclassify.domain 
* @author John.Zhao   
* @date 2015年01月20日  16:37:53 
* @version V1.0   
*/ 
package com.haier.isales.products.heretemp.productsclassify.domain;

import java.io.Serializable;

/** 
 * @ClassName: ProductsClassifyDomain 
 * t_isales_products_classify_temp 自动生成的对应的实体对象   
 *  
 */
public class ProductsClassifyDomain implements Serializable{
	private static final long serialVersionUID = -1421743072999L;

	/** 
	* @Fields viewname : 分类编码
	*/
	private String viewname;
	/** 
	* @Fields viewdesc : 分类名称
	*/
	private String viewdesc;
	/** 
	* @Fields channeldescstrs : 分类描述
	*/
	private String channeldescstrs;
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
	 * 属性 viewdesc 的get方法 
	 * @return id
	 */
	public String getViewdesc() {
		return this.viewdesc;
	}
	/**
	 * 属性 viewdesc 的set方法 
	 * @param id 
	 */
	public void setViewdesc(String viewdesc) {
		this.viewdesc = viewdesc;
	}
	/**
	 * 属性 channeldescstrs 的get方法 
	 * @return id
	 */
	public String getChanneldescstrs() {
		return this.channeldescstrs;
	}
	/**
	 * 属性 channeldescstrs 的set方法 
	 * @param id 
	 */
	public void setChanneldescstrs(String channeldescstrs) {
		this.channeldescstrs = channeldescstrs;
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
	* <p>Description: ProductsClassifyDomain 自动生成的hashcode方法</p> 
	* @author John.Zhao   
	* @date 2015年01月20日  16:37:53
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((viewname == null) ? 0 : viewname.hashCode());
		return result;
	}
	/**
	* <p>Description:ProductsClassifyDomain 自动生成的equals方法 </p> 
	* @author John.Zhao   
	* @date 2015年01月20日  16:37:53
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
		ProductsClassifyDomain other =(ProductsClassifyDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (viewname == null) {if (other.viewname != null){ return false;} else if (!viewname.equals(other.viewname)){ return false;}}
		*/
		if (viewname == null) {
			if (other.viewname != null){ 
				return false;
			}
		}else if (!viewname.equals(other.viewname)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:ProductsClassifyDomain 自动生成的toString方法 </p> 
	* @author John.Zhao   
	* @date 2015年01月20日  16:37:53 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductsClassifyDomain [" +
					"viewname=" + viewname + "," + 
					"viewdesc=" + viewdesc + "," + 
					"channeldescstrs=" + channeldescstrs + "," + 
					"synchronousTime=" + synchronousTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
