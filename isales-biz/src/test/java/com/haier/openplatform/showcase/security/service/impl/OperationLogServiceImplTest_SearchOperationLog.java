package com.haier.openplatform.showcase.security.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.haier.openplatform.log.domain.OperationLog;
import com.haier.openplatform.showcase.security.model.OperationLogSearchModel;
import com.haier.openplatform.test.dbunit.annotation.IUnitDataSet;
import com.haier.openplatform.util.Pager;

/**
 * @author kevin
 *
 */
@IUnitDataSet
public class OperationLogServiceImplTest_SearchOperationLog extends BaseSecurityTestCase {
	
	@Test
	public void testSearchOperationLog() {
		OperationLogSearchModel logSearchModel = new OperationLogSearchModel();
		logSearchModel.setFrom("2001-01-01");
		logSearchModel.setTo("2001-02-01");
		logSearchModel.getOperationLog().setAppName("UNIT_TEST");
		Pager<OperationLog> pager = operationLogService.searchOperationLog(logSearchModel);
		assertThat(pager.getTotalRecords(), equalTo(3L));
		Set<Long> ids = new HashSet<Long>();
		ids.add(99999901L);
		ids.add(99999902L);
		ids.add(99999903L);
		List<OperationLog> logs = pager.getRecords();
		for(OperationLog log : logs){
			ids.remove(log.getId());
		}
		assertThat(ids.isEmpty(), equalTo(true));
		
	}

}
