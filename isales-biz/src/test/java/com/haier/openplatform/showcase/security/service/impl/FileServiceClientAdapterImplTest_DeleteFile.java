package com.haier.openplatform.showcase.security.service.impl;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.junit.Test;

import com.haier.openplatform.hfs.client.dto.FileRequest;
import com.haier.openplatform.hfs.client.dto.FileResult;
import com.haier.openplatform.hfs.client.service.FileServiceClient;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;

public class FileServiceClientAdapterImplTest_DeleteFile extends BaseSecurityTestCase {

	@Test
	public void testDeleteFile() {
		FileResult result = fileServiceClientAdapter.deleteFile("test");
		assertThat(result,notNullValue());
		assertThat(result.isSuccess(),equalTo(true));
	}

	@Test
	public void testDeleteFile_Mock() {
		FileServiceClientAdapterImpl impl = new FileServiceClientAdapterImpl();
		IMocksControl mock = EasyMock.createControl();
		FileServiceClient client = mock.createMock(FileServiceClient.class);
		impl.setFileServiceClient(client);
		
		EasyMock.expect(client.deleteFileByUID((FileRequest)EasyMock.anyObject())).andThrow(new RuntimeException());
		mock.replay();
		
		FileResult result = impl.deleteFile("test");
		assertThat(result, notNullValue());
		assertThat(result.isSuccess(), equalTo(false));
	}
}
