/**
* @Company 青鸟软通   
* @Title: UserDetailClientImpl.java 
* @Package com.haier.isales.salerinfo.userdetail.service.impl 
* @author Guo Yuchao   
* @date 2014-11-21 下午9:40:29 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.userdetail.service.impl;

import com.haier.isales.salerinfo.userdetail.UserDetailDomainDtoUtill;
import com.haier.isales.salerinfo.userdetail.domain.UserDetailDomain;
import com.haier.isales.salerinfo.userdetail.dto.UserDetailSearchDTO;
import com.haier.isales.salerinfo.userdetail.service.UserDetailSearchClient;
import com.haier.isales.salerinfo.userdetail.service.UserDetailService;
import com.haier.isales.salerinfo.userdetail.service.UserDetailUpdateClient;

/** 
 * @ClassName: UserDetailClientImpl 
 * @Description: 
 *  
 */
public class UserDetailClientImpl implements UserDetailUpdateClient,UserDetailSearchClient{
	private UserDetailService userDetailService;
	
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2014-11-22 下午3:14:38 
	* @param userDetailSearchDTO
	* @return 
	* @see com.haier.isales.salerinfo.userdetail.service.UserDetailUpdateClient#updateUserDetail(com.haier.isales.salerinfo.userdetail.dto.UserDetailSearchDTO) 
	*/ 
	@Override
	public UserDetailSearchDTO updateUserDetail(UserDetailSearchDTO userDetailSearchDTO) {
		UserDetailDomain userDetailDomain = UserDetailDomainDtoUtill.cloneUserDetailDto2Domain(userDetailSearchDTO);
		UserDetailDomain domain = userDetailService.updateUserDetail(userDetailDomain);
		UserDetailSearchDTO dto = UserDetailDomainDtoUtill.cloneUserDetailDomain2Dto(domain);
		return dto;
	}
	
	/**
	 * 
	* @Title: findUserDetailById 
	* @Description:  根据id获取用户详细信息 并返回dto对象
	* @param id
	* @return  
	* @throws
	 */
	@Override
	public UserDetailSearchDTO findUserDetailById(Long id) {
		UserDetailDomain domain = userDetailService.findById(id);
		UserDetailSearchDTO dto = UserDetailDomainDtoUtill.cloneUserDetailDomain2Dto(domain);
		return dto;
	}
	/**
	 * @Description: 属性 userDetailService 的get方法 
	 * @return userDetailService
	 */
	public UserDetailService getUserDetailService() {
		return userDetailService;
	}
	/**
	 * @Description: 属性 userDetailService 的set方法 
	 * @param userDetailService 
	 */
	public void setUserDetailService(UserDetailService userDetailService) {
		this.userDetailService = userDetailService;
	}

}
