package org.bana.code.etl.gdsd; 
import javax.annotation.Resource;

import org.bana.common.util.etl.SimpleTransform;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
@ContextConfiguration(locations = { 
		"classpath*:/spring/etl/spring-gdsd.xml",
		"classpath*:/spring/spring-datasource.xml"
})
@Ignore
public class TestShopCoordinateTransform extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private SimpleTransform shopCoordinateTransform;

	@Test
	public void testTransform() throws Exception{
		shopCoordinateTransform.execute();
	}
}
