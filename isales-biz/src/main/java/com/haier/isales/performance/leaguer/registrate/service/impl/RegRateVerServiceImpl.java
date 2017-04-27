/**
 * @Company 青鸟软通   
 * @Title: RegRateVerService.java 
 * @Package  com.haier.isales.performance.leaguer.registrate.service.impl
 * @author Guo Yuchao   
 * @date 2014年12月18日  10:15:17
 * @version V1.0   
 */
package com.haier.isales.performance.leaguer.registrate.service.impl;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bana.common.util.basic.StringUtils;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.IsalesDateUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.performance.PerformanceEnum.IsAscendEnum;
import com.haier.isales.performance.leaguer.dto.RegistChartDTO;
import com.haier.isales.performance.leaguer.dto.RegistDTO;
import com.haier.isales.performance.leaguer.registrate.dao.RegRateVerDAO;
import com.haier.isales.performance.leaguer.registrate.service.RegRateVerService;

/** 
 * @ClassName: RegRateVerService
 * @Description: RegRateVer的Service接口定义类   会员注册率相关
 *  
 */
public class RegRateVerServiceImpl implements RegRateVerService{

//	private static final Logger LOG = LoggerFactory.getLogger(RegRateVerServiceImpl.class);
	
	/** 
	* @Fields regRateVerDao : RegRateVerDao 工具依赖 
	*/
	private RegRateVerDAO regRateVerDao;
	
	
	/*===============业务方法=============*/
	/**
	* <p>Description:根据     门店id、月份 、产品线   条件查询注册率 </p> 
	* @author Guo Yuchao   
	* @date 2014-12-18 下午1:39:03 
	* @param registDTO
	* @return
	* @throws BusinessException 
	* @see com.haier.isales.performance.leaguer.registrate.service.RegRateVerService#findRegistInfoByParam(com.haier.isales.performance.leaguer.dto.RegistDTO) 
	*/ 
	@Override
	public RegistDTO findRegistInfoByParam(RegistDTO registDTO)
			throws BusinessException {
		//验证参数是否为空
		CheckParamUtil.checkFieldIfNotBlank(registDTO, "month","productLineId");
		if(StringUtils.isEmpty(registDTO.getShopId().trim())){
			throw new BusinessException(BusinessExceptionCode.no_shop);
		}
		//验证月份格式
		String month = registDTO.getMonth();
		month = IsalesDateUtil.getPeriodDateString(month);
		registDTO.setMonth(month);
		List<String> productLineList = Arrays.asList((String[])registDTO.getProductLineId().trim().split(","));
		//查询指定月份注册信息
		RegistDTO thisMonthRegist = regRateVerDao.findRegistInfoByParam(registDTO,productLineList);
		if(thisMonthRegist == null){
//			throw new BusinessException(BusinessExceptionCode.database_none_data,"没有找到指定的注册信息");
			return new RegistDTO("0","0","0",IsAscendEnum.平稳.getValue());
		}
		//查指定月份 上个月信息
		String lastMonth = IsalesDateUtil.getBeforeMonthFromDateStr(month,0,-1);
		registDTO.setMonth(lastMonth);
		RegistDTO lastMonthRegist = regRateVerDao.findRegistInfoByParam(registDTO,productLineList);
		//判断是否增长
		if(lastMonthRegist == null){
			thisMonthRegist.setIsAscend(IsAscendEnum.上升.getValue());//增长
		}else{
			BigDecimal rateCompare = CheckParamUtil.digitalStrSubtractWithBigDecimal(thisMonthRegist.getRegistRate(),lastMonthRegist.getRegistRate());
			if(rateCompare.compareTo(BigDecimal.ZERO) > 0){
				thisMonthRegist.setIsAscend(IsAscendEnum.上升.getValue());		
			}else if(rateCompare.compareTo(BigDecimal.ZERO) == 0){
				thisMonthRegist.setIsAscend(IsAscendEnum.平稳.getValue());
			}else{
				thisMonthRegist.setIsAscend(IsAscendEnum.下降.getValue());
			}
		}
		return thisMonthRegist;
	}
	
	
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性regRateVerDao 的set方法 
	 */
	public void setRegRateVerDao(RegRateVerDAO regRateVerDao){
		this.regRateVerDao = regRateVerDao;
	}




	/**
	* <p>Description:返回从现在往前12月的注册率信息 </p> 
	* @author Guo Yuchao   
	* @date 2014-12-19 下午1:49:30 
	* @param registDTO
	* @return 
	* @see com.haier.isales.performance.leaguer.registrate.service.RegRateVerService#findRegistChartByParam(com.haier.isales.performance.leaguer.dto.RegistDTO) 
	*/ 
	@Override
	public RegistChartDTO findRegistChartByParam(RegistDTO registDTO) {
		//验证参数是否为空
		CheckParamUtil.checkFieldIfNotBlank(registDTO, "month","productLineId");
		if(StringUtils.isEmpty(registDTO.getShopId().trim())){
			throw new BusinessException(BusinessExceptionCode.no_shop);
		}
		//验证月份格式
//		String month = registDTO.getMonth();
//		month = IsalesDateUtil.getPeriodDateString(month);
//		registDTO.setMonth(month);
//		registDTO.setBeforeMonth(IsalesDateUtil.getBeforeMonthFromDateStr(month,-11));//查询前第十一月是那个月
		Calendar cal = Calendar.getInstance();
		StringBuffer yearMonth = new StringBuffer();
		int month = cal.get(Calendar.MONTH)+1;
		if(month<10){
			yearMonth.append(cal.get(Calendar.YEAR)).append("-0").append(month);
		}else{
			yearMonth.append(cal.get(Calendar.YEAR)).append("-").append(month);
		}
		registDTO.setMonth(yearMonth.toString());
	    registDTO.setBeforeMonth(IsalesDateUtil.getBeforeMonthFromDateStr(yearMonth.toString(),0,-11));//查询前第十一月是那个月
		List<String> productLineList = Arrays.asList((String[])registDTO.getProductLineId().trim().split(","));
		
		List<RegistDTO> registList = regRateVerDao.findRegistChartByParam(registDTO,productLineList);
		RegistChartDTO registChartDTO = getRegistChartDtoByDbinfo(registList);
		return registChartDTO;
	}




	/** 
	* @Description: 构造图表参数
	* @author Guo Yuchao   
	* @date 2014-12-19 下午4:04:15 
	* @param registList
	* @return  
	*/ 
	private RegistChartDTO getRegistChartDtoByDbinfo(List<RegistDTO> registList) {
//		List<String> yearMonth = new ArrayList<String>();//年月
		List<String> yearMonth = IsalesDateUtil.getLast12YearMonthList("当前年月",0);//年月
		//定义返回list
		List<Long> countsList = new ArrayList<Long>();
		List<Long> registQtyList = new ArrayList<Long>();
		List<Double> registRateList = new ArrayList<Double>();
		//定义数据Map
		Map<String,String> countsMap = new HashMap<String, String>();
		Map<String,String> registQtyMap = new HashMap<String, String>();
		Map<String,String> registRateMap = new HashMap<String, String>();
		//封装map
		for (RegistDTO registDTO : registList) {
			if(registDTO == null){
				continue;
			}
			String chartYearMonth = IsalesDateUtil.getRegistChartString(registDTO.getMonth());
			countsMap.put(chartYearMonth, registDTO.getCounts());
			registQtyMap.put(chartYearMonth, registDTO.getRegistQty());
			registRateMap.put(chartYearMonth, registDTO.getRegistRate());
		}
		//封装返回数据
		for (String yearMonthStr : yearMonth) {
			//封装销量
			if(countsMap.get(yearMonthStr) == null){
				countsList.add(0L);
			}else{
				countsList.add(CheckParamUtil.parseStrToLong(countsMap.get(yearMonthStr)));
			}
			//封装会员数量
			if(registQtyMap.get(yearMonthStr) == null){
				registQtyList.add(0L);
			}else{
				registQtyList.add(CheckParamUtil.parseStrToLong(registQtyMap.get(yearMonthStr)));
			}
			//封装注册率
			if(registRateMap.get(yearMonthStr) == null){
				registRateList.add(0.0);
			}else{
				registRateList.add(CheckParamUtil.parseStrToDouble(countsMap.get(yearMonthStr)));
			}
		}
		return new RegistChartDTO(yearMonth,countsList,registQtyList,registRateList);
	}
}
