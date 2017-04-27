/**
 * @Company 青鸟软通   
 * @Title: MenuService.java 
 * @Package  com.haier.isales.system.menu.service
 * @author Guo Yuchao   
 * @date 2014年11月04日  10:09:18
 * @version V1.0   
 */
package com.haier.isales.system.menu.service;

import java.util.List;

import com.haier.isales.system.dto.MenuSearchDTO;
import com.haier.isales.system.menu.domain.MenuDomain;

/** 
 * @ClassName: MenuService
 * @Description: Menu的Service接口定义类
 *  
 */
public interface MenuService {

	/** 
	* @Description:根据条件返回菜单列表，不分页
	* @author Guo Yuchao   
	* @date 2014-11-4 下午1:56:01 
	* @param menuSearchDTO
	* @return  
	*/ 
	List<MenuDomain> findByParam(MenuSearchDTO menuSearchDTO);
	
	/** 
	* @Description: 查询一级菜单
	* @author Guo Yuchao   
	* @date 2014-11-4 下午1:56:54 
	* @param menuSearchDTO
	* @return  
	*/ 
	List<MenuDomain> findTopMenuByParam(MenuSearchDTO menuSearchDTO);
	
	/** 
	* @Description:根据父菜单查询子菜单
	* @author Guo Yuchao   
	* @date 2014-11-4 下午2:16:01 
	* @param menuSearchDTO
	* @return  
	*/ 
	List<MenuDomain> findChildrenListByParentId(MenuSearchDTO menuSearchDTO);
	
	/** 
	* @Description: 查询用户拥有的所有菜单
	* @author Guo Yuchao   
	* @date 2014-11-12 下午10:18:32 
	* @param operatorId
	* @return  
	*/ 
	List<MenuDomain> findMenuListBelonged2User(Long operatorId,String menuType);

	/** 
	* @Description: 查询用户菜单，可根据菜单类型（101 PC端  102 app端），
	*               菜单menuLevel（当为1时查询一级菜单，大于1时为查询指定等级菜单，为0时不作为查询依据）
	*               parentsId（当查询一级菜单时同一为0，不为0时可作为查询条件）
	* @author Guo Yuchao   
	* @date 2014-11-19 下午12:02:39 
	* @param operatorId
	* @param menuSearchDTO
	* @return  
	*/ 
	List<MenuDomain> findUserMenu(Long operatorId, MenuSearchDTO menuSearchDTO);
	
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author Shao Jingkai   
	* @date 2015-6-18 下午4:49:42 
	* @return  
	*/ 
	List<MenuDomain> findWorkguideMenu();
}
