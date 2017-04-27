/**
* @Company 青鸟软通   
* @Title: AddressBookServiceImpl.java 
* @Package com.haier.isales.salerinfo.personalinfo.service.impl 
* @author Huang nana   
* @date 2015-1-21 下午1:04:46 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalinfo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO;
import com.haier.isales.salerinfo.personalinfo.SalerInfoDomainDtoUtil;
import com.haier.isales.salerinfo.personalinfo.SalerInfoDomainDtoUtil.SearchAddressBookParamEnum;
import com.haier.isales.salerinfo.personalinfo.service.AddressBookService;
import com.haier.isales.salerinfo.personalinfo.domain.AddrBookDomain;

import com.haier.isales.salerinfo.personalinfo.dao.PersonalInfoDAO;
import com.haier.isales.system.role.dao.RoleDAO;
import com.haier.isales.system.role.domain.RoleDomain;

/** 
 * @ClassName: AddressBookServiceImpl 
 * @Description: 通讯录接口实现类 
 *  
 */
public class AddressBookServiceImpl implements AddressBookService {
	
	private PersonalInfoDAO personalInfoDao;
	private RoleDAO roleDao;


	
	/**
	* <p>Description: 通讯录列表</p> 
	* @author Huang nana   
	* @date 2015-1-23 上午9:32:25 
	* @param queryParams
	* @return 
	* @see com.haier.isales.salerinfo.personalinfo.service.AddressBookService#searchAddBookList(com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO) 
	*/ 
	@Override
	public List<AddressBookDTO> searchAddBookList(AddressBookDTO queryParams){
		if (queryParams == null) {
			// 输入的参数为空
			throw new BusinessException(BusinessExceptionCode.param_error, "通讯录，查询条件错误");
		}
		// 校验必需输入的字段
		CheckParamUtil.checkFieldIfNotBlank(queryParams, "queryOrgCode");
		if("JYT12E02".equals(queryParams.getQueryOrgCode())){
			queryParams.setQueryOrgCode("JYT12E01");
		}
		//添加查询所有产业/渠道选项 R.Core 2015-3-19 17:18:25 begin
		if(SearchAddressBookParamEnum.查询所有.getKey().equals(queryParams.getQueryChanCode())){
			queryParams.setQueryChanCode(null);
		}
		if(SearchAddressBookParamEnum.查询所有.getKey().equals(queryParams.getQueryProductId())){
			queryParams.setQueryProductId(null);
		}
		//添加查询所有产业/渠道选项 R.Core 2015-3-19 17:18:25 end
		List<AddrBookDomain> domainList = personalInfoDao.searchEmpList(queryParams);
		List<AddressBookDTO> returnList = new ArrayList<AddressBookDTO>();
		for (AddrBookDomain domain : domainList) {
			if(domain.getNameLetter()==null){
				domain.setNameLetter("#");
			}
			returnList.add(SalerInfoDomainDtoUtil.cloneAddressBookFromViewDomain2DTO(domain));
			
		}
		return returnList;
	}
	
	/**
	* <p>Description: 通讯录人员信息</p> 
	* @author Huang nana   
	* @date 2015-1-23 上午9:32:38 
	* @param queryParams
	* @return 
	* @see com.haier.isales.salerinfo.personalinfo.service.AddressBookService#searchRalationInfo(com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO) 
	*/ 
	@Override
	public AddressBookDTO searchRalationInfo(AddressBookDTO queryParams){
		if (queryParams == null) {
			// 输入的参数为空
			throw new BusinessException(BusinessExceptionCode.param_error, "通讯录，不存在查询人员的编码");
		}
		// 校验必需输入的字段
		CheckParamUtil.checkFieldIfNotBlank(queryParams, "queryUserCode");
		AddrBookDomain domain = personalInfoDao.searchEmpInfo(queryParams.getQueryUserCode());
		AddressBookDTO returnInfo = SalerInfoDomainDtoUtil.cloneAddressBookFromViewDomain2DTO(domain);
		return returnInfo;
	}
	
	/**
	* <p>Description: 通讯录-中心列表 </p> 
	* @author Huang nana   
	* @date 2015-1-23 上午9:32:49 
	* @param queryParams
	* @return 
	* @see com.haier.isales.salerinfo.personalinfo.service.AddressBookService#searchOrgListByUser(com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO) 
	*/ 
	@Override
	public List<AddressBookDTO> searchOrgListByUser(AddressBookDTO queryParams){
		if (queryParams == null) {
			// 输入的参数为空
			throw new BusinessException(BusinessExceptionCode.param_error, "通讯录，获取中心列表的参数为空");
		}
		CheckParamUtil.checkFieldIfNotBlank(queryParams, "operatorId","queryUserCode");
		//获取当前用户权限,判断是否是manager
		List<RoleDomain> roleList = roleDao.findByUserId(queryParams.getOperatorId());
		for(RoleDomain role:roleList){
			if("manager".equals(role.getRoleCode())){
				queryParams.setQueryUserCode("searchAll");
				break;
			}
		}

		List<AddrBookDomain> domainList = personalInfoDao.searchOrgListByUser(queryParams.getQueryUserCode());
		List<AddressBookDTO> returnList = new ArrayList<AddressBookDTO>();
		for (AddrBookDomain domain : domainList) {
			returnList.add(SalerInfoDomainDtoUtil.cloneAddressBookFromViewDomain2DTO(domain));
		}
		return returnList;
		
	}
	
	
	/**
	* <p>Description: 获取渠道列表实现</p> 
	* @author Huang nana   
	* @date 2015-3-5 上午11:08:46 
	* @param queryParams
	* @return 
	* @see com.haier.isales.salerinfo.personalinfo.service.AddressBookService#searchChanListByUser(com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO) 
	*/ 
	@Override
	public List<AddressBookDTO> searchChanListByUser(AddressBookDTO queryParams){

		List<AddrBookDomain> domainList = personalInfoDao.searchChanListByUser();
		List<AddressBookDTO> returnList = new ArrayList<AddressBookDTO>();
		//添加查询所有渠道选项 R.Core 2015-3-19 17:18:25 begin
		AddressBookDTO domain4All = new AddressBookDTO();
		domain4All.setChanCode(SearchAddressBookParamEnum.查询所有.getKey());
		domain4All.setChanName(SearchAddressBookParamEnum.查询所有.getValue());
		returnList.add(domain4All);
		//添加查询所有渠道选项 R.Core 2015-3-19 17:18:25 end
		for (AddrBookDomain domain : domainList) {
			returnList.add(SalerInfoDomainDtoUtil.cloneAddressBookFromViewDomain2DTO(domain));
		}
		return returnList;
	}
	
	/**
	* <p>Description: 获取产业列表实现</p> 
	* @author Huang nana   
	* @date 2015-3-5 下午1:21:56 
	* @param queryParams
	* @return 
	* @see com.haier.isales.salerinfo.personalinfo.service.AddressBookService#searchProductListByUser(com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO) 
	*/ 
	@Override
	public List<AddressBookDTO> searchProductListByUser(AddressBookDTO queryParams){
		List<AddrBookDomain> domainList = personalInfoDao.searchProductListByUser();
		List<AddressBookDTO> returnList = new ArrayList<AddressBookDTO>();
		//添加查询所有产业选项 R.Core 2015-3-19 17:18:25 begin
		AddressBookDTO domain4All = new AddressBookDTO();
		domain4All.setProductId(SearchAddressBookParamEnum.查询所有.getKey());
		domain4All.setProductName(SearchAddressBookParamEnum.查询所有.getValue());
		returnList.add(domain4All);
		//添加查询所有产业选项 R.Core 2015-3-19 17:18:25 end
		for (AddrBookDomain domain : domainList) {
			returnList.add(SalerInfoDomainDtoUtil.cloneAddressBookFromViewDomain2DTO(domain));
		}
		return returnList;
	}
	/**
	 * @Description: 属性 personalInfoDao 的get方法 
	 * @return personalInfoDao
	 */
	public PersonalInfoDAO getPersonalInfoDao() {
		return personalInfoDao;
	}

	/**
	 * @Description: 属性 personalInfoDao 的set方法 
	 * @param personalInfoDao 
	 */
	public void setPersonalInfoDao(PersonalInfoDAO personalInfoDao) {
		this.personalInfoDao = personalInfoDao;
	}
	
	/**
	 * @Description: 属性 roleDao 的get方法 
	 * @return roleDao
	 */
	public RoleDAO getRoleDao() {
		return roleDao;
	}

	/**
	 * @Description: 属性 roleDao 的set方法 
	 * @param roleDao 
	 */
	public void setRoleDao(RoleDAO roleDao) {
		this.roleDao = roleDao;
	}

}
