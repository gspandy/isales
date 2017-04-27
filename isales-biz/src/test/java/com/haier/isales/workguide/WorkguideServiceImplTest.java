package com.haier.isales.workguide;

import java.util.List;

import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.system.user.domain.UserFullInfoDomain;
import com.haier.isales.workguide.domain.WorkguideDomain;
import com.haier.isales.workguide.service.WorkguideService;

@ContextConfiguration(locations={
		"classpath*:/spring/workguide/spring-workguide.xml",
		"classpath*:/spring/dailymgt/spring-dailyMgt.xml",
		"classpath*:/spring/customer/spring-customer.xml",
		"classpath*:/spring/reminder/spring-reminderBpm.xml",
		"classpath*:/spring/retail/spring-btbSjcjScrm.xml",
		"classpath*:/spring/retail/spring-btbSjcjScrmAll.xml"
})
//@Ignore
public class WorkguideServiceImplTest extends BaseIsalesTestCase{
	@Resource
	private WorkguideService workguideService;
	@Test
	public void testWorkguideService() {
		UserFullInfoDomain info = new UserFullInfoDomain();
		info.setOperatorId(7219L);
		info.setShopId("8800136081");
		info.setMainProductId("106");
		info.setUserCode("Z0188790");
		List<WorkguideDomain> list = workguideService.findAll(info);
		for (WorkguideDomain domain : list) {
			if ("0001".equals(domain.getJobCode())) {
				MatcherAssert.assertThat(domain.getJobStatus(), Matchers.notNullValue());
				MatcherAssert.assertThat(domain.getJobDesc(), Matchers.notNullValue());
			}
		}
	}
	@Test
	public void testWorkguideService2() {
		UserFullInfoDomain info = new UserFullInfoDomain();
		info.setOperatorId(7219L);
		info.setShopId("8800136081");
		info.setMainProductId("106");
		info.setUserCode("Z0188790");
		List<WorkguideDomain> list = workguideService.findAll(info);
		for (WorkguideDomain domain : list) {
			if ("0002".equals(domain.getJobCode())) {
				MatcherAssert.assertThat(domain.getJobStatus(), Matchers.notNullValue());
				MatcherAssert.assertThat(domain.getJobDesc(), Matchers.notNullValue());
			}
		}
	}
	@Test
	public void testWorkguideService3() {
		UserFullInfoDomain info = new UserFullInfoDomain();
		info.setOperatorId(7219L);
		info.setShopId("8800136081");
		info.setMainProductId("106");
		info.setUserCode("Z0188790");
		List<WorkguideDomain> list = workguideService.findAll(info);
		for (WorkguideDomain domain : list) {
			if ("0003".equals(domain.getJobCode())) {
				MatcherAssert.assertThat(domain.getJobStatus(), Matchers.notNullValue());
				MatcherAssert.assertThat(domain.getJobDesc(), Matchers.notNullValue());
			}
		}
	}
	@Test
	public void testWorkguideService4() {
		UserFullInfoDomain info = new UserFullInfoDomain();
		info.setOperatorId(7219L);
		info.setShopId("8800136081");
		info.setMainProductId("106");
		info.setUserCode("Z0188790");
		List<WorkguideDomain> list = workguideService.findAll(info);
		for (WorkguideDomain domain : list) {
			if ("0004".equals(domain.getJobCode())) {
				MatcherAssert.assertThat(domain.getJobStatus(), Matchers.notNullValue());
				MatcherAssert.assertThat(domain.getJobDesc(), Matchers.notNullValue());
			}
		}
	}
	@Test
	public void testWorkguideService5() {
		UserFullInfoDomain info = new UserFullInfoDomain();
		info.setOperatorId(7219L);
		info.setShopId("8800136081");
		info.setMainProductId("106");
		info.setUserCode("Z0188790");
		List<WorkguideDomain> list = workguideService.findAll(info);
		for (WorkguideDomain domain : list) {
			if ("0005".equals(domain.getJobCode())) {
				MatcherAssert.assertThat(domain.getJobStatus(), Matchers.notNullValue());
				MatcherAssert.assertThat(domain.getJobDesc(), Matchers.notNullValue());
			}
		}
	}
	@Test
	public void testWorkguideService6() {
		UserFullInfoDomain info = new UserFullInfoDomain();
		info.setOperatorId(7219L);
		info.setShopId("8800136081");
		info.setMainProductId("106");
		info.setUserCode("A0188790");
		List<WorkguideDomain> list = workguideService.findAll(info);
		for (WorkguideDomain domain : list) {
			if ("0005".equals(domain.getJobCode())) {
				MatcherAssert.assertThat(domain, Matchers.nullValue());
			}
		}
	}
	@Test
	public void testWorkguideService7() {
		UserFullInfoDomain info = new UserFullInfoDomain();
		info.setOperatorId(7219L);
		info.setShopId("8800136081");
		info.setMainProductId("106");
		info.setUserCode("Z0188790");
		List<WorkguideDomain> list = workguideService.findAll(info);
		for (WorkguideDomain domain : list) {
			if ("0006".equals(domain.getJobCode())) {
				MatcherAssert.assertThat(domain.getJobStatus(), Matchers.notNullValue());
				MatcherAssert.assertThat(domain.getJobDesc(), Matchers.notNullValue());
			}
		}
	}
	@Test
	public void testWorkguideService8() {
		UserFullInfoDomain info = new UserFullInfoDomain();
		info.setOperatorId(7219L);
		info.setShopId("8800136081");
		info.setMainProductId("106");
		info.setUserCode("Z0188790");
		List<WorkguideDomain> list = workguideService.findAll(info);
		for (WorkguideDomain domain : list) {
			if ("0007".equals(domain.getJobCode())) {
				MatcherAssert.assertThat(domain.getJobStatus(), Matchers.notNullValue());
				MatcherAssert.assertThat(domain.getJobDesc(), Matchers.notNullValue());
			}
		}
	}
	@Test
	public void testWorkguideService9() {
		UserFullInfoDomain info = new UserFullInfoDomain();
		info.setOperatorId(7219L);
		info.setShopId("8800136081");
		info.setMainProductId("106");
		info.setUserCode("Z0188790");
		List<WorkguideDomain> list = workguideService.findAll(info);
		for (WorkguideDomain domain : list) {
			if ("0008".equals(domain.getJobCode())) {
				MatcherAssert.assertThat(domain, Matchers.nullValue());
			}
		}
	}
}
