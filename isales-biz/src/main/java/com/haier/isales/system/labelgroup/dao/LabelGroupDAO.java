/**
 * @Company 青鸟软通   
 * @Title: LabelGroupDAO.java 
 * @Package  com.haier.isales.system.labelGroup.dao
 * @author Guo Yuchao   
 * @date 2014年11月11日  15:58:02
 * @version V1.0   
 */
package com.haier.isales.system.labelgroup.dao;

import java.util.List;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.system.labelgroup.domain.LabelGroupDomain;
/** 
 * @ClassName: LabelGroupDAO
 * @Description: LabelGroup的DAO接口定义类
 *  
 */
public interface LabelGroupDAO extends CommonDAO<LabelGroupDomain,Long>{
	
	/**
	 * 
	* @Title: findGroupsByUser 
	* @Description: 根据用户id，获取用户所关联的所有标签组
	* @param opertorId
	* @return  
	* @throws
	 */
	public List<LabelGroupDomain> findGroupsByUser(Long opertorId);
}
