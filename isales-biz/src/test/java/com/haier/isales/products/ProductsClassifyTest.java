/**
* @Company 青鸟软通   
* @Title: ProductsClassifyTest.java 
* @Package com.haier.isales.products 
* @author John.zhao   
* @date 2015-1-20 下午5:24:09 
* @version V1.0   
*/ 
package com.haier.isales.products;

import java.io.UnsupportedEncodingException;

import org.junit.Test;
import org.springframework.test.annotation.NotTransactional;

/** 
 * @ClassName: ProductsClassifyTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsClassifyTest extends ProductsTestCase {
	/** 
	* @Description: 测试保存所有的产品类型
	* @author John.zhao   
	* @date 2015-1-20 下午5:45:54 
	* @throws UnsupportedEncodingException  
	*/ 
	@Test
	public void testSaveAllProductInfo() throws UnsupportedEncodingException{
		productsClassifyService.saveAllProductInfo();
	}
}
