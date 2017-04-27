/**
 * @Company 青鸟软通   
 * @Title: UserDetailService.java 
 * @Package  com.haier.isales.salerinfo.userdetail.service
 * @author Guo Yuchao   
 * @date 2014年11月21日  12:50:48
 * @version V1.0   
 */
package com.haier.isales.salerinfo.userdetail.service;

import com.haier.isales.salerinfo.userdetail.domain.UserDetailDomain;


/** 
 * @ClassName: UserDetailService
 * @Description: UserDetail的Service接口定义类
 *  
 */
public interface UserDetailService {

	/** 
	* @Description: 绑定用户头像
	* @author Guo Yuchao   
	* @date 2014-11-21 下午1:33:41 
	* @param headPortraitId  
	*/ 
	UserDetailDomain saveHeadPortrait(Long operatorId ,Long headPortraitId,String updateName);
	
	/** 
	* @Description: 根据主键查询用户详细信息实体
	* @author Guo Yuchao   
	* @date 2014-11-21 下午2:02:46 
	* @param operatorId
	* @return  
	*/ 
	UserDetailDomain findById(Long operatorId);
	
	
	/** 
	* @Description: 更新个人信息
	* @author John.zhao   
	* @date 2014-11-22 下午3:20:01 
	* @param domain
	* @return  
	*/ 
	UserDetailDomain updateUserDetail(UserDetailDomain domain);
	
}
