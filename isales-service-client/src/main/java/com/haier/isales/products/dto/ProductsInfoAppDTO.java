/**
* @Company 青鸟软通   
* @Title: ProductsInfoAppDTO.java 
* @Package com.haier.isales.products.dto 
* @author John zhao   
* @date 2015-1-28 下午3:57:29 
* @version V1.0   
*/ 
package com.haier.isales.products.dto;

import java.io.Serializable;


/** 
 * @ClassName: ProductsInfoAppDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsInfoAppDTO implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -281080255710228202L;

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
	* @Fields remark : 备注
	*/
	private String remark;
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * @Description: 属性 metadataid 的get方法 
	 * @return id
	 */
	public Long getMetadataid() {
		return this.metadataid;
	}
	/**
	 * @Description: 属性 metadataid 的set方法 
	 * @param id 
	 */
	public void setMetadataid(Long metadataid) {
		this.metadataid = metadataid;
	}
	/**
	 * @Description: 属性 modelcode 的get方法 
	 * @return id
	 */
	public String getModelcode() {
		return this.modelcode;
	}
	/**
	 * @Description: 属性 modelcode 的set方法 
	 * @param id 
	 */
	public void setModelcode(String modelcode) {
		this.modelcode = modelcode;
	}
	/**
	 * @Description: 属性 modelno 的get方法 
	 * @return id
	 */
	public String getModelno() {
		return this.modelno;
	}
	/**
	 * @Description: 属性 modelno 的set方法 
	 * @param id 
	 */
	public void setModelno(String modelno) {
		this.modelno = modelno;
	}
	/**
	 * @Description: 属性 modelname 的get方法 
	 * @return id
	 */
	public String getModelname() {
		return this.modelname;
	}
	/**
	 * @Description: 属性 modelname 的set方法 
	 * @param id 
	 */
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	/**
	 * @Description: 属性 viewname 的get方法 
	 * @return id
	 */
	public String getViewname() {
		return this.viewname;
	}
	/**
	 * @Description: 属性 viewname 的set方法 
	 * @param id 
	 */
	public void setViewname(String viewname) {
		this.viewname = viewname;
	}
	/**
	 * @Description: 属性 viewdesc 的get方法 
	 * @return id
	 */
	public String getViewdesc() {
		return this.viewdesc;
	}
	/**
	 * @Description: 属性 viewdesc 的set方法 
	 * @param id 
	 */
	public void setViewdesc(String viewdesc) {
		this.viewdesc = viewdesc;
	}
	/**
	 * @Description: 属性 channeldescstrs 的get方法 
	 * @return id
	 */
	public String getChanneldescstrs() {
		return this.channeldescstrs;
	}
	/**
	 * @Description: 属性 channeldescstrs 的set方法 
	 * @param id 
	 */
	public void setChanneldescstrs(String channeldescstrs) {
		this.channeldescstrs = channeldescstrs;
	}
	/**
	 * @Description: 属性 proLineCode 的get方法 
	 * @return id
	 */
	public String getProLineCode() {
		return this.proLineCode;
	}
	/**
	 * @Description: 属性 proLineCode 的set方法 
	 * @param id 
	 */
	public void setProLineCode(String proLineCode) {
		this.proLineCode = proLineCode;
	}
	/**
	 * @Description: 属性 proLineName 的get方法 
	 * @return id
	 */
	public String getProLineName() {
		return this.proLineName;
	}
	/**
	 * @Description: 属性 proLineName 的set方法 
	 * @param id 
	 */
	public void setProLineName(String proLineName) {
		this.proLineName = proLineName;
	}
	/**
	 * @Description: 属性 salesChannel 的get方法 
	 * @return id
	 */
	public String getSalesChannel() {
		return this.salesChannel;
	}
	/**
	 * @Description: 属性 salesChannel 的set方法 
	 * @param id 
	 */
	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}
	/**
	 * @Description: 属性 modelImg 的get方法 
	 * @return id
	 */
	public String getModelImg() {
		return this.modelImg;
	}
	/**
	 * @Description: 属性 modelImg 的set方法 
	 * @param id 
	 */
	public void setModelImg(String modelImg) {
		this.modelImg = modelImg;
	}
	/**
	 * @Description: 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * @Description: 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/*=================toString====================*/
	/**
	* <p>Description: ProductsInfoAppDTO自动生成的toString方法</p> 
	* @author John zhao   
	* @date 2015-1-29 下午6:16:21 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProductsInfoAppDTO [metadataid=" + metadataid + ", modelcode=" + modelcode + ", modelno=" + modelno
				+ ", modelname=" + modelname + ", viewname=" + viewname + ", viewdesc=" + viewdesc
				+ ", channeldescstrs=" + channeldescstrs + ", proLineCode=" + proLineCode + ", proLineName="
				+ proLineName + ", salesChannel=" + salesChannel + ", modelImg=" + modelImg + ", remark=" + remark
				+ "]";
	}
	
	/*==================hashCode & equals==================*/
	/**
	* <p>Description: ProductsInfoAppDTO自动生成的hashCode方法</p> 
	* @author John zhao   
	* @date 2015-1-29 下午6:16:34 
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((channeldescstrs == null) ? 0 : channeldescstrs.hashCode());
		result = prime * result + ((metadataid == null) ? 0 : metadataid.hashCode());
		result = prime * result + ((modelImg == null) ? 0 : modelImg.hashCode());
		result = prime * result + ((modelcode == null) ? 0 : modelcode.hashCode());
		result = prime * result + ((modelname == null) ? 0 : modelname.hashCode());
		result = prime * result + ((modelno == null) ? 0 : modelno.hashCode());
		result = prime * result + ((proLineCode == null) ? 0 : proLineCode.hashCode());
		result = prime * result + ((proLineName == null) ? 0 : proLineName.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((salesChannel == null) ? 0 : salesChannel.hashCode());
		result = prime * result + ((viewdesc == null) ? 0 : viewdesc.hashCode());
		result = prime * result + ((viewname == null) ? 0 : viewname.hashCode());
		return result;
	}
	/**
	* <p>Description: ProductsInfoAppDTO自动生成的equals方法</p> 
	* @author John zhao   
	* @date 2015-1-29 下午6:16:34 
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
		ProductsInfoAppDTO other = (ProductsInfoAppDTO) obj;
		if (channeldescstrs == null) {
			if (other.channeldescstrs != null){
				return false;
			}
		} else if (!channeldescstrs.equals(other.channeldescstrs)){
			return false;
		}
		if (metadataid == null) {
			if (other.metadataid != null){
				return false;
			}
		} else if (!metadataid.equals(other.metadataid)){
			return false;
		}
		if (modelImg == null) {
			if (other.modelImg != null){
				return false;
			}
		} else if (!modelImg.equals(other.modelImg)){
			return false;
		}
		if (modelcode == null) {
			if (other.modelcode != null){
				return false;
			}
		} else if (!modelcode.equals(other.modelcode)){
			return false;
		}
		if (modelname == null) {
			if (other.modelname != null){
				return false;
			}
		} else if (!modelname.equals(other.modelname)){
			return false;
		}
		if (modelno == null) {
			if (other.modelno != null){
				return false;
			}
		} else if (!modelno.equals(other.modelno)){
			return false;
		}
		if (proLineCode == null) {
			if (other.proLineCode != null){
				return false;
			}
		} else if (!proLineCode.equals(other.proLineCode)){
			return false;
		}
		if (proLineName == null) {
			if (other.proLineName != null){
				return false;
			}
		} else if (!proLineName.equals(other.proLineName)){
			return false;
		}
		if (remark == null) {
			if (other.remark != null){
				return false;
			}
		} else if (!remark.equals(other.remark)){
			return false;
		}
		if (salesChannel == null) {
			if (other.salesChannel != null){
				return false;
			}
		} else if (!salesChannel.equals(other.salesChannel)){
			return false;
		}
		if (viewdesc == null) {
			if (other.viewdesc != null){
				return false;
			}
		} else if (!viewdesc.equals(other.viewdesc)){
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
