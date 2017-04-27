/**
* @Company 青鸟软通   
* @Title: ShopPositionServiceClient.java 
* @Package com.haier.isales.dailymgt.service 
* @author John.zhao   
* @date 2015-3-2 下午3:33:41 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.service;

import com.haier.isales.dailymgt.dto.ShopPositionParamDTO;

/** 
 * @ClassName: ShopPositionServiceClient 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public interface ShopPositionServiceClient {
	
	public Object getIfInShop(ShopPositionParamDTO shopPositionParamDTO);

}
