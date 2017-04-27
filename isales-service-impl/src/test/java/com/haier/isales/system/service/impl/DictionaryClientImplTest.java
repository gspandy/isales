/**
* @Company 青鸟软通   
* @Title: DictionaryClientImplTest.java 
* @Package com.haier.isales.system.service.impl 
* @author Guo Yuchao   
* @date 2014-11-12 下午6:14:08 
* @version V1.0   
*/ 
package com.haier.isales.system.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.common.DubboResult;
import com.haier.isales.system.service.DictionaryClient;
import com.haier.isales.test.BaseIsalesClientTestCase;

/** 
 * @ClassName: DictionaryClientImplTest 
 * @Description: 数据字典接口测试
 *  
 */
@ContextConfiguration(locations = { 
		"classpath*:/spring/system/spring-dictionary.xml",
		"classpath*:/spring_service/system/spring-dictionary-provider.xml"})
public class DictionaryClientImplTest extends BaseIsalesClientTestCase {
	@Resource
	protected DictionaryClient dictionaryClient;
	
	@Test
	public void testFindDictionaryListByTypeId(){
		DubboResult dubboResult = (DubboResult) dictionaryClient.findDictionaryListByTypeId("user_status");
		assertThat(dubboResult.getResultBean(), notNullValue());
		
	}
}
