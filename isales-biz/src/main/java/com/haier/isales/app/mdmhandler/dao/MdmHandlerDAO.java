/**
 * @Company 青鸟软通   
 * @Title: MdmHandlerDAO.java 
 * @Package  com.haier.isales.app.mdmhandler.dao
 * @author Guo Yuchao   
 * @date 2015年02月06日  12:40:24
 * @version V1.0   
 */
package com.haier.isales.app.mdmhandler.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.app.mdmhandler.domain.MdmHandlerDomain;
import com.haier.isales.common.dao.CommonDAO;
/** 
 * @ClassName: MdmHandlerDAO
 * @Description: MdmHandler的DAO接口定义类
 *  
 */
public interface MdmHandlerDAO extends CommonDAO<MdmHandlerDomain,Long>{
	List<MdmHandlerDomain> findShopTradeCode();

	/** 
	* @Description: 删除所有记录 
	* @author Guo Yuchao   
	* @date 2015-2-6 下午1:15:57   
	*/ 
	void deleteAll();


	/** 
	* @Description: 批量保存
	* @author Guo Yuchao   
	* @date 2015-2-6 下午1:19:15 
	* @param mdmHandlerList  
	*/ 
	void saveAfterDeleteMdmHandlerTemp(@Param("mdmHandlerList")List<MdmHandlerDomain> mdmHandlerList);
}
