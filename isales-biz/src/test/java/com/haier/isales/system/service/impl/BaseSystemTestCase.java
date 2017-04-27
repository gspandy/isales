package com.haier.isales.system.service.impl;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.haier.isales.system.account.service.AccountService;
import com.haier.isales.system.employee.service.EmployeeService;
import com.haier.isales.system.labelgroup.service.LabelGroupService;
import com.haier.isales.system.menu.service.MenuService;
import com.haier.isales.system.user.service.UserService;

/**
 * security模块测试基类
 * @author WangXuzheng
 * 
 */
@ContextConfiguration(locations = { 
		"classpath*:/spring/spring-common.xml",
		"classpath*:/spring/spring-datasource.xml",
		"classpath*:/spring/spring-transaction.xml",
		"classpath*:/spring/cache/spring-cache-test.xml",
		"classpath*:/spring/cache/spring-cache-security.xml",
		"classpath*:/spring/system/spring-*.xml"})
public class BaseSystemTestCase  extends  AbstractTransactionalJUnit4SpringContextTests {
	@Resource
	protected UserService userService;
	@Resource
	protected EmployeeService employeeService;
	@Resource
	protected MenuService menuService;
	@Resource
	protected AccountService accountService;
	@Resource
	protected LabelGroupService labelGroupService;
	
	
}
