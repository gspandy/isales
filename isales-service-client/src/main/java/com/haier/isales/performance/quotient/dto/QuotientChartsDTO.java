/**
 * @Company 青鸟软通   
 * @Title: QuotientChartsDTO.java 
 * @Package com.haier.isales.performance.quotient.dto 
 * @author John.zhao   
 * @date 2014-12-19 下午1:47:22 
 * @version V1.0   
 */
package com.haier.isales.performance.quotient.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName: QuotientChartsDTO
 * @Description: 份额走势图返回结果DTO，四个list，分别代表年月、目标 、实际份额、同期份额
 * 
 */
public class QuotientChartsDTO implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -7945894453934682302L;

	/** 
	* @Fields yearMonth : 年月 
	*/ 
	private List<String> yearMonth;

	/** 
	* @Fields target : 目标 
	*/ 
	private List<BigDecimal> target;

	/** 
	* @Fields actual :实际份额
	*/ 
	private List<BigDecimal> actual;

	/** 
	* @Fields period :同期份额
	*/ 
	private List<BigDecimal> period;

	/**
	 * @Description: 属性 yearMonth 的get方法 
	 * @return yearMonth
	 */
	public List<String> getYearMonth() {
		return yearMonth;
	}

	/**
	 * @Description: 属性 yearMonth 的set方法 
	 * @param yearMonth 
	 */
	public void setYearMonth(List<String> yearMonth) {
		this.yearMonth = yearMonth;
	}

	/**
	 * @Description: 属性 target 的get方法 
	 * @return target
	 */
	public List<BigDecimal> getTarget() {
		return target;
	}

	/**
	 * @Description: 属性 target 的set方法 
	 * @param target 
	 */
	public void setTarget(List<BigDecimal> target) {
		this.target = target;
	}

	/**
	 * @Description: 属性 actual 的get方法 
	 * @return actual
	 */
	public List<BigDecimal> getActual() {
		return actual;
	}

	/**
	 * @Description: 属性 actual 的set方法 
	 * @param actual 
	 */
	public void setActual(List<BigDecimal> actual) {
		this.actual = actual;
	}

	/**
	 * @Description: 属性 period 的get方法 
	 * @return period
	 */
	public List<BigDecimal> getPeriod() {
		return period;
	}

	/**
	 * @Description: 属性 period 的set方法 
	 * @param period 
	 */
	public void setPeriod(List<BigDecimal> period) {
		this.period = period;
	}

	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:07:27 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "QuotientChartsDTO [yearMonth=" + yearMonth + ", target="
				+ target + ", actual=" + actual + ", period=" + period + "]";
	}
	
}
