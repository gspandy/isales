/**
 * @Company 青鸟软通   
 * @Title: PersonalInfoService.java 
 * @Package  com.haier.isales.salerInfo.personalInfo.service.impl
 * @author Cao Rui   
 * @date 2014年11月11日  16:16:30
 * @version V1.0   
 */
package com.haier.isales.salerinfo.personalinfo.service.impl;


import java.util.Arrays;
import java.util.List;

import org.bana.common.util.basic.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.basicinfo.shop.dao.ShopDAO;
import com.haier.isales.basicinfo.shop.domain.ShopDomain;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;
import com.haier.isales.salerinfo.personalinfo.SalerInfoDomainDtoUtil;
import com.haier.isales.salerinfo.personalinfo.dao.PersonalInfoDAO;
import com.haier.isales.salerinfo.personalinfo.domain.PersonalEmpInfoDomain;
import com.haier.isales.salerinfo.personalinfo.domain.PersonalInfoDomain;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalFullInfoDTO;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalInfoDTO;
import com.haier.isales.salerinfo.personalinfo.dto.ReportsalesAuthorityDTO;
import com.haier.isales.salerinfo.personalinfo.service.PersonalInfoService;

import com.haier.isales.system.user.dao.UserDao;
import com.haier.isales.system.user.domain.User;

/** 
 * @ClassName: PersonalInfoService
 * @Description: PersonalInfo的Service接口定义类
 *  
 */
public class PersonalInfoServiceImpl implements PersonalInfoService{

	private static final Logger LOG = LoggerFactory.getLogger(PersonalInfoServiceImpl.class);
	public static final String ON_JOB = "Y";
	public static final String NOT_ON_JOB = "N";
	
	/** 
	* @Fields personalInfoDao : PersonalInfoDao 工具依赖 
	*/
	private PersonalInfoDAO personalInfoDao;
	private ShopDAO shopDao;
	private UserDao userDao;
	
	/*===============业务方法=============*/
	
	/**
	* <p>Description:根据查询条件queryParams（主要是员工号）,获取直销员的信息 </p> 
	* @author Cao Rui   
	* @date 2014-11-11 下午1:59:05 
	* @param queryParams
	* @return 
	*/ 
	@Override
	public PersonalInfoDomain getSalerInfo(PersonalInfoDTO queryParams) {
		
		LOG.info("查询登录用户的个人信息 service方法");
		PersonalInfoDomain domain = new PersonalInfoDomain();
			
			List<PersonalInfoDomain> salerList = personalInfoDao.getSalerInfo(queryParams.getHmcId());
			if(!salerList.isEmpty()){
				domain = salerList.get(0);
				return domain;
			}
		
		return domain;
	}
	
	/**
	 *  验证直销员是否允许报销量，根据个人信息和门店信息来校验
	 *  门店：闭店不能录销量，客户属性只有为（3：客户/门店，2门店）可以录销量
	* @Title: isAllowedToReportSales 
	* @Description: (这里用一句话描述这个类的作用)
	* @param user_code
	* @return  
	* @throws
	 */
	@Override
	public boolean isAllowedToReportSales(Long operatorId){
		boolean result = false;
		//验证参数是否为空
		if (null == operatorId) {// 判断参数名是否为空
			throw new SystemException(BusinessExceptionCode.param_error,
					"用户id为空");
		}
		User userDomain = userDao.findById(operatorId);
		if(null == userDomain){
			//没有获取到用户信息
			LOG.error("未获取到用户信息，不允许提报销量，验证的用户operatorId="+operatorId);
			return result;
		}
		//根据用户获取员工信息
		String userCode = userDomain.getUserCode();
		if(StringUtils.isBlank(userCode) ){
			// 该用户的员工号为空
			return result;
		}
		//获取用户信息,验证用户状态
		PersonalInfoDomain domain;
		List<PersonalInfoDomain> salerList = personalInfoDao.getSalerInfo(userCode);
		if(null != salerList && !salerList.isEmpty()){
			domain = salerList.get(0);
		}else{
			LOG.error("未获取到员工信息，不允许提报销量，验证的用户operatorId="+operatorId);
			return result;
		}
		
		if(null == domain || null == domain.getStatus()){
			LOG.error("未获取到员工信息，不允许提报销量，验证的用户operatorId="+operatorId);
			return result;
		}
		
		String status = domain.getStatus();
		if(!ON_JOB.equals(status)){
			//用户不是在职状态
			LOG.error("直销员不是在职状态，不允许提报销量，验证的用户operatorId="+operatorId);
			return result;
		}
		
		// 获取门店信息,验证门店的状态和属性  闭店不能录销量，客户属性只有为（3：客户/门店，2门店）可以录销量
		if(StringUtils.isEmpty(domain.getShopId())){
			//没有维护门店信息
			LOG.error("未找到该直销员对应的门店，不允许提报销量，验证的用户operatorId="+operatorId);
			return result;
		}
		ShopDomain shopDomain = shopDao.findById(domain.getShopId());
		if(shopDomain == null){
			//没有维护门店信息
			LOG.error("未找到该直销员对应的门店，不允许提报销量，验证的用户operatorId="+operatorId);
			return result;
		}
		
		if(ShopDomain.DEL_FLAG_SHOP_OPEN.equals(shopDomain.getDelFlag())
				&& Arrays.asList(ShopDomain.POST_CODE_CAN_POST).contains(shopDomain.getPostCode())
				){
			//门店关闭状态（是否关闭）:1.闭店,0.开店.闭店不能录销量但是有直销员
			//客户属性，1：客户，3：客户/门店，2或其他：客户    只有2和3可以录销量
			//LOG.info("直销员所在的门店允许提报销量，验证的用户operatorId="+operatorId);
			result = true;
		} else {
			LOG.error("直销员所在的门店不允许提报销量，验证的用户operatorId="+operatorId);
			return result;
		}
		
//		result = true;//以上验证均通过，该直销员可以上传销量
		return result;
	}
	
	/**
	 *  验证直销员是否允许报销量，根据个人信息和门店信息来校验
	 *  门店：闭店不能录销量，客户属性只有为（3：客户/门店，2门店）可以录销量
	* @Title: getReportSalesAuthority 
	* @Description: (这里用一句话描述这个类的作用)
	* @param operatorId
	* @return  
	* @throws
	 */
	@Override
	public ReportsalesAuthorityDTO getReportSalesAuthority(Long operatorId){
		ReportsalesAuthorityDTO dto = new ReportsalesAuthorityDTO();
		boolean result = false;
		dto.setAllowed(result);
		//验证参数是否为空
		if (null == operatorId) {// 判断参数名是否为空
			throw new SystemException(BusinessExceptionCode.param_error,
					"用户id为空");
		}
		User userDomain = userDao.findById(operatorId);
		if(null == userDomain){
			//没有获取到用户信息
			LOG.error("未获取到用户信息，不允许提报销量，验证的用户operatorId="+operatorId);
			dto.setMsg("未获取到用户信息，不允许提报销量");
			return dto;
		}
		//根据用户获取员工信息
		String userCode = userDomain.getUserCode();
		if(StringUtils.isBlank(userCode) ){
			// 该用户的员工号为空
			dto.setMsg("获取员工号为空，不允许提报销量");
			return dto;
		}
		//获取用户信息,验证用户状态
		PersonalInfoDomain domain ;
		List<PersonalInfoDomain> salerList = personalInfoDao.getSalerInfo(userCode);
		if(null != salerList && !salerList.isEmpty()){
			domain = salerList.get(0);
		}else{
			LOG.error("未获取到员工信息，不允许提报销量，验证的用户operatorId="+operatorId);
			dto.setMsg("未获取到员工信息，不允许提报销量");
			return dto;
		}
		
		if(null == domain || null == domain.getStatus()){
			LOG.error("未获取到员工信息，不允许提报销量，验证的用户operatorId="+operatorId);
			dto.setMsg("未获取到员工信息，不允许提报销量");
			return dto;
		}
		
		String status = domain.getStatus();
		if(!ON_JOB.equals(status)){
			//用户不是在职状态
			LOG.error("直销员不是在职状态，请联系当地人力，验证的用户operatorId="+operatorId);
			dto.setMsg("直销员不是在职状态，请联系当地人力");
			return dto;
		}
		
		// 获取门店信息,验证门店的状态和属性  闭店不能录销量，客户属性只有为（3：客户/门店，2门店）可以录销量
		if(StringUtils.isEmpty(domain.getShopId())){
			//没有维护门店信息
			LOG.error("未找到该直销员对应的门店，不允许提报销量，验证的用户operatorId="+operatorId);
			dto.setMsg("未找到该直销员对应的门店,请确认个人信息是否正确或者门店是否闭店");
			return dto;
		}
		ShopDomain shopDomain = shopDao.findById(domain.getShopId());
		if(shopDomain == null){
			//没有维护门店信息
			LOG.error("未找到该直销员对应的门店,请联系业务确认门店是否闭店，验证的用户operatorId="+operatorId);
			dto.setMsg("未找到该直销员对应的门店,请联系业务确认门店是否闭店");
			return dto;
		}
		
		if(!ShopDomain.DEL_FLAG_SHOP_OPEN.equals(shopDomain.getDelFlag())){
			//门店关闭状态（是否关闭）:1.闭店,0.开店.闭店不能录销量但是有直销员
			LOG.error("直销员所在的门店为闭店状态，请联系业务处理，不允许录销量，验证的用户operatorId="+operatorId);
			dto.setMsg("直销员所在的门店为闭店状态，请联系业务处理");
			return dto;
		}
		
		if(!Arrays.asList(ShopDomain.POST_CODE_CAN_POST).contains(shopDomain.getPostCode())){
			//客户属性，1：客户，3：客户/门店，2或其他：客户    只有2和3可以录销量
			LOG.error("直销员所在的门店属性为客户，请联系业务维护，验证的用户operatorId="+operatorId);
			dto.setMsg("直销员所在的门店属性为客户，请联系业务维护");
			return dto;
		}
		
		dto.setAllowed(true);
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
		
		LOG.info("查询登录用户的个人信息 service方法");	
		PersonalEmpInfoDomain domain = personalInfoDao.getEmpInfoSummary(operatorId);
		/* 2015-4-21 修改*/
		PersonalFullInfoDTO dto = SalerInfoDomainDtoUtil.clonePersonalInfoFromViewDomain2DTO(domain);
		return dto;
	}


	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性personalInfoDao 的set方法 
	 */
	public void setPersonalInfoDao(PersonalInfoDAO personalInfoDao){
		this.personalInfoDao = personalInfoDao;
	}

	/**
	 * @Description: 属性 shopDao 的get方法 
	 * @return shopDao
	 */
	public ShopDAO getShopDao() {
		return shopDao;
	}

	/**
	 * @Description: 属性 shopDao 的set方法 
	 * @param shopDao 
	 */
	public void setShopDao(ShopDAO shopDao) {
		this.shopDao = shopDao;
	}

	/**
	 * @Description: 属性 userDao 的get方法 
	 * @return userDao
	 */
	public UserDao getUserDao() {
		return userDao;
	}

	/**
	 * @Description: 属性 userDao 的set方法 
	 * @param userDao 
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
