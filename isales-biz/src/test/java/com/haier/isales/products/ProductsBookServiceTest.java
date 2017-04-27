/**
* @Company 青鸟软通   
* @Title: ProductsBookServiceTest.java 
* @Package com.haier.isales.products 
* @author John.zhao   
* @date 2015-1-22 下午5:08:44 
* @version V1.0   
*/ 
package com.haier.isales.products;

import org.junit.Test;

/** 
 * @ClassName: ProductsBookServiceTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsBookServiceTest extends ProductsTestCase {
	
	@Test
	public void testSaveAllProductsBook(){
		productsBookService.saveAllProductsBook();
	}
}
