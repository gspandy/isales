/**
* @Company 青鸟软通   
* @Title: BpmIssueTypeConstant.java 
* @Package com.haier.isales.app.domain 
* @author Guo Yuchao   
* @date 2015-1-30 上午10:00:30 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.domain;


/** 
 * @ClassName: BpmIssueTypeConstant 
 * @Description: 问题返回相关基础资源
 *  
 */
public class DailymgtConstant {
	/** 
	* @ClassName: AttendanceTypeEnum 
	* @Description: 签到类型 
	*  
	*/ 
	public enum AttendanceTypeEnum {
		  正常签到("101","正常出勤",20)
		, 未签退("102","未签退",30)
		, 未签到("103","未出勤",40)
		, 休班("104","休班",80)
		, 调休上班("106","调休上班",70)
		, 节假日("105","节假日",90)
		, 周末("108","周末",60)
		, 等待签到("107","等待签到",10)
		, 其它("110","",0);
		  
		private String type;
		private String description;
		private int level;
		private AttendanceTypeEnum(String type,String description,int level) {
			this.type = type;
			this.description = description;
			this.level = level;
		}


		public int getLevel() {
			return level;
		}


		public void setLevel(int level) {
			this.level = level;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}
		
		
	}
}
