/**
* @Company 青鸟软通   
* @Title: AddressBookServiceClient.java 
* @Package com.haier.isales.salerinfo.addressbook.service 
* @author Huang nana   
* @date 2015-1-21 下午6:15:25 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.addressbook.service;

import com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO;

/** 
 * @ClassName: AddressBookServiceClient 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public interface AddressBookServiceClient {

	/** 
	* @Description: 通讯录列表
	* @author Huang nana   
	* @date 2015-1-23 上午9:35:18 
	* @param queryParams
	* @return  
	*/ 
	public Object searchAddBookList(AddressBookDTO queryParams);
	
	/** 
	* @Description: 通讯录获取特定人员信息
	* @author Huang nana   
	* @date 2015-1-21 下午1:07:46 
	* @param queryParams
	* @return  
	*/ 
	public Object searchRalationInfo(AddressBookDTO queryParams);
	
	/** 
	* @Description: 中心列表
	* @author Huang nana   
	* @date 2015-1-23 上午9:35:29 
	* @param queryParams
	* @return  
	*/ 
	public Object searchOrgListByUser(AddressBookDTO queryParams);
	
	/** 
	* @Description: 获取渠道列表定义
	* @author Huang nana   
	* @date 2015-3-5 下午1:22:39 
	* @param queryParams
	* @return  
	*/ 
	public Object searchChanListByUser(AddressBookDTO queryParams);
	
	/** 
	* @Description: 获取产业列表定义
	* @author Huang nana   
	* @date 2015-3-5 下午1:23:06 
	* @param queryParams
	* @return  
	*/ 
	public Object searchProductListByUser(AddressBookDTO queryParams);
}
