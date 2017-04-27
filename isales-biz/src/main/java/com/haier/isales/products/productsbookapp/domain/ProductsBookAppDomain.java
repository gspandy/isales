/**
* @Company 青鸟软通   
* @Title: ProductsBookAppDomain.java 
* @Package com.haier.isales.products.productsbookapp.domain 
* @author John.Zhao   
* @date 2015年01月27日  15:36:01 
* @version V1.0   
*/ 
package com.haier.isales.products.productsbookapp.domain;

import java.io.Serializable;

/** 
 * @ClassName: ProductsBookAppDomain 
 * t_isales_products_book 自动生成的对应的实体对象   
 *  
 */
public class ProductsBookAppDomain implements Serializable{
	private static final long serialVersionUID = -1422344161587L;

	/** 
	* @Fields id : 本系统自增长主键，无意义
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
	* @Fields bookmetadataid : 对方系统的说明书id
	*/
	private Long bookmetadataid;
	/** 
	* @Fields dfilepath : 对方系统字段dfilepath，暂无值
	*/
	private String dfilepath;
	/** 
	* @Fields gname : 文件名
	*/
	private String gname;
	/** 
	* @Fields gfile : 文件地址
	*/
	private String gfile;
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
	 * 属性 bookmetadataid 的get方法 
	 * @return id
	 */
	public Long getBookmetadataid() {
		return this.bookmetadataid;
	}
	/**
	 * 属性 bookmetadataid 的set方法 
	 * @param id 
	 */
	public void setBookmetadataid(Long bookmetadataid) {
		this.bookmetadataid = bookmetadataid;
	}
	/**
	 * 属性 dfilepath 的get方法 
	 * @return id
	 */
	public String getDfilepath() {
		return this.dfilepath;
	}
	/**
	 * 属性 dfilepath 的set方法 
	 * @param id 
	 */
	public void setDfilepath(String dfilepath) {
		this.dfilepath = dfilepath;
	}
	/**
	 * 属性 gname 的get方法 
	 * @return id
	 */
	public String getGname() {
		return this.gname;
	}
	/**
	 * 属性 gname 的set方法 
	 * @param id 
	 */
	public void setGname(String gname) {
		this.gname = gname;
	}
	/**
	 * 属性 gfile 的get方法 
	 * @return id
	 */
	public String getGfile() {
		return this.gfile;
	}
	/**
	 * 属性 gfile 的set方法 
	 * @param id 
	 */
	public void setGfile(String gfile) {
		this.gfile = gfile;
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
	* <p>Description: ProductsBookAppDomain 自动生成的hashcode方法</p> 
	* @author John.Zhao   
	* @date 2015年01月27日  15:36:01
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
	* <p>Description:ProductsBookAppDomain 自动生成的equals方法 </p> 
	* @author John.Zhao   
	* @date 2015年01月27日  15:36:01
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
		ProductsBookAppDomain other =(ProductsBookAppDomain) obj;
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
	* <p>Description:ProductsBookAppDomain 自动生成的toString方法 </p> 
	* @author John.Zhao   
	* @date 2015年01月27日  15:36:01 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductsBookAppDomain [" +
					"id=" + id + "," + 
					"metadataid=" + metadataid + "," + 
					"modelno=" + modelno + "," + 
					"bookmetadataid=" + bookmetadataid + "," + 
					"dfilepath=" + dfilepath + "," + 
					"gname=" + gname + "," + 
					"gfile=" + gfile + "," + 
					"synchronousTime=" + synchronousTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
