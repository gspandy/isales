/**
 * @Company 青鸟软通   
 * @Title: QuotientSelectClientServiceImpl.java 
 * @Package com.haier.isales.performance.service.impl 
 * @author John.zhao   
 * @date 2014-12-19 上午9:35:47 
 * @version V1.0   
 */
package com.haier.isales.performance.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.haier.isales.common.IsalesDateUtil;
import com.haier.isales.performance.quotient.QuotientDomainDtoCloneUtil;
import com.haier.isales.performance.quotient.domain.QuotientDomain;
import com.haier.isales.performance.quotient.dto.QuotientChartsDTO;
import com.haier.isales.performance.quotient.dto.QuotientDTO;
import com.haier.isales.performance.quotient.service.QuotientSelectClient;
import com.haier.isales.performance.quotient.service.QuotientService;

/**
 * @ClassName: QuotientSelectClientServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public class QuotientServiceSelectClientImpl implements QuotientSelectClient {

	private QuotientService quotientService;

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2014-12-19 上午9:35:47
	 * @param quotientDTO
	 * @return
	 * @see com.haier.isales.performance.quotient.service.QuotientSelectClient#searchQuotientAccomplish(com.haier.isales.performance.quotient.dto.QuotientDTO)
	 */
	@Override
	public Object searchQuotientAccomplish(QuotientDTO quotientDTO) {
		QuotientDomain domain = QuotientDomainDtoCloneUtil.cloneQuotientDTO2Domain(quotientDTO);
		QuotientDomain qdomain = quotientService.searchQuotientAccomplish(domain);
		QuotientDTO dto = QuotientDomainDtoCloneUtil.cloneQuotientDomain2DTO(qdomain);
		return dto;
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2014-12-19 下午12:34:32
	 * @param quotientDTO
	 * @return
	 * @see com.haier.isales.performance.quotient.service.QuotientSelectClient#getQuotientCharts(com.haier.isales.performance.quotient.dto.QuotientDTO)
	 */
	@Override
	public Object getQuotientCharts(QuotientDTO quotientDTO) {
		QuotientDomain domain = QuotientDomainDtoCloneUtil.cloneQuotientDTO2Domain(quotientDTO);
		Calendar ca = Calendar.getInstance();
		domain.setYear(ca.get(Calendar.YEAR));
		domain.setMonth(ca.get(Calendar.MONTH)+1);
		//直接查询出门店、产业、当前月及向前11个月的走势
		List<QuotientDomain> searchQuotientCharts = quotientService.searchQuotientCharts(domain);
		//下面是把查询出的list拆解出四个list，分别代表12个月的年-月，目标 份额、实际份额、同期份额，方便画出折线图
		QuotientChartsDTO qcDTO = new QuotientChartsDTO();
		List<BigDecimal> target = new ArrayList<BigDecimal>();
		List<BigDecimal> actual = new ArrayList<BigDecimal>();
		List<BigDecimal> period = new ArrayList<BigDecimal>();
		Map<String,BigDecimal> targetMap = new HashMap<String, BigDecimal>();
		Map<String,BigDecimal> actualMap = new HashMap<String, BigDecimal>();
		Map<String,BigDecimal> periodMap = new HashMap<String, BigDecimal>();
		for(QuotientDomain qd : searchQuotientCharts){
			if(qd.getYear()!=null&&qd.getMonth()!=null){
				String yearMonthTemp = qd.getYear()%100 + "-" + qd.getMonth();
				targetMap.put(yearMonthTemp, qd.getTarget());
				actualMap.put(yearMonthTemp, qd.getActual());
				periodMap.put(yearMonthTemp, qd.getCrrspdPeriod());
			}
		}
		// 查询当前月及向前11个月的list
		List<String> yearMonthList = IsalesDateUtil.getLast12YearMonthList("aaa",0);
		for (String current : yearMonthList) {
			if(targetMap.get(current)==null){
				target.add(BigDecimal.ZERO);
			}else{
				target.add(targetMap.get(current).multiply(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP));
			}
			if(actualMap.get(current)==null){
				actual.add(BigDecimal.ZERO);
			}else{
				actual.add(actualMap.get(current).multiply(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP));
			}
			if(periodMap.get(current)==null){
				period.add(BigDecimal.ZERO);
			}else{
				period.add(periodMap.get(current).multiply(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP));
			}
		}
		qcDTO.setYearMonth(yearMonthList);
		qcDTO.setTarget(target);
		qcDTO.setActual(actual);
		qcDTO.setPeriod(period);
		return qcDTO;
	}
	
	/**
	 * @Description: 属性 quotientService 的set方法
	 * @param quotientService
	 */
	public void setQuotientService(QuotientService quotientService) {
		this.quotientService = quotientService;
	}

}
