/**
 * @Company 青鸟软通   
 * @Title: SysUserCollectService.java 
 * @Package  com.haier.isales.app.service.impl
 * @author lizhenwei   
 * @date 2016年04月22日  14:33:16
 * @version V1.0   
 */
package com.haier.isales.app.service.impl;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.haier.isales.app.dao.SysUserCollectDAO;
import com.haier.isales.app.dao.SysUserDAO;
import com.haier.isales.app.domain.SysUserCollectDomain;
import com.haier.isales.app.domain.SysUserDomain;
import com.haier.isales.app.dto.SysUserCollectDTO;
import com.haier.isales.app.dto.SysUserDTO;
import com.haier.isales.app.service.SysUserCollectService;
import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.ClonePojoUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: SysUserCollectService
 * @Description: SysUserCollect的Service接口定义类
 *  
 */
public class SysUserCollectServiceImpl implements SysUserCollectService{

	private static final Logger LOG = LoggerFactory.getLogger(SysUserCollectServiceImpl.class);
	
	/** 
	* @Fields sysUserCollectDao : SysUserCollectDao 工具依赖 
	*/
	private SysUserCollectDAO sysUserCollectDao;
	
	private SysUserDAO sysUserDao;
	
	/*===============业务方法=============*/

	/* 更新收藏状态
	 * @see com.haier.isales.app.service.SysUserCollectService#updateCollectStatus(com.haier.isales.app.dto.SysUserCollectDTO)
	 */
	@Override
	public void updateCollectStatus(SysUserCollectDTO dto) {
		
		LOG.info("进入更新收藏状态Service方法, sysUserCollectDTO" + dto);
		
		CheckParamUtil.checkFieldIfNotBlank(dto, "userCode","collectUserCode","refStatus");
		
		SysUserCollectDomain entity = 
				ClonePojoUtil.copyClassFromTo(dto, SysUserCollectDomain.class);
		
		entity.setUpdateTime(new Date());
		
		sysUserCollectDao.updateCollect(entity);
	}


	/* 根据工号查询收藏联系人
	 * @see com.haier.isales.app.service.SysUserCollectService#findFavorContacts(com.haier.isales.app.dto.SysUserDTO)
	 */
	@Override
	public List<SysUserDTO> findFavorContacts(SysUserDTO dto) {
		
		LOG.info("根据工号查询收藏联系人Service方法, SysUserDTO" + dto);
		
		List<SysUserDTO> sysUserList = new ArrayList<SysUserDTO>();
		
		List<SysUserDomain> domainList = sysUserDao.findFavoriteContacts(dto);
		
		for (SysUserDomain domain: domainList) {
			
			SysUserDTO sysUser = ClonePojoUtil.copyClassFromTo(domain, SysUserDTO.class);
			sysUserList.add(sysUser);
		}
		
		return sysUserList;
	}


	/* 添加收藏联系人
	 * @see com.haier.isales.app.service.SysUserCollectService#createFavorContacts(com.haier.isales.app.dto.SysUserCollectDTO)
	 */
	@Override
	public void createFavorContacts(SysUserCollectDTO dto) {
		
		LOG.info("添加收藏联系人Service方法, SysUserCollectDTO" + dto);
		
		CheckParamUtil.checkFieldIfNotBlank(dto, "userCode","collectUserCode");
		
		SysUserCollectDomain entity = ClonePojoUtil.copyClassFromTo(dto, SysUserCollectDomain.class);
		
		sysUserCollectDao.save(entity);
	}
	
	/* 根据工号、收藏工号查询收藏关系
	 * @see com.haier.isales.app.service.SysUserCollectService#findFavorContacts(com.haier.isales.app.dto.SysUserDTO)
	 */
	@Override
	public List<SysUserCollectDTO> findCollList(SysUserCollectDTO dto) {
		
		LOG.info("根据工号、收藏工号查询收藏关系Service方法, SysUserCollectDTO" + dto);
		
		SysUserCollectDomain entity = ClonePojoUtil.copyClassFromTo(dto, SysUserCollectDomain.class);
		
		List<SysUserCollectDomain> domainList = sysUserCollectDao.findUserCollectByParams(entity);
		
		List<SysUserCollectDTO> dtoList = new ArrayList<SysUserCollectDTO>();
		
		for(SysUserCollectDomain domain: domainList) {
			
			SysUserCollectDTO userColl = ClonePojoUtil.copyClassFromTo(domain, SysUserCollectDTO.class);
			dtoList.add(userColl);
		}
		
		return dtoList;
	}
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性sysUserCollectDao 的set方法 
	 */
	public void setSysUserCollectDao(SysUserCollectDAO sysUserCollectDao){
		this.sysUserCollectDao = sysUserCollectDao;
	}

	/**
	 * @param sysUserDao the sysUserDao to set
	 */
	public void setSysUserDao(SysUserDAO sysUserDao) {
		this.sysUserDao = sysUserDao;
	}

}
