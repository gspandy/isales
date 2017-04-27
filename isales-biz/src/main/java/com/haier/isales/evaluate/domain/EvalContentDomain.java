/**
* @Company 青鸟软通   
* @Title: EvalContentDomain.java 
* @Package com.haier.isales.evaluate.domain 
* @author lizhenwei   
* @date 2016年04月27日  10:02:31 
* @version V1.0   
*/ 
package com.haier.isales.evaluate.domain;

import java.io.Serializable;

/** 
 * @ClassName: EvalContentDomain 
 * @Description: t_user_evaluate_content 自动生成的对应的实体对象   
 *  
 */
public class EvalContentDomain implements Serializable{
	private static final long serialVersionUID = -1461722551747L;

	/** 
	* @Fields uecId : 主键ID，自动递增，无实际意义
	*/
	private Integer uecId;
	/** 
	* @Fields uecSeq : 题目序号
	*/
	private Integer uecSeq;
	/** 
	* @Fields uecContent : 评价内容
	*/
	private String uecContent;
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * @Description: 属性 uecId 的get方法 
	 * @return id
	 */
	public Integer getUecId() {
		return this.uecId;
	}
	/**
	 * @Description: 属性 uecId 的set方法 
	 * @param id 
	 */
	public void setUecId(Integer uecId) {
		this.uecId = uecId;
	}
	/**
	 * @Description: 属性 uecSeq 的get方法 
	 * @return id
	 */
	public Integer getUecSeq() {
		return this.uecSeq;
	}
	/**
	 * @Description: 属性 uecSeq 的set方法 
	 * @param id 
	 */
	public void setUecSeq(Integer uecSeq) {
		this.uecSeq = uecSeq;
	}
	/**
	 * @Description: 属性 uecContent 的get方法 
	 * @return id
	 */
	public String getUecContent() {
		return this.uecContent;
	}
	/**
	 * @Description: 属性 uecContent 的set方法 
	 * @param id 
	 */
	public void setUecContent(String uecContent) {
		this.uecContent = uecContent;
	}
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: EvalContentDomain 自动生成的hashcode方法</p> 
	* @author lizhenwei   
	* @date 2016年04月27日  10:02:31
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((uecId == null) ? 0 : uecId.hashCode());
		return result;
	}
	/**
	* <p>Description:EvalContentDomain 自动生成的equals方法 </p> 
	* @author lizhenwei   
	* @date 2016年04月27日  10:02:31
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EvalContentDomain other =(EvalContentDomain) obj;
		if (uecId == null) {if (other.uecId != null){ return false;} else if (!uecId.equals(other.uecId)){ return false;}}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:EvalContentDomain 自动生成的toString方法 </p> 
	* @author lizhenwei   
	* @date 2016年04月27日  10:02:31 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "EvalContentDomain [" +
					"uecId=" + uecId + "," + 
					"uecSeq=" + uecSeq + "," + 
					"uecContent=" + uecContent + "," + 
				"]";
	}
	
	
}
