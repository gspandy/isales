/**
 * @Company 青鸟软通   
 * @Title: DivisorDAO.java 
 * @Package  com.haier.isales.score.dao
 * @author Liu Wenjie   
 * @date 2014年11月22日  23:25:43
 * @version V1.0   
 */
package com.haier.isales.score.dao;

import java.util.List;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.score.domain.DivisorDomain;
/** 
 * @ClassName: DivisorDAO
 * @Description: Divisor的DAO接口定义类
 *  
 */
public interface DivisorDAO extends CommonDAO<DivisorDomain,Long>{
	
	/** 
	* @Description: 根据用户id获取用户的积分因子对应id属性
	* @author Liu Wenjie   
	* @date 2014-11-23 上午12:38:02 
	* @param operatorId
	* @return  
	*/ 
	public List<DivisorDomain> findByOperatorId(Long operatorId);
}
