/**
* @Company 青鸟软通   
* @Title: MenuClientImpl.java 
* @Package com.haier.isales.system.service.impl 
* @author Guo Yuchao   
* @date 2014-11-4 下午3:00:06 
* @version V1.0   
*/ 
package com.haier.isales.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.DomainDtoUtil;
import com.haier.isales.system.dto.MenuDTO;
import com.haier.isales.system.dto.MenuSearchDTO;
import com.haier.isales.system.menu.domain.MenuDomain;
import com.haier.isales.system.menu.service.MenuService;
import com.haier.isales.system.service.MenuClient;

/** 
 * @ClassName: MenuClientImpl 
 * @Description: 菜单管理对外接口实现
 *  
 */
public class MenuClientImpl implements MenuClient {
	private static final Logger LOGGER = LoggerFactory.getLogger(MenuClientImpl.class);
	private MenuService menuService;
	/**
	 * @Description: 属性 menuService 的get方法 
	 * @return menuService
	 */
	public MenuService getMenuService() {
		return menuService;
	}
	/**
	 * @Description: 属性 menuService 的set方法 
	 * @param menuService 
	 */
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}
	/**
	 * <p>Description: 根据员工的工号返回他拥有的菜单</p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-4 下午3:00:06 
	 * @param employeeSn
	 * @return 
	 * @see com.haier.isales.system.service.MenuClient#findTopMenuByParam(java.lang.String) 
	 */
	@Override
	public List<MenuDTO> findTopMenuByParam(String employeeSn,String menuType) {
		LOGGER.info("登录的员工号为："+employeeSn);
		MenuSearchDTO menuSearchDTO = new MenuSearchDTO();
		menuSearchDTO.setLoginName(employeeSn);
		menuSearchDTO.setMenuType(menuType);
		List<MenuDomain> topMenuDomainList = menuService.findTopMenuByParam(menuSearchDTO);
		List<MenuDTO> topMenuDtoList = new ArrayList<MenuDTO>();	
		if(topMenuDomainList == null || topMenuDomainList.isEmpty()){
			topMenuDtoList.add(new MenuDTO());
			return topMenuDtoList;
		}
		for (MenuDomain menuDomain : topMenuDomainList) {
			//转换一级菜单
			MenuDTO topMenuDto = DomainDtoUtil.cloneMenu2MenuDTO(menuDomain);
//			if(menuDomain.getChildrenList() == null || menuDomain.getChildrenList().isEmpty()){
////				List<MenuDTO> childList = new ArrayList<MenuDTO>();
////				childList.add(new MenuDTO());
////				topMenuDto.setChildMenuList(childList);
//				topMenuDto.setChildMenuList(null);
//			}else{
//				//转换二级菜单
//				List<MenuDTO> childList = new ArrayList<MenuDTO>();
//				for (MenuDomain menuchild : menuDomain.getChildrenList()) {
//					MenuDTO menuChildDto = DomainDtoUtil.cloneMenu2MenuDTO(menuchild);
//					childList.add(menuChildDto);
//				}
//				topMenuDto.setChildMenuList(childList);
//			}
			topMenuDtoList.add(topMenuDto);
		}
		return topMenuDtoList;
	}
	/**
	* <p>Description:查询用户拥有的所有菜单 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-13 上午10:18:41 
	* @param operatorId
	* @param menuType
	* @return 
	* @see com.haier.isales.system.service.MenuClient#findMenuListBelonged2User(java.lang.Long, java.lang.String) 
	*/ 
	@Override
	public List<MenuDTO> findMenuListBelonged2User(Long operatorId, String menuType) {
		List<MenuDTO> topMenuDtoList = new ArrayList<MenuDTO>();
		List<MenuDomain> topMenuDomainList = menuService.findMenuListBelonged2User(operatorId, menuType);
		if(topMenuDomainList == null || topMenuDomainList.isEmpty()){
			topMenuDtoList.add(new MenuDTO());
			return topMenuDtoList;
		}
		for (MenuDomain menuDomain : topMenuDomainList) {
			MenuDTO topMenuDto = DomainDtoUtil.cloneMenu2MenuDTO(menuDomain);
			topMenuDtoList.add(topMenuDto);
		}
		return topMenuDtoList;
	}
	/**
	* <p>Description: 根据参数查询菜单</p> 
	* @author Guo Yuchao   
	* @date 2014-11-13 下午2:05:11 
	* @param menuSearchDTO
	* @return 
	* @see com.haier.isales.system.service.MenuClient#findByParam(com.haier.isales.system.dto.MenuSearchDTO) 
	*/ 
	@Override
	public List<MenuDTO> findByParam(MenuSearchDTO menuSearchDTO) {
		List<MenuDTO> menuDtoList =  new ArrayList<MenuDTO>();
		List<MenuDomain> menuDomainList =  menuService.findByParam(menuSearchDTO);
		for (MenuDomain menuDomain : menuDomainList) {
			MenuDTO menuDTO = DomainDtoUtil.cloneMenu2MenuDTO(menuDomain);
			menuDtoList.add(menuDTO);
		}
		return menuDtoList;
	}
	/**
	* <p>Description: </p>  查询用户菜单，可根据菜单类型（101 PC端  102 app端），
	*  菜单menuLevel（当为1时查询一级菜单，大于1时为查询指定等级菜单，为0时不作为查询依据）
	*  parentsId（当查询一级菜单时同一为0，不为0时可作为查询条件）
	* @author Guo Yuchao   
	* @date 2014-11-19 上午11:59:51 
	* @param operatorId
	* @param menuSearchDTO
	* @return 
	* @see com.haier.isales.system.service.MenuClient#findUserMenu(java.lang.Long, com.haier.isales.system.dto.MenuSearchDTO) 
	*/ 
	@Override
	public List<MenuDTO> findUserMenu(Long operatorId, MenuSearchDTO menuSearchDTO) {
		List<MenuDTO> menuDtoList =  new ArrayList<MenuDTO>();
		List<MenuDomain> menuDomainList =  menuService.findUserMenu(operatorId,menuSearchDTO);
		for (MenuDomain menuDomain : menuDomainList) {
			MenuDTO menuDTO = DomainDtoUtil.cloneMenu2MenuDTO(menuDomain);
			menuDtoList.add(menuDTO);
		}
		return menuDtoList;
	}
	
	/**
	* <p>Description:查询在t_qn_menu_workguide表中的menu集合 </p> 
	* @author Shao Jingkai   
	* @date 2015-6-18 下午4:11:53 
	* @return 
	* @see com.haier.isales.system.service.MenuClient#findMenuWorkguide() 
	*/ 
	@Override
	public Object findWorkguideMenu() {
		List<MenuDomain> domainList = menuService.findWorkguideMenu();
		List<MenuDTO> dtoList = new ArrayList<MenuDTO>();
		for (MenuDomain domain : domainList) {
			MenuDTO dto = DomainDtoUtil.cloneMenu2MenuDTO(domain);
			dtoList.add(dto);
		}
		return dtoList;
	}
}
