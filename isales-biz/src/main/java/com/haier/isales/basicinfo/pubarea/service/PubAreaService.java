/**
 * @Company 青鸟软通   
 * @Title: ProvinceService.java 
 * @Package  com.haier.isales.basicinfo.province.service
 * @author lizhenwei   
 * @date 2015年12月08日  17:34:24
 * @version V1.0   
 */
package com.haier.isales.basicinfo.pubarea.service;

import java.util.List;

import com.haier.isales.basicinfo.pubarea.domain.AreaDomain;
import com.haier.isales.basicinfo.pubarea.domain.CityDomain;
import com.haier.isales.basicinfo.pubarea.domain.ProvinceDomain;
import com.haier.isales.basicinfo.pubarea.domain.PubAreaDomain;
import com.haier.isales.basicinfo.pubarea.dto.PubAreaDTO;


/** 
 * @ClassName: ProvinceService
 * @Description: Province的Service接口定义类
 *  
 */
public interface PubAreaService {

	// 查询省列表信息
	public List<ProvinceDomain> getProvinceList(ProvinceDomain domain);
	
	// 根据省的行政区划编码查询城市信息列表
	public List<CityDomain> getCityByPaPCode(CityDomain domain);
	
	// 根据市的行政区划编码查询区列表
	
	public List<AreaDomain> getAreaByPaPCode(AreaDomain domain);
	// 根据门店编码查询门店所在省市区信息列表
	public PubAreaDTO getPubAreaByShopCode(String shopCode);
}
