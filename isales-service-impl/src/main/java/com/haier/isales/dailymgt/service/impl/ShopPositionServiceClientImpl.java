/**
* @Company 青鸟软通   
* @Title: ShopPositionServiceClientImpl.java 
* @Package com.haier.isales.dailymgt.service.impl 
* @author John.zhao   
* @date 2015-3-2 下午3:36:23 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.service.impl;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.dailymgt.dto.ShopPositionDTO;
import com.haier.isales.dailymgt.dto.ShopPositionParamDTO;
import com.haier.isales.dailymgt.service.ShopPositionServiceClient;
import com.haier.isales.dailymgt.shopposition.service.PositionService;

/** 
 * @ClassName: ShopPositionServiceClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ShopPositionServiceClientImpl implements ShopPositionServiceClient {

	private PositionService positionService;
	
	/**
	 * <p>Description: </p> 
	 * @author John.zhao   
	 * @date 2015-3-2 下午3:36:24 
	 * @param shopPositionParamDTO
	 * @return 
	 * @see com.haier.isales.dailymgt.service.ShopPositionServiceClient#getIfInShop(com.haier.isales.dailymgt.dto.ShopPositionParamDTO) 
	 */
	@Override
	public ShopPositionDTO getIfInShop(ShopPositionParamDTO shopPositionParamDTO) {
		if(shopPositionParamDTO == null){
			throw new BusinessException(BusinessExceptionCode.param_error,"输入参数为空！");
		}
		if(shopPositionParamDTO.getShopCode()==null){
			throw new BusinessException(BusinessExceptionCode.param_error,"未维护门店信息！");
		}
		if(shopPositionParamDTO.getShopLatitude()==null){
			throw new BusinessException(BusinessExceptionCode.param_error,"门店所在位置纬度参数为空！");
		}
		if(shopPositionParamDTO.getShopLongitude()==null){
			throw new BusinessException(BusinessExceptionCode.param_error,"门店所在位置经度参数为空！");
		}
		ShopPositionDTO dto = positionService.searchIfInShop(shopPositionParamDTO);
		return dto;
	}

	/**
	 * @Description: 属性 positionService 的set方法 
	 * @param positionService 
	 */
	public void setPositionService(PositionService positionService) {
		this.positionService = positionService;
	}
}
