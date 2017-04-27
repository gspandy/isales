/**
* @Company 青鸟软通   
* @Title: AppVersionDomain.java 
* @Package com.haier.isales.app.domain 
* @author Cao  Rui   
* @date 2014年12月02日  18:12:22 
* @version V1.0   
*/ 
package com.haier.isales.app.dto;

import java.io.Serializable;

/** 
 * @ClassName: AppVersionDTO 
 * @Description:
 *  
 */
public class AppVersionQueryDTO implements Serializable{
	private static final long serialVersionUID = -1417514542848L;

	/** 
	* @Fields appVersion : 应用版本
	*/
	private String appVersion;
	/** 
	* @Fields userCode : 员工号。可以通过日志表查询用户本地版本历史
	*/
	private String userCode;
	
	//=================getter and setter ===================
	/**
	 * @Description: 属性 appVersion 的get方法 
	 * @return id
	 */
	public String getAppVersion() {
		return this.appVersion;
	}
	/**
	 * @Description: 属性 appVersion 的set方法 
	 * @param id 
	 */
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	
	
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
	//=================toString=====================
	/**
	* <p>Description:AppVersionQueryDTO自动生成的toString方法 </p> 
	* @author Guo  Yuchao   
	* @date 2015-1-7 下午7:11:30 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "AppVersionQueryDTO [appVersion=" + appVersion + ",userCode=" + userCode + "]";
	}

}
