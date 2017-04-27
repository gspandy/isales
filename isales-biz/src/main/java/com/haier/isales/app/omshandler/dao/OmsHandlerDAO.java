/**
 * @Company 青鸟软通   
 * @Title: OmsHandlerDAO.java 
 * @Package  com.haier.isales.app.omshandler.dao
 * @author Guo Yuchao   
 * @date 2015年02月05日  19:26:42
 * @version V1.0   
 */
package com.haier.isales.app.omshandler.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.app.dto.BpmIssueSearchDTO;
import com.haier.isales.app.omshandler.domain.OmsHandlerDomain;
import com.haier.isales.common.dao.CommonDAO;
/** 
 * @ClassName: OmsHandlerDAO
 * @Description: OmsHandler的DAO接口定义类
 *  
 */
public interface OmsHandlerDAO extends CommonDAO<OmsHandlerDomain,Long>{
	/** 
	* @Description:查询所有中心编码
	* @author Guo Yuchao   
	* @date 2015-2-5 下午9:28:19 
	* @return  
	*/ 
	List<String> findTradeCodeList();

	/** 
	* @Description: 批量保存数据
	* @author Guo Yuchao   
	* @date 2015-2-5 下午9:35:55 
	* @param omsHandlerList  
	*/ 
	void saveAfterDeleteOmsHandlerTemp(@Param("omsHandlerList")List<OmsHandlerDomain> omsHandlerList);

	/** 
	* @Description: 查询第一处理人
	* @author Guo Yuchao   
	* @date 2015-2-5 下午10:58:40 
	* @param bpmIssueSearchDTO
	* @return  
	*/ 
	List<OmsHandlerDomain> findByTradeCode(@Param("item")BpmIssueSearchDTO bpmIssueSearchDTO);
	
	/** 
	* @Description: 删除表内数据 
	* @author Guo Yuchao   
	* @date 2015-2-6 上午9:48:14   
	*/ 
	void deleteAllRows();
}
