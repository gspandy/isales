package com.haier.isales.system.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.common.DubboResult;
import com.haier.isales.system.dto.MenuDTO;
import com.haier.isales.system.dto.MenuSearchDTO;
import com.haier.isales.system.service.MenuClient;
import com.haier.isales.test.BaseIsalesClientTestCase;


/**
 * @author Richard Core
 *
 */
@ContextConfiguration(locations = {
		"classpath*:/spring/system/spring-*.xml",
		"classpath*:/spring_service/system/spring-menu-provider.xml"
		})
public class MenuClientImplTest extends BaseIsalesClientTestCase{
	@Resource
	private MenuClient menuClient;
	
	@Test
	public void testFindTopMenuByParam() {
		DubboResult dubboResult = (DubboResult) menuClient.findTopMenuByParam("admin","pc");
		List<MenuDTO> topMenuList = dubboResult.getResultBean();
		assertThat(topMenuList, notNullValue());
		assertThat(topMenuList.size(), greaterThanOrEqualTo(1));
	}
	@Test
	public void testFindMenuListBelonged2User() {
		DubboResult dubboResult = (DubboResult) menuClient.findMenuListBelonged2User(1l,"pc");
		List<MenuDTO> topMenuList = dubboResult.getResultBean();
		assertThat(topMenuList, notNullValue());
		assertThat(topMenuList.size(), greaterThanOrEqualTo(1));
	}
	@Test
	public void testFindByParam() {
		MenuSearchDTO menuSearchDTO = new MenuSearchDTO();
		menuSearchDTO.setParentsId(33l);
		DubboResult dubboResult = (DubboResult) menuClient.findByParam(menuSearchDTO);
		List<MenuDTO> topMenuList = dubboResult.getResultBean();
		assertThat(topMenuList, notNullValue());
		assertThat(topMenuList.size(), greaterThanOrEqualTo(1));
	}
	@Test
	public void testFindUserMenu() {
		MenuSearchDTO menuSearchDTO = new MenuSearchDTO();
		menuSearchDTO.setMenuType("102");
		menuSearchDTO.setMenuLevel(1l);
		menuSearchDTO.setParentsId(0l);
		DubboResult dubboResult = (DubboResult) menuClient.findUserMenu(1l,menuSearchDTO);	
		List<MenuDTO> topMenuList = dubboResult.getResultBean();
		assertThat(topMenuList,notNullValue());
	}
	@Test
	public void testFindWorkguideMenu() {
		DubboResult result = (DubboResult) menuClient.findWorkguideMenu();
		List<MenuDTO> list = result.getResultBean();
		assertThat(list, notNullValue());
	}

}
