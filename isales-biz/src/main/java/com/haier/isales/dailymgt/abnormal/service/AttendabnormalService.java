/**
 * @Company 青鸟软通   
 * @Title: AttendabnormalService.java 
 * @Package  com.haier.isales.dailymgt.abnormal.service
 * @author lizhenwei   
 * @date 2015年10月30日  15:09:33
 * @version V1.0   
 */
package com.haier.isales.dailymgt.abnormal.service;

import java.util.List;

import com.haier.isales.dailymgt.abnormal.domain.AttendabnormalDomain;
import com.haier.isales.dailymgt.dto.AttendabnormalDTO;

/** 
 * @ClassName: AttendabnormalService
 * @Description: Attendabnormal的Service接口定义类
 *  
 */
public interface AttendabnormalService {
	
	/**
	 * @throws Exception 
	* @Title: 根据userCode查询用户考勤异常信息
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryEntity
	* @return  AttendabnormalDomain
	* @throws
	 */
	public List<AttendabnormalDomain> getAttendabList(AttendabnormalDTO queryEntity);
	
	/**
	 * @throws Exception 
	* @Title: 查询用户考勤异常最大数
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryEntity
	* @return  
	* @throws
	 */
	public String ObtainAttendabnCount(AttendabnormalDTO queryEntity);
	
	/**
	 * 更新考勤异常记录
	* @Title: updateAttendabnormal 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param attendabnormalDTO
	* @throws
	 */
	public void updateAttendabnormal(AttendabnormalDTO attendabnormalDTO);
	
	
}
