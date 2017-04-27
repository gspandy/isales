/**
* @Company 青鸟软通   
* @Title: PersonalSalaryServiceClientImpl.java 
* @Package com.haier.isales.salerinfo.personalsalary.service.impl 
* @author John.zhao   
* @date 2015-2-26 上午11:25:43 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalsalary.service.impl;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.salerinfo.personalsalary.PersonalSalaryDTOUtil;
import com.haier.isales.salerinfo.personalsalary.dto.PersonalSalaryDTO;
import com.haier.isales.salerinfo.personalsalary.dto.PersonalSalarySearchDTO;
import com.haier.isales.salerinfo.personalsalary.service.PersonalSalaryClient;
import com.haier.isales.salerinfo.personalsalary.service.PersonalSalaryService;
import com.haier.isales.ws.zzjyt.client.btbappzxygzimpl.BtbAppZxyGzInfo;

/** 
 * @ClassName: PersonalSalaryServiceClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class PersonalSalaryServiceClientImpl implements PersonalSalaryClient {
	
	private PersonalSalaryService personalSalaryService;

	/**
	 * <p>Description: </p> 
	 * @author John.zhao   
	 * @date 2015-2-26 上午11:25:43 
	 * @param personalSalarySearchDTO
	 * @return 
	 * @see com.haier.isales.salerinfo.personalsalary.service.PersonalSalaryClient#searchPersonalSalary(com.haier.isales.salerinfo.personalsalary.dto.PersonalSalarySearchDTO) 
	 */
	@Override
	public Object searchPersonalSalary(PersonalSalarySearchDTO personalSalarySearchDTO) {
		if(personalSalarySearchDTO== null){
			throw new BusinessException(BusinessExceptionCode.param_error);
		}
		BtbAppZxyGzInfo btbAppZxyGzInfo = personalSalaryService.searchPersonalSalary(personalSalarySearchDTO);
		if(btbAppZxyGzInfo == null){
			throw new BusinessException(BusinessExceptionCode.database_none_data,"您查询的"+personalSalarySearchDTO.getMonths()+"月份的工资无数据！");
		}
		PersonalSalaryDTO personalSalaryDTO = PersonalSalaryDTOUtil.clonePersonalSalary2DTO(btbAppZxyGzInfo);
		if(personalSalaryDTO == null){
			throw new BusinessException(BusinessExceptionCode.database_none_data,"您查询的"+personalSalarySearchDTO.getMonths()+"月份的工资无数据！");
		}
		return personalSalaryDTO;
	}

	/**
	 * @Description: 属性 personalSalaryService 的set方法 
	 * @param personalSalaryService 
	 */
	public void setPersonalSalaryService(PersonalSalaryService personalSalaryService) {
		this.personalSalaryService = personalSalaryService;
	}

}
