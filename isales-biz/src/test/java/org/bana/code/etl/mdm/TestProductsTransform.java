package org.bana.code.etl.mdm; 
import javax.annotation.Resource;

import org.bana.common.util.etl.SimpleTransform;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
@ContextConfiguration(locations = { 
		"classpath*:/spring/etl/spring-mdm.xml",
		"classpath*:/spring/spring-datasource.xml"
})
@Ignore
public class TestProductsTransform extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private SimpleTransform productsTransform;
	/** 
	* @Description: 
	* @author GuoYuchao  
	* @date 2014-11-19 下午8:48:20 
	* @throws Exception  
	*/ 
	@Test
	public void testTransform() throws Exception{
		productsTransform.execute();
	}
}
