/**
 * @Company 青鸟软通   
 * @Title: ProductsInfoAppService.java 
 * @Package  com.haier.isales.products.productsinfoapp.service
 * @author John.Zhao   
 * @date 2015年01月28日  14:32:51
 * @version V1.0   
 */
package com.haier.isales.products.productsinfoapp.service;

import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.products.dto.ProductsInfoSearchDTO;
import com.haier.isales.products.productsinfoapp.domain.ProductLineDomain;
import com.haier.isales.products.productsinfoapp.domain.ProductsInfoAppDomain;

/** 
 * @ClassName: ProductsInfoAppService
 * @Description: ProductsInfoApp的Service接口定义类
 *  
 */
public interface ProductsInfoAppService {
	
	List<ProductLineDomain> searchProductLineList(String userCode);
	
	PageResult<ProductsInfoAppDomain> searchProductsInfoList(ProductsInfoSearchDTO productsInfoSearchDTO,PageCond pageCond);
}
