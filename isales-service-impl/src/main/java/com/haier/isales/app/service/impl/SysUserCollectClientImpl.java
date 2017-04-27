/**
* @Company 青鸟软通   
* @Title: UserTokenClientImpl.java 
* @Package com.haier.isales.app.service.impl 
* @author lizhenwei
* @date 2015-12-29 下午5:05:45 
* @version V1.0   
*/ 
package com.haier.isales.app.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.haier.isales.app.dto.SysUserCollectDTO;
import com.haier.isales.app.dto.SysUserDTO;
import com.haier.isales.app.service.SysUserCollectClient;
import com.haier.isales.app.service.SysUserCollectService;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;

/** 
 * @ClassName: SysUserCollectClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class SysUserCollectClientImpl implements SysUserCollectClient {
	
	private static Logger logger = Logger.getLogger(SysUserCollectClientImpl.class);
	
	private SysUserCollectService sysUserCollectService;
	
	/* 通过条件查询用户收藏联系人列表
	 * @see com.haier.isales.app.service.SysUserCollectClient#findFavoritUser(com.haier.isales.app.dto.SysUserDTO)
	 */
	@Override
	public Object findFavoritUser(SysUserDTO sysUserDTO) {
		logger.info("获取收藏联系人列表方法， sysUserDTO:" + sysUserDTO);
		
		sysUserDTO.setRefStatus("1");
		List<SysUserDTO> favoritUserList = sysUserCollectService.findFavorContacts(sysUserDTO);
		return favoritUserList;
	}

	/* 添加收藏联系人
	 * @see com.haier.isales.app.service.SysUserCollectClient#saveFavoritUser(com.haier.isales.app.dto.SysUserCollectDTO)
	 */
	@Override
	public Object saveFavoritUser(SysUserCollectDTO dto) {
		logger.info("保存收藏联系人方法， sysUserDTO:" + dto);
		
		String refStatus = "";
		
		if(dto.getCollectUserCode() == null){
			throw new BusinessException(BusinessExceptionCode.param_error,"收藏联系人为空！");
		}
		// 查询是否存在该收藏联系人
		
		List<SysUserCollectDTO> dtoList = sysUserCollectService.findCollList(dto);
		
		if (dtoList == null || dtoList.isEmpty() || dtoList.get(0) == null) {
			sysUserCollectService.createFavorContacts(dto);
			refStatus = "1";
		} else {
			SysUserCollectDTO userColl = dtoList.get(0);
			// 判断是否收藏
			if (userColl.getRefStatus().equals("1")) {
				dto.setRefStatus("0");
			} else {
				dto.setRefStatus("1");
			}
			sysUserCollectService.updateCollectStatus(dto);
			refStatus = dto.getRefStatus();
		}
		
		return refStatus;
	}

	/* 更新收藏状态
	 * @see com.haier.isales.app.service.SysUserCollectClient#updateFavoritUser(com.haier.isales.app.dto.SysUserCollectDTO)
	 */
	@Override
	public Object updateFavoritUser(SysUserCollectDTO dto) {
		logger.info("保存收藏联系人方法， sysUserDTO:" + dto);
		
		sysUserCollectService.updateCollectStatus(dto);
		return null;
	}

	/**
	 * @param sysUserCollectService the sysUserCollectService to set
	 */
	public void setSysUserCollectService(SysUserCollectService sysUserCollectService) {
		this.sysUserCollectService = sysUserCollectService;
	}

}
