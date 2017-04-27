/**
 * @Company 青鸟软通   
 * @Title: CustomerDAO.java 
 * @Package  com.haier.isales.customer.dao
 * @author Cao Rui   
 * @date 2014年11月12日  12:01:59
 * @version V1.0   
 */
package com.haier.isales.customer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bana.common.util.page.PageCond;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.customer.domain.PotentialCustomerDomain;
import com.haier.isales.customer.dto.PotentialCustomerDTO;
/** 
 * @ClassName: CustomerDAO
 * @Description: Customer的DAO接口定义类
 *  
 */
public interface PotentialCustomerDAO extends CommonDAO<PotentialCustomerDomain,Long>{
	
	/**
	 *  根据查询条件，查询潜客列表，
	* @Title: getPotentialCustomerList 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryEntity
	* @return  
	* @throws
	 */
	List<PotentialCustomerDomain> getPotentialCustomerList(@Param("entity") PotentialCustomerDTO queryEntity,
			@Param("pageCond") PageCond pageCond);

	/**
	 *  根据查询条件，查询潜客列表的数量，
	* @Title: getPotentialCustomerCount 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryEntity
	* @return  
	* @throws
	 */
	Integer getPotentialCustomerCount(@Param("entity") PotentialCustomerDTO queryEntity);
	
	/**
	 *  删除潜在客户 逻辑删除
	* @Title: deleteLogical 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param deleteBean
	* @return  
	* @throws
	 */
	Integer deleteLogical(@Param("entity") PotentialCustomerDomain deleteBean);
	
	/** 
	* @Description: TODO 查找该用户下，已过提醒日期，未到预购日期的潜客数目。
	* @author Shao Jingkai   
	* @date 2015-6-17 上午9:20:54 
	* @param operatorId
	* @return  
	*/ 
	Integer getCountByOperatorId(@Param("userId") Long operatorId);
}
