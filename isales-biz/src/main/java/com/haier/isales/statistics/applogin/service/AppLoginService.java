/**
* @Company 青鸟软通   
* @Title: AppLoginService.java 
* @Package com.haier.isales.statistics.applogin.service 
* @author John.zhao   
* @date 2014-12-4 下午4:35:28 
* @version V1.0   
*/ 
package com.haier.isales.statistics.applogin.service;

import java.util.List;

import com.haier.isales.statistics.applogin.domain.AppLoginDomain;

/** 
 * @ClassName: AppLoginService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author John.zhao 
 */
public interface AppLoginService {

	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2014-12-4 下午5:22:02 
	* @param appLoginDomain
	* @return  
	*/ 
	List<AppLoginDomain> getAppLoginByTime(AppLoginDomain appLoginDomain);
	
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2014-12-15 下午7:16:20   
	*/ 
	public void sendAppLoginEmail();

}
