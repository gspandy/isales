/**
* @Company 青鸟软通   
* @Title: HolidayConstant.java 
* @Package com.haier.isales.dailymgt.legalholiday.domain 
* @author Guo Yuchao   
* @date 2015-2-3 上午9:38:59 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.legalholiday.domain;

/** 
 * @ClassName: HolidayConstant 
 * TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class HolidayConstant {
	/** 
	* @ClassName: HolidayTypeEnum 
	* 节假日类型 
	*  
	*/ 
	public enum HolidayTypeEnum {
		  节假日("101","节假日")
		, 调休上班("102","调休上班")
		, 其它("110","其它");
		  
		private String type;
		private String description;
		private HolidayTypeEnum(String type,String description) {
			this.type = type;
			this.description = description;
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
