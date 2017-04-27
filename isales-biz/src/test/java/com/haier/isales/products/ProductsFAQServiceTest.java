/**
 * @Company 青鸟软通   
 * @Title: ProductsFAQServiceTest.java 
 * @Package com.haier.isales.products 
 * @author John.zhao   
 * @date 2015-1-22 下午3:39:16 
 * @version V1.0   
 */
package com.haier.isales.products;

import org.junit.Test;

/**
 * @ClassName: ProductsFAQServiceTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public class ProductsFAQServiceTest extends ProductsTestCase {
	
	@Test
	public void testsaveProductsFAQ() {
		productsFAQService.saveProductsFAQ();
	}

}
