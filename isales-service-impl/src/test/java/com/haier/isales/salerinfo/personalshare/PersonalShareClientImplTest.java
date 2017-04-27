package com.haier.isales.salerinfo.personalshare;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import javax.annotation.Resource;

import org.bana.common.util.page.PageResult;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.haier.isales.common.DubboResult;
import com.haier.isales.salerinfo.personalshare.dto.PersonalShareDTO;
import com.haier.isales.salerinfo.personalshare.service.PersonalShareClient;
import com.haier.isales.test.BaseIsalesClientTestCase;


/**
 * 备忘和经验信息相关测试类
 * @author Guo Yuchao 
 *
 */
@ContextConfiguration(locations = {
		"classpath*:/spring/system/spring-dictionary.xml",
		"classpath*:/spring/salerinfo/spring-*.xml",
		"classpath*:/spring_service/salerinfo/spring-personalShare-provider.xml"
		})
public class PersonalShareClientImplTest extends BaseIsalesClientTestCase{
	@Resource
	protected PersonalShareClient personalShareClient;
	@Before
	public void init(){
		executeSqlScript("classpath:/com/haier/isales/salerinfo/PersonalShareServiceImplTest.sql", true);
	}
	@Test
	public void testFindShareInfoByParam() {
		PersonalShareDTO personalShareDTO = new PersonalShareDTO();
		personalShareDTO.setId(-100000l);
		DubboResult dubboResult = (DubboResult)personalShareClient.findShareInfoByParam(personalShareDTO, 1,5);
		PageResult<PersonalShareDTO> pageResut  = dubboResult.getResultBean();
		assertThat(pageResut,notNullValue());
//		assertThat(returnResult.getResult(),equalTo("success"));
	}
	@Test
	@Transactional
	public void testSaveShareInfo() {
		PersonalShareDTO personalShareDTO = new PersonalShareDTO();
		personalShareDTO.setId(-100001l);
		personalShareDTO.setTitle("testTitle");
		personalShareDTO.setContent("testContent");
		personalShareDTO.setType("101");
		personalShareDTO.setUserId(1l);
		personalShareClient.saveShareInfo(personalShareDTO);
		DubboResult dubboResult = (DubboResult)personalShareClient.findShareById(-100000l);
		personalShareDTO  = dubboResult.getResultBean();
		assertThat(personalShareDTO,notNullValue());
	}
	@Test
	public void testUpdateShareInfo() {
		PersonalShareDTO personalShareDTO = new PersonalShareDTO();
		DubboResult dubboResult = (DubboResult)personalShareClient.findShareById(-100000l);
		personalShareDTO  = dubboResult.getResultBean();
		personalShareDTO.setTitle("testTitle1");
		personalShareDTO.setContent("testContent1");
		personalShareDTO.setType("102");
		personalShareDTO.setUserId(1l);
		personalShareClient.updateShareInfo(personalShareDTO);
		dubboResult = (DubboResult)personalShareClient.findShareById(-100000l);
		personalShareDTO  = dubboResult.getResultBean();
		assertThat(personalShareDTO,notNullValue());
	}
	@Test
	public void testSaveSharedShare2Field() throws InterruptedException {
		PersonalShareDTO personalShareDTO = new PersonalShareDTO();
		DubboResult dubboResult = (DubboResult)personalShareClient.findShareById(-100000l);
		personalShareDTO  = dubboResult.getResultBean();
		personalShareClient.saveSharedShare2Field(personalShareDTO);
		dubboResult = (DubboResult)personalShareClient.findShareById(-100000l);
		personalShareDTO  = dubboResult.getResultBean();
		assertThat(personalShareDTO,notNullValue());
		
	}
	@Test
	public void testDeletePersonalShareInfo() {
		PersonalShareDTO personalShareDTO = new PersonalShareDTO();
		DubboResult dubboResult = (DubboResult)personalShareClient.findShareById(-100000l);
		personalShareDTO  = dubboResult.getResultBean();
		personalShareClient.deletePersonalShareInfo(personalShareDTO);
		dubboResult = (DubboResult)personalShareClient.findShareById(-100000l);
		personalShareDTO  = dubboResult.getResultBean();
		assertThat(personalShareDTO,Matchers.nullValue());
		
	}
	
}
