/**
 * @Company 青鸟软通   
 * @Title: PersonalInfoService.java 
 * @Package  com.haier.isales.salerInfo.personalInfo.service
 * @author Cao Rui   
 * @date 2014年11月11日  16:16:30
 * @version V1.0   
 */
package com.haier.isales.salerinfo.personalinfo.service;

import com.haier.isales.salerinfo.personalinfo.domain.PersonalInfoDomain;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalFullInfoDTO;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalInfoDTO;
import com.haier.isales.salerinfo.personalinfo.dto.ReportsalesAuthorityDTO;

/** 
 * @ClassName: PersonalInfoService
 * @Description: PersonalInfo的Service接口定义类
 *  
 */
public interface PersonalInfoService {

	PersonalInfoDomain getSalerInfo(PersonalInfoDTO queryParams);
	
	/**
	 *  验证直销员是否允许报销量，根据个人信息和门店信息来校验
	 *  门店：闭店不能录销量，客户属性只有为（3：客户/门店，2门店）可以录销量
	* @Title: isAllowedToReportSales 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param user_code
	* @return  
	* @throws
	 */
	public boolean isAllowedToReportSales(Long operatorId);
	
	/**
	 *  验证直销员是否允许报销量，根据个人信息和门店信息来校验
	 *  门店：闭店不能录销量，客户属性只有为（3：客户/门店，2门店）可以录销量
	* @Title: getReportSalesAuthority 
	* @Description: (这里用一句话描述这个类的作用)
	* @param operatorId
	* @return  
	* @throws
	 */
	public ReportsalesAuthorityDTO getReportSalesAuthority(Long operatorId);
	
	/**
	 *  从视图中获取用户信息，主要是手机端个人信息展示页上的信息
	* @Title: getSalerInfoFromView 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param operatorId
	* @return  
	* @throws
	 */
	public PersonalFullInfoDTO getEmpInfoSummary(Long operatorId);
}
