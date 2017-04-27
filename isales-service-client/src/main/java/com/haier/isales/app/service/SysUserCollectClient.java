/**
 * @Company 青鸟软通   
 * @Title: UserTokenClient.java 
 * @Package com.haier.isales.app.service 
 * @author lizhenwei
 * @date 2015-12-29 下午4:59:32 
 * @version V1.0   
 */
package com.haier.isales.app.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.app.dto.SysUserCollectDTO;
import com.haier.isales.app.dto.SysUserDTO;

/**
 * @ClassName: SysUserClient
 * @Description: 获取通讯录信息接口
 * 
 */
public interface SysUserCollectClient {

	/**
	 * 
	* @Title: findFavoritUser
	* @Description: 通过条件查询用户收藏联系人列表
	* @return  
	* @throws
	 */
	@Export(paramNames = {"sysUserDTO"})
	public Object findFavoritUser(SysUserDTO sysUserDTO);
	
	/**
	 * 
	* @Title: saveFavoritUser
	* @Description: 添加收藏联系人
	* @return  
	* @throws
	 */
	@Export(paramNames = {"dto"})
	public Object saveFavoritUser(SysUserCollectDTO dto);
	
	/**
	 * 
	* @Title: updateFavoritUser
	* @Description: 更新收藏状态
	* @return  
	* @throws
	 */
	@Export(paramNames = {"dto"})
	public Object updateFavoritUser(SysUserCollectDTO dto);

}
