/**
 * @Company 青鸟软通   
 * @Title: AttachmentServiceClient.java 
 * @Package com.haier.isales.attachment.service 
 * @author John Zhao   
 * @date 2014-11-14 下午1:20:32 
 * @version V1.0   
 */
package com.haier.isales.attachment.service;
import io.terminus.pampas.client.Export;

import com.haier.isales.attachment.dto.AttachmentDTO;

/**
 * @ClassName: AttachmentServiceClient
 * @Description: 附件、头像、录音等的保存接口
 * 
 */
public interface AttachmentServiceClient {

	/**
	 * @Description: 上传文件接口
	 * @author John Zhao
	 * @date 2014-11-14 下午1:21:29
	 * @param appName
	 * @param files
	 * @param fileName
	 * @return
	 */
	@Export(paramNames = { "attachmentDTO" })
	public Object uploadAttachment(AttachmentDTO attachmentDTO);


	@Export(paramNames = { "id" })
	public Object getAttachmentId(Long id);

}
