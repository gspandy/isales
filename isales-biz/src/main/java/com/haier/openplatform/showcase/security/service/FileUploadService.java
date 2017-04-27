package com.haier.openplatform.showcase.security.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.haier.openplatform.showcase.security.domain.UploadFile;
import com.haier.openplatform.showcase.security.model.FileSearchModel;
import com.haier.openplatform.util.ExecuteResult;
import com.haier.openplatform.util.Pager;


public interface FileUploadService {
	
	Pager<UploadFile> getFileByStatusAndType(FileSearchModel model);
	
	ExecuteResult<UploadFile> fileUpload(File fileInput,String fileInputFileName,String userName) throws IOException;
	
	InputStream getFileInputStream(Long id);
	
	ExecuteResult<String> deleteFileByIds(String ids);
	
	String deleteFileById(Long id);
}
