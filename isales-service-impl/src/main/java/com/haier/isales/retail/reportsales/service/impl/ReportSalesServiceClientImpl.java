/**
* @Company 青鸟软通   
* @Title: ReportSalesServiceClientImpl.java 
* @Package com.haier.isales.retail.reportsales 
* @author John Zhao   
* @date 2014-11-11 下午10:51:54 
* @version V1.0   
*/ 
package com.haier.isales.retail.reportsales.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.DomainDtoUtil;
import com.haier.isales.retail.reportsales.domain.ReportsalesDomain;
import com.haier.isales.retail.reportsales.dto.ReportSalesDTO;
import com.haier.isales.retail.reportsales.service.ReportSalesServiceClient;
import com.haier.isales.retail.reportsales.service.ReportsalesService;

/** 
 * @ClassName: ReportSalesServiceClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ReportSalesServiceClientImpl implements ReportSalesServiceClient {
	private static final Logger LOG = LoggerFactory.getLogger(ReportSalesServiceClientImpl.class);

	private ReportsalesService reportsalesService;
	

	/**
	 * <p>Description: </p> 
	 * @author John Zhao   
	 * @date 2014-11-11 下午10:51:54 
	 * @param reportSalesDTO
	 * @return 
	 * @see com.haier.isales.retail.reportsales.service.ReportSalesServiceClient#reportSalesByModel(com.haier.isales.retail.reportsales.dto.ReportSalesDTO) 
	 */
	@Override
	public Object reportSalesByModel(ReportSalesDTO reportSalesDTO) {
		LOG.info("按型号提报销量Dubbo接口传入的参数为："+reportSalesDTO);
		ReportsalesDomain reportsalesDomain = DomainDtoUtil.cloneReportSalesDTO2ReportSalesDomain(reportSalesDTO);
		return reportsalesService.saveReportSalesByModel(reportsalesDomain);
	}

	/**
	* <p>Description: </p> 
	* @author John Zhao   
	* @date 2014-11-12 上午9:28:36 
	* @param reportSalesDTO
	* @return 
	* @see com.haier.isales.retail.reportsales.service.ReportSalesServiceClient#reportSalesByBarCode(com.haier.isales.retail.reportsales.dto.ReportSalesDTO) 
	*/ 
	@Override
	public Object reportSalesByBarCode(ReportSalesDTO reportSalesDTO) {
		LOG.info("按型号提报销量Dubbo接口传入的参数为："+reportSalesDTO);
		ReportsalesDomain reportsalesDomain = DomainDtoUtil.cloneReportSalesDTO2ReportSalesDomain(reportSalesDTO);
		return reportsalesService.saveReportSalesByBarCode(reportsalesDomain);
	}
	
	/**
	 * @Description: 属性 reportsalesService 的set方法 
	 * @param reportsalesService 
	 */
	public void setReportsalesService(ReportsalesService reportsalesService) {
		this.reportsalesService = reportsalesService;
	}
}
