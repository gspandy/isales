/**
* @Company 青鸟软通   
* @Title: UserClient.java 
* @Package com.haier.isales.system.service
* @author Guo Yuchao   
* @date 2014-10-31 下午2:06:32 
* @version V1.0   
*/ 
package com.haier.isales.system.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.system.dto.UserSearchDTO;

/**
 * 供客户端调用的远程接口
 * @author GuoYuchao
 *
 */
public interface UserClient {
	
	/**
	 * 根据用户id查询用户信息
	 * @param userId
	 * @return
	 */
	@Export(paramNames = {"userSearchDTO","pageNo","pageSize"})
	public Object getUserByParam(UserSearchDTO userSearchDTO,Integer currentPage,Integer pageSize);
	
	/** 
	* @Description: 根据用户工号返回用户是否有登录app权限 101没有权限，102 有权限
	* @author Guo Yuchao   
	* @date 2014-11-4 下午6:43:07 
	* @param employeeSn
	* @return  
	*/ 
	@Export(paramNames = {"employeeSn"})
	public Object findGrantInfoByEmpSn(String employeeSn);
	
	/** 
	* @Description: 根据组织等参数查询用户
	* @author Guo Yuchao   
	* @date 2014-11-10 下午7:00:48 
	* @param userSearchDTO
	* @return  
	*/ 
	@Export(paramNames = {"userSearchDTO"})
	Object findUserByLabelParam(UserSearchDTO userSearchDTO);
	/** 
	* @Description: 根据标签组参数查找标签
	* @author Guo Yuchao   
	* @date 2014-11-11 下午10:40:45 
	* @param userSearchDTO
	* @return  
	*/ 
	@Export(paramNames = {"userSearchDTO"})
	Object findUserByOrgParam(UserSearchDTO userSearchDTO);
	/** 
	 * @Description: 根据operatorId查询user
	 * @author Guo Yuchao   
	 * @date 2014-11-11 下午10:40:45 
	 * @param userSearchDTO
	 * @return  
	 */ 
	@Export(paramNames = {"operatorId"})
	Object findUserByOperatorId(Long operatorId);
	
	/** 
	* @Description: TODO 查询同一门店下所有员工
	* @author Shao Jingkai   
	* @date 2015-6-29 上午11:22:31 
	* @param shopId
	* @return  
	*/ 
	@Export(paramNames={"shopId"})
	Object findUsersInSameShop(String shopId);
}
