/**
 * @Company 青鸟软通   
 * @Title: UserBehaviourComDAO.java 
 * @Package  com.haier.isales.behaviour.userbehaviourcom.dao
 * @author lizhenwei   
 * @date 2015年11月25日  13:54:48
 * @version V1.0   
 */
package com.haier.isales.behaviour.userbehaviourcom.dao;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.behaviour.userbehaviourcom.domain.UserBehaviourComDomain;
/** 
 * @ClassName: UserBehaviourComDAO
 * @Description: UserBehaviourCom的DAO接口定义类
 *  
 */
public interface UserBehaviourComDAO extends CommonDAO<UserBehaviourComDomain,Long>{
	/** 
	* @Description: 更新用户全纪录表中的退出时间
	* @author lizhenwei
	* @date 2015年11月25日 15:13:34 
	* @param entity
	* @return  
	*/ 
	public void updateUserComQuitTime(UserBehaviourComDomain entity);
	
	/** 
	* @Description: 通过loginName,operateDate,operationId
	* @author lizhenwei
	* @date 2015年11月25日  15:23:34 
	* @param entity
	* @return  
	*/ 
	public Long findIdByConditions(UserBehaviourComDomain entity);
}
