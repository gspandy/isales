/**
 * @Company 青鸟软通   
 * @Title: UserBehaviourComService.java 
 * @Package  com.haier.isales.behaviour.userbehaviourcom.service
 * @author lizhenwei   
 * @date 2015年11月25日  14:00:20
 * @version V1.0   
 */
package com.haier.isales.behaviour.userbehaviourcom.service;

import com.haier.isales.behaviour.userbehaviourcom.domain.UserBehaviourComDomain;

/** 
 * @ClassName: UserBehaviourComService
 * @Description: UserBehaviourCom的Service接口定义类
 *  
 */
public interface UserBehaviourComService {

	// 保存用户行为记录
	void saveUserBehaviourComLog(UserBehaviourComDomain userBehaviourComDomain);
	
	// 更新退出时间
	void updateUserBehaviourComLog(UserBehaviourComDomain userBehaviourComDomain);
}
