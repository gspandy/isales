/**
 * @Company 青鸟软通   
 * @Title: SampleIndustryService.java 
 * @Package  com.haier.isales.sample.sampleindustry.service.impl
 * @author lizhenwei   
 * @date 2015年12月22日  23:34:13
 * @version V1.0   
 */
package com.haier.isales.sample.sampleindustry.service.impl;

import com.haier.isales.sample.dto.SampleIndustryDTO;
import com.haier.isales.sample.sampleindustry.dao.SampleIndustryDAO;
import com.haier.isales.sample.sampleindustry.domain.SampleIndustryDomain;
import com.haier.isales.sample.sampleindustry.service.SampleIndustryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: SampleIndustryService
 * @Description: SampleIndustry的Service接口定义类
 *  
 */
public class SampleIndustryServiceImpl implements SampleIndustryService{

	private static final Logger LOG = LoggerFactory.getLogger(SampleIndustryServiceImpl.class);
	
	/** 
	* @Fields sampleIndustryDao : SampleIndustryDao 工具依赖 
	*/
	private SampleIndustryDAO sampleIndustryDao;
	
	/*===============业务方法=============*/

	/* 根据I营销产业编码查询样机系统产业编码及产业名称
	 * @see com.haier.isales.sample.sampleindustry.service.SampleIndustryService#getIndustryList(com.haier.isales.sample.sampleindustry.domain.SampleIndustryDomain)
	 */
	@Override
	public SampleIndustryDomain getIndustryList(
			SampleIndustryDTO dto) {

		SampleIndustryDomain industry = sampleIndustryDao.searchIndustryByProductId(dto);
		
		return industry;
	}
	
	
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性sampleIndustryDao 的set方法 
	 */
	public void setSampleIndustryDao(SampleIndustryDAO sampleIndustryDao){
		this.sampleIndustryDao = sampleIndustryDao;
	}

	
}
