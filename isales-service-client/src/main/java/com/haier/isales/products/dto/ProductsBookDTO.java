/**
* @Company 青鸟软通   
* @Title: ProductsBookDTO.java 
* @Package com.haier.isales.products.dto 
* @author John zhao   
* @date 2015-1-27 下午4:16:43 
* @version V1.0   
*/ 
package com.haier.isales.products.dto;

import java.io.Serializable;

/** 
 * @ClassName: ProductsBookDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsBookDTO implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 4820650240998214357L;

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
	* @Fields remark : 备注
	*/
	private String remark;
	
	/*=================getters & setters===================*/
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
	 * @Description: 属性 bookmetadataid 的get方法 
	 * @return bookmetadataid
	 */
	public Long getBookmetadataid() {
		return bookmetadataid;
	}
	/**
	 * @Description: 属性 bookmetadataid 的set方法 
	 * @param bookmetadataid 
	 */
	public void setBookmetadataid(Long bookmetadataid) {
		this.bookmetadataid = bookmetadataid;
	}
	/**
	 * @Description: 属性 dfilepath 的get方法 
	 * @return dfilepath
	 */
	public String getDfilepath() {
		return dfilepath;
	}
	/**
	 * @Description: 属性 dfilepath 的set方法 
	 * @param dfilepath 
	 */
	public void setDfilepath(String dfilepath) {
		this.dfilepath = dfilepath;
	}
	/**
	 * @Description: 属性 gname 的get方法 
	 * @return gname
	 */
	public String getGname() {
		return gname;
	}
	/**
	 * @Description: 属性 gname 的set方法 
	 * @param gname 
	 */
	public void setGname(String gname) {
		this.gname = gname;
	}
	/**
	 * @Description: 属性 gfile 的get方法 
	 * @return gfile
	 */
	public String getGfile() {
		return gfile;
	}
	/**
	 * @Description: 属性 gfile 的set方法 
	 * @param gfile 
	 */
	public void setGfile(String gfile) {
		this.gfile = gfile;
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
	
	/*======================toString=======================*/
	/**
	* <p>Description: ProductsBookDTO自动生成的toString方法</p> 
	* @author John zhao   
	* @date 2015-1-27 下午4:17:41 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductsBookDTO [id=" + id + ", metadataid=" + metadataid + ", modelno=" + modelno
				+ ", bookmetadataid=" + bookmetadataid + ", dfilepath=" + dfilepath + ", gname=" + gname + ", gfile="
				+ gfile + ", remark=" + remark + "]";
	}
	
	/*=======================hashCode & equals=========================*/
	/**
	* <p>Description: ProductsBookDTO自动生成的hashCode方法</p> 
	* @author John zhao   
	* @date 2015-1-27 下午4:17:49 
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookmetadataid == null) ? 0 : bookmetadataid.hashCode());
		result = prime * result + ((dfilepath == null) ? 0 : dfilepath.hashCode());
		result = prime * result + ((gfile == null) ? 0 : gfile.hashCode());
		result = prime * result + ((gname == null) ? 0 : gname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((metadataid == null) ? 0 : metadataid.hashCode());
		result = prime * result + ((modelno == null) ? 0 : modelno.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		return result;
	}
	/**
	* <p>Description: ProductsBookDTO自动生成的equals方法</p> 
	* @author John zhao   
	* @date 2015-1-27 下午4:17:49 
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
		ProductsBookDTO other = (ProductsBookDTO) obj;
		if (bookmetadataid == null) {
			if (other.bookmetadataid != null){
				return false;
			}
		} else if (!bookmetadataid.equals(other.bookmetadataid)){
			return false;
		}
		if (dfilepath == null) {
			if (other.dfilepath != null){
				return false;
			}
		} else if (!dfilepath.equals(other.dfilepath)){
			return false;
		}
		if (gfile == null) {
			if (other.gfile != null){
				return false;
			}
		} else if (!gfile.equals(other.gfile)){
			return false;
		}
		if (gname == null) {
			if (other.gname != null){
				return false;
			}
		} else if (!gname.equals(other.gname)){
			return false;
		}
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
		if (remark == null) {
			if (other.remark != null){
				return false;
			}
		} else if (!remark.equals(other.remark)){
			return false;
		}
		return true;
	}
	
}
