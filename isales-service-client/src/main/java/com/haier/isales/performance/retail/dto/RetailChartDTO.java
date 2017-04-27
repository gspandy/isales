/**
 * @Company 青鸟软通   
 * @Title: RetailChartDTO.java 
 * @Package com.haier.isales.performance.retail 
 * @author Guo Yuchao  
 * @date 2014-12-23 10:17:58
 * @version V1.0   
 */
package com.haier.isales.performance.retail.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName: RetailChartDTO
 * @Description: 我的业绩-零售额/销量 走势图使用
 * 
 */
public class RetailChartDTO implements Serializable {

	/**
	 * @Fields serialVersionUID :
	 */
	private static final long serialVersionUID = 8158026579897506180L;

	/**
	 * @Fields yearMonth : 日期
	 */
	private List<String> yearMonth;

	/**
	 * @Fields target : 目标
	 */
	private List<BigDecimal> targetList;

	/**
	 * @Fields actual : 实际
	 */
	private List<BigDecimal> actualList;
	
	/** 
	* @Fields periodList : 同期
	*/ 
	private List<BigDecimal> periodList;
	

	/**
	 * @Fields completionRate : 完成率
	 */
	private List<BigDecimal> completionRateList;

	/**
	 * @author Guo Yuchao
	 * @date 2014-12-23 上午10:21:53
	 */
	public RetailChartDTO(List<String> yearMonth, List<BigDecimal> targetList,
			List<BigDecimal> actualList, List<BigDecimal> completionRateList) {
		super();
		this.yearMonth = yearMonth;
		this.targetList = targetList;
		this.actualList = actualList;
		this.completionRateList = completionRateList;
	}
	public RetailChartDTO(List<String> yearMonth, List<BigDecimal> targetList,
			List<BigDecimal> actualList) {
		super();
		this.yearMonth = yearMonth;
		this.targetList = targetList;
		this.actualList = actualList;
	}

	public RetailChartDTO() {
		super();
	}
	
	/*===========getter and setter===========*/
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
	 * @Description: 属性 targetList 的get方法
	 * @return targetList
	 */
	public List<BigDecimal> getTargetList() {
		return targetList;
	}

	/**
	 * @Description: 属性 targetList 的set方法
	 * @param targetList
	 */
	public void setTargetList(List<BigDecimal> targetList) {
		this.targetList = targetList;
	}

	/**
	 * @Description: 属性 actualList 的get方法
	 * @return actualList
	 */
	public List<BigDecimal> getActualList() {
		return actualList;
	}

	/**
	 * @Description: 属性 actualList 的set方法
	 * @param actualList
	 */
	public void setActualList(List<BigDecimal> actualList) {
		this.actualList = actualList;
	}

	/**
	 * @Description: 属性 completionRateList 的get方法
	 * @return completionRateList
	 */
	public List<BigDecimal> getCompletionRateList() {
		return completionRateList;
	}

	/**
	 * @Description: 属性 completionRateList 的set方法
	 * @param completionRateList
	 */
	public void setCompletionRateList(List<BigDecimal> completionRateList) {
		this.completionRateList = completionRateList;
	}
	/**
	 * @Description: 属性 periodList 的get方法 
	 * @return periodList
	 */
	public List<BigDecimal> getPeriodList() {
		return periodList;
	}
	/**
	 * @Description: 属性 periodList 的set方法 
	 * @param periodList 
	 */
	public void setPeriodList(List<BigDecimal> periodList) {
		this.periodList = periodList;
	}
	
	/*==============toString==============*/
	/**
	* <p>Description: RetailChartDTO自动生成的toString方法</p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:08:06 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "RetailChartDTO [yearMonth=" + yearMonth + ", targetList="
				+ targetList + ", actualList=" + actualList + ", periodList="
				+ periodList + ", completionRateList=" + completionRateList
				+ "]";
	}
}
