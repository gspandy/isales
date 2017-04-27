/**
 * @Company 青鸟软通   
 * @Title: MdmHandlerService.java 
 * @Package  com.haier.isales.app.mdmhandler.service
 * @author Guo Yuchao   
 * @date 2015年02月06日  11:20:08
 * @version V1.0   
 */
package com.haier.isales.app.mdmhandler.service;

import java.util.List;

import com.haier.isales.app.mdmhandler.domain.MdmHandlerDomain;

/** 
 * @ClassName: MdmHandlerService
 * @Description: MdmHandler的Service接口定义类
 *  
 */
public interface MdmHandlerService {

	List<MdmHandlerDomain> findMdmHandlerInBpm(String tradeCode,String shopId);
	void saveMdmHandlerTemp();
}
