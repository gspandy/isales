/**
 * @Company 青鸟软通   
 * @Title: UserDTO.java 
 * @Package com.haier.isales.system 
 * @author cao rui   
 * @date 2015-4-27 上午9:54:37 
 * @version V1.0   
 */
package com.haier.isales.salerinfo.personalinfo.dto;

import java.io.Serializable;

/**
 * @ClassName: ReportsalesAuthorityDTO
 * @Description: 用户对应的录入销量权限
 * 
 */
public class ReportsalesAuthorityDTO implements Serializable {

	private static final long serialVersionUID = -1415868819314L;

	/**
	 * @Fields isAllowedToReportSales : 是否允许录入销量 true、false
	 */
	private boolean isAllowed;
	/**
	 * @Fields msg : 信息，如不允许录入销量，则提示明确的信息
	 */
	private String msg;
	/* =========================getter and setter =================== */

	/**
	* <p>Description: </p> 
	* @author cao rui   
	* @date 2015-4-27 上午9:54:37 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ReportsalesAuthorityDTO [isAllowed=" + isAllowed + ", msg=" + msg + "]";
	}


	/**
	 * @Description: 属性 isAllowed 的get方法 
	 * @return isAllowed
	 */
	public boolean isAllowed() {
		return isAllowed;
	}

	/**
	 * @Description: 属性 isAllowed 的set方法 
	 * @param isAllowed 
	 */
	public void setAllowed(boolean isAllowed) {
		this.isAllowed = isAllowed;
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

}
