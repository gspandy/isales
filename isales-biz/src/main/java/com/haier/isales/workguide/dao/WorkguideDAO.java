/**
 * @Company 青鸟软通   
 * @Title: WorkguideDAO.java 
 * @Package  com.haier.isales.workguide.dao
 * @author Shao Jingkai   
 * @date 2015年06月11日  13:49:33
 * @version V1.0   
 */
package com.haier.isales.workguide.dao;

import java.util.List;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.workguide.domain.WorkguideDomain;
/** 
 * @ClassName: WorkguideDAO
 * @Description: Workguide的DAO接口定义类
 *  
 */
public interface WorkguideDAO extends CommonDAO<WorkguideDomain,Long>{
	/** 
	* @Description: TODO 获取所有的工作指引
	* @author Shao Jingkai   
	* @date 2015-6-11 下午2:31:44 
	* @return  
	*/ 
	public  List<WorkguideDomain> findAll();
}
