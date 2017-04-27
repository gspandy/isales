/**
* @Company 青鸟软通   
* @Title: PotentialCustomerClientImpl.java 
* @Package com.haier.isales.customer.impl 
* @author Cao Rui   
* @date 2014-11-12 下午2:16:45 
* @version V1.0   
*/ 
package com.haier.isales.app.service.impl;

import org.apache.log4j.Logger;
import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.app.dto.AppVersionDTO;
import com.haier.isales.app.dto.AppVersionQueryDTO;
import com.haier.isales.app.service.AppVersionClient;
import com.haier.isales.app.service.AppVersionService;

/** 
 * @ClassName: AppVersionClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class AppVersionClientImpl implements AppVersionClient{
	
	private static Logger logger = Logger.getLogger(AppVersionClientImpl.class);
	private AppVersionService appVersionService;
	
	/**
	 * 
	* @Title: findNewestVersion 
	* @Description: 获取最新的应用版本
	* @return  
	* @throws
	 */
	@Override
	public AppVersionDTO findNewestVersion(AppVersionQueryDTO queryDto){
		
		logger.info("获取最新的应用版本的dubbo方法");
		AppVersionDTO dto = appVersionService.findNewestVersion(queryDto);
		return dto;
	}

	/**
	 * 
	* @Title: getAppVersionList 
	* @Description: 按分页查询手机app版本更新日志
	* @param pageCond
	* @return  
	* @throws
	 */
	public PageResult<AppVersionDTO> getAppVersionList(Integer currentPage,Integer pageSize) {
		logger.info("获取应用版本列表的dubbo方法");
		Integer pageNo = currentPage;
		Integer numPerPage = pageSize;
		if(pageNo == null){
			pageNo = 1;
		}
		if(numPerPage == null){
			numPerPage = 10;
		}
		
		PageResult<AppVersionDTO> pageResult = appVersionService.getAppVersionList(new PageCond(pageNo,numPerPage));
		return pageResult;
	}
	
	/**
	 * 
	* @Title: findVersionInfo 
	* @Description: 获取某个版本的更新内容
	* @return  
	* @throws
	 */
	public AppVersionDTO findVersionInfo(AppVersionQueryDTO queryDto){
		logger.info("获取应用版本列表的dubbo方法");
		AppVersionDTO dto = appVersionService.findVersionInfo(queryDto);
		return dto;
	}
	
	
	/*==================getter/setter=================================*/
	
	/**
	 * @Description: 属性 appVersionService 的get方法 
	 * @return appVersionService
	 */
	public AppVersionService getAppVersionService() {
		return appVersionService;
	}

	/**
	 * @Description: 属性 appVersionService 的set方法 
	 * @param appVersionService 
	 */
	public void setAppVersionService(AppVersionService appVersionService) {
		this.appVersionService = appVersionService;
	}

}
