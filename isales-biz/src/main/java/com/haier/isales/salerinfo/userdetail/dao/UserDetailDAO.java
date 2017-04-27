/**
 * @Company 青鸟软通   
 * @Title: UserDetailDAO.java 
 * @Package  com.haier.isales.salerinfo.userdetail.dao
 * @author Guo Yuchao   
 * @date 2014年11月21日  12:03:12
 * @version V1.0   
 */
package com.haier.isales.salerinfo.userdetail.dao;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.salerinfo.userdetail.domain.UserDetailDomain;

/**
 * @ClassName: UserDetailDAO
 * @Description: UserDetail的DAO接口定义类
 * 
 */
public interface UserDetailDAO extends CommonDAO<UserDetailDomain, Long> {
	
	
	/** 
	* @Description: 为更新头像、签名、微信号、手机号码提供的更新方法，
	* 在mapper中增加判断，四个参数，那个不为null，更新哪个，为null的不更新
	* @author John.zhao   
	* @date 2014-11-22 下午3:36:30 
	* @param entity
	* @return  
	*/ 
	public int updateUserDetail(UserDetailDomain entity);
}
