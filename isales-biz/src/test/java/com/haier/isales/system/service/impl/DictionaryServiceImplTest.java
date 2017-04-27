package com.haier.isales.system.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.system.dictionary.service.DictionaryService;

@ContextConfiguration(locations = { 
"classpath*:/spring/system/spring-dictionary.xml"})
@Transactional
public class DictionaryServiceImplTest extends BaseIsalesTestCase{
	@Resource
	private DictionaryService dictionaryService;
	@Before
	public void init(){
		executeSqlScript("classpath:/com/haier/isales/system/DictionaryServiceImplTest.sql", true);
	}
	@Test
	public void testFindBusinIdsByBusinTypeId() {
		List<String> dicStrs = dictionaryService.findBusinIdsByBusinTypeId("test_dictionary_busin_guo");
		assertThat(dicStrs,notNullValue());
	}


}
