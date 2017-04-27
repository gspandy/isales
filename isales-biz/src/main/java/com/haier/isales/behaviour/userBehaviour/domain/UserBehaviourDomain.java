/**
* @Company 青鸟软通   
* @Title: UserBehaviourDomain.java 
* @Package com.haier.isales.behaviour.userBehaviour.domain 
* @author John Zhao   
* @date 2014年11月10日  18:11:40 
* @version V1.0   
*/ 
package com.haier.isales.behaviour.userBehaviour.domain;

import java.io.Serializable;

/** 
 * @ClassName: UserBehaviourDomain 
 * t_sys_user_behaviour 自动生成的对应的实体对象   
 * 用户行为实体类
 */
public class UserBehaviourDomain implements Serializable{
	private static final long serialVersionUID = -1415614300013L;

	private Long id;		//主键

	private Long userId;		//登录用户ID

	private String loginName;		//登录名

	private java.util.Date operateDate;		//操作时间

	private String operateType;		//操作类型

	private String operationId;		//操作对象

	private String operationName;		//操作对象名称

	private String userIp;		//用户ip地址

	private String userDevice;		//访问设备 101：手机 102：PC 103：PAD

	private String deviceName;		//设备名称

	private String deviceModel;		//设备型号

	private String deviceMac;		//设备mac

	private String clientOsType;		//操作系统,不是用字典，通过程序获取到客户端操作系统后，直接存储相应的名称（如 android、ios、windows）即可

	private String clientOsVersion;		//客户端操作系统的版本号，如windows的7、8、9，android的4.1、4.2等

	private String browserKernel;		//浏览器内核

	private String browserVersion;		//浏览器版本

	private Long callTime;		//调用时长

	private String deviceBrand;		//设备品牌，主要针对手机端。如果能获取到客户端品牌则存值

	private String deviceResolution;		//设备分辨率，主要针对手机，如能获取则存值

	private String appVersion;		//应用版本号

	private String cordovaVersion;		//cordova版本

	private String pixelHeight;		//高度

	private String pixelWidth;		//宽度

	private String pixelRatio;		//像素比

	private String clientInfo;		//客户端详细信息，存储以上字段以外的信息，比如分辨率等

	private String remark;		//备注
		
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
	 * 属性 userId 的get方法 
	 * @return id
	 */
	public Long getUserId() {
		return this.userId;
	}
	/**
	 * 属性 userId 的set方法 
	 * @param id 
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 属性 loginName 的get方法 
	 * @return id
	 */
	public String getLoginName() {
		return this.loginName;
	}
	/**
	 * 属性 loginName 的set方法 
	 * @param id 
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/**
	 * 属性 operateDate 的get方法 
	 * @return id
	 */
	public java.util.Date getOperateDate() {
		return this.operateDate;
	}
	/**
	 * 属性 operateDate 的set方法 
	 * @param id 
	 */
	public void setOperateDate(java.util.Date operateDate) {
		this.operateDate = operateDate;
	}
	/**
	 * 属性 operateType 的get方法 
	 * @return id
	 */
	public String getOperateType() {
		return this.operateType;
	}
	/**
	 * 属性 operateType 的set方法 
	 * @param id 
	 */
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	/**
	 * 属性 operationId 的get方法 
	 * @return id
	 */
	public String getOperationId() {
		return this.operationId;
	}
	/**
	 * 属性 operationId 的set方法 
	 * @param id 
	 */
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	/**
	 * 属性 operationName 的get方法 
	 * @return id
	 */
	public String getOperationName() {
		return this.operationName;
	}
	/**
	 * 属性 operationName 的set方法 
	 * @param id 
	 */
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	/**
	 * 属性 userIp 的get方法 
	 * @return id
	 */
	public String getUserIp() {
		return this.userIp;
	}
	/**
	 * 属性 userIp 的set方法 
	 * @param id 
	 */
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	/**
	 * 属性 userDevice 的get方法 
	 * @return id
	 */
	public String getUserDevice() {
		return this.userDevice;
	}
	/**
	 * 属性 userDevice 的set方法 
	 * @param id 
	 */
	public void setUserDevice(String userDevice) {
		this.userDevice = userDevice;
	}
	/**
	 * 属性 deviceName 的get方法 
	 * @return id
	 */
	public String getDeviceName() {
		return this.deviceName;
	}
	/**
	 * 属性 deviceName 的set方法 
	 * @param id 
	 */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	/**
	 * 属性 deviceModel 的get方法 
	 * @return id
	 */
	public String getDeviceModel() {
		return this.deviceModel;
	}
	/**
	 * 属性 deviceModel 的set方法 
	 * @param id 
	 */
	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}
	/**
	 * 属性 deviceMac 的get方法 
	 * @return id
	 */
	public String getDeviceMac() {
		return this.deviceMac;
	}
	/**
	 * 属性 deviceMac 的set方法 
	 * @param id 
	 */
	public void setDeviceMac(String deviceMac) {
		this.deviceMac = deviceMac;
	}
	/**
	 * 属性 clientOsType 的get方法 
	 * @return id
	 */
	public String getClientOsType() {
		return this.clientOsType;
	}
	/**
	 * 属性 clientOsType 的set方法 
	 * @param id 
	 */
	public void setClientOsType(String clientOsType) {
		this.clientOsType = clientOsType;
	}
	/**
	 * 属性 clientOsVersion 的get方法 
	 * @return id
	 */
	public String getClientOsVersion() {
		return this.clientOsVersion;
	}
	/**
	 * 属性 clientOsVersion 的set方法 
	 * @param id 
	 */
	public void setClientOsVersion(String clientOsVersion) {
		this.clientOsVersion = clientOsVersion;
	}
	/**
	 * 属性 browserKernel 的get方法 
	 * @return id
	 */
	public String getBrowserKernel() {
		return this.browserKernel;
	}
	/**
	 * 属性 browserKernel 的set方法 
	 * @param id 
	 */
	public void setBrowserKernel(String browserKernel) {
		this.browserKernel = browserKernel;
	}
	/**
	 * 属性 browserVersion 的get方法 
	 * @return id
	 */
	public String getBrowserVersion() {
		return this.browserVersion;
	}
	/**
	 * 属性 browserVersion 的set方法 
	 * @param id 
	 */
	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}
	/**
	 * 属性 callTime 的get方法 
	 * @return id
	 */
	public Long getCallTime() {
		return this.callTime;
	}
	/**
	 * 属性 callTime 的set方法 
	 * @param id 
	 */
	public void setCallTime(Long callTime) {
		this.callTime = callTime;
	}
	/**
	 * 属性 deviceBrand 的get方法 
	 * @return id
	 */
	public String getDeviceBrand() {
		return this.deviceBrand;
	}
	/**
	 * 属性 deviceBrand 的set方法 
	 * @param id 
	 */
	public void setDeviceBrand(String deviceBrand) {
		this.deviceBrand = deviceBrand;
	}
	/**
	 * 属性 deviceResolution 的get方法 
	 * @return id
	 */
	public String getDeviceResolution() {
		return this.deviceResolution;
	}
	/**
	 * 属性 deviceResolution 的set方法 
	 * @param id 
	 */
	public void setDeviceResolution(String deviceResolution) {
		this.deviceResolution = deviceResolution;
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
	 * 属性 cordovaVersion 的get方法 
	 * @return id
	 */
	public String getCordovaVersion() {
		return this.cordovaVersion;
	}
	/**
	 * 属性 cordovaVersion 的set方法 
	 * @param id 
	 */
	public void setCordovaVersion(String cordovaVersion) {
		this.cordovaVersion = cordovaVersion;
	}
	/**
	 * 属性 pixelHeight 的get方法 
	 * @return id
	 */
	public String getPixelHeight() {
		return this.pixelHeight;
	}
	/**
	 * 属性 pixelHeight 的set方法 
	 * @param id 
	 */
	public void setPixelHeight(String pixelHeight) {
		this.pixelHeight = pixelHeight;
	}
	/**
	 * 属性 pixelWidth 的get方法 
	 * @return id
	 */
	public String getPixelWidth() {
		return this.pixelWidth;
	}
	/**
	 * 属性 pixelWidth 的set方法 
	 * @param id 
	 */
	public void setPixelWidth(String pixelWidth) {
		this.pixelWidth = pixelWidth;
	}
	/**
	 * 属性 pixelRatio 的get方法 
	 * @return id
	 */
	public String getPixelRatio() {
		return this.pixelRatio;
	}
	/**
	 * 属性 pixelRatio 的set方法 
	 * @param id 
	 */
	public void setPixelRatio(String pixelRatio) {
		this.pixelRatio = pixelRatio;
	}
	/**
	 * 属性 clientInfo 的get方法 
	 * @return id
	 */
	public String getClientInfo() {
		return this.clientInfo;
	}
	/**
	 * 属性 clientInfo 的set方法 
	 * @param id 
	 */
	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
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
		
	/*====================hashCode and equals ====================*/
	/**
	* <p>Description: UserBehaviourDomain 自动生成的hashcode方法</p> 
	* @author John Zhao   
	* @date 2014年11月10日  18:11:40
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
	* <p>Description:UserBehaviourDomain 自动生成的equals方法 </p> 
	* @author John Zhao   
	* @date 2014年11月10日  18:11:40
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
		UserBehaviourDomain other =(UserBehaviourDomain) obj;

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
	* <p>Description:UserBehaviourDomain 自动生成的toString方法 </p> 
	* @author John Zhao   
	* @date 2014年11月10日  18:11:40 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "UserBehaviourDomain [" +
					"id=" + id + "," + 
					"userId=" + userId + "," + 
					"loginName=" + loginName + "," + 
					"operateDate=" + operateDate + "," + 
					"operateType=" + operateType + "," + 
					"operationId=" + operationId + "," + 
					"operationName=" + operationName + "," + 
					"userIp=" + userIp + "," + 
					"userDevice=" + userDevice + "," + 
					"deviceName=" + deviceName + "," + 
					"deviceModel=" + deviceModel + "," + 
					"deviceMac=" + deviceMac + "," + 
					"clientOsType=" + clientOsType + "," + 
					"clientOsVersion=" + clientOsVersion + "," + 
					"browserKernel=" + browserKernel + "," + 
					"browserVersion=" + browserVersion + "," + 
					"callTime=" + callTime + "," + 
					"deviceBrand=" + deviceBrand + "," + 
					"deviceResolution=" + deviceResolution + "," + 
					"appVersion=" + appVersion + "," + 
					"cordovaVersion=" + cordovaVersion + "," + 
					"pixelHeight=" + pixelHeight + "," + 
					"pixelWidth=" + pixelWidth + "," + 
					"pixelRatio=" + pixelRatio + "," + 
					"clientInfo=" + clientInfo + "," + 
					"remark=" + remark + "," + 
				"]";
	}
}
