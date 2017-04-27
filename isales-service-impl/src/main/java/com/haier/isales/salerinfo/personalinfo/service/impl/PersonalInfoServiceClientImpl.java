/**
* @Company 青鸟软通   
* @Title: PersonalInfoServiceClientImpl.java 
* @Package com.haier.isales.salerInfo.personalInfo.service.impl 
* @author Cao Rui   
* @date 2014-11-11 下午4:31:42 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalinfo.service.impl;

import org.apache.log4j.Logger;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.salerinfo.personalinfo.SalerInfoDomainDtoUtil;
import com.haier.isales.salerinfo.personalinfo.domain.PersonalInfoDomain;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalFullInfoDTO;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalInfoDTO;
import com.haier.isales.salerinfo.personalinfo.dto.ReportsalesAuthorityDTO;
import com.haier.isales.salerinfo.personalinfo.service.PersonalInfoService;
import com.haier.isales.salerinfo.personalinfo.service.PersonalInfoServiceClient;
import com.haier.isales.salerinfo.userdetail.domain.UserDetailDomain;
import com.haier.isales.salerinfo.userdetail.service.UserDetailService;

/** 
 * @ClassName: PersonalInfoServiceClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class PersonalInfoServiceClientImpl implements PersonalInfoServiceClient{
	private static Logger logger = Logger.getLogger(PersonalInfoServiceClientImpl.class);
	private PersonalInfoService personalInfoService;
	private UserDetailService userDetailService;
	
	/**
	 * 根据查询条件queryParams（主要是员工号）,获取直销员的信息
	 * @param queryParam
	 * @return
	 */
	@Override
	public PersonalInfoDTO getSalerInfo(PersonalInfoDTO queryParam){
		
		logger.info("传入参数："+queryParam);
		PersonalInfoDTO dto = new PersonalInfoDTO();
		//判断传入参数
		if(null != queryParam){
			PersonalInfoDomain domain = personalInfoService.getSalerInfo(queryParam);
			//将domain转为dto 并返回
			dto = SalerInfoDomainDtoUtil.clonePersonalDoamin2DTO(domain);
			logger.info("执行完成，返回结果 的name："+dto.getHname());
		}	
		return dto;
		
	}	

	/**
	 *  从视图中获取用户信息，主要是手机端个人信息展示页上的信息
	* @Title: getSalerInfoFromView 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param operatorId
	* @return  
	* @throws
	 */
	@Override
	public PersonalFullInfoDTO getEmpInfoSummary(Long operatorId) {
		
		logger.info("dubbo中getSalerInfoFromView方法，传入参数："+operatorId);
		PersonalFullInfoDTO dto = personalInfoService.getEmpInfoSummary(operatorId);

		return dto;
		
	}
	
	/**
	 *  验证直销员是否允许提报销量
	* @Title: isAllowedToReportSales 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param operatorId
	* @return  
	* @throws
	 */
	@Override
	public Object isAllowedToReportSales(Long operatorId) {
		
		logger.info("dubbo中isAllowedToReportSales方法，传入参数："+operatorId);
		boolean dto = personalInfoService.isAllowedToReportSales(operatorId);

		return dto;
		
	}
	
	/**
	 *  验证直销员是否允许提报销量
	 *  返回结果为类，以包含错误信息
	* @Title: isAllowedToReportSales 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param operatorId
	* @return  
	* @throws
	 */
	@Override
	public Object getReportSalesAuthority(Long operatorId) {
		
		logger.info("dubbo中isAllowedToReportSales方法，传入参数："+operatorId);
		ReportsalesAuthorityDTO dto = personalInfoService.getReportSalesAuthority(operatorId);

		return dto;
		
	}
	
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-3-17 下午3:22:22 
	* @param operatorId
	* @return 
	* @see com.haier.isales.salerinfo.personalinfo.service.PersonalInfoServiceClient#getFullPersonalInfoById(java.lang.Long) 
	*/ 
	@Override
	public Object getFullPersonalInfoById(Long operatorId) {
		PersonalFullInfoDTO dto = personalInfoService.getEmpInfoSummary(operatorId);
		if(dto==null){
			throw new BusinessException(BusinessExceptionCode.database_none_data,"未查询到相关信息！");
		}
		UserDetailDomain userDetailDomain = userDetailService.findById(operatorId);
		dto.setUserMobile(userDetailDomain.getMobile());
		dto.setHeadPortraitId(userDetailDomain.getHeadPortraitId());
		dto.setSignature(userDetailDomain.getSignature());
		return dto;
	}
	
	/*=======================getters and setters====================================*/
	
	/**
	 * @Description: 属性 personalInfoService 的get方法 
	 * @return personalInfoService
	 */
	public PersonalInfoService getPersonalInfoService() {
		return personalInfoService;
	}


	/**
	 * @Description: 属性 personalInfoService 的set方法 
	 * @param personalInfoService 
	 */
	public void setPersonalInfoService(PersonalInfoService personalInfoService) {
		this.personalInfoService = personalInfoService;
	}

	/**
	 * @Description: 属性 userDetailService 的set方法 
	 * @param userDetailService 
	 */
	public void setUserDetailService(UserDetailService userDetailService) {
		this.userDetailService = userDetailService;
	}

	
}
