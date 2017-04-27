/**
* @Company 青鸟软通   
* @Title: ProductsTestCase.java 
* @Package com.haier.isales 
* @author John.zhao   
* @date 2015-1-20 下午5:20:27 
* @version V1.0   
*/ 
package com.haier.isales.products;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.products.heretemp.productsbook.service.ProductsBookService;
import com.haier.isales.products.heretemp.productsclassify.service.ProductsClassifyService;
import com.haier.isales.products.heretemp.productsclassifyparams.service.ProductsClassifyParamsService;
import com.haier.isales.products.heretemp.productsdetail.service.ProductsDetailService;
import com.haier.isales.products.heretemp.productsfaq.service.ProductsFAQService;
import com.haier.isales.products.heretemp.productsparams.service.ProductsParamsService;
import com.haier.isales.products.productsdetailapp.service.ProductsDetailAppService;
import com.haier.isales.products.productsinfoapp.service.ProductsInfoAppService;
import com.haier.openplatform.showcase.BaseTestCase;

/** 
 * @ClassName: ProductsTestCase 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
@ContextConfiguration(locations = { 
		"classpath*:/spring/products/heretemp/spring-*.xml",
		"classpath*:/spring/products/spring-*.xml"})
public class ProductsTestCase extends BaseTestCase{
	@Resource
	protected ProductsClassifyService productsClassifyService;
	@Resource
	protected ProductsParamsService productsParamsService;
	@Resource
	protected ProductsClassifyParamsService productsClassifyParamsService;
	@Resource
	protected ProductsFAQService productsFAQService;
	@Resource
	protected ProductsBookService productsBookService;
	@Resource
	protected ProductsDetailService productsDetailService;
	@Resource
	protected ProductsInfoAppService productsInfoAppService;
	@Resource
	protected ProductsDetailAppService productsDetailAppService;
} 
