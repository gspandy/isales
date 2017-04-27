package com.haier.isales.settings.service;

import com.haier.isales.settings.domain.UserSettingItemsDomain;

public interface SettingItemsService {
	UserSettingItemsDomain findSettingItems(Long operatorId);
	void resetSettingItems(Long operatorId, Long newValueId);
}
