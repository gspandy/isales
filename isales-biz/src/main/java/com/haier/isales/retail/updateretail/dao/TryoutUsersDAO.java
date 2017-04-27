/**
 * @Company 青鸟软通   
 * @Title: TryoutUsersDAO.java 
 * @Package  com.haier.isales.retail.tryoutusers.dao
 * @author John.zhao   
 * @date 2015年03月17日  11:36:39
 * @version V1.0   
 */
package com.haier.isales.retail.updateretail.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.retail.updateretail.domain.TryoutUsersDomain;
import com.haier.isales.retail.updatesales.dto.CheckUserInTableDTO;
/** 
 * @ClassName: TryoutUsersDAO
 * @Description: TryoutUsers的DAO接口定义类
 *  
 */
public interface TryoutUsersDAO extends CommonDAO<TryoutUsersDomain,Long>{
	List<TryoutUsersDomain> searchIfPersonInTable(@Param("entity")CheckUserInTableDTO checkUserInTableDTO);
}
