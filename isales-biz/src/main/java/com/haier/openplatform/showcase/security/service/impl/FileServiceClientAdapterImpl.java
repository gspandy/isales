package com.haier.openplatform.showcase.security.service.impl;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.openplatform.hfs.client.dto.FileRequest;
import com.haier.openplatform.hfs.client.dto.FileResult;
import com.haier.openplatform.hfs.client.service.FileServiceClient;
import com.haier.openplatform.showcase.security.service.FileServiceClientAdapter;

public class FileServiceClientAdapterImpl implements FileServiceClientAdapter{
	private static final Logger LOGGER = LoggerFactory.getLogger(FileServiceClientAdapterImpl.class);
	private FileServiceClient fileServiceClient;
	private String appName;
	private String storeSystemAddress;
	
	public FileResult saveFile(File file,String fileName){
		FileResult result = null;
		try{
			FileRequest request = generalCommonRequest(appName,storeSystemAddress);
			request.setBytes(FileUtils.readFileToByteArray(file));
			request.setFileName(fileName);
			result = fileServiceClient.saveFile(request);
		}catch(Exception e){
			LOGGER.error("saveFile error,fileName=" + fileName,e);
			result = new FileResult();
			result.setSuccess(false);
			result.setMsg(e.toString());
		}
		return result;
	}
	
	public FileResult findFile(String uuid){
		FileResult result = null;
		try{
			FileRequest request = generalCommonRequest(appName,storeSystemAddress);
			request.setFileId(uuid);
			result = fileServiceClient.findFileByUUID(request);
		}catch(Exception e){
			LOGGER.error("findFile error,uuid=" + uuid,e);
			result = new FileResult();
			result.setSuccess(false);
		}
		return result;
	}

	public FileResult deleteFile(String uuid){
		FileResult result = null;
		try{
			FileRequest request = generalCommonRequest(appName,storeSystemAddress);
			request.setFileId(uuid);
			result = fileServiceClient.deleteFileByUID(request);
		}catch(Exception e){
			LOGGER.error("deleteFile error,uuid=" + uuid,e);
			result = new FileResult();
			result.setSuccess(false);
		}
		return result;
	}
	
	public FileRequest generalCommonRequest(String appName,String storeSystemAddress){
		FileRequest request = new FileRequest();
		request.setAppName(appName);
		request.setStoreSystemAddress(storeSystemAddress);
		return request;
	}
	
	public void setFileServiceClient(FileServiceClient fileServiceClient) {
		this.fileServiceClient = fileServiceClient;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public void setStoreSystemAddress(String storeSystemAddress) {
		this.storeSystemAddress = storeSystemAddress;
	}
}
