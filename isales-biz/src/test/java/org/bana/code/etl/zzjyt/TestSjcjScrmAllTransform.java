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
//@Ignore
public class TestSjcjScrmAllTransform extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private SimpleTransform sjcjScrmAllTransform;
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author cao rui   
	* @date 2015-6-25 上午10:09:29 
	* @throws Exception  
	*/
	@Test
//	@Ignore
	public void testTransform() throws Exception{
		sjcjScrmAllTransform.execute();
	}
	
}
