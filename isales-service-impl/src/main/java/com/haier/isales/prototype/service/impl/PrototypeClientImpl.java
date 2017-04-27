/**
* @Company 青鸟软通   
* @Title: PrototypeClientImpl.java 
* @Package com.haier.isales.prototype.service.impl 
* @author Guo Yuchao   
* @date 2014-12-25 14:29:35 
* @version V1.0   
*/ 
package com.haier.isales.prototype.service.impl;

import com.haier.isales.prototype.dto.PrototypeDTO;
import com.haier.isales.prototype.service.PrototypeService;
import com.haier.isales.prototype.service.PrototypeUpdateClient;

/** 
 * @ClassName: PrototypeClientImpl 
 * @Description:样机相关 
 *  
 */
public class PrototypeClientImpl implements PrototypeUpdateClient {
	private PrototypeService prototypeService;
	/**
	* <p>Description:直销员移动应用向HMMS系统传递【样机出(上)样】信息 </p> 
	* @author Guo Yuchao   
	* @date 2014-12-25 下午2:30:18 
	* @param wsPrototypeDTO
	* @return 
	* @see com.haier.isales.prototype.service.PrototypeUpdateClient#savePrototypePurchase(com.haier.isales.prototype.dto.WsPrototypeDTO) 
	*/ 
	@Override
	public String savePrototypePurchase(PrototypeDTO prototypeDTO) {
		
		return prototypeService.savePrototypePurchase(prototypeDTO);
	}

	/**
	* <p>Description: 直销员移动应用向HMMS系统传递【样机核销】信息 </p> 
	* @author Guo Yuchao   
	* @date 2014-12-25 下午2:30:18 
	* @param prototypeDTO
	* @return 
	* @see com.haier.isales.prototype.service.PrototypeUpdateClient#savePrototypeAuditOut(com.haier.isales.prototype.dto.WsPrototypeDTO) 
	*/ 
	@Override
	public String savePrototypeAuditOut(PrototypeDTO prototypeDTO) {
		
		return prototypeService.savePrototypeAuditOut(prototypeDTO);
	}


	/**
	 * @Description: 属性 prototypeService 的set方法 
	 * @param prototypeService 
	 */
	public void setPrototypeService(PrototypeService prototypeService) {
		this.prototypeService = prototypeService;
	}
	



}
