/**
 * @Company 青鸟软通   
 * @Title: SampleIndustryService.java 
 * @Package  com.haier.isales.sample.sampleindustry.service
 * @author lizhenwei   
 * @date 2015年12月22日  23:34:13
 * @version V1.0   
 */
package com.haier.isales.sample.sampleindustry.service;

import com.haier.isales.sample.dto.SampleIndustryDTO;
import com.haier.isales.sample.sampleindustry.domain.SampleIndustryDomain;

/** 
 * @ClassName: SampleIndustryService
 * @Description: SampleIndustry的Service接口定义类
 *  
 */
public interface SampleIndustryService {

	// 查询样机系统产业编码及产业名称
	public SampleIndustryDomain getIndustryList(SampleIndustryDTO dto);
}
