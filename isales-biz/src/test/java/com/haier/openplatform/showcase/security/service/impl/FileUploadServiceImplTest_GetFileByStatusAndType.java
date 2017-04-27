package com.haier.openplatform.showcase.security.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Test;

import com.haier.openplatform.showcase.security.domain.UploadFile;
import com.haier.openplatform.showcase.security.domain.enu.FileStatusEnum;
import com.haier.openplatform.showcase.security.domain.enu.FileTypeEnum;
import com.haier.openplatform.showcase.security.model.FileSearchModel;
import com.haier.openplatform.test.dbunit.annotation.IUnitDataSet;
import com.haier.openplatform.util.Pager;

@IUnitDataSet
public class FileUploadServiceImplTest_GetFileByStatusAndType extends BaseSecurityTestCase{

	@Test
	public void testGetFileByStatusAndType() {
		FileSearchModel model = new FileSearchModel();
		UploadFile file = new UploadFile();
		file.setStatus(FileStatusEnum.VALID.getStatus());
		file.setType(FileTypeEnum.MONGODB.getType());
		model.setFile(file);
		Pager<UploadFile> fileList = fileUploadService.getFileByStatusAndType(model);
		assertThat(fileList,notNullValue());
		assertThat(fileList.getRecords(),notNullValue());
		assertThat(fileList.getRecords().size(),greaterThanOrEqualTo(1));
	}

}
