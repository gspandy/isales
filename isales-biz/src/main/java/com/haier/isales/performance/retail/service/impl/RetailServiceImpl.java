/**
 * @Company 青鸟软通   
 * @Title: RetailService.java 
 * @Package  com.haier.isales.performance.retail.service.impl
 * @author John Zhao   
 * @date 2014年12月22日  14:47:08
 * @version V1.0   
 */
package com.haier.isales.performance.retail.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.common.IsalesDateUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.performance.retail.dao.RetaiStructurelDAO;
import com.haier.isales.performance.retail.dao.RetailDAO;
import com.haier.isales.performance.retail.dao.RetailDetailDAO;
import com.haier.isales.performance.retail.dao.RetailDetailLstdayDAO;
import com.haier.isales.performance.retail.dto.RetailChartDTO;
import com.haier.isales.performance.retail.dto.RetailDTO;
import com.haier.isales.performance.retail.dto.RetailStructureDTO;
import com.haier.isales.behaviour.userbehaviourcom.dao.UserBehaviourComByHandDAO;
import com.haier.isales.performance.retail.service.RetailService;
import com.haier.isales.retail.reportretail.dao.BtbSjcjScrmDAO;
import com.haier.isales.retail.salestarget.domain.SalestargetDomain;
import com.haier.isales.retail.salestarget.dto.SalestargetDto;
import com.haier.isales.retail.salestarget.dto.SalestargetQueryDto;
import com.haier.isales.retail.salestarget.service.SalestargetService;

/**
 * @ClassName: RetailService
 * @Description: Retail的Service接口定义类
 * 
 */
public class RetailServiceImpl implements RetailService {

	private static final Logger LOG = LoggerFactory.getLogger(RetailServiceImpl.class);

	/**
	 * @Fields retailDao : RetailDao 工具依赖
	 */
	private RetailDAO retailDao;
	
	private SalestargetService salestargetService;
	
	private BtbSjcjScrmDAO btbSjcjScrmDao;
	
	private RetailDetailDAO retailDetailDao;
	
	private RetailDetailLstdayDAO retailDetailLstdayDao;
	
	private RetaiStructurelDAO retaiStructurelDAO;
	
	private UserBehaviourComByHandDAO UserBehaviourComByHandDAO;

	/* ===============业务方法============= */

	/**
	 * <p>
	 * Description: 查询门店当月累计销量、T-1日销量，个人当月累计销量、T-1日提成
	 * </p>
	 * 
	 * @author lizhenwei
	 * @date 2016-05-04 16:31:04
	 * @param retailDTO
	 * @return
	 * @see com.haier.isales.performance.retail.service.RetailService#findBtbRetailBonus(com.haier.isales.performance.retail.dto.RetailDTO)
	 */
	@Override
	public RetailDTO findBtbRetailBonus(RetailDTO retailDTO) {
	    String fene=UserBehaviourComByHandDAO.retailFeneDao();
        if(fene!=null && "0".equals(fene)){
    		// 验证参数是否为空
    		//CheckParamUtil.checkFieldIfNotBlank(retailDTO, "yearMonth", "empCode", "proLineId", "operatorId");
    		CheckParamUtil.checkFieldIfNotBlank(retailDTO, "yearMonth", "shopId", "proLineId");
    		// 验证月份格式
    		String yearMonth = retailDTO.getYearMonth();
    		yearMonth = IsalesDateUtil.getPeriodDateString(yearMonth);
    		retailDTO.setYearMonth(yearMonth);
    		RetailDTO resultRetail = new RetailDTO();
    		// 查询当月累计销量、T-1日销量，当月累计提成、T-1日提成
    		BigDecimal totalRetail;
    		BigDecimal befRetail;
    		BigDecimal totalBonus;
    		BigDecimal befBonus;
    		
    		RetailDTO retail = btbSjcjScrmDao.findShopBtbRetailBonus(retailDTO);
    		
    		if (retail == null) {
    			
    			totalRetail = BigDecimal.ZERO;
    			befRetail = BigDecimal.ZERO;
    			totalBonus = BigDecimal.ZERO;
    			befBonus = BigDecimal.ZERO;
    			
    			resultRetail.setTotalRetail(totalRetail);
    			resultRetail.setBefRetail(befRetail);
    			resultRetail.setTotalBonus(totalBonus);
    			resultRetail.setBefBonus(befBonus);
    			
    		} else {
    			
    			resultRetail = ClonePojoUtil.copyClassFromTo(retail, RetailDTO.class);
    		}
    		
    		return resultRetail;
        }else{
            return new RetailDTO();
        }
	}
	
	/**
	 * <p>
	 * Description: 根据 员工号、月份 、电热产品线 条件查询 业绩 销量查询门店销量
	 * </p>
	 * 
	 * @author Guo Yuchao
	 * @date 2014-12-23 上午9:56:04
	 * @param retailDTO
	 * @return
	 * @throws BusinessException
	 * @see com.haier.isales.performance.retail.service.RetailService#findPerBtbRetail(com.haier.isales.performance.retail.dto.RetailDTO)
	 */
	@Override
	public RetailDTO findShopBtbRetail(RetailDTO retailDTO) throws BusinessException {
	    String fene=UserBehaviourComByHandDAO.retailFeneDao();
        if(fene!=null && "0".equals(fene)){
    		// 验证参数是否为空
    		//CheckParamUtil.checkFieldIfNotBlank(retailDTO, "yearMonth", "empCode", "proLineId", "operatorId");
    		CheckParamUtil.checkFieldIfNotBlank(retailDTO, "yearMonth", "shopId", "proLineId");
    		// 验证月份格式
    		String yearMonth = retailDTO.getYearMonth();
    		yearMonth = IsalesDateUtil.getPeriodDateString(yearMonth);
    		retailDTO.setYearMonth(yearMonth);
    		retailDTO.setYearMonthBegin(yearMonth);// 查询月份为开始结束的月份，这里使用同一个
    		RetailDTO resultRetail = new RetailDTO();
    		// 查询指定月份【实际销量】信息
    		BigDecimal actual;
    		// 查询指定月份【目标销量】信息
    		BigDecimal target;
    		// 查询日目标销量
    		BigDecimal befTargetRetail;
    		// 查询日实际销量
    		BigDecimal befRetail;
    		// 日销量完成率
    		//BigDecimal befCompletRate;
    		// 日挣酬实际
    		BigDecimal befReward;
    		
    		// 查询指定月份【实际销额】信息
    		BigDecimal actualMoney = BigDecimal.ZERO;
    		// 查询指定月份【目标销额】信息
    		BigDecimal targetMoney;
    		// 计算月销额完成率
    		BigDecimal moneyRate;
    		// 查询日目标销额
    		BigDecimal befTargetMoney;
    		// 查询日实际销额
    		BigDecimal befActualMoney = BigDecimal.ZERO;
    		// 日销额完成率
    		BigDecimal befMoneyRate;
    				
    		List<RetailDTO> retailList = btbSjcjScrmDao.findShopBtbRetail(retailDTO);
    		
    		RetailDTO retail = null;
    		
    		if (retailList == null || retailList.isEmpty() || retailList.get(0) == null) {
    			actual = BigDecimal.ZERO;
    			target = BigDecimal.ZERO;
    			befTargetRetail = BigDecimal.ZERO;
    			befRetail = BigDecimal.ZERO;
    			befReward = BigDecimal.ZERO;
    			//actualMoney = BigDecimal.ZERO;
    			targetMoney = BigDecimal.ZERO;
    			befTargetMoney = BigDecimal.ZERO;
    			//befActualMoney = BigDecimal.ZERO;
    			
    		}else {
    			retail = retailList.get(0);
    		}
    		
    		// 换用detail表查询累计销额
    		// 月累计销额
    		RetailDTO retailMoney = retailDetailDao.findShopBtbRetailMoney(retailDTO);
    		// 日销额
    		RetailDTO retailLstday = retailDetailLstdayDao.findShopBtbRetailLstdayMoney(retailDTO);
    		
    		if (retailMoney == null) {
    			actualMoney = BigDecimal.ZERO;
    		}
    		if (retailLstday == null) {
    			befActualMoney = BigDecimal.ZERO;
    		}
    		if (retail == null) {
    			actual = BigDecimal.ZERO;
    			target = BigDecimal.ZERO;
    			befTargetRetail = BigDecimal.ZERO;
    			befRetail = BigDecimal.ZERO;
    			befReward = BigDecimal.ZERO;
    			
    			targetMoney = BigDecimal.ZERO;
    			befTargetMoney = BigDecimal.ZERO;
    			
    		} else {
    			actual = retail.getActual();
    			target = retail.getTarget();
    			befTargetRetail = retail.getBefTargetRetail();
    			befRetail = retail.getBefRetail();
    			befReward = retail.getBefReward();
    			targetMoney = retail.getTargetMoney();
    			befTargetMoney = retail.getBefTargetMoney();
    			
    		}
    		if (retailMoney != null) {
    			actualMoney = retailMoney.getActualMoney();
    		}
    		if (retailLstday != null) {
    			befActualMoney = retailLstday.getBefActualMoney();
    		}
    		
    		//BigDecimal actual = getActualRetail(retailDTO);
    		resultRetail.setActual(actual);
    		// 查询【目标销量】
    		//BigDecimal target = findSalesTargetByRetail(retailDTO);
    		
    		resultRetail.setTarget(target);
    		resultRetail.setTargetMoney(targetMoney);
    		resultRetail.setActualMoney(actualMoney);
    		resultRetail.setBefTargetMoney(befTargetMoney);
    		resultRetail.setBefActualMoney(befActualMoney);
    		
    		// 计算【完成率】
    		BigDecimal rate;
    		if (target.compareTo(BigDecimal.ZERO) <= 0 || actual.compareTo(BigDecimal.ZERO) <= 0) {
    			rate = BigDecimal.ZERO;
    		} else {
    			rate = actual.divide(target, 6, BigDecimal.ROUND_FLOOR);
    		}
    		resultRetail.setCompletionRate(rate);
    		
    		// 日销量目标、实际、完成率
    		resultRetail.setBefRetail(befRetail);
    		resultRetail.setBefTargetRetail(befTargetRetail);
    		
    		// 计算【完成率】
    		BigDecimal befRate;
    		if (befTargetRetail.compareTo(BigDecimal.ZERO) <= 0 || befRetail.compareTo(BigDecimal.ZERO) <= 0) {
    			befRate = BigDecimal.ZERO;
    		} else {
    			befRate = befRetail.divide(befTargetRetail, 6, BigDecimal.ROUND_FLOOR);
    		}
    		resultRetail.setBefCompletRate(befRate);
    		
    		// 日挣酬实际
    		resultRetail.setBefReward(befReward);
    		
    		// 计算【月销额完成率】
    		//BigDecimal moneyCompleteRate;
    		if (targetMoney.compareTo(BigDecimal.ZERO) <= 0 || actualMoney.compareTo(BigDecimal.ZERO) <= 0) {
    			moneyRate = BigDecimal.ZERO;
    		} else {
    			moneyRate = actualMoney.divide(targetMoney, 6, BigDecimal.ROUND_FLOOR);
    		}
    		resultRetail.setMoneyCompleteRate(moneyRate);
    		
    		// 计算【完成率】
    		//BigDecimal befMoneyCompleteRate;
    		if (befTargetMoney.compareTo(BigDecimal.ZERO) <= 0 || befActualMoney.compareTo(BigDecimal.ZERO) <= 0) {
    			befMoneyRate = BigDecimal.ZERO;
    		} else {
    			befMoneyRate = befActualMoney.divide(befTargetMoney, 6, BigDecimal.ROUND_FLOOR);
    		}
    		resultRetail.setBefMoneyCompleteRate(befMoneyRate);
    		
    		return resultRetail;
		
        }else{
            return new RetailDTO();
        }
	}
	
	/** 
	* @Description: 业绩 产业结构(高，中，低)
	* @author wp
	* @date 2016-06-24 
	* @param RetailStructureDTO
	* @return
	* @throws BusinessException  
	*/ 
	public List<RetailStructureDTO> findShopBtbRetailStructure(RetailStructureDTO retailStructureDTO) {
		CheckParamUtil.checkFieldIfNotBlank(retailStructureDTO, "months", "shopId", "proLineId");
		List<RetailStructureDTO> dto=retaiStructurelDAO.findShopBtbRetailStructure(retailStructureDTO);
		//创建要返回的实体类s
		List<RetailStructureDTO> resultRetailStructureDTO=dto;
		return resultRetailStructureDTO;
	}
	
	/** 
	* @Description: 业绩 销量查询月累计销量、月累计提成、月累计销额详情
	* @author lizhenwei   
	* @date 2016-05-24 18:30:43 
	* @param retailDTO
	* @return
	* @throws BusinessException  
	*/ 
	public List<RetailDTO> findShopBtbRetailDetail(RetailDTO retailDTO) throws BusinessException {
		
		CheckParamUtil.checkFieldIfNotBlank(retailDTO, "yearMonth", "shopId", "proLineId");
		// 验证月份格式
		String yearMonth = retailDTO.getYearMonth();
		yearMonth = IsalesDateUtil.getPeriodDateString(yearMonth);
		retailDTO.setYearMonth(yearMonth);
		retailDTO.setYearMonthBegin(yearMonth);// 查询月份为开始结束的月份，这里使用同一个
		
		List<RetailDTO> retailList = retailDetailDao.findShopBtbRetailDetail(retailDTO);
		
		return retailList;
	}
	
	/** 
	* @Description: 业绩 销量查询日累计销量、日累计提成、日累计销额详情
	* @author lizhenwei   
	* @date 2016-05-24 18:31:43 
	* @param retailDTO
	* @return
	* @throws BusinessException  
	*/ 
	public List<RetailDTO> findShopBtbRetailLstdayDetail(RetailDTO retailDTO) throws BusinessException {
		
		CheckParamUtil.checkFieldIfNotBlank(retailDTO, "yearMonth", "shopId", "proLineId");
		// 验证月份格式
		String yearMonth = retailDTO.getYearMonth();
		yearMonth = IsalesDateUtil.getPeriodDateString(yearMonth);
		retailDTO.setYearMonth(yearMonth);
		retailDTO.setYearMonthBegin(yearMonth);// 查询月份为开始结束的月份，这里使用同一个
		
		List<RetailDTO> retailList = retailDetailLstdayDao.findShopBtbRetailDetailLstday(retailDTO);
		
		return retailList;
	}
	
	/**
	 * <p>
	 * Description: 电热产业线 业绩 销量查询门店销量 走势图
	 * </p>
	 * 
	 * @author lizhenwei
	 * @date 2016-05-06 上午10:28:16
	 * @param retailDTO
	 * @return
	 * @throws BusinessException
	 * @see com.haier.isales.performance.retail.service.RetailService#findPersonalRetailChart(com.haier.isales.performance.retail.dto.RetailDTO)
	 */
	@Override
	public RetailChartDTO findShopRetailChart(RetailDTO retailDTO) throws BusinessException {
		// 验证参数是否为空
//		CheckParamUtil.checkFieldIfNotBlank(retailDTO, "yearMonth", "empCode", "proLineId", "operatorId");
		// 经业务确认修改成查询门店销量走势图 modified by lizhenwei 2016-05-03
		//CheckParamUtil.checkFieldIfNotBlank(retailDTO, "empCode", "proLineId", "operatorId");
		CheckParamUtil.checkFieldIfNotBlank(retailDTO, "shopId");
		// 验证月份格式
		String yearMonth = IsalesDateUtil.toFormatString(new Date(), "yyyy-MM");
		retailDTO.setYearMonth(yearMonth);
		// 查询开始的月份     getBeforeMonthFromDateStr(yearMonth,0, -11) 返回  year-0 month-11 年月
		String beforeMonth = IsalesDateUtil.getBeforeMonthFromDateStr(yearMonth,0, -11);
		retailDTO.setYearMonthBegin(beforeMonth);
		RetailChartDTO thisYearChart = findShopRetailChart(retailDTO,0);
		//查询同期
		String lastYearMonth = IsalesDateUtil.getBeforeMonthFromDateStr(yearMonth,-1, 0);
		String lastBeforeMonth = IsalesDateUtil.getBeforeMonthFromDateStr(yearMonth,-1, -11);
		retailDTO.setYearMonth(lastYearMonth);
		retailDTO.setYearMonthBegin(lastBeforeMonth);
		RetailChartDTO lastYearChart = findShopRetailChart(retailDTO,-1);
		thisYearChart.setPeriodList(lastYearChart.getActualList());
		return thisYearChart;
	}
	
	/**
	 * @Description: 业绩 销量查询走势图
	 * @author Guo Yuchao
	 * @date 2014-12-23 下午6:20:21
	 * @param retailDTO
	 * @param yearMonth
	 * @return
	 */
	private RetailChartDTO findShopRetailChart(RetailDTO retailDTO ,int yearStep) {
		// 查询月份列表
		List<String> yearMonthList = IsalesDateUtil.getLast12YearMonthList(retailDTO.getYearMonth(),yearStep);
		// 封装目标、实际销量
		Map<String, BigDecimal> acturalMap = findActualMapByShopRetail(retailDTO);
		Map<String, BigDecimal> targetMap = findTargetMapByShopRetail(retailDTO);
		// 构造走势图数据
		List<BigDecimal> targetList = new ArrayList<BigDecimal>();
		List<BigDecimal> actualList = new ArrayList<BigDecimal>();
		for (String dateStr : yearMonthList) {
			BigDecimal actual = acturalMap.get(dateStr);
			if (actual == null) {
				actualList.add(BigDecimal.ZERO);
			} else {
				actualList.add(actual);
			}
			BigDecimal target = targetMap.get(dateStr);
			if (target == null) {
				targetList.add(BigDecimal.ZERO);
			} else {
				targetList.add(target);
			}
		}
		return new RetailChartDTO(yearMonthList, targetList, actualList);
	}

	/**
	 * @Description: 查询走势图【实际销量】map
	 * @author Guo Yuchao
	 * @date 2014-12-23 下午6:16:28
	 * @param retailDTO
	 * @return
	 */
	private Map<String, BigDecimal> findActualMapByShopRetail(RetailDTO retailDTO) {
		//List<RetailDTO> retailActualList = retailDao.findPerBtbRetail(retailDTO);
		// 修改成查询门店实际销量走势图 map modified by lizhenwei
		List<RetailDTO> retailActualList = btbSjcjScrmDao.findShopBtbRetail(retailDTO);
		
		Map<String, BigDecimal> acturalMap = new HashMap<String, BigDecimal>();
		// 封装实际销量
		for (RetailDTO retailActualDTO : retailActualList) {
			if (retailActualDTO == null) {
				continue;
			}
//			acturalMap.put(retailActualDTO.getYearMonth(), retailActualDTO.getActual());
			String chartYearMonth = IsalesDateUtil.getRegistChartString(retailActualDTO.getYearMonth());
			acturalMap.put(chartYearMonth, retailActualDTO.getActual());
		}
		return acturalMap;
	}

	/**
	 * @Description: 查询门店销量走势图【目标销量】map
	 * @author Guo Yuchao
	 * @date 2014-12-23 下午6:14:59
	 * @param retailDTO
	 * @return
	 */
	private Map<String, BigDecimal> findTargetMapByShopRetail(RetailDTO retailDTO) {
		// 修改成门店目标销量走势图  modified by lizhenwei 
		List<RetailDTO> retailTargetList = btbSjcjScrmDao.findShopBtbRetail(retailDTO);
		
		Map<String, BigDecimal> targetMap = new HashMap<String, BigDecimal>();
		// 封装目标销量
		for (RetailDTO retailActualDTO : retailTargetList) {
			if (retailActualDTO == null) {
				continue;
			}
			String chartYearMonth = IsalesDateUtil.getRegistChartString(retailActualDTO.getYearMonth());
			targetMap.put(chartYearMonth, retailActualDTO.getTarget());
		}
		return targetMap;
	}
	
	/**
	 * <p>
	 * Description: 产业线 业绩 销额查询门店销额 走势图
	 * </p>
	 * 
	 * @author lizhenwei
	 * @date 2016-05-26 上午10:52:16
	 * @param retailDTO
	 * @return
	 * @throws BusinessException
	 * @see com.haier.isales.performance.retail.service.RetailService#findPersonalRetailChart(com.haier.isales.performance.retail.dto.RetailDTO)
	 */
	@Override
	public RetailChartDTO findShopMoneyRetailChart(RetailDTO retailDTO) throws BusinessException {
		// 验证参数是否为空
//		CheckParamUtil.checkFieldIfNotBlank(retailDTO, "yearMonth", "empCode", "proLineId", "operatorId");
		// 经业务确认修改成查询门店销量走势图 modified by lizhenwei 2016-05-03
		//CheckParamUtil.checkFieldIfNotBlank(retailDTO, "empCode", "proLineId", "operatorId");
		CheckParamUtil.checkFieldIfNotBlank(retailDTO, "shopId");
		// 验证月份格式
		String yearMonth = IsalesDateUtil.toFormatString(new Date(), "yyyy-MM");
		retailDTO.setYearMonth(yearMonth);
		// 查询开始的月份     getBeforeMonthFromDateStr(yearMonth,0, -11) 返回  year-0 month-11 年月
		String beforeMonth = IsalesDateUtil.getBeforeMonthFromDateStr(yearMonth,0, -11);
		retailDTO.setYearMonthBegin(beforeMonth);
		RetailChartDTO thisYearChart = findShopMoneyRetailChart(retailDTO,0);
		//查询同期
		String lastYearMonth = IsalesDateUtil.getBeforeMonthFromDateStr(yearMonth,-1, 0);
		String lastBeforeMonth = IsalesDateUtil.getBeforeMonthFromDateStr(yearMonth,-1, -11);
		retailDTO.setYearMonth(lastYearMonth);
		retailDTO.setYearMonthBegin(lastBeforeMonth);
		RetailChartDTO lastYearChart = findShopMoneyRetailChart(retailDTO,-1);
		thisYearChart.setPeriodList(lastYearChart.getActualList());
		return thisYearChart;
	}
	
	/**
	 * @Description: 业绩 销额查询门店销额走势图
	 * @author lizhenwei
	 * @date 2016-05-26 10:53:21
	 * @param retailDTO
	 * @param yearMonth
	 * @return
	 */
	private RetailChartDTO findShopMoneyRetailChart(RetailDTO retailDTO ,int yearStep) {
		// 查询月份列表
		List<String> yearMonthList = IsalesDateUtil.getLast12YearMonthList(retailDTO.getYearMonth(),yearStep);
		// 封装目标、实际销额
		Map<String, BigDecimal> acturalMap = findActualMapByShopMoneyRetail(retailDTO);
		Map<String, BigDecimal> targetMap = findTargetMapByShopMoneyRetail(retailDTO);
		// 构造走势图数据
		List<BigDecimal> targetList = new ArrayList<BigDecimal>();
		List<BigDecimal> actualList = new ArrayList<BigDecimal>();
		for (String dateStr : yearMonthList) {
			BigDecimal actual = acturalMap.get(dateStr);
			if (actual == null) {
				actualList.add(BigDecimal.ZERO);
			} else {
				actualList.add(actual);
			}
			BigDecimal target = targetMap.get(dateStr);
			if (target == null) {
				targetList.add(BigDecimal.ZERO);
			} else {
				targetList.add(target);
			}
		}
		return new RetailChartDTO(yearMonthList, targetList, actualList);
	}

	/**
	 * @Description: 查询门店销额走势图【实际销额】map
	 * @author lizhenwei
	 * @date 2016-05-26 10:55:28
	 * @param retailDTO
	 * @return
	 */
	private Map<String, BigDecimal> findActualMapByShopMoneyRetail(RetailDTO retailDTO) {
		//List<RetailDTO> retailActualList = retailDao.findPerBtbRetail(retailDTO);
		// 修改成查询门店实际销量走势图 map modified by lizhenwei
		List<RetailDTO> retailActualList = btbSjcjScrmDao.findShopBtbRetail(retailDTO);
		
		Map<String, BigDecimal> acturalMap = new HashMap<String, BigDecimal>();
		// 封装实际销量
		for (RetailDTO retailActualDTO : retailActualList) {
			if (retailActualDTO == null) {
				continue;
			}
//			acturalMap.put(retailActualDTO.getYearMonth(), retailActualDTO.getActual());
			String chartYearMonth = IsalesDateUtil.getRegistChartString(retailActualDTO.getYearMonth());
			acturalMap.put(chartYearMonth, retailActualDTO.getActualMoney());
		}
		return acturalMap;
	}

	/**
	 * @Description: 查询门店销额走势图【目标销额】map
	 * @author lizhenwei
	 * @date 2016-05-26 10:55:59
	 * @param retailDTO
	 * @return
	 */
	private Map<String, BigDecimal> findTargetMapByShopMoneyRetail(RetailDTO retailDTO) {
		// 门店目标销额走势图  
		List<RetailDTO> retailTargetList = btbSjcjScrmDao.findShopBtbRetail(retailDTO);
		
		Map<String, BigDecimal> targetMap = new HashMap<String, BigDecimal>();
		// 封装目标销额
		for (RetailDTO retailActualDTO : retailTargetList) {
			if (retailActualDTO == null) {
				continue;
			}
			String chartYearMonth = IsalesDateUtil.getRegistChartString(retailActualDTO.getYearMonth());
			targetMap.put(chartYearMonth, retailActualDTO.getTargetMoney());
		}
		return targetMap;
	}
	
	
	/**
	 * <p>
	 * Description: 根据 员工号、月份 、产品线 条件查询 业绩 销量查询个人销量
	 * </p>
	 * 
	 * @author Guo Yuchao
	 * @date 2014-12-23 上午9:56:04
	 * @param retailDTO
	 * @return
	 * @throws BusinessException
	 * @see com.haier.isales.performance.retail.service.RetailService#findPerBtbRetail(com.haier.isales.performance.retail.dto.RetailDTO)
	 */
	@Override
	public RetailDTO findPerBtbRetail(RetailDTO retailDTO) throws BusinessException {
		// 验证参数是否为空
		CheckParamUtil.checkFieldIfNotBlank(retailDTO, "yearMonth", "empCode", "proLineId", "operatorId");
		// 验证月份格式
		String yearMonth = retailDTO.getYearMonth();
		yearMonth = IsalesDateUtil.getPeriodDateString(yearMonth);
		retailDTO.setYearMonth(yearMonth);
		retailDTO.setYearMonthBegin(yearMonth);// 查询月份为开始结束的月份，这里使用同一个
		RetailDTO resultRetail = new RetailDTO();
		// 查询指定月份【实际销量】信息
		BigDecimal actual = getActualRetail(retailDTO);
		resultRetail.setActual(actual);
		// 查询【目标销量】
		BigDecimal target = findSalesTargetByRetail(retailDTO);
		
		resultRetail.setTarget(target);
		// 计算【完成率】
		BigDecimal rate;
		if (target.compareTo(BigDecimal.ZERO) <= 0 || actual.compareTo(BigDecimal.ZERO) <= 0) {
			rate = BigDecimal.ZERO;
		} else {
			rate = actual.divide(target, 6, BigDecimal.ROUND_FLOOR);
		}
		resultRetail.setCompletionRate(rate);
		return resultRetail;
	}

	/**
	 * @Description: 根据 operatorId、月份 、产品线 条件查询 业绩 销量查询个人【目标销量】
	 * @author Guo Yuchao
	 * @date 2014-12-23 下午3:01:58
	 * @param retailDTO
	 * @return
	 */
	private BigDecimal findSalesTargetByRetail(RetailDTO retailDTO) {
		String[] yearMonth = retailDTO.getYearMonth().split("-");
		SalestargetDto salestarget = salestargetService.getSalestarget(new SalestargetQueryDto(retailDTO
				.getOperatorId(), retailDTO.getProLineId(), Integer.valueOf(yearMonth[0]), Integer
				.valueOf(yearMonth[1])));
		if(salestarget == null){
			return BigDecimal.ZERO;
		}
		BigDecimal bigDecimal = salestarget.getTargetNum();
		if(bigDecimal== null){
			return BigDecimal.ZERO;
		}
		return bigDecimal;
	}

	/**
	 * @Description: 查询指定月份【实际销量】信息
	 * @author Guo Yuchao
	 * @date 2014-12-23 上午10:10:33
	 * @param retailDTO
	 */
	private BigDecimal getActualRetail(RetailDTO retailDTO) {
		// 查询指定月份【实际销量】信息
		BigDecimal actualRetail;
		List<RetailDTO> retailActualList = retailDao.findPerBtbRetail(retailDTO);
		if (retailActualList == null || retailActualList.isEmpty() || retailActualList.get(0) == null) {
			return BigDecimal.ZERO;
		} else {
			RetailDTO retailActualDto = retailActualList.get(0);
			actualRetail = retailActualDto.getActual();
			if (actualRetail == null) {
				return BigDecimal.ZERO;
			}
		}
		return actualRetail;
	}
	
	/**
	 * <p>
	 * Description: 业绩 销量查询个人销量 走势图
	 * </p>
	 * 
	 * @author Guo Yuchao
	 * @date 2014-12-23 上午10:28:16
	 * @param retailDTO
	 * @return
	 * @throws BusinessException
	 * @see com.haier.isales.performance.retail.service.RetailService#findPersonalRetailChart(com.haier.isales.performance.retail.dto.RetailDTO)
	 */
	@Override
	public RetailChartDTO findPersonalRetailChart(RetailDTO retailDTO) throws BusinessException {
		// 验证参数是否为空
//		CheckParamUtil.checkFieldIfNotBlank(retailDTO, "yearMonth", "empCode", "proLineId", "operatorId");
		CheckParamUtil.checkFieldIfNotBlank(retailDTO, "empCode", "proLineId", "operatorId");
		// 验证月份格式
		String yearMonth = IsalesDateUtil.toFormatString(new Date(), "yyyy-MM");
		retailDTO.setYearMonth(yearMonth);
		// 查询开始的月份     getBeforeMonthFromDateStr(yearMonth,0, -11) 返回  year-0 month-11 年月
		String beforeMonth = IsalesDateUtil.getBeforeMonthFromDateStr(yearMonth,0, -11);
		retailDTO.setYearMonthBegin(beforeMonth);
		RetailChartDTO thisYearChart = findRetailChart(retailDTO,0);
		//查询同期
		String lastYearMonth = IsalesDateUtil.getBeforeMonthFromDateStr(yearMonth,-1, 0);
		String lastBeforeMonth = IsalesDateUtil.getBeforeMonthFromDateStr(yearMonth,-1, -11);
		retailDTO.setYearMonth(lastYearMonth);
		retailDTO.setYearMonthBegin(lastBeforeMonth);
		RetailChartDTO lastYearChart = findRetailChart(retailDTO,-1);
		thisYearChart.setPeriodList(lastYearChart.getActualList());
		return thisYearChart;
	}

	/**
	 * @Description: 业绩 销量查询走势图
	 * @author Guo Yuchao
	 * @date 2014-12-23 下午6:20:21
	 * @param retailDTO
	 * @param yearMonth
	 * @return
	 */
	private RetailChartDTO findRetailChart(RetailDTO retailDTO ,int yearStep) {
		// 查询月份列表
		List<String> yearMonthList = IsalesDateUtil.getLast12YearMonthList(retailDTO.getYearMonth(),yearStep);
		// 封装目标、实际销量
		Map<String, BigDecimal> acturalMap = findActualMapByRetail(retailDTO);
		Map<String, BigDecimal> targetMap = findTargetMapByRetail(retailDTO);
		// 构造走势图数据
		List<BigDecimal> targetList = new ArrayList<BigDecimal>();
		List<BigDecimal> actualList = new ArrayList<BigDecimal>();
		for (String dateStr : yearMonthList) {
			BigDecimal actual = acturalMap.get(dateStr);
			if (actual == null) {
				actualList.add(BigDecimal.ZERO);
			} else {
				actualList.add(actual);
			}
			BigDecimal target = targetMap.get(dateStr);
			if (target == null) {
				targetList.add(BigDecimal.ZERO);
			} else {
				targetList.add(target);
			}
		}
		return new RetailChartDTO(yearMonthList, targetList, actualList);
	}

	/**
	 * @Description: 查询走势图【实际销量】map
	 * @author Guo Yuchao
	 * @date 2014-12-23 下午6:16:28
	 * @param retailDTO
	 * @return
	 */
	private Map<String, BigDecimal> findActualMapByRetail(RetailDTO retailDTO) {
		List<RetailDTO> retailActualList = retailDao.findPerBtbRetail(retailDTO);
		
		Map<String, BigDecimal> acturalMap = new HashMap<String, BigDecimal>();
		// 封装实际销量
		for (RetailDTO retailActualDTO : retailActualList) {
			if (retailActualDTO == null) {
				continue;
			}
//			acturalMap.put(retailActualDTO.getYearMonth(), retailActualDTO.getActual());
			String chartYearMonth = IsalesDateUtil.getRegistChartString(retailActualDTO.getYearMonth());
			acturalMap.put(chartYearMonth, retailActualDTO.getActual());
		}
		return acturalMap;
	}

	/**
	 * @Description: 查询走势图【目标销量】map
	 * @author Guo Yuchao
	 * @date 2014-12-23 下午6:14:59
	 * @param retailDTO
	 * @return
	 */
	private Map<String, BigDecimal> findTargetMapByRetail(RetailDTO retailDTO) {
		String[] yearMonthAry = retailDTO.getYearMonth().split("-");
		// 查询【目标销量】
		List<SalestargetDomain> retailTargetList = salestargetService.getSalestargetList(new SalestargetQueryDto(
				retailDTO.getOperatorId(), retailDTO.getProLineId(), Integer.valueOf(yearMonthAry[0]), Integer
						.valueOf(yearMonthAry[1])));
		
		Map<String, BigDecimal> targetMap = new HashMap<String, BigDecimal>();
		// 分装目标销量
		for (SalestargetDomain salestargetDomain : retailTargetList) {
			if (salestargetDomain == null) {
				continue;
			}
			Integer year = salestargetDomain.getYear();
			Integer month = salestargetDomain.getMonth();
			StringBuffer yearMonthBuffer = new StringBuffer();
			yearMonthBuffer.append(year % 100).append("-").append(month);
			targetMap.put(yearMonthBuffer.toString(), salestargetDomain.getTargetNum());
		}
		return targetMap;
	}

	/**
	 * <p>
	 * Description: 整体销售额
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2014-12-23 下午1:43:41
	 * @param dto
	 * @return
	 * @see com.haier.isales.performance.retail.service.RetailService#getOrgRetail(com.haier.isales.performance.retail.dto.RetailDTO)
	 */
	@Override
	public RetailDTO getOrgRetail(RetailDTO dto) {
		LOG.info("整体销售额参数为："+dto);
		if (dto == null) {
			throw new BusinessException(BusinessExceptionCode.param_error);
		}
		if (dto.getShopId() == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "未维护门店信息");
		}
		CheckParamUtil.checkFieldIfNotBlank(dto, "yearMonth");
		//时间格式为：201401
		BigDecimal orgtargetRetail = retailDao.getOrgTargetRetail(dto.getYearMonth().replace("-", ""), dto.getShopId());
		//时间格式为：2014-01
		BigDecimal orgActualRetail = retailDao.getOrgActualRetail(dto.getYearMonth(), dto.getShopId());
		BigDecimal completionRate = BigDecimal.ZERO;
		if (orgtargetRetail == null && orgActualRetail != null) {
			orgtargetRetail = BigDecimal.ZERO;
			orgActualRetail = orgActualRetail.divide(new BigDecimal(10000)).setScale(4,BigDecimal.ROUND_FLOOR);
		} else if (orgActualRetail == null && orgtargetRetail != null) {
			orgActualRetail = BigDecimal.ZERO;
		} else if (orgtargetRetail == null && orgActualRetail == null) {
			orgtargetRetail = BigDecimal.ZERO;
			orgActualRetail = BigDecimal.ZERO;
		} else {
			orgActualRetail = orgActualRetail.divide(new BigDecimal(10000)).setScale(4, BigDecimal.ROUND_FLOOR);
			completionRate = orgActualRetail.divide(orgtargetRetail, 6, BigDecimal.ROUND_FLOOR);
		}
		dto.setActual(orgActualRetail);
		dto.setTarget(orgtargetRetail);
		dto.setCompletionRate(completionRate);
		return dto;
	}

	/**
	 * <p>
	 * Description:个人销售额
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2014-12-23 上午10:24:32
	 * @param dto
	 * @return
	 * @see com.haier.isales.performance.retail.service.RetailService#getPersonRetail(com.haier.isales.performance.retail.dto.RetailDTO)
	 */
	@Override
	public RetailDTO getPersonRetail(RetailDTO dto) {
		if (dto == null) {
			throw new BusinessException(BusinessExceptionCode.param_error);
		}
		if (dto.getShopId() == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "未维护门店信息");
		}
		CheckParamUtil.checkFieldIfNotBlank(dto, "operatorId", "yearMonth", "proLineId");
		SalestargetQueryDto queryDto = new SalestargetQueryDto();
		queryDto.setOperatorId(dto.getOperatorId());
		queryDto.setUserCode(dto.getEmpCode());
		queryDto.setProductLine(dto.getProLineId());
		queryDto.setYear(Integer.valueOf(dto.getYearMonth().substring(0, 4)));
		queryDto.setMonth(Integer.valueOf(dto.getYearMonth().substring(5)));
		SalestargetDto salestargetDto = salestargetService.getSalestarget(queryDto);
		BigDecimal personTargetRetail = salestargetDto.getTargetAmount();
		//时间格式为：2014-01
		BigDecimal personActualRetail = retailDao.getPersonActualRetail(dto.getYearMonth(), dto.getEmpCode(),
				dto.getProLineId());
		BigDecimal completionRate = BigDecimal.ZERO;
		if (personTargetRetail.compareTo(BigDecimal.ZERO)<=0 && personActualRetail != null&&personActualRetail.compareTo(BigDecimal.ZERO)>0) {
			personTargetRetail = BigDecimal.ZERO;
			personActualRetail = personActualRetail.divide(new BigDecimal(10000)).setScale(4, BigDecimal.ROUND_FLOOR);
		} else if (personActualRetail == null || personActualRetail.compareTo(BigDecimal.ZERO)==0 && personTargetRetail.compareTo(BigDecimal.ZERO)>0) {
			personActualRetail = BigDecimal.ZERO;
		} else if (personTargetRetail.compareTo(BigDecimal.ZERO)>0 && personActualRetail.compareTo(BigDecimal.ZERO)>0) {
			personActualRetail = personActualRetail.divide(new BigDecimal(10000)).setScale(4, BigDecimal.ROUND_FLOOR);
			completionRate = personActualRetail.divide(personTargetRetail, 6, BigDecimal.ROUND_FLOOR);
		} else {
			personActualRetail = BigDecimal.ZERO;
			personTargetRetail = BigDecimal.ZERO;
		}
		dto.setActual(personActualRetail);
		dto.setTarget(personTargetRetail);
		dto.setCompletionRate(completionRate);
		return dto;
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2014-12-23 下午1:49:06
	 * @param dto
	 * @return
	 * @see com.haier.isales.performance.retail.service.RetailService#getPersonActualRetailCharts(com.haier.isales.performance.retail.dto.RetailDTO)
	 */
	@Override
	public RetailChartDTO getPersonActualRetailCharts(RetailDTO dto) {
		if (dto == null) {
			throw new BusinessException(BusinessExceptionCode.param_error);
		}
		if (dto.getShopId() == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "未维护门店信息");
		}
		CheckParamUtil.checkFieldIfNotBlank(dto, "operatorId", "proLineId");
		// ------------------------查询目标零售额------------------------------------
		Map<String, BigDecimal> salesTargetMap = searchPersonTargetRetail(dto);
		// -------------------------查询实际零售额------------------------------------
		Map<String, BigDecimal> salesActualMap = searchPersonActualRetail(dto);
		// -------------------------查询同期零售额------------------------------------
		Map<String, BigDecimal> salesPeriodMap = searchPersonPeriodRetail(dto);
		// --------------------------------------------------------------------------
		// 查询当前月及向前11个月的list
		List<String> yearMonthList = IsalesDateUtil.getLast12YearMonthList(dto.getYearMonth(),0);
		List<BigDecimal> targetList = new ArrayList<BigDecimal>();
		List<BigDecimal> actualList = new ArrayList<BigDecimal>();
		for (String yearMonth : yearMonthList) {
			if (salesActualMap.get(yearMonth) == null) {
				actualList.add(BigDecimal.ZERO);
			} else {
				actualList.add(salesActualMap.get(yearMonth).divide(new BigDecimal(10000)).setScale(4, BigDecimal.ROUND_FLOOR));
			}
			if (salesTargetMap.get(yearMonth) == null) {
				targetList.add(BigDecimal.ZERO);
			} else {
				targetList.add(salesTargetMap.get(yearMonth));
			}
		}
		//-----------------------------获取同期零售额也就是(去年)的时间----------------------------------------------
		
		List<String> lastYearMonthList = IsalesDateUtil.getLast12YearMonthList(dto.getYearMonth(),-1);
		List<BigDecimal> periodList = new ArrayList<BigDecimal>();
		for (String yearMonth : lastYearMonthList) {
			if (salesPeriodMap.get(yearMonth) == null) {
				//如果获取不到该月的数据，则置为0
				periodList.add(BigDecimal.ZERO);
			} else {
				//获取到，则转为万元，保留3为小数，四舍五入
				periodList.add(salesPeriodMap.get(yearMonth).divide(new BigDecimal(10000)).setScale(4, BigDecimal.ROUND_FLOOR));
			}
		}
		//-----------------------------------------------------------------------------
		RetailChartDTO retailChartDTO = new RetailChartDTO();
		retailChartDTO.setActualList(actualList);
		retailChartDTO.setTargetList(targetList);
		retailChartDTO.setPeriodList(periodList);
		retailChartDTO.setYearMonth(yearMonthList);
		return retailChartDTO;
	}

	/** 
	* @Description: 获取个人零售额折线图中的目标map
	* @author John.zhao   
	* @date 2014-12-30 下午6:24:50 
	* @param dto
	* @return  
	*/ 
	public Map<String, BigDecimal> searchPersonTargetRetail(RetailDTO dto){
		SalestargetQueryDto queryDto = new SalestargetQueryDto();
		queryDto.setOperatorId(dto.getOperatorId());
		queryDto.setUserCode(dto.getEmpCode());
		queryDto.setProductLine(dto.getProLineId());
		// 只查当前月及向前11个月的折线图
		List<SalestargetDomain> salestargetList = salestargetService.getSalestargetList(queryDto);
		Map<String, BigDecimal> salesTargetMap = new HashMap<String, BigDecimal>();

		for (SalestargetDomain domain : salestargetList) {
			salesTargetMap.put(domain.getYear() % 100 + "-" + domain.getMonth(), domain.getTargetAmount());
		}
		return salesTargetMap;
	}
	
	
	/** 
	* @Description: 获取实际
	* @author John.zhao   
	* @date 2014-12-31 上午9:20:53 
	* @param dto
	* @return  
	*/ 
	public Map<String, BigDecimal> searchPersonActualRetail(RetailDTO dto){
		String currentYearMonth = IsalesDateUtil.toFormatString(new Date(), "yyyy-MM");
		String beforeMonth = IsalesDateUtil.getBeforeMonthFromDateStr(currentYearMonth,0, -11);
		dto.setYearMonth(currentYearMonth);
		dto.setYearMonthBegin(beforeMonth);
		List<RetailDTO> retailDTOlist = retailDao.getPersonActualChart(dto);
		Map<String, BigDecimal> salesActualMap = new HashMap<String, BigDecimal>();
		for (RetailDTO domain : retailDTOlist) {
			salesActualMap.put(IsalesDateUtil.getRegistChartString(domain.getYearMonth()), domain.getActual());
		}
		return salesActualMap;
	}
	
	/** 
	* @Description: 获取同期零售额
	* @author John.zhao   
	* @date 2014-12-31 上午9:21:06 
	* @param dto
	* @return  
	*/ 
	public Map<String, BigDecimal> searchPersonPeriodRetail(RetailDTO dto){
		//因为getBeforeMonthFromDateStr不支持"yyyyMM"格式的时间，只能创建为"yyyy-MM"格式
		String currentYearMonth = IsalesDateUtil.toFormatString(new Date(), "yyyy-MM");
		String lastYearMonth = IsalesDateUtil.getBeforeMonthFromDateStr(currentYearMonth,-1, 0);
		String lastBeforeMonth = IsalesDateUtil.getBeforeMonthFromDateStr(currentYearMonth,-1, -11);
		dto.setYearMonthBegin(lastBeforeMonth);
		dto.setYearMonth(lastYearMonth);
		List<RetailDTO> periodRetailDTOlist = retailDao.getPersonActualChart(dto);
		Map<String, BigDecimal> salesPeriodMap = new HashMap<String, BigDecimal>();
		for (RetailDTO domain : periodRetailDTOlist) {
			salesPeriodMap.put(IsalesDateUtil.getRegistChartString(domain.getYearMonth()), domain.getActual());
		}
		return salesPeriodMap;
	}
	/* ====================getter and setter ================= */

	/**
	 * @Description: 属性retailDao 的set方法
	 */
	public void setRetailDao(RetailDAO retailDao) {
		this.retailDao = retailDao;
	}

	/**
	 * @Description: 属性 salestargetService 的get方法
	 * @return salestargetService
	 */
	public SalestargetService getSalestargetService() {
		return salestargetService;
	}

	/**
	 * @Description: 属性 salestargetService 的set方法
	 * @param salestargetService
	 */
	public void setSalestargetService(SalestargetService salestargetService) {
		this.salestargetService = salestargetService;
	}

	/**
	 * @param btbSjcjScrmDao the btbSjcjScrmDao to set
	 */
	public void setBtbSjcjScrmDao(BtbSjcjScrmDAO btbSjcjScrmDao) {
		this.btbSjcjScrmDao = btbSjcjScrmDao;
	}

	/**
	 * @param retailDetailDao the retailDetailDao to set
	 */
	public void setRetailDetailDao(RetailDetailDAO retailDetailDao) {
		this.retailDetailDao = retailDetailDao;
	}

	/**
	 * @param retailDetailLstdayDao the retailDetailLstdayDao to set
	 */
	public void setRetailDetailLstdayDao(RetailDetailLstdayDAO retailDetailLstdayDao) {
		this.retailDetailLstdayDao = retailDetailLstdayDao;
	}
	
	public void setRetaiStructurelDAO(RetaiStructurelDAO retaiStructurelDAO) {
		this.retaiStructurelDAO = retaiStructurelDAO;
	}

    public void setUserBehaviourComByHandDAO(
            UserBehaviourComByHandDAO userBehaviourComByHandDAO) {
        UserBehaviourComByHandDAO = userBehaviourComByHandDAO;
    }
	
	
}
