/**
* @Company 青鸟软通   
* @Title: UpdateRetailService.java 
* @Package com.haier.isales.retail.updateretail.service 
* @author John.zhao   
* @date 2015-3-13 上午9:35:30 
* @version V1.0   
*/ 
package com.haier.isales.retail.updateretail.service;

import com.haier.isales.retail.updatesales.dto.CheckUserInTableDTO;
import com.haier.isales.retail.updatesales.dto.UpdateBarCodeParamDTO;
import com.haier.isales.retail.updatesales.dto.UpdateModelParamDTO;
import com.haier.isales.ws.zzjyt.client.btbappxlgxupdateimpl.BtbapPxlgxInfo;
import com.haier.isales.ws.zzjyt.client.tmappupdateimpl.TmAPPUpdateInfo;

/** 
 * @ClassName: UpdateRetailService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public interface UpdateRetailService {

	public BtbapPxlgxInfo updateModelRetail(UpdateModelParamDTO updateModelParamDTO);
	
	
	public TmAPPUpdateInfo updateBarCodeRetail(UpdateBarCodeParamDTO updateBarCodeParamDTO);

	public CheckUserInTableDTO searchIfInTable(CheckUserInTableDTO checkUserInTableDTO);
}
