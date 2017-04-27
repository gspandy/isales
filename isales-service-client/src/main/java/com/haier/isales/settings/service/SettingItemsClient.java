package com.haier.isales.settings.service;

import io.terminus.pampas.client.Export;

public interface SettingItemsClient {
	/** 
	* @Description: TODO 显示SettingItems
	* @author Shao Jingkai   
	* @date 2015-6-11 上午9:45:47 
	* @param operatorId
	* @return  
	*/ 
	@Export(paramNames = {"operatorId"})
	Object findSettingItems(Long operatorId);

	/** 
	* @Description: TODO 修改SettingItems
	* @author Shao Jingkai   
	* @date 2015-6-11 上午9:46:37 
	* @param operatorId
	* @param newValueId
	* @return  
	*/ 
	@Export(paramNames={"operatorId", "newValueId"})
	Object resetSettingItems(Long operatorId, Long newValueId);
}
