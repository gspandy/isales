package com.haier.isales.system.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;

import javax.annotation.Resource;

import org.bana.common.util.page.PageResult;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.common.DubboResult;
import com.haier.isales.system.dto.UserDTO;
import com.haier.isales.system.dto.UserSearchDTO;
import com.haier.isales.system.service.UserClient;
import com.haier.isales.test.BaseIsalesClientTestCase;


/**
 * @author Richard Core
 *
 */
@ContextConfiguration(locations = {
		"classpath*:/spring/system/spring-*.xml",
		"classpath*:/spring_service/system/spring-user-provider.xml"
		})
public class UserClientImplTest extends BaseIsalesClientTestCase{
	@Resource
	protected UserClient userClient;
	
	@Test
	public void testGetUserByParam() {
		UserSearchDTO userSearchDTO = new UserSearchDTO();
		//userSearchDTO.setOperatorId(1l);
		DubboResult dubboResult = (DubboResult)userClient.getUserByParam(userSearchDTO,1,10);
		PageResult<UserDTO> pageResult = dubboResult.getResultBean();
		assertThat(pageResult.getResultList(), notNullValue());
	}
	

	@Test
	public void testFindGrantInfoByEmpSn(){
		DubboResult dubboResult = (DubboResult)userClient.findGrantInfoByEmpSn("01007891");
		String result = dubboResult.getResultBean();
		assertThat(result,notNullValue());
	}
	@Test
	public void testFindUserByOrgParam(){
		UserSearchDTO userSearchDTO = new UserSearchDTO();
		userSearchDTO.setOrgCode("haier690");
		userSearchDTO.setOrgType(UserSearchDTO.USER_SEARCH_DTO_ORG_TYPE_ACTUAL);
		DubboResult dubboResult = (DubboResult)userClient.findUserByOrgParam(userSearchDTO);
		List<UserDTO> userList = dubboResult.getResultBean();
		assertThat(userList,notNullValue());
	}
	@Test
	public void testFindUserByLabelParam(){
		UserSearchDTO userSearchDTO = new UserSearchDTO();
		userSearchDTO.setExcludeGroupIds("2");
//		userSearchDTO.setIncludeGroupIds("1");
		userSearchDTO.setExcludeLabelIds("5");
		userSearchDTO.setIncludeLabelIds("2,3,4");
		DubboResult dubboResult = (DubboResult)userClient.findUserByLabelParam(userSearchDTO);
		List<UserDTO> userList = dubboResult.getResultBean();
		assertThat(userList,notNullValue());
	}
	@Test
	public void testFindUserByOperatorId(){
		DubboResult dubboResult = (DubboResult)userClient.findUserByOperatorId(1L);
		UserDTO userDTO = dubboResult.getResultBean();
		assertThat(userDTO,notNullValue());
	}

}
