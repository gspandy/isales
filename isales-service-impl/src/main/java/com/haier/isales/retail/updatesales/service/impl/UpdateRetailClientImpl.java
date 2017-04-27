/**
* @Company 青鸟软通   
* @Title: UpdateRetailClientImpl.java 
* @Package com.haier.isales.retail.updatesales.service.impl 
* @author John.zhao   
* @date 2015-3-13 上午10:10:32 
* @version V1.0   
*/ 
package com.haier.isales.retail.updatesales.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.retail.reportsales.service.impl.ReportSalesServiceClientImpl;
import com.haier.isales.retail.updateretail.UpdateResult2DTOUtil;
import com.haier.isales.retail.updateretail.service.UpdateRetailService;
import com.haier.isales.retail.updatesales.dto.CheckUserInTableDTO;
import com.haier.isales.retail.updatesales.dto.UpdateBarCodeParamDTO;
import com.haier.isales.retail.updatesales.dto.UpdateModelParamDTO;
import com.haier.isales.retail.updatesales.dto.UpdateResultDTO;
import com.haier.isales.retail.updatesales.service.UpdateRetailClient;
import com.haier.isales.ws.zzjyt.client.btbappxlgxupdateimpl.BtbapPxlgxInfo;
import com.haier.isales.ws.zzjyt.client.tmappupdateimpl.TmAPPUpdateInfo;

/** 
 * @ClassName: UpdateRetailClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class UpdateRetailClientImpl implements UpdateRetailClient {

	private static final Logger LOG = LoggerFactory.getLogger(UpdateRetailClientImpl.class);

	private UpdateRetailService updateRetailService;
	
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-3-13 上午10:11:30 
	* @param updateModelParamDTO
	* @return 
	* @see com.haier.isales.retail.updatesales.service.UpdateRetailClient#updateModelRetail(com.haier.isales.retail.updatesales.dto.UpdateModelParamDTO) 
	*/ 
	@Override
	public Object updateModelRetail(UpdateModelParamDTO updateModelParamDTO) {
		LOG.info("按型号更新销量Dubbo接口传入的参数为："+updateModelParamDTO);
		BtbapPxlgxInfo btbapPxlgxInfo = updateRetailService.updateModelRetail(updateModelParamDTO);
		UpdateResultDTO updateResultDTO = UpdateResult2DTOUtil.cloneUpdateModelResult2DTO(btbapPxlgxInfo);
		return updateResultDTO;
	}

	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-3-13 上午10:11:30 
	* @param updateBarCodeParamDTO
	* @return 
	* @see com.haier.isales.retail.updatesales.service.UpdateRetailClient#updateBarCodeRetail(com.haier.isales.retail.updatesales.dto.UpdateBarCodeParamDTO) 
	*/ 
	@Override
	public Object updateBarCodeRetail(UpdateBarCodeParamDTO updateBarCodeParamDTO) {
		LOG.info("按条码更新销量Dubbo接口传入的参数为："+updateBarCodeParamDTO);
		TmAPPUpdateInfo tmAPPUpdateInfo = updateRetailService.updateBarCodeRetail(updateBarCodeParamDTO);
		UpdateResultDTO updateResultDTO = UpdateResult2DTOUtil.cloneUpdateBarCodeResult2DTO(tmAPPUpdateInfo);
		return updateResultDTO;
	}

	
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-3-17 下午2:26:07 
	* @param checkUserInTableDTO
	* @return 
	* @see com.haier.isales.retail.updatesales.service.UpdateRetailClient#searchIfInTable(com.haier.isales.retail.updatesales.dto.CheckUserInTableDTO) 
	*/ 
	@Override
	public Object searchIfInTable(CheckUserInTableDTO checkUserInTableDTO) {
		return updateRetailService.searchIfInTable(checkUserInTableDTO);
	}
	
	
	//==============================================================================
	/**
	 * @Description: 属性 updateRetailService 的set方法 
	 * @param updateRetailService 
	 */
	public void setUpdateRetailService(UpdateRetailService updateRetailService) {
		this.updateRetailService = updateRetailService;
	}
}
