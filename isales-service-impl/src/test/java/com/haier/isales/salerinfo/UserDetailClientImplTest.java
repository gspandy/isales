/**
* @Company 青鸟软通   
* @Title: UserDetailClientImplTest.java 
* @Package com.haier.isales.salerinfo 
* @author Guo Yuchao   
* @date 2014-11-21 下午10:06:22 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo;


import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.common.DubboResult;
import com.haier.isales.salerinfo.userdetail.dto.UserDetailSearchDTO;
import com.haier.isales.salerinfo.userdetail.service.UserDetailSearchClient;
import com.haier.isales.salerinfo.userdetail.service.UserDetailUpdateClient;
import com.haier.isales.test.BaseIsalesClientTestCase;

/** 
 * @ClassName: UserDetailClientImplTest 
 * @Description: 
 *  
 */
@ContextConfiguration(locations = {
		"classpath*:/spring_service/salerinfo/spring-userDetail-*-provider.xml",
		"classpath*:/spring/system/spring-*.xml",
		"classpath*:/spring/attachment/spring-*.xml",
		"classpath*:/spring/score/spring-*.xml",
		"classpath*:/spring/salerinfo/spring-*.xml"})
public class UserDetailClientImplTest  extends BaseIsalesClientTestCase{
	@Resource
	private UserDetailSearchClient userDetailSearchClient;
	@Resource
	private UserDetailUpdateClient userDetailUpdateClient;
	@Before
	public void init(){
		executeSqlScript("classpath:/com/haier/isales/salerinfo/UserDetailServiceImplTest.sql", true);
	}
	@Test
	public void testSaveHeadPortrait(){
		UserDetailSearchDTO domain = new UserDetailSearchDTO();
		domain.setOperatorId(-99999L);
		domain.setHeadPortraitId(1L);
		domain.setMobile("12345678901");
		domain.setSignature("testsign");
		domain.setUpdateName("me");
		domain.setWechatCode("123123123");
		DubboResult dubboResult = (DubboResult) userDetailUpdateClient.updateUserDetail(domain);
		UserDetailSearchDTO userDetailSearchDTO = dubboResult.getResultBean();
		MatcherAssert.assertThat(userDetailSearchDTO, Matchers.notNullValue());
	}
	@Test
	public void findUserDetailById(){
		DubboResult dubboResult = (DubboResult) userDetailSearchClient.findUserDetailById(-99999L) ;
		MatcherAssert.assertThat(dubboResult.getResultBean(), Matchers.notNullValue());
	}
}
