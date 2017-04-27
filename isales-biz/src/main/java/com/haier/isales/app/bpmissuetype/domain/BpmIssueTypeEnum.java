/**
* @Company 青鸟软通   
* @Title: BpmIssueTypeEnum.java 
* @Package com.haier.isales.app.bpmissuetype.domain 
* @author Guo Yuchao   
* @date 2015-1-28 下午9:41:34 
* @version V1.0   
*/ 
package com.haier.isales.app.bpmissuetype.domain;

/** 
 * @ClassName: BpmIssueTypeEnum 
 *  
 *  
 */
public enum BpmIssueTypeEnum {
	  问题大类("101","high_class")
	, 问题小类("102","small_class")
	, 产品组("103","pro_line")
	, bu("104","bu_code")
	, 渠道("105","channel")
	, 其它("106","");
	private String typeKey;//自定义编号  使用
	private String columnValue;//拼写sql使用
	private BpmIssueTypeEnum(String typeKey, String columnValue) {
		this.typeKey = typeKey;
		this.columnValue = columnValue;
	}
	public static BpmIssueTypeEnum getByTypeKey(String typeKey){
		for(BpmIssueTypeEnum t : BpmIssueTypeEnum.values()){
			if(t.getTypeKey().equals(typeKey)){
				return t;
			}
		}
		return 其它;
	}
	public String getTypeKey() {
		return typeKey;
	}
	public void setTypeKey(String typeKey) {
		this.typeKey = typeKey;
	}
	public String getColumnValue() {
		return columnValue;
	}
	public void setColumnValue(String columnValue) {
		this.columnValue = columnValue;
	}
	
}
