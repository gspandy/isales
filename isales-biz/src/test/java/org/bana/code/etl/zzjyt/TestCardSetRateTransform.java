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
public class TestCardSetRateTransform extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private SimpleTransform cardSetRateTransform;
	/** 
	* @Description: 权益卡套餐率
	* @author GuoYuchao 
	* @date 2014-12-15 15:02:08
	* @throws Exception  
	*/ 
	@Test
	public void testTransform() throws Exception{
		cardSetRateTransform.execute();
	}
}
