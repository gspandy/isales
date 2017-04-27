/**
* @Company 青鸟软通   
* @Title: SearchSalesServiceClientImpl.java 
* @Package com.haier.isales.retail.searchsales.service.impl 
* @author John Zhao   
* @date 2014-11-17 上午11:50:26 
* @version V1.0   
*/ 
package com.haier.isales.retail.searchsales.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.haier.isales.basicinfo.pubarea.domain.AreaDomain;
import com.haier.isales.basicinfo.pubarea.domain.CityDomain;
import com.haier.isales.basicinfo.pubarea.domain.ProvinceDomain;
import com.haier.isales.basicinfo.pubarea.service.PubAreaService;
import com.haier.isales.retail.reportsales.service.ReportsalesService;
import com.haier.isales.retail.searchretail.SearchRetailWs2DTOUtil;
import com.haier.isales.retail.searchretail.service.SearchRetailService;
import com.haier.isales.retail.searchsales.dto.SearchModelSalesDTO;
import com.haier.isales.retail.searchsales.dto.SearchRetailBarCodeResultDTO;
import com.haier.isales.retail.searchsales.dto.SearchRetailDTO;
import com.haier.isales.retail.searchsales.dto.SearchRetailMembersDiffDTO;
import com.haier.isales.retail.searchsales.dto.SearchRetailModelResultDTO;
import com.haier.isales.retail.searchsales.service.SearchSalesServiceClient;
import com.haier.isales.ws.zzjyt.client.btbappxlcxselectimpl.BtbapPxlcxInfo;
import com.haier.isales.ws.zzjyt.client.tmappselectimpl.TmAPPSelectInfo;

/** 
 * @ClassName: SearchSalesServiceClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class SearchSalesServiceClientImpl implements SearchSalesServiceClient{
	
	
	private ReportsalesService reportsalesService;
	
	private SearchRetailService searchRetailService;
	
	// 根据省市区名称查询相应编码
	private PubAreaService pubAreaService;
	
	/**
	* <p>Description: </p> 
	* @author John Zhao   
	* @date 2014-11-17 上午11:51:15 
	* @param searchModelSalesDTO
	* @return 
	* @see com.haier.isales.retail.searchsales.service.SearchSalesServiceClient#searchModelSales(com.haier.isales.retail.searchsales.dto.SearchModelSalesDTO) 
	*/ 
	@Override
	public Object searchModelSales(SearchModelSalesDTO searchModelSalesDTO) {
		return reportsalesService.searchModelSales(searchModelSalesDTO);
	}
	
	/**
	* <p>Description: 查询联网数据</p> 
	* @author John.zhao   
	* @date 2015-3-9 上午10:50:59 
	* @param SearchRetailDTO
	* @return 
	* @see com.haier.isales.retail.searchsales.service.SearchSalesServiceClient#searchRetailModelInZZJYT(com.haier.isales.retail.searchsales.dto.SearchRetailDTO) 
	*/ 
	@Override
	public Object searchRetailModelInZZJYT(SearchRetailDTO searchRetailDTO) {
		List<SearchRetailModelResultDTO> modelList = new ArrayList<SearchRetailModelResultDTO>();
		List<BtbapPxlcxInfo> searchRetailModelList = searchRetailService.searchRetailModel(searchRetailDTO);
		if(searchRetailModelList == null){
			return null;
		}else{
			for(BtbapPxlcxInfo info : searchRetailModelList){
				SearchRetailModelResultDTO dto = SearchRetailWs2DTOUtil.cloneBtbapPxlcxInfo2ModelDTO(info);
				modelList.add(dto);
			}
		}
		return modelList;
	}

	/**
	* <p>Description: 查询条码数据</p> 
	* @author John.zhao   
	* @date 2015-3-9 上午10:50:59 
	* @param SearchRetailDTO
	* @return 
	* @see com.haier.isales.retail.searchsales.service.SearchSalesServiceClient#searchRetailBarCodeInZZJYT(com.haier.isales.retail.searchsales.dto.SearchRetailDTO) 
	*/ 
	@Override
	public Object searchRetailBarCodeInZZJYT(SearchRetailDTO searchRetailDTO) {
		List<SearchRetailBarCodeResultDTO> barCodeList = new ArrayList<SearchRetailBarCodeResultDTO>();
		List<TmAPPSelectInfo> searchRetailBarCodelList = searchRetailService.searchRetailBarCode(searchRetailDTO);
		if(searchRetailBarCodelList == null){
			return null;
		}else{
			for(TmAPPSelectInfo tmInfo : searchRetailBarCodelList){
				SearchRetailBarCodeResultDTO dto = SearchRetailWs2DTOUtil.cloneTmAPPSelectInfo2ModelDTO(tmInfo);
				
				// 根据省市区名称查询相应的编码
				ProvinceDomain provinceEntity = new ProvinceDomain();
				provinceEntity.setPaName(dto.getProvince());
				List<ProvinceDomain> provinceList = pubAreaService.getProvinceList(provinceEntity);
				// 判断非空
				if (!provinceList.isEmpty()) {
					ProvinceDomain provinceDomain = provinceList.get(0);
					dto.setProvinceCode(provinceDomain.getPaCode());
				}
				
				CityDomain cityEntity = new CityDomain();
				cityEntity.setPaName(dto.getCity());
				List<CityDomain> cityList = pubAreaService.getCityByPaPCode(cityEntity);
				
				if (!cityList.isEmpty()) {
					CityDomain cityDomain = cityList.get(0);
					dto.setCityCode(cityDomain.getPaCode());
				}
				
				AreaDomain areaEntity = new AreaDomain();
				areaEntity.setPaName(dto.getArea());
				List<AreaDomain> areaList = pubAreaService.getAreaByPaPCode(areaEntity);
				
				if (!areaList.isEmpty()) {
					AreaDomain areaDomain = areaList.get(0);
					dto.setAreaCode(areaDomain.getPaCode());
				}
				
				barCodeList.add(dto);
			}
		}
		return barCodeList;
	}
	
	/**
	* <p>Description: 查询差异会员明细</p> 
	* @author Cao Rui   
	* @date 2015-7-22  下午10:50:59 
	* @param SearchRetailDTO
	* @return 
	* @see com.haier.isales.retail.searchsales.service.SearchSalesServiceClient#searchRetailMembersDiff(com.haier.isales.retail.searchsales.dto.SearchRetailDTO) 
	*/ 
	@Override
	public Object searchRetailMembersDiff(SearchRetailDTO searchRetailDTO) {
		
		List<SearchRetailMembersDiffDTO> list = searchRetailService.searchRetailMembersDiff(searchRetailDTO);

		return list;
	}
	
	//==================================================================================
	/**
	 * @Description: 属性 searchRetailService 的set方法 
	 * @param searchRetailService 
	 */
	public void setSearchRetailService(SearchRetailService searchRetailService) {
		this.searchRetailService = searchRetailService;
	}
	/**
	 * @Description: 属性 reportsalesService 的set方法 
	 * @param reportsalesService 
	 */
	public void setReportsalesService(ReportsalesService reportsalesService) {
		this.reportsalesService = reportsalesService;
	}

	/**
	 * @param pubAreaService the pubAreaService to set
	 */
	public void setPubAreaService(PubAreaService pubAreaService) {
		this.pubAreaService = pubAreaService;
	}

}
