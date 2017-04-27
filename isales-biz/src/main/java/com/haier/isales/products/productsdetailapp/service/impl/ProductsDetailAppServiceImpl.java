/**
 * @Company 青鸟软通   
 * @Title: ProductsDetailAppService.java 
 * @Package  com.haier.isales.products.productsdetailapp.service.impl
 * @author John.Zhao   
 * @date 2015年01月27日  13:54:27
 * @version V1.0   
 */
package com.haier.isales.products.productsdetailapp.service.impl;


import java.util.List;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.products.productsdetailapp.dao.ProductsDetailAppDAO;
import com.haier.isales.products.productsdetailapp.domain.ProductsDetailAppDomain;
import com.haier.isales.products.productsdetailapp.service.ProductsDetailAppService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: ProductsDetailAppService
 * @Description: ProductsDetailApp的Service接口定义类
 *  
 */
public class ProductsDetailAppServiceImpl implements ProductsDetailAppService{

	private static final Logger LOG = LoggerFactory.getLogger(ProductsDetailAppServiceImpl.class);
	
	/** 
	* @Fields productsDetailAppDao : ProductsDetailAppDao 工具依赖 
	*/
	private ProductsDetailAppDAO productsDetailAppDao;
	
	
	/*===============业务方法=============*/
	
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-1-27 下午2:00:27 
	* @param metadataid
	* @return 
	* @see com.haier.isales.products.productsdetailapp.service.ProductsDetailAppService#searchProductsDetail(java.lang.Long) 
	*/ 
	@Override
	public List<ProductsDetailAppDomain> searchProductsDetail(Long metadataid) {
		LOG.info("metadataid:"+metadataid);
		if(metadataid == null){
			throw new BusinessException(BusinessExceptionCode.param_error, "传入参数不能为空！");
		}
		return productsDetailAppDao.searchProductsDetail(metadataid);
	}
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性productsDetailAppDao 的set方法 
	 */
	public void setProductsDetailAppDao(ProductsDetailAppDAO productsDetailAppDao){
		this.productsDetailAppDao = productsDetailAppDao;
	}
}
