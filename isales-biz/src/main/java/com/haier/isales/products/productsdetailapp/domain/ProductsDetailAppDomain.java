/**
* @Company 青鸟软通   
* @Title: ProductsDetailAppDomain.java 
* @Package com.haier.isales.products.productsdetailapp.domain 
* @author John.Zhao   
* @date 2015年01月27日  13:53:56 
* @version V1.0   
*/ 
package com.haier.isales.products.productsdetailapp.domain;

import java.io.Serializable;

/** 
 * @ClassName: ProductsDetailAppDomain 
 * t_isales_products_detail 自动生成的对应的实体对象   
 *  
 */
public class ProductsDetailAppDomain implements Serializable{
	private static final long serialVersionUID = -1422338036735L;

	/** 
	* @Fields id : id
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
	* @Fields chnlpath : 产品分类层级
	*/
	private String chnlpath;
	/** 
	* @Fields docpuburl : 详细内容链接
	*/
	private String docpuburl;
	/** 
	* @Fields pic : 产品介绍图片
	*/
	private String pic;
	/** 
	* @Fields title : 产品介绍标题
	*/
	private String title;
	/** 
	* @Fields subtitle : 产品介绍子标题
	*/
	private String subtitle;
	/** 
	* @Fields content : 产品介绍内容
	*/
	private String content;
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
	 * 属性 chnlpath 的get方法 
	 * @return id
	 */
	public String getChnlpath() {
		return this.chnlpath;
	}
	/**
	 * 属性 chnlpath 的set方法 
	 * @param id 
	 */
	public void setChnlpath(String chnlpath) {
		this.chnlpath = chnlpath;
	}
	/**
	 * 属性 docpuburl 的get方法 
	 * @return id
	 */
	public String getDocpuburl() {
		return this.docpuburl;
	}
	/**
	 * 属性 docpuburl 的set方法 
	 * @param id 
	 */
	public void setDocpuburl(String docpuburl) {
		this.docpuburl = docpuburl;
	}
	/**
	 * 属性 pic 的get方法 
	 * @return id
	 */
	public String getPic() {
		return this.pic;
	}
	/**
	 * 属性 pic 的set方法 
	 * @param id 
	 */
	public void setPic(String pic) {
		this.pic = pic;
	}
	/**
	 * 属性 title 的get方法 
	 * @return id
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * 属性 title 的set方法 
	 * @param id 
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 属性 subtitle 的get方法 
	 * @return id
	 */
	public String getSubtitle() {
		return this.subtitle;
	}
	/**
	 * 属性 subtitle 的set方法 
	 * @param id 
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	/**
	 * 属性 content 的get方法 
	 * @return id
	 */
	public String getContent() {
		return this.content;
	}
	/**
	 * 属性 content 的set方法 
	 * @param id 
	 */
	public void setContent(String content) {
		this.content = content;
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
	* <p>Description: ProductsDetailAppDomain 自动生成的hashcode方法</p> 
	* @author John.Zhao   
	* @date 2015年01月27日  13:53:56
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
	* <p>Description:ProductsDetailAppDomain 自动生成的equals方法 </p> 
	* @author John.Zhao   
	* @date 2015年01月27日  13:53:56
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
		ProductsDetailAppDomain other =(ProductsDetailAppDomain) obj;
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
	* <p>Description:ProductsDetailAppDomain 自动生成的toString方法 </p> 
	* @author John.Zhao   
	* @date 2015年01月27日  13:53:56 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductsDetailAppDomain [" +
					"id=" + id + "," + 
					"metadataid=" + metadataid + "," + 
					"modelno=" + modelno + "," + 
					"viewname=" + viewname + "," + 
					"chnlpath=" + chnlpath + "," + 
					"docpuburl=" + docpuburl + "," + 
					"pic=" + pic + "," + 
					"title=" + title + "," + 
					"subtitle=" + subtitle + "," + 
					"content=" + content + "," + 
					"synchronousTime=" + synchronousTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
