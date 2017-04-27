/**
 * @Company 青鸟软通   
 * @Title: AppVersionService.java 
 * @Package  com.haier.isales.app.service
 * @author Cao Rui   
 * @date 2014年12月02日  17:54:50
 * @version V1.0   
 */
package com.haier.isales.app.service;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.app.dto.AppVersionDTO;
import com.haier.isales.app.dto.AppVersionQueryDTO;

/** 
 * @ClassName: AppVersionService
 * @Description: AppVersion的Service接口定义类
 *  
 */
public interface AppVersionService {

	/**
	 * 
	* @Title: findNewestVersion 
	* @Description: 获取最新的应用版本
	* @return  
	* @throws
	 */
	public AppVersionDTO findNewestVersion(AppVersionQueryDTO queryDto);
	
	/**
	 * 
	* @Title: getAppVersionList 
	* @Description: 按分页查询手机app版本更新日志
	* @param pageCond
	* @return  
	* @throws
	 */
	public PageResult<AppVersionDTO> getAppVersionList(PageCond pageCond) ;
	
	/**
	 * 
	* @Title: findVersionInfo 
	* @Description: 获取某个版本的更新内容
	* @return  
	* @throws
	 */
	public AppVersionDTO findVersionInfo(AppVersionQueryDTO queryDto);
}
