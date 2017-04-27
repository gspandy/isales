/**
* @Company 青鸟软通   
* @Title: UserDetailDomain.java 
* @Package com.haier.isales.salerinfo.userdetail.domain 
* @author Guo Yuchao   
* @date 2014年11月21日  12:03:12 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.userdetail.dto;

import java.io.Serializable;

/** 
 * @ClassName: UserDetailDomain 
 * @Description: t_isales_user_detail 自动生成的对应的实体对象   
 *  
 */
public class UserDetailSearchDTO implements Serializable{
	private static final long serialVersionUID = -1416542592175L;

	/** 
	* @Fields operatorId : 用户id
	*/
	private Long operatorId;
	/** 
	* @Fields signature : 个性签名
	*/
	private String signature;
	/** 
	* @Fields headPortraitId : 头像id，对应附件表中的id字段
	*/
	private Long headPortraitId;
	/** 
	* @Fields wechatCode : 微信号
	*/
	private String wechatCode;
	/** 
	* @Fields pointLevel : 积分等级，用户等级
	*/
	private Integer pointLevel;
	/** 
	* @Fields point : 积分余额
	*/
	private Integer point;
	/** 
	* @Fields updateId : 修改人id，可能是字符，如工号，
	*/
	private String updateId;
	/** 
	* @Fields updateName : 修改人
	*/
	private String updateName;
	/** 
	* @Fields updateTime : 修改时间
	*/
	private java.util.Date updateTime;
	/** 
	* @Fields mobile : 手机号码
	*/
	private String mobile;
	/** 
	* @Fields phone : 电话号码
	*/
	private String phone;
	/** 
	* @Fields currentLevelPoint : 当前等级累计积分
	*/
	private Integer currentLevelPoint;
	/** 
	* @Fields availablePoint : 当前可用积分
	*/
	private Integer availablePoint;
	/** 
	* @Fields currentLevelTotalPoint : 当前等级所有积分
	*/ 
	private Integer currentLevelTotalPoint;
	/** 
	* @Fields currentLevelLackPoint : 距离升级还缺少积分
	*/ 
	private Integer currentLevelLackPoint;
	/*=========================getter and setter ===================*/
	
	/**
	 * @Description: 属性 operatorId 的get方法 
	 * @return id
	 */
	public Long getOperatorId() {
		return this.operatorId;
	}
	/**
	 * @Description: 属性 operatorId 的set方法 
	 * @param id 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * @Description: 属性 signature 的get方法 
	 * @return id
	 */
	public String getSignature() {
		return this.signature;
	}
	/**
	 * @Description: 属性 signature 的set方法 
	 * @param id 
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}
	/**
	 * @Description: 属性 headPortraitId 的get方法 
	 * @return id
	 */
	public Long getHeadPortraitId() {
		return this.headPortraitId;
	}
	/**
	 * @Description: 属性 headPortraitId 的set方法 
	 * @param id 
	 */
	public void setHeadPortraitId(Long headPortraitId) {
		this.headPortraitId = headPortraitId;
	}
	/**
	 * @Description: 属性 wechatCode 的get方法 
	 * @return id
	 */
	public String getWechatCode() {
		return this.wechatCode;
	}
	/**
	 * @Description: 属性 wechatCode 的set方法 
	 * @param id 
	 */
	public void setWechatCode(String wechatCode) {
		this.wechatCode = wechatCode;
	}
	/**
	 * @Description: 属性 pointLevel 的get方法 
	 * @return id
	 */
	public Integer getPointLevel() {
		return this.pointLevel;
	}
	/**
	 * @Description: 属性 pointLevel 的set方法 
	 * @param id 
	 */
	public void setPointLevel(Integer pointLevel) {
		this.pointLevel = pointLevel;
	}
	/**
	 * @Description: 属性 point 的get方法 
	 * @return id
	 */
	public Integer getPoint() {
		return this.point;
	}
	/**
	 * @Description: 属性 point 的set方法 
	 * @param id 
	 */
	public void setPoint(Integer point) {
		this.point = point;
	}
	/**
	 * @Description: 属性 updateId 的get方法 
	 * @return id
	 */
	public String getUpdateId() {
		return this.updateId;
	}
	/**
	 * @Description: 属性 updateId 的set方法 
	 * @param id 
	 */
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	/**
	 * @Description: 属性 updateName 的get方法 
	 * @return id
	 */
	public String getUpdateName() {
		return this.updateName;
	}
	/**
	 * @Description: 属性 updateName 的set方法 
	 * @param id 
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
	/**
	 * @Description: 属性 updateTime 的get方法 
	 * @return id
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	/**
	 * @Description: 属性 updateTime 的set方法 
	 * @param id 
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
		
	
		
	
	/**
	 * @Description: 属性 mobile 的get方法 
	 * @return mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @Description: 属性 mobile 的set方法 
	 * @param mobile 
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @Description: 属性 phone 的get方法 
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @Description: 属性 phone 的set方法 
	 * @param phone 
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
/**
	 * @Description: 属性 currentLevelPoint 的get方法 
	 * @return currentLevelPoint
	 */
	public Integer getCurrentLevelPoint() {
		return currentLevelPoint;
	}
	/**
	 * @Description: 属性 currentLevelPoint 的set方法 
	 * @param currentLevelPoint 
	 */
	public void setCurrentLevelPoint(Integer currentLevelPoint) {
		this.currentLevelPoint = currentLevelPoint;
	}
	/**
	 * @Description: 属性 availablePoint 的get方法 
	 * @return availablePoint
	 */
	public Integer getAvailablePoint() {
		return availablePoint;
	}
	/**
	 * @Description: 属性 availablePoint 的set方法 
	 * @param availablePoint 
	 */
	public void setAvailablePoint(Integer availablePoint) {
		this.availablePoint = availablePoint;
	}
/**
	 * @Description: 属性 currentLevelTotalPoint 的get方法 
	 * @return currentLevelTotalPoint
	 */
	public Integer getCurrentLevelTotalPoint() {
		return currentLevelTotalPoint;
	}
	/**
	 * @Description: 属性 currentLevelTotalPoint 的set方法 
	 * @param currentLevelTotalPoint 
	 */
	public void setCurrentLevelTotalPoint(Integer currentLevelTotalPoint) {
		this.currentLevelTotalPoint = currentLevelTotalPoint;
	}
	/**
	 * @Description: 属性 currentLevelLackPoint 的get方法 
	 * @return currentLevelLackPoint
	 */
	public Integer getCurrentLevelLackPoint() {
		return currentLevelLackPoint;
	}
	/**
	 * @Description: 属性 currentLevelLackPoint 的set方法 
	 * @param currentLevelLackPoint 
	 */
	public void setCurrentLevelLackPoint(Integer currentLevelLackPoint) {
		this.currentLevelLackPoint = currentLevelLackPoint;
	}
/*====================hashCode and equals ====================*/
/**
	* <p>Description: UserDetailDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2014年11月21日  12:03:12
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((operatorId == null) ? 0 : operatorId.hashCode());
		return result;
	}
	/**
	* <p>Description:UserDetailDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月21日  12:03:12
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
		UserDetailSearchDTO other =(UserDetailSearchDTO) obj;
		/*修改代码违规，原语句存在空指针情况*/
		if (operatorId == null) {
			if (other.operatorId != null){ 
				return false;
			}
		}else if (!operatorId.equals(other.operatorId)){
				return false;
		}
		
		return true;
	}
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:12:04 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "UserDetailSearchDTO [operatorId=" + operatorId + ", signature="
				+ signature + ", headPortraitId=" + headPortraitId
				+ ", wechatCode=" + wechatCode + ", pointLevel=" + pointLevel
				+ ", point=" + point + ", updateId=" + updateId
				+ ", updateName=" + updateName + ", updateTime=" + updateTime
				+ ", mobile=" + mobile + ", phone=" + phone
				+ ", currentLevelPoint=" + currentLevelPoint
				+ ", availablePoint=" + availablePoint
				+ ", currentLevelTotalPoint=" + currentLevelTotalPoint
				+ ", currentLevelLackPoint=" + currentLevelLackPoint + "]";
	}
		
	/*==================== toString() ====================*/

	
	
}
