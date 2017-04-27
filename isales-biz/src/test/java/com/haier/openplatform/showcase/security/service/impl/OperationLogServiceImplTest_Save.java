package com.haier.openplatform.showcase.security.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.notNullValue;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import com.haier.openplatform.log.domain.OperationLog;
import com.haier.openplatform.showcase.security.model.OperationLogSearchModel;
import com.haier.openplatform.util.Pager;

@Transactional
public class OperationLogServiceImplTest_Save extends BaseSecurityTestCase{

	@Test
	public void testSave() {
		Date date = new Date();
		OperationLog log = new OperationLog();
		log.setUserId(999999L);
		log.setUserName("test");
		log.setAppName("TEST");
		log.setGmtCreate(date);
		log.setGmtModified(date);
		operationLogService.save(log);
		OperationLogSearchModel logSearchModel = new OperationLogSearchModel();
		logSearchModel.getOperationLog().setAppName("TEST");
		logSearchModel.setFrom(DateFormatUtils.format(date, "yyyy-MM-dd"));
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, 1);
		logSearchModel.setTo(DateFormatUtils.format(cal, "yyyy-MM-dd"));
		Pager<OperationLog> logs = operationLogService.searchOperationLog(logSearchModel);
		assertThat(logs, notNullValue());
		assertThat(logs.getRecords(), notNullValue());
		assertThat(logs.getRecords().size(), greaterThanOrEqualTo(1));
		assertThat(logs.getRecords().get(0), notNullValue());
		assertThat(logs.getRecords().get(0).getUserId(), equalTo(999999L));
		assertThat(logs.getRecords().get(0).getUserName(), equalTo("test"));
	}

}
