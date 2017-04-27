package com.haier.isales.settings;

import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.settings.domain.UserSettingItemsDomain;
import com.haier.isales.settings.service.SettingItemsService;

@ContextConfiguration(locations={
		"classpath*:/spring/setting/spring-setting.xml"
})
public class SettingItemsTest extends BaseIsalesTestCase{
	@Resource
	private SettingItemsService settingItemsService;
	@Test
	public void testFindSettingItems() {
		Long operatorId = 7219L;
		UserSettingItemsDomain domain = settingItemsService.findSettingItems(operatorId);
		Assert.notNull(domain.getOperatorId());
		Assert.notNull(domain.getItemName());
		Assert.notNull(domain.getValueId());
		Assert.notNull(domain.getValueName());
	}
	@Test
	public void testResetSettingItems() {
		Long operatorId = 7219L;
		Long newValueId = 2L;
		settingItemsService.resetSettingItems(operatorId, newValueId);
		UserSettingItemsDomain domain = settingItemsService.findSettingItems(operatorId);
		MatcherAssert.assertThat(domain.getOperatorId(), Matchers.equalTo(7219L));
		MatcherAssert.assertThat(domain.getItemName(), Matchers.equalTo("首页类型"));
		MatcherAssert.assertThat(domain.getValueId(), Matchers.equalTo(2L));
		MatcherAssert.assertThat(domain.getValueName(), Matchers.equalTo("工作指引首页"));
	}
}
