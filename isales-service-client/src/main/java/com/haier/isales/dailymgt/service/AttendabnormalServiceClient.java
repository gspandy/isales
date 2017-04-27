/**
* @Company 青鸟软通   
* @Title: AgentClient.java 
* @Package com.haier.isales.system.service 
* @author lizhenwei
* @date 2015-09-15 下午17:24:12 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.service;

import com.haier.isales.dailymgt.dto.AttendabnormalDTO;

/** 
 * @ClassName: AgentClient 
 * @Description: 
 *  
 */

public interface AttendabnormalServiceClient {
	
	/**
	 * 根据usercode\attendanceMonth获取最大考勤异常数
	 * @Title: searchAbnormalCount
	* @Description: 
	* @param dto 入参的实体 
	 */
	public Object searchAbnormalCount(AttendabnormalDTO dto);
	
	/**
	 * 更新考勤异常数据
	 * @Title: updateAttendAbnormal
	* @Description: 
	* @param attendabnormalDTO  入参的实体
	 */
	public Object updateAttendAbnormal(AttendabnormalDTO attendabnormalDTO);
	
}
