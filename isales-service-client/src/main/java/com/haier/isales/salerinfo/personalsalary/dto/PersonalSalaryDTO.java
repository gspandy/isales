/**
 * @Company 青鸟软通   
 * @Title: PersonalSalaryDTO.java 
 * @Package com.haier.isales.salerinfo.personalsalary.dto 
 * @author John.zhao   
 * @date 2015-2-26 上午10:49:29 
 * @version V1.0   
 */
package com.haier.isales.salerinfo.personalsalary.dto;

import java.io.Serializable;

/**
 * @ClassName: PersonalSalaryDTO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public class PersonalSalaryDTO implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -6463982581987088419L;
	private String fzxid;
	private String fzxname;
	private String ygid;
	private String ygname;
	private String month;
	private String xl;
	private String gw;
	private String khyf;
	private String grdk;
	private String gzsf;
	private String status;
	private String msg;
	/**
	 * @Description: 属性 fzxid 的get方法 
	 * @return fzxid
	 */
	public String getFzxid() {
		return fzxid;
	}
	/**
	 * @Description: 属性 fzxid 的set方法 
	 * @param fzxid 
	 */
	public void setFzxid(String fzxid) {
		this.fzxid = fzxid;
	}
	/**
	 * @Description: 属性 fzxname 的get方法 
	 * @return fzxname
	 */
	public String getFzxname() {
		return fzxname;
	}
	/**
	 * @Description: 属性 fzxname 的set方法 
	 * @param fzxname 
	 */
	public void setFzxname(String fzxname) {
		this.fzxname = fzxname;
	}
	/**
	 * @Description: 属性 ygid 的get方法 
	 * @return ygid
	 */
	public String getYgid() {
		return ygid;
	}
	/**
	 * @Description: 属性 ygid 的set方法 
	 * @param ygid 
	 */
	public void setYgid(String ygid) {
		this.ygid = ygid;
	}
	/**
	 * @Description: 属性 ygname 的get方法 
	 * @return ygname
	 */
	public String getYgname() {
		return ygname;
	}
	/**
	 * @Description: 属性 ygname 的set方法 
	 * @param ygname 
	 */
	public void setYgname(String ygname) {
		this.ygname = ygname;
	}
	/**
	 * @Description: 属性 month 的get方法 
	 * @return month
	 */
	public String getMonth() {
		return month;
	}
	/**
	 * @Description: 属性 month 的set方法 
	 * @param month 
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	 * @Description: 属性 xl 的get方法 
	 * @return xl
	 */
	public String getXl() {
		return xl;
	}
	/**
	 * @Description: 属性 xl 的set方法 
	 * @param xl 
	 */
	public void setXl(String xl) {
		this.xl = xl;
	}
	/**
	 * @Description: 属性 gw 的get方法 
	 * @return gw
	 */
	public String getGw() {
		return gw;
	}
	/**
	 * @Description: 属性 gw 的set方法 
	 * @param gw 
	 */
	public void setGw(String gw) {
		this.gw = gw;
	}
	/**
	 * @Description: 属性 khyf 的get方法 
	 * @return khyf
	 */
	public String getKhyf() {
		return khyf;
	}
	/**
	 * @Description: 属性 khyf 的set方法 
	 * @param khyf 
	 */
	public void setKhyf(String khyf) {
		this.khyf = khyf;
	}
	/**
	 * @Description: 属性 grdk 的get方法 
	 * @return grdk
	 */
	public String getGrdk() {
		return grdk;
	}
	/**
	 * @Description: 属性 grdk 的set方法 
	 * @param grdk 
	 */
	public void setGrdk(String grdk) {
		this.grdk = grdk;
	}
	/**
	 * @Description: 属性 gzsf 的get方法 
	 * @return gzsf
	 */
	public String getGzsf() {
		return gzsf;
	}
	/**
	 * @Description: 属性 gzsf 的set方法 
	 * @param gzsf 
	 */
	public void setGzsf(String gzsf) {
		this.gzsf = gzsf;
	}
	/**
	 * @Description: 属性 status 的get方法 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @Description: 属性 status 的set方法 
	 * @param status 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @Description: 属性 msg 的get方法 
	 * @return msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @Description: 属性 msg 的set方法 
	 * @param msg 
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-2-26 上午10:50:57 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "PersonalSalaryDTO [fzxid=" + fzxid + ", fzxname=" + fzxname
				+ ", ygid=" + ygid + ", ygname=" + ygname + ", month=" + month
				+ ", xl=" + xl + ", gw=" + gw + ", khyf=" + khyf + ", grdk="
				+ grdk + ", gzsf=" + gzsf + ", status=" + status + ", msg="
				+ msg + "]";
	}
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-2-26 上午10:51:09 
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fzxid == null) ? 0 : fzxid.hashCode());
		result = prime * result + ((fzxname == null) ? 0 : fzxname.hashCode());
		result = prime * result + ((grdk == null) ? 0 : grdk.hashCode());
		result = prime * result + ((gw == null) ? 0 : gw.hashCode());
		result = prime * result + ((gzsf == null) ? 0 : gzsf.hashCode());
		result = prime * result + ((khyf == null) ? 0 : khyf.hashCode());
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((xl == null) ? 0 : xl.hashCode());
		result = prime * result + ((ygid == null) ? 0 : ygid.hashCode());
		result = prime * result + ((ygname == null) ? 0 : ygname.hashCode());
		return result;
	}
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-2-26 上午10:51:09 
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
		PersonalSalaryDTO other = (PersonalSalaryDTO) obj;
		if (fzxid == null) {
			if (other.fzxid != null){
				return false;
			}
		} else if (!fzxid.equals(other.fzxid)){
			return false;
		}
		if (fzxname == null) {
			if (other.fzxname != null){
				return false;
			}
		} else if (!fzxname.equals(other.fzxname)){
			return false;
		}
		if (grdk == null) {
			if (other.grdk != null){
				return false;
			}
		} else if (!grdk.equals(other.grdk)){
			return false;
		}
		if (gw == null) {
			if (other.gw != null){
				return false;
			}
		} else if (!gw.equals(other.gw)){
			return false;
		}
		if (gzsf == null) {
			if (other.gzsf != null){
				return false;
			}
		} else if (!gzsf.equals(other.gzsf)){
			return false;
		}
		if (khyf == null) {
			if (other.khyf != null){
				return false;
			}
		} else if (!khyf.equals(other.khyf)){
			return false;
		}
		if (month == null) {
			if (other.month != null){
				return false;
			}
		} else if (!month.equals(other.month)){
			return false;
		}
		if (msg == null) {
			if (other.msg != null){
				return false;
			}
		} else if (!msg.equals(other.msg)){
			return false;
		}
		if (status == null) {
			if (other.status != null){
				return false;
			}
		} else if (!status.equals(other.status)){
			return false;
		}
		if (xl == null) {
			if (other.xl != null){
				return false;
			}
		} else if (!xl.equals(other.xl)){
			return false;
		}
		if (ygid == null) {
			if (other.ygid != null){
				return false;
			}
		} else if (!ygid.equals(other.ygid)){
			return false;
		}
		if (ygname == null) {
			if (other.ygname != null){
				return false;
			}
		} else if (!ygname.equals(other.ygname)){
			return false;
		}
		return true;
	}
}
