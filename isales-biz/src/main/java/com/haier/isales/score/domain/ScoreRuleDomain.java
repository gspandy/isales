/**
* @Company 青鸟软通   
* @Title: ScoreRuleDomain.java 
* @Package com.haier.isales.score.domain 
* @author Liu Wenjie   
* @date 2014年11月22日  23:56:02 
* @version V1.0   
*/ 
package com.haier.isales.score.domain;

import java.io.Serializable;

/** 
 * @ClassName: ScoreRuleDomain 
 * t_isales_score_rule 自动生成的对应的实体对象   
 *  
 */
public class ScoreRuleDomain implements Serializable{
	private static final long serialVersionUID = -1416671762513L;

	/** 
	* @Fields id : 规则的主键
	*/
	private Long id;
	/** 
	* @Fields scoreExpression : 规则对应的积分算法
	*/
	private String scoreExpression;
	/** 
	* @Fields contentExpression : 规则对应的显示内容表达式
	*/
	private String contentExpression;
	/** 
	* @Fields remark : 规则描述
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
	 * 属性 contentExpression 的get方法 
	 * @return id
	 */
	public String getContentExpression() {
		return this.contentExpression;
	}
	/**
	 * 属性 contentExpression 的set方法 
	 * @param id 
	 */
	public void setContentExpression(String contentExpression) {
		this.contentExpression = contentExpression;
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
	* <p>Description: ScoreRuleDomain 自动生成的hashcode方法</p> 
	* @author Liu Wenjie   
	* @date 2014年11月22日  23:56:02
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
	* <p>Description:ScoreRuleDomain 自动生成的equals方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月22日  23:56:02
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
		ScoreRuleDomain other =(ScoreRuleDomain) obj;
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
	* <p>Description:ScoreRuleDomain 自动生成的toString方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月22日  23:56:02 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ScoreRuleDomain [" +
					"id=" + id + "," + 
					"scoreExpression=" + scoreExpression + "," + 
					"contentExpression=" + contentExpression + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
