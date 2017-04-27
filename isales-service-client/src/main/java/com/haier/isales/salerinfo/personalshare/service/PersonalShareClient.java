/**
* @Company 青鸟软通   
* @Title: PersonalShareClient.java 
* @Package com.haier.isales.salerInfo.personalShare.service 
* @author Guo Yuchao   
* @date 2014-11-14 下午2:36:35 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalshare.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.salerinfo.personalshare.dto.PersonalShareDTO;

/** 
 * @ClassName: PersonalShareClient 
 * @Description: 备忘和经验相关
 *  
 */
public interface PersonalShareClient {
	/** 
	* @Description: 根据条件查询经验或备忘
	* @author Guo Yuchao   
	* @date 2014-11-14 上午9:32:48 
	* @param personalShareDTO
	* @return  
	*/ 
	@Export(paramNames = {"personalShareDTO","currentPage","pageSize"})
	Object findShareInfoByParam(PersonalShareDTO personalShareDTO,Integer currentPage,Integer pageSize);
	/** 
	* @Description:根据id查询经验或备注
	* @author Guo Yuchao   
	* @date 2014-11-14 下午2:00:33 
	* @param id
	* @return  
	*/ 
	@Export(paramNames = {"id"})
	Object findShareById(Long id);
	
	/** 
	* @Description: 保存经验或备注 需要区分类型type 默认为经验
	* @author Guo Yuchao   
	* @date 2014-11-14 上午11:05:53 
	* @param personalShareDTO  
	*/ 
	@Export(paramNames = "personalShareDTO")
	Object saveShareInfo(PersonalShareDTO personalShareDTO);
	/** 
	* @Description: 修改经验或备注
	* @author Guo Yuchao   
	* @date 2014-11-14 下午1:20:19 
	* @param personalShareDTO  
	*/ 
	@Export(paramNames = "personalShareDTO")
	Object updateShareInfo(PersonalShareDTO personalShareDTO);
	/** 
	* @Description: 分享经验 
	* @author Guo Yuchao   
	* @date 2014-11-14 下午1:20:23 
	* @param personalShareDTO  
	*/ 
	@Export(paramNames = "personalShareDTO")
	Object saveSharedShare2Field(PersonalShareDTO personalShareDTO);
	/** 
	 * @Description: delete 备忘或经验 
	 * @author Guo Yuchao   
	 * @date 2014-11-14 下午1:20:23 
	 * @param personalShareDTO  
	 */ 
	@Export(paramNames = "personalShareDTO")
	Object deletePersonalShareInfo(PersonalShareDTO personalShareDTO);
	
}
