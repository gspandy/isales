/**
 * @Company 青鸟软通   
 * @Title: PersonalInfoDAO.java 
 * @Package  com.haier.isales.salerInfo.personalInfo.dao
 * @author Cao Rui   
 * @date 2014年11月11日  15:21:50
 * @version V1.0   
 */
package com.haier.isales.salerinfo.personalinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO;
import com.haier.isales.salerinfo.personalinfo.domain.PersonalEmpInfoDomain;
import com.haier.isales.salerinfo.personalinfo.domain.PersonalInfoDomain;
import com.haier.isales.salerinfo.personalinfo.domain.AddrBookDomain;

/** 
 * @ClassName: PersonalInfoDAO
 * @Description: PersonalInfo的DAO接口定义类
 *  
 */
public interface PersonalInfoDAO extends CommonDAO<PersonalInfoDomain,String>{
	
	/**
	 *  根据查询条件，查询直销员个人信息，
	* @Title: getSalerInfo 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param personalInfoDTO
	* @return  
	* @throws
	 */
	List<PersonalInfoDomain> getSalerInfo(String userCode);
	
	/**
	 *  
	* @Title: getSalerInfoFromView 
	* @Description: 从员工信息汇总表获取员工信息，主要是门店、中心、产品线。
	* 				（手机、头像、签名等可能实时变动的信息不从此处获取）
	* @param operatorId
	* @return  
	* @throws
	 */
	PersonalEmpInfoDomain getEmpInfoSummary(Long operatorId);
	
	/**
	 *  
	* @Title: getEmpInfoSummaryByCode 
	* @Description: 根据工号获取员工汇总信息
	* @param userCode
	* @return  
	* @throws
	 */
	PersonalEmpInfoDomain getEmpInfoSummaryByCode(String userCode);
	
	/** 
	* @Description: 获取通讯录列表
	* @author Huang nana   
	* @date 2015-1-21 下午5:16:14 
	* @param orgCode
	* @param searchKey
	* @return  
	*/ 
	//List<AddrBookDomain> searchEmpList(@Param("orgCode") String orgCode,@Param("searchKey") String searchKey);
	List<AddrBookDomain> searchEmpList(@Param("queryDto")AddressBookDTO queryDto);
	
	/** 
	* @Description: 获取通讯录员工信息
	* @author Huang nana   
	* @date 2015-1-21 下午5:16:39 
	* @param userCode
	* @return  
	*/ 
	AddrBookDomain searchEmpInfo(String userCode);
	
	/** 
	* @Description: 获取中心列表
	* @author Huang nana   
	* @date 2015-1-23 上午9:31:39 
	* @param userCode
	* @return  
	*/ 
	List<AddrBookDomain> searchOrgListByUser(@Param("userCode") String userCode);
	
	/** 
	* @Description: 获取渠道列表
	* @author Huang nana   
	* @date 2015-3-5 上午11:12:09 
	* @param userCode
	* @return  
	*/ 
	List<AddrBookDomain> searchChanListByUser();
	
	/** 
	* @Description:获取产业列表
	* @author Huang nana   
	* @date 2015-3-5 上午11:42:56 
	* @return  
	*/ 
	List<AddrBookDomain> searchProductListByUser();
	
}
