/**
* @Company 青鸟软通   
* @Title: ProductsDetailDTO.java 
* @Package com.haier.isales.products.dto 
* @author John zhao   
* @date 2015-1-27 下午2:14:31 
* @version V1.0   
*/ 
package com.haier.isales.products.dto;

import java.io.Serializable;

/** 
 * @ClassName: ProductsDetailDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsDetailDTO implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 8761754501840005911L;
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
	* @Fields remark : 备注
	*/
	private String remark;
	
	/*=================getters & setters=================*/
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
	 * @Description: 属性 chnlpath 的get方法 
	 * @return chnlpath
	 */
	public String getChnlpath() {
		return chnlpath;
	}
	/**
	 * @Description: 属性 chnlpath 的set方法 
	 * @param chnlpath 
	 */
	public void setChnlpath(String chnlpath) {
		this.chnlpath = chnlpath;
	}
	/**
	 * @Description: 属性 docpuburl 的get方法 
	 * @return docpuburl
	 */
	public String getDocpuburl() {
		return docpuburl;
	}
	/**
	 * @Description: 属性 docpuburl 的set方法 
	 * @param docpuburl 
	 */
	public void setDocpuburl(String docpuburl) {
		this.docpuburl = docpuburl;
	}
	/**
	 * @Description: 属性 pic 的get方法 
	 * @return pic
	 */
	public String getPic() {
		return pic;
	}
	/**
	 * @Description: 属性 pic 的set方法 
	 * @param pic 
	 */
	public void setPic(String pic) {
		this.pic = pic;
	}
	/**
	 * @Description: 属性 title 的get方法 
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @Description: 属性 title 的set方法 
	 * @param title 
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @Description: 属性 subtitle 的get方法 
	 * @return subtitle
	 */
	public String getSubtitle() {
		return subtitle;
	}
	/**
	 * @Description: 属性 subtitle 的set方法 
	 * @param subtitle 
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	/**
	 * @Description: 属性 content 的get方法 
	 * @return content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @Description: 属性 content 的set方法 
	 * @param content 
	 */
	public void setContent(String content) {
		this.content = content;
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
	/**
	 * @Description: 属性 serialversionuid 的get方法 
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/*==================toString===================*/
	/**
	* <p>Description: ProductsDetailDTO自动生成的toString方法</p> 
	* @author John zhao   
	* @date 2015-1-27 下午2:20:33 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductsDetailDTO [id=" + id + ", metadataid=" + metadataid + ", modelno=" + modelno + ", viewname="
				+ viewname + ", chnlpath=" + chnlpath + ", docpuburl=" + docpuburl + ", pic=" + pic + ", title="
				+ title + ", subtitle=" + subtitle + ", content=" + content + ", remark=" + remark + "]";
	}
	
	/*==================hashCode & equals==================*/
	/**
	* <p>Description: ProductsDetailDTO自动生成的hashCode方法</p> 
	* @author John zhao   
	* @date 2015-1-27 下午2:20:43 
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chnlpath == null) ? 0 : chnlpath.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((docpuburl == null) ? 0 : docpuburl.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((metadataid == null) ? 0 : metadataid.hashCode());
		result = prime * result + ((modelno == null) ? 0 : modelno.hashCode());
		result = prime * result + ((pic == null) ? 0 : pic.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((subtitle == null) ? 0 : subtitle.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((viewname == null) ? 0 : viewname.hashCode());
		return result;
	}
	/**
	* <p>Description: ProductsDetailDTO自动生成的equals方法</p> 
	* @author John zhao   
	* @date 2015-1-27 下午2:20:43 
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
		ProductsDetailDTO other = (ProductsDetailDTO) obj;
		if (chnlpath == null) {
			if (other.chnlpath != null){
				return false;
			}
		} else if (!chnlpath.equals(other.chnlpath)){
			return false;
		}
		if (content == null) {
			if (other.content != null){
				return false;
			}
		} else if (!content.equals(other.content)){
			return false;
		}
		if (docpuburl == null) {
			if (other.docpuburl != null){
				return false;
			}
		} else if (!docpuburl.equals(other.docpuburl)){
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
		if (pic == null) {
			if (other.pic != null){
				return false;
			}
		} else if (!pic.equals(other.pic)){
			return false;
		}
		if (remark == null) {
			if (other.remark != null){
				return false;
			}
		} else if (!remark.equals(other.remark)){
			return false;
		}
		if (subtitle == null) {
			if (other.subtitle != null){
				return false;
			}
		} else if (!subtitle.equals(other.subtitle)){
			return false;
		}
		if (title == null) {
			if (other.title != null){
				return false;
			}
		} else if (!title.equals(other.title)){
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
