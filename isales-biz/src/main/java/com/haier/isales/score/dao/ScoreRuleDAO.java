/**
 * @Company 青鸟软通   
 * @Title: ScoreRuleDAO.java 
 * @Package  com.haier.isales.score.dao
 * @author Liu Wenjie   
 * @date 2014年11月22日  23:28:42
 * @version V1.0   
 */
package com.haier.isales.score.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.score.domain.ScoreRuleDomain;
/** 
 * @ClassName: ScoreRuleDAO
 * @Description: ScoreRule的DAO接口定义类
 *  
 */
public interface ScoreRuleDAO extends CommonDAO<ScoreRuleDomain,Long>{
	
	/** 
	* @Description: 使用id的链接字符串进行查询对应的积分
	* @author Liu Wenjie   
	* @date 2014-11-23 上午12:09:14 
	* @param ids
	* @return  
	*/ 
	public List<ScoreRuleDomain> findByIds(@Param("ids")String ids);
}
