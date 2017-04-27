/**
* @Company 青鸟软通   
* @Title: MenuClient.java 
* @Package com.haier.isales.system.service 
* @author Guo Yuchao   
* @date 2014-11-04 上午10:08:18 
* @version V1.0   
*/
package com.haier.isales.system.service;

import com.haier.isales.system.dto.MenuSearchDTO;

import io.terminus.pampas.client.Export;

/**
 * 菜单管理对外接口
 * @author Guoyuchao
 *
 */
public interface MenuClient {
	
	/** 
	* @Description: 根据员工的工号返回他拥有的菜单
	* @author Guo Yuchao   
	* @date 2014-11-3 下午9:11:44 
	* @param employeeSn
	* @return  
	*/ 
	@Export(paramNames = {"employeeSn","menuType"})
	Object findTopMenuByParam(String employeeSn,String menuType);
	
	/** 
	* @Description: 查询用户拥有的所有菜单
	* @author Guo Yuchao   
	* @date 2014-11-13 上午10:17:57 
	* @param operatorId
	* @param menuType
	* @return  
	*/ 
	@Export(paramNames = {"operatorId","menuType"})
	Object findMenuListBelonged2User(Long operatorId,String menuType);
	/** 
	* @Description: 根据参数查询菜单
	* @author Guo Yuchao   
	* @date 2014-11-13 下午2:04:06 
	* @param menuSearchDTO
	* @return  
	*/ 
	@Export(paramNames = {"menuSearchDTO"})
	Object findByParam(MenuSearchDTO menuSearchDTO);

	/** 
	* @Description:
	*  查询用户菜单，可根据菜单类型（101 PC端  102 app端），
	*  菜单menuLevel（当为1时查询一级菜单，大于1时为查询指定等级菜单，为0时不作为查询依据）
	*  parentsId（当查询一级菜单时同一为0，不为0时可作为查询条件）
	* @author Guo Yuchao   
	* @date 2014-11-19 上午11:47:19 
	* @param operatorId
	* @param menuSearchDTO
	* @return  
	*/ 
	@Export(paramNames = {"operatorId","menuSearchDTO"})
	Object findUserMenu(Long operatorId, MenuSearchDTO menuSearchDTO);
	
	/** 
	* @Description: TODO 查询在t_qn_menu_workguide表中的menu集合
	* @author Shao Jingkai   
	* @date 2015-6-18 下午4:09:30 
	* @return  
	*/ 
	Object findWorkguideMenu();
}
