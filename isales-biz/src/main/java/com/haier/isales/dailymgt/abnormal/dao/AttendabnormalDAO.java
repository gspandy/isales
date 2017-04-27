/**
 * @Company 青鸟软通   
 * @Title: AttendabnormalDAO.java 
 * @Package  com.haier.isales.dailymgt.abnormal.dao
 * @author lizhenwei   
 * @date 2015年10月30日  15:08:57
 * @version V1.0   
 */
package com.haier.isales.dailymgt.abnormal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.dailymgt.abnormal.domain.AttendabnormalDomain;
import com.haier.isales.dailymgt.dto.AttendabnormalDTO;
/** 
 * @ClassName: AttendabnormalDAO
 * @Description: Attendabnormal的DAO接口定义类
 *  
 */
public interface AttendabnormalDAO extends CommonDAO<AttendabnormalDomain,Long>{
	
	/** 
	* @Description:根据userCode 来查询用户考勤异常信息
	* @author lizhenwei
	* @date 2015-11-05 上午10:26:49 
	* @param userCode
	* @return  domain
	*/ 
	List<AttendabnormalDomain> findByUserCode(@Param("entity") AttendabnormalDTO dto);
	
	/** 
	* @Description:根据userCode、attendanceMonth来查询用户最大考勤异常数
	* @author lizhenwei
	* @date 2015-10-30 下午04:16:49 
	* @param userCode
	* @param abnormalCount
	* @return  
	*/ 
	String findAbCountByUserCode(@Param("userCode") String userCode, 
			@Param("attendanceMonth") String attendanceMonth);
	
	/** 
	* @Description: 
	* @author lizhenwei
	* @date 2015-10-30 下午04:17:33 
	* @param entity
	* @return  
	*/ 
	int updateAttendabnormal(@Param("entity") AttendabnormalDomain attendabnormalDomain);
}
