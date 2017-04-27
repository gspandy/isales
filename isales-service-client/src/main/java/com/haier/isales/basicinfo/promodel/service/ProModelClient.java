/**
* @Company 青鸟软通   
* @Title: ProModelClient.java 
* @Package com.haier.isales.basicInfo 
* @author Guo Yuchao   
* @date 2014-11-15 下午1:37:19 
* @version V1.0   
*/ 
package com.haier.isales.basicinfo.promodel.service;

import io.terminus.pampas.client.Export;

/** 
 * @ClassName: ProModelClient 
 * @Description: 产品型号对外提供的接口 
 *  
 */
public interface ProModelClient {

	/** 
	* @Description: 根据条码返回产品型号信息
	* @author Guo Yuchao   
	* @date 2014-11-15 下午2:26:51 
	* @param barCode
	* @return  
	*/ 
	@Export(paramNames = {"barCode"})
	Object findProModelInfoByBarCode(String barCode);
	/** 
	* @Description: 根据型号名称模糊查询型号信息列表
	* @author Guo Yuchao   
	* @date 2014-11-17 下午4:47:51 
	* @param prdn
	* @return  
	*/ 
	@Export(paramNames = {"prdn"})
	Object findProModelLikePrdn(String prdn);
	/** 
	* @Description: 根据型号名称模糊查询型号信息列表  分页查询
	* @author Guo Yuchao   
	* @date 2014-11-19 下午8:24:54 
	* @param prdn
	* @param currentPage
	* @param pageSize
	* @return  
	*/ 
	@Export(paramNames = {"prdn","currentPage","pageSize"})
	Object findModelPagerLikePrdn(String prdn,Integer currentPage,Integer pageSize);
}
