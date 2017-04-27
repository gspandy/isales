package com.haier.openplatform.showcase.security.service.impl;

import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

import java.io.File;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import com.haier.openplatform.showcase.security.domain.UploadFile;
import com.haier.openplatform.test.dbunit.annotation.IUnitDataSet;
import com.haier.openplatform.util.ExecuteResult;

@IUnitDataSet
public class FileUploadServiceImplTest_GetFileInputStream extends BaseSecurityTestCase{

	@Test
	public void testGetFileInputStream_mongodb() {
		try{
			InputStream is = this.getClass().getResourceAsStream("FileUploadServiceImplTest_DeleteFileByIds.xml");
			String str = IOUtils.toString(is);
			File file = new File("test");
			FileUtils.writeStringToFile(file, str);
			ExecuteResult<UploadFile> result = fileUploadService.fileUpload(file, "FileUploadServiceImplTest_DeleteFileByIds.xml","sys");
			InputStream inputs = fileUploadService.getFileInputStream(result.getResult().getId());
			assertThat(inputs,notNullValue());
			fileUploadService.deleteFileById(result.getResult().getId());
		}catch(Exception e){
			
		}
	}
	
	@Test
	public void testGetFileInputStream_file() {
		InputStream is = fileUploadService.getFileInputStream(99999992L);
		assertThat(is,nullValue());
	}

}
