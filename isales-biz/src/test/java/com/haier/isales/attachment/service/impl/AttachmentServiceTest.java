/**
* @Company 青鸟软通   
* @Title: AttachmentServiceTest.java 
* @Package com.haier.isales.attachment.service.impl 
* @author John Zhao   
* @date 2014-11-14 下午3:42:53 
* @version V1.0   
*/ 
package com.haier.isales.attachment.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;

import com.haier.isales.attachment.domain.AttachmentDomain;
import com.haier.isales.attachment.dto.AttachmentDTO;

/** 
 * @ClassName: AttachmentServiceTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class AttachmentServiceTest extends BaseAttachmentTestCase{
	
	private Long id;
	@Test
	public void testSaveAttachment(){
//		byte[] files = {-119, 80, 78, 71, 13};
		AttachmentDTO attachmentDTO = new AttachmentDTO();
		attachmentDTO.setAttachmentId("111111111");
		AttachmentDomain d = attachmentService.saveUploadFile(attachmentDTO);
		id = d.getId();
		Assert.notNull(d);
	}
	@Before
	public void testInsertFile(){
		AttachmentDTO attachmentDTO = new AttachmentDTO();
		attachmentDTO.setAttachmentId("111111111");
		AttachmentDomain d = attachmentService.saveUploadFile(attachmentDTO);
		id = d.getId();
	}
	
	@Test
	public void testgetFile(){
		AttachmentDomain attachmentDomain = attachmentService.findFile(id);
		Assert.notNull(attachmentDomain);
	}
}
