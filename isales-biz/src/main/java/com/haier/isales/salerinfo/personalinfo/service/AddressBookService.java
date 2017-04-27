/**
* @Company 青鸟软通   
* @Title: AddressBookService.java 
* @Package com.haier.isales.salerinfo.personalinfo.service 
* @author Huang nana   
* @date 2015-1-21 下午1:06:02 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalinfo.service;

import java.util.List;

import com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO;
/** 
 * @ClassName: AddressBookService 
 * @Description: 通讯录接口定义
 *  
 */
public interface AddressBookService {
	
	/** 
	* @Description: 获取通讯录列表
	* @author Huang nana   
	* @date 2015-1-21 下午1:07:24 
	* @param queryParams
	* @return  
	*/ 
	public List<AddressBookDTO> searchAddBookList(AddressBookDTO queryParams);
	
	/** 
	* @Description: 通讯录获取特定人员信息
	* @author Huang nana   
	* @date 2015-1-21 下午1:07:46 
	* @param queryParams
	* @return  
	*/ 
	public AddressBookDTO searchRalationInfo(AddressBookDTO queryParams);
	
	/** 
	* @Description: 中心列表
	* @author Huang nana   
	* @date 2015-1-23 上午9:32:03 
	* @param queryParams
	* @return  
	*/ 
	public List<AddressBookDTO> searchOrgListByUser(AddressBookDTO queryParams);
	
	/** 
	* @Description: 获取渠道列表
	* @author Huang nana   
	* @date 2015-3-5 上午10:40:40 
	* @param queryParams
	* @return  
	*/ 
	public List<AddressBookDTO> searchChanListByUser(AddressBookDTO queryParams);
	
	/** 
	* @Description: 获取产业列表
	* @author Huang nana   
	* @date 2015-3-5 上午10:40:44 
	* @param queryParams
	* @return  
	*/ 
	public List<AddressBookDTO> searchProductListByUser(AddressBookDTO queryParams);

}
