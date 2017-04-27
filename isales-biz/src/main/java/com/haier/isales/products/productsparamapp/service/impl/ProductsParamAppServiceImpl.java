/**
 * @Company 青鸟软通   
 * @Title: ProductsParamAppService.java 
 * @Package  com.haier.isales.products.productsparamapp.service.impl
 * @author John.Zhao   
 * @date 2015年01月27日  15:34:10
 * @version V1.0   
 */
package com.haier.isales.products.productsparamapp.service.impl;


import java.util.List;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.products.productsparamapp.dao.ProductsParamAppDAO;
import com.haier.isales.products.productsparamapp.domain.ProductsParamAppDomain;
import com.haier.isales.products.productsparamapp.service.ProductsParamAppService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: ProductsParamAppService
 * @Description: ProductsParamApp的Service接口定义类
 *  
 */
public class ProductsParamAppServiceImpl implements ProductsParamAppService{

	private static final Logger LOG = LoggerFactory.getLogger(ProductsParamAppServiceImpl.class);
	
	/** 
	* @Fields productsParamAppDao : ProductsParamAppDao 工具依赖 
	*/
	private ProductsParamAppDAO productsParamAppDao;
	
	
	/*===============业务方法=============*/
	
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-1-27 下午4:01:52 
	* @param metadataid
	* @return 
	* @see com.haier.isales.products.productsparamapp.service.ProductsParamAppService#searchProductsParams(java.lang.Long) 
	*/ 
	@Override
	public List<ProductsParamAppDomain> searchProductsParams(Long metadataid) {
		LOG.info("查询规格参数service,传入参数为"+metadataid);
		if(metadataid == null){
			throw new BusinessException(BusinessExceptionCode.param_error, "传入参数为空！");
		}
		return productsParamAppDao.searchProductsParams(metadataid);
	}
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性productsParamAppDao 的set方法 
	 */
	public void setProductsParamAppDao(ProductsParamAppDAO productsParamAppDao){
		this.productsParamAppDao = productsParamAppDao;
	}
}
