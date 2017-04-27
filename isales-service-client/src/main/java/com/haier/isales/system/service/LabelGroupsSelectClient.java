/**
* @Company 青鸟软通   
* @Title: LabelGroupsClient.java 
* @Package com.haier.isales.system.service 
* @author Liu Wenjie   
* @date 2014-11-21 下午10:05:42 
* @version V1.0   
*/ 
package com.haier.isales.system.service;


/** 
 * @ClassName: LabelGroupsClient 
 * @Description: 标签群客户端的使用的Dubbo接口
 *  
 */
public interface LabelGroupsSelectClient {
	/** 
	* @Description: 查询制定用户的标签组
	* @author Liu Wenjie   
	* @date 2014-11-21 下午10:07:44 
	* @param operatorId
	* @return  
	*/ 
	Object findGroupsByUser(Long operatorId);
}
