package org.bana.code.etl.eai; 
import javax.annotation.Resource;

import org.bana.common.util.etl.SimpleTransform;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
@ContextConfiguration(locations = { 
		"classpath*:/spring/etl/spring-etl.xml",
		"classpath*:/spring/spring-datasource.xml"
})
@Ignore
public class TestQuotientMonthActualTransform extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private SimpleTransform quotientMonthActualTransform;
	 

	@Test
	public void testTransform() throws Exception{
		quotientMonthActualTransform.execute();
	}
}
