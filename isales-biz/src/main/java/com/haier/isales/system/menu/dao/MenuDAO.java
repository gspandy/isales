/**
 * @Company 青鸟软通   
 * @Title: MenuDAO.java 
 * @Package  com.haier.isales.system.menu.dao
 * @author Guo Yuchao   
 * @date 2014年11月04日  09:55:36
 * @version V1.0   
 */
package com.haier.isales.system.menu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.system.dto.MenuSearchDTO;
import com.haier.isales.system.menu.domain.MenuDomain;
import com.haier.isales.system.role.domain.RoleDomain;
/** 
 * @ClassName: MenuDAO
 * @Description: Menu的DAO接口定义类
 *  
 */
public interface MenuDAO extends CommonDAO<MenuDomain,Long>{
	
	/** 
	* @Description:根据条件返回菜单列表，不分页
	* @author Guo Yuchao   
	* @date 2014-11-4 下午1:56:01 
	* @param menuSearchDTO
	* @return  
	*/ 
	List<MenuDomain> findByParam(@Param("model")MenuSearchDTO menuSearchDTO);
	
	/** 
	* @Description: 查询一级菜单
	* @author Guo Yuchao   
	* @date 2014-11-4 下午1:56:54 
	* @param menuSearchDTO
	* @return  
	*/ 
	List<MenuDomain> findTopMenuByParam(@Param("model")MenuSearchDTO menuSearchDTO);

	/** 
	* @Description:查询用户菜单，现有参数
	*		               根据菜单类型menuType（101 PC端  102 app端），
	*               菜单menuLeve
	*               parentsId 父节点id
	* @author Guo Yuchao   
	* @date 2014-11-19 下午1:01:40 
	* @param menuDomain
	* @param roleList
	* @return  
	*/ 
	List<MenuDomain> findUserMenu(@Param("model")MenuDomain menuDomain,
			@Param("roleList")List<RoleDomain> roleList);
	
	/** 
	* @Description: TODO 查询在t_qn_menu_workguide表中的menu集合
	* @author Shao Jingkai   
	* @date 2015-6-18 下午3:59:23 
	* @return  
	*/ 
	List<MenuDomain> findWorkguideMenuList();
}
