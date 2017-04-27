package com.haier.openplatform.showcase.security.model;

import com.haier.openplatform.showcase.security.domain.UploadFile;
import com.haier.openplatform.util.SearchModel;

public class FileSearchModel extends SearchModel<UploadFile>{
	private static final long serialVersionUID = -7574106050152907124L;
	private UploadFile file = new UploadFile();
	public UploadFile getFile() {
		return file;
	}
	public void setFile(UploadFile file) {
		this.file = file;
	}
	
}
