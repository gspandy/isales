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
 * @Description:自动生成的对应的实体对象   
 *  
 */
public class AppVersionDTO implements Serializable{
	private static final long serialVersionUID = -1417514542848L;

	/** 
	* @Fields id : id
	*/
	private Long id;
	/** 
	* @Fields appVersion : 应用版本
	*/
	private String appVersion;
	/** 
	* @Fields appUpgradeAbstract : 更新概要
	*/
	private String appUpgradeAbstract;
	/** 
	* @Fields appUpgradeContent : 更新内容
	*/
	private String appUpgradeContent;
	/** 
	* @Fields appOsType : 适用操作系统,101：安卓；102：IOS；103：安卓、IOS都适用
	*/
	private String appOsType;
	/** 
	* @Fields appSize : 下载包大小
	*/
	private String appSize;
	/** 
	* @Fields appDownloadUrl : 下载地址
	*/
	private String appDownloadUrl;
	/** 
	* @Fields appUpgradeTime : 版本更新时间
	*/
	private String appUpgradeTime;
	/** 
	* @Fields status : 状态,101有效；102无效
	*/
	private String status;
	/** 
	* @Fields needUpdateClient : 是否需要升级客户端
	*/
	private boolean needUpdateClient;
	
	
	/*=========================getter and setter ===================*/
	
	/**
	 * @Description: 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * @Description: 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
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
	/**
	 * @Description: 属性 appUpgradeContent 的get方法 
	 * @return id
	 */
	public String getAppUpgradeContent() {
		return this.appUpgradeContent;
	}
	/**
	 * @Description: 属性 appUpgradeContent 的set方法 
	 * @param id 
	 */
	public void setAppUpgradeContent(String appUpgradeContent) {
		this.appUpgradeContent = appUpgradeContent;
	}
	/**
	 * @Description: 属性 appOsType 的get方法 
	 * @return id
	 */
	public String getAppOsType() {
		return this.appOsType;
	}
	/**
	 * @Description: 属性 appOsType 的set方法 
	 * @param id 
	 */
	public void setAppOsType(String appOsType) {
		this.appOsType = appOsType;
	}
	/**
	 * @Description: 属性 appSize 的get方法 
	 * @return id
	 */
	public String getAppSize() {
		return this.appSize;
	}
	/**
	 * @Description: 属性 appSize 的set方法 
	 * @param id 
	 */
	public void setAppSize(String appSize) {
		this.appSize = appSize;
	}
	/**
	 * @Description: 属性 appDownloadUrl 的get方法 
	 * @return id
	 */
	public String getAppDownloadUrl() {
		return this.appDownloadUrl;
	}
	/**
	 * @Description: 属性 appDownloadUrl 的set方法 
	 * @param id 
	 */
	public void setAppDownloadUrl(String appDownloadUrl) {
		this.appDownloadUrl = appDownloadUrl;
	}

	/**
	 * @Description: 属性 appUpgradeTime 的get方法 
	 * @return appUpgradeTime
	 */
	public String getAppUpgradeTime() {
		return appUpgradeTime;
	}
	/**
	 * @Description: 属性 appUpgradeTime 的set方法 
	 * @param appUpgradeTime 
	 */
	public void setAppUpgradeTime(String appUpgradeTime) {
		this.appUpgradeTime = appUpgradeTime;
	}
	/**
	 * @Description: 属性 status 的get方法 
	 * @return id
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * @Description: 属性 status 的set方法 
	 * @param id 
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @Description: 属性 needUpdateClient 的get方法 
	 * @return needUpdateClient
	 */
	public boolean isNeedUpdateClient() {
		return needUpdateClient;
	}
	/**
	 * @Description: 属性 needUpdateClient 的set方法 
	 * @param needUpdateClient 
	 */
	public void setNeedUpdateClient(boolean needUpdateClient) {
		this.needUpdateClient = needUpdateClient;
	}
	/**
	 * @Description: 属性 appUpgradeAbstract 的get方法 
	 * @return appUpgradeAbstract
	 */
	public String getAppUpgradeAbstract() {
		return appUpgradeAbstract;
	}
	/**
	 * @Description: 属性 appUpgradeAbstract 的set方法 
	 * @param appUpgradeAbstract 
	 */
	public void setAppUpgradeAbstract(String appUpgradeAbstract) {
		this.appUpgradeAbstract = appUpgradeAbstract;
	}
	
/*====================hashCode and equals ====================*/
/**
	* <p>Description: AppVersionDTO 自动生成的hashcode方法</p> 
	* @author Cao  Rui   
	* @date 2014年12月02日  18:12:22
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((id == null) ? 0 : id.hashCode());
		return result;
	}
	/**
	* <p>Description:AppVersionDTO 自动生成的equals方法 </p> 
	* @author Cao  Rui   
	* @date 2014年12月02日  18:12:22
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		AppVersionDTO other =(AppVersionDTO) obj;

		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (id == null) {if (other.id != null){ return false;} else if (!id.equals(other.id)){ return false;}}
		*/
		if (id == null) {
			if (other.id != null){ 
				return false;
			}
		}else if (!id.equals(other.id)){
				return false;
		}
		return true;
	}
	
	/*==================== toString() ====================*/
	/**
	* <p>Description: AppVersionDTO 自动生成的toString方法</p> 
	* @author Guo  Yuchao   
	* @date 2015-1-7 下午7:11:20 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "AppVersionDTO [id=" + id + ", appVersion=" + appVersion
				+ ", appUpgradeAbstract=" + appUpgradeAbstract
				+ ", appUpgradeContent=" + appUpgradeContent + ", appOsType="
				+ appOsType + ", appSize=" + appSize + ", appDownloadUrl="
				+ appDownloadUrl + ", appUpgradeTime=" + appUpgradeTime
				+ ", status=" + status + ", needUpdateClient="
				+ needUpdateClient + "]";
	}
}
