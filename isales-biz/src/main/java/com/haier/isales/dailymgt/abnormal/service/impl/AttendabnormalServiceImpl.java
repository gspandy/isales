/**
 * @Company 青鸟软通   
 * @Title: AttendabnormalService.java 
 * @Package  com.haier.isales.dailymgt.abnormal.service.impl
 * @author lizhenwei   
 * @date 2015年10月30日  15:09:33
 * @version V1.0   
 */
package com.haier.isales.dailymgt.abnormal.service.impl;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.dailymgt.abnormal.dao.AbnormalLogDAO;
import com.haier.isales.dailymgt.abnormal.dao.AttendabnormalDAO;
import com.haier.isales.dailymgt.abnormal.domain.AbnormalLogDomain;
import com.haier.isales.dailymgt.abnormal.domain.AttendabnormalDomain;
import com.haier.isales.dailymgt.abnormal.service.AttendabnormalService;
import com.haier.isales.dailymgt.dto.AttendabnormalDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: AttendabnormalService
 * @Description: Attendabnormal的Service接口定义类
 *  
 */
public class AttendabnormalServiceImpl implements AttendabnormalService{

	private static final Logger LOG = LoggerFactory.getLogger(AttendabnormalServiceImpl.class);
	
	/** 
	* @Fields attendabnormalDao : AttendabnormalDao 工具依赖 
	*/
	private AttendabnormalDAO attendabnormalDao;
	/** 
	* @Fields abnormalLogDAO : AbnormalLogDAO 工具依赖 
	*/
	private AbnormalLogDAO abnormalLogDAO;
	
	/*===============业务方法=============*/
	
	/* 
	 * 根据user_code（工号）查询该用户考勤异常信息
	 */
	@Override
	public List<AttendabnormalDomain> getAttendabList(AttendabnormalDTO queryEntity) {
		LOG.info("进入查询用户考勤异常信息的service方法！");
		
		//AttendabnormalDomain domain = new AttendabnormalDomain();
		//String userCode = queryEntity.getUserCode();
		List<AttendabnormalDomain> attendAbList = attendabnormalDao.findByUserCode(queryEntity);
		
		return attendAbList;
	}
	
	/* 
	 * 根据user_code（工号）\attendanceMonth(考勤月份)查询该用户最大考勤异常数
	 */
	@Override
	public String ObtainAttendabnCount(AttendabnormalDTO queryEntity) {
		LOG.info("进入查询最大考勤异常数的service方法！");
		// 初始化最大考勤异常数 abnormalCount
		String abnormalCount = "";
		String userCode = queryEntity.getUserCode();
		String attendanceMonth = queryEntity.getAttendanceMonth();
		// 首先查询考勤月份是否有值
		List<AttendabnormalDomain> abDomainList = getAttendabList(queryEntity);
		//domain = attendabnormalDao.findByUserCode(userCode);
		//System.out.println("abDomain:" + abDomain);
		// 如果无数据,则插入数据
		if (abDomainList.size() == 0) {
			AttendabnormalDomain entity = new AttendabnormalDomain();
			entity.setUserCode(userCode);
			// 如果abDomain== null,则查询userName
			AttendabnormalDTO dto = new AttendabnormalDTO();
			String userName = "";
			dto.setUserCode(userCode);
			List<AttendabnormalDomain> abList = getAttendabList(dto);
			AttendabnormalDomain domain = abList.get(0);
			userName = domain.getUserName();
			entity.setUserName(userName);
			// 考勤最大数默认值为3
			entity.setAbnormalCount("3");
			entity.setAttendanceMonth(attendanceMonth);
			
			attendabnormalDao.save(entity);
		} else {
			// 如果考勤月份为0000-00时，则更新该字段
			AttendabnormalDomain abDomain = abDomainList.get(0);
			if (("0000-00").equals(abDomain.getAttendanceMonth())) {
				
				updateAttendabnormal(queryEntity);
			}
			// 如果考勤月份与数据库月份不符，或数据库没有该考勤月份的数据，则插入一条数据
			if (!abDomain.getAttendanceMonth().equals(attendanceMonth)) {
				AttendabnormalDomain entity = new AttendabnormalDomain();
				entity.setUserCode(userCode);
				// 如果abDomain== null,则查询userName
				AttendabnormalDTO dto = new AttendabnormalDTO();
				String userName = abDomain.getUserName();
				entity.setUserName(userName);
				// 考勤最大数默认值为3
				entity.setAbnormalCount("3");
				entity.setAttendanceMonth(attendanceMonth);
				
				attendabnormalDao.save(entity);
			}
		}
		
		abnormalCount = attendabnormalDao.findAbCountByUserCode(userCode, attendanceMonth);
		
		return abnormalCount;
	}


	/* 
	 * 更新异常考勤数据, 并记录考勤异常日志表
	 */
	@Override
	public void updateAttendabnormal(AttendabnormalDTO dto) {
		LOG.info("进入更新异常考勤数据service方法");
		
		AttendabnormalDomain domain = ClonePojoUtil.copyClassFromTo(dto, 
				AttendabnormalDomain.class);
		// 将dto中的String类型的signtime赋值到domain中的date类型的signtime
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//  从签到签退时间截取考勤月份
		SimpleDateFormat asdf = new SimpleDateFormat("yyyy-MM");
		
		AbnormalLogDomain abnormalLogDomain = null;
		
		Date dSignTime = null;
		
		if (null != dto.getStrSignTime() && !("").equals(dto.getStrSignTime())) {
			try {
				dSignTime = sdf.parse(dto.getStrSignTime());
			} catch (ParseException e) {
				LOG.error("签到签退时间转化失败！");
			}
			domain.setSignTime(dSignTime);
		}
		
		String attendanceMonth = dto.getAttendanceMonth();
		
		if (("").equals(attendanceMonth) || null == attendanceMonth) {
			// 如果考勤月份没有值，则从签到签退时间截取
			Date dAttendMonth = null;
			try {
				dAttendMonth = asdf.parse(dto.getStrSignTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				LOG.error("考勤月份转化失败！");
			}
			attendanceMonth = asdf.format(dAttendMonth);
			domain.setAttendanceMonth(attendanceMonth);
		}
		
		// 更新时间为当前时间
		domain.setUpdateTime(new Date());
		
		attendabnormalDao.updateAttendabnormal(domain);
		
		// 首先查询考勤月份
		//AttendabnormalDomain abDomain = getAttendabInfo(dto);
		//domain = attendabnormalDao.findByUserCode(userCode);
		
		if (null != dto.getType() && !("").equals(dto.getType())) {
			
			abnormalLogDomain = new AbnormalLogDomain();
			abnormalLogDomain.setUserCode(dto.getUserCode());
			abnormalLogDomain.setAttendanceMonth(attendanceMonth);
			abnormalLogDomain.setReason(dto.getReason());
			abnormalLogDomain.setSignTime(dSignTime);
			
			// 如果存在逗号，则插入两条数据
			if (dto.getType().contains(",")) {
				
				String [] arrType = dto.getType().split(",");
				
				for (int i = 0; i < arrType.length; i++) {
					
					abnormalLogDomain.setType(arrType[i]);
					abnormalLogDAO.save(abnormalLogDomain);
					LOG.info("插入考勤异常日志表");
				}
			} else {
				abnormalLogDomain.setType(dto.getType());
				abnormalLogDAO.save(abnormalLogDomain);
				LOG.info("插入考勤异常日志表");
			}
		}
		
		LOG.info("更新异常考勤service方法结束");
	}
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性attendabnormalDao 的set方法 
	 */
	public void setAttendabnormalDao(AttendabnormalDAO attendabnormalDao){
		this.attendabnormalDao = attendabnormalDao;
	}

	/**
	 * @param abnormalLogDAO the abnormalLogDAO to set
	 */
	public void setAbnormalLogDAO(AbnormalLogDAO abnormalLogDAO) {
		this.abnormalLogDAO = abnormalLogDAO;
	}
	
}
