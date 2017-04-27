/**
 * @Company 青鸟软通   
 * @Title: AttachmentServiceClient.java 
 * @Package com.haier.isales.attachment.service 
 * @author John Zhao   
 * @date 2014-11-14 下午1:20:32 
 * @version V1.0   
 */
package com.haier.isales.app.service;

import com.haier.isales.app.dto.AppVersionQueryDTO;

/**
 * @ClassName: AppVersionClient
 * @Description: app版本管理接口
 * 
 */
public interface AppVersionClient {

	/**
	 * 
	* @Title: findNewestVersion 
	* @Description: 获取最新的应用版本
	* @return  
	* @throws
	 */
	public Object findNewestVersion(AppVersionQueryDTO queryDto);

	/**
	 * 
	* @Title: getAppVersionList 
	* @Description: 按分页查询手机app版本更新日志
	* @param pageCond
	* @return  
	* @throws
	 */
	public Object getAppVersionList(Integer currentPage,Integer pageSize) ;
	
	/**
	 * 
	* @Title: findVersionInfo 
	* @Description: 获取某个版本的更新内容
	* @return  
	* @throws
	 */
	public Object findVersionInfo(AppVersionQueryDTO queryDto);
}
