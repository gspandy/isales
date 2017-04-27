/**
* @Company 青鸟软通   
* @Title: PersonalSalaryServiceImpl.java 
* @Package com.haier.isales.salerinfo.personalsalary.service.impl 
* @author John.zhao   
* @date 2015-2-26 上午10:40:33 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalsalary.service.impl;

import org.bana.common.util.basic.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.salerinfo.personalsalary.dto.PersonalSalarySearchDTO;
import com.haier.isales.salerinfo.personalsalary.service.PersonalSalaryService;
import com.haier.isales.ws.zzjyt.client.btbappzxygzimpl.BtbAppZxyGzImpl;
import com.haier.isales.ws.zzjyt.client.btbappzxygzimpl.BtbAppZxyGzInfo;

/** 
 * @ClassName: PersonalSalaryServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class PersonalSalaryServiceImpl implements PersonalSalaryService {
	
	private static final Logger LOG = LoggerFactory.getLogger(PersonalSalaryServiceImpl.class);
	
	private BtbAppZxyGzImpl btbAppZxyGzImpl;

	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-2-26 上午10:44:56 
	* @param personalSalaryDTO
	* @return 
	* @see com.haier.isales.salerinfo.personalsalary.service.PersonalSalaryService#searchPersonalSalary(com.haier.isales.salerinfo.personalsalary.dto.PersonalSalarySearchDTO) 
	*/ 
	@Override
	public BtbAppZxyGzInfo searchPersonalSalary(PersonalSalarySearchDTO personalSalarySearchDTO) {
		if(personalSalarySearchDTO == null){
			throw new BusinessException(BusinessExceptionCode.param_error);
		}
		if(StringUtils.isBlank(personalSalarySearchDTO.getMonths())){
			throw new BusinessException(BusinessExceptionCode.param_error,"查询的工资年月为空！");
		}
		if(StringUtils.isBlank(personalSalarySearchDTO.getYgid())){
			throw new BusinessException(BusinessExceptionCode.param_error,"查询的员工号为空！");
		}
		BtbAppZxyGzInfo btbAppZxyGzInfo= new BtbAppZxyGzInfo();
		try {
			btbAppZxyGzInfo = btbAppZxyGzImpl.btbAppZxyGz(personalSalarySearchDTO.getMonths(), personalSalarySearchDTO.getYgid());
		} catch (Exception e) {
			LOG.info("ex", e);
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"连接超时，请稍候重试！");
		}
		if("N".equalsIgnoreCase(btbAppZxyGzInfo.getStatus())){
			throw new BusinessException(BusinessExceptionCode.database_none_data,"您查询的"+personalSalarySearchDTO.getMonths()+"月份的工资无数据！");
		}
		return btbAppZxyGzInfo;
	}
	
	//====================================================
	/**
	 * @Description: 属性 btbAppZxyGzImpl 的set方法 
	 * @param btbAppZxyGzImpl 
	 */
	public void setBtbAppZxyGzImpl(BtbAppZxyGzImpl btbAppZxyGzImpl) {
		this.btbAppZxyGzImpl = btbAppZxyGzImpl;
	}

}
