/**
 * @Company 青鸟软通   
 * @Title: ReportSalesServiceClient.java 
 * @Package com.haier.isales.retail.reportsales 
 * @author John Zhao   
 * @date 2014-11-11 下午10:45:53 
 * @version V1.0   
 */
package com.haier.isales.retail.reportsales.service;

import io.terminus.pampas.client.Export;
import com.haier.isales.retail.reportsales.dto.ReportSalesDTO;

/**
 * @ClassName: ReportSalesServiceClient
 * @Description: 员工销量提报dubbo接口
 * 
 */
public interface ReportSalesServiceClient {

	/** 
	* @Description: 按型号提报销量接口
	* @author John Zhao   
	* @date 2014-11-12 上午9:27:21 
	* @param reportSalesDTO
	* @return  
	*/ 
	@Export(paramNames = { "reportSalesDTO" })
	public Object reportSalesByModel(ReportSalesDTO reportSalesDTO);

	/** 
	* @Description: 按条码提报接口
	* @author John Zhao   
	* @date 2014-11-12 上午9:27:29 
	* @param reportSalesDTO
	* @return  
	*/ 
	@Export(paramNames = { "reportSalesDTO" })
	public Object reportSalesByBarCode(ReportSalesDTO reportSalesDTO);

}
