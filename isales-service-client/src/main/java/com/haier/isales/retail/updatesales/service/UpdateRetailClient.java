/**
 * @Company 青鸟软通   
 * @Title: UpdateRetailClient.java 
 * @Package com.haier.isales.retail.updatesales.service 
 * @author John.zhao   
 * @date 2015-3-13 上午9:45:12 
 * @version V1.0   
 */
package com.haier.isales.retail.updatesales.service;

import com.haier.isales.retail.updatesales.dto.CheckUserInTableDTO;
import com.haier.isales.retail.updatesales.dto.UpdateBarCodeParamDTO;
import com.haier.isales.retail.updatesales.dto.UpdateModelParamDTO;

/**
 * @ClassName: UpdateRetailClient
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public interface UpdateRetailClient {

	public Object updateModelRetail(UpdateModelParamDTO updateModelParamDTO);

	public Object updateBarCodeRetail(UpdateBarCodeParamDTO updateBarCodeParamDTO);
	
	public Object searchIfInTable(CheckUserInTableDTO checkUserInTableDTO);
}
