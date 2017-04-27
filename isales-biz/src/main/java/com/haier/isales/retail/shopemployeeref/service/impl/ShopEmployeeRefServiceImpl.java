/**
 * @Company 青鸟软通   
 * @Title: ShopEmployeeRefService.java 
 * @Package  com.haier.isales.retail.shopemployeeref.service.impl
 * @author John.Zhao   
 * @date 2015年04月03日  15:41:38
 * @version V1.0   
 */
package com.haier.isales.retail.shopemployeeref.service.impl;


import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.retail.shopemployeeref.dao.ShopEmployeeRefDAO;
import com.haier.isales.retail.shopemployeeref.domain.ShopEmployeeRefDomain;
import com.haier.isales.retail.shopemployeeref.service.ShopEmployeeRefService;

import org.bana.common.util.basic.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: ShopEmployeeRefService
 * @Description: ShopEmployeeRef的Service接口定义类
 *  
 */
public class ShopEmployeeRefServiceImpl implements ShopEmployeeRefService{

	private static final Logger LOG = LoggerFactory.getLogger(ShopEmployeeRefServiceImpl.class);
	
	/** 
	* @Fields shopEmployeeRefDao : ShopEmployeeRefDao 工具依赖 
	*/
	private ShopEmployeeRefDAO shopEmployeeRefDao;
	
	
	/*===============业务方法=============*/
	
	@Override
	public ShopEmployeeRefDomain findByCodeAndDate(ShopEmployeeRefDomain domain) {
		LOG.info("查询直销员上月所在门店信息，"+domain);
		
		String gjtime = DateUtil.toString(DateUtil.formateToDate(domain.getMonth(), "yyyy-MM-dd"), "yyyy-MM");
		domain.setMonth(gjtime);
		ShopEmployeeRefDomain shopEmployeeRefDomain = shopEmployeeRefDao.findByCodeAndDate(domain);
		if(shopEmployeeRefDomain == null){
			throw new BusinessException(BusinessExceptionCode.database_none_data,"未查询到您所在门店信息！");
		}
		if(shopEmployeeRefDomain.getShopCode()==null ||shopEmployeeRefDomain.getShopName()==null ){
			throw new BusinessException(BusinessExceptionCode.database_none_data,"未查询到您所在门店信息！");
		}
		return shopEmployeeRefDomain;
	}
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性shopEmployeeRefDao 的set方法 
	 */
	public void setShopEmployeeRefDao(ShopEmployeeRefDAO shopEmployeeRefDao){
		this.shopEmployeeRefDao = shopEmployeeRefDao;
	}
}
