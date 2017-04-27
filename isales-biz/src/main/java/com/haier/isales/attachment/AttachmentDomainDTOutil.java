/**
 * @Company 青鸟软通   
 * @Title: AttachmentDomainDTOutil.java 
 * @Package com.haier.isales.attachment 
 * @author John Zhao   
 * @date 2014-11-14 下午1:48:40 
 * @version V1.0   
 */
package com.haier.isales.attachment;

import com.haier.isales.attachment.domain.AttachmentDomain;
import com.haier.isales.attachment.dto.AttachmentDTO;
import com.haier.isales.common.ClonePojoUtil;

/**
 * @ClassName: AttachmentDomainDTOutil
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public class AttachmentDomainDTOutil {

	public static AttachmentDTO cloneAttachmentDomainToDTO(AttachmentDomain ad) {
		if (ad == null) {
			return null;
		}
		AttachmentDTO attachmentDTO = ClonePojoUtil.copyClassFromTo(ad, AttachmentDTO.class);
		return attachmentDTO;

	}

	public static AttachmentDomain cloneAttachmentDTOToDomain(AttachmentDTO dto) {
		if (dto == null) {
			return null;
		}
		AttachmentDomain attachmentDomain = ClonePojoUtil.copyClassFromTo(dto, AttachmentDomain.class);
		return attachmentDomain;

	}

}
