/**
 * @Company 青鸟软通   
 * @Title: ProductsImgService.java 
 * @Package  com.haier.isales.products.productsimg.service.impl
 * @author John.Zhao   
 * @date 2015年01月27日  10:29:41
 * @version V1.0   
 */
package com.haier.isales.products.productsimg.service.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.products.productsimg.dao.ProductsImgAppDAO;
import com.haier.isales.products.productsimg.domain.ProductsImgDomain;
import com.haier.isales.products.productsimg.service.ProductsImgAppService;

/** 
 * @ClassName: ProductsImgService
 * @Description: ProductsImg的Service接口定义类
 *  
 */
public class ProductsImgAppServiceImpl implements ProductsImgAppService{

	private static final Logger LOG = LoggerFactory.getLogger(ProductsImgAppServiceImpl.class);
	
	/** 
	* @Fields productsImgDao : ProductsImgDao 工具依赖 
	*/
	private ProductsImgAppDAO productsImgAppDao;
	
	
	/*===============业务方法=============*/
	
	
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-1-27 上午10:33:58 
	* @param metadataid
	* @return 
	* @see com.haier.isales.products.productsimg.service.ProductsImgService#searchProductsImages(java.lang.Long) 
	*/ 
	@Override
	public List<ProductsImgDomain> searchProductsImages(Long metadataid) {
		LOG.info("查询套图service,传入参数为"+metadataid);
		if(metadataid == null){
			throw new BusinessException(BusinessExceptionCode.param_error, "传入参数为空！");
		}
		return productsImgAppDao.searchProductsImages(metadataid);
	}

	/*====================getter and setter =================*/
	/**
	 * @Description: 属性 productsImgAppDao 的set方法 
	 * @param productsImgAppDao 
	 */
	public void setProductsImgAppDao(ProductsImgAppDAO productsImgAppDao) {
		this.productsImgAppDao = productsImgAppDao;
	}
}
