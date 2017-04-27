/**
* @Company 青鸟软通   
* @Title: ProvinceClient.java 
* @Package com.haier.isales.basicInfo 
* @author lizhenwei   
* @date 2015-12-08 18:58:19 
* @version V1.0   
*/ 
package com.haier.isales.basicinfo.pubarea.service;

import io.terminus.pampas.client.Export;

/** 
 * @ClassName: ProvinceClient 
 * @Description: 省市区对外提供的接口 
 *  
 */
public interface PubAreaClient {

	/** 
	* @Description: 根据门店编码获取门店所在省市区
	* @author lizhenwei 
	* @date 2015-12-09 下午5:23:51 
	* @param shopCode
	* @return  
	*/ 
	@Export(paramNames = {"shopCode"})
	Object findPubAreaByShopCode(String shopCode);
	
	/** 
	* @Description: 获取省信息
	* @author lizhenwei
	* @date 2015-12-08 下午7:02:51 
	* @param paPCode
	* @return  
	*/
	@Export(paramNames = {"paCode"})
	Object findProvinceInfo(String paCode);
	/** 
	* @Description: 根据省的行政区划编码查询市信息列表
	* @author lizhenwei 
	* @date 2015-12-08 下午7:03:51 
	* @param paPCode
	* @return  
	*/ 
	@Export(paramNames = {"paPCode"})
	Object findCityByPaPCode(String paPCode);
	/** 
	* @Description: 根据市的行政区划编码查询区信息列表
	* @author lizhenwei
	* @date 2015-12-04 下午7:04:54 
	* @param paPCode
	* @return  
	*/ 
	@Export(paramNames = {"paPCode"})
	Object findAreaByPaPCode(String paPCode);
}
