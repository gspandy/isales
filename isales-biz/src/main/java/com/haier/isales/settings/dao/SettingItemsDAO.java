package com.haier.isales.settings.dao;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.settings.domain.SettingItemsValueDomain;
import com.haier.isales.settings.domain.SettingItemsValueUserDomain;
import com.haier.isales.settings.domain.UserSettingItemsDomain;

public interface SettingItemsDAO{
	
	/** 
	* @Description: TODO 查找所有UserSettingItems对象
	* @author Shao Jingkai   
	* @date 2015-6-10 下午6:28:13 
	* @param operatorId
	* @return  
	*/ 
	UserSettingItemsDomain findSettingItems(@Param("operatorId") Long operatorId);
	/** 
	* @Description: TODO 根据id查找SettingItemsValue对象
	* @author Shao Jingkai   
	* @date 2015-6-10 下午6:27:46 
	* @param newValueId
	* @return  
	*/ 
	SettingItemsValueDomain findValueById(@Param("newValueId") Long newValueId);
	/** 
	* @Description: TODO 根据OperatorId查找SettingItemsValueUser对象
	* @author Shao Jingkai   
	* @date 2015-6-10 下午6:27:04 
	* @param operatorId
	* @return  
	*/ 
	SettingItemsValueUserDomain findByOperatorId(@Param("operatorId") Long operatorId);
	/** 
	* @Description: TODO 更新一个settingItemsValueUser对象
	* @author Shao Jingkai   
	* @date 2015-6-10 下午6:26:42 
	* @param user  
	*/ 
	void updateSettingItemsValueUser(@Param("user") SettingItemsValueUserDomain user);
	/** 
	* @Description: TODO 添加一个settingItemsValueUser对象
	* @author Shao Jingkai   
	* @date 2015-6-10 下午6:26:17 
	* @param user  
	*/ 
	void saveSettingItemsValueUser(@Param("user") SettingItemsValueUserDomain user);
}
