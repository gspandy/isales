/**
* @Company 青鸟软通   
* @Title: UserEmpDomain.java 
* @Package com.haier.isales.system.useremp.domain 
* @author Guo Yuchao   
* @date 2015年01月15日  16:31:52 
* @version V1.0   
*/ 
package com.haier.isales.system.useremp.domain;

import java.io.Serializable;

/** 
 * @ClassName: UserEmpDomain 
 * t_sys_employee 自动生成的对应的实体对象   
 *  
 */
public class UserEmpDomain implements Serializable{
	private static final long serialVersionUID = -1421310712678L;

	/** 
	* @Fields xjytId : 自主经营体编码
	*/
	private String xjytId;
	/** 
	* @Fields orgName : 自主经营体名称
	*/
	private String orgName;
	/** 
	* @Fields organalysisattr4 : 大渠道编码
	*/
	private String organalysisattr4;
	/** 
	* @Fields organalysisattr2 : 大渠道名称
	*/
	private String organalysisattr2;
	/** 
	* @Fields organalysisattr3 : 小渠道编码
	*/
	private String organalysisattr3;
	/** 
	* @Fields organalysisattr1 : 小渠道名称
	*/
	private String organalysisattr1;
	/** 
	* @Fields manageOrgCode : 管理客户编码
	*/
	private String manageOrgCode;
	/** 
	* @Fields manageOrgName : 管理客户名称
	*/
	private String manageOrgName;
	/** 
	* @Fields buid : BU编码
	*/
	private String buid;
	/** 
	* @Fields buName : BU名称
	*/
	private String buName;
	/** 
	* @Fields shopId : 门店编码
	*/
	private String shopId;
	/** 
	* @Fields shopName : 门店名称
	*/
	private String shopName;
	/** 
	* @Fields status : 人员状态。Y：在职 N：离职
	*/
	private String status;
	/** 
	* @Fields rzlx : 入职类型1人员回聘：是针对正常离职人员；
            2人员返聘：是针对离退休人员；3竞入小微：是针对从SAP平移人员
	*/
	private String rzlx;
	/** 
	* @Fields hmcId : 人员工号
	*/
	private String hmcId;
	/** 
	* @Fields hname : 人员姓名
	*/
	private String hname;
	/** 
	* @Fields haierCode : 海尔员工号
	*/
	private String haierCode;
	/** 
	* @Fields gwType : 岗位大类
	*/
	private String gwType;
	/** 
	* @Fields gwId : 岗位编码
	*/
	private String gwId;
	/** 
	* @Fields gwName : 岗位名称
	*/
	private String gwName;
	/** 
	* @Fields hsex : 性别
	*/
	private String hsex;
	/** 
	* @Fields ryfl : 人员分类
	*/
	private String ryfl;
	/** 
	* @Fields nation : 民族
	*/
	private String nation;
	/** 
	* @Fields birthdate : 出生日期
	*/
	private String birthdate;
	/** 
	* @Fields identityCard : 身份证号
	*/
	private String identityCard;
	/** 
	* @Fields phone : 手机号码
	*/
	private String phone;
	/** 
	* @Fields workTime : 参加工作时间，字符串，形式如：1978-07-04
	*/
	private String workTime;
	/** 
	* @Fields rbtbDate : 入BTB公司时间，字符串，形式如：1978-07-04
	*/
	private String rbtbDate;
	/** 
	* @Fields pactksDate : 合同签订开始时间，字符串，形式如：1978-07-04
	*/
	private String pactksDate;
	/** 
	* @Fields pactjsDate : 合同签订截止时间，字符串，形式如：1978-07-04
	*/
	private String pactjsDate;
	/** 
	* @Fields pactunit : 合同单位
	*/
	private String pactunit;
	/** 
	* @Fields hmail : 电子邮箱
	*/
	private String hmail;
	/** 
	* @Fields zxyType : 直销员分类
	*/
	private String zxyType;
	/** 
	* @Fields ygtYpe : 用工类型
	*/
	private String ygtYpe;
	/** 
	* @Fields rhaierDate : 入海尔时间
	*/
	private String rhaierDate;
	/** 
	* @Fields haierPactunit : 海尔合同单位
	*/
	private String haierPactunit;
	/** 
	* @Fields leaveDate : 离职时间
	*/
	private java.util.Date leaveDate;
	/** 
	* @Fields sysType : 系统类型，
	*/
	private String sysType;
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * 属性 xjytId 的get方法 
	 * @return id
	 */
	public String getXjytId() {
		return this.xjytId;
	}
	/**
	 * 属性 xjytId 的set方法 
	 * @param id 
	 */
	public void setXjytId(String xjytId) {
		this.xjytId = xjytId;
	}
	/**
	 * 属性 orgName 的get方法 
	 * @return id
	 */
	public String getOrgName() {
		return this.orgName;
	}
	/**
	 * 属性 orgName 的set方法 
	 * @param id 
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	/**
	 * 属性 organalysisattr4 的get方法 
	 * @return id
	 */
	public String getOrganalysisattr4() {
		return this.organalysisattr4;
	}
	/**
	 * 属性 organalysisattr4 的set方法 
	 * @param id 
	 */
	public void setOrganalysisattr4(String organalysisattr4) {
		this.organalysisattr4 = organalysisattr4;
	}
	/**
	 * 属性 organalysisattr2 的get方法 
	 * @return id
	 */
	public String getOrganalysisattr2() {
		return this.organalysisattr2;
	}
	/**
	 * 属性 organalysisattr2 的set方法 
	 * @param id 
	 */
	public void setOrganalysisattr2(String organalysisattr2) {
		this.organalysisattr2 = organalysisattr2;
	}
	/**
	 * 属性 organalysisattr3 的get方法 
	 * @return id
	 */
	public String getOrganalysisattr3() {
		return this.organalysisattr3;
	}
	/**
	 * 属性 organalysisattr3 的set方法 
	 * @param id 
	 */
	public void setOrganalysisattr3(String organalysisattr3) {
		this.organalysisattr3 = organalysisattr3;
	}
	/**
	 * 属性 organalysisattr1 的get方法 
	 * @return id
	 */
	public String getOrganalysisattr1() {
		return this.organalysisattr1;
	}
	/**
	 * 属性 organalysisattr1 的set方法 
	 * @param id 
	 */
	public void setOrganalysisattr1(String organalysisattr1) {
		this.organalysisattr1 = organalysisattr1;
	}
	/**
	 * 属性 manageOrgCode 的get方法 
	 * @return id
	 */
	public String getManageOrgCode() {
		return this.manageOrgCode;
	}
	/**
	 * 属性 manageOrgCode 的set方法 
	 * @param id 
	 */
	public void setManageOrgCode(String manageOrgCode) {
		this.manageOrgCode = manageOrgCode;
	}
	/**
	 * 属性 manageOrgName 的get方法 
	 * @return id
	 */
	public String getManageOrgName() {
		return this.manageOrgName;
	}
	/**
	 * 属性 manageOrgName 的set方法 
	 * @param id 
	 */
	public void setManageOrgName(String manageOrgName) {
		this.manageOrgName = manageOrgName;
	}
	/**
	 * 属性 buid 的get方法 
	 * @return id
	 */
	public String getBuid() {
		return this.buid;
	}
	/**
	 * 属性 buid 的set方法 
	 * @param id 
	 */
	public void setBuid(String buid) {
		this.buid = buid;
	}
	/**
	 * 属性 buName 的get方法 
	 * @return id
	 */
	public String getBuName() {
		return this.buName;
	}
	/**
	 * 属性 buName 的set方法 
	 * @param id 
	 */
	public void setBuName(String buName) {
		this.buName = buName;
	}
	/**
	 * 属性 shopId 的get方法 
	 * @return id
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * 属性 shopId 的set方法 
	 * @param id 
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	/**
	 * 属性 shopName 的get方法 
	 * @return id
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * 属性 shopName 的set方法 
	 * @param id 
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
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
	 * 属性 rzlx 的get方法 
	 * @return id
	 */
	public String getRzlx() {
		return this.rzlx;
	}
	/**
	 * 属性 rzlx 的set方法 
	 * @param id 
	 */
	public void setRzlx(String rzlx) {
		this.rzlx = rzlx;
	}
	/**
	 * 属性 hmcId 的get方法 
	 * @return id
	 */
	public String getHmcId() {
		return this.hmcId;
	}
	/**
	 * 属性 hmcId 的set方法 
	 * @param id 
	 */
	public void setHmcId(String hmcId) {
		this.hmcId = hmcId;
	}
	/**
	 * 属性 hname 的get方法 
	 * @return id
	 */
	public String getHname() {
		return this.hname;
	}
	/**
	 * 属性 hname 的set方法 
	 * @param id 
	 */
	public void setHname(String hname) {
		this.hname = hname;
	}
	/**
	 * 属性 haierCode 的get方法 
	 * @return id
	 */
	public String getHaierCode() {
		return this.haierCode;
	}
	/**
	 * 属性 haierCode 的set方法 
	 * @param id 
	 */
	public void setHaierCode(String haierCode) {
		this.haierCode = haierCode;
	}
	/**
	 * 属性 gwType 的get方法 
	 * @return id
	 */
	public String getGwType() {
		return this.gwType;
	}
	/**
	 * 属性 gwType 的set方法 
	 * @param id 
	 */
	public void setGwType(String gwType) {
		this.gwType = gwType;
	}
	/**
	 * 属性 gwId 的get方法 
	 * @return id
	 */
	public String getGwId() {
		return this.gwId;
	}
	/**
	 * 属性 gwId 的set方法 
	 * @param id 
	 */
	public void setGwId(String gwId) {
		this.gwId = gwId;
	}
	/**
	 * 属性 gwName 的get方法 
	 * @return id
	 */
	public String getGwName() {
		return this.gwName;
	}
	/**
	 * 属性 gwName 的set方法 
	 * @param id 
	 */
	public void setGwName(String gwName) {
		this.gwName = gwName;
	}
	/**
	 * 属性 hsex 的get方法 
	 * @return id
	 */
	public String getHsex() {
		return this.hsex;
	}
	/**
	 * 属性 hsex 的set方法 
	 * @param id 
	 */
	public void setHsex(String hsex) {
		this.hsex = hsex;
	}
	/**
	 * 属性 ryfl 的get方法 
	 * @return id
	 */
	public String getRyfl() {
		return this.ryfl;
	}
	/**
	 * 属性 ryfl 的set方法 
	 * @param id 
	 */
	public void setRyfl(String ryfl) {
		this.ryfl = ryfl;
	}
	/**
	 * 属性 nation 的get方法 
	 * @return id
	 */
	public String getNation() {
		return this.nation;
	}
	/**
	 * 属性 nation 的set方法 
	 * @param id 
	 */
	public void setNation(String nation) {
		this.nation = nation;
	}
	/**
	 * 属性 birthdate 的get方法 
	 * @return id
	 */
	public String getBirthdate() {
		return this.birthdate;
	}
	/**
	 * 属性 birthdate 的set方法 
	 * @param id 
	 */
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	/**
	 * 属性 identityCard 的get方法 
	 * @return id
	 */
	public String getIdentityCard() {
		return this.identityCard;
	}
	/**
	 * 属性 identityCard 的set方法 
	 * @param id 
	 */
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	/**
	 * 属性 phone 的get方法 
	 * @return id
	 */
	public String getPhone() {
		return this.phone;
	}
	/**
	 * 属性 phone 的set方法 
	 * @param id 
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 属性 workTime 的get方法 
	 * @return id
	 */
	public String getWorkTime() {
		return this.workTime;
	}
	/**
	 * 属性 workTime 的set方法 
	 * @param id 
	 */
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}
	/**
	 * 属性 rbtbDate 的get方法 
	 * @return id
	 */
	public String getRbtbDate() {
		return this.rbtbDate;
	}
	/**
	 * 属性 rbtbDate 的set方法 
	 * @param id 
	 */
	public void setRbtbDate(String rbtbDate) {
		this.rbtbDate = rbtbDate;
	}
	/**
	 * 属性 pactksDate 的get方法 
	 * @return id
	 */
	public String getPactksDate() {
		return this.pactksDate;
	}
	/**
	 * 属性 pactksDate 的set方法 
	 * @param id 
	 */
	public void setPactksDate(String pactksDate) {
		this.pactksDate = pactksDate;
	}
	/**
	 * 属性 pactjsDate 的get方法 
	 * @return id
	 */
	public String getPactjsDate() {
		return this.pactjsDate;
	}
	/**
	 * 属性 pactjsDate 的set方法 
	 * @param id 
	 */
	public void setPactjsDate(String pactjsDate) {
		this.pactjsDate = pactjsDate;
	}
	/**
	 * 属性 pactunit 的get方法 
	 * @return id
	 */
	public String getPactunit() {
		return this.pactunit;
	}
	/**
	 * 属性 pactunit 的set方法 
	 * @param id 
	 */
	public void setPactunit(String pactunit) {
		this.pactunit = pactunit;
	}
	/**
	 * 属性 hmail 的get方法 
	 * @return id
	 */
	public String getHmail() {return this.hmail;}
	/**
	 * 属性 hmail 的set方法 
	 * @param id 
	 */
	public void setHmail(String hmail) {this.hmail = hmail;}
	/**
	 * 属性 zxyType 的get方法 
	 * @return id
	 */
	public String getZxyType() {return this.zxyType;}
	/**
	 * 属性 zxyType 的set方法 
	 * @param id 
	 */
	public void setZxyType(String zxyType) {this.zxyType = zxyType;}
	/**
	 * 属性 ygtYpe 的get方法 
	 * @return id
	 */
	public String getYgtYpe() {return this.ygtYpe;}
	/**
	 * 属性 ygtYpe 的set方法 
	 * @param id 
	 */
	public void setYgtYpe(String ygtYpe) {this.ygtYpe = ygtYpe;}
	/**
	 * 属性 rhaierDate 的get方法 
	 * @return id
	 */
	public String getRhaierDate() {return this.rhaierDate;}
	/**
	 * 属性 rhaierDate 的set方法 
	 * @param id 
	 */
	public void setRhaierDate(String rhaierDate) {this.rhaierDate = rhaierDate;}
	/**
	 * 属性 haierPactunit 的get方法 
	 * @return id
	 */
	public String getHaierPactunit() {return this.haierPactunit;}
	/**
	 * 属性 haierPactunit 的set方法 
	 * @param id 
	 */
	public void setHaierPactunit(String haierPactunit) {this.haierPactunit = haierPactunit;}
	/**
	 * 属性 leaveDate 的get方法 
	 * @return id
	 */
	public java.util.Date getLeaveDate() {return this.leaveDate;}
	/**
	 * 属性 leaveDate 的set方法 
	 * @param id 
	 */
	public void setLeaveDate(java.util.Date leaveDate) {this.leaveDate = leaveDate;}
	/**
	 * 属性 sysType 的get方法 
	 * @return id
	 */
	public String getSysType() {return this.sysType;}
	/**
	 * 属性 sysType 的set方法 
	 * @param id 
	 */
	public void setSysType(String sysType) {this.sysType = sysType;	}
		

	/*====================hashCode and equals ====================*/
/**
	* <p>Description: UserEmpDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2015年01月15日  16:31:52
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((hmcId == null) ? 0 : hmcId.hashCode());
		return result;
	}
	/**
	* <p>Description:UserEmpDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2015年01月15日  16:31:52
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
		UserEmpDomain other =(UserEmpDomain) obj;
		
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (hmcId == null) {if (other.hmcId != null){ return false;} else if (!hmcId.equals(other.hmcId)){ return false;}}
		*/
		if (hmcId == null) {
			if (other.hmcId != null){ 
				return false;
			}
		}else if (!hmcId.equals(other.hmcId)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:UserEmpDomain 自动生成的toString方法 </p> 
	* @author Guo Yuchao   
	* @date 2015年01月15日  16:31:52 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "UserEmpDomain [" +
					"xjytId=" + xjytId + "," + 
					"orgName=" + orgName + "," + 
					"organalysisattr4=" + organalysisattr4 + "," + 
					"organalysisattr2=" + organalysisattr2 + "," + 
					"organalysisattr3=" + organalysisattr3 + "," + 
					"organalysisattr1=" + organalysisattr1 + "," + 
					"manageOrgCode=" + manageOrgCode + "," + 
					"manageOrgName=" + manageOrgName + "," + 
					"buid=" + buid + "," + 
					"buName=" + buName + "," + 
					"shopId=" + shopId + "," + 
					"shopName=" + shopName + "," + 
					"status=" + status + "," + 
					"rzlx=" + rzlx + "," + 
					"hmcId=" + hmcId + "," + 
					"hname=" + hname + "," + 
					"haierCode=" + haierCode + "," + 
					"gwType=" + gwType + "," + 
					"gwId=" + gwId + "," + 
					"gwName=" + gwName + "," + 
					"hsex=" + hsex + "," + 
					"ryfl=" + ryfl + "," + 
					"nation=" + nation + "," + 
					"birthdate=" + birthdate + "," + 
					"identityCard=" + identityCard + "," + 
					"phone=" + phone + "," + 
					"workTime=" + workTime + "," + 
					"rbtbDate=" + rbtbDate + "," + 
					"pactksDate=" + pactksDate + "," + 
					"pactjsDate=" + pactjsDate + "," + 
					"pactunit=" + pactunit + "," + 
					"hmail=" + hmail + "," + 
					"zxyType=" + zxyType + "," + 
					"ygtYpe=" + ygtYpe + "," + 
					"rhaierDate=" + rhaierDate + "," + 
					"haierPactunit=" + haierPactunit + "," + 
					"leaveDate=" + leaveDate + "," + 
					"sysType=" + sysType + "," + 
				"]";
	}
	
	
}
