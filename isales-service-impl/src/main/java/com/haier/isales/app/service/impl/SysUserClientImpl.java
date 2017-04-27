/**
* @Company 青鸟软通   
* @Title: UserTokenClientImpl.java 
* @Package com.haier.isales.app.service.impl 
* @author lizhenwei
* @date 2015-12-29 下午5:05:45 
* @version V1.0   
*/ 
package com.haier.isales.app.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.app.domain.SysUserDomain;
import com.haier.isales.app.dto.SysUserDTO;
import com.haier.isales.app.service.SysUserClient;
import com.haier.isales.app.service.SysUserCollectService;
import com.haier.isales.app.service.SysUserService;
import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.common.StringUtil;

/** 
 * @ClassName: SysUserClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class SysUserClientImpl implements SysUserClient {
	
	private static Logger logger = Logger.getLogger(SysUserClientImpl.class);
	
	private SysUserService sysUserService;
	private SysUserCollectService sysUserCollectService;
	
	/* 查询用户通讯录信息
	 * @see com.haier.isales.app.service.SysUserClient#findSysUser(com.haier.isales.app.dto.SysUserDTO)
	 */
	@Override
	public PageResult<SysUserDTO> findSysUser(SysUserDTO sysUserDTO, Integer currentPage, Integer pageSize) {
		logger.info("获取用户通讯录方法， sysUserDTO:" + sysUserDTO 
				+ ",currentPage:" + currentPage + ", pageSize:" + pageSize);
		//SysUserDomain domain = ClonePojoUtil.copyClassFromTo(sysUserDTO, SysUserDomain.class);
		
		//如果分页条件为空，则赋默认值，不允许查询数据库的全部结果
		Integer pageNo = currentPage;
		Integer numPerPage = pageSize;
		if(pageNo == null){
			pageNo = 1;
		}
		if(numPerPage == null){
			numPerPage = 10;
		}
		// 判断查询关键字是否null或“”
		if (StringUtil.isEmpty(sysUserDTO.getQuerySearchKey()))	{
			sysUserDTO.setQuerySearchKey(null);
		}	
		PageResult<SysUserDomain> pageResult = sysUserService.ObtainSysUser(sysUserDTO, new PageCond(pageNo, numPerPage));
		
		List<SysUserDTO> dtoList = new ArrayList<SysUserDTO>();
		
		for (SysUserDomain sysUser: pageResult.getResultList()) {
			SysUserDTO dto = ClonePojoUtil.copyClassFromTo(sysUser, SysUserDTO.class);
			dtoList.add(dto);
		}
		logger.info("获取用户通讯录方法结束");
		return new PageResult<SysUserDTO>(dtoList, pageResult.getPageCond());
	}
	
	/* 根据工号获取用户通讯录信息
	 * @see com.haier.isales.app.service.SysUserClient#findUserInfo(java.lang.String)
	 */
	@Override
	public Object findAddrbookInfo(String sysUserCode, String userCode) {
		logger.info("获取用户Token方法");
		SysUserDTO sysUserDTO = sysUserService.ObtainSysUserInfo(sysUserCode, userCode);
		return sysUserDTO;
	}
	
	/* 查询收藏联系人及通过条件查询用户通讯录信息
	 * @see com.haier.isales.app.service.SysUserClient#findCollectAndUserList(com.haier.isales.app.dto.SysUserDTO, java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public Object findCollectAndUserList(SysUserDTO sysUserDTO, SysUserDTO user,
			Integer currentPage, Integer pageSize) {
		//Map<String, Object> collAndUserMap = new HashMap<String, Object>();
		// 查询收藏联系人
		//user.setRefStatus("1");
		List<SysUserDTO> collList = sysUserCollectService.findFavorContacts(user);
		
		//如果分页条件为空，则赋默认值，不允许查询数据库的全部结果
		Integer pageNo = currentPage;
		Integer numPerPage = pageSize;
		
		if(pageNo == null){
			pageNo = 1;
		}
		if(numPerPage == null){
			numPerPage = 10;
		}
		
		// 判断查询关键字是否null或“”
		if (StringUtil.isEmpty(sysUserDTO.getQuerySearchKey()))	{
			sysUserDTO.setQuerySearchKey(null);
		}
		
		// 查询通讯录列表
		
		PageResult<SysUserDomain> pageResult = sysUserService.ObtainSysUser(sysUserDTO, new PageCond(pageNo, numPerPage));
		
		List<SysUserDTO> dtoList = new ArrayList<SysUserDTO>();
		
		SysUserDTO userDTO = new SysUserDTO();
		userDTO.setUserCode(user.getUserCode());
		userDTO.setCollUserList(collList);
		
		dtoList.add(userDTO);
		//dtoList.addAll(collList);
		
		for (SysUserDomain sysUser: pageResult.getResultList()) {
			SysUserDTO dto = ClonePojoUtil.copyClassFromTo(sysUser, SysUserDTO.class);
			dtoList.add(dto);
		}
		
		//collAndUserMap.put("1", collList);// 1为收藏联系人
		//collAndUserMap.put("2", dtoList); // 2为通讯录
		
		return dtoList;
	}

	/**
	 * @param sysUserService the sysUserService to set
	 */
	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}

	/**
	 * @param sysUserCollectService the sysUserCollectService to set
	 */
	public void setSysUserCollectService(SysUserCollectService sysUserCollectService) {
		this.sysUserCollectService = sysUserCollectService;
	}

}
