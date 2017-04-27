/**
* @Company 青鸟软通   
* @Title: ProModelClientImpl.java 
* @Package com.haier.isales.basicInfo.proModel.service.impl 
* @author Guo Yuchao   
* @date 2014-11-15 下午2:26:33 
* @version V1.0   
*/ 
package com.haier.isales.basicinfo.pubarea.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.basicinfo.pubarea.domain.AreaDomain;
import com.haier.isales.basicinfo.pubarea.domain.CityDomain;
import com.haier.isales.basicinfo.pubarea.domain.ProvinceDomain;
import com.haier.isales.basicinfo.pubarea.dto.AreaDTO;
import com.haier.isales.basicinfo.pubarea.dto.CityDTO;
import com.haier.isales.basicinfo.pubarea.dto.ProvinceDTO;
import com.haier.isales.basicinfo.pubarea.dto.PubAreaDTO;
import com.haier.isales.basicinfo.pubarea.service.PubAreaClient;
import com.haier.isales.basicinfo.pubarea.service.PubAreaService;
import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.retail.personalmodel.dto.PersonalModelDto;

/** 
 * @ClassName: PubAreaClientImpl 
 * @Description: 省市区对外提供的接口  
 *  
 */
public class PubAreaClientImpl implements PubAreaClient {
	
	private PubAreaService pubAreaService;
	
	/**
	* <p>Description: 查询省信息列表</p> 
	* @author lizhenwei 
	* @date 2015-12-08 下午10:21:19 
	* @return 
	* @see com.haier.isales.basicInfo.pubarea.service.PubAreaClient#findProvinceInfo() 
	*/
	@Override
	public Object findProvinceInfo(String paCode) {

		List<ProvinceDTO> dtoList = new ArrayList<ProvinceDTO>();
		ProvinceDomain domain = new ProvinceDomain();
		domain.setPaCode(paCode);
		
		List<ProvinceDomain> provinceList = pubAreaService.getProvinceList(domain);
		
		if(provinceList == null || provinceList.isEmpty()){
			return null;
		}
		for (ProvinceDomain provinceDomain : provinceList) {
			if(provinceDomain!=null){
				
				ProvinceDTO provinceDTO = 
						ClonePojoUtil.copyClassFromTo(provinceDomain, ProvinceDTO.class);
				
				dtoList.add(provinceDTO);
			}
		}
		return dtoList;
	}
	/**
	* <p>Description: 根据省的行政区划编码查询城市信息列表</p> 
	* @author lizhenwei 
	* @date 2015-12-09 下午09:50:19 
	* @return
	 * @see com.haier.isales.basicinfo.pubarea.service.PubAreaClient#findCityByPaPCode(java.lang.String)
	 */
	@Override
	public Object findCityByPaPCode(String paPCode) {
		List<CityDTO> dtoList = new ArrayList<CityDTO>();
		
		CityDomain domain = new CityDomain();
		domain.setPaPCode(paPCode);
		
		List<CityDomain> cityList = pubAreaService.getCityByPaPCode(domain);
		
		if(cityList == null || cityList.isEmpty()){
			return null;
		}
		for (CityDomain cityDomain : cityList) {
			if(cityDomain!=null){
				
				CityDTO cityDTO = 
						ClonePojoUtil.copyClassFromTo(cityDomain, CityDTO.class);
				
				dtoList.add(cityDTO);
			}
		}
		return dtoList;
	}
	/**
	* <p>Description: 根据市的行政区划编码查询区信息列表</p> 
	* @author lizhenwei 
	* @date 2015-12-09 上午09:51:19 
	* @return
	 * @see com.haier.isales.basicinfo.pubarea.service.PubAreaClient#findAreaByPaPCode(java.lang.String)
	 */
	@Override
	public Object findAreaByPaPCode(String paPCode) {
		List<AreaDTO> dtoList = new ArrayList<AreaDTO>();
		
		AreaDomain domain = new AreaDomain();
		domain.setPaPCode(paPCode);
		
		List<AreaDomain> areaList = pubAreaService.getAreaByPaPCode(domain);
		
		if(areaList == null || areaList.isEmpty()){
			return null;
		}
		for (AreaDomain areaDomain : areaList) {
			if(areaDomain!=null){
				
				AreaDTO cityDTO = 
						ClonePojoUtil.copyClassFromTo(areaDomain, AreaDTO.class);
				
				dtoList.add(cityDTO);
			}
		}
		return dtoList;
	}
	
	/**
	* <p>Description: 根据门店编码获取门店所在省市区</p> 
	* @author lizhenwei 
	* @date 2015-12-09 17:24:19 
	* @return
	 * @see com.haier.isales.basicinfo.pubarea.service.PubAreaClient#findPubAreaByShopCode(java.lang.String)
	 */
	@Override
	public Object findPubAreaByShopCode(String shopCode) {
		//PubAreaDTO pubAreaDTO = new PubAreaDTO();
		
		PubAreaDTO pubAreaDTO = null;
		if (shopCode != null && !shopCode.equals("")) {
			pubAreaDTO = pubAreaService.getPubAreaByShopCode(shopCode);
		}
		
		if (pubAreaDTO == null) {
			return null;
		}
		return pubAreaDTO;
	}

	/**
	 * @return the pubAreaService
	 */
	public PubAreaService getPubAreaService() {
		return pubAreaService;
	}

	/**
	 * @param pubAreaService the pubAreaService to set
	 */
	public void setPubAreaService(PubAreaService pubAreaService) {
		this.pubAreaService = pubAreaService;
	}
	
}
