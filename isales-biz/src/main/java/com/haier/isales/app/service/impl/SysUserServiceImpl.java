/**
 * @Company 青鸟软通   
 * @Title: SysUserService.java 
 * @Package  com.haier.isales.app.service.impl
 * @author lizhenwei   
 * @date 2016年03月24日  19:26:10
 * @version V1.0   
 */
package com.haier.isales.app.service.impl;


import java.util.ArrayList;
import java.util.List;

import com.haier.ihaier.util.GetUserinfo;
import com.haier.isales.app.dao.SysUserCollectDAO;
import com.haier.isales.app.dao.SysUserDAO;
import com.haier.isales.app.domain.SysUserCollectDomain;
import com.haier.isales.app.domain.SysUserDomain;
import com.haier.isales.app.dto.SysUserDTO;
import com.haier.isales.app.service.SysUserService;
import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.common.StringUtil;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: SysUserService
 * @Description: SysUser的Service接口定义类
 *  
 */
public class SysUserServiceImpl implements SysUserService{

	private static final Logger LOG = LoggerFactory.getLogger(SysUserServiceImpl.class);
	
	/** 
	* @Fields sysUserDao : SysUserDao 工具依赖 
	*/
	private SysUserDAO sysUserDao;
	
	private SysUserCollectDAO sysUserCollectDao;
	
	/*===============业务方法=============*/

	/* (non-Javadoc)
	 * @see com.haier.isales.app.service.SysUserService#findSysUser(com.haier.isales.app.dto.SysUserDTO)
	 */
	@Override
	public PageResult<SysUserDomain> ObtainSysUser(SysUserDTO queryParams, PageCond pageCond) {
		LOG.info("进入获取用户通讯录方法， queryParams = " + queryParams +", pageCond = " + pageCond);
		
		PageCond pageCondQuery = pageCond;
		pageCondQuery = PageCondUtil.check(pageCondQuery);
		pageCondQuery.setFirstResult(PageCondUtil.calculateX(pageCondQuery));//计算分页数据 第一条数据
		
		List<SysUserDomain> sysUserList = new ArrayList<SysUserDomain>();
		List<SysUserDomain> domainList = sysUserDao.findSysUser(queryParams, pageCond);
		
		for(SysUserDomain domain: domainList) {
			if (domain.getNameLetter() == null) {
				domain.setNameLetter("#");
			}
			// 因频繁访问造成iHaier连接中断，故将其注释掉
			// 获取头像url，并更新相应记录 added by lizhenwei
			/*GetUserinfo getUserinfo = new GetUserinfo();
			String userCode = domain.getUserCode();
			String photoUrl = getUserinfo.getPhotoUrl(userCode);
			
			// 如果头像url为空或与接口返回不一致，则更新表记录
			if (!photoUrl.equals("") && photoUrl != null) {
				if (domain.getPhotoUrl() == null 
						|| !domain.getPhotoUrl().equals(photoUrl)) {
					domain.setPhotoUrl(photoUrl);
					sysUserDao.updatePhotoUrl(domain);
				}
			}
			
			domain.setPhotoUrl(photoUrl);*/
			
			//SysUserDTO dto = ClonePojoUtil.copyClassFromTo(domain, SysUserDTO.class);
			sysUserList.add(domain);
		}
		
		//获取该条件下全部结果的条数
		Integer totalCount = sysUserDao.getSysUserCount(queryParams);
		
		pageCondQuery.setTotalCount(totalCount);//总条数
		pageCondQuery.setPageCount(PageCondUtil.calculatePageCount(pageCondQuery));//总页数
		
		LOG.info("查询系统中待办信息列表   service方法执行完成");
		return new PageResult<SysUserDomain>(sysUserList, pageCondQuery);
		
	}
	
	/* 获取用户通讯录信息  添加登陆系统的工号
	 * @see com.haier.isales.app.service.SysUserService#findSysUserInfo(String userCode)
	 */
	@Override
	public SysUserDTO ObtainSysUserInfo(String sysUserCode, String userCode) {
		LOG.info("进入获取用户 通讯录方法， userCode = " + userCode);
		
		SysUserDomain entity = new SysUserDomain();
		
		entity.setUserCode(userCode);
		
		SysUserDomain domain = sysUserDao.findSysUserInfo(entity);
		// 根据userOU截取字符串获取用户部门userDept
		if (!StringUtil.isEmpty(domain.getUserOU())) {
			String [] userOUs = domain.getUserOU().split("/");
			if (userOUs.length > 0) {
				String lastUserOU = userOUs[userOUs.length-1];
				if (!StringUtil.isEmpty(lastUserOU)) {
					domain.setUserDept(lastUserOU);
				} else {
					if (userOUs.length >= 2) {
						
						String lastTwoUserOU = userOUs[userOUs.length-2];
						domain.setUserDept(lastTwoUserOU);
					}
				}
			}
			
			
		}
		
		// 获取头像url，并更新相应记录 added by lizhenwei
		GetUserinfo getUserinfo = new GetUserinfo();
		String photoUrl = getUserinfo.getPhotoUrl(userCode);
		
		// 如果头像url为空或与接口返回不一致，则更新表记录
		if (!photoUrl.equals("") && photoUrl != null) {
			if (domain.getPhotoUrl() == null 
					|| !domain.getPhotoUrl().equals(photoUrl)) {
				domain.setPhotoUrl(photoUrl);
				sysUserDao.updatePhotoUrl(domain);
			}
		}
		
		domain.setPhotoUrl(photoUrl);
		
		// 查询传入工号是否为登陆工号的收藏联系人
		SysUserCollectDomain userColl = new SysUserCollectDomain();
		userColl.setUserCode(sysUserCode);
		userColl.setCollectUserCode(userCode);
		
		List<SysUserCollectDomain> userCollList = sysUserCollectDao.findUserCollectByParams(userColl);
		if (userCollList == null || userCollList.isEmpty()
				|| userCollList.get(0) == null) {
			domain.setRefStatus("0"); // 不属于收藏联系人
		} else {
			SysUserCollectDomain userCollDomain = userCollList.get(0);
			domain.setRefStatus(userCollDomain.getRefStatus());
		}
		
		SysUserDTO dto = ClonePojoUtil.copyClassFromTo(domain, SysUserDTO.class);
		
		LOG.info("获取用户 通讯录方法执行完成!");
		
		return dto;
	}
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性sysUserDao 的set方法 
	 */
	public void setSysUserDao(SysUserDAO sysUserDao){
		this.sysUserDao = sysUserDao;
	}

	/**
	 * @param sysUserCollectDao the sysUserCollectDao to set
	 */
	public void setSysUserCollectDao(SysUserCollectDAO sysUserCollectDao) {
		this.sysUserCollectDao = sysUserCollectDao;
	}
	
}
