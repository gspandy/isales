/**
 * @Company 青鸟软通   
 * @Title: ProductsFAQAppService.java 
 * @Package  com.haier.isales.products.productsfaqapp.service.impl
 * @author John.Zhao   
 * @date 2015年01月28日  10:04:21
 * @version V1.0   
 */
package com.haier.isales.products.productsfaqapp.service.impl;


import java.util.List;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.products.productsfaqapp.dao.ProductsFAQAppDAO;
import com.haier.isales.products.productsfaqapp.domain.ProductsFAQAppDomain;
import com.haier.isales.products.productsfaqapp.service.ProductsFAQAppService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: ProductsFAQAppService
 * @Description: ProductsFAQApp的Service接口定义类
 *  
 */
public class ProductsFAQAppServiceImpl implements ProductsFAQAppService{

	private static final Logger LOG = LoggerFactory.getLogger(ProductsFAQAppServiceImpl.class);
	
	/** 
	* @Fields productsFAQAppDao : ProductsFAQAppDao 工具依赖 
	*/
	private ProductsFAQAppDAO productsFAQAppDao;
	
	
	/*===============业务方法=============*/
	@Override
	public List<ProductsFAQAppDomain> searchProductsFAQs(Long metadataid){
		LOG.info("查询常见问题service,传入参数为"+metadataid);
		if(metadataid == null){
			throw new BusinessException(BusinessExceptionCode.param_error, "传入参数为空！");
		}
		return productsFAQAppDao.searchProductsFAQs(metadataid);
	}
	
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性productsFAQAppDao 的set方法 
	 */
	public void setProductsFAQAppDao(ProductsFAQAppDAO productsFAQAppDao){
		this.productsFAQAppDao = productsFAQAppDao;
	}
	
}
