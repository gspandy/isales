/**
* @Company 青鸟软通   
* @Title: RetailClientImpl.java 
* @Package com.haier.isales.performance.service.impl 
* @author Guo Yuchao   
* @date 2014-12-18 下午4:03:08 
* @version V1.0   
*/ 
package com.haier.isales.performance.service.impl;

import java.util.List;

import com.haier.isales.performance.retail.dto.RetailChartDTO;
import com.haier.isales.performance.retail.dto.RetailDTO;
import com.haier.isales.performance.retail.dto.RetailStructureDTO;
import com.haier.isales.performance.retail.service.RetailSearchClient;
import com.haier.isales.performance.retail.service.RetailService;

/** 
 * @ClassName: RetailClientImpl 
 * @Description:业绩销量相关 
 *  
 */
public class RetailClientImpl implements RetailSearchClient {
	
	private RetailService retailService;
	
	/**
	* <p>Description:查询门店当月累计销量、T-1日销量，个人当月累计销量、T-1日提成</p> 
	* @author lizhenwei
	* @date 2016-05-04 16:47:10 
	* @param retailDTO
	* @return 
	* @see com.haier.isales.performance.retail.service.RetailSearchClient#findPerBtbRetail(com.haier.isales.performance.retail.dto.RetailDTO) 
	*/ 
	@Override
	public RetailDTO findBtbRetailAndBonus(RetailDTO retailDTO) {
		return retailService.findBtbRetailBonus(retailDTO);
	}
	
	/**
	* 经业务确认修改成根据员工号、月份、电热产品线条件查询门店销量 modified by lizhenwei 2016-05-06
	* @author Guo Yuchao   
	* @date 2014-12-23 下午12:31:10 
	* @param retailDTO
	* @return 
	* @see com.haier.isales.performance.retail.service.RetailSearchClient#findPerBtbRetail(com.haier.isales.performance.retail.dto.RetailDTO) 
	*/ 
	@Override
	public RetailDTO findShopBtbRetail(RetailDTO retailDTO) {
		return retailService.findShopBtbRetail(retailDTO);
	}
	/**
	* 经业务确认:业绩产业结构
	* @author Guo Yuchao   
	* @date 2014-12-23 下午12:31:10 
	* @param RetailStructureDTO
	*/ 
	@Override
	public List<RetailStructureDTO> findPerBtbRetailStructure(
			RetailStructureDTO retailStructureDTO) {
		return retailService.findShopBtbRetailStructure(retailStructureDTO);
	}
	/**
	* 根据员工号、月份、产品线条件查询月累计销量、月累计提成、月累计销额详情
	* @author lizhenwei  
	* @date 2016-05-25 下午15:29:10 
	* @param retailDTO
	* @return 
	* @see com.haier.isales.performance.retail.service.RetailSearchClient#findPerBtbRetail(com.haier.isales.performance.retail.dto.RetailDTO) 
	*/ 
	@Override
	public List<RetailDTO> findShopBtbRetailDetail(RetailDTO retailDTO) {
		return retailService.findShopBtbRetailDetail(retailDTO);
	}
	
	/**
	* 根据员工号、月份、产品线条件查询日累计销量、日累计提成、日累计销额详情
	* @author lizhenwei  
	* @date 2016-05-25 下午15:33:10 
	* @param retailDTO
	* @return 
	* @see com.haier.isales.performance.retail.service.RetailSearchClient#findPerBtbRetail(com.haier.isales.performance.retail.dto.RetailDTO) 
	*/ 
	@Override
	public List<RetailDTO> findShopBtbRetailLstdayDetail(RetailDTO retailDTO) {
		return retailService.findShopBtbRetailLstdayDetail(retailDTO);
	}

	/**
	* 经业务确认修改成根据员工号、月份、电热产品线条件查询门店销量走势图 modified by lizhenwei 2016-05-06
	* @author Guo Yuchao   
	* @date 2014-12-23 下午12:31:10 
	* @param retailDTO
	* @return 
	* @see com.haier.isales.performance.retail.service.RetailSearchClient#findPersonalRetailChart(com.haier.isales.performance.retail.dto.RetailDTO) 
	*/ 
	@Override
	public RetailChartDTO findShopRetailChart(RetailDTO retailDTO) {
		return retailService.findShopRetailChart(retailDTO);
	}
	
	/**
	* 根据员工号、月份、产品线条件查询门店销额走势图 
	* @author lizhenwei  
	* @date 2016-05-26 11:07:10 
	* @param retailDTO
	* @return 
	* @see com.haier.isales.performance.retail.service.RetailSearchClient#findShopMoneyRetailChart(com.haier.isales.performance.retail.dto.RetailDTO) 
	*/ 
	@Override
	public RetailChartDTO findShopMoneyRetailChart(RetailDTO retailDTO) {
		return retailService.findShopMoneyRetailChart(retailDTO);
	}

	/**
	* <p>Description:根据     员工号、月份 、产品线   条件查询 业绩 销量查询个人销量 </p> 
	* @author Guo Yuchao   
	* @date 2014-12-23 下午12:31:10 
	* @param retailDTO
	* @return 
	* @see com.haier.isales.performance.retail.service.RetailSearchClient#findPerBtbRetail(com.haier.isales.performance.retail.dto.RetailDTO) 
	*/ 
	@Override
	public RetailDTO findPerBtbRetail(RetailDTO retailDTO) {
		return retailService.findPerBtbRetail(retailDTO);
	}

	/**
	* <p>Description: 业绩 销量查询个人销量 走势图 </p> 
	* @author Guo Yuchao   
	* @date 2014-12-23 下午12:31:10 
	* @param retailDTO
	* @return 
	* @see com.haier.isales.performance.retail.service.RetailSearchClient#findPersonalRetailChart(com.haier.isales.performance.retail.dto.RetailDTO) 
	*/ 
	@Override
	public RetailChartDTO findPersonalRetailChart(RetailDTO retailDTO) {
		return retailService.findPersonalRetailChart(retailDTO);
	}

	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2014-12-23 下午3:22:43 
	* @param retailDTO
	* @return 
	* @see com.haier.isales.performance.retail.service.RetailSearchClient#searchOrgRetail(com.haier.isales.performance.retail.dto.RetailDTO) 
	*/ 
	@Override
	public RetailDTO searchOrgRetail(RetailDTO retailDTO) {
		return retailService.getOrgRetail(retailDTO);
	}

	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2014-12-23 下午3:22:43 
	* @param retailDTO
	* @return 
	* @see com.haier.isales.performance.retail.service.RetailSearchClient#searchPersonRetail(com.haier.isales.performance.retail.dto.RetailDTO) 
	*/ 
	@Override
	public RetailDTO searchPersonRetail(RetailDTO retailDTO) {
		return retailService.getPersonRetail(retailDTO);
	}

	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2014-12-23 下午3:22:43 
	* @param retailDTO
	* @return 
	* @see com.haier.isales.performance.retail.service.RetailSearchClient#searchPersonActualRetailCharts(com.haier.isales.performance.retail.dto.RetailDTO) 
	*/ 
	@Override
	public RetailChartDTO searchPersonActualRetailCharts(RetailDTO retailDTO) {
		return retailService.getPersonActualRetailCharts(retailDTO);
	}

	
	//==============================================

	/**
	 * @Description: 属性 retailService 的get方法 
	 * @return retailService
	 */
	public RetailService getRetailService() {
		return retailService;
	}

	/**
	 * @Description: 属性 retailService 的set方法 
	 * @param retailService 
	 */
	public void setRetailService(RetailService retailService) {
		this.retailService = retailService;
	}

}
