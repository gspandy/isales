/**
* @Company 青鸟软通   
* @Title: UserDetailClient.java 
* @Package com.haier.isales.salerinfo.userdetail.service 
* @author Guo Yuchao   
* @date 2014-11-21 下午9:35:41 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.userdetail.service;

import com.haier.isales.salerinfo.userdetail.dto.UserDetailSearchDTO;

import io.terminus.pampas.client.Export;


/** 
 * @ClassName: UserDetailUpdateClient 
 * @Description: 个人信息对外发布接口 
 *  
 */
public interface UserDetailUpdateClient {


	/** 
	* @Description: 更新个人信息
	* @author John.zhao   
	* @date 2014-11-22 下午3:13:21 
	* @param userDetailSearchDTO
	* @return  
	*/ 
	@Export(paramNames = {"userDetailSearchDTO"})
	public Object updateUserDetail(UserDetailSearchDTO userDetailSearchDTO);

}
