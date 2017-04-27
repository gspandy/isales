package com.haier.isales.salerinfo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import javax.annotation.Resource;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.haier.isales.salerinfo.personalshare.domain.PersonalShareDomain;
import com.haier.isales.salerinfo.personalshare.service.PersonalShareService;
@ContextConfiguration(locations = { 
		"classpath*:/spring/system/spring-dictionary.xml",
		"classpath*:/spring/salerinfo/spring-*.xml"})
@Transactional
public class PersonalShareServiceImplTest extends BaseSalerInfoTestCase{
	@Resource
	protected PersonalShareService personalShareService;
	@Before
	public void init(){
		executeSqlScript("classpath:/com/haier/isales/salerinfo/PersonalShareServiceImplTest.sql", true);
	}
	@Test
	public void testFindShareInfoByParam() {
		PersonalShareDomain personalShareDomain = new PersonalShareDomain();
		personalShareDomain.setId(-100000l);
		PageResult<PersonalShareDomain> pageResut = personalShareService.findShareInfoByParam(personalShareDomain, new PageCond(1,5));
		assertThat(pageResut,notNullValue());
//		assertThat(returnResult.getResult(),equalTo("success"));
	}
	@Test
	@Transactional
	public void testSaveShareInfo() {
		PersonalShareDomain personalShareDomain = new PersonalShareDomain();
		personalShareDomain.setId(-100001l);
		personalShareDomain.setTitle("testTitle");
		personalShareDomain.setContent("testContent");
		personalShareDomain.setType("101");
		personalShareDomain.setUserId(1l);
		personalShareService.saveShareInfo(personalShareDomain);
		PageResult<PersonalShareDomain> pageResut = personalShareService.findShareInfoByParam(personalShareDomain, new PageCond(1,5));
		assertThat(pageResut,notNullValue());
	}
	@Test
	public void testUpdateShareInfo() {
		PersonalShareDomain personalShareDomain = new PersonalShareDomain();
		personalShareDomain  = personalShareService.findShareById(-100000l);
		personalShareDomain.setTitle("testTitle1");
		personalShareDomain.setContent("testContent1");
		personalShareDomain.setType("102");
		personalShareDomain.setUserId(1l);
		personalShareService.updateShareInfo(personalShareDomain);
		personalShareDomain  = personalShareService.findShareById(-100000l);
		assertThat(personalShareDomain,notNullValue());
	}
	@Test
	public void testSaveSharedShare2Field() {
		PersonalShareDomain personalShareDomain = new PersonalShareDomain();
		personalShareDomain  = personalShareService.findShareById(-100000l);
		personalShareService.saveSharedShare2Field(personalShareDomain);
		personalShareDomain  = personalShareService.findShareById(-100000l);
		assertThat(personalShareDomain,notNullValue());
	}
	@Test
	public void testDeletePersonalShareInfo() {
		PersonalShareDomain personalShareDomain = new PersonalShareDomain();
		personalShareDomain  = personalShareService.findShareById(-100000l);
		personalShareService.deletePersonalShareInfo(personalShareDomain);
		personalShareDomain  = personalShareService.findShareById(-100000l);
		assertThat(personalShareDomain,Matchers.nullValue());
	}


}
