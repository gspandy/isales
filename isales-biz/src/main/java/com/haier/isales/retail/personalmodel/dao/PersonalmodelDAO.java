/**
 * @Company 青鸟软通   
 * @Title: PersonalmodelDAO.java 
 * @Package  com.haier.isales.retail.personalmodel.dao
 * @author Cao Rui   
 * @date 2014年12月03日  11:06:59
 * @version V1.0   
 */
package com.haier.isales.retail.personalmodel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bana.common.util.page.PageCond;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.retail.personalmodel.domain.PersonalmodelDomain;
/** 
 * @ClassName: PersonalmodelDAO
 * @Description: Personalmodel的DAO接口定义类
 *  
 */
public interface PersonalmodelDAO extends CommonDAO<PersonalmodelDomain,Long>{
	
	void updatePersonalModel(@Param("entity") PersonalmodelDomain deleteDomain);
	
	void deletePersonalModel(@Param("entity") PersonalmodelDomain deleteDomain);
	
	/** 
	* @Description: 改为从btb_ratail表里查询常用型号
	* @author Cao Rui  
	* @date 2015年07月14日  14:58:34 
	* @param entity
	* @return  
	*/ 
	public List<PersonalmodelDomain> findByParamsFromBtbRatail(@Param("entity")PersonalmodelDomain entity,@Param("pageCond")PageCond pageCond);
	
}
