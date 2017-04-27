/**
* @Company 青鸟软通   
* @Title: RegistChartDTO.java 
* @Package com.haier.isales.performance.leaguer 
* @author Guo Yuchao   
* @date 2014-12-18 下午1:33:41 
* @version V1.0   
*/ 
package com.haier.isales.performance.leaguer.dto;

import java.io.Serializable;
import java.util.List;

/** 
 * @ClassName: RegistChartDTO 
 * @Description:查询注册率信息 图表展示
 *  
 */
public class RegistChartDTO implements Serializable {

	/** 
	* @Fields serialVersionUID :
	*/ 
	private static final long serialVersionUID = 149826888022083866L;
	
	
	private List<String> yearMonth;//年月例如 2014-12
	private List<String> yearList;
	private List<String> monthList;
	private List<Long> countsList;//销量（已验证）
	private List<Long> registQtyList;// 注册量
	private List<Double> registRateList;//注册率

	
	
	
	
	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-12-18 下午1:56:05  
	*/ 
	public RegistChartDTO() {
		super();
	}
	public RegistChartDTO(List<String> yearMonth,List<Long> countsList,
			List<Long> registQtyList,List<Double> registRateList) {
		super();
		this.yearMonth = yearMonth;
		this.countsList = countsList;
		this.registQtyList = registQtyList;
		this.registRateList = registRateList;
	}



	/**
	 * @Description: 属性 yearList 的get方法 
	 * @return yearList
	 */
	public List<String> getYearList() {
		return yearList;
	}





	/**
	 * @Description: 属性 yearList 的set方法 
	 * @param yearList 
	 */
	public void setYearList(List<String> yearList) {
		this.yearList = yearList;
	}





	/**
	 * @Description: 属性 monthList 的get方法 
	 * @return monthList
	 */
	public List<String> getMonthList() {
		return monthList;
	}





	/**
	 * @Description: 属性 monthList 的set方法 
	 * @param monthList 
	 */
	public void setMonthList(List<String> monthList) {
		this.monthList = monthList;
	}





	


	/**
	 * @Description: 属性 countsList 的get方法 
	 * @return countsList
	 */
	public List<Long> getCountsList() {
		return countsList;
	}



	/**
	 * @Description: 属性 countsList 的set方法 
	 * @param countsList 
	 */
	public void setCountsList(List<Long> countsList) {
		this.countsList = countsList;
	}



	/**
	 * @Description: 属性 registQtyList 的get方法 
	 * @return registQtyList
	 */
	public List<Long> getRegistQtyList() {
		return registQtyList;
	}



	/**
	 * @Description: 属性 registQtyList 的set方法 
	 * @param registQtyList 
	 */
	public void setRegistQtyList(List<Long> registQtyList) {
		this.registQtyList = registQtyList;
	}


	/**
	 * @Description: 属性 registRateList 的get方法 
	 * @return registRateList
	 */
	public List<Double> getRegistRateList() {
		return registRateList;
	}



	/**
	 * @Description: 属性 registRateList 的set方法 
	 * @param registRateList 
	 */
	public void setRegistRateList(List<Double> registRateList) {
		this.registRateList = registRateList;
	}



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
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:06:42 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "RegistChartDTO [yearMonth=" + yearMonth + ", yearList="
				+ yearList + ", monthList=" + monthList + ", countsList="
				+ countsList + ", registQtyList=" + registQtyList
				+ ", registRateList=" + registRateList + "]";
	}




}
