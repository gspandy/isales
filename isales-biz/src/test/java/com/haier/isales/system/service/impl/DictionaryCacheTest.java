package com.haier.isales.system.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.common.DictionaryCache;
import com.haier.isales.common.IsalesConstants.DictionaryType;
import com.haier.isales.system.dto.Dictionary;
@ContextConfiguration(locations = { 
"classpath*:/spring/system/spring-dictionary.xml"})
@Transactional
public class DictionaryCacheTest extends BaseIsalesTestCase{
	@Before
	public void init(){
		executeSqlScript("classpath:/com/haier/isales/system/DictionaryServiceImplTest.sql", true);
	}
	@Test
	public void testInstance() {
//		List<Dictionary> dicList =
		Map<String, List<Dictionary>> dictionary = DictionaryCache.getInstance().findAllDictionary();
		assertThat(dictionary,notNullValue());
//		assertThat(returnResult.getResult(),equalTo("success"));
	}
	@Test
	public void testFindDictionaryListByTypeId() {
		List<Dictionary> dicList = DictionaryCache.getInstance().findDictionaryListByTypeId(DictionaryType.user_status.getTypeId());
		assertThat(dicList,notNullValue());
//		assertThat(returnResult.getResult(),equalTo("success"));
	}
	@Test
	public void testGetValueByTypeAndId() {
		String businName = DictionaryCache.getInstance().getValueByTypeAndId("user_status","101");
		assertThat(businName, notNullValue());
		assertThat(businName,equalTo("有效"));
	}
	@Test
	public void testGetKeyByTypeAndName() {
		String businId = DictionaryCache.getInstance().getKeyByTypeAndName("user_status","有效");
		assertThat(businId, notNullValue());
		assertThat(businId,equalTo("101"));
	}
	@Test
	public void testGetValueListByTypeId() {
		List<String> basinNames = DictionaryCache.getInstance().getValueListByTypeId(DictionaryType.user_status.getTypeId());
		assertThat(basinNames, notNullValue());
	}
	@Test
	public void testValidateBusinIdInUse() {
		DictionaryCache.getInstance().validateBusinIdInUse("test_dictionary_busin_guo","101");
	}
	
	


}
