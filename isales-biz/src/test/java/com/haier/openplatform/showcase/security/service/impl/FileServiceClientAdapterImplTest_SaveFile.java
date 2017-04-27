package com.haier.openplatform.showcase.security.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import java.io.File;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import com.haier.openplatform.hfs.client.dto.FileResult;

public class FileServiceClientAdapterImplTest_SaveFile extends BaseSecurityTestCase {

	@Test
	public void testSaveFile() {
		try{
			InputStream is = this.getClass().getResourceAsStream("FileServiceClientAdapterImplTest_SaveFile.xml");
			String str = IOUtils.toString(is);
			File file = new File("test");
			FileUtils.writeStringToFile(file, str);
			FileResult result = fileServiceClientAdapter.saveFile(file, "FileServiceClientAdapterImplTest_SaveFile.xml");
			assertThat(result,notNullValue());
			assertThat(result.isSuccess(),equalTo(true));
			assertThat(result.getFileUUID(),notNullValue());
			FileResult result1 = fileServiceClientAdapter.deleteFile(result.getFileUUID());
			assertThat(result1,notNullValue());
			assertThat(result1.isSuccess(),equalTo(true));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	public void testSaveFile_FileNotExist() {
		FileResult result = fileServiceClientAdapter.saveFile(new File(""), "text.txt");
		assertThat(result, notNullValue());
		assertThat(result.isSuccess(), equalTo(false));
	}
}
