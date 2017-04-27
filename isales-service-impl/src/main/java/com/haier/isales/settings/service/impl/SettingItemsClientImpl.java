package com.haier.isales.settings.service.impl;

import org.apache.commons.beanutils.PropertyUtils;

import com.haier.isales.settings.domain.UserSettingItemsDomain;
import com.haier.isales.settings.dto.UserSettingItemsDTO;
import com.haier.isales.settings.service.SettingItemsClient;
import com.haier.isales.settings.service.SettingItemsService;

public class SettingItemsClientImpl implements SettingItemsClient{
	
	private SettingItemsService settingItemsService;
	/**
	* <p>Description:调用Service中的查找方法，转换为dto返回 </p> 
	* @author Shao Jingkai   
	* @date 2015-6-11 上午9:47:09 
	* @param operatorId
	* @return 
	* @see com.haier.isales.settings.service.SettingItemsClient#findSettingItems(java.lang.Long) 
	*/ 
	@Override
	public Object findSettingItems(Long operatorId) {		
		UserSettingItemsDomain domain = settingItemsService.findSettingItems(operatorId);
		UserSettingItemsDTO dto = new UserSettingItemsDTO();
		try {
			PropertyUtils.copyProperties(dto, domain);
		} catch (Exception e) {
		}
		return dto;
	}

	/**
	* <p>Description: 先调用Service修改方法，再调用查找方法</p> 
	* @author Shao Jingkai   
	* @date 2015-6-11 上午9:48:35 
	* @param operatorId
	* @param newValueId
	* @return 
	* @see com.haier.isales.settings.service.SettingItemsClient#resetSettingItems(java.lang.Long, java.lang.Long) 
	*/ 
	@Override
	public Object resetSettingItems(Long operatorId, Long newValueId) {
		settingItemsService.resetSettingItems(operatorId, newValueId);	
		UserSettingItemsDomain domain = settingItemsService.findSettingItems(operatorId);
		UserSettingItemsDTO dto = new UserSettingItemsDTO();
		try {
			PropertyUtils.copyProperties(dto, domain);
		} catch (Exception e) {
		}
		return dto;
	}


	//==============getters&setters====================
	/**
	 * @Description: 属性 settingItemsService 的get方法 
	 * @return settingItemsService
	 */
	public SettingItemsService getSettingItemsService() {
		return settingItemsService;
	}
	/**
	 * @Description: 属性 settingItemsService 的set方法 
	 * @param settingItemsService 
	 */
	public void setSettingItemsService(SettingItemsService settingItemsService) {
		this.settingItemsService = settingItemsService;
	}

}
