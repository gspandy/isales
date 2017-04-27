package com.haier.isales.monitor.dto;

import java.io.Serializable;

public class UserInfoDTO implements Serializable {
	private static final long serialVersionUID = -66962007058835054L;
	private Long userId; // 用户id
	private String userName; // 用户名
	/**
	 * @Description: 属性 userId 的get方法 
	 * @return userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @Description: 属性 userId 的set方法 
	 * @param userId 
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @Description: 属性 userName 的get方法 
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @Description: 属性 userName 的set方法 
	 * @param userName 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:06:27 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "UserInfoDTO [userId=" + userId + ", userName=" + userName + "]";
	}
	
}
