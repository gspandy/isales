/**
* @Company 青鸟软通   
* @Title: LoginBehaviourServiceCilent.java 
* @Package com.haier.isales.behaviour.service 
* @author John Zhao   
* @date 2014-11-7 下午7:24:14 
* @version V1.0   
*/ 
package com.haier.isales.behaviour.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.behaviour.dto.LoginBehaviourDTO;

/** 
 * @ClassName: LoginBehaviourServiceCilent 
 * @Description: 用户登录/退出动作接口
 *  
 */
public interface LoginBehaviourServiceClient {
	/** 
	* @Description: 提供保存用户登录或者退出的dubbo接口
	* @author John Zhao   
	* @date 2014-11-7 下午7:29:04 
	* @param loginBehaviourDTO  
	*/ 
	@Export(paramNames={"loginBehaviourDTO"})
	public Object saveLoginBehaviour(LoginBehaviourDTO loginBehaviourDTO);
	
	/** 
	* @Description: 更新用户登出行为,并计算在线时长
	* @author John Zhao
	* @date 2014-11-10 上午9:40:31
	* @param loginBehaviourDTO
	*/
	@Export(paramNames={"loginBehaviourDTO"})
	public Object updateLoginOutBehaviour(LoginBehaviourDTO loginBehaviourDTO);

}
