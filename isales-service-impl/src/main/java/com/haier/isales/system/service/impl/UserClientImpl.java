package com.haier.isales.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;
import org.springframework.beans.BeanUtils;

import com.haier.isales.common.DomainDtoUtil;
import com.haier.isales.system.dto.UserBriefInfoDTO;
import com.haier.isales.system.dto.UserDTO;
import com.haier.isales.system.dto.UserSearchDTO;
import com.haier.isales.system.service.UserClient;
import com.haier.isales.system.user.domain.User;
import com.haier.isales.system.user.model.UserSearchModel;
import com.haier.isales.system.user.service.UserService;

public class UserClientImpl implements UserClient{
	private static Logger logger = Logger.getLogger(UserClientImpl.class);
	private UserService userService;
	/*=======================getters and setters====================================*/
	/**
	 * @Description: 属性 userService 的get方法 
	 * @return userService
	 */
	public UserService getUserService() {
		return userService;
	}
	/**
	 * @Description: 属性 userService 的set方法 
	 * @param userService 
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-10-28 下午3:22:15 
	* @param userSearchDTO
	* @return 
	* @see com.haier.isales.system.service.UserClient#getUserByParam(com.haier.isales.system.dto.UserSearchDTO) 
	*/ 
	@Override
	public PageResult<UserDTO> getUserByParam(UserSearchDTO userSearchDTO,Integer currentPage,Integer pageSize) {
		logger.info("传入参数："+userSearchDTO);
		UserSearchModel userSearchModel = DomainDtoUtil.cloneUserSearchDtoToUserSearchModel(userSearchDTO);
		List<UserDTO>  userDtoList = new ArrayList<UserDTO>();
		PageCond pageCond = new PageCond(currentPage,pageSize);
		List<User> userList = userService.getUserByParam(userSearchModel,pageCond);
		Long totalCount = userService.getCountUserByParam(userSearchModel);
		for (User user : userList) {
			UserDTO userManageDTO = DomainDtoUtil.cloneUserToUserDTO(user);
			userDtoList.add(userManageDTO);
		}
		pageCond.setTotalCount(Integer.valueOf(totalCount.toString()));
		PageCondUtil.calculatePageCount(pageCond);
		return new PageResult<UserDTO>(userDtoList,pageCond);
	}
	

	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-11-4 下午6:44:40 
	* @param employeeSn
	* @return 
	* @see com.haier.isales.system.service.UserClient#findGrantInfoByEmpSn(java.lang.String) 
	*/ 
	@Override
	public String findGrantInfoByEmpSn(String employeeSn) {
		String result = userService.findGrantInfoByEmpSn(employeeSn);
		return result;
	}
	/**
	* <p>Description:根据组织等参数查询用户 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-10 下午7:02:33 
	* @param userSearchDTO
	* @return 
	* @see com.haier.isales.system.service.UserClient#findUserByOrgParam(com.haier.isales.system.dto.UserSearchDTO) 
	*/ 
	@Override
	public List<UserDTO> findUserByOrgParam(UserSearchDTO userSearchDTO) {
		logger.info("传入参数："+userSearchDTO);
		UserSearchModel userSearchModel = DomainDtoUtil.cloneUserSearchDtoToUserSearchModel(userSearchDTO);
		List<UserDTO>  userDtoList = new ArrayList<UserDTO>();
		List<User> userList = null;
		if(UserSearchDTO.USER_SEARCH_DTO_ORG_TYPE_VIRTUAL.equalsIgnoreCase(userSearchDTO.getOrgType().trim())){
			//查询虚拟组织
			userList = userService.findUserByVirtualOrgParam(userSearchModel);
		}else{//默认没写查实体组织   或者传值查实体组织
			userList = userService.findUserByOrgParam(userSearchModel);
		}
		for (User user : userList) {				
			UserDTO userManageDTO = DomainDtoUtil.cloneUserToUserDTO(user);
			userDtoList.add(userManageDTO);
		}
		return userDtoList;	
	}
	/**
	* <p>Description: 根据组织等参数查询用户</p> 
	* @author Guo Yuchao   
	* @date 2014-11-11 下午10:42:30 
	* @param userSearchDTO
	* @return 
	* @see com.haier.isales.system.service.UserClient#findUserByLabelParam(com.haier.isales.system.dto.UserSearchDTO) 
	*/ 
	@Override
	public List<UserDTO> findUserByLabelParam(UserSearchDTO userSearchDTO) {
		UserSearchModel userSearchModel = DomainDtoUtil.cloneUserSearchDtoToUserSearchModel(userSearchDTO);
		List<User> userList = userService.findUserByLabelParam(userSearchModel);
		List<UserDTO> userDTOList = new ArrayList<UserDTO>(); 
		for (User user : userList) {
			UserDTO userManageDTO = DomainDtoUtil.cloneUserToUserDTO(user);
			userDTOList.add(userManageDTO);
		}
		return userDTOList;
	}
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-11-12 下午8:45:17 
	* @param operatorId
	* @return 
	* @see com.haier.isales.system.service.UserClient#findUserByOrgParam(java.lang.Long) 
	*/ 
	@Override
	public UserDTO findUserByOperatorId(Long operatorId) {
		User user = userService.findById(operatorId);
		UserDTO userDTO = DomainDtoUtil.cloneUserToUserDTO(user);
		return userDTO;
	}
	/**
	* <p>Description: 查询同一门店下所有员工</p> 
	* @author Shao Jingkai   
	* @date 2015-6-29 上午11:27:29 
	* @param shopId
	* @return 
	* @see com.haier.isales.system.service.UserClient#findUsersInSameShop(java.lang.String) 
	*/ 
	@Override
	public Object findUsersInSameShop(String shopId) {
		List<User> domainList = userService.findUsersInSameShop(shopId);
		List<UserBriefInfoDTO> dtoList = new ArrayList<UserBriefInfoDTO>();
		for (User domain : domainList) {
			UserBriefInfoDTO dto = new UserBriefInfoDTO();
			BeanUtils.copyProperties(domain, dto);
			dtoList.add(dto);
		}
		return dtoList;
	}
}
