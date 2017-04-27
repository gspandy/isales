/**
* @Company 青鸟软通   
* @Title: UserDetailClient.java 
* @Package com.haier.isales.salerinfo.userdetail.service 
* @author Guo Yuchao   
* @date 2014-11-21 下午9:35:41 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.userdetail.service;



/** 
 * @ClassName: UserDetailClient 
 * @Description: 个人信息对外发布接口 
 *  
 */
public interface UserDetailSearchClient {
	
	/**
	 * 
	* @Title: findUserDetailById 
	* @Description:  根据id获取用户详细信息 并返回dto对象
	* @param id
	* @return  
	* @throws
	 */
	public Object findUserDetailById(Long id) ;
}
