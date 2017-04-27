/**
 * @Company 青鸟软通   
 * @Title: AttachmentService.java 
 * @Package  com.haier.isales.attachment.service.impl
 * @author John Zhao   
 * @date 2014年11月14日  11:33:02
 * @version V1.0   
 */
package com.haier.isales.attachment.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.attachment.AttachmentDomainDTOutil;
import com.haier.isales.attachment.dao.AttachmentDAO;
import com.haier.isales.attachment.domain.AttachmentDomain;
import com.haier.isales.attachment.dto.AttachmentDTO;
import com.haier.isales.attachment.service.AttachmentService;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;

/**
 * @ClassName: AttachmentService
 * @Description: Attachment的Service接口定义类
 * 
 */
public class AttachmentServiceImpl implements AttachmentService {

	private static final Logger LOG = LoggerFactory.getLogger(AttachmentServiceImpl.class);

	/**
	 * @Fields attachmentDao : AttachmentDao 工具依赖
	 */
	private AttachmentDAO attachmentDao;

	/* ===============业务方法============= */

	/**
	 * <p>
	 * Description: 向数据库中保存文件的资料
	 * </p>
	 * 
	 * @author John Zhao
	 * @date 2014-11-14 上午11:34:55
	 * @see com.haier.isales.attachment.service.AttachmentService#saveUploadFile()
	 */
	@Override
	public AttachmentDomain saveUploadFile(AttachmentDTO attachmentDTO) {
		LOG.info("上传文件传入的参数为：" + attachmentDTO);
		if (attachmentDTO == null) {
			throw new BusinessException(BusinessExceptionCode.param_error);
		}
		AttachmentDomain ad = AttachmentDomainDTOutil.cloneAttachmentDTOToDomain(attachmentDTO);
		attachmentDao.save(ad);
		return ad;
	}

	// /**
	// * @Description: 向mangodb中保存文件
	// * @author John Zhao
	// * @date 2014-11-14 上午11:41:41
	// * @param appName
	// * @param files
	// * @param fileName
	// * @return 主要获得返回的uuid
	// */
	// public FileResult saveFile(String appName, byte[] files, String fileName)
	// {
	// FileResult result = null;
	// try {
	// FileRequest request = generalCommonRequest(appName, storeSystemAddress);
	// request.setBytes(files);
	// request.setFileName(fileName);
	// result = fileServiceClient.saveFile(request);
	// if (result == null) {
	// throw new BusinessException(BusinessExceptionCode.save_file_to_mongodb);
	// } else if (!result.isSuccess()) {
	// throw new BusinessException(BusinessExceptionCode.save_file_to_mongodb,
	// result.getMsg());
	// }
	// } catch (Exception e) {
	// LOG.error("saveFile error,fileName=" + fileName, e);
	// result = new FileResult();
	// result.setSuccess(false);
	// result.setMsg(e.toString());
	// }
	// return result;
	// }
	//
	// public FileRequest generalCommonRequest(String appName, String
	// storeSystemAddress) {
	// FileRequest request = new FileRequest();
	// request.setAppName(appName);
	// request.setStoreSystemAddress(storeSystemAddress);
	// return request;
	// }

	/**
	 * @Description: 下载文件
	 * @author John Zhao
	 * @date 2014-11-14 下午5:01:34
	 * @param appName
	 * @param uuid
	 * @return
	 */
	@Override
	public AttachmentDomain findFile(Long id) {
		LOG.info("下载文件传入的参数为：" + id);
		if (id == null) {
			throw new BusinessException(BusinessExceptionCode.param_error);
		}
		AttachmentDomain attachmentDomain = attachmentDao.findById(id);
		if (attachmentDomain == null) {
			throw new BusinessException(BusinessExceptionCode.find_file_null);
		}
		return attachmentDomain;
	}

	/* ====================getter and setter ================= */

	/**
	 * @Description: 属性attachmentDao 的set方法
	 */
	public void setAttachmentDao(AttachmentDAO attachmentDao) {
		this.attachmentDao = attachmentDao;
	}

	// /**
	// * @Description: 属性 fileServiceClient 的set方法
	// * @param fileServiceClient
	// */
	// public void setFileServiceClient(FileServiceClient fileServiceClient) {
	// this.fileServiceClient = fileServiceClient;
	// }
	//
	// /**
	// * @Description: 属性 storeSystemAddress 的set方法
	// * @param storeSystemAddress
	// */
	// public void setStoreSystemAddress(String storeSystemAddress) {
	// this.storeSystemAddress = storeSystemAddress;
	// }

}
