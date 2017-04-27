/**
* @Company 青鸟软通   
* @Title: ScoreDTO.java 
* @Package com.haier.isales.score.dto 
* @author Liu Wenjie   
* @date 2014-11-23 上午12:27:56 
* @version V1.0   
*/ 
package com.haier.isales.score.dto;

import java.io.Serializable;

/** 
 * @ClassName: ScoreDTO 
 * @Description: 保存积分内容的DTO 对象 
 *  
 */
public class ScoreDTO implements Serializable{

	/** 
	* @Fields serialVersionUID :
	*/ 
	private static final long serialVersionUID = 3152071901829655307L;

	/** 
	* @Fields scoreValue : 获得的积分的值
	*/ 
	private int scoreValue;
	/** 
	* @Fields socoreDiscription : 获得积分的原因描述
	*/ 
	private String socoreDiscription;
	
	
	
	
	/*===============getter and setter ===============*/
	/**
	 * @Description: 属性 scoreValue 的get方法 
	 * @return scoreValue
	 */
	public int getScoreValue() {
		return scoreValue;
	}
	/**
	 * @Description: 属性 scoreValue 的set方法 
	 * @param scoreValue 
	 */
	public void setScoreValue(int scoreValue) {
		this.scoreValue = scoreValue;
	}
	/**
	 * @Description: 属性 socoreDiscription 的get方法 
	 * @return socoreDiscription
	 */
	public String getSocoreDiscription() {
		return socoreDiscription;
	}
	/**
	 * @Description: 属性 socoreDiscription 的set方法 
	 * @param socoreDiscription 
	 */
	public void setSocoreDiscription(String socoreDiscription) {
		this.socoreDiscription = socoreDiscription;
	}
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:12:17 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ScoreDTO [scoreValue=" + scoreValue + ", socoreDiscription="
				+ socoreDiscription + "]";
	}

	
}
