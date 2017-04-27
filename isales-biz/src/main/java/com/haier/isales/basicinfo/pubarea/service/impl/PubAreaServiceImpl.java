/**
 * @Company 青鸟软通   
 * @Title: ProvinceService.java 
 * @Package  com.haier.isales.basicinfo.province.service.impl
 * @author lizhenwei   
 * @date 2015年12月08日  17:34:24
 * @version V1.0   
 */
package com.haier.isales.basicinfo.pubarea.service.impl;


import java.util.List;

import javax.annotation.Resource;

import com.haier.isales.basicinfo.pubarea.dao.AreaDAO;
import com.haier.isales.basicinfo.pubarea.dao.CityDAO;
import com.haier.isales.basicinfo.pubarea.dao.ProvinceDAO;
import com.haier.isales.basicinfo.pubarea.dao.PubAreaDAO;
import com.haier.isales.basicinfo.pubarea.domain.AreaDomain;
import com.haier.isales.basicinfo.pubarea.domain.CityDomain;
import com.haier.isales.basicinfo.pubarea.domain.ProvinceDomain;
import com.haier.isales.basicinfo.pubarea.domain.PubAreaDomain;
import com.haier.isales.basicinfo.pubarea.dto.PubAreaDTO;
import com.haier.isales.basicinfo.pubarea.service.PubAreaService;
import com.haier.isales.basicinfo.shop.dao.ShopDAO;
import com.haier.isales.basicinfo.shop.domain.ShopDomain;
import com.haier.isales.basicinfo.shop.service.ShopService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: ProvinceService
 * @Description: Province的Service接口定义类
 *  
 */
public class PubAreaServiceImpl implements PubAreaService{

	private static final Logger LOG = LoggerFactory.getLogger(PubAreaServiceImpl.class);
	
	/** 
	* @Fields provinceDao : ProvinceDao 工具依赖 
	*/
	private ProvinceDAO provinceDao;
	
	private CityDAO cityDao;
	
	private AreaDAO areaDao;
	
	private PubAreaDAO pubAreaDao;
	
	//private ShopService shopService;
	//@Resource
	private ShopDAO shopDao;
	
	/*===============业务方法=============*/
	/*
	**
	* @Title: 查询省信息列表
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param pageCond
	* @return  
	* @throws
	 */
	@Override
	public List<ProvinceDomain> getProvinceList(ProvinceDomain entity) {
		
		LOG.info("查询省信息列表   service方法");
		
		/*ProvinceDomain domain = new ProvinceDomain();
		domain.setPaCode(paCode);
		*/
		//获取查询结果列表
		List<ProvinceDomain> provinceList = provinceDao.findProvinceInfo(entity);
		
		LOG.info("查询省信息列表   service方法执行完成");
		
		return provinceList;
		
	}
	
	/*
	**
	* @Title: 根据省的行政区划编码查询城市信息列表
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param domain
	* @return  
	* @throws
	 */
	@Override
	public List<CityDomain> getCityByPaPCode(CityDomain entity) {
		
		LOG.info("根据省的行政区划编码查询城市信息列表   service方法");
		
		/*CityDomain entity = new CityDomain();
		entity.setPaPCode(domain.getPaCode());
		entity.setPaCode(domain.getPaCode());
		entity.setPaName(domain.getPaName());*/
		//获取查询结果列表
		List<CityDomain> cityList = cityDao.findCityInfoByPaPCode(entity);
		
		LOG.info("根据省的行政区划编码查询城市信息列表  service方法执行完成");
		
		return cityList;
		
	}
	
	/*
	**
	* @Title: 根据市的行政区划编码查询区列表
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param paPCode
	* @return  
	* @throws
	 */
	@Override
	public List<AreaDomain> getAreaByPaPCode(AreaDomain domain) {
		
		LOG.info("根据市的行政区划编码查询区的信息列表   service方法");
		
		/*AreaDomain entity = new AreaDomain();
		domain.setPaPCode(paPCode);*/
		//获取查询结果列表
		List<AreaDomain> areaList = areaDao.findAreaByPaPCode(domain);
		
		LOG.info("根据市的行政区划编码查询区的信息列表   service方法执行完成");
		
		return areaList;
		
	}
	
	/*
	**
	* @Title: 根据门店编码查询门店所在省市区信息列表
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param shopCode
	* @return  
	* @throws
	 */
	@Override
	public PubAreaDTO getPubAreaByShopCode(String shopCode) {
		
		LOG.info("根据省的行政区划编码查询城市信息列表   service方法");
		PubAreaDTO dto = new PubAreaDTO();
		
		//ShopDomain shopDomain = shopService.findById(shopCode);
		//ShopDomain shopDomain = shopDao.findById(shopCode);
		String paCode = shopDao.findPaCodeByShopCode(shopCode);
		
		/*if (shopDomain == null) {
			return null;
		}
		if (shopDomain.getPaCode().equals("null") || shopDomain.getPaCode() == null) {
			return null;
		}*/
		
		PubAreaDomain entity = new PubAreaDomain();
		entity.setPaCode(paCode);
		//获取查询结果列表
		List<PubAreaDomain> pubAreaList = pubAreaDao.findPubAreaByShopCode(entity);
		
		if (pubAreaList.size() == 0) {
			LOG.info("shopCode: " + shopCode + ",domain == null");
			return null;
		}
		
		PubAreaDomain pubAreaDomain = pubAreaList.get(0);
		
		if (pubAreaDomain.equals("1")) {
			// 门店关联省
			ProvinceDomain provinceEntity = new ProvinceDomain();
			provinceEntity.setPaCode(pubAreaList.get(0).getPaCode());
			
			List<ProvinceDomain> provinceList = provinceDao.findProvinceInfo(provinceEntity);
			
			ProvinceDomain provinceDomain = provinceList.get(0);
			
			dto.setProvinceCode(provinceDomain.getPaCode());
			dto.setProvinceName(provinceDomain.getPaName());
			
		} else if (pubAreaDomain.getPaLevel().equals("2")) {
			// 门店关联市
			CityDomain cityEntity = new CityDomain();
			cityEntity.setPaCode(pubAreaDomain.getPaCode());
			
			List<CityDomain> cityList = cityDao.findCityInfoByPaPCode(cityEntity);
			CityDomain cityDomain = cityList.get(0);
			
			dto.setCityCode(cityDomain.getPaCode());
			dto.setCityName(cityDomain.getPaName());
			
			// 查询所在省
			ProvinceDomain provinceEntity = new ProvinceDomain();
			provinceEntity.setPaCode(cityDomain.getPaPCode());
			
			List<ProvinceDomain> provinceList = provinceDao.findProvinceInfo(provinceEntity);
			
			ProvinceDomain provinceDomain = provinceList.get(0);
			
			dto.setProvinceCode(provinceDomain.getPaCode());
			dto.setProvinceName(provinceDomain.getPaName());
			
		} else if (pubAreaDomain.getPaLevel().equals("3")) {
			// 门店关联区
			AreaDomain areaEntity = new AreaDomain();
			areaEntity.setPaCode(pubAreaDomain.getPaCode());
			
			List<AreaDomain> areaList = areaDao.findAreaByPaPCode(areaEntity);
			AreaDomain areaDomain = areaList.get(0);
			dto.setAreaCode(areaDomain.getPaCode());
			dto.setAreaName(areaDomain.getPaName());
			
			// 查询所在市
			CityDomain cityEntity = new CityDomain();
			cityEntity.setPaCode(areaDomain.getPaPCode());
			
			List<CityDomain> cityList = cityDao.findCityInfoByPaPCode(cityEntity);
			CityDomain cityDomain = cityList.get(0);
			
			dto.setCityCode(cityDomain.getPaCode());
			dto.setCityName(cityDomain.getPaName());
			
			// 查询所在省
			ProvinceDomain provinceEntity = new ProvinceDomain();
			provinceEntity.setPaCode(cityDomain.getPaPCode());
			
			List<ProvinceDomain> provinceList = provinceDao.findProvinceInfo(provinceEntity);
			
			ProvinceDomain provinceDomain = provinceList.get(0);
			
			dto.setProvinceCode(provinceDomain.getPaCode());
			dto.setProvinceName(provinceDomain.getPaName());
			
		} else if (pubAreaDomain.getPaLevel().equals("4")) {
			// 门店关联乡镇
			AreaDomain areaEntity = new AreaDomain();
			areaEntity.setPaCode(pubAreaDomain.getPaPCode());
			
			List<AreaDomain> areaList = areaDao.findAreaByPaPCode(areaEntity);
			AreaDomain areaDomain = areaList.get(0);
			dto.setAreaCode(areaDomain.getPaCode());
			dto.setAreaName(areaDomain.getPaName());
			
			// 查询所在市
			CityDomain cityEntity = new CityDomain();
			cityEntity.setPaCode(areaDomain.getPaPCode());
			
			List<CityDomain> cityList = cityDao.findCityInfoByPaPCode(cityEntity);
			CityDomain cityDomain = cityList.get(0);
			
			dto.setCityCode(cityDomain.getPaCode());
			dto.setCityName(cityDomain.getPaName());
			
			// 查询所在省
			ProvinceDomain provinceEntity = new ProvinceDomain();
			provinceEntity.setPaCode(cityDomain.getPaPCode());
			
			List<ProvinceDomain> provinceList = provinceDao.findProvinceInfo(provinceEntity);
			
			ProvinceDomain provinceDomain = provinceList.get(0);
			
			dto.setProvinceCode(provinceDomain.getPaCode());
			dto.setProvinceName(provinceDomain.getPaName());
			
		} else if (pubAreaDomain.getPaLevel().equals("5")) {
			// 门店关联村
			PubAreaDomain pubAreaEntity = new PubAreaDomain();
			pubAreaEntity.setPaCode(pubAreaDomain.getPaPCode()); // 乡镇
			List<PubAreaDomain> subPubAreaList = pubAreaDao.findPubAreaByShopCode(pubAreaEntity);
			
			PubAreaDomain subPubAreaDomain = subPubAreaList.get(0);
			
			AreaDomain areaEntity = new AreaDomain();
			areaEntity.setPaCode(subPubAreaDomain.getPaPCode());
			
			List<AreaDomain> areaList = areaDao.findAreaByPaPCode(areaEntity);
			AreaDomain areaDomain = areaList.get(0);
			dto.setAreaCode(areaDomain.getPaCode());
			dto.setAreaName(areaDomain.getPaName());
			
			// 查询所在市
			CityDomain cityEntity = new CityDomain();
			cityEntity.setPaCode(areaDomain.getPaPCode());
			
			List<CityDomain> cityList = cityDao.findCityInfoByPaPCode(cityEntity);
			CityDomain cityDomain = cityList.get(0);
			
			dto.setCityCode(cityDomain.getPaCode());
			dto.setCityName(cityDomain.getPaName());
			
			// 查询所在省
			ProvinceDomain provinceEntity = new ProvinceDomain();
			provinceEntity.setPaCode(cityDomain.getPaPCode());
			
			List<ProvinceDomain> provinceList = provinceDao.findProvinceInfo(provinceEntity);
			
			ProvinceDomain provinceDomain = provinceList.get(0);
			
			dto.setProvinceCode(provinceDomain.getPaCode());
			dto.setProvinceName(provinceDomain.getPaName());
		}
		
		LOG.info("根据省的行政区划编码查询城市信息列表  service方法执行完成");
		
		return dto;
		
	}
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性provinceDao 的set方法 
	 */
	public void setProvinceDao(ProvinceDAO provinceDao){
		this.provinceDao = provinceDao;
	}

	/**
	 * @param cityDao the cityDao to set
	 */
	public void setCityDao(CityDAO cityDao) {
		this.cityDao = cityDao;
	}

	/**
	 * @param areaDao the areaDao to set
	 */
	public void setAreaDao(AreaDAO areaDao) {
		this.areaDao = areaDao;
	}

	/**
	 * @param pubAreaDao the pubAreaDao to set
	 */
	public void setPubAreaDao(PubAreaDAO pubAreaDao) {
		this.pubAreaDao = pubAreaDao;
	}

	/**
	 * @param shopService the shopService to set
	 */
	/*public void setShopService(ShopService shopService) {
		this.shopService = shopService;
	}
*/
	/**
	 * @param shopDao the shopDao to set
	 */
	public void setShopDao(ShopDAO shopDao) {
		this.shopDao = shopDao;
	}
	
}
