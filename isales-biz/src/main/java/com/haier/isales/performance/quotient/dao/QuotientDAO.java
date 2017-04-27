/**
 * @Company 青鸟软通   
 * @Title: QuotientDAO.java 
 * @Package  com.haier.isales.performance.quotient.dao
 * @author John.zhao   
 * @date 2014年12月18日  18:40:10
 * @version V1.0   
 */
package com.haier.isales.performance.quotient.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.performance.quotient.domain.QuotientDomain;

/**
 * @ClassName: QuotientDAO
 * @Description: Quotient的DAO接口定义类
 * 
 */
public interface QuotientDAO extends CommonDAO<QuotientDomain, Long> {
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2014-12-18 下午6:56:24 
	* @param t
	* @return 
	*/ 
	public QuotientDomain searchQuotientAccomplish(@Param("entity")QuotientDomain entity);
	
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2014-12-18 下午6:57:10 
	* @param t
	* @return  
	*/
	public List<QuotientDomain> searchQuotientCharts(@Param("entity")QuotientDomain entity);
}
