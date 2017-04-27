/**
 * @Company 青鸟软通   
 * @Title: RecipientServiceTest.java 
 * @Package com.haier.isales.statistics 
 * @author John.zhao   
 * @date 2014-12-4 下午4:13:58 
 * @version V1.0   
 */
package com.haier.isales.statistics;

import java.util.List;

import org.junit.Test;
import org.springframework.util.Assert;

import com.haier.isales.statistics.emailreceive.domain.RecipientDomain;

/**
 * @ClassName: RecipientServiceTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author John.zhao
 */
public class RecipientServiceTest extends BaseStatisticsTestCase {
	@Test
	public void testFindAll() {
		List<RecipientDomain> allRecipient = recipientService.getAllRecipient();
		Assert.notNull(allRecipient);
	}
}
