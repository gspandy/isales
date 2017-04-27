/**
 * @Company 青鸟软通   
 * @Title: ReportsalesDAO.java 
 * @Package  com.haier.isales.retail.reportsales.dao
 * @author John.zhao   
 * @date 2014年11月25日  17:05:35
 * @version V1.0   
 */
package com.haier.isales.retail.reportsales.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bana.common.util.page.PageCond;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.retail.reportsales.domain.ReportsalesDomain;
/** 
 * @ClassName: ReportsalesDAO
 * @Description: Reportsales的DAO接口定义类
 *  
 */
public interface ReportsalesDAO extends CommonDAO<ReportsalesDomain,Long>{
	
	/** 
	* @Description: 更新推送状态
	* @author John.zhao   
	* @date 2014-11-25 下午8:16:47 
	* @param synchronousState
	* @param errorMessage
	* @param id  
	*/ 
	public void updateStatus(@Param("synchronousState")String synchronousState,@Param("errorMessage")String errorMessage,@Param("id")Long id);
	
	/** 
	* @Description: 更新自主经营体主键
	* @author John.zhao   
	* @date 2015-1-9 下午5:19:16 
	* @param ehubDataId
	* @param id  
	*/ 
	public void updateEhubDataId(@Param("ehubDataId")String ehubDataId,@Param("id")Long id);
	
	/** 
	* @Description: TODO 获取已购用户列表
	* @author Shao Jingkai   
	* @date 2015-7-23 上午11:46:42 
	* @param queryParam
	* @param pageCond  
	*/ 
	public List<ReportsalesDomain> getPurchasedCustomerList(@Param("entity")ReportsalesDomain queryParam, @Param("pageCond") PageCond pageCond);
	/** 
	* @Description: TODO 获取已购用户数目
	* @author Shao Jingkai   
	* @date 2015-7-23 下午12:45:12 
	* @param queryParam
	* @return  
	*/ 
	public Integer getPurchasedCustomerCount(@Param("entity")ReportsalesDomain queryParam);
}
