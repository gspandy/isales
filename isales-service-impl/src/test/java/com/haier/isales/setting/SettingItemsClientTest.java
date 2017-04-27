package com.haier.isales.setting;

import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import com.haier.isales.common.DubboResult;
import com.haier.isales.settings.dto.UserSettingItemsDTO;
import com.haier.isales.settings.service.SettingItemsClient;
import com.haier.isales.test.BaseIsalesClientTestCase;

@ContextConfiguration(locations={
		"classpath*:/spring/setting/spring-setting.xml",
		"classpath*:/spring_service/settings/spring-settingitems-provider.xml"
})
public class SettingItemsClientTest extends BaseIsalesClientTestCase{
	@Resource
	private SettingItemsClient settingItemsClient;
	@Test
	public void testFindSettingItems() {
		Long operatorId = 7219L;
		DubboResult result = (DubboResult) settingItemsClient.findSettingItems(operatorId);
		UserSettingItemsDTO dto = result.getResultBean();
		Assert.notNull(dto.getOperatorId());
		Assert.notNull(dto.getItemName());
		Assert.notNull(dto.getValueId());
		Assert.notNull(dto.getValueName());
	}
	@Test
	public void testResetSettingItems() {
		Long operatorId = 7219L;
		Long newValueId = 2L;
		DubboResult result = (DubboResult) settingItemsClient.resetSettingItems(operatorId, newValueId);
		UserSettingItemsDTO dto = result.getResultBean();
		MatcherAssert.assertThat(dto.getOperatorId(), Matchers.equalTo(7219L));
		MatcherAssert.assertThat(dto.getItemName(), Matchers.equalTo("首页类型"));
		MatcherAssert.assertThat(dto.getValueId(), Matchers.equalTo(2L));
		MatcherAssert.assertThat(dto.getValueName(), Matchers.equalTo("工作指引首页"));
	}
}
