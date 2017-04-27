/**
* @Company 青鸟软通   
* @Title: AppLoginDao.java 
* @Package com.haier.isales.statistics.applogin 
* @author John.zhao   
* @date 2014-12-4 下午4:33:11 
* @version V1.0   
*/ 
package com.haier.isales.statistics.applogin.dao;

import java.util.List;

import com.haier.isales.statistics.applogin.domain.AppLoginDomain;

/** 
 * @ClassName: AppLoginDao 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author John.zhao 
 */
public interface AppLoginDao {
	
	List<AppLoginDomain> getAppLoginByTime(AppLoginDomain appLoginDomain);

}
