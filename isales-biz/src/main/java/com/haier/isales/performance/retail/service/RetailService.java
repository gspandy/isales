/**
 * @Company 青鸟软通   
 * @Title: RetailService.java 
 * @Package  com.haier.isales.performance.retail.service
 * @author John Zhao   
 * @date 2014年12月22日  14:47:08
 * @version V1.0   
 */
package com.haier.isales.performance.retail.service;

import java.util.List;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.performance.retail.dto.RetailChartDTO;
import com.haier.isales.performance.retail.dto.RetailDTO;
import com.haier.isales.performance.retail.dto.RetailStructureDTO;

/** 
 * @ClassName: RetailService
 * @Description: Retail的Service接口定义类
 *  
 */
public interface RetailService {
	
	/** 
	* @Description: 业绩-销量查询门店当月累计销量、T-1日销量，个人当月累计销量、T-1日提成
	* @author Guo Yuchao   
	* @date 2016-05-04 16:31:04
	* @param retailDTO
	* @return
	*/ 
	RetailDTO findBtbRetailBonus(RetailDTO retailDTO);
	
	/** 
	* @Description: 业绩 销量查询门店销量
	* @author Guo Yuchao   
	* @date 2014-12-23 上午9:55:43 
	* @param retailDTO
	* @return
	* @throws BusinessException  
	*/ 
	RetailDTO findShopBtbRetail(RetailDTO retailDTO) throws BusinessException;
	
	/** 
	* @Description: 业绩 销量查询月累计销量、月累计提成、月累计销额详情
	* @author lizhenwei
	* @date 2016-05-24  18:29:43 
	* @param retailDTO
	* @return
	* @throws BusinessException  
	*/ 
	List<RetailDTO> findShopBtbRetailDetail(RetailDTO retailDTO) throws BusinessException;
	
	/** 
	* @Description: 业绩 销量查询日累计销量、日累计提成、日累计销额详情
	* @author lizhenwei   
	* @date 2016-05-24 18:31:43 
	* @param retailDTO
	* @return
	* @throws BusinessException  
	*/ 
	
	List<RetailDTO> findShopBtbRetailLstdayDetail(RetailDTO retailDTO) throws BusinessException;
	/** 
	* @Description: 业绩 销量查询门店销量 走势图
	* @author Guo Yuchao   
	* @date 2014-12-23 上午10:25:48 
	* @param retailDTO
	* @return
	* @throws BusinessException  
	*/ 
	RetailChartDTO findShopRetailChart(RetailDTO retailDTO) throws BusinessException;
	
	/** 
	* @Description: 业绩 销额查询门店销额走势图
	* @author lizhenwei
	* @date 2016-05-26 上午10:58:48 
	* @param retailDTO
	* @return
	* @throws BusinessException  
	*/ 
	RetailChartDTO findShopMoneyRetailChart(RetailDTO retailDTO) throws BusinessException;
	
	/** 
	* @Description: 业绩 销量查询个人销量
	* @author Guo Yuchao   
	* @date 2014-12-23 上午9:55:43 
	* @param retailDTO
	* @return
	* @throws BusinessException  
	*/ 
	RetailDTO findPerBtbRetail(RetailDTO retailDTO) throws BusinessException;
	/** 
	* @Description: 业绩 销量查询个人销量 走势图
	* @author Guo Yuchao   
	* @date 2014-12-23 上午10:25:48 
	* @param retailDTO
	* @return
	* @throws BusinessException  
	*/ 
	RetailChartDTO findPersonalRetailChart(RetailDTO retailDTO) throws BusinessException;
	
	
	/** 
	* @Description: 个人零售额
	* @author John.zhao   
	* @date 2014-8-8 下午9:33:36 
	* @param dto
	* @return  
	*/ 
	public RetailDTO getPersonRetail(RetailDTO dto);
	
	/** 
	* @Description: 整体零售额
	* @author John.zhao   
	* @date 2014-8-8 下午9:33:39 
	* @param dto
	* @return  
	*/ 
	public RetailDTO getOrgRetail(RetailDTO dto);
	
	/** 
	* @Description: 个人零售额走势图
	* @author John.zhao   
	* @date 2014-8-8 下午9:33:43 
	* @param dto
	* @return  
	*/ 
	public RetailChartDTO getPersonActualRetailCharts(RetailDTO dto);
	/** 
	* @Description: 业绩 产业结构(高，中，低)
	* @author wp
	* @date 2016-06-24 
	* @param RetailStructureDTO
	* @return
	* @throws BusinessException  
	*/ 
	public List<RetailStructureDTO> findShopBtbRetailStructure(RetailStructureDTO dto);
}
