/**
 * @Company 青鸟软通   
 * @Title: ReportsalesService.java 
 * @Package  com.haier.isales.retail.reportsales.service
 * @author John Zhao   
 * @date 2014年11月11日  17:37:36
 * @version V1.0   
 */
package com.haier.isales.retail.reportsales.service;
import com.haier.isales.common.ScoreResult;
import com.haier.isales.retail.reportsales.domain.ReportsalesDomain;
import com.haier.isales.retail.searchsales.dto.SearchModelSalesDTO;
/**
 * @ClassName: ReportsalesService
 * @Description: 销量提报的Service接口定义类
 * 
 */
public interface ReportsalesService {
	
	/** 
	* @Description: 把 按照条码录入销量的条目，修改为按照型号进行录入
	* @author Liu Wenjie   
	* @date 2015-1-5 下午6:34:47 
	* @return  
	*/ 
	public void updateReportType(String barCode);
	/** 
	* @Description: 根据指定的条码信息删除手机端信息保存的一条销量纪录，只是逻辑删除，修改标志位
	* @author Liu Wenjie   
	* @date 2015-1-5 下午6:23:36 
	* @param barCode 能查处多条记录时，将不仅型删除 
	* @param remark
	* @return  删除的数据实体 ,null标识没有数据
	*/ 
	public ReportsalesDomain deleteReportSalesByModule(String barCode,String remark);

	/**
	 * @Description: 按型号提报销量
	 * @author John Zhao
	 * @date 2014-11-11 下午5:44:34
	 * @param reportsalesDomain
	 * @return 返回同步的结果
	 */
	public ScoreResult saveReportSalesByModel(ReportsalesDomain reportsalesDomain);

	/**
	 * @Description: 按条码提报销量
	 * @author John Zhao
	 * @date 2014-11-11 下午5:44:37
	 * @param reportsalesDomain
	 */
	public ScoreResult saveReportSalesByBarCode(ReportsalesDomain reportsalesDomain);

	/**
	 * @Description: 调用webservice查询销量
	 * @author John Zhao
	 * @date 2014-11-17 下午3:25:15
	 * @param searchModelSalesDTO
	 * @return
	 */
	public Object searchModelSales(SearchModelSalesDTO searchModelSalesDTO);
}
