/**
* @Company 青鸟软通   
* @Title: AppInstallService.java 
* @Package com.haier.isales.statistics.appinstall.service 
* @author John.zhao   
* @date 2014-12-4 下午12:46:28 
* @version V1.0   
*/ 
package com.haier.isales.statistics.appinstall.service;

import java.util.List;

import com.haier.isales.statistics.appinstall.domain.AppInstall;

/** 
 * @ClassName: AppInstallService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author John.zhao 
 */
public interface AppInstallService {
	
	/** 
	* @Description: 查询安装并登录过app的用户
	* @author John.zhao   
	* @date 2014-12-4 下午1:06:07 
	* @return  
	*/ 
	public List<AppInstall> searchAllAppInstall();
	
	
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	 * @throws EmailException 
	* @date 2014-12-4 下午1:29:28   
	*/ 
	public void sendAppInstallEmail();

}
