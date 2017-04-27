/**
 * @Company 青鸟软通   
 * @Title: UserDetailService.java 
 * @Package  com.haier.isales.salerinfo.userdetail.service.impl
 * @author Guo Yuchao   
 * @date 2014年11月21日  12:50:48
 * @version V1.0   
 */
package com.haier.isales.salerinfo.userdetail.service.impl;

import java.math.BigDecimal;
import java.util.Date;

import org.bana.common.util.basic.StringUtils;

import com.haier.isales.attachment.dao.AttachmentDAO;
import com.haier.isales.attachment.domain.AttachmentDomain;
import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.salerinfo.userdetail.dao.UserDetailDAO;
import com.haier.isales.salerinfo.userdetail.domain.UserDetailDomain;
import com.haier.isales.salerinfo.userdetail.service.UserDetailService;
import com.haier.isales.score.service.ScoreService;

/**
 * @ClassName: UserDetailService
 * @Description: UserDetail的Service接口定义类
 * 
 */
public class UserDetailServiceImpl implements UserDetailService {

	// private static final Logger LOG =
	// LoggerFactory.getLogger(UserDetailServiceImpl.class);

	/**
	 * @Fields userDetailDao : UserDetailDao 工具依赖
	 */
	private UserDetailDAO userDetailDao;
	private AttachmentDAO attachmentDao;
	private ScoreService scoreService;
	
	/* ===============业务方法============= */

	/**
	 * <p>
	 * Description:绑定用户头像
	 * </p>
	 * 
	 * @author Guo Yuchao
	 * @date 2014-11-21 下午1:34:36
	 * @param operatorId
	 * @param headPortraitId
	 * @see com.haier.isales.salerinfo.userdetail.service.UserDetailService#saveHeadPortrait(java.lang.Long,
	 *      java.lang.Long)
	 */
	@Override
	public UserDetailDomain saveHeadPortrait(Long operatorId, Long headPortraitId, String updateName) {
		if (operatorId == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "传入用户参数信息为空");
		}
		if (headPortraitId == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "没有找到头像信息");
		}
		UserDetailDomain userDetailDomain = userDetailDao.findById(operatorId);
		if (userDetailDomain == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "没有找到指定的用户信息");
		}
		AttachmentDomain attachmentDomain = attachmentDao.findById(headPortraitId);
		if (attachmentDomain == null) {
			throw new BusinessException(BusinessExceptionCode.database_none_data, "没有找到头像信息");
		}
		userDetailDomain.setHeadPortraitId(headPortraitId);
		userDetailDomain.setUpdateId(operatorId.toString());
		userDetailDomain.setUpdateTime(new Date());
		if (!StringUtils.isEmpty(updateName)) {
			userDetailDomain.setUpdateName(updateName);
		}
		userDetailDao.update(userDetailDomain);
		return userDetailDomain;
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author lenovo
	 * @date 2014年11月22日 下午2:49:36
	 * @return
	 * @see com.haier.isales.salerinfo.userdetail.service.UserDetailService#updateUserDetail()
	 */
	@Override
	public UserDetailDomain updateUserDetail(UserDetailDomain domain) {
		if (domain == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "传入用户参数信息为空");
		}
		// 查询用户是否存在
		UserDetailDomain findUserDetail = userDetailDao.findById(domain.getOperatorId());
		if (findUserDetail == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "没有找到指定的用户信息");
		}
		// 查询附件表中头像是否存在
		if (domain.getHeadPortraitId() != null) {
			AttachmentDomain attachmentDomain = attachmentDao.findById(domain.getHeadPortraitId());
			if (attachmentDomain == null) {
				throw new BusinessException(BusinessExceptionCode.database_none_data, "没有找到头像信息");
			}
		}

		domain.setUpdateTime(new Date());
		userDetailDao.updateUserDetail(domain);
		return domain;
	}

	/**
	 * <p>
	 * Description:根据主键查询用户详细信息实体
	 * </p>
	 * 
	 * @author Guo Yuchao
	 * @date 2014-11-21 下午2:03:27
	 * @param operatorId
	 * @return
	 * @see com.haier.isales.salerinfo.userdetail.service.UserDetailService#findById(java.lang.Long)
	 */
	@Override
	public UserDetailDomain findById(Long operatorId) {
		if (operatorId == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "传入用户主键为空");
		}
		UserDetailDomain userDetailDomain = userDetailDao.findById(operatorId);
		if(userDetailDomain == null){
			throw new BusinessException(BusinessExceptionCode.database_none_data, "获取用户信息为空");
		}
		CheckParamUtil.checkFieldIfNotBlank(userDetailDomain, "pointLevel","currentLevelPoint");
		Integer currentLevelTotalPoint = scoreService.getCurrentLevelScore(userDetailDomain.getPointLevel());
		if(currentLevelTotalPoint == null){
			throw new BusinessException(BusinessExceptionCode.param_error, "找不到本等级总分数");
		}
		BigDecimal lackPoint = new BigDecimal(currentLevelTotalPoint.toString()).subtract(new BigDecimal(userDetailDomain.getCurrentLevelPoint().toString()));
		userDetailDomain.setCurrentLevelTotalPoint(currentLevelTotalPoint);
		userDetailDomain.setCurrentLevelLackPoint(lackPoint.intValue());
		return userDetailDomain;
	}

	/* ====================getter and setter ================= */

	/**
	 * @Description: 属性userDetailDao 的set方法
	 */
	public void setUserDetailDao(UserDetailDAO userDetailDao) {
		this.userDetailDao = userDetailDao;
	}

	/**
	 * @Description: 属性 attachmentDao 的get方法
	 * @return attachmentDao
	 */
	public AttachmentDAO getAttachmentDao() {
		return attachmentDao;
	}

	/**
	 * @Description: 属性 attachmentDao 的set方法
	 * @param attachmentDao
	 */
	public void setAttachmentDao(AttachmentDAO attachmentDao) {
		this.attachmentDao = attachmentDao;
	}

	/**
	 * @Description: 属性 scoreService 的get方法 
	 * @return scoreService
	 */
	public ScoreService getScoreService() {
		return scoreService;
	}

	/**
	 * @Description: 属性 scoreService 的set方法 
	 * @param scoreService 
	 */
	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
	}

}
