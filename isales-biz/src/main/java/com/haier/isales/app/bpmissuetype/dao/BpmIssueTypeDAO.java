/**
 * @Company 青鸟软通   
 * @Title: BpmIssueTypeDAO.java 
 * @Package  com.haier.isales.app.bpmissuetype.dao
 * @author Guo Yuchao   
 * @date 2015年01月28日  21:31:48
 * @version V1.0   
 */
package com.haier.isales.app.bpmissuetype.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.app.bpmissuetype.domain.BpmIssueTypeDomain;
import com.haier.isales.common.dao.CommonDAO;
/** 
 * @ClassName: BpmIssueTypeDAO
 * @Description: BpmIssueType的DAO接口定义类
 *  
 */
public interface BpmIssueTypeDAO extends CommonDAO<BpmIssueTypeDomain,Long>{
	/** 
	* @Description: 根据参数查询BPM问题类型列表  参数  
	*  highClass:问题大类        
	*  smallClass : 问题小类
	*  proLine : 产品组
	*  buCode : BU
	* @author Guo Yuchao   
	* @date 2015-1-28 下午10:05:58 
	* @param bpmIssueTypeDomain
	* @return  
	*/ 
	List<String> findBpmIssueType(@Param("entity")BpmIssueTypeDomain bpmIssueTypeDomain);
}
