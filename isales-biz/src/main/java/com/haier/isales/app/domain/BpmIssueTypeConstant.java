/**
* @Company 青鸟软通   
* @Title: BpmIssueTypeConstant.java 
* @Package com.haier.isales.app.domain 
* @author Guo Yuchao   
* @date 2015-1-30 上午10:00:30 
* @version V1.0   
*/ 
package com.haier.isales.app.domain;


/** 
 * @ClassName: BpmIssueTypeConstant 
 * 问题返回相关基础资源
 *  
 */
public class BpmIssueTypeConstant {
	/** 
	* @ClassName: BpmDefaultIssueHandlerEnum 
	* 问题提报  bpm默认处理人 
	*  
	*/ 
	public enum BpmDefaultIssueHandlerEnum {
		  本系统默认处理人("bpm_default_issue_handler","101","")
		, 找不到处理人("bpm_default_issue_handler","120","A0003142");
		private String typeId;
		private String businId;
		private String businName;
		
		private BpmDefaultIssueHandlerEnum(String typeId, String businId,String businName) {
			this.businId = businId;
			this.typeId = typeId;
			this.businName = businName;
		}
		public String getBusinId() {
			return businId;
		}
		public void setBusinId(String businId) {
			this.businId = businId;
		}
		public String getTypeId() {
			return typeId;
		}
		public void setTypeId(String typeId) {
			this.typeId = typeId;
		}
		public String getBusinName() {
			return businName;
		}
		public void setBusinName(String businName) {
			this.businName = businName;
		}
		
	}
}
