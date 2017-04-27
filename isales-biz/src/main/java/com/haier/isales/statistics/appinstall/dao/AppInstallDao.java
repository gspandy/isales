/**
 * @Company 青鸟软通   
 * @Title: AppInstallDao.java 
 * @Package com.haier.isales.statistics.appinstall.dao 
 * @author John.zhao   
 * @date 2014-12-4 下午12:46:03 
 * @version V1.0   
 */
package com.haier.isales.statistics.appinstall.dao;

import java.util.List;

import com.haier.isales.statistics.appinstall.domain.AppInstall;

/**
 * @ClassName: AppInstallDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author John.zhao
 */
public interface AppInstallDao {

	/** 
	* @Description: 查询所有安装并登录过app的用户
	* @author John.zhao   
	* @date 2014-12-4 下午12:57:06 
	* @return  
	*/ 
	List<AppInstall> searchAllAppInstall();

}
