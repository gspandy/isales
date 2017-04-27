package com.haier.openplatform.showcase.security.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Test;

import com.haier.openplatform.test.dbunit.annotation.IUnitDataSet;
import com.haier.openplatform.util.ExecuteResult;

@IUnitDataSet
public class FileUploadServiceImplTest_DeleteFileByIds extends BaseSecurityTestCase{

	@Test
	public void testDeleteFileByIds() {
		ExecuteResult<String> result = fileUploadService.deleteFileByIds("99999990:单元测试.txt");
		assertThat(result, notNullValue());
		assertThat(result.getErrorMessages().isEmpty(),equalTo(true));
		result = fileUploadService.deleteFileByIds("99999992:单元测试1.txt");
		assertThat(result, notNullValue());
		assertThat(result.getErrorMessages().size(),greaterThanOrEqualTo(1));
	}

}
