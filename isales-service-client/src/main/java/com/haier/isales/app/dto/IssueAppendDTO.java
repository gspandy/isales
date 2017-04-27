/**
* @Company 青鸟软通   
* @Title: IssueAppendDTO.java 
* @Package com.haier.isales.app.dto 
* @author R Core  
* @date 2015-3-3 下午5:24:19 
* @version V1.0   
*/ 
package com.haier.isales.app.dto;

import java.io.Serializable;


/** 
 * @ClassName: IssueAppendDTO 
 * @Description: 问题追问的内容
 *  
 */
public class IssueAppendDTO implements Serializable {

	/** 
	* @Fields serialVersionUID :  
	*/ 
	private static final long serialVersionUID = 7703013619662504339L;
	private String cldz;  //CLDZ       (固定)追问
	private String clsj;  //CLSJ        追问时间，日期类型
	private String clr;  //CLR         追问人
	private String clrbh;  //CLRBH     追问人工号
	private String jdnr;  //JDNR       追问内容
	/** 
	* <p>Description: 构造方法</p> 
	* @author R Core  
	* @date 2015-3-3 下午5:30:36  
	*/ 
	public IssueAppendDTO() {
		super();
	}
	
	//================getters & setters======================
	/**
	 * @Description: 属性 cldz 的get方法 
	 * @return cldz
	 */
	public String getCldz() {
		return cldz;
	}
	/**
	 * @Description: 属性 cldz 的set方法 
	 * @param cldz 
	 */
	public void setCldz(String cldz) {
		this.cldz = cldz;
	}
	/**
	 * @Description: 属性 clsj 的get方法 
	 * @return clsj
	 */
	public String getClsj() {
		return clsj;
	}
	/**
	 * @Description: 属性 clsj 的set方法 
	 * @param clsj 
	 */
	public void setClsj(String clsj) {
		this.clsj = clsj;
	}
	/**
	 * @Description: 属性 clr 的get方法 
	 * @return clr
	 */
	public String getClr() {
		return clr;
	}
	/**
	 * @Description: 属性 clr 的set方法 
	 * @param clr 
	 */
	public void setClr(String clr) {
		this.clr = clr;
	}
	/**
	 * @Description: 属性 clrbh 的get方法 
	 * @return clrbh
	 */
	public String getClrbh() {
		return clrbh;
	}
	/**
	 * @Description: 属性 clrbh 的set方法 
	 * @param clrbh 
	 */
	public void setClrbh(String clrbh) {
		this.clrbh = clrbh;
	}
	/**
	 * @Description: 属性 jdnr 的get方法 
	 * @return jdnr
	 */
	public String getJdnr() {
		return jdnr;
	}
	/**
	 * @Description: 属性 jdnr 的set方法 
	 * @param jdnr 
	 */
	public void setJdnr(String jdnr) {
		this.jdnr = jdnr;
	}
	
	//================toString====================
	/**
	* <p>Description: IssueAppendDTO自动生成的toString方法</p> 
	* @author R Core 
	* @date 2015-3-3 下午5:30:49 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "IssueAppendDTO [cldz=" + cldz + ", clsj=" + clsj + ", clr="
				+ clr + ", clrbh=" + clrbh + ", jdnr=" + jdnr + "]";
	}
}
