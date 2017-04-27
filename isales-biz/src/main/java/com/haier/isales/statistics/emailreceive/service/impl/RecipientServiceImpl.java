/**
 * @Company 青鸟软通   
 * @Title: RecipientService.java 
 * @Package  com.haier.isales.statistics.emailreceive.service.impl
 * @author John Zhao   
 * @date 2014年12月04日  16:04:35
 * @version V1.0   
 */
package com.haier.isales.statistics.emailreceive.service.impl;


import java.util.List;

import com.haier.isales.statistics.emailreceive.dao.RecipientDAO;
import com.haier.isales.statistics.emailreceive.domain.RecipientDomain;
import com.haier.isales.statistics.emailreceive.service.RecipientService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: RecipientService
 * @Description: Recipient的Service接口定义类
 *  
 */
public class RecipientServiceImpl implements RecipientService{

	private static final Logger LOG = LoggerFactory.getLogger(RecipientServiceImpl.class);
	
	/** 
	* @Fields recipientDao : RecipientDao 工具依赖 
	*/
	private RecipientDAO recipientDao;
	/*===============业务方法=============*/
	
	@Override
	public List<RecipientDomain> getAllRecipient(){
		LOG.info("info");
		return recipientDao.findAll();
	}
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性recipientDao 的set方法 
	 */
	public void setRecipientDao(RecipientDAO recipientDao){
		this.recipientDao = recipientDao;
	}
}
