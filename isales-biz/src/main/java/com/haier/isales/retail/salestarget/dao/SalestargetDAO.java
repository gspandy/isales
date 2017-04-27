/**
 * @Company 青鸟软通   
 * @Title: SalestargetDAO.java 
 * @Package  com.haier.isales.retail.salestarget.dao
 * @author Cao Rui   
 * @date 2014年12月22日  18:08:48
 * @version V1.0   
 */
package com.haier.isales.retail.salestarget.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.retail.salestarget.domain.SalestargetDomain;
/** 
 * @ClassName: SalestargetDAO
 * @Description: Salestarget的DAO接口定义类
 *  
 */
public interface SalestargetDAO extends CommonDAO<SalestargetDomain,Long>{
	
	public SalestargetDomain findPersonalTarget(@Param("entity")SalestargetDomain entity);
	
	public List<SalestargetDomain> getPersonalTargetList(@Param("entity")SalestargetDomain entity);
	
	public int updateByParams(SalestargetDomain entity);
	
}
