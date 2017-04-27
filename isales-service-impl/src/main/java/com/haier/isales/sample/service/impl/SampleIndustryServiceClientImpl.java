/**
* @Company 青鸟软通   
* @Title: SampleIndustryServiceClientImpl.java
* @Package com.haier.isales.sample.service.impl
* @author lizhenwei
* @date 2015-12-23上午6:50:13
* @version V1.0   
*/ 
package com.haier.isales.sample.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.sample.dto.SampleIndustryDTO;
import com.haier.isales.sample.sampleindustry.domain.SampleIndustryDomain;
import com.haier.isales.sample.sampleindustry.service.SampleIndustryService;
import com.haier.isales.sample.service.SampleIndustryServiceClient;

/** 
 * @ClassName: SampleIndustryServiceClientImpl
 * @Description: 
 *  
 */
public class SampleIndustryServiceClientImpl implements
		SampleIndustryServiceClient {
	

	private static Logger logger = LoggerFactory.getLogger(SampleIndustryServiceClientImpl.class);
	
	private SampleIndustryService sampleIndustryService;

	/** 
	* @Description:根据I营销产业编码查询样机系统产业编码及产业名称
	* @author lizhenwei
	* @date 2015-12-23 上午6:50:38 
	* @param sampleIndustryDTO
	* @return  
	 * @see com.haier.isales.sample.service.SampleIndustryServiceClient#findIndustryByProduct(java.lang.String)
	 */
	@Override
	public Object findIndustryByProduct(String productId) {

		logger.info("获取样机系统下产业的方法, productId" + productId);
		
		SampleIndustryDTO dto = new SampleIndustryDTO();
		dto.setProductId(productId);
		
		SampleIndustryDomain domain = sampleIndustryService.getIndustryList(dto);
		
		SampleIndustryDTO industry = ClonePojoUtil.copyClassFromTo(domain, SampleIndustryDTO.class);
		
		return industry;
	}

	/**
	 * @param sampleIndustryService the sampleIndustryService to set
	 */
	public void setSampleIndustryService(SampleIndustryService sampleIndustryService) {
		this.sampleIndustryService = sampleIndustryService;
	}

}
