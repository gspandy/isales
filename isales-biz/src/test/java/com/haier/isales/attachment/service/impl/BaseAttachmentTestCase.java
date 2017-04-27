/**
* @Company 青鸟软通   
* @Title: BaseAttachmentTestCase.java 
* @Package com.haier.isales.attachment.service.impl 
* @author John Zhao   
* @date 2014-11-14 下午3:43:24 
* @version V1.0   
*/ 
package com.haier.isales.attachment.service.impl;

import javax.annotation.Resource;
import org.springframework.test.context.ContextConfiguration;
import com.haier.isales.attachment.service.AttachmentService;
import com.haier.openplatform.showcase.BaseTestCase;

/** 
 * @ClassName: BaseAttachmentTestCase 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
@ContextConfiguration(locations = { 
"classpath*:/spring/attachment/spring-*.xml" })
public class BaseAttachmentTestCase extends BaseTestCase{
	@Resource
	protected AttachmentService attachmentService;
}
