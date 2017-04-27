/**
 * @Company 青鸟软通   
 * @Title: UserserviceImpl.java 
 * @Package com.haier.isales.system.user.service.impl 
 * @author Guo Yuchao   
 * @date 2014-10-28 上午10:44:42 
 * @version V1.0   
 */
package com.haier.isales.system.user.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;

import com.haier.isales.common.StringUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.system.account.domain.AccountConstants.UserGrantStatusEnum;
import com.haier.isales.system.account.domain.AccountConstants.UserTypeEnum;
import com.haier.isales.system.dto.LabelDTO;
import com.haier.isales.system.dto.LabelGroupDTO;
import com.haier.isales.system.label.dao.LabelDAO;
import com.haier.isales.system.label.domain.LabelDomain;
import com.haier.isales.system.label.service.LabelService;
import com.haier.isales.system.organization.dao.OrganizationDAO;
import com.haier.isales.system.organization.dao.VirtualOrgDAO;
import com.haier.isales.system.organization.domain.OrganizationDomain;
import com.haier.isales.system.organization.domain.VirtualOrgDomain;
import com.haier.isales.system.user.dao.UserDao;
import com.haier.isales.system.user.domain.User;
import com.haier.isales.system.user.model.UserGroupModule;
import com.haier.isales.system.user.model.UserGroupModule.UserGroupType;
import com.haier.isales.system.user.model.UserSearchModel;
import com.haier.isales.system.user.service.UserService;

/**
 * @ClassName: UserserviceImpl
 * @Description: 用户管理业务实现
 * 
 */
public class UserServiceImpl implements UserService {
	private static Logger logger = Logger.getLogger(UserServiceImpl.class);
	private UserDao userDao;
	private OrganizationDAO organizationDao;
	private VirtualOrgDAO virtualOrgDao;
	private LabelService labelService;
	private LabelDAO labelDao;


	/**
	 * <p>
	 * Description: 根据参数返回用户信息
	 * </p>
	 * 
	 * @author Guo Yuchao
	 * @date 2014-10-28 上午10:47:27
	 * @param userSearchModel
	 * @return
	 * @see com.haier.isales.system.user.service.UserService#getUserByParam(com.haier.isales.system.model.UserSearchModel)
	 */
	@Override
	public List<User> getUserByParam(UserSearchModel userSearchModel,PageCond pageCond) {
//		List<User> userList = getUserDao().getUserByParam(userSearchModel);
//		PageCond pageCond = new PageCond(1,Integer.MAX_VALUE);
		PageCondUtil.calculateX(pageCond);
		List<User> userList = userDao.getUserByParam(userSearchModel,pageCond);
		return userList;

	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author Guo Yuchao
	 * @date 2014-10-29 下午8:00:53
	 * @param userSearchModel
	 * @return
	 * @see com.haier.isales.system.user.service.UserService#getCountUserByParam(com.haier.isales.system.user.model.UserSearchModel)
	 */
	@Override
	public Long getCountUserByParam(UserSearchModel userSearchModel) {
		Long totalCount = userDao.getCountUserByParam(userSearchModel);
		return totalCount;
	}

	/**
	 * <p>
	 * Description: 给用户授权，并返回授权结果
	 * </p>
	 * 
	 * @author Guo Yuchao
	 * @date 2014-10-30 下午7:54:55
	 * @param userSearchModel
	 * @return
	 * @see com.haier.isales.system.user.service.UserService#saveUserAuditStatus(com.haier.isales.system.user.model.UserSearchModel)
	 */
	@Override
	public String saveUserAuditStatus(UserSearchModel userSearchModel) {
		StringBuffer auditResult = new StringBuffer();
//		List<User> userList = userDao.getUserByParam(userSearchModel);
		PageCond pageCond = new PageCond(1,Integer.MAX_VALUE);
		PageCondUtil.calculateX(pageCond);
		List<User> userList = userDao.getUserByParam(userSearchModel,pageCond);
		if (userList == null || userList.isEmpty()) {
			auditResult.append(" 用户未找到 ");
		} else {
			for (User user : userList) {
					if (!UserTypeEnum.APP用户.getValue().equals(user.getUserType())) {
					//用户的类型不是可登陆到app的类型，择不能授权
					auditResult.append("账号为").append(user.getLoginName()).append("的账户类型禁止授予APP登录权限！ ");
				} else {
					if(UserGrantStatusEnum.已授权.getValue().equals(user.getAuditStatus())){
						//用户已有权限
						auditResult.append("账号为").append(user.getLoginName()).append("的用户已经拥有APP登录权限！ ");
					}else{
						user.setAuditStatus(UserGrantStatusEnum.已授权.getValue());
						userDao.update(user);
						auditResult.append("工号为：").append(user.getLoginName()).append("的APP登录权限添加成功！ ");
					}
				}
			}
		}
		return auditResult.toString();
	}

	/**
	* <p>Description:  收回用户登录app权限</p> 
	* @author Guo Yuchao   
	* @date 2014-11-3 下午7:51:09 
	* @param userSearchModel
	* @return 
	* @see com.haier.isales.system.user.service.UserService#saveUserDisauditStatus(com.haier.isales.system.user.model.UserSearchModel) 
	*/ 
	@Override
	public String saveUserDisauditStatus(UserSearchModel userSearchModel) {
		StringBuffer message = new StringBuffer();
		
		if(userSearchModel == null){
			return "查询用户的参数为空";
		}
//		List<User> userList = userDao.getUserByParam(userSearchModel);
		PageCond pageCond = new PageCond(1,Integer.MAX_VALUE);
		PageCondUtil.calculateX(pageCond);
		List<User> userList = userDao.getUserByParam(userSearchModel,pageCond);
		 if(userList == null ||userList.isEmpty()){
			 return message.append("编号为：").append(userSearchModel.getOperatorId()).append("的用户没有找到").toString();
		 }
		 for (User user : userList) {
			 if(user == null){
				 message.append("编号为：").append(userSearchModel.getOperatorId()).append("的用户没有找到");
					continue;
				}
				if(user.getOperatorId()== null || UserGrantStatusEnum.无权限.getValue().equals(user.getAuditStatus())){
					message.append("编号为：").append(user.getOperatorId()).append("的用户没有权限，不能执行收回操作！");
				}else{
					user.setAuditStatus(UserGrantStatusEnum.无权限.getValue());
					 //收回用户登录app权限
					userDao.update(user);
					message.append("已收回工号为：").append(user.getLoginName()).append("的用户的APP登录权限！ ");
				}
		}
		return message.toString();
	}

	/**
	* <p>Description: 根据员工号返回是否有权限登录 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-4 下午4:18:42 
	* @param employeeSn
	* @return 
	* @see com.haier.isales.system.user.service.UserService#findGrantInfoByEmpSn(java.lang.String) 
	*/ 
	@Override
	public String findGrantInfoByEmpSn(String employeeSn) {
		if(StringUtil.isEmpty(employeeSn)){
			return UserGrantStatusEnum.无权限.getValue();
		}
		UserSearchModel userSearchModel = new UserSearchModel();
		userSearchModel.setLoginName(employeeSn.trim());
		try {
			PageCond pageCond = new PageCond(1,Integer.MAX_VALUE);
			PageCondUtil.calculateX(pageCond);
			List<User> userList = userDao.getUserByParam(userSearchModel,pageCond);
			if(userList == null || userList.isEmpty()){
				return UserGrantStatusEnum.无权限.getValue();
			}
			for (User user : userList) {
				if(user == null || UserGrantStatusEnum.无权限.getValue().equals(user.getAuditStatus())){
					return UserGrantStatusEnum.无权限.getValue();
				}else{
					return UserGrantStatusEnum.已授权.getValue();
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			return  "";
		}
		return UserGrantStatusEnum.已授权.getValue();
	}

	/**
	* <p>Description: 根据组织编号查询组织及下属组织所有用户</p> 
	* @author Guo Yuchao   
	* @date 2014-11-10 下午3:35:24 
	* @param userSearchModel
	* @return 
	 * @throws BusinessException 
	* @see com.haier.isales.system.user.service.UserService#findUserByOrgParam(com.haier.isales.system.user.model.UserSearchModel) 
	*/ 
	@Override
	public List<User> findUserByOrgParam(UserSearchModel userSearchModel) throws BusinessException {
		if(userSearchModel == null ){
			throw new BusinessException(BusinessExceptionCode.param_error,"获取查询参数为空");
		}
		if(StringUtil.isEmpty(userSearchModel.getOrgCode())){
			throw new BusinessException(BusinessExceptionCode.param_error,"获取查询参数组织编号为空");
		}
		
		OrganizationDomain org =  organizationDao.findById(userSearchModel.getOrgCode().trim());
		if (org == null) {
			throw new BusinessException(BusinessExceptionCode.database_none_data,"没有找到指定的组织");
		}	
		userSearchModel.setOrgSeq(org.getOrgSeq().trim());
		List<User> userList = userDao.findUserByOrgParam(userSearchModel);
		return userList;
	}
	/**
	* <p>Description: 根据组织编号查询组织及下属组织所有用户</p> 
	* @author Guo Yuchao   
	* @date 2014-11-10 下午3:35:24 
	* @param userSearchModel
	* @return 
	 * @throws BusinessException 
	* @see com.haier.isales.system.user.service.UserService#findUserByOrgParam(com.haier.isales.system.user.model.UserSearchModel) 
	*/ 
	@Override
	public List<User> findUserByVirtualOrgParam(UserSearchModel userSearchModel) throws BusinessException {
		if(userSearchModel == null ){
			throw new BusinessException(BusinessExceptionCode.param_error,"获取查询参数为空");
		}
		if(StringUtil.isEmpty(userSearchModel.getOrgCode())){
			throw new BusinessException(BusinessExceptionCode.param_error,"获取查询参数组织编号为空");
		}
		
		VirtualOrgDomain org =  virtualOrgDao.findById(userSearchModel.getOrgCode().trim());
		if (org == null) {
			throw new BusinessException(BusinessExceptionCode.database_none_data,"没有找到指定的组织");
		}	
		userSearchModel.setOrgSeq(org.getOrgSeq().trim());
		List<User> userList = userDao. findUserByVirtualOrgParam(userSearchModel);
		return userList;
	}

	/**
	* <p>Description:根据标签组参数查找标签 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-11 下午5:14:13 
	* @param userSearchModel
	* @return
	* @throws BusinessException 
	* @see com.haier.isales.system.user.service.UserService#findUserByLabelParam(com.haier.isales.system.user.model.UserSearchModel) 
	*/ 
	@Override
	public List<User> findUserByLabelParam(UserSearchModel userSearchModel){
		//判断参数
		if(userSearchModel == null){
			throw new BusinessException(BusinessExceptionCode.param_error,"获取查询参数为空");
		}
		//1、根据标签组ids查标签
		// 1.1 include
		List<LabelDomain> inLabelTotalList = new ArrayList<LabelDomain>();//所有的include标签没有按seq查的 上层label
		if(!StringUtils.isBlank(userSearchModel.getIncludeLGroupIds())){
			LabelGroupDTO inLabelGroupDTO = new LabelGroupDTO();
			inLabelGroupDTO.setGroupIds(userSearchModel.getIncludeLGroupIds());
			inLabelTotalList = labelService.getLabelListByLabelGroup(inLabelGroupDTO);
		}
		// 1.2 exclude
		List<LabelDomain> exLabelTotalList = new ArrayList<LabelDomain>();//所有的include标签没有按seq查的 上层label
		if(!StringUtils.isBlank(userSearchModel.getExcludeLabelGroupIds())){
			LabelGroupDTO exLabelGroupDTO = new LabelGroupDTO();
			exLabelGroupDTO.setGroupIds(userSearchModel.getExcludeLabelGroupIds());
			exLabelTotalList = labelService.getLabelListByLabelGroup(exLabelGroupDTO);
		}
		
		//2、根据标签ids查标签 并与1、结果集合并 
		// 2.1 include
		if(!StringUtils.isBlank(userSearchModel.getIncludeLabelIds())){
			LabelDTO labelDTO = new LabelDTO();//查询按传入labelIds时参数
			labelDTO.setLabelIds(userSearchModel.getIncludeLabelIds());
			List<LabelDomain> inLabelList = labelService.getLabelListByLabelIds(labelDTO);
			if(inLabelList != null && !inLabelList.isEmpty()){
				inLabelTotalList.addAll(inLabelList);
			}
		}
		//2.2 exclude
		if(!StringUtils.isBlank(userSearchModel.getExcludeLabelIds())){
			LabelDTO labelDTO = new LabelDTO();//查询按传入labelIds时参数
			labelDTO.setLabelIds(userSearchModel.getExcludeLabelIds());
			List<LabelDomain> exLabelList = labelService.getLabelListByLabelIds(labelDTO);
			if(exLabelList != null && !exLabelList.isEmpty()){
				exLabelTotalList.addAll(exLabelList);
			}
		}
		//3、根据2、的结果集中找到标签seq  并查找所有子标签
		//3.1 includeList
		List<LabelDomain> includeLabelList = new ArrayList<LabelDomain>();
		if(!inLabelTotalList.isEmpty()){
			for (LabelDomain labelInclude : inLabelTotalList) {
				LabelDomain labelIn  = new LabelDomain();
				labelIn.setLabelSeq(labelInclude.getLabelSeq());// 暂时只按seq查			
				PageResult<LabelDomain> pageResult =  labelService.findByParams(labelIn, new PageCond(1,Integer.MAX_VALUE));
				if(pageResult!= null && pageResult.getResultList()!= null && !pageResult.getResultList().isEmpty()){
					includeLabelList.addAll(pageResult.getResultList());
				}
			}
		}
		//3.2 excludeList
		List<LabelDomain> excludeLabelList = new ArrayList<LabelDomain>();
		if(!exLabelTotalList.isEmpty()){
			for (LabelDomain labelExclude : exLabelTotalList) {
				LabelDomain labelEx  = new LabelDomain();
				labelEx.setLabelSeq(labelExclude.getLabelSeq());// 暂时只按seq查			
				PageResult<LabelDomain> pageResult =  labelService.findByParams(labelEx, new PageCond(1,Integer.MAX_VALUE));
				if(pageResult!= null && pageResult.getResultList()!= null && !pageResult.getResultList().isEmpty()){
					excludeLabelList.addAll(pageResult.getResultList());
				}
			}
		}
		//4、根据所有子标签查用户
		List<User> userList = userDao.getUserByLabel(includeLabelList,excludeLabelList);
		return userList;
	}
	/**
	* <p>Description:根据用户id查询用户 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-12 下午8:53:50 
	* @param operatorId
	* @return 
	* @see com.haier.isales.system.user.service.UserService#findById(java.lang.Long) 
	*/ 
	@Override
	public User findById(Long operatorId) {
		if(operatorId == null ){
			throw new BusinessException(BusinessExceptionCode.param_error,"参数用户id为空");
		}
		return userDao.findById(operatorId);
	}
	

	/**
	* <p>Description: 按照用户组去查询用户集合，用户组参数可以支持实体组织、虚拟主、标签组和标签，
	* 	实体组织、和虚拟组织是不会递归查询下级组织对应的用户，
	*   而便签组会去查询他包含的标签中的实体
	*   而标签会查询对应的下级标签关联的所有人
	* </p> 
	* @author Liu Wenjie   
	* @date 2014-11-15 下午2:43:39 
	* @param includeList
	* @param excludeList
	* @return 
	* @see com.haier.isales.system.user.service.UserService#finduserByOrgOrLabelParam(java.util.List, java.util.List) 
	*/ 
	@Override
	public Set<User> finduserByOrgOrLabelParam(List<UserGroupModule> includeList,List<UserGroupModule> excludeList) {
		if(includeList == null || includeList.isEmpty()){
			return new HashSet<User>();
		}
		Set<User> userSet = new HashSet<User>();
		//将usergroup进行分类
		//查询实体组织对应的员工信息
		List<String> includeGroupList = UserGroupModule.getUserGroupByType(includeList, UserGroupType.实体组织);
		List<String> excludeGroupList = UserGroupModule.getUserGroupByType(excludeList, UserGroupType.实体组织);
		if(includeGroupList != null && !includeGroupList.isEmpty()){
			userSet.addAll(userDao.findUserByOrgParamList(includeGroupList,excludeGroupList));
		}
		//查询虚拟组织对应的员工信息
		includeGroupList = UserGroupModule.getUserGroupByType(includeList, UserGroupType.虚拟组织);
		excludeGroupList = UserGroupModule.getUserGroupByType(excludeList, UserGroupType.虚拟组织);
		if(includeGroupList != null && !includeGroupList.isEmpty()){
			userSet.addAll(userDao.findUserByVirtualOrgParamList(includeGroupList,excludeGroupList));
		}
		
		//查询标签组
		includeGroupList = UserGroupModule.getUserGroupByType(includeList, UserGroupType.标签组);
		excludeGroupList = UserGroupModule.getUserGroupByType(excludeList, UserGroupType.标签组);
		List<LabelDomain> includeLabelList = new ArrayList<LabelDomain>();
		if(includeGroupList != null && !includeGroupList.isEmpty()){
			includeLabelList = labelDao.findByGroupList(includeGroupList);
		}
		List<LabelDomain> excludeLabelList = new ArrayList<LabelDomain>();
		if(excludeGroupList != null && !excludeGroupList.isEmpty()){
			excludeLabelList = labelDao.findByGroupList(excludeGroupList);
		}
		
		//按照标签查询对应的标签组方法
		includeGroupList = UserGroupModule.getUserGroupByType(includeList, UserGroupType.标签);
		excludeGroupList = UserGroupModule.getUserGroupByType(excludeList, UserGroupType.标签);
		if(includeGroupList == null){
			includeGroupList = new ArrayList<String>();
		}
		if(includeLabelList != null){
			for (LabelDomain labelDomain : includeLabelList) {
				includeGroupList.add(String.valueOf(labelDomain.getLabelId()));
			}
		}
		if(excludeGroupList == null){
			excludeGroupList = new ArrayList<String>();
		}
		if(excludeLabelList != null){
			for (LabelDomain labelDomain : excludeLabelList) {
				includeGroupList.add(String.valueOf(labelDomain.getLabelId()));
			}
		}
		if(includeLabelList != null && !includeLabelList.isEmpty()){
			List<User> userList = userDao.getUserByLabelIds(includeGroupList,excludeGroupList);
			userSet.addAll(userList);
		}
		
		return userSet;
	}
	/**
	* <p>Description: 查询同一门店下所有员工</p> 
	* @author Shao Jingkai   
	* @date 2015-6-29 上午10:48:14 
	* @param shopId
	* @return 
	* @see com.haier.isales.system.user.service.UserService#findUsersInSameShop(java.lang.String) 
	*/ 
	@Override
	public List<User> findUsersInSameShop(String shopId) {
		if (shopId == null) {
			throw new BusinessException(BusinessExceptionCode.param_error,"查询参数为空");
		}
		List<User> list = userDao.getUsersInSameShop(shopId);
		return list;
	}

	

	/*================getters and setters ======================*/
	
	/**
	 * @Description: 属性 userDao 的set方法
	 * @param userDao
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	/**
	 * @Description: 属性 logger 的set方法 
	 * @param logger 
	 */
	public static void setLogger(Logger logger) {
		UserServiceImpl.logger = logger;
	}

	/**
	 * @Description: 属性 labelDao 的set方法 
	 * @param labelDao 
	 */
	public void setLabelDao(LabelDAO labelDao) {
		this.labelDao = labelDao;
	}

	/**
	 * @Description: 属性 labelService 的set方法 
	 * @param labelService 
	 */
	public void setLabelService(LabelService labelService) {
		this.labelService = labelService;
	}
	
	/**
	 * @Description: 属性 organizationDao 的set方法 
	 * @param organizationDao 
	 */
	public void setOrganizationDao(OrganizationDAO organizationDao) {
		this.organizationDao = organizationDao;
	}
	
	/**
	 * @Description: 属性 virtualOrgDao 的set方法 
	 * @param virtualOrgDao 
	 */
	public void setVirtualOrgDao(VirtualOrgDAO virtualOrgDao) {
		this.virtualOrgDao = virtualOrgDao;
	}


}
