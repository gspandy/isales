/**
 * @Company 青鸟软通   
 * @Title: RetailDAO.java 
 * @Package  com.haier.isales.performance.retail.dao
 * @author John.zhao   
 * @date 2014年12月22日  14:41:06
 * @version V1.0   
 */
package com.haier.isales.performance.retail.dao;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.performance.retail.domain.RetailDomain;
import com.haier.isales.performance.retail.dto.RetailDTO;
/** 
 * @ClassName: RetailDAO
 * @Description: Retail的DAO接口定义类
 * 
 */
public interface RetailDAO extends CommonDAO<RetailDomain, String> {

	/** 
	* @Description: 查询个人实际零售额
	* @author John.zhao   
	* @date 2014-8-8 下午9:29:26 
	* @param yearMonth
	* @param empCode
	* @param proLineId
	* @return  
	*/ 
	public BigDecimal getPersonActualRetail(@Param("yearMonth") String yearMonth, @Param("empCode") String empCode,
			@Param("proLineId") String proLineId);

	/** 
	* @Description: 查询整体实际零售额
	* @author John.zhao   
	* @date 2014-8-8 下午9:29:49 
	* @param yearMonth
	* @param shopId
	* @return  
	*/ 
	public BigDecimal getOrgActualRetail(@Param("yearMonth") String yearMonth, @Param("shopId") String shopId);

	/** 
	* @Description: 查询整体目标零售额
	* @author John.zhao   
	* @date 2014-8-8 下午9:30:08 
	* @param yearMonth
	* @param shopId
	* @return  
	*/ 
	public BigDecimal getOrgTargetRetail(@Param("yearMonth") String yearMonth, @Param("shopId") String shopId);
	
	/** 
	* @Description: 查询个人实际零售额趋势折线图
	* @author John.zhao   
	* @date 2014-8-8 下午9:30:25 
	* @param retailDTO
	* @return  
	*/ 
	public List<RetailDTO> getPersonActualChart(@Param("model")RetailDTO retailDTO);
	/** 
	* @Description: 业绩 销量查询个人实际销量   参数时间格式 yyyy-MM  返回值时间格式 yy-M
	* @author Guo Yuchao   
	* @date 2014-12-23 上午10:02:34 
	* @param retailDTO
	* @return  
	*/ 
	List<RetailDTO> findPerBtbRetail(@Param("model")RetailDTO retailDTO);
}
