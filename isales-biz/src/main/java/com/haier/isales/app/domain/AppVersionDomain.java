/**
* @Company 青鸟软通   
* @Title: AppVersionDomain.java 
* @Package com.haier.isales.app.domain 
* @author Cao Rui   
* @date 2014年12月08日  14:23:14 
* @version V1.0   
*/ 
package com.haier.isales.app.domain;

import java.io.Serializable;

/** 
 * @ClassName: AppVersionDomain 
 * t_isales_app_version 自动生成的对应的实体对象   
 *  
 */
public class AppVersionDomain implements Serializable{
	private static final long serialVersionUID = -1418019794771L;
	public static final String STATUS_ENABLE = "101" ;
	public static final String STATUS_DISABLE = "102";

	private Long id;	//主键

	private String appVersion;	//应用版本

	private String appUpgradeAbstract;	//更新概要

	private String appUpgradeContent;	//更新内容

	private String appOsType;	//适用操作系统,101：安卓；102：IOS；103：安卓、IOS都适用

	private Boolean needUpdateClient;	//是否需要升级客户端,0不需要，1需要,转化为java代码为boolean

	private String appSize;	//下载包大小

	private String appDownloadUrl;	//下载地址

	private java.util.Date createTime;	//添加时间

	private java.util.Date updateTime;	// 修改时间

	private java.util.Date appUpgradeTime;	//版本更新时间

	private String status;	//状态,101有效；102无效

	private String remark;	//备注

	/*=========================getter and setter ===================*/
	
	/**
	 * 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 属性 appVersion 的get方法 
	 * @return id
	 */
	public String getAppVersion() {
		return this.appVersion;
	}
	/**
	 * 属性 appVersion 的set方法 
	 * @param id 
	 */
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	/**
	 * 属性 appUpgradeContent 的get方法 
	 * @return id
	 */
	public String getAppUpgradeContent() {
		return this.appUpgradeContent;
	}
	/**
	 * 属性 appUpgradeContent 的set方法 
	 * @param id 
	 */
	public void setAppUpgradeContent(String appUpgradeContent) {
		this.appUpgradeContent = appUpgradeContent;
	}
	/**
	 * 属性 appOsType 的get方法 
	 * @return id
	 */
	public String getAppOsType() {
		return this.appOsType;
	}
	/**
	 * 属性 appOsType 的set方法 
	 * @param id 
	 */
	public void setAppOsType(String appOsType) {
		this.appOsType = appOsType;
	}
	/**
	 * 属性 needUpdateClient 的get方法 
	 * @return id
	 */
	public Boolean getNeedUpdateClient() {
		return this.needUpdateClient;
	}
	/**
	 * 属性 needUpdateClient 的set方法 
	 * @param id 
	 */
	public void setNeedUpdateClient(Boolean needUpdateClient) {
		this.needUpdateClient = needUpdateClient;
	}
	/**
	 * 属性 appSize 的get方法 
	 * @return id
	 */
	public String getAppSize() {
		return this.appSize;
	}
	/**
	 * 属性 appSize 的set方法 
	 * @param id 
	 */
	public void setAppSize(String appSize) {
		this.appSize = appSize;
	}
	/**
	 * 属性 appDownloadUrl 的get方法 
	 * @return id
	 */
	public String getAppDownloadUrl() {
		return this.appDownloadUrl;
	}
	/**
	 * 属性 appDownloadUrl 的set方法 
	 * @param id 
	 */
	public void setAppDownloadUrl(String appDownloadUrl) {
		this.appDownloadUrl = appDownloadUrl;
	}
	/**
	 * 属性 createTime 的get方法 
	 * @return id
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * 属性 createTime 的set方法 
	 * @param id 
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 属性 updateTime 的get方法 
	 * @return id
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	/**
	 * 属性 updateTime 的set方法 
	 * @param id 
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 属性 appUpgradeTime 的get方法 
	 * @return id
	 */
	public java.util.Date getAppUpgradeTime() {
		return this.appUpgradeTime;
	}
	/**
	 * 属性 appUpgradeTime 的set方法 
	 * @param id 
	 */
	public void setAppUpgradeTime(java.util.Date appUpgradeTime) {
		this.appUpgradeTime = appUpgradeTime;
	}
	/**
	 * 属性 status 的get方法 
	 * @return id
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * 属性 status 的set方法 
	 * @param id 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 属性 appUpgradeAbstract 的get方法 
	 * @return appUpgradeAbstract
	 */
	public String getAppUpgradeAbstract() {
		return appUpgradeAbstract;
	}
	/**
	 * 属性 appUpgradeAbstract 的set方法 
	 * @param appUpgradeAbstract 
	 */
	public void setAppUpgradeAbstract(String appUpgradeAbstract) {
		this.appUpgradeAbstract = appUpgradeAbstract;
	}
	
/*====================hashCode and equals ====================*/
/**
	* <p>Description: AppVersionDomain 自动生成的hashcode方法</p> 
	* @author Cao Rui   
	* @date 2014年12月08日  14:23:14
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
	* <p>Description:AppVersionDomain 自动生成的equals方法 </p> 
	* @author Cao Rui   
	* @date 2014年12月08日  14:23:14
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
		AppVersionDomain other =(AppVersionDomain) obj;

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
	* <p>Description:AppVersionDomain 自动生成的toString方法 </p> 
	* @author Cao Rui   
	* @date 2014年12月08日  14:23:14 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "AppVersionDomain [" +
					"id=" + id + "," + 
					"appVersion=" + appVersion + "," + 
					"appUpgradeContent=" + appUpgradeContent + "," + 
					"appOsType=" + appOsType + "," + 
					"needUpdateClient=" + needUpdateClient + "," + 
					"appSize=" + appSize + "," + 
					"appDownloadUrl=" + appDownloadUrl + "," + 
					"createTime=" + createTime + "," + 
					"updateTime=" + updateTime + "," + 
					"appUpgradeTime=" + appUpgradeTime + "," + 
					"status=" + status + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
