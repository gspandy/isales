/**
 * @Company 青鸟软通   
 * @Title: OmsHandlerService.java 
 * @Package  com.haier.isales.app.omshandler.service
 * @author Guo Yuchao   
 * @date 2015年02月05日  19:27:17
 * @version V1.0   
 */
package com.haier.isales.app.omshandler.service;

import java.util.List;

import com.haier.isales.app.dto.BpmIssueSearchDTO;
import com.haier.isales.app.dto.OmsHandlerDTO;
import com.haier.isales.app.omshandler.domain.OmsHandlerDomain;

/** 
 * @ClassName: OmsHandlerService
 * @Description: OmsHandler的Service接口定义类
 *  
 */
public interface OmsHandlerService {
	/** 
	* @Description: 根据中心编号查询OMS系统问题处理人
	* @author Guo Yuchao   
	* @date 2015-2-5 下午8:46:17 
	* @param tradeCode
	* @return  
	*/ 
	List<OmsHandlerDomain> findOmsHandlerInBpm(String tradeCode);
		
	/** 
	* @Description: 保存OMS系统问题处理人信息到本系统中
	* @author Guo Yuchao   
	* @date 2015-2-5 下午9:30:26   
	*/ 
	void saveOmsHandlerTemp();

	/** 
	* @Description: 查询一级处理人
	* @author Guo Yuchao   
	* @date 2015-2-5 下午10:52:44 
	* @param orgCode
	* @return  
	*/ 
	List<OmsHandlerDTO> findBpmIssueHandlerLocal(BpmIssueSearchDTO bpmIssueSearchDTO);
}
