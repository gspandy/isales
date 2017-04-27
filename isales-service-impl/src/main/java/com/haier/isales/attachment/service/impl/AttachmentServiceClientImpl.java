/**
* @Company 青鸟软通   
* @Title: AttachmentServiceClientImpl.java 
* @Package com.haier.isales.attachment.service.impl 
* @author John Zhao   
* @date 2014-11-14 下午1:25:05 
* @version V1.0   
*/ 
package com.haier.isales.attachment.service.impl;

import com.haier.isales.attachment.AttachmentDomainDTOutil;
import com.haier.isales.attachment.domain.AttachmentDomain;
import com.haier.isales.attachment.dto.AttachmentDTO;
import com.haier.isales.attachment.service.AttachmentService;
import com.haier.isales.attachment.service.AttachmentServiceClient;

/** 
 * @ClassName: AttachmentServiceClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class AttachmentServiceClientImpl implements AttachmentServiceClient {
	
	private AttachmentService attachmentService;

	/**
	 * <p>Description: </p> 
	 * @author John Zhao   
	 * @date 2014-11-14 下午1:25:05 
	 * @param appName
	 * @param files
	 * @param fileName
	 * @return 
	 * @see com.haier.isales.attachment.service.AttachmentServiceClient#uploadAttachment(java.lang.String, byte[], java.lang.String) 
	 */
	@Override
	public AttachmentDTO uploadAttachment(AttachmentDTO attachmentDTO) {
		AttachmentDomain ad = attachmentService.saveUploadFile(attachmentDTO);
		AttachmentDTO attachment = AttachmentDomainDTOutil.cloneAttachmentDomainToDTO(ad);
		return attachment;
	}

	/**
	* <p>Description: 通过id从附件表获取文件</p> 
	* @author John Zhao   
	* @date 2014-11-20 下午2:24:12 
	* @param id
	* @return 
	* @see com.haier.isales.attachment.service.AttachmentServiceClient#getAttachmentId(java.lang.String) 
	*/ 
	@Override
	public AttachmentDTO getAttachmentId(Long id) {
		AttachmentDomain ad = attachmentService.findFile(id);
		AttachmentDTO attachment = AttachmentDomainDTOutil.cloneAttachmentDomainToDTO(ad);
		return attachment;
	}
	//=============================================================//
	/**
	 * @Description: 属性 attachmentService 的set方法 
	 * @param attachmentService 
	 */
	public void setAttachmentService(AttachmentService attachmentService) {
		this.attachmentService = attachmentService;
	}

}
