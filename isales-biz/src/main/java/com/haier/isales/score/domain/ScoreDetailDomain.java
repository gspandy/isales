/**
* @Company 青鸟软通   
* @Title: ScoreDetailDomain.java 
* @Package com.haier.isales.score.domain 
* @author Liu Wenjie   
* @date 2014年11月24日  17:59:21 
* @version V1.0   
*/ 
package com.haier.isales.score.domain;

import java.io.Serializable;

/** 
 * @ClassName: ScoreDetailDomain 
 * t_isales_score_transaction_detail 自动生成的对应的实体对象   
 *  
 */
public class ScoreDetailDomain implements Serializable{
	private static final long serialVersionUID = -1416823161884L;

	/** 
	* @Fields id : 主键，无实际意义
	*/
	private Long id;
	/** 
	* @Fields operatorId : 用户主键id
	*/
	private Long operatorId;
	/** 
	* @Fields scoreValue : 积分因子名称
	*/
	private Long scoreValue;
	/** 
	* @Fields scoreExpression : 积分因子的值
	*/
	private String scoreExpression;
	/** 
	* @Fields divisorParams : 积分变动因子集合
	*/
	private String divisorParams;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
	/** 
	* @Fields scoreRuleId : 积分变动规则id
	*/
	private Long scoreRuleId;
	/** 
	* @Fields scoreSourceIds : 积分变动关联内容id
	*/
	private String scoreSourceIds;
		
	
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
	 * 属性 scoreValue 的get方法 
	 * @return id
	 */
	public Long getScoreValue() {
		return this.scoreValue;
	}
	/**
	 * 属性 scoreValue 的set方法 
	 * @param id 
	 */
	public void setScoreValue(Long scoreValue) {
		this.scoreValue = scoreValue;
	}
	/**
	 * 属性 scoreExpression 的get方法 
	 * @return id
	 */
	public String getScoreExpression() {
		return this.scoreExpression;
	}
	/**
	 * 属性 scoreExpression 的set方法 
	 * @param id 
	 */
	public void setScoreExpression(String scoreExpression) {
		this.scoreExpression = scoreExpression;
	}
	/**
	 * 属性 divisorParams 的get方法 
	 * @return id
	 */
	public String getDivisorParams() {
		return this.divisorParams;
	}
	/**
	 * 属性 divisorParams 的set方法 
	 * @param id 
	 */
	public void setDivisorParams(String divisorParams) {
		this.divisorParams = divisorParams;
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
	/**
	 * 属性 scoreRuleId 的get方法 
	 * @return id
	 */
	public Long getScoreRuleId() {
		return this.scoreRuleId;
	}
	/**
	 * 属性 scoreRuleId 的set方法 
	 * @param id 
	 */
	public void setScoreRuleId(Long scoreRuleId) {
		this.scoreRuleId = scoreRuleId;
	}
	/**
	 * 属性 scoreSourceIds 的get方法 
	 * @return id
	 */
	public String getScoreSourceIds() {
		return this.scoreSourceIds;
	}
	/**
	 * 属性 scoreSourceIds 的set方法 
	 * @param id 
	 */
	public void setScoreSourceIds(String scoreSourceIds) {
		this.scoreSourceIds = scoreSourceIds;
	}
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: ScoreDetailDomain 自动生成的hashcode方法</p> 
	* @author Liu Wenjie   
	* @date 2014年11月24日  17:59:21
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
	* <p>Description:ScoreDetailDomain 自动生成的equals方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月24日  17:59:21
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
		ScoreDetailDomain other =(ScoreDetailDomain) obj;
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
	* <p>Description:ScoreDetailDomain 自动生成的toString方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月24日  17:59:21 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ScoreDetailDomain [" +
					"id=" + id + "," + 
					"operatorId=" + operatorId + "," + 
					"scoreValue=" + scoreValue + "," + 
					"scoreExpression=" + scoreExpression + "," + 
					"divisorParams=" + divisorParams + "," + 
					"remark=" + remark + "," + 
					"scoreRuleId=" + scoreRuleId + "," + 
					"scoreSourceIds=" + scoreSourceIds + "," + 
				"]";
	}
	
	
}
