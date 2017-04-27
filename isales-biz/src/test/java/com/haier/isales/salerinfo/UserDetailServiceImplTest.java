package com.haier.isales.salerinfo;

import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.haier.isales.salerinfo.userdetail.domain.UserDetailDomain;
import com.haier.isales.salerinfo.userdetail.service.UserDetailService;
@ContextConfiguration(locations = {
		
		"classpath*:/spring/system/spring-*.xml",
		"classpath*:/spring/attachment/spring-*.xml",
		"classpath*:/spring/score/spring-*.xml",
		"classpath*:/spring/salerinfo/spring-*.xml"})
@Transactional
public class UserDetailServiceImplTest extends BaseSalerInfoTestCase{
	@Resource
	protected UserDetailService userDetailService;
	@Before
	public void init(){
		executeSqlScript("classpath:/com/haier/isales/salerinfo/UserDetailServiceImplTest.sql", true);
	}
	@Test
	public void testSaveHeadPortrait() {
		userDetailService.saveHeadPortrait(-99999L, 1L, "测试绑定用户");
		UserDetailDomain userDetailDomain = userDetailService.findById(-99999L);
		MatcherAssert.assertThat(userDetailDomain, Matchers.notNullValue());
	}

	@Test
	public void testUpdateUserDetail() {
		UserDetailDomain domain = new UserDetailDomain();
		domain.setOperatorId(-99999L);
		domain.setHeadPortraitId(1L);
		domain.setMobile("12345678901");
		domain.setSignature("就不信你还不对！");
		domain.setUpdateName("Richard Core");
		domain.setWechatCode("123123123");
		userDetailService.updateUserDetail(domain);
		UserDetailDomain userDetailDomain = userDetailService.findById(-99999L);
		MatcherAssert.assertThat(userDetailDomain, Matchers.notNullValue());
	}
	@Test
	public void testFindById(){
		UserDetailDomain userDetailDomain = userDetailService.findById(-99999L);
		MatcherAssert.assertThat(userDetailDomain, Matchers.notNullValue());
	}
	


}
