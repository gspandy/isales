/**
 * @Company 青鸟软通   
 * @Title: AppVersionService.java 
 * @Package  com.haier.isales.app.service.impl
 * @author Cao Rui   
 * @date 2014年12月02日  17:54:50
 * @version V1.0   
 */
package com.haier.isales.app.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;

import com.haier.isales.app.AppDomainDtoUtil;
import com.haier.isales.app.dao.AppVersionDAO;
import com.haier.isales.app.domain.AppVersionDomain;
import com.haier.isales.app.dto.AppVersionDTO;
import com.haier.isales.app.dto.AppVersionQueryDTO;
import com.haier.isales.app.service.AppVersionService;
import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;

/** 
 * @ClassName: AppVersionService
 * @Description: AppVersion的Service接口定义类
 *  
 */
public class AppVersionServiceImpl implements AppVersionService{

//	private static final Logger LOG = LoggerFactory.getLogger(AppVersionServiceImpl.class);
	
	/** 
	* @Fields appVersionDao : AppVersionDao 工具依赖 
	*/
	private AppVersionDAO appVersionDao;
	
	
	/*===============业务方法=============*/
	/**
	 * 
	* @Title: findNewestVersion 
	* @Description: 获取最新的应用版本
	* @return  
	* @throws
	 */
	@Override
	public AppVersionDTO findNewestVersion(AppVersionQueryDTO queryDto){
		
		// 校验参数非空
		CheckParamUtil.checkFieldIfNotBlank(queryDto, "appVersion");
		//获取当前最新的版本
		AppVersionDomain queryEntity = new AppVersionDomain();
		queryEntity.setStatus(AppVersionDomain.STATUS_ENABLE);
		AppVersionDomain resultDomain = appVersionDao.findNewestVersion(queryEntity);
		
		/*
		 * 2014-1-8 曹瑞
		 * 增加业务判断，是否需要升级客户端
		*/
		//查询客户端所在的版本
		AppVersionDomain clientVersionQuery = new AppVersionDomain();
		clientVersionQuery.setAppVersion(queryDto.getAppVersion());
		AppVersionDomain clientVersion = appVersionDao.findNewestVersion(clientVersionQuery);
		if(null == clientVersion){
			throw new SystemException(BusinessExceptionCode.database_none_data,
					"未查询到客户端对应的版本信息");
		}
		//查询高于客户端版本的版本信息中，是否有需要升级客户端的
		AppVersionDomain serviceVersionQueryNeedUpdate = new AppVersionDomain();
		serviceVersionQueryNeedUpdate.setStatus("101");
		serviceVersionQueryNeedUpdate.setNeedUpdateClient(true);
		AppVersionDomain serviceVersionNeedUpdate = appVersionDao.findNewestVersion(serviceVersionQueryNeedUpdate);
		if(null != serviceVersionNeedUpdate && (serviceVersionNeedUpdate.getId() > clientVersion.getId())){
			//有需要更新的版本
			resultDomain.setNeedUpdateClient(true);
			resultDomain.setAppDownloadUrl(serviceVersionNeedUpdate.getAppDownloadUrl());
		}
		if((queryDto.getAppVersion().equals(resultDomain.getAppVersion())) || (serviceVersionNeedUpdate.getId() == clientVersion.getId())){
			//当前版本跟服务器最新版本一致 不需要升级
			resultDomain.setNeedUpdateClient(false);
		}
		
		AppVersionDTO dto = new AppVersionDTO();
		if(null != resultDomain){
			dto = AppDomainDtoUtil.cloneAppVersionDomain2DTO(resultDomain);
		}
		return dto;
	}
	//按分页查询手机app版本更新日志
	/**
	 * 
	* @Title: getAppVersionList 
	* @Description: 按分页查询手机app版本更新日志
	* @param pageCond
	* @return  
	* @throws
	 */
	@Override
	public PageResult<AppVersionDTO> getAppVersionList(PageCond pageCond) {
		
		PageCond pageCondQuery = pageCond;
		pageCondQuery = PageCondUtil.check(pageCondQuery);
		pageCondQuery.setFirstResult(PageCondUtil.calculateX(pageCondQuery));//计算分页数据 第一条数据
		
		AppVersionDomain queryDomain = new AppVersionDomain();
		//增加默认条件  有效的
		queryDomain.setStatus(AppVersionDomain.STATUS_ENABLE);
		//获取查询结果列表
		List<AppVersionDomain> list = appVersionDao.findByParams(queryDomain, pageCond);
		//获取该条件下全部结果的条数
		Integer totalCount = appVersionDao.findCountByParams(queryDomain);
		
		pageCondQuery.setTotalCount(totalCount);//总条数
		pageCondQuery.setPageCount(PageCondUtil.calculatePageCount(pageCondQuery));//总页数
		
		List<AppVersionDTO> dtoList = new ArrayList<AppVersionDTO>();
		for(AppVersionDomain domain : list){
			if(null != domain){
				AppVersionDTO dto = AppDomainDtoUtil.cloneAppVersionDomain2DTO(domain);
				dtoList.add(dto);
			}
		}
		
		return new PageResult<AppVersionDTO>(dtoList, pageCondQuery);

	}
	
	//获取某个版本的更新内容
	/**
	 * 
	* @Title: findVersionInfo 
	* @Description: 获取某个版本的更新内容
	* @return  
	* @throws
	 */
	@Override
	public AppVersionDTO findVersionInfo(AppVersionQueryDTO queryDto){
		
		// 校验参数非空
		CheckParamUtil.checkFieldIfNotBlank(queryDto, "appVersion");

		//获取要查询的版本
		AppVersionDomain versionQuery = new AppVersionDomain();
		versionQuery.setAppVersion(queryDto.getAppVersion());
		AppVersionDomain versionDomain = appVersionDao.findNewestVersion(versionQuery);
		if(null == versionDomain){
			throw new SystemException(BusinessExceptionCode.database_none_data,
					"未查询到客户端对应的版本信息");
		}
		
		AppVersionDTO dto = AppDomainDtoUtil.cloneAppVersionDomain2DTO(versionDomain);
		return dto;
	}
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性appVersionDao 的set方法 
	 */
	public void setAppVersionDao(AppVersionDAO appVersionDao){
		this.appVersionDao = appVersionDao;
	}
	
}
