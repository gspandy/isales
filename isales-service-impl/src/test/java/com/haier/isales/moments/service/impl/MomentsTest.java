package com.haier.isales.moments.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.bana.common.util.page.PageResult;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.common.DubboResult;
import com.haier.isales.moments.dto.CommentsDTO;
import com.haier.isales.moments.dto.CommentsQueryDTO;
import com.haier.isales.moments.dto.MomentsDTO;
import com.haier.isales.moments.dto.MomentsQueryDTO;
import com.haier.isales.moments.service.CommentsSelectClient;
import com.haier.isales.moments.service.MomentsSelectClient;
import com.haier.isales.moments.service.MomentsUpdateClient;
import com.haier.isales.test.BaseIsalesClientTestCase;



/**
 * 朋友圈相关测试类
 * @author Cao Rui
 *
 */

@ContextConfiguration(locations = {
		"classpath*:/spring_service/moments/spring-*-provider.xml",
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
		"classpath*:/spring/moments/spring-*.xml",
		"classpath*:/spring/system/spring-*.xml",
		"classpath*:/spring/retail/spring-*.xml"
		})
public class MomentsTest extends BaseIsalesClientTestCase{
	
	@Resource
	protected MomentsUpdateClient momentsUpdateClient;
	@Resource
	protected MomentsSelectClient momentsSelectClient;
	@Resource
	protected CommentsSelectClient commentsSelectClient;
	
	@Test
	public void testUpdateLike() throws Exception {
		// 点赞
		DubboResult result =  (DubboResult)momentsUpdateClient.updateLike(1L, 1L);
		
		logger.info("================================:" + result.getErrorMessage());
	}
	
	@Test
	public void testUpdateDisLike() throws Exception {
		// 取消点赞
		DubboResult result =  (DubboResult)momentsUpdateClient.updateDisLike(1L, 1L);
		
		logger.info("================================:" + result.getErrorMessage());
		
	}

	/** 
	* @Title: testGetMomentsList 
	* @Description: 
	* @throws Exception  
	* @throws 
	*/ 
	@Test
	public void testGetMomentsList() throws Exception {
		// 查询列表
		MomentsQueryDTO queryDto = new MomentsQueryDTO();
		queryDto.setCurrentUserId(1L);
		List<String> labelGroups = new ArrayList<String>();
		labelGroups.add("all");
		queryDto.setSelectLabelGroups(labelGroups);
		
		labelGroups = new ArrayList<String>();
		labelGroups.add("1");
		labelGroups.add("2");
		queryDto.setCurrentUserLabelGroups(labelGroups);
		
		DubboResult result =  (DubboResult)momentsSelectClient.getMomentsList(queryDto, 1, 10);
		
		PageResult<MomentsDTO> resultBean = result.getResultBean();
		List<MomentsDTO> resultList = resultBean.getResultList();
		logger.info("================================:" + result.getErrorMessage());
		logger.info("===========================================================");
		logger.info("该条件下总条数:" + resultBean.getPageCond().getTotalCount());
		logger.info("list中的条数:" + resultList.size());
		for(MomentsDTO dto : resultList){
			logger.info("content:" + dto.getContent() );
			logger.info("用户姓名:" + dto.getUserName() + "##用户头像:" 
					+ dto.getHeadPortraitId() + "##所属中心:" + dto.getOrgName()
					);
		}
	}

	/** 
	* @Title: testGetCommentsList 
	* @Description: 
	* @throws Exception  
	* @throws 
	*/ 
	@Test
	public void testGetCommentsList() throws Exception {
		// 查询列表
		CommentsQueryDTO queryDto = new CommentsQueryDTO();
		queryDto.setCurrentUserId(1L);
		List<String> labelGroups = new ArrayList<String>();
		labelGroups.add("all");
		queryDto.setCurrentUserLabelGroups(labelGroups);
		
		labelGroups = new ArrayList<String>();
		labelGroups.add("1");
		labelGroups.add("2");
		queryDto.setCurrentUserLabelGroups(labelGroups);
		queryDto.setSourceId(1L);
		
		DubboResult result =  (DubboResult)commentsSelectClient.getCommentsList(queryDto, 1, 10);
		
		PageResult<CommentsDTO> resultBean = result.getResultBean();
		List<CommentsDTO> resultList = resultBean.getResultList();
		logger.info("================================:" + result.getErrorMessage());
		logger.info("===========================================================");
		logger.info("该条件下总条数:" + resultBean.getPageCond().getTotalCount());
		logger.info("list中的条数:" + resultList.size());
		for(CommentsDTO dto : resultList){
			logger.info("content:" + dto.getContent() );
		}
	}
	
	/**
	 * @Description: 属性 momentsUpdateClient 的get方法 
	 * @return momentsUpdateClient
	 */
	public MomentsUpdateClient getMomentsUpdateClient() {
		return momentsUpdateClient;
	}

	/**
	 * @Description: 属性 momentsUpdateClient 的set方法 
	 * @param momentsUpdateClient 
	 */
	public void setMomentsUpdateClient(MomentsUpdateClient momentsUpdateClient) {
		this.momentsUpdateClient = momentsUpdateClient;
	}

	/**
	 * @Description: 属性 momentsSelectClient 的get方法 
	 * @return momentsSelectClient
	 */
	public MomentsSelectClient getMomentsSelectClient() {
		return momentsSelectClient;
	}

	/**
	 * @Description: 属性 momentsSelectClient 的set方法 
	 * @param momentsSelectClient 
	 */
	public void setMomentsSelectClient(MomentsSelectClient momentsSelectClient) {
		this.momentsSelectClient = momentsSelectClient;
	}
	
	
}
