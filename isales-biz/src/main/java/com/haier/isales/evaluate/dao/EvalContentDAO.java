/**
 * @Company 青鸟软通   
 * @Title: EvalContentDAO.java 
 * @Package  com.haier.isales.evaluate.dao
 * @author lizhenwei   
 * @date 2016年04月27日  10:02:31
 * @version V1.0   
 */
package com.haier.isales.evaluate.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.evaluate.domain.EvalContentDomain;
import com.haier.isales.evaluate.dto.EvalScoreDTO;
/** 
 * @ClassName: EvalContentDAO
 * @Description: EvalContent的DAO接口定义类
 *  
 */
public interface EvalContentDAO extends CommonDAO<EvalContentDomain,Integer>{
	
	// 查询评价内容
	List<EvalContentDomain> findEvalContentList(@Param("queryDTO") EvalScoreDTO queryDTO);
}
