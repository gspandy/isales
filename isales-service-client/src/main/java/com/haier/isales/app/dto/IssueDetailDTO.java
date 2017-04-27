/**
* @Company 青鸟软通   
* @Title: IssueDetailDTO.java 
* @Package com.haier.isales.app.dto 
* @author R Core  
* @date 2015-3-3 下午12:55:08 
* @version V1.0   
*/ 
package com.haier.isales.app.dto;

import java.io.Serializable;

/** 
 * @ClassName: IssueDetailDTO 
 * @Description: 问题详细信息 包括回复追问
 *  
 */
public class IssueDetailDTO implements Serializable{

	private static final long serialVersionUID = -7963849053650737821L;
	
	private String rn;  //RN
	private String taskId;  //TASKID
	private String bindId;  //BINDID
	private String tbrbh;  //TBRBH
	private String tbr;  //TBR
	
	private String wtbt;  //WTBT
	private String wtsm;  //WTSM
	private String tbsj;  //TBSJ	
	private String jc;  //JC
	private String target;  //TARGET
	
	private String gm;  //GM
	private String cldz;  //CLDZ
	private String wtdlmc;  //WTDLMC
	private String jdnr;  //JDNR
	private String clsj;  //CLSJ
	private String clr;  //CLR
	
	/** 
	* <p>Description: </p> 
	* @author R Core  
	* @date 2015-3-13 下午1:41:49  
	*/ 
	public IssueDetailDTO() {
		super();
	}
	//=================getters & setters==================
	/**
	 * @Description: 属性 rn 的get方法 
	 * @return rn
	 */
	public String getRn() {
		return rn;
	}
	
	/**
	 * @Description: 属性 rn 的set方法 
	 * @param rn 
	 */
	public void setRn(String rn) {
		this.rn = rn;
	}
	
	/**
	 * @Description: 属性 bindId 的get方法 
	 * @return bindId
	 */
	public String getBindId() {
		return bindId;
	}
	
	/**
	 * @Description: 属性 bindId 的set方法 
	 * @param bindId 
	 */
	public void setBindId(String bindId) {
		this.bindId = bindId;
	}
	
	/**
	 * @Description: 属性 tbrbh 的get方法 
	 * @return tbrbh
	 */
	public String getTbrbh() {
		return tbrbh;
	}
	
	/**
	 * @Description: 属性 tbrbh 的set方法 
	 * @param tbrbh 
	 */
	public void setTbrbh(String tbrbh) {
		this.tbrbh = tbrbh;
	}
	
	/**
	 * @Description: 属性 tbr 的get方法 
	 * @return tbr
	 */
	public String getTbr() {
		return tbr;
	}
	
	/**
	 * @Description: 属性 tbr 的set方法 
	 * @param tbr 
	 */
	public void setTbr(String tbr) {
		this.tbr = tbr;
	}
	
	/**
	 * @Description: 属性 tbsj 的get方法 
	 * @return tbsj
	 */
	public String getTbsj() {
		return tbsj;
	}
	
	/**
	 * @Description: 属性 tbsj 的set方法 
	 * @param tbsj 
	 */
	public void setTbsj(String tbsj) {
		this.tbsj = tbsj;
	}
	
	/**
	 * @Description: 属性 wtbt 的get方法 
	 * @return wtbt
	 */
	public String getWtbt() {
		return wtbt;
	}
	
	/**
	 * @Description: 属性 wtbt 的set方法 
	 * @param wtbt 
	 */
	public void setWtbt(String wtbt) {
		this.wtbt = wtbt;
	}
	
	/**
	 * @Description: 属性 wtsm 的get方法 
	 * @return wtsm
	 */
	public String getWtsm() {
		return wtsm;
	}
	
	/**
	 * @Description: 属性 wtsm 的set方法 
	 * @param wtsm 
	 */
	public void setWtsm(String wtsm) {
		this.wtsm = wtsm;
	}
	
	/**
	 * @Description: 属性 target 的get方法 
	 * @return target
	 */
	public String getTarget() {
		return target;
	}
	
	/**
	 * @Description: 属性 target 的set方法 
	 * @param target 
	 */
	public void setTarget(String target) {
		this.target = target;
	}
	
	/**
	 * @Description: 属性 taskId 的get方法 
	 * @return taskId
	 */
	public String getTaskId() {
		return taskId;
	}
	
	/**
	 * @Description: 属性 taskId 的set方法 
	 * @param taskId 
	 */
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	/**
	 * @Description: 属性 jc 的get方法 
	 * @return jc
	 */
	public String getJc() {
		return jc;
	}
	
	/**
	 * @Description: 属性 jc 的set方法 
	 * @param jc 
	 */
	public void setJc(String jc) {
		this.jc = jc;
	}
	
	/**
	 * @Description: 属性 gm 的get方法 
	 * @return gm
	 */
	public String getGm() {
		return gm;
	}
	
	/**
	 * @Description: 属性 gm 的set方法 
	 * @param gm 
	 */
	public void setGm(String gm) {
		this.gm = gm;
	}
	
	/**
	 * @Description: 属性 cldz 的get方法 
	 * @return cldz
	 */
	public String getCldz() {
		return cldz;
	}
	
	/**
	 * @Description: 属性 cldz 的set方法 
	 * @param cldz 
	 */
	public void setCldz(String cldz) {
		this.cldz = cldz;
	}
	
	/**
	 * @Description: 属性 wtdlmc 的get方法 
	 * @return wtdlmc
	 */
	public String getWtdlmc() {
		return wtdlmc;
	}
	
	/**
	 * @Description: 属性 wtdlmc 的set方法 
	 * @param wtdlmc 
	 */
	public void setWtdlmc(String wtdlmc) {
		this.wtdlmc = wtdlmc;
	}
	
	/**
	 * @Description: 属性 jdnr 的get方法 
	 * @return jdnr
	 */
	public String getJdnr() {
		return jdnr;
	}
	
	/**
	 * @Description: 属性 jdnr 的set方法 
	 * @param jdnr 
	 */
	public void setJdnr(String jdnr) {
		this.jdnr = jdnr;
	}
	
	/**
	 * @Description: 属性 clsj 的get方法 
	 * @return clsj
	 */
	public String getClsj() {
		return clsj;
	}
	
	/**
	 * @Description: 属性 clsj 的set方法 
	 * @param clsj 
	 */
	public void setClsj(String clsj) {
		this.clsj = clsj;
	}
	
	/**
	 * @Description: 属性 clr 的get方法 
	 * @return clr
	 */
	public String getClr() {
		return clr;
	}
	
	/**
	 * @Description: 属性 clr 的set方法 
	 * @param clr 
	 */
	public void setClr(String clr) {
		this.clr = clr;
	}
	
	//==================toString====================
	/**
	* <p>Description: IssueDetailDTO自动生成的toString方法</p> 
	* @author R Core 
	* @date 2015-3-17 上午10:11:15 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "IssueDetailDTO [rn=" + rn + ", taskId=" + taskId + ", bindId="
				+ bindId + ", tbrbh=" + tbrbh + ", tbr=" + tbr + ", wtbt="
				+ wtbt + ", wtsm=" + wtsm + ", tbsj=" + tbsj + ", jc=" + jc
				+ ", target=" + target + ", gm=" + gm + ", cldz=" + cldz
				+ ", wtdlmc=" + wtdlmc + ", jdnr=" + jdnr + ", clsj=" + clsj
				+ ", clr=" + clr + "]";
	}
}
