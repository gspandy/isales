/**
* @Company 青鸟软通   
* @Title: UpdateRetailServiceImpl.java 
* @Package com.haier.isales.retail.updateretail.service.impl 
* @author John.zhao   
* @date 2015-3-13 上午9:35:09 
* @version V1.0   
*/ 
package com.haier.isales.retail.updateretail.service.impl;

//import java.util.List;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.basicinfo.pubarea.domain.AreaDomain;
import com.haier.isales.basicinfo.pubarea.domain.CityDomain;
import com.haier.isales.basicinfo.pubarea.domain.ProvinceDomain;
import com.haier.isales.basicinfo.pubarea.service.PubAreaService;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
//import com.haier.isales.retail.updateretail.dao.TryoutUsersDAO;
//import com.haier.isales.retail.updateretail.domain.TryoutUsersDomain;
import com.haier.isales.retail.updateretail.service.UpdateRetailService;
import com.haier.isales.retail.updatesales.dto.CheckUserInTableDTO;
import com.haier.isales.retail.updatesales.dto.UpdateBarCodeParamDTO;
import com.haier.isales.retail.updatesales.dto.UpdateModelParamDTO;
import com.haier.isales.ws.zzjyt.client.btbappxlgxupdateimpl.BTBAPPxlgxUpdateImpl;
import com.haier.isales.ws.zzjyt.client.btbappxlgxupdateimpl.BtbapPxlgxInfo;
import com.haier.isales.ws.zzjyt.client.tmappupdateimpl.TmAPPUpdateImpl;
import com.haier.isales.ws.zzjyt.client.tmappupdateimpl.TmAPPUpdateInfo;

/** 
 * @ClassName: UpdateRetailServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class UpdateRetailServiceImpl implements UpdateRetailService{

	private static final Logger LOG = LoggerFactory.getLogger(UpdateRetailServiceImpl.class);
	
	private BTBAPPxlgxUpdateImpl btbAPPxlgxUpdateImpl;
	
	private TmAPPUpdateImpl tmAPPUpdateImpl;
	
	// 根据省市区编码查询省市区名称
	private PubAreaService pubAreaService;
	
//	private TryoutUsersDAO tryoutUsersDao;
	
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-3-13 上午9:38:07 
	* @return 
	* @see com.haier.isales.retail.updateretail.service.UpdateRetailService#updateModelRetail() 
	*/ 
	@Override
	public BtbapPxlgxInfo updateModelRetail(UpdateModelParamDTO updateModelParamDTO) {
		
		LOG.info("调用按型号更新销量开始,传入的参数为：" + updateModelParamDTO);
		
		BtbapPxlgxInfo result = new BtbapPxlgxInfo();
		//2015-8-18 曹瑞：当用户选择套餐为否时，需要清除页面上已选择的套餐发起人
		if ("0".equals(updateModelParamDTO.getIstc())) {
			updateModelParamDTO.setTcfqr("");
		}
		
		// 前端传入省市区Code,需要将省市区编码转化为名称
		// APP端默认为“省”,排除此条件
		if (updateModelParamDTO.getProvinceCode() != null &&
				!updateModelParamDTO.getProvinceCode().equals("")) {
			
			ProvinceDomain provinceEntity = new ProvinceDomain();
			provinceEntity.setPaCode(updateModelParamDTO.getProvinceCode());
			
			List<ProvinceDomain> provinceList = pubAreaService.getProvinceList(provinceEntity);
			
			if (provinceList.size() > 0) {
				ProvinceDomain provinceDomain = provinceList.get(0);
				updateModelParamDTO.setProvince(provinceDomain.getPaName());
			}
			
		}
		
		if (updateModelParamDTO.getCityCode() != null && 
				!updateModelParamDTO.getCityCode().equals("")) {
			
			CityDomain cityEntity = new CityDomain();
			cityEntity.setPaCode(updateModelParamDTO.getCityCode());
			
			List<CityDomain> cityList = pubAreaService.getCityByPaPCode(cityEntity);
			// 添加查询结果判断
			if (cityList.size() > 0) {
				CityDomain cityDomain = cityList.get(0);
				// 判断查询出来的省编码（上级行政区划代码）是否与传入的省编码一致 added by lizhenwei 2016-01-08
				if (!cityDomain.getPaPCode().equals(updateModelParamDTO.getProvinceCode())) {
					throw new BusinessException(BusinessExceptionCode.param_error, "该城市不在选择的省份下！");
				}
				updateModelParamDTO.setCity(cityDomain.getPaName());
			}
			
		}
		
		if (updateModelParamDTO.getAreaCode() != null &&
				!updateModelParamDTO.getAreaCode().equals("")) {
			
			AreaDomain areaEntity = new AreaDomain();
			areaEntity.setPaCode(updateModelParamDTO.getAreaCode());
			
			List<AreaDomain> areaList = pubAreaService.getAreaByPaPCode(areaEntity);
			// 添加查询结果判断
			if (areaList.size() > 0) {
				AreaDomain areaDomain = areaList.get(0);
				// 判断查询出来的市编码（上级行政区划代码）是否与传入的市编码一致 added by lizhenwei 2016-01-08
				if (!areaDomain.getPaPCode().equals(updateModelParamDTO.getCityCode())) {
					throw new BusinessException(BusinessExceptionCode.param_error, "该区不在选择的城市下！");
				}
				updateModelParamDTO.setArea(areaDomain.getPaName());
			}
			
		}

		try{
			
		result =  btbAPPxlgxUpdateImpl.lwUpdate(updateModelParamDTO.getSjcjlsid(), 
				updateModelParamDTO.getYgid(), 
				updateModelParamDTO.getGjtime(), 
				updateModelParamDTO.getFpnum(), 
				updateModelParamDTO.getProduct(), 
				updateModelParamDTO.getPrice(), 
				updateModelParamDTO.getNewprice(),
				updateModelParamDTO.getCounts(), 
				updateModelParamDTO.getIsyj(), 
				updateModelParamDTO.getQykid(), 
				updateModelParamDTO.getYhname(), 
				updateModelParamDTO.getYhphone(), 
				updateModelParamDTO.getShaddress(),
				updateModelParamDTO.getTcfqr(),
				updateModelParamDTO.getIstc(),
				updateModelParamDTO.getProvince(),
				updateModelParamDTO.getCity(),
				updateModelParamDTO.getArea());
		
		}catch (Exception e) {
			LOG.info("ex", e);
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"连接超时，请稍候重试!");
		}
		return result;
	}

	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-3-13 上午9:38:07 
	* @return 
	* @see com.haier.isales.retail.updateretail.service.UpdateRetailService#updateBarCodeRetail() 
	*/ 
	@Override
	public TmAPPUpdateInfo updateBarCodeRetail(UpdateBarCodeParamDTO updateBarCodeParamDTO) {
		

		LOG.info("调用按条码更新销量开始,传入的参数为：" + updateBarCodeParamDTO);
		
		TmAPPUpdateInfo result = new TmAPPUpdateInfo();
		//2015-8-18 曹瑞：当用户选择套餐为否时，需要清除页面上已选择的套餐发起人
		if ("0".equals(updateBarCodeParamDTO.getIstc())) {
			updateBarCodeParamDTO.setTcfqr("");
		}
		
		// 前端传入省市区Code,需要将省市区编码转化为名称
		// APP端默认为“省”,排除此条件
		if (updateBarCodeParamDTO.getProvinceCode() != null &&
				!updateBarCodeParamDTO.getProvinceCode().equals("")) {
			
			ProvinceDomain provinceEntity = new ProvinceDomain();
			provinceEntity.setPaCode(updateBarCodeParamDTO.getProvinceCode());
			
			List<ProvinceDomain> provinceList = pubAreaService.getProvinceList(provinceEntity);
			if (provinceList.size() > 0) {
				ProvinceDomain provinceDomain = provinceList.get(0);
				updateBarCodeParamDTO.setProvince(provinceDomain.getPaName());
			}
			
		}
		
		if (updateBarCodeParamDTO.getCityCode() != null && 
				!updateBarCodeParamDTO.getCityCode().equals("")) {
			
			CityDomain cityEntity = new CityDomain();
			cityEntity.setPaCode(updateBarCodeParamDTO.getCityCode());
			
			List<CityDomain> cityList = pubAreaService.getCityByPaPCode(cityEntity);
			if (cityList.size() > 0) {
				CityDomain cityDomain = cityList.get(0);
				updateBarCodeParamDTO.setCity(cityDomain.getPaName());
			}
			
		}
		
		if (updateBarCodeParamDTO.getAreaCode() != null &&
				!updateBarCodeParamDTO.getAreaCode().equals("")) {
			
			AreaDomain areaEntity = new AreaDomain();
			areaEntity.setPaCode(updateBarCodeParamDTO.getAreaCode());
			
			List<AreaDomain> areaList = pubAreaService.getAreaByPaPCode(areaEntity);
			// 添加查询结果判断
			if (areaList.size() > 0) {
				AreaDomain areaDomain = areaList.get(0);
				updateBarCodeParamDTO.setArea(areaDomain.getPaName());
			}
			
		}
				
		try{
		result = tmAPPUpdateImpl.tmUpdate(updateBarCodeParamDTO.getSjcjid(),
				updateBarCodeParamDTO.getYgid(), 
				updateBarCodeParamDTO.getGjtime(), 
				updateBarCodeParamDTO.getPrice(), 
				updateBarCodeParamDTO.getNewprice(), 
				updateBarCodeParamDTO.getIsyj(), 
				updateBarCodeParamDTO.getQykid(), 
				updateBarCodeParamDTO.getYhname(), 
				updateBarCodeParamDTO.getYhphone(), 
				updateBarCodeParamDTO.getShaddress(),
				updateBarCodeParamDTO.getTcfqr(),
				updateBarCodeParamDTO.getIstc(),
				updateBarCodeParamDTO.getProvince(),
				updateBarCodeParamDTO.getCity(),
				updateBarCodeParamDTO.getArea());
		
		}catch (Exception e) {
			LOG.info("ex", e);
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"连接超时，请稍候重试!");
		}
		return result;
	}
	
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-3-17 下午2:13:05 
	* @param checkUserInTableDTO
	* @return 
	* @see com.haier.isales.retail.updateretail.service.UpdateRetailService#searchIfInTable(com.haier.isales.retail.updatesales.dto.CheckUserInTableDTO) 
	*/ 
	@Override
	public CheckUserInTableDTO searchIfInTable(CheckUserInTableDTO checkUserInTableDTO) {
//		List<TryoutUsersDomain> list = tryoutUsersDao.searchIfPersonInTable(checkUserInTableDTO);
//		if(list.size()==0){
//			checkUserInTableDTO.setResult(false);
//		}else{
//			checkUserInTableDTO.setResult(true);
//		}
		//2015-7-1 此功能不再需要试用，修改代码的验证，开放给全部用户
		checkUserInTableDTO.setResult(true);
		return checkUserInTableDTO;
	}
	
	
	//======================================================================
	/**
	 * @Description: 属性 btbAPPxlgxUpdateImpl 的set方法 
	 * @param btbAPPxlgxUpdateImpl 
	 */
	public void setBtbAPPxlgxUpdateImpl(BTBAPPxlgxUpdateImpl btbAPPxlgxUpdateImpl) {
		this.btbAPPxlgxUpdateImpl = btbAPPxlgxUpdateImpl;
	}

	/**
	 * @Description: 属性 tmAPPUpdateImpl 的set方法 
	 * @param tmAPPUpdateImpl 
	 */
	public void setTmAPPUpdateImpl(TmAPPUpdateImpl tmAPPUpdateImpl) {
		this.tmAPPUpdateImpl = tmAPPUpdateImpl;
	}

	/**
	 * @param pubAreaService the pubAreaService to set
	 */
	public void setPubAreaService(PubAreaService pubAreaService) {
		this.pubAreaService = pubAreaService;
	}

	/**
	 * @Description: 属性 tryoutUsersDao 的set方法 
	 * @param tryoutUsersDao 
	 */
//	public void setTryoutUsersDao(TryoutUsersDAO tryoutUsersDao) {
//		this.tryoutUsersDao = tryoutUsersDao;
//	}
}
