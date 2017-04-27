/**
* @Company 青鸟软通   
* @Title: PersonalInfoServiceClient.java 
* @Package com.haier.isales.salerInfo.personalInfo.service 
* @author Cao Rui   
* @date 2014-11-11 下午4:28:23 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalinfo.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.salerinfo.personalinfo.dto.PersonalInfoDTO;

/** 
 * @ClassName: PersonalInfoServiceClient 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public interface PersonalInfoServiceClient {

	/**
	 * 根据查询条件queryParams（主要是员工号）,获取直销员的信息
	 * @param queryParam
	 * @return
	 */
	@Export(paramNames = {"queryParam"})
	public Object getSalerInfo(PersonalInfoDTO queryParam);
	
	
	/**
	 *  从视图中获取用户信息，主要是手机端个人信息展示页上的信息
	* @Title: getSalerInfoFromView 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param operatorId
	* @return  
	* @throws
	 */
	@Export(paramNames = {"operatorId"})
	public Object getEmpInfoSummary(Long operatorId) ;
	
	/**
	 *  验证直销员是否允许提报销量
	* @Title: isAllowedToReportSales 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param operatorId
	* @return  
	* @throws
	 */
	@Export(paramNames = {"operatorId"})
	public Object isAllowedToReportSales(Long operatorId);
	
	
	/**
	 *  验证直销员是否允许提报销量
	 *  返回结果为类，以包含错误信息
	* @Title: isAllowedToReportSales 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param operatorId
	* @return  
	* @throws
	 */
	public Object getReportSalesAuthority(Long operatorId);
	
	/** 
	* @Description: 通过operatorId获取信息(员工姓名，手机号，签名，头像等)
	* @author John.zhao   
	* @date 2015-3-17 下午3:21:30 
	* @param operatorId
	* @return  
	*/ 
	public Object getFullPersonalInfoById(Long operatorId);
}
