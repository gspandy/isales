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
public class TestEmployeeShopRefTransform extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private SimpleTransform employeeShopRefTransform;
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2015-3-27 上午10:15:44 
	* @throws Exception  
	*/
	@Test
	@Ignore
	public void testTransform() throws Exception{
		employeeShopRefTransform.execute();
	}
	
}
