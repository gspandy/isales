/**
 * @Company 青鸟软通   
 * @Title: ProductsBookAppService.java 
 * @Package  com.haier.isales.products.productsbookapp.service.impl
 * @author John.Zhao   
 * @date 2015年01月27日  15:36:15
 * @version V1.0   
 */
package com.haier.isales.products.productsbookapp.service.impl;


import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.products.productsbookapp.dao.ProductsBookAppDAO;
import com.haier.isales.products.productsbookapp.domain.ProductsBookAppDomain;
import com.haier.isales.products.productsbookapp.service.ProductsBookAppService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: ProductsBookAppService
 * @Description: ProductsBookApp的Service接口定义类
 *  
 */
public class ProductsBookAppServiceImpl implements ProductsBookAppService{

	private static final Logger LOG = LoggerFactory.getLogger(ProductsBookAppServiceImpl.class);
	
	/** 
	* @Fields productsBookAppDao : ProductsBookAppDao 工具依赖 
	*/
	private ProductsBookAppDAO productsBookAppDao;
	
	
	/*===============业务方法=============*/
	
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-1-27 下午4:04:55 
	* @param metadataid
	* @return 
	* @see com.haier.isales.products.productsbookapp.service.ProductsBookAppService#searchProductsBook(java.lang.Long) 
	*/ 
	@Override
	public ProductsBookAppDomain searchProductsBook(Long metadataid) {
		LOG.info("查询说明书service,传入参数为"+metadataid);
		if(metadataid == null){
			throw new BusinessException(BusinessExceptionCode.param_error, "传入参数为空！");
		}
		return productsBookAppDao.searchProductsBook(metadataid);
	}
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性productsBookAppDao 的set方法 
	 */
	public void setProductsBookAppDao(ProductsBookAppDAO productsBookAppDao){
		this.productsBookAppDao = productsBookAppDao;
	}
}
