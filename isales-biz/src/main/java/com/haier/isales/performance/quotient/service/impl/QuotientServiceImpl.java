/**
 * @Company 青鸟软通   
 * @Title: QuotientService.java 
 * @Package  com.haier.isales.performance.quotient.service.impl
 * @author John Zhao   
 * @date 2014年12月18日  14:20:57
 * @version V1.0   
 */
package com.haier.isales.performance.quotient.service.impl;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.performance.PerformanceEnum.IsAscendEnum;
import com.haier.isales.performance.quotient.dao.QuotientDAO;
import com.haier.isales.performance.quotient.domain.QuotientDomain;
import com.haier.isales.performance.quotient.service.QuotientService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: QuotientService
 * @Description: Quotient的Service接口定义类
 * 
 */
public class QuotientServiceImpl implements QuotientService {

	private static final Logger LOG = LoggerFactory.getLogger(QuotientServiceImpl.class);

	/**
	 * @Fields quotientDao : QuotientDao 工具依赖
	 */
	private QuotientDAO quotientDao;

	/* ===============业务方法============= */

	/**
	 * <p>
	 * Description:份额达成查询
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2014-12-18 下午7:00:54
	 * @param t
	 * @return
	 * @see com.haier.isales.performance.quotient.service.QuotientService#searchQuotientAccomplish(com.haier.isales.performance.quotient.domain.QuotientDomain)
	 */
	@Override
	public QuotientDomain searchQuotientAccomplish(QuotientDomain t) {
		LOG.info("查询份额达成传入的参数为：" + t);
		if (t == null) {
			throw new BusinessException(BusinessExceptionCode.param_error);
		}
		// 校验必需输入的字段
		CheckParamUtil.checkFieldIfNotBlank(t, "year", "month", "productLineNo");
		//
		if (t.getCustNo() == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "该用户没有所属门店");
		}
		QuotientDomain qd = quotientDao.searchQuotientAccomplish(t);
		if (qd == null) {
			QuotientDomain qdomain = new QuotientDomain();
			qdomain.setActual(BigDecimal.ZERO);
			qdomain.setTarget(BigDecimal.ZERO);
			qdomain.setCrrspdPeriod(BigDecimal.ZERO);
			qdomain.setIsAscend(IsAscendEnum.平稳.getValue());
			return qdomain;
		}
		if (qd.getActual() == null) {
			qd.setActual(BigDecimal.ZERO);
		}
		if (qd.getCrrspdPeriod() == null) {
			qd.setCrrspdPeriod(BigDecimal.ZERO);
		}
		if (qd.getTarget() == null) {
			qd.setTarget(BigDecimal.ZERO);
		}
		if (qd.getActual().compareTo(qd.getCrrspdPeriod()) > 0) {
			qd.setIsAscend(IsAscendEnum.上升.getValue());
		} else if (qd.getActual().compareTo(qd.getCrrspdPeriod()) == 0) {
			qd.setIsAscend(IsAscendEnum.平稳.getValue());
		} else {
			qd.setIsAscend(IsAscendEnum.下降.getValue());
		}

		return qd;
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2014-12-19 下午12:36:25
	 * @param t
	 * @return
	 * @see com.haier.isales.performance.quotient.service.QuotientService#searchQuotientCharts(com.haier.isales.performance.quotient.domain.QuotientDomain)
	 */
	@Override
	public List<QuotientDomain> searchQuotientCharts(QuotientDomain t) {
		LOG.info("查询份额达成传入的参数为：" + t);
		if (t == null) {
			throw new BusinessException(BusinessExceptionCode.param_error);
		}
		// 校验必需输入的字段
		CheckParamUtil.checkFieldIfNotBlank(t, "year", "month", "productLineNo");
		//
		if (t.getCustNo() == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "该用户没有所属门店");
		}
		Calendar ca = Calendar.getInstance();
		t.setYear(ca.get(Calendar.YEAR));
		t.setMonth(ca.get(Calendar.MONTH) + 1);
		List<QuotientDomain> listDomain = quotientDao.searchQuotientCharts(t);
		if (listDomain == null) {
			throw new BusinessException(BusinessExceptionCode.database_none_data);
		}
		return listDomain;
	}

	/* ====================getter and setter ================= */

	/**
	 * @Description: 属性quotientDao 的set方法
	 */
	public void setQuotientDao(QuotientDAO quotientDao) {
		this.quotientDao = quotientDao;
	}
}
