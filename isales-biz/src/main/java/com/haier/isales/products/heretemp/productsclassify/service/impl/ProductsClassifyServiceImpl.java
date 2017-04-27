/**
 * @Company 青鸟软通   
 * @Title: ProductsClassifyService.java 
 * @Package  com.haier.isales.products.productsclassify.service.impl
 * @author John.Zhao   
 * @date 2015年01月20日  17:07:09
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsclassify.service.impl;


import java.util.List;

import org.bana.common.util.exception.ThrowableUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.products.hereinterface.HaierHereProductsInterface;
import com.haier.isales.products.heretemp.productsclassify.dao.ProductsClassifyDAO;
import com.haier.isales.products.heretemp.productsclassify.domain.ProductsClassifyDomain;
import com.haier.isales.products.heretemp.productsclassify.service.ProductsClassifyService;

/** 
 * @ClassName: ProductsClassifyService
 * @Description: ProductsClassify的Service接口定义类
 *  
 */
public class ProductsClassifyServiceImpl implements ProductsClassifyService{

	private static final Logger LOG = LoggerFactory.getLogger(ProductsClassifyServiceImpl.class);
	
	/** 
	* @Fields productsClassifyDao : ProductsClassifyDao 工具依赖 
	*/
	private ProductsClassifyDAO productsClassifyDao;
	
	
	/*===============业务方法=============*/
	
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-1-20 下午5:08:16  
	* @see com.haier.isales.products.productsclassify.service.ProductsClassifyService#saveAllProductInfo() 
	*/ 
	@Override
	public void saveAllProductInfo(){
		LOG.info("saveAllProductInfo");
		//先删除数据
		productsClassifyDao.deleteAll();
		//再同步新的数据
		try {
			List<ProductsClassifyDomain> allProductInfoList = HaierHereProductsInterface.saveAllProductInfo();
			productsClassifyDao.saveAllProductInfo(allProductInfoList);
		} catch (Exception e) {
			throw new BusinessException(BusinessExceptionCode.ws_result_error, ThrowableUtil.getStackTrace(e));
		}
	}
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性productsClassifyDao 的set方法 
	 */
	public void setProductsClassifyDao(ProductsClassifyDAO productsClassifyDao){
		this.productsClassifyDao = productsClassifyDao;
	}


	
}
