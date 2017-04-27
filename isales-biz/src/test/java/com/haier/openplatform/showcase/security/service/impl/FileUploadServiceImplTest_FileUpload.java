package com.haier.openplatform.showcase.security.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.junit.Test;

import com.haier.openplatform.showcase.security.dao.FileUploadDAO;
import com.haier.openplatform.showcase.security.domain.UploadFile;
import com.haier.openplatform.showcase.util.FileConstants;
import com.haier.openplatform.util.ExecuteResult;

public class FileUploadServiceImplTest_FileUpload extends BaseSecurityTestCase{

	@Test
	public void testFileUpload_mongodb() {
		try{
			InputStream is = this.getClass().getResourceAsStream("FileUploadServiceImplTest_FileUpload.xml");
			String str = IOUtils.toString(is);
			File file = new File("test");
			FileUtils.writeStringToFile(file, str);
			ExecuteResult<UploadFile> result = fileUploadService.fileUpload(file, "test.txt","sys");
			assertThat(result,notNullValue());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	public void testFileUpload_file(){
		FileUploadServiceImpl fileUploadImpl = new FileUploadServiceImpl();
		IMocksControl mockControl = EasyMock.createControl();
		FileConstants fc = mockControl.createMock(FileConstants.class);
		FileUploadDAO fuDAO = mockControl.createMock(FileUploadDAO.class);
		fileUploadImpl.setFileConstants(fc);
		fileUploadImpl.setFileUploadDAO(fuDAO);
		
		EasyMock.expect(fc.getFileSavePath()).andReturn("/home/haieradmin/tmp");
		EasyMock.expect(fc.getFileSavePath()).andReturn("/home/haieradmin/tmp");
		EasyMock.expect(fc.getFileSavePath()).andReturn("/home/haieradmin/tmp");
		EasyMock.expect(fc.getFileSavePath()).andReturn("/home/haieradmin/tmp");
		EasyMock.expect(fc.getFileSavePath()).andReturn("/home/haieradmin/tmp");
		
		fuDAO.save(EasyMock.anyObject(UploadFile.class));
		EasyMock.expectLastCall();
		mockControl.replay();
		
		try {
			InputStream is = this.getClass().getResourceAsStream("FileUploadServiceImplTest_FileUpload.xml");
			String str = IOUtils.toString(is);
			File file = new File("test");
			FileUtils.writeStringToFile(file, str);
			ExecuteResult<UploadFile> result = fileUploadImpl.fileUpload(file, "test.txt","sys");
			assertThat(result,notNullValue());
			assertThat(result.isSuccess(),equalTo(true));
		} catch (IOException e) {
		}
		mockControl.verify();
	}
}
