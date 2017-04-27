/**
* @Company 青鸟软通   
* @Title: PrototypeUpdateClient.java 
* @Package com.haier.isales.prototype.service 
* @author Guo Yuchao   
* @date 2014-12-25 上午10:59:51 
* @version V1.0   
*/ 
package com.haier.isales.prototype.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.prototype.dto.PrototypeDTO;

/** 
 * @ClassName: PrototypeUpdateClient 
 * @Description: 样机相关
 *  
 */
public interface PrototypeUpdateClient {
	/** 
	* @Description:直销员移动应用向HMMS系统传递【样机出(上)样】信息
	* @author Guo Yuchao   
	* @date 2014-12-25 下午2:24:38 
	* @param wsPrototypeDTO
	* @return  
	*/ 
	@Export(paramNames = {"prototypeDTO"})
	Object savePrototypePurchase(PrototypeDTO prototypeDTO);
	
	
	
	/** 
	* @Description: 直销员移动应用向HMMS系统传递【样机核销】信息 
	* @author Guo Yuchao   
	* @date 2014-12-25 下午2:25:23 
	* @param wsPrototypeDTO
	* @return  
	*/ 
	@Export(paramNames = {"prototypeDTO"})
	Object savePrototypeAuditOut(PrototypeDTO prototypeDTO);
}
