package com.haier.openplatform.showcase.security.service.impl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.openplatform.hfs.client.dto.FileResult;
import com.haier.openplatform.i18n.I18nResolver;
import com.haier.openplatform.i18n.I18nResolverFactory;
import com.haier.openplatform.security.LoginContextHolder;
import com.haier.openplatform.showcase.security.dao.FileUploadDAO;
import com.haier.openplatform.showcase.security.domain.UploadFile;
import com.haier.openplatform.showcase.security.domain.enu.FileStatusEnum;
import com.haier.openplatform.showcase.security.domain.enu.FileTypeEnum;
import com.haier.openplatform.showcase.security.model.FileSearchModel;
import com.haier.openplatform.showcase.security.service.FileServiceClientAdapter;
import com.haier.openplatform.showcase.security.service.FileUploadService;
import com.haier.openplatform.showcase.util.FileConstants;
import com.haier.openplatform.util.ExecuteResult;
import com.haier.openplatform.util.Pager;

public class FileUploadServiceImpl implements FileUploadService {
	
	private static final Logger LOG = LoggerFactory.getLogger(FileUploadServiceImpl.class);
	private static final I18nResolver I18N_RESOLVER = I18nResolverFactory.getDefaultI18nResolver(FileUploadServiceImpl.class);
	
	private static final int BUFFERED_SIZE = 4 * 1024;
	
	private FileUploadDAO fileUploadDAO;
	private FileConstants fileConstants;
	private FileServiceClientAdapter fileServiceClientAdapter;
	
	@Override
	public Pager<UploadFile> getFileByStatusAndType(FileSearchModel model){
		List<UploadFile> fileList = fileUploadDAO.getFileByStatusAndType(model);
		Long count = fileUploadDAO.getFileByStatusAndTypeCount(model);
		return Pager.cloneFromPager(model.getPager(),count,fileList);
	}
	
	@Override
	public ExecuteResult<UploadFile> fileUpload(File fileInput,String fileInputFileName,String userName) throws IOException{
		ExecuteResult<UploadFile> result = new ExecuteResult<UploadFile>();
		String saveFileName = null;
		if(isSaveFileSystem()){
			//文件系统存储
			saveFileName = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) + fileInputFileName.substring(fileInputFileName.lastIndexOf('.'));
			saveToFileSystem(fileInput,saveFileName,result);
		}else{
			//mongodb存储
			String uuid = saveToMongodb(fileInput,fileInputFileName,result);
			if(StringUtils.isNotBlank(uuid)){
				saveFileName = uuid;
			}
			
		}
		if(!result.isSuccess()){
			return result;
		}
		Date curDate = new Date();
		UploadFile uploadFile=new UploadFile();
		uploadFile.setFileName(fileInputFileName);
		uploadFile.setSaveFileName(saveFileName);
		uploadFile.setFilePath1(fileConstants.getFileSavePath());
		uploadFile.setStatus(FileStatusEnum.VALID.getStatus());
		uploadFile.setLastModifiedBy(userName);
		uploadFile.setLastModifiedDt(curDate);
		uploadFile.setCreateBy(userName);
		uploadFile.setCreateDt(curDate);
		if(isSaveFileSystem()){
			uploadFile.setType(FileTypeEnum.FILE_SYSTEM.getType());
		}else{
			uploadFile.setType(FileTypeEnum.MONGODB.getType());
		}
		fileUploadDAO.save(uploadFile);
		result.setResult(uploadFile);
		return result;
	}
	
	private void saveToFileSystem(File fileInput,String saveFileName,ExecuteResult<UploadFile> result){
		if(fileInput == null){
			result.addErrorMessage(I18N_RESOLVER.getMessage("file.not.empty"));
			return;
		}
		try{
			File outDir = new File(fileConstants.getFileSavePath() + File.separator);
			if(!outDir.exists()){
				if(!outDir.mkdirs()){
					result.addErrorMessage(I18N_RESOLVER.getMessage("file.dir.create.fail"));
					return;
				}
			}
			File outFile = new File(fileConstants.getFileSavePath() + File.separator + saveFileName);
			if(!copy(fileInput,outFile)){
				result.addErrorMessage(I18N_RESOLVER.getMessage("file.save.error"));
				return;
			}
		}catch(Exception e){
			result.addErrorMessage(I18N_RESOLVER.getMessage("file.save.error"));
			LOG.error("saveToFileSystem error.",e);
		}
	}
	
	private String saveToMongodb(File fileInput,String fileName,ExecuteResult<UploadFile> result){
		FileResult fileResult = fileServiceClientAdapter.saveFile(fileInput, fileName);
		if(fileResult.isSuccess()){
			return fileResult.getFileUUID();
		}else{
			result.addErrorMessage(fileResult.getMsg());
			return null;
		}
	}

	 private boolean copy(File src,File target){
		 boolean flag = false;
         InputStream in = null;
         OutputStream out = null;
         try {
             in = new BufferedInputStream(new FileInputStream(src), BUFFERED_SIZE);
             out = new BufferedOutputStream(new FileOutputStream(target), BUFFERED_SIZE);
             byte[] bs = new byte[BUFFERED_SIZE];
             int i;
             while ((i = in.read(bs)) > 0) {
                     out.write(bs, 0, i);
             }
         } catch (FileNotFoundException e) {
             LOG.error("file not found.",e);
         } catch (IOException e) {
        	 LOG.error("io exception.",e);
         } finally {
             try {
                 if (in != null){
                	 in.close();
                  }
                 if (out != null){
                	 out.close();
                 }
             } catch (IOException e) {
            	 LOG.error("close file error.",e);
             }
         }
         flag = true;
         return flag;
	 }

	@Override
	public InputStream getFileInputStream(Long id) {
		UploadFile uploadFile = fileUploadDAO.get(id);
		if(uploadFile == null){
			return null;
		}
		InputStream is = null;
		if(FileTypeEnum.FILE_SYSTEM.getType().equals(uploadFile.getType())){
			try {
				File file = new File(fileConstants.getFileSavePath() + File.separator + uploadFile.getSaveFileName());
				is = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				LOG.debug(e.getMessage(),e);
			}
		}else{
			FileResult result = fileServiceClientAdapter.findFile(uploadFile.getSaveFileName());
			is = result.getInputStream();
		}
		return is;
	}
	
	private boolean isSaveFileSystem(){
		return StringUtils.isNotBlank(fileConstants.getFileSavePath());
	}
	
	@Override
	public ExecuteResult<String> deleteFileByIds(String ids){
		ExecuteResult<String> result = new ExecuteResult<String>();
		if(StringUtils.isBlank(ids)){
			result.addErrorMessage(I18N_RESOLVER.getMessage("file.not.select"));
			return result;
		}
		String[] nameAndIds = ids.split(",");
		for(String nameAndId : nameAndIds){
			String[] tmp = nameAndId.split(":");
			if(tmp == null || tmp.length != 2){
				continue;
			}
			String msg = deleteFileById(Long.parseLong(tmp[0]));
			if(StringUtils.isNotBlank(msg)){
				result.addErrorMessage(tmp[1] + ":" + msg);
			}
		}
		return result;
	}
	
	@Override
	public String deleteFileById(Long id){
		try{
			UploadFile uf = fileUploadDAO.get(id);
			if(uf == null){
				return I18N_RESOLVER.getMessage("file.not.exist");
			}
			if(FileTypeEnum.FILE_SYSTEM.getType().equals(uf.getType())){
				//删除文件系统文件
				File file = new File(fileConstants.getFileSavePath() + File.separator + uf.getSaveFileName());
				if(!file.exists()){
					return I18N_RESOLVER.getMessage("file.not.exist");
				}
				if(!file.delete()){
					return I18N_RESOLVER.getMessage("file.delete.error");
				}
			}else{
				//删除mongodb文件
				FileResult delResult = fileServiceClientAdapter.deleteFile(uf.getSaveFileName());
				if(!delResult.isSuccess()){
					return delResult.getMsg();
				}
			}
			uf.setStatus(FileStatusEnum.INVALID.getStatus());
			uf.setLastModifiedBy(LoginContextHolder.get().getUserName());
			uf.setLastModifiedDt(new Date());
			fileUploadDAO.update(uf);
		}catch(Exception e){
			LOG.error("deleteFileById error,id=" + id,e);
			return I18N_RESOLVER.getMessage("file.delete.error");
		}
		return null;
	}
	
	public void setFileUploadDAO(FileUploadDAO fileUploadDAO) {
		this.fileUploadDAO = fileUploadDAO;
	}

	public void setFileConstants(FileConstants fileConstants) {
		this.fileConstants = fileConstants;
	}

	public void setFileServiceClientAdapter(
			FileServiceClientAdapter fileServiceClientAdapter) {
		this.fileServiceClientAdapter = fileServiceClientAdapter;
	}
	
}
