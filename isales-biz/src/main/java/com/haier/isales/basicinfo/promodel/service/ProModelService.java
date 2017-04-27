/**
 * @Company 青鸟软通   
 * @Title: ProModelService.java 
 * @Package  com.haier.isales.basicInfo.proModel.service
 * @author Guo Yuchao   
 * @date 2014年11月15日  11:42:33
 * @version V1.0   
 */
package com.haier.isales.basicinfo.promodel.service;

import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.basicinfo.promodel.domain.ProModelDomain;

/** 
 * @ClassName: ProModelService
 * @Description: ProModel的Service接口定义类
 *  
 */
public interface ProModelService {
	/** 
	* @Description: 根据条形码查询产品型号信息
	* @author Guo Yuchao   
	* @date 2014-11-15 上午11:55:26 
	* @param barCode
	* @return  
	*/ 
	ProModelDomain findProModelInfoByBarCode(String barCode);
	/** 
	* @Description: 根据产品型号查询实体
	* @author Guo Yuchao   
	* @date 2014-11-20 下午6:48:16 
	* @param prodCode
	* @return  
	*/ 
	ProModelDomain findById(String prodCode);
		
	/** 
	* @Description: 根据型号名称模糊查询型号信息列表
	* @author Guo Yuchao   
	* @date 2014-11-17 下午4:22:35 
	* @param prdn
	* @return  
	*/ 
	List<ProModelDomain> findProModelLikePrdn(String prdn);
	/** 
	* @Description: 型号名称模糊查询型号信息  分页查询
	* @author Guo Yuchao   
	* @date 2014-11-19 上午10:16:19 
	* @param prdn
	* @param pageCond
	* @return  
	*/ 
	PageResult<ProModelDomain> findModelPagerLikePrdn(String prdn,PageCond pageCond);
	
	
	
}
