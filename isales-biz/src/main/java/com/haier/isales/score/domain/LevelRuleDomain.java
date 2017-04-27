/**
* @Company 青鸟软通   
* @Title: LevelRuleDomain.java 
* @Package com.haier.isales.score.domain 
* @author Liu Wenjie   
* @date 2014年11月22日  23:27:43 
* @version V1.0   
*/ 
package com.haier.isales.score.domain;

import java.io.Serializable;

/** 
 * @ClassName: LevelRuleDomain 
 * t_isales_score_level 自动生成的对应的实体对象   
 *  
 */
public class LevelRuleDomain implements Serializable{
	private static final long serialVersionUID = -1416670063866L;

	/** 
	* @Fields id : 主键，无实际意义
	*/
	private Integer id;
	/** 
	* @Fields minLevel : 最小等级限制
	*/
	private Integer minLevel;
	/** 
	* @Fields maxLevel : 最高等级限制
	*/
	private Integer maxLevel;
	/** 
	* @Fields levelExpression : 等级规则的计算，最终的结果是计算出当前用户距离下一次升级需要的积分数
	*/
	private String levelExpression;
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * 属性 id 的get方法 
	 * @return id
	 */
	public Integer getId() {
		return this.id;
	}
	/**
	 * 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 属性 minLevel 的get方法 
	 * @return id
	 */
	public Integer getMinLevel() {
		return this.minLevel;
	}
	/**
	 * 属性 minLevel 的set方法 
	 * @param id 
	 */
	public void setMinLevel(Integer minLevel) {
		this.minLevel = minLevel;
	}
	/**
	 * 属性 maxLevel 的get方法 
	 * @return id
	 */
	public Integer getMaxLevel() {
		return this.maxLevel;
	}
	/**
	 * 属性 maxLevel 的set方法 
	 * @param id 
	 */
	public void setMaxLevel(Integer maxLevel) {
		this.maxLevel = maxLevel;
	}
	/**
	 * 属性 levelExpression 的get方法 
	 * @return id
	 */
	public String getLevelExpression() {
		return this.levelExpression;
	}
	/**
	 * 属性 levelExpression 的set方法 
	 * @param id 
	 */
	public void setLevelExpression(String levelExpression) {
		this.levelExpression = levelExpression;
	}
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: LevelRuleDomain 自动生成的hashcode方法</p> 
	* @author Liu Wenjie   
	* @date 2014年11月22日  23:27:43
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
	* <p>Description:LevelRuleDomain 自动生成的equals方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月22日  23:27:43
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
		LevelRuleDomain other =(LevelRuleDomain) obj;
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
	* <p>Description:LevelRuleDomain 自动生成的toString方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月22日  23:27:43 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "LevelRuleDomain [" +
					"id=" + id + "," + 
					"minLevel=" + minLevel + "," + 
					"maxLevel=" + maxLevel + "," + 
					"levelExpression=" + levelExpression + "," + 
				"]";
	}
	
	
}
