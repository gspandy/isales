package org.bana.code.etl.zzjyt; 
import javax.annotation.Resource;

import org.bana.common.util.etl.SimpleTransform;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
@ContextConfiguration(locations = { 
		"classpath*:/spring/etl/spring-zzjyt.xml",
		"classpath*:/spring/spring-datasource.xml"
})
@Ignore
public class TestRegistRateVerifiedTransform extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private SimpleTransform registRateVerifiedTransform;
	/** 
	* @Description:会员注册率（已验证）
	* @author GuoYuchao   
	* @date 2014-12-15 15:01:00
	* @throws Exception  
	*/ 
	@Test
	public void testTransform() throws Exception{
		registRateVerifiedTransform.execute();
	}
}
