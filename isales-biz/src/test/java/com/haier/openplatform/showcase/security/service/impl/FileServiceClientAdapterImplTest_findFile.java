package com.haier.openplatform.showcase.security.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.junit.Test;

import com.haier.openplatform.hfs.client.dto.FileRequest;
import com.haier.openplatform.hfs.client.dto.FileResult;
import com.haier.openplatform.hfs.client.service.FileServiceClient;

public class FileServiceClientAdapterImplTest_findFile extends BaseSecurityTestCase{

	@Test
	public void testFindFile() {
		FileResult result = fileServiceClientAdapter.findFile("test");
		assertThat(result,notNullValue());
	}

	@Test
	public void testFindFile_Mock() {
		FileServiceClientAdapterImpl impl = new FileServiceClientAdapterImpl();
		IMocksControl mock = EasyMock.createControl();
		FileServiceClient fileClient = mock.createMock(FileServiceClient.class);
		impl.setFileServiceClient(fileClient);
		
		EasyMock.expect(fileClient.findFileByUUID((FileRequest)EasyMock.anyObject())).andThrow(new RuntimeException());
		mock.replay();
		
		FileResult result = impl.findFile("test");
		assertThat(result, notNullValue());
		assertThat(result.isSuccess(), equalTo(false));
	}
}
