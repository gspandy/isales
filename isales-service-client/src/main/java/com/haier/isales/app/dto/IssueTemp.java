/**
* @Company 青鸟软通   
* @Title: IssueTemp.java 
* @Package com.haier.isales.app.dto 
* @author Guo  Yuchao   
* @date 2015-1-30 上午10:32:10 
* @version V1.0   
*/ 
package com.haier.isales.app.dto;

import java.io.Serializable;
import java.util.List;

/** 
 * @ClassName: IssueTemp 
 * @Description: 临时封装 bpm返回的各种id 
 *  
 */
public class IssueTemp implements Serializable{

	private static final long serialVersionUID = 8260437571144651670L;
	
	private int processInstanceId;//流程号
	private List<Integer> taskIdList;//任务号 一般只有一个
	private int issueId;//问题号
	private String issueHandler;//处理人 一般为一级处理人
	private String tbrbh;//提报人编号
	public IssueTemp() {
		super();
	}
	
	/*============getters & setters============*/
	/**
	 * @Description: 属性 processInstanceId 的get方法 
	 * @return processInstanceId
	 */
	public int getProcessInstanceId() {
		return processInstanceId;
	}

	/**
	 * @Description: 属性 processInstanceId 的set方法 
	 * @param processInstanceId 
	 */
	public void setProcessInstanceId(int processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	/**
	 * @Description: 属性 taskIdList 的get方法 
	 * @return taskIdList
	 */
	public List<Integer> getTaskIdList() {
		return taskIdList;
	}

	/**
	 * @Description: 属性 taskIdList 的set方法 
	 * @param taskIdList 
	 */
	public void setTaskIdList(List<Integer> taskIdList) {
		this.taskIdList = taskIdList;
	}

	/**
	 * @Description: 属性 issueId 的get方法 
	 * @return issueId
	 */
	public int getIssueId() {
		return issueId;
	}

	/**
	 * @Description: 属性 issueId 的set方法 
	 * @param issueId 
	 */
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	/**
	 * @Description: 属性 issueHandler 的get方法 
	 * @return issueHandler
	 */
	public String getIssueHandler() {
		return issueHandler;
	}

	/**
	 * @Description: 属性 issueHandler 的set方法 
	 * @param issueHandler 
	 */
	public void setIssueHandler(String issueHandler) {
		this.issueHandler = issueHandler;
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
	
	/*=============toString=============*/
	/**
	* <p>Description:IssueTemp自动生成的toString方法 </p> 
	* @author R Core 
	* @date 2015-3-3 下午2:23:51 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "IssueTemp [processInstanceId=" + processInstanceId
				+ ", taskIdList=" + taskIdList + ", issueId=" + issueId
				+ ", issueHandler=" + issueHandler + ", tbrbh=" + tbrbh + "]";
	}
}
