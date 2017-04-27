/**
 * @Company 青鸟软通   
 * @Title: LabelService.java 
 * @Package  com.haier.isales.system.label.service
 * @author Guo Yuchao   
 * @date 2014年11月11日  15:35:45
 * @version V1.0   
 */
package com.haier.isales.system.label.service;

import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.system.dto.LabelDTO;
import com.haier.isales.system.dto.LabelGroupDTO;
import com.haier.isales.system.label.domain.LabelDomain;

/** 
 * @ClassName: LabelService
 * @Description: Label的Service接口定义类
 *  
 */
public interface LabelService {

		/** 
		* @Description: 根据标签组参数查找标签
		* @author Guo Yuchao   
		* @date 2014-11-11 下午5:01:45 
		* @param labelGroupId
		* @return  
		*/ 
		List<LabelDomain> findByGroupParam(LabelGroupDTO labelGroupDTO);
		
		/** 
		* @Description: 根据group查找标签 其中groupId 中可以存储多个Id  以","分隔
		* @author Guo Yuchao   
		* @date 2014-11-11 下午7:05:27 
		* @param labelGroupDTO
		* @return  
		*/ 
		List<LabelDomain> getLabelListByLabelGroup(LabelGroupDTO labelGroupDTO);
		/** 
		* @Description:根据labelIds 查找标签 其中可以存储多个Id  以","分隔
		* @author Guo Yuchao   
		* @date 2014-11-11 下午7:09:28 
		* @param labelGroupDTO
		* @return  
		*/ 
		List<LabelDomain> getLabelListByLabelIds(LabelDTO labelDTO);
		
		/** 
		* @Description:  根据条件查询标签
		* @author Guo Yuchao   
		* @date 2014-11-11 下午7:39:52 
		* @param labelDomain
		* @param pageCond
		* @return  
		*/ 
		PageResult<LabelDomain> findByParams(LabelDomain labelDomain, PageCond pageCond);
}
