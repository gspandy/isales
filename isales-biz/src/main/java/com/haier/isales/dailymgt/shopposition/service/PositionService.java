/**
* @Company 青鸟软通   
* @Title: PositionService.java 
* @Package com.haier.isales.dailymgt.shopposition.service 
* @author John.zhao   
* @date 2015-3-2 下午2:09:27 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.shopposition.service;

import com.haier.isales.dailymgt.dto.ShopPositionDTO;
import com.haier.isales.dailymgt.dto.ShopPositionParamDTO;
import com.haier.isales.dailymgt.shoperrorposition.domain.ShopErrorPositionDomain;

/** 
 * @ClassName: PositionService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public interface PositionService {
	
	public ShopPositionDTO searchIfInShop(ShopPositionParamDTO shopPositionParamDTO);
	
	public void saveResult(ShopErrorPositionDomain shopErrorPositionDomain);
}
