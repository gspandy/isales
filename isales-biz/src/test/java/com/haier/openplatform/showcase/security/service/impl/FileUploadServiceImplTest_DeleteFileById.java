package com.haier.openplatform.showcase.security.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

import org.junit.Test;

import com.haier.openplatform.test.dbunit.annotation.IUnitDataSet;

@IUnitDataSet
public class FileUploadServiceImplTest_DeleteFileById extends BaseSecurityTestCase{

	@Test
	public void testDeleteFileById_mongodb() {
		String result = fileUploadService.deleteFileById(99999992L);
		assertThat(result, nullValue());
		result = fileUploadService.deleteFileById(99999999L);
		assertThat(result, notNullValue());
	}

	@Test
	public void testDeleteFileById_file() {
		String result = fileUploadService.deleteFileById(99999993L);
		assertThat(result, notNullValue());
		assertThat(result,equalTo("文件不存在"));
	}
}
