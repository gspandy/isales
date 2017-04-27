/**
 * @Company 青鸟软通   
 * @Title: PersonalShareService.java 
 * @Package  com.haier.isales.salerInfo.personalShare.service
 * @author Guo Yuchao   
 * @date 2014年11月14日  14:19:09
 * @version V1.0   
 */
package com.haier.isales.salerinfo.personalshare.service;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.salerinfo.personalshare.domain.PersonalShareDomain;


/** 
 * @ClassName: PersonalShareService
 * @Description: PersonalShare的Service接口定义类
 *  
 */
public interface PersonalShareService {
	/** 
	* @Description: 根据条件查询经验或备忘
	* @author Guo Yuchao   
	* @date 2014-11-14 上午9:32:48 
	* @param personalShareDomain
	* @return  
	*/ 
	PageResult<PersonalShareDomain> findShareInfoByParam(PersonalShareDomain personalShareDomain,PageCond pageCond);
	/** 
	* @Description:根据id查询经验或备注
	* @author Guo Yuchao   
	* @date 2014-11-14 下午2:00:33 
	* @param id
	* @return  
	*/ 
	PersonalShareDomain findShareById(Long id);
	
	/** 
	* @Description: 保存经验或备注 需要区分类型type 默认为经验
	* @author Guo Yuchao   
	* @date 2014-11-14 上午11:05:53 
	* @param personalShareDomain  
	*/ 
	void saveShareInfo(PersonalShareDomain personalShareDomain);
	/** 
	* @Description: 修改经验或备注
	* @author Guo Yuchao   
	* @date 2014-11-14 下午1:20:19 
	* @param personalShareDomain  
	*/ 
	void updateShareInfo(PersonalShareDomain personalShareDomain);
	/** 
	* @Description: 分享经验 
	* @author Guo Yuchao   
	* @date 2014-11-14 下午1:20:23 
	* @param personalShareDomain  
	*/ 
	void saveSharedShare2Field(PersonalShareDomain personalShareDomain);
	
	/** 
	* @Description: 删除备忘或经验分享
	* @author Guo Yuchao   
	* @date 2014-11-14 下午3:21:58 
	* @param personalShareDomain  
	*/ 
	void deletePersonalShareInfo(PersonalShareDomain personalShareDomain);
		
}
