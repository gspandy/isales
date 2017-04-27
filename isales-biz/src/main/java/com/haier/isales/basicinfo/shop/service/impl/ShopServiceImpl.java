/**
 * @Company 青鸟软通   
 * @Title: ShopService.java 
 * @Package  com.haier.isales.basicinfo.shop.service.impl
 * @author Guo Yuchao   
 * @date 2014年11月21日  16:52:08
 * @version V1.0   
 */
package com.haier.isales.basicinfo.shop.service.impl;


import org.bana.common.util.basic.StringUtils;

import com.haier.isales.basicinfo.shop.dao.ShopDAO;
import com.haier.isales.basicinfo.shop.domain.ShopDomain;
import com.haier.isales.basicinfo.shop.service.ShopService;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;

/** 
 * @ClassName: ShopService
 * @Description: Shop的Service接口定义类
 *  
 */
public class ShopServiceImpl implements ShopService{

//	private static final Logger LOG = LoggerFactory.getLogger(ShopServiceImpl.class);
	
	/** 
	* @Fields shopDao : ShopDao 工具依赖 
	*/
	private ShopDAO shopDao;
	
	
	/*===============业务方法=============*/
	/**
	 * <p>Description: 根据主键查询门店信息</p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-21 下午4:59:22 
	 * @param shopCode
	 * @return 
	 * @see com.haier.isales.basicinfo.shop.service.ShopService#findById(java.lang.String) 
	 */ 
	@Override
	public ShopDomain findById(String shopCode) {
		if(StringUtils.isEmpty(shopCode)){
			throw new BusinessException(BusinessExceptionCode.param_error,"门店编号不能为空");
		}
		return shopDao.findById(shopCode);
	}
	
	
	
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性shopDao 的set方法 
	 */
	public void setShopDao(ShopDAO shopDao){
		this.shopDao = shopDao;
	}


	
}
