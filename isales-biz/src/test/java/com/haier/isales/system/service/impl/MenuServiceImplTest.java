package com.haier.isales.system.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.system.dto.MenuSearchDTO;
import com.haier.isales.system.menu.domain.MenuDomain;
import com.haier.isales.system.menu.service.MenuService;
@ContextConfiguration(locations = { 
"classpath*:/spring/system/spring-*.xml"})
public class MenuServiceImplTest extends BaseIsalesTestCase{
	@Resource
	private MenuService menuService;
	@Test
	public void testFindTopMenuByParam() {
		MenuSearchDTO menuSearchDTO = new MenuSearchDTO();
		menuSearchDTO.setLoginName("admin");
		menuSearchDTO.setMenuType(MenuDomain.MENU_TYPE_PC);
		List<MenuDomain> topList = menuService.findTopMenuByParam(menuSearchDTO);		
		assertThat(topList,notNullValue());
//		assertThat(topList.size(),greaterThanOrEqualTo(1));
	}
	@Test
	public void testFindTotalMenuByUserId() {
		List<MenuDomain> topList = menuService.findMenuListBelonged2User(1l, MenuDomain.MENU_TYPE_PC);		
		assertThat(topList,notNullValue());
//		assertThat(topList.size(),greaterThanOrEqualTo(1));
	}
	@Test
	public void testFindUserMenu() {
		MenuSearchDTO menuSearchDTO = new MenuSearchDTO();
		menuSearchDTO.setMenuType("102");
		menuSearchDTO.setMenuLevel(1l);
		menuSearchDTO.setParentsId(0l);
		List<MenuDomain> topList = menuService.findUserMenu(1l,menuSearchDTO);		
		assertThat(topList,notNullValue());
//		assertThat(topList.size(),greaterThanOrEqualTo(1));
	}
	@Test
	public void testFindWorkguideMenu() {
		List<MenuDomain> list = menuService.findWorkguideMenu();
		assertThat(list, notNullValue());
	}
}
