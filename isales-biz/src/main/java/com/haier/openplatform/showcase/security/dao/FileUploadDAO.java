package com.haier.openplatform.showcase.security.dao;

import java.util.List;

import com.haier.openplatform.dao.CommonDAO;
import com.haier.openplatform.showcase.security.domain.UploadFile;
import com.haier.openplatform.showcase.security.model.FileSearchModel;

public interface FileUploadDAO extends CommonDAO<UploadFile, Long>{
	
	/**
	 * 分页查询文件
	 * @param model
	 * @return
	 */
	List<UploadFile> getFileByStatusAndType(FileSearchModel model);
	/**
	 * 查询文件总条数
	 * @param model
	 * @return
	 */
	Long getFileByStatusAndTypeCount(FileSearchModel model);
	/**
	 * 保存
	 * @param uploadFile
	 */
	void saveFile(UploadFile uploadFile);
}
