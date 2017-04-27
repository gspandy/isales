/**
 * @Company 青鸟软通   
 * @Title: UserBehaviourService.java 
 * @Package  com.haier.isales.behaviour.userBehaviour.service
 * @author John Zhao   
 * @date 2014年11月10日  18:12:14
 * @version V1.0   
 */
package com.haier.isales.behaviour.userBehaviour.service;

import com.haier.isales.behaviour.userBehaviour.domain.UserBehaviourDomain;

/** 
 * @ClassName: UserBehaviourService
 * @Description: UserBehaviour的Service接口定义类
 *  
 */
public interface UserBehaviourService {

		void saveUserBehaviourLog(UserBehaviourDomain userBehaviourDomain);
}
