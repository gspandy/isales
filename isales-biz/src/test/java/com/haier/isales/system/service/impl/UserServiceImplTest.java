package com.haier.isales.system.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;

import javax.annotation.Resource;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.system.user.domain.User;
import com.haier.isales.system.user.model.UserSearchModel;
import com.haier.isales.system.user.service.UserService;
@ContextConfiguration(locations = {
		"classpath*:/spring/system/spring-*.xml"
		})
public class UserServiceImplTest extends BaseIsalesTestCase{
	@Resource
	private UserService userService;

	@Test
	public void testGetUserByParam() {
		UserSearchModel userSearchModel = new UserSearchModel();
		userSearchModel.setOperatorId(1l);
		PageCond pageCond = new PageCond(1,Integer.MAX_VALUE);
		PageCondUtil.calculateX(pageCond);
		List<User> userList = userService.getUserByParam(userSearchModel,pageCond);
		assertThat(userList,notNullValue());
		assertThat(userList.size(),greaterThanOrEqualTo(1));
	}
	@Test
	public void testSaveUserAuditStatus(){
		UserSearchModel userSearchModel = new UserSearchModel();
		userSearchModel.setOperatorId(24l);
		String testResult = userService.saveUserAuditStatus(userSearchModel);
		assertThat(testResult,notNullValue());
	}
	
	@Test
	public void testFindGrantInfoByEmpSn(){
		String result = userService.findGrantInfoByEmpSn("01007891");
		assertThat(result,notNullValue());
	}
	@Test
	public void testFindUserByOrgParam(){
		UserSearchModel userSearchModel = new UserSearchModel();
		userSearchModel.setOrgCode("370bxzx");
		List<User> userList = userService.findUserByOrgParam(userSearchModel);
		assertThat(userList,notNullValue());
	}
	@Test
	public void testFindUserByVirtualOrgParam(){
		UserSearchModel userSearchModel = new UserSearchModel();
		userSearchModel.setOrgCode("haier690");
		List<User> userList = userService.findUserByVirtualOrgParam(userSearchModel);
		assertThat(userList,notNullValue());
	}
	@Test
	public void testFindUserByLabelParam(){
		UserSearchModel userSearchModel = new UserSearchModel();
		userSearchModel.setExcludeLabelGroupIds("2");
		userSearchModel.setIncludeLGroupIds("1");
		userSearchModel.setExcludeLabelIds("5");
		userSearchModel.setIncludeLabelIds("2,3,4");
		List<User> userList = userService.findUserByLabelParam(userSearchModel);
		assertThat(userList,notNullValue());
	}

}
