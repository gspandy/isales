/**
 * @Company 青鸟软通   
 * @Title: EvalScoreDAO.java 
 * @Package  com.haier.isales.evaluate.dao
 * @author lizhenwei   
 * @date 2016年04月27日  10:20:08
 * @version V1.0   
 */
package com.haier.isales.evaluate.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.evaluate.domain.EvalContentDomain;
import com.haier.isales.evaluate.domain.EvalScoreDomain;
import com.haier.isales.evaluate.dto.EvalScoreDTO;
/** 
 * @ClassName: EvalScoreDAO
 * @Description: EvalScore的DAO接口定义类
 *  
 */
public interface EvalScoreDAO extends CommonDAO<EvalScoreDomain,Long>{
	
	// 根据条件查询直销员评价分数
	List<EvalScoreDomain> findEvalScoreList(@Param("queryDTO") EvalScoreDTO queryDTO);
	
}
