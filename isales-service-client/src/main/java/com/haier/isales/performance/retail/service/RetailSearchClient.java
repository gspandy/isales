/**
* @Company 青鸟软通   
* @Title: RetailSearchClient.java 
* @Package com.haier.isales.performance.leaguer.service 
* @author Guo Yuchao   
* @date 2014-12-18 下午3:57:28 
* @version V1.0   
*/ 
package com.haier.isales.performance.retail.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.performance.retail.dto.RetailDTO;
import com.haier.isales.performance.retail.dto.RetailStructureDTO;

/** 
 * @ClassName: RetailSearchClient 
 * @Description:  业绩销量相关 
 *  
 */
public interface RetailSearchClient {
	
	/** 
	* @Description: 查询门店当月累计销量、T-1日销量，个人当月累计销量、T-1日提成
	* @author lizhenwei
	* @date 2016-05-04 16:47:10 
	* @param registDTO
	* @return  
	*/ 
	@Export(paramNames = {"retailDTO"})
	Object findBtbRetailAndBonus(RetailDTO retailDTO);
	
	/** 
	* @Description: 根据     员工号、月份 、电热产品线   条件查询 业绩 销量查询门店销量
	* @author Guo Yuchao   
	* @date 2014-12-18 下午4:00:19 
	* @param registDTO
	* @return  
	*/ 
	@Export(paramNames = {"retailDTO"})
	Object findShopBtbRetail(RetailDTO retailDTO);
	
	/** 
	* @Description: 根据     员工号、月份 、电热产品线   条件查询 业绩 销量查询门店销量
	* @author Guo Yuchao   
	* @date 2014-12-18 下午4:00:19 
	* @param registDTO
	* @return  
	*/ 
	@Export(paramNames = {"retailStructureDTO"})
	Object findPerBtbRetailStructure(RetailStructureDTO retailStructureDTO);
	
	/** 
	* @Description: 根据员工号、月份 、产品线条件查询 业绩 销量查询月累计销量、月累计提成、月累计销额详情
	* @author Guo Yuchao   
	* @date 2014-12-18 下午4:00:19 
	* @param registDTO
	* @return  
	*/ 
	@Export(paramNames = {"retailDTO"})
	Object findShopBtbRetailDetail(RetailDTO retailDTO);
	
	/**
	* 根据员工号、月份、产品线条件查询日累计销量、日累计提成、日累计销额详情
	* @author lizhenwei  
	* @date 2016-05-25 下午15:33:10 
	* @param retailDTO
	* @return 
	* @see com.haier.isales.performance.retail.service.RetailSearchClient#findPerBtbRetail(com.haier.isales.performance.retail.dto.RetailDTO) 
	*/ 
	@Export(paramNames = {"retailDTO"})
	Object findShopBtbRetailLstdayDetail(RetailDTO retailDTO);
	/** 
	* @Description:  业绩 销量查询门店销量 走势图
	* @author Guo Yuchao   
	* @date 2014-12-19 下午1:44:30 
	* @param registDTO
	* @return  
	*/ 
	@Export(paramNames = {"retailDTO"})
	Object findShopRetailChart(RetailDTO retailDTO);
	
	/** 
	* @Description:  业绩 销额查询门店销额 走势图
	* @author lizhenwei   
	* @date 2016-05-26 11:06:30 
	* @param registDTO
	* @return  
	*/ 
	@Export(paramNames = {"retailDTO"})
	Object findShopMoneyRetailChart(RetailDTO retailDTO);
	
	/** 
	* @Description: 根据     员工号、月份 、产品线   条件查询 业绩 销量查询个人销量
	* @author Guo Yuchao   
	* @date 2014-12-18 下午4:00:19 
	* @param registDTO
	* @return  
	*/ 
	@Export(paramNames = {"retailDTO"})
	Object findPerBtbRetail(RetailDTO retailDTO);

	/** 
	* @Description:  业绩 销量查询个人销量 走势图
	* @author Guo Yuchao   
	* @date 2014-12-19 下午1:44:30 
	* @param registDTO
	* @return  
	*/ 
	@Export(paramNames = {"retailDTO"})
	Object findPersonalRetailChart(RetailDTO retailDTO);
	
	/** 
	* @Description: 查询整体零售额
	* @author John.zhao   
	* @date 2014-12-23 下午3:15:29 
	* @param retailDTO
	* @return  
	*/ 
	@Export(paramNames = {"retailDTO"})
	public Object searchOrgRetail(RetailDTO retailDTO);
	
	/** 
	* @Description: 个人零售额
	* @author John.zhao   
	* @date 2014-12-23 下午3:16:43 
	* @param retailDTO
	* @return  
	*/ 
	@Export(paramNames = {"retailDTO"})
	public Object searchPersonRetail(RetailDTO retailDTO);
	
	
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2014-12-23 下午3:20:06 
	* @param retailDTO
	* @return  
	*/ 
	@Export(paramNames = {"retailDTO"})
	public Object searchPersonActualRetailCharts(RetailDTO retailDTO);
	
}
