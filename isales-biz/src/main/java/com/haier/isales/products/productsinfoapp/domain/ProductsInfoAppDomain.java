/**
* @Company 青鸟软通   
* @Title: ProductsInfoAppDomain.java 
* @Package com.haier.isales.products.productsinfoapp.domain 
* @author John.Zhao   
* @date 2015年01月29日  17:55:45 
* @version V1.0   
*/ 
package com.haier.isales.products.productsinfoapp.domain;

import java.io.Serializable;

/** 
 * @ClassName: ProductsInfoAppDomain 
 * t_isales_products_info_summary 自动生成的对应的实体对象   
 *  
 */
public class ProductsInfoAppDomain implements Serializable{
	private static final long serialVersionUID = -1422525345204L;

	/** 
	* @Fields metadataid : 产品型号id
	*/
	private Long metadataid;
	/** 
	* @Fields modelcode : 型号code
	*/
	private String modelcode;
	/** 
	* @Fields modelno : 型号编码
	*/
	private String modelno;
	/** 
	* @Fields modelname : 型号名称
	*/
	private String modelname;
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
	* @Fields proLineCode : 产业编码
	*/
	private String proLineCode;
	/** 
	* @Fields proLineName : 产业名
	*/
	private String proLineName;
	/** 
	* @Fields salesChannel : 大渠道
	*/
	private String salesChannel;
	/** 
	* @Fields modelImg : 型号对应图片
	*/
	private String modelImg;
	/** 
	* @Fields createTime : 创建时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
		
	
	/*=========================getter and setter ===================*/
	
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
	 * 属性 modelcode 的get方法 
	 * @return id
	 */
	public String getModelcode() {
		return this.modelcode;
	}
	/**
	 * 属性 modelcode 的set方法 
	 * @param id 
	 */
	public void setModelcode(String modelcode) {
		this.modelcode = modelcode;
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
	 * 属性 modelname 的get方法 
	 * @return id
	 */
	public String getModelname() {
		return this.modelname;
	}
	/**
	 * 属性 modelname 的set方法 
	 * @param id 
	 */
	public void setModelname(String modelname) {
		this.modelname = modelname;
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
	 * 属性 proLineCode 的get方法 
	 * @return id
	 */
	public String getProLineCode() {
		return this.proLineCode;
	}
	/**
	 * 属性 proLineCode 的set方法 
	 * @param id 
	 */
	public void setProLineCode(String proLineCode) {
		this.proLineCode = proLineCode;
	}
	/**
	 * 属性 proLineName 的get方法 
	 * @return id
	 */
	public String getProLineName() {
		return this.proLineName;
	}
	/**
	 * 属性 proLineName 的set方法 
	 * @param id 
	 */
	public void setProLineName(String proLineName) {
		this.proLineName = proLineName;
	}
	/**
	 * 属性 salesChannel 的get方法 
	 * @return id
	 */
	public String getSalesChannel() {
		return this.salesChannel;
	}
	/**
	 * 属性 salesChannel 的set方法 
	 * @param id 
	 */
	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}
	/**
	 * 属性 modelImg 的get方法 
	 * @return id
	 */
	public String getModelImg() {
		return this.modelImg;
	}
	/**
	 * 属性 modelImg 的set方法 
	 * @param id 
	 */
	public void setModelImg(String modelImg) {
		this.modelImg = modelImg;
	}
	/**
	 * 属性 createTime 的get方法 
	 * @return id
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * 属性 createTime 的set方法 
	 * @param id 
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
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
	* <p>Description: ProductsInfoAppDomain 自动生成的hashcode方法</p> 
	* @author John.Zhao   
	* @date 2015年01月29日  17:55:45
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((metadataid == null) ? 0 : metadataid.hashCode());
		return result;
	}
	/**
	* <p>Description:ProductsInfoAppDomain 自动生成的equals方法 </p> 
	* @author John.Zhao   
	* @date 2015年01月29日  17:55:45
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
		ProductsInfoAppDomain other =(ProductsInfoAppDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (metadataid == null) {if (other.metadataid != null){ return false;} else if (!metadataid.equals(other.metadataid)){ return false;}}
		*/
		if (metadataid == null) {
			if (other.metadataid != null){ 
				return false;
			}
		}else if (!metadataid.equals(other.metadataid)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:ProductsInfoAppDomain 自动生成的toString方法 </p> 
	* @author John.Zhao   
	* @date 2015年01月29日  17:55:45 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductsInfoAppDomain [" +
					"metadataid=" + metadataid + "," + 
					"modelcode=" + modelcode + "," + 
					"modelno=" + modelno + "," + 
					"modelname=" + modelname + "," + 
					"viewname=" + viewname + "," + 
					"viewdesc=" + viewdesc + "," + 
					"channeldescstrs=" + channeldescstrs + "," + 
					"proLineCode=" + proLineCode + "," + 
					"proLineName=" + proLineName + "," + 
					"salesChannel=" + salesChannel + "," + 
					"modelImg=" + modelImg + "," + 
					"createTime=" + createTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
