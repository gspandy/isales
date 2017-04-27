/**
* @Company 青鸟软通   
* @Title: ProModelClientImpl.java 
* @Package com.haier.isales.basicInfo.proModel.service.impl 
* @author Guo Yuchao   
* @date 2014-11-15 下午2:26:33 
* @version V1.0   
*/ 
package com.haier.isales.basicinfo.promodel.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.basicinfo.promodel.BasicInfoModelDtoUtill;
import com.haier.isales.basicinfo.promodel.domain.ProModelDomain;
import com.haier.isales.basicinfo.promodel.dto.ProModelDTO;
import com.haier.isales.basicinfo.promodel.service.ProModelClient;
import com.haier.isales.basicinfo.promodel.service.ProModelService;

/** 
 * @ClassName: ProModelClientImpl 
 * @Description: 产品型号对外提供的接口  
 *  
 */
public class ProModelClientImpl implements ProModelClient {
	private ProModelService proModelService;
	/**
	 * <p>Description:根据条码返回产品型号信息 </p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-15 下午2:26:33 
	 * @param barCode
	 * @return 
	 * @see com.haier.isales.basicInfo.proModel.service.ProModelClient#findProModelInfoByBarCode(java.lang.String) 
	 */
	@Override
	public ProModelDTO findProModelInfoByBarCode(String barCode) {	
		ProModelDomain proModelDomain = proModelService.findProModelInfoByBarCode(barCode);
		ProModelDTO proModelDTO = BasicInfoModelDtoUtill.cloneProModelDomain2Dto(proModelDomain);
		return proModelDTO;
	}
	/**
	* <p>Description: 根据型号名称模糊查询型号信息列表</p> 
	* @author Guo Yuchao   
	* @date 2014-11-17 下午4:48:19 
	* @param prdn
	* @return 
	* @see com.haier.isales.basicInfo.proModel.service.ProModelClient#findProModelLikePrdn(java.lang.String) 
	*/ 
	@Override
	public List<ProModelDTO> findProModelLikePrdn(String prdn) {
		List<ProModelDTO> dtoList = new ArrayList<ProModelDTO>();
		List<ProModelDomain> modelList = proModelService.findProModelLikePrdn(prdn);
		if(modelList == null || modelList.isEmpty()){
			return null;
		}
		for (ProModelDomain proModelDomain : modelList) {
			if(proModelDomain!=null){
				ProModelDTO proModelDTO = BasicInfoModelDtoUtill.cloneProModelDomain2Dto(proModelDomain);
				dtoList.add(proModelDTO);
			}
		}
		return dtoList;
	}
	
	
	
	/**
	 * @Description: 属性 proModelService 的get方法 
	 * @return proModelService
	 */
	public ProModelService getProModelService() {
		return proModelService;
	}
	/**
	 * @Description: 属性 proModelService 的set方法 
	 * @param proModelService 
	 */
	public void setProModelService(ProModelService proModelService) {
		this.proModelService = proModelService;
	}
	/**
	* <p>Description:根据型号名称模糊查询型号信息列表  分页查询</p> 
	* @author Guo Yuchao   
	* @date 2014-11-19 下午8:25:28 
	* @param prdn
	* @param currentPage
	* @param pageSize
	* @return 
	* @see com.haier.isales.basicInfo.proModel.service.ProModelClient#findModelPagerLikePrdn(java.lang.String, java.lang.Integer, java.lang.Integer) 
	*/ 
	@Override
	public PageResult<ProModelDTO> findModelPagerLikePrdn(String prdn, Integer currentPage,
			Integer pageSize) {
		List<ProModelDTO> dtoList = new ArrayList<ProModelDTO>();
		PageResult<ProModelDomain> pageResult = proModelService.findModelPagerLikePrdn(prdn, new PageCond(currentPage,pageSize));
		if(pageResult.getResultList() == null || pageResult.getResultList().isEmpty()){
			return new PageResult<ProModelDTO>(null, pageResult.getPageCond());
		}
		for (ProModelDomain proModelDomain : pageResult.getResultList()) {
			if(proModelDomain!=null){
				ProModelDTO proModelDTO = BasicInfoModelDtoUtill.cloneProModelDomain2Dto(proModelDomain);
				dtoList.add(proModelDTO);
			}
		}
		return new PageResult<ProModelDTO>(dtoList, pageResult.getPageCond());
	}


}
