/**
* @Company 青鸟软通   
* @Title: CommentsServiceTest.java 
* @Package com.haier.isales.moments.service 
* @author Liu Wenjie   
* @date 2014-11-22 下午3:51:34 
* @version V1.0   
*/ 
package com.haier.isales.moments.service;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.moments.dto.CommentsAddDto;
import com.haier.isales.system.dto.UserDTO;

/** 
 * @ClassName: CommentsServiceTest 
 * @Description: 测试评论对应的service方法
 *  
 */
@ContextConfiguration(locations = { 
		"classpath*:/spring/prototype/spring-prototype.xml",
		"classpath*:/spring/spring-common.xml",
		"classpath*:/spring/score/spring-*.xml",
		"classpath*:/spring/basicinfo/spring-*.xml",
		"classpath*:/spring_ws/hmms/spring-sampleWebService.xml",
		"classpath*:/spring/salerinfo/spring-*.xml",
		"classpath*:/spring_ws/**/spring-reportSalesByModel.xml",
		"classpath*:/spring_ws/**/spring-reportSalesByBarCode.xml",
		"classpath*:/spring_ws/**/spring-BTBxlcxSelectImpl.xml",
		"classpath*:/spring/reminder/spring-*.xml",
		"classpath*:/spring/retail/spring-*.xml" })
public class CommentsServiceTest extends BaseMomentsTestCase{

	@Resource
	private CommentsService commentsService;
	
	
	private UserDTO currentUser;
	
	@Before
	public void initParam(){
		executeSqlScript("classpath:/com/haier/isales/moments/CommentServiceTest.sql", true);
		
		currentUser = new UserDTO();
		currentUser.setOperatorId(1L);
		currentUser.setOperatorName("admin");
		currentUser.setUserCode("00001223");
	}
	/**
	 * Test method for {@link com.haier.isales.moments.service.CommentsService#addNewComments(com.haier.isales.moments.dto.CommentsAddDto)}.
	 */
	@Test
	public void testAddNewComments() {
		CommentsAddDto addDto = new CommentsAddDto();
		addDto.setContent("testAdd");
		addDto.setCurrentUser(currentUser);
		addDto.setReplyParentId(-1L);
		addDto.setReplyTargetId(1L);
		commentsService.addNewComments(addDto);
	}

}
