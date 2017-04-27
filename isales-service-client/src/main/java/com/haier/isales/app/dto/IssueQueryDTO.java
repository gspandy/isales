package com.haier.isales.app.dto;

import java.io.Serializable;

public class IssueQueryDTO implements Serializable {

	private static final long serialVersionUID = -7539170885422121609L;
	
	private String rn;//RN;
	private String taskId;//TASKID; 任务编号
	private String bindId;//BINDID;流程编号
	
//	private String one;//ONE;问题大类
//	private String jc;//JC;级次
//	private String id;//ID;
	private String tbrbh;//TBRBH;提报人编号
	private String tbr;//TBR;提报人姓名
	
	private String tbsj;//TBSJ;提报时间
	private String wtbt;//WTBT;问题标题
	private String wtsm;//WTSM;问题说明
	private String target;//TARGET;处理人编号
	private String userName;//USERNAME;处理人姓名
	private String isEnd;//	ISEND	是否结束
	private String gm;//GM	工贸
	private String md;//	MD	门店
	private String cpz;//CPZ	产品组
	private String xsqd;//XSQD               	渠道
	private String beginTime;//	BEGINTIME	处理开始时间
	private String endTime;//ENDTIME	处理结束时间

	/** 
	* <p>Description: </p> 
	* @author R Core  
	* @date 2015-3-3 上午11:10:47  
	*/ 
	public IssueQueryDTO() {
		super();
	}
	
	/*==============getters & setters================*/
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
	 * @Description: 属性 md 的get方法 
	 * @return md
	 */
	public String getMd() {
		return md;
	}

	/**
	 * @Description: 属性 md 的set方法 
	 * @param md 
	 */
	public void setMd(String md) {
		this.md = md;
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
	 * @Description: 属性 isEnd 的get方法 
	 * @return isEnd
	 */
	public String getIsEnd() {
		return isEnd;
	}

	/**
	 * @Description: 属性 isEnd 的set方法 
	 * @param isEnd 
	 */
	public void setIsEnd(String isEnd) {
		this.isEnd = isEnd;
	}

	/**
	 * @Description: 属性 cpz 的get方法 
	 * @return cpz
	 */
	public String getCpz() {
		return cpz;
	}

	/**
	 * @Description: 属性 cpz 的set方法 
	 * @param cpz 
	 */
	public void setCpz(String cpz) {
		this.cpz = cpz;
	}

	/**
	 * @Description: 属性 xsqd 的get方法 
	 * @return xsqd
	 */
	public String getXsqd() {
		return xsqd;
	}

	/**
	 * @Description: 属性 xsqd 的set方法 
	 * @param xsqd 
	 */
	public void setXsqd(String xsqd) {
		this.xsqd = xsqd;
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
	 * @Description: 属性 beginTime 的get方法 
	 * @return beginTime
	 */
	public String getBeginTime() {
		return beginTime;
	}

	/**
	 * @Description: 属性 beginTime 的set方法 
	 * @param beginTime 
	 */
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	/**
	 * @Description: 属性 endTime 的get方法 
	 * @return endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @Description: 属性 endTime 的set方法 
	 * @param endTime 
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	/*==============toString===============*/
	/**
	* <p>Description:IssueQueryDTO自动生成的toString方法 </p> 
	* @author R Core 
	* @date 2015-3-13 下午3:59:02 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "IssueQueryDTO [rn=" + rn + ", taskId=" + taskId + ", bindId="
				+ bindId + ", tbsj=" + tbsj + ", gm=" + gm + ", tbrbh=" + tbrbh
				+ ", tbr=" + tbr + ", md=" + md + ", wtbt=" + wtbt + ", wtsm="
				+ wtsm + ", isEnd=" + isEnd + ", cpz=" + cpz + ", xsqd=" + xsqd
				+ ", target=" + target + ", userName=" + userName
				+ ", beginTime=" + beginTime + ", endTime=" + endTime + "]";
	}
}
