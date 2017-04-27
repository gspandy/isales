/**
 * @Company 青鸟软通   
 * @Title: SampleDAO.java 
 * @Package  com.haier.isales.sample.dao
 * @author lizhenwei   
 * @date 2015年11月11日  09:40:13
 * @version V1.0   
 */
package com.haier.isales.sample.sampleindustry.dao;

import java.util.List;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.sample.dto.SampleIndustryDTO;
import com.haier.isales.sample.sampleindustry.domain.SampleIndustryDomain;
/** 
 * @ClassName: SampleIndustryDAO
 * @Description: SampleIndustry的DAO接口定义类
 *  
 */
public interface SampleIndustryDAO extends CommonDAO<SampleIndustryDomain,Long>{
	
	// 根据I营销中产业编码获取样机系统的产业编码
	SampleIndustryDomain searchIndustryByProductId(SampleIndustryDTO entiry);
}
