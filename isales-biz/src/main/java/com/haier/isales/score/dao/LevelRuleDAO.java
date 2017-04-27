/**
 * @Company 青鸟软通   
 * @Title: LevelRuleDAO.java 
 * @Package  com.haier.isales.score.dao
 * @author Liu Wenjie   
 * @date 2014年11月22日  23:27:43
 * @version V1.0   
 */
package com.haier.isales.score.dao;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.score.domain.LevelRuleDomain;
/** 
 * @ClassName: LevelRuleDAO
 * @Description: LevelRule的DAO接口定义类
 *  
 */
public interface LevelRuleDAO extends CommonDAO<LevelRuleDomain,Integer>{
	
	/** 
	* @Description: 按照当前用户的等级，查找第一个使用的等级规则
	* @author Liu Wenjie   
	* @date 2014-11-24 下午8:44:50 
	* @param curentLevel
	* @return  
	*/ 
	public LevelRuleDomain findByCurrentLevel(Integer curentLevel);
}
