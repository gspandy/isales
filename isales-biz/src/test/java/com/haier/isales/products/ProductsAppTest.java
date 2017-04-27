/**
* @Company 青鸟软通   
* @Title: ProductsAppTest.java 
* @Package com.haier.isales.products 
* @author John.zhao   
* @date 2015-1-30 上午9:54:03 
* @version V1.0   
*/ 
package com.haier.isales.products;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.haier.isales.products.productsinfoapp.domain.ProductLineDomain;

/** 
 * @ClassName: ProductsAppTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsAppTest extends ProductsTestCase {

	@Test
	public void searchProductLineList(){
		List<ProductLineDomain> searchProductLineList = productsInfoAppService.searchProductLineList("Z0189116");
		Assert.assertNotNull(searchProductLineList);
	}
	
}
