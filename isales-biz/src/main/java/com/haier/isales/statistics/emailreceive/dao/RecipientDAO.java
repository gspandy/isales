/**
 * @Company 青鸟软通   
 * @Title: RecipientDAO.java 
 * @Package  com.haier.isales.statistics.emailreceive.dao
 * @author John.zhao   
 * @date 2014年12月04日  15:59:29
 * @version V1.0   
 */
package com.haier.isales.statistics.emailreceive.dao;

import java.util.List;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.statistics.emailreceive.domain.RecipientDomain;
/** 
 * @ClassName: RecipientDAO
 * @Description: Recipient的DAO接口定义类
 *  
 */
public interface RecipientDAO extends CommonDAO<RecipientDomain,Long>{

	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2014-12-4 下午4:08:07 
	* @return  
	*/ 
	List<RecipientDomain> findAll();
	
}
