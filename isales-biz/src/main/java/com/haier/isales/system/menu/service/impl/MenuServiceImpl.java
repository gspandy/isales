/**
 * @Company 青鸟软通   
 * @Title: MenuService.java 
 * @Package  com.haier.isales.system.menu.service.impl
 * @author Guo Yuchao   
 * @date 2014年11月04日  10:09:18
 * @version V1.0   
 */
package com.haier.isales.system.menu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.DictionaryCache;
import com.haier.isales.common.DomainDtoUtil;
import com.haier.isales.common.IsalesConstants.DictionaryType;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.system.dto.MenuSearchDTO;
import com.haier.isales.system.dto.RoleDTO;
import com.haier.isales.system.menu.dao.MenuDAO;
import com.haier.isales.system.menu.domain.MenuDomain;
import com.haier.isales.system.menu.service.MenuService;
import com.haier.isales.system.role.domain.RoleDomain;
import com.haier.isales.system.role.service.RoleService;
/** 
 * @ClassName: MenuService
 * @Description: Menu的Service接口定义类
 *  
 */
public class MenuServiceImpl implements MenuService{
	
	/** 
	* @Fields menuDao : MenuDao 工具依赖 
	*/
	private MenuDAO menuDao;
	private RoleService roleService;
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性 roleService 的get方法 
	 * @return roleService
	 */
	public RoleService getRoleService() {
		return roleService;
	}

	/**
	 * @Description: 属性 roleService 的set方法 
	 * @param roleService 
	 */
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	/**
	 * @Description: 属性 menuDao 的get方法 
	 * @return menuDao
	 */
	public MenuDAO getMenuDao() {
		return menuDao;
	}

	/**
	 * @Description: 属性menuDao 的set方法 
	 */
	public void setMenuDao(MenuDAO menuDao){
		this.menuDao = menuDao;
	}
	
	
	
	/*===============业务方法=============*/

	/**
	* <p>Description:根据条件返回菜单列表，不分页 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-4 下午1:59:05 
	* @param menuSearchDTO
	* @return 
	* @see com.haier.isalesfindByParam.system.menu.service.MenuService#findByParam(com.haier.isales.system.dto.MenuSearchDTO) 
	*/ 
	@Override
	public List<MenuDomain> findByParam(MenuSearchDTO menuSearchDTO) {
		if(menuSearchDTO == null){
			menuSearchDTO = new MenuSearchDTO();
		}
		List<MenuDomain> menuList = menuDao.findByParam(menuSearchDTO);
		return menuList;
	}


	/**
	* <p>Description: 查询一级菜单</p> 
	* @author Guo Yuchao   
	* @date 2014-11-4 下午1:59:05 
	* @param menuSearchDTO
	* @return 
	* @see com.haier.isales.system.menu.service.MenuService#findTopMenuByParam(com.haier.isales.system.dto.MenuSearchDTO) 
	*/ 
	@Override
	public List<MenuDomain> findTopMenuByParam(MenuSearchDTO menuSearchDTO) {
		if(menuSearchDTO == null){
			menuSearchDTO = new MenuSearchDTO();
		}
		if(MenuDomain.MENU_TYPE_APP.equalsIgnoreCase(menuSearchDTO.getMenuType())){
//			查询菜单种类若是app端的，将根目录设置为app端根目录
			menuSearchDTO.setParentsId(MenuDomain.ROOT_MENU_ID_APP);
		}else{
//			若查询PC端菜单，设置为pc端根目录， 若menuType没传值，默认值查pc端
			menuSearchDTO.setParentsId(MenuDomain.ROOT_MENU_ID_PC);
		}
		List<MenuDomain> topList = menuDao.findTopMenuByParam(menuSearchDTO);
		for (MenuDomain menuDomain : topList) {//遍历查询二级菜单
			if(menuDomain == null){
				continue;
			}
			menuSearchDTO.setParentsId(menuDomain.getMenuId());
//			menuDomain.setChildrenList(findChildrenListByParentId(menuSearchDTO));//查所有子菜单
//			menuDomain.setChildrenList(menuDao.findByParam(menuSearchDTO));//只查到二级菜单
			menuDomain.setChildrenList(menuDao.findTopMenuByParam(menuSearchDTO));//只查到二级菜单
			
		}
		return topList;
	}
	public List<MenuDomain> findTotalMenuByParam(MenuSearchDTO menuSearchDTO) {
		if(menuSearchDTO == null){
			menuSearchDTO = new MenuSearchDTO();
		}
		if(MenuDomain.MENU_TYPE_APP.equalsIgnoreCase(menuSearchDTO.getMenuType())){
//			查询菜单种类若是app端的，将根目录设置为app端根目录
			menuSearchDTO.setParentsId(MenuDomain.ROOT_MENU_ID_APP);
		}else{
//			若查询PC端菜单，设置为pc端根目录， 若menuType没传值，默认值查pc端
			menuSearchDTO.setParentsId(MenuDomain.ROOT_MENU_ID_PC);
		}
		List<MenuDomain> topList = menuDao.findTopMenuByParam(menuSearchDTO);
		for (MenuDomain menuDomain : topList) {//遍历查询二级菜单
			if(menuDomain == null){
				continue;
			}
			menuSearchDTO.setParentsId(menuDomain.getMenuId());
			menuDomain.setChildrenList(findChildrenListByParentId(menuSearchDTO));//查所有子菜单
//			menuDomain.setChildrenList(menuDao.findByParam(menuSearchDTO));//只查到二级菜单
//			menuDomain.setChildrenList(menuDao.findTopMenuByParam(menuSearchDTO));//只查到二级菜单
			
		}
		return topList;
	}
	/**
	* <p>Description:根据父菜单查询子菜单 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-4 下午2:16:42 
	* @param menuSearchDTO
	* @return 
	* @see com.haier.isales.system.menu.service.MenuService#findChildrenListByParentId(com.haier.isales.system.dto.MenuSearchDTO) 
	*/ 
	@Override
	public List<MenuDomain> findChildrenListByParentId(MenuSearchDTO menuSearchDTO){
		if(menuSearchDTO == null 
				|| menuSearchDTO.getParentsId() == null){
			return null;
		}
//		List<MenuDomain> menuList = menuDao.findByParam(menuSearchDTO);
		List<MenuDomain> menuList = menuDao.findTopMenuByParam(menuSearchDTO);
		if(menuList == null || menuList.isEmpty()){
			return menuList;
		}
		for (MenuDomain menuDomain : menuList) {
			if(menuDomain == null){
				break;
			}
			menuSearchDTO.setParentsId(menuDomain.getMenuId());
			menuDomain.setChildrenList(findChildrenListByParentId(menuSearchDTO));
		}
		return menuList;
	}

	/**
	* <p>Description:查询用户拥有的所有菜单 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-12 下午10:19:49 
	* @param operatorId
	* @return 
	* @see com.haier.isales.system.menu.service.MenuService#findMenuListBelonged2User(java.lang.Long) 
	*/ 
	@Override
	public List<MenuDomain> findMenuListBelonged2User(Long operatorId,String menuType) {
		if(operatorId == null) {
			throw new BusinessException(BusinessExceptionCode.param_error,"传入的用户id为空");
		}
		if(StringUtils.isEmpty(menuType)){
			throw new BusinessException(BusinessExceptionCode.param_error,"获取查询菜单类型为空，查手机端还是pc端");
		}
		//根据用户id查询用户的角色
		List<RoleDomain> roleList = roleService.findRoleListByUserId(operatorId);
		List<RoleDTO> roleDtoList = new ArrayList<RoleDTO>();
		for (RoleDomain roleDomain : roleList) {
			RoleDTO roleDTO = DomainDtoUtil.cloneRoleDomain2RoleDto(roleDomain);
			roleDtoList.add(roleDTO);
		}
		//根据角色查询菜单
		MenuSearchDTO menuSearchDTO = new MenuSearchDTO();
		menuSearchDTO.setRoleList(roleDtoList);
		menuSearchDTO.setMenuType(menuType);
		List<MenuDomain> menuList = findTotalMenuByParam(menuSearchDTO);
		return menuList;
	}

	/**
	* <p>Description: 查询用户菜单，可根据菜单类型（101 PC端  102 app端），
	*               菜单menuLevel（当为1时查询一级菜单，大于1时为查询指定等级菜单，为0时不作为查询依据）
	*               parentsId（当查询一级菜单时同一为0，不为0时可作为查询条件）</p> 
	* @author Guo Yuchao   
	* @date 2014-11-19 下午12:08:08 
	* @param operatorId
	* @param menuSearchDTO
	* @return 
	* @see com.haier.isales.system.menu.service.MenuService#findUserMenu(java.lang.Long, com.haier.isales.system.dto.MenuSearchDTO) 
	*/ 
	@Override
	public List<MenuDomain> findUserMenu(Long operatorId,
			MenuSearchDTO menuSearchDTO) {
		CheckParamUtil.checkFieldIfNotBlank(menuSearchDTO, "menuType","menuLevel","parentsId");
		if(operatorId == null){
			throw new BusinessException(BusinessExceptionCode.param_error,"传入的用户id为空");
		}
		//根据用户id查询用户的角色
		List<RoleDomain> roleList = roleService.findRoleListByUserId(operatorId);
		if(roleList == null || roleList.isEmpty()){
			throw new BusinessException(BusinessExceptionCode.database_none_data,"该用户没有访问权限");
		}
		// 验证menuType类型是否存在
		DictionaryCache.getInstance().validateBusinIdInUse(DictionaryType.menu_type.getTypeId(), menuSearchDTO.getMenuType());
		
		MenuDomain menuDomain = new MenuDomain();
		menuDomain.setMenuType(menuSearchDTO.getMenuType());
		if(menuSearchDTO.getMenuLevel().compareTo(0l) > 0){
			// 菜单menuLevel（当为1时查询一级菜单，大于1时为查询指定等级菜单，为0时不作为查询依据）
			menuDomain.setMenuLevel(menuSearchDTO.getMenuLevel());
		}
		if(menuSearchDTO.getParentsId().compareTo(0l) > 0 ){
			// parentsId（当查询一级菜单时同一为0，不为0时可作为查询条件）
			menuDomain.setParentsId(menuSearchDTO.getParentsId());
		}
		List<MenuDomain> menuList = menuDao.findUserMenu(menuDomain,roleList);
		return menuList;
	}

	/**
	* <p>Description: 查询在t_qn_menu_workguide表中的menu集合</p> 
	* @author Shao Jingkai   
	* @date 2015-6-18 下午4:06:11 
	* @return 
	* @see com.haier.isales.system.menu.service.MenuService#findMenuWorkguide() 
	*/ 
	@Override
	public List<MenuDomain> findWorkguideMenu() {
		List<MenuDomain> list = menuDao.findWorkguideMenuList();
		return list;
	}
}
