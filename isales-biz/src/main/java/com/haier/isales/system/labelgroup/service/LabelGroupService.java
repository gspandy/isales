/**
 * @Company 青鸟软通   
 * @Title: LabelGroupService.java 
 * @Package  com.haier.isales.system.labelGroup.service
 * @author Guo Yuchao   
 * @date 2014年11月11日  15:59:51
 * @version V1.0   
 */
package com.haier.isales.system.labelgroup.service;

import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.system.dto.LabelGroupDTO;
import com.haier.isales.system.labelgroup.domain.LabelGroupDomain;

/** 
 * @ClassName: LabelGroupService
 * @Description: LabelGroup的Service接口定义类
 *  
 */
public interface LabelGroupService {
	/** 
	* @Description:根据条件查询标签组
	* @author Guo Yuchao   
	* @date 2014-11-11 下午4:10:49 
	* @param labelGroupDTO
	* @return  
	*/ 
	PageResult<LabelGroupDomain> findByParam(LabelGroupDTO labelGroupDTO,PageCond pageCond);
		
	
	/** 
	* @Description: 根据用户id，获取用户所关联的所有标签组
	* @author Liu Wenjie   
	* @date 2014-11-21 下午10:04:06 
	* @param operatorId
	* @return  
	*/ 
	public List<LabelGroupDomain> findGroupsByUser(Long operatorId);
}
