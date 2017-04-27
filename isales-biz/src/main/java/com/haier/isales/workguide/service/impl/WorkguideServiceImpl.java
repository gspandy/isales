/**
 * @Company 青鸟软通   
 * @Title: WorkguideService.java 
 * @Package  com.haier.isales.workguide.service.impl
 * @author Shao Jingkai   
 * @date 2015年06月11日  13:50:48
 * @version V1.0   
 */
package com.haier.isales.workguide.service.impl;


import java.util.Date;
import java.util.Iterator;
import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.haier.isales.common.IsalesDateUtil;
import com.haier.isales.customer.dao.PotentialCustomerDAO;
import com.haier.isales.dailymgt.dao.DailyAttendanceDAO;
import com.haier.isales.dailymgt.domain.AttendanceTypeDomain;
import com.haier.isales.dailymgt.domain.DailymgtConstant.AttendanceTypeEnum;
import com.haier.isales.reminder.dao.ReminderBpmDAO;
import com.haier.isales.retail.reportretail.dao.BtbSjcjScrmAllDAO;
import com.haier.isales.retail.reportretail.dao.BtbSjcjScrmDAO;
import com.haier.isales.retail.reportretail.domain.BtbSjcjScrmAllDomain;
import com.haier.isales.retail.reportretail.domain.BtbSjcjScrmDomain;
import com.haier.isales.system.user.domain.UserFullInfoDomain;
import com.haier.isales.workguide.dao.WorkguideDAO;
import com.haier.isales.workguide.domain.WorkguideDomain;
import com.haier.isales.workguide.service.WorkguideService;

/** 
 * @ClassName: WorkguideService
 * @Description: Workguide的Service接口定义类
 *  
 */
public class WorkguideServiceImpl implements WorkguideService{

//	private static final Logger LOG = LoggerFactory.getLogger(WorkguideServiceImpl.class);
	
	/** 
	* @Fields workguideDao : WorkguideDao 工具依赖 
	*/
	private WorkguideDAO workguideDao;
	/** 
	* @Fields workguideDao : DailyAttendanceDao 工具依赖 
	*/
	private DailyAttendanceDAO dailyAttendanceDao;
	/** 
	* @Fields potentialCustomerDao : PotentialCustomerDao 工具依赖
	*/ 
	private PotentialCustomerDAO potentialCustomerDao;
	/** 
	* @Fields reminderBpmDao : reminderBpmDao 工具依赖
	*/ 
	private ReminderBpmDAO reminderBpmDao;
	/** 
	* @Fields btbSjcjScrmAllDao : btbSjcjScrmAllDao 工具依赖
	*/ 
	private BtbSjcjScrmAllDAO btbSjcjScrmAllDao;
	/** 
	* @Fields btbSjcjScrmDao : btbSjcjScrmDao 工具依赖
	*/ 
	private BtbSjcjScrmDAO btbSjcjScrmDao;
	
	/*===============业务方法=============*/
	@Override
	public List<WorkguideDomain> findAll(UserFullInfoDomain fullInfo) {
		List<WorkguideDomain> list = workguideDao.findAll();
		/* 曹瑞 2015-09-01 将t_isales_dailymgt_attendance表按中心拆分，按照用户所在中心操作不同的表
		 * 从参数中获取员工所在中心编码，该编码即为需要查询的表后缀名，
		 * 形式如 用户中心编码为12001时，相应操作的表为t_isales_dailymgt_attendance_12001
		 */
		String userOrgCode;
		if(null != fullInfo.getOrgCode() && !fullInfo.getOrgCode().equals("")){
			userOrgCode = fullInfo.getOrgCode();
		}else{
			userOrgCode = "10000";
		}
		for (Iterator<WorkguideDomain> it = list.iterator(); it.hasNext(); ) {
			WorkguideDomain wg = it.next();
			//签到签退
			if ("0001".equals(wg.getJobCode())) {
				AttendanceTypeDomain attendanceType 
						= dailyAttendanceDao.findDailyAttendStatus(fullInfo.getOperatorId(), IsalesDateUtil.toFormatString(new Date(), "yyyy-MM-dd"), userOrgCode);
				if (attendanceType == null || AttendanceTypeEnum.其它.getType().equals(attendanceType.getSignStatus())) {
					wg.setJobStatus("101");
					wg.setJobDesc("您今天还未签到");
				} else if (AttendanceTypeEnum.正常签到.getType().equals(attendanceType.getSignStatus())) {
					wg.setJobStatus("103");
					wg.setJobDesc("您今天已经签退");
				} else if (AttendanceTypeEnum.未签退.getType().equals(attendanceType.getSignStatus())) {
					wg.setJobStatus("102");
					wg.setJobDesc("您今天已经签到，还未签退");
				}
			}
			//报销量
			if ("0002".equals(wg.getJobCode())) {
				String shopCode = fullInfo.getShopId();
				String prolineCode = fullInfo.getMainProductId();
				BtbSjcjScrmAllDomain btbSjcjScrmAllDomain = btbSjcjScrmAllDao.findByShopCode(shopCode, prolineCode);
				BtbSjcjScrmDomain btbSjcjScrmDomain = btbSjcjScrmDao.findByShopCode(shopCode, prolineCode);
				Integer planCount = 0;
				Integer acturalCount = 0;
				Integer matchCount = 0;
				if (null != btbSjcjScrmAllDomain && null != btbSjcjScrmAllDomain.getRetailPlan()) {
					planCount = Integer.parseInt(btbSjcjScrmAllDomain.getRetailPlan());
				} 
				if (null != btbSjcjScrmAllDomain && null != btbSjcjScrmAllDomain.getRetailActual()) {
					acturalCount = Integer.parseInt(btbSjcjScrmAllDomain.getRetailActual());
				}
				if (null != btbSjcjScrmDomain && null != btbSjcjScrmDomain.getRetailActual()) {
					 matchCount = Integer.parseInt(btbSjcjScrmDomain.getRetailActual());
				} 
				wg.setJobDesc("计划"+planCount+"台  累计"+acturalCount+"台  匹配"+matchCount+"台");
				if (acturalCount == 0) {
					wg.setJobStatus("101");
				}
				if (acturalCount > 0 && acturalCount < planCount) {
					wg.setJobStatus("102");
				}
				if (acturalCount >= planCount) {
					wg.setJobStatus("103");
				}
			}
			//会员注册
			if ("0003".equals(wg.getJobCode())) {
				String shopCode = fullInfo.getShopId();
				String prolineCode = fullInfo.getMainProductId();
				BtbSjcjScrmDomain btbSjcjScrmDomain = btbSjcjScrmDao.findByShopCode(shopCode, prolineCode);
				Integer newCount = 0;
				Integer diffCount = 0;
				if (null != btbSjcjScrmDomain) {
					newCount = Integer.parseInt(btbSjcjScrmDomain.getMemberNew());
					diffCount = Integer.parseInt(btbSjcjScrmDomain.getMemberDiff());
				}
				wg.setJobStatus("102");
				wg.setJobDesc("新增会员"+newCount+"人 差异会员(不含统帅/卡萨帝)"+diffCount+"人");
			}
			//样机管理
			if ("0004".equals(wg.getJobCode())) {
				wg.setJobStatus("102");
				wg.setJobDesc("如果需要样机出样或核销，请及时操作");
			}
			//在线学习
			if ("0005".equals(wg.getJobCode())) {
				String userCode = fullInfo.getUserCode().trim().toUpperCase();
				if (userCode.startsWith("Z")) {
					wg.setJobStatus("102");
					wg.setJobDesc("您有未读的培训资料");
				} else {
					it.remove();
				}
			}
			//问题协同
			if ("0006".equals(wg.getJobCode())) {
				int reminderBpmCount = reminderBpmDao.getCountByUserCode(fullInfo.getUserCode());
				if (reminderBpmCount != 0) {
					wg.setJobStatus("102");
					wg.setJobDesc("您提报的问题有新回复");
				} else {
					wg.setJobStatus("102");
					wg.setJobDesc("提报协同问题");
				}
			}
			//潜客
			if ("0007".equals(wg.getJobCode())) {
				int potentialCustomerCount = potentialCustomerDao.getCountByOperatorId(fullInfo.getOperatorId());
				if (potentialCustomerCount != 0) {
					wg.setJobStatus("102");
					wg.setJobDesc("有新的潜客提醒");
				} else {
					it.remove();
				}
			}
			//个人信息
			if ("0008".equals(wg.getJobCode())) {
				it.remove();
			}
		}
		return list;
	}
	
	/*==================== setters =================*/	
	/**
	 * @Description: 属性workguideDao 的set方法 
	 */
	public void setWorkguideDao(WorkguideDAO workguideDao){
		this.workguideDao = workguideDao;
	}
	/**
	 * @Description: 属性 dailyAttendanceDao 的set方法 
	 * @param dailyAttendanceDao 
	 */
	public void setDailyAttendanceDao(DailyAttendanceDAO dailyAttendanceDao) {
		this.dailyAttendanceDao = dailyAttendanceDao;
	}
	/**
	 * @Description: 属性 potentialCustomerDao 的set方法 
	 * @param potentialCustomerDao 
	 */
	public void setPotentialCustomerDao(PotentialCustomerDAO potentialCustomerDao) {
		this.potentialCustomerDao = potentialCustomerDao;
	}
	/**
	 * @Description: 属性 reminderBpmDao 的set方法 
	 * @param reminderBpmDao 
	 */
	public void setReminderBpmDao(ReminderBpmDAO reminderBpmDao) {
		this.reminderBpmDao = reminderBpmDao;
	}
	/**
	 * @Description: 属性 btbSjcjScrmAllDao 的set方法 
	 * @param btbSjcjScrmAllDao 
	 */
	public void setBtbSjcjScrmAllDao(BtbSjcjScrmAllDAO btbSjcjScrmAllDao) {
		this.btbSjcjScrmAllDao = btbSjcjScrmAllDao;
	}
	/**
	 * @Description: 属性 btbSjcjScrmDao 的set方法 
	 * @param btbSjcjScrmDao 
	 */
	public void setBtbSjcjScrmDao(BtbSjcjScrmDAO btbSjcjScrmDao) {
		this.btbSjcjScrmDao = btbSjcjScrmDao;
	}
}
