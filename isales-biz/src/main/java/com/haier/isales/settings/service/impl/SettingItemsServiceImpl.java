package com.haier.isales.settings.service.impl;

import java.util.Date;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.settings.dao.SettingItemsDAO;
import com.haier.isales.settings.domain.SettingItemsValueDomain;
import com.haier.isales.settings.domain.SettingItemsValueUserDomain;
import com.haier.isales.settings.domain.UserSettingItemsDomain;
import com.haier.isales.settings.service.SettingItemsService;

public class SettingItemsServiceImpl implements SettingItemsService{
	private SettingItemsDAO settingItemsDao;

	/**
	* <p>Description: 根据从session中获取的operatorId查询用户的设置，若未设置，给予默认设置</p> 
	* @author Shao Jingkai   
	* @date 2015-6-10 下午6:34:25 
	* @param operatorId
	* @return 
	* @see com.haier.isales.settings.service.SettingItemsService#findSettingItems(java.lang.Long) 
	*/ 
	@Override
	public UserSettingItemsDomain findSettingItems(Long operatorId) {
		 if (operatorId == null) {
			 throw new BusinessException(BusinessExceptionCode.param_error,"传入参数为空");
		 }
		 UserSettingItemsDomain domain = settingItemsDao.findSettingItems(operatorId);
		 if (domain == null ||domain.getValueId() == null || domain.getValueName()==null) {
			 domain = new UserSettingItemsDomain();
			 domain.setOperatorId(operatorId);
			 domain.setItemName("首页类型");
			 domain.setValueId(1L);
			 domain.setValueName("传统首页");
		 }
		 return domain;
	}

	/**
	* <p>Description: 根据operatorId和页面传回的valueId修改用户对应的SettingItemsValueUser对象
	* 若无该对象则按默认设置创建</p> 
	* @author Shao Jingkai   
	* @date 2015-6-10 下午6:35:23 
	* @param operatorId
	* @param newValueId 
	* @see com.haier.isales.settings.service.SettingItemsService#resetSettingItems(java.lang.Long, java.lang.Long) 
	*/ 
	@Override
	public void resetSettingItems(Long operatorId, Long newValueId) {
		 if (operatorId == null || newValueId == null) {
			 throw new BusinessException(BusinessExceptionCode.param_error,"传入参数为空");
		 }
		SettingItemsValueDomain value = settingItemsDao.findValueById(newValueId);
		SettingItemsValueUserDomain user = settingItemsDao.findByOperatorId(operatorId);
		if (user == null) {
			user = new SettingItemsValueUserDomain();
			user.setOperatorId(operatorId);
			user.setItemId(1L);
			user.setValueId(value.getId());
			user.setValueCode(value.getValueCode());
			user.setCreateTime(new Date());
			user.setRemark(null);
			settingItemsDao.saveSettingItemsValueUser(user);
		} else {
			user.setValueId(value.getId());
			user.setValueCode(value.getValueCode());
			settingItemsDao.updateSettingItemsValueUser(user);
		}
	}


//================getters&setters===================
	/**
	 * @Description: 属性 settingItemsDao 的get方法 
	 * @return settingItemsDao
	 */
	public SettingItemsDAO getSettingItemsDao() {
		return settingItemsDao;
	}

	/**
	 * @Description: 属性 settingItemsDao 的set方法 
	 * @param settingItemsDao 
	 */
	public void setSettingItemsDao(SettingItemsDAO settingItemsDao) {
		this.settingItemsDao = settingItemsDao;
	}

}
