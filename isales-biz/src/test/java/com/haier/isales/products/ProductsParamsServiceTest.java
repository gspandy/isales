/**
 * @Company 青鸟软通   
 * @Title: ProductsParamsServiceTest.java 
 * @Package com.haier.isales.products 
 * @author John.zhao   
 * @date 2015-1-21 下午3:07:24 
 * @version V1.0   
 */
package com.haier.isales.products;

import org.junit.Test;

/**
 * @ClassName: ProductsParamsServiceTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public class ProductsParamsServiceTest extends ProductsTestCase {
	@Test
	public void testSaveProductsParams(){
		productsParamsService.saveProductsParams();
	}
	@Test
	public void testgetSingleData() {
		//规格参数
        String fieldGroups1="规格参数";
        //产品特性
        String fieldGroups2="产品特性";
        //用户评论
        String fieldGroups3="用户评论";
        //说明书
        String fieldGroups4="说明书";
        //常见问题
        String fieldGroups5="常见问题";
		productsParamsService.getSingleData("hcn_yun_kong_tiao_1201", fieldGroups5);
	}
}
