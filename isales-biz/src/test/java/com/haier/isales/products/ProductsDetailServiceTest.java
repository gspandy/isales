/**
* @Company 青鸟软通   
* @Title: ProductsDetailServiceTest.java 
* @Package com.haier.isales.products 
* @author John.zhao   
* @date 2015-1-23 上午10:33:59 
* @version V1.0   
*/ 
package com.haier.isales.products;

import org.junit.Test;

/** 
 * @ClassName: ProductsDetailServiceTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsDetailServiceTest extends ProductsTestCase {

	@Test
	public void testSaveAllProductsDetailAndImage(){
		productsDetailService.saveAllProductsDetailAndImage();
	}
}
