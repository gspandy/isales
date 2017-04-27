/**
* @Company 青鸟软通   
* @Title: AttendDutyClientImpl.java 
* @Package com.haier.isales.dailymgt.service.impl 
* @author lizhenwei  
* @date 2015-11-02 17:22:39 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.service.impl;

import com.haier.isales.dailymgt.abnormal.service.AttendabnormalService;
import com.haier.isales.dailymgt.dto.AttendabnormalDTO;
import com.haier.isales.dailymgt.service.AttendabnormalServiceClient;

/** 
 * @ClassName: AttendabnormalServiceClientImpl 
 * @Description: 考勤异常服务接口实现
 *  
 */
public class AttendabnormalServiceClientImpl implements AttendabnormalServiceClient {

	private AttendabnormalService attendabnormalService;
	/**
	* <p>Description: 获取最大异常考勤数服务接口实现</p> 
	* @author lizhenwei
	* @date 2015-11-02 17:19:41 
	* @param dto
	* @return 
	* @see com.haier.isales.dailymgt.service.AttendabnormalServiceClient#searchAbnormalCount(com.haier.isales.dailymgt.dto.AttendabnormalDTO) 
	*/ 
	@Override
	public Object searchAbnormalCount(AttendabnormalDTO dto) {
		
		String abnormalCnt = null;
		abnormalCnt = attendabnormalService.ObtainAttendabnCount(dto);
		return abnormalCnt;
	}

	/**
	* <p>Description: 更新考勤异常数据服务接口实现</p> 
	* @author lizhenwei
	* @date 2015-11-02 17:30:41 
	* @param dto
	* @return 
	 * @see com.haier.isales.dailymgt.service.AttendabnormalServiceClient#updateAttendAbnormal(com.haier.isales.dailymgt.dto.AttendabnormalDTO)
	 */
	@Override
	public Object updateAttendAbnormal(AttendabnormalDTO dto) {
		// TODO Auto-generated method stub
		attendabnormalService.updateAttendabnormal(dto);
		return null;
	}

	/**
	 * @return the attendabnormalService
	 */
	public AttendabnormalService getAttendabnormalService() {
		return attendabnormalService;
	}

	/**
	 * @param attendabnormalService the attendabnormalService to set
	 */
	public void setAttendabnormalService(AttendabnormalService attendabnormalService) {
		this.attendabnormalService = attendabnormalService;
	}

}
