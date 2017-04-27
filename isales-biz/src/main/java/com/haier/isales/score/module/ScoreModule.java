/**
* @Company 青鸟软通   
* @Title: ScoreModule.java 
* @Package com.haier.isales.score.module 
* @author Liu Wenjie   
* @date 2014-11-24 下午12:45:04 
* @version V1.0   
*/ 
package com.haier.isales.score.module;

import java.util.List;
import java.util.Map;

import com.haier.isales.score.module.ScoreConstants.ScoreType;

/** 
 * @ClassName: ScoreModule 
 * @Description: 当进行积分计算时的积分模块
 *  
 */
public class ScoreModule {
	/** 
	* @Fields scoreType : 计算积分的类型，支持的类型可以从ScoreType的Enum类中获取
	*/ 
	private ScoreType scoreType;
	
	/** 
	* @Fields operatorId : 当前用户的ID
	*/ 
	private Long operatorId;
	
	/** 
	* @Fields targetId : 操作的目标id，进行关联记录积分明细时使用的 
	*/ 
	private List<String> targetId;
	
	/** 
	* @Fields extendVariable : 扩展的变量集合
	*/ 
	private Map<String,Object> extendVariable;

	
	
	/*=====================getter ands setter =======================*/
	/**
	 * @Description: 属性 scoreType 的get方法 
	 * @return scoreType
	 */
	public ScoreType getScoreType() {
		return scoreType;
	}

	/**
	 * @Description: 属性 scoreType 的set方法 
	 * @param scoreType 
	 */
	public void setScoreType(ScoreType scoreType) {
		this.scoreType = scoreType;
	}

	/**
	 * @Description: 属性 operatorId 的get方法 
	 * @return operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}

	/**
	 * @Description: 属性 operatorId 的set方法 
	 * @param operatorId 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * @Description: 属性 targetId 的get方法 
	 * @return targetId
	 */
	public List<String> getTargetId() {
		return targetId;
	}

	/**
	 * @Description: 属性 targetId 的set方法 
	 * @param targetId 
	 */
	public void setTargetId(List<String> targetId) {
		this.targetId = targetId;
	}

	/**
	 * @Description: 属性 extendVariable 的get方法 
	 * @return extendVariable
	 */
	public Map<String, Object> getExtendVariable() {
		return extendVariable;
	}

	/**
	 * @Description: 属性 extendVariable 的set方法 
	 * @param extendVariable 
	 */
	public void setExtendVariable(Map<String, Object> extendVariable) {
		this.extendVariable = extendVariable;
	}
	
}
