/**
* @Company 青鸟软通   
* @Title: AddressBookServiceImpl.java 
* @Package com.haier.isales.salerinfo.addressBook.service.impl 
* @author Huang nana   
* @date 2015-1-21 下午6:46:58 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.addressBook.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO;
import com.haier.isales.salerinfo.addressbook.service.AddressBookServiceClient;
import com.haier.isales.salerinfo.personalinfo.service.AddressBookService;

/** 
 * @ClassName: AddressBookServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class AddressBookServiceClientImpl implements AddressBookServiceClient{
	private static Logger logger = Logger.getLogger(AddressBookServiceClientImpl.class);
	private AddressBookService addressBookService;

	/**
	* <p>Description: 通讯录列表</p> 
	* @author Huang nana   
	* @date 2015-1-23 上午9:35:54 
	* @param queryParams
	* @return 
	* @see com.haier.isales.salerinfo.addressbook.service.AddressBookServiceClient#searchAddBookList(com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO) 
	*/ 
	@Override
	public List<AddressBookDTO> searchAddBookList(AddressBookDTO queryParams){
		logger.info("传入参数："+queryParams);
		List<AddressBookDTO> dto = new ArrayList<AddressBookDTO>();
		//判断传入参数
		
		if(null != queryParams){
			dto = addressBookService.searchAddBookList(queryParams);
		}	
		return dto;
	}
	
	/**
	* <p>Description: 人员信息 </p> 
	* @author Huang nana   
	* @date 2015-1-23 上午9:36:04 
	* @param queryParams
	* @return 
	* @see com.haier.isales.salerinfo.addressbook.service.AddressBookServiceClient#searchRalationInfo(com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO) 
	*/ 
	@Override
	public AddressBookDTO searchRalationInfo(AddressBookDTO queryParams){
		logger.info("传入参数："+queryParams);
		AddressBookDTO dto = new AddressBookDTO();
		//判断传入参数
		if(null != queryParams){
			dto = addressBookService.searchRalationInfo(queryParams);
		}	
		return dto;
	}
	
	/**
	* <p>Description: 中心列表</p> 
	* @author Huang nana   
	* @date 2015-1-23 上午9:36:17 
	* @param queryParams
	* @return 
	* @see com.haier.isales.salerinfo.addressbook.service.AddressBookServiceClient#searchOrgListByUser(com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO) 
	*/ 
	@Override
	public List<AddressBookDTO> searchOrgListByUser(AddressBookDTO queryParams){
		logger.info("传入参数："+queryParams);
		List<AddressBookDTO> dto = new ArrayList<AddressBookDTO>();
		//判断传入参数
		
		if(null != queryParams){
			dto = addressBookService.searchOrgListByUser(queryParams);
		}	
		return dto;
	}
	
	/**
	* <p>Description: 渠道列表</p> 
	* @author Huang nana   
	* @date 2015-3-5 下午1:24:09 
	* @param queryParams
	* @return 
	* @see com.haier.isales.salerinfo.addressbook.service.AddressBookServiceClient#searchChanListByUser(com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO) 
	*/ 
	@Override
	public List<AddressBookDTO> searchChanListByUser(AddressBookDTO queryParams){
		logger.info("传入参数："+queryParams);
		List<AddressBookDTO> dto = addressBookService.searchChanListByUser(queryParams);
		return dto;
	}
	
	/**
	* <p>Description: 产业列表</p> 
	* @author Huang nana   
	* @date 2015-3-5 下午1:24:32 
	* @param queryParams
	* @return 
	* @see com.haier.isales.salerinfo.addressbook.service.AddressBookServiceClient#searchProductListByUser(com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO) 
	*/ 
	@Override
	public List<AddressBookDTO> searchProductListByUser(AddressBookDTO queryParams){
		logger.info("传入参数："+queryParams);
		List<AddressBookDTO> dto = addressBookService.searchProductListByUser(queryParams);
		return dto;
	}
	
	/**
	 * @Description: 属性 addressBookService 的get方法 
	 * @return addressBookService
	 */
	public AddressBookService getAddressBookService() {
		return addressBookService;
	}

	/**
	 * @Description: 属性 addressBookService 的set方法 
	 * @param addressBookService 
	 */
	public void setAddressBookService(AddressBookService addressBookService) {
		this.addressBookService = addressBookService;
	}

	
}
