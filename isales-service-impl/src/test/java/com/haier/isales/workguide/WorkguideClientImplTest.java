package com.haier.isales.workguide;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import com.haier.isales.common.DubboResult;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalFullInfoDTO;
import com.haier.isales.test.BaseIsalesClientTestCase;
import com.haier.isales.workguide.dto.WorkguideDTO;
import com.haier.isales.workguide.service.WorkguideClient;

@ContextConfiguration(locations={
		"classpath*:/spring/workguide/spring-workguide.xml",
		"classpath*:/spring/dailymgt/spring-dailyMgt.xml",
		"classpath*:/spring/customer/spring-customer.xml",
		"classpath*:/spring/reminder/spring-reminderBpm.xml",
		"classpath*:/spring/retail/spring-btbSjcjScrm.xml",
		"classpath*:/spring/retail/spring-btbSjcjScrmAll.xml",
		"classpath*:/spring_service/workguide/spring-workguide-provider.xml"
})
public class WorkguideClientImplTest extends BaseIsalesClientTestCase{
	@Resource
	private WorkguideClient workguideClient;
	@Test
	public void testFindAllWorkguide() {
		PersonalFullInfoDTO info = new PersonalFullInfoDTO();
		info.setOperatorId(7219L);
		info.setShopId("8800136081");
		info.setMainProductId("106");
		info.setUserCode("Z0188790");
		DubboResult result = (DubboResult) workguideClient.findAllWorkguide(info);
		List<WorkguideDTO> list = result.getResultBean();
		Assert.notNull(list);
	}
}
