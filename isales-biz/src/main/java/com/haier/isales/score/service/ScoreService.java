/**
 * @Company 青鸟软通   
 * @Title: ScoreService.java 
 * @Package  com.haier.isales.score.service
 * @author Liu Wenjie   
 * @date 2014年11月22日  23:35:53
 * @version V1.0   
 */
package com.haier.isales.score.service;

import java.util.List;

import com.haier.isales.score.dto.ScoreDTO;
import com.haier.isales.score.module.ScoreModule;

/** 
 * @ClassName: ScoreService
 * @Description: Score的Service接口定义类
 *  
 */
public interface ScoreService {
/** 
	* @Description:  获取当前等级所需的分数
	* @author Guo Yuchao   
	* @date 2014-11-25 下午8:41:54 
	* @param pointLevel
	* @return  
	*/ 
	public Integer getCurrentLevelScore(Integer pointLevel);
		
	/** 
	* @Description: 根据当前用户和对应的业务逻辑，来决定产生多少积分
	* @author Liu Wenjie   
	* @date 2014-11-23 上午12:28:51 
	* @param scoreModule
	* @return  
	*/ 
	public List<ScoreDTO> addScoreUseScoreRule(ScoreModule scoreModule);
	
	
}
