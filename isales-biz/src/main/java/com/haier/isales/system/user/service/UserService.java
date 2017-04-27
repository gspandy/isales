/**
* @Company 青鸟软通   
* @Title: UserService.java 
* @Package com.haier.isales.system.user.service 
* @author Guo Yuchao   
* @date 2014-10-28 上午10:43:53 
* @version V1.0   
*/ 
package com.haier.isales.system.user.service;

import java.util.List;
import java.util.Set;

import org.bana.common.util.page.PageCond;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.system.user.domain.User;
import com.haier.isales.system.user.model.UserGroupModule;
import com.haier.isales.system.user.model.UserSearchModel;

/** 
 * @ClassName: UserService 
 * @Description: 用户管理业务
 *  
 */
public interface UserService {
	/** 
	* @Description:  根据参数返回用户信息
	* @author Guo Yuchao   
	* @date 2014-10-28 上午10:46:57 
	* @param userSearchModel
	* @return  
	*/ 
	List<User> getUserByParam(UserSearchModel userSearchModel,PageCond pageCond);
	

	/** 
	* @Description: 根据参数返回用户信息total
	* @author Guo Yuchao   
	* @date 2014-10-29 下午7:59:57 
	* @param userSearchModel
	* @return  
	*/ 
	Long getCountUserByParam(UserSearchModel userSearchModel);
	
	/** 
	* @Description: 给用户授权，并返回授权结果
	* @author Guo Yuchao   
	* @date 2014-10-30 下午7:54:04 
	* @param userSearchModel
	* @return  
	*/ 
	String saveUserAuditStatus(UserSearchModel userSearchModel);


	/** 
	* @Description: 收回用户登录app权限
	* @author Guo Yuchao   
	* @date 2014-11-3 下午7:50:01 
	* @param userSearchModel
	* @return  
	*/ 
	String saveUserDisauditStatus(UserSearchModel userSearchModel);
	
	/** 
	* @Description:  根据员工号返回是否有权限登录
	* @author Guo Yuchao   
	* @date 2014-11-4 下午4:17:36 
	* @param employeeSn
	* @return  
	*/ 
	String findGrantInfoByEmpSn(String employeeSn);
	
	/** 
	* @Description: 根据组织编号查询组织及下属组织所有用户
	* @author Guo Yuchao   
	* @date 2014-11-10 下午3:26:08 
	* @param userSearchModel
	* @return  
	*/ 
	List<User> findUserByOrgParam(UserSearchModel userSearchModel) throws BusinessException;
	/** 
	* @Description:  根据虚拟组织编号查询组织及下属组织所有用户
	* @author Guo Yuchao   
	* @date 2014-11-10 下午6:21:32 
	* @param userSearchModel
	* @return
	* @throws BusinessException  
	*/ 
	List<User> findUserByVirtualOrgParam(UserSearchModel userSearchModel) throws BusinessException;
	
	/** 
	* @Description:根据标签组参数查找标签 
	* @author Guo Yuchao   
	* @date 2014-11-11 下午5:13:54 
	* @param userSearchModel
	* @return
	* @throws BusinessException  
	*/ 
	List<User> findUserByLabelParam(UserSearchModel userSearchModel) throws BusinessException;


	/** 
	* @Description: 根据用户id查询用户
	* @author Guo Yuchao   
	* @date 2014-11-12 下午8:53:01 
	* @param operatorId
	* @return  
	*/ 
	User findById(Long operatorId);
	
	/** 
	* @Description: 按照用户组去查询用户集合，用户组参数可以支持实体组织、虚拟主、标签组和标签
	* @author Liu Wenjie   
	* @date 2014-11-15 上午11:36:04 
	* @param includeList
	* @param excludeList
	* @return  
	*/ 
	Set<User> finduserByOrgOrLabelParam(List<UserGroupModule> includeList,List<UserGroupModule> excludeList);
	
	/** 
	* @Description: TODO 查询同一门店下的员工
	* @author Shao Jingkai   
	* @date 2015-6-29 上午10:47:20 
	* @param shopId
	* @return  
	*/ 
	List<User> findUsersInSameShop(String shopId);
}
