/**
* @Company 青鸟软通   
* @Title: DivisorDomain.java 
* @Package com.haier.isales.score.domain 
* @author Liu Wenjie   
* @date 2014年11月24日  16:00:47 
* @version V1.0   
*/ 
package com.haier.isales.score.domain;

import java.io.Serializable;

/** 
 * @ClassName: DivisorDomain 
 * t_isales_score_divisor 自动生成的对应的实体对象   
 *  
 */
public class DivisorDomain implements Serializable{
	private static final long serialVersionUID = -1416816047083L;

	/** 
	* @Fields id : 主键，无实际意义
	*/
	private Long id;
	/** 
	* @Fields operatorId : 用户主键id
	*/
	private Long operatorId;
	/** 
	* @Fields divisorName : 积分因子名称
	*/
	private String divisorName;
	/** 
	* @Fields divisorValue : 积分因子的值
	*/
	private String divisorValue;
	/** 
	* @Fields updateTime : 本条因子的最后更新时间
	*/
	private java.util.Date updateTime;
		
	
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
	 * 属性 operatorId 的get方法 
	 * @return id
	 */
	public Long getOperatorId() {
		return this.operatorId;
	}
	/**
	 * 属性 operatorId 的set方法 
	 * @param id 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * 属性 divisorName 的get方法 
	 * @return id
	 */
	public String getDivisorName() {
		return this.divisorName;
	}
	/**
	 * 属性 divisorName 的set方法 
	 * @param id 
	 */
	public void setDivisorName(String divisorName) {
		this.divisorName = divisorName;
	}
	/**
	 * 属性 divisorValue 的get方法 
	 * @return id
	 */
	public String getDivisorValue() {
		return this.divisorValue;
	}
	/**
	 * 属性 divisorValue 的set方法 
	 * @param id 
	 */
	public void setDivisorValue(String divisorValue) {
		this.divisorValue = divisorValue;
	}
	/**
	 * 属性 updateTime 的get方法 
	 * @return id
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	/**
	 * 属性 updateTime 的set方法 
	 * @param id 
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: DivisorDomain 自动生成的hashcode方法</p> 
	* @author Liu Wenjie   
	* @date 2014年11月24日  16:00:47
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
	* <p>Description:DivisorDomain 自动生成的equals方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月24日  16:00:47
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		DivisorDomain other =(DivisorDomain) obj;
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
	* <p>Description:DivisorDomain 自动生成的toString方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月24日  16:00:47 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "DivisorDomain [" +
					"id=" + id + "," + 
					"operatorId=" + operatorId + "," + 
					"divisorName=" + divisorName + "," + 
					"divisorValue=" + divisorValue + "," + 
					"updateTime=" + updateTime + "," + 
				"]";
	}
	
	
}
