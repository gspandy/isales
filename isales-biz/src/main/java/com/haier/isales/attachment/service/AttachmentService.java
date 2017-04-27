/**
 * @Company 青鸟软通   
 * @Title: AttachmentService.java 
 * @Package  com.haier.isales.attachment.service
 * @author John Zhao   
 * @date 2014年11月14日  11:33:02
 * @version V1.0   
 */
package com.haier.isales.attachment.service;

import com.haier.isales.attachment.domain.AttachmentDomain;
import com.haier.isales.attachment.dto.AttachmentDTO;

/**
 * @ClassName: AttachmentService
 * @Description: Attachment的Service接口定义类
 * 
 */
public interface AttachmentService {

	/** 
	* @Description: 把附件信息保存到附件表中
	* @author John Zhao   
	* @date 2014-11-14 下午5:01:55 
	* @param operatorId
	* @param appName
	* @param files
	* @param fileName
	* @return  
	*/ 
	public AttachmentDomain saveUploadFile(AttachmentDTO attachmentDTO);

	/** 
	* @Description: 通过附件的id获取附件的信息，通过uuid去mongodb获取图片
	* @author John Zhao   
	* @date 2014-11-20 下午6:37:12 
	* @param id
	* @return  
	*/ 
	public AttachmentDomain findFile(Long id);
}
