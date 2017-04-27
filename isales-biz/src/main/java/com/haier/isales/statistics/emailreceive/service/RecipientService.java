/**
 * @Company 青鸟软通   
 * @Title: RecipientService.java 
 * @Package  com.haier.isales.statistics.emailreceive.service
 * @author John Zhao   
 * @date 2014年12月04日  16:04:35
 * @version V1.0   
 */
package com.haier.isales.statistics.emailreceive.service;

import java.util.List;

import com.haier.isales.statistics.emailreceive.domain.RecipientDomain;

/** 
 * @ClassName: RecipientService
 * @Description: Recipient的Service接口定义类
 *  
 */
public interface RecipientService {

	public List<RecipientDomain> getAllRecipient();
}
