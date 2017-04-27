/**
* @Company 青鸟软通   
* @Title: ProModelDomain.java 
* @Package com.haier.isales.basicInfo.proModel.domain 
* @author Guo Yuchao   
* @date 2014年11月15日  11:41:37 
* @version V1.0   
*/ 
package com.haier.isales.basicinfo.promodel.domain;

import java.io.Serializable;

/** 
 * @ClassName: ProModelDomain 
 * t_isales_pro_model 自动生成的对应的实体对象   
 *  
 */
public class ProModelDomain implements Serializable{
	private static final long serialVersionUID = -1416022897295L;
	public static final int PRODCODE_LENGTH = 9;
	
	public static final int PRODCODE_NEW_BARCODE = 22;
	public static final int PRODCODE_NEW_LENGTH = 11;

	private String prodcode;		//产品型号编码，产品的条码前9位即型号编码

	private String prdn;		//产品型号名称

	private String categoryE;		//产品组编码

	private String categoryEName;		//产品组名称

	private String proBrandName;		// 品牌

	private java.util.Date markDate;		//上市时间
		
	/*=========================getter and setter ===================*/
	/**
	 * 属性 prodcode 的get方法 
	 * @return id
	 */
	public String getProdcode() {
		return this.prodcode;
	}
	/**
	 * 属性 prodcode 的set方法 
	 * @param id 
	 */
	public void setProdcode(String prodcode) {
		this.prodcode = prodcode;
	}
	/**
	 * 属性 prdn 的get方法 
	 * @return id
	 */
	public String getPrdn() {
		return this.prdn;
	}
	/**
	 * 属性 prdn 的set方法 
	 * @param id 
	 */
	public void setPrdn(String prdn) {
		this.prdn = prdn;
	}
	/**
	 * 属性 categoryE 的get方法 
	 * @return id
	 */
	public String getCategoryE() {
		return this.categoryE;
	}
	/**
	 * 属性 categoryE 的set方法 
	 * @param id 
	 */
	public void setCategoryE(String categoryE) {
		this.categoryE = categoryE;
	}
	/**
	 * 属性 categoryEName 的get方法 
	 * @return id
	 */
	public String getCategoryEName() {
		return this.categoryEName;
	}
	/**
	 * 属性 categoryEName 的set方法 
	 * @param id 
	 */
	public void setCategoryEName(String categoryEName) {
		this.categoryEName = categoryEName;
	}
	/**
	 * 属性 proBrandName 的get方法 
	 * @return id
	 */
	public String getProBrandName() {
		return this.proBrandName;
	}
	/**
	 * 属性 proBrandName 的set方法 
	 * @param id 
	 */
	public void setProBrandName(String proBrandName) {
		this.proBrandName = proBrandName;
	}
	/**
	 * 属性 markDate 的get方法 
	 * @return id
	 */
	public java.util.Date getMarkDate() {
		return this.markDate;
	}
	/**
	 * 属性 markDate 的set方法 
	 * @param id 
	 */
	public void setMarkDate(java.util.Date markDate) {
		this.markDate = markDate;
	}

	/*====================hashCode and equals ====================*/
    /**
	* <p>Description: ProModelDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2014年11月15日  11:41:37
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((prodcode == null) ? 0 : prodcode.hashCode());
		return result;
	}
	/**
	* <p>Description:ProModelDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月15日  11:41:37
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
		ProModelDomain other =(ProModelDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (prodcode == null) {if (other.prodcode != null){ return false;} else if (!prodcode.equals(other.prodcode)){ return false;}}
		*/
		if (prodcode == null) {
			if (other.prodcode != null){ 
				return false;
			}
		}else if (!prodcode.equals(other.prodcode)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:ProModelDomain 自动生成的toString方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月15日  11:41:37 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ProModelDomain [" +
					"prodcode=" + prodcode + "," + 
					"prdn=" + prdn + "," + 
					"categoryE=" + categoryE + "," + 
					"categoryEName=" + categoryEName + "," + 
					"proBrandName=" + proBrandName + "," + 
					"markDate=" + markDate + "," + 
				"]";
	}
}
