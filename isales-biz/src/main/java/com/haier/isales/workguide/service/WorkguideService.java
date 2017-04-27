/**
 * @Company 青鸟软通   
 * @Title: WorkguideService.java 
 * @Package  com.haier.isales.workguide.service
 * @author Shao Jingkai   
 * @date 2015年06月11日  13:50:48
 * @version V1.0   
 */
package com.haier.isales.workguide.service;

import java.util.List;

import com.haier.isales.system.user.domain.UserFullInfoDomain;
import com.haier.isales.workguide.domain.WorkguideDomain;

/** 
 * @ClassName: WorkguideService
 * @Description: Workguide的Service接口定义类
 *  
 */
public interface WorkguideService {

		/** 
		* @Description: TODO 查找所有workguide对象
		* @author Shao Jingkai   
		* @date 2015-6-11 下午2:46:12 
		* @return  
		*/ 
		public List<WorkguideDomain> findAll(UserFullInfoDomain fullInfo);
}
