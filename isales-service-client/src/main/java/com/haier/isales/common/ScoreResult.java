/**
* @Company 青鸟软通   
* @Title: ScoreResult.java 
* @Package com.haier.isales.common 
* @author Liu Wenjie   
* @date 2014-11-24 下午1:48:43 
* @version V1.0   
*/ 
package com.haier.isales.common;

import java.io.Serializable;
import java.util.List;

import com.haier.isales.score.dto.ScoreDTO;

/** 
 * @ClassName: ScoreResult 
 * @Description: service层带积分的返回结果对象
 *  
 */
public class ScoreResult implements Serializable {

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = -2406163386008897757L;

	/** 
	* @Fields result : 原有的业务处理返回的结果对象
	*/ 
	private Object result;
	
	/** 
	* @Fields scoreList : 积分结果对象
	*/ 
	private List<ScoreDTO> scoreList;

	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-11-24 下午4:56:10  
	*/ 
	public ScoreResult() {
		super();
	}
	public ScoreResult(Object result,List<ScoreDTO> scoreList) {
		super();
		this.result = result;
		this.scoreList = scoreList;
	}
	

	/**
	 * @Description: 属性 result 的get方法 
	 * @return result
	 */
	public Object getResult() {
		return result;
	}

	/**
	 * @Description: 属性 result 的set方法 
	 * @param result 
	 */
	public void setResult(Object result) {
		this.result = result;
	}

	/**
	 * @Description: 属性 scoreList 的get方法 
	 * @return scoreList
	 */
	public List<ScoreDTO> getScoreList() {
		return scoreList;
	}

	/**
	 * @Description: 属性 scoreList 的set方法 
	 * @param scoreList 
	 */
	public void setScoreList(List<ScoreDTO> scoreList) {
		this.scoreList = scoreList;
	}
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:03:26 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ScoreResult [result=" + result + ", scoreList=" + scoreList
				+ "]";
	}
	
	
}
