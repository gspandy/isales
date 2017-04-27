package com.haier.isales.yangji.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.common.DubboResult;
import com.haier.isales.test.BaseIsalesClientTestCase;
import com.haier.isales.yangji.dto.YangjiDTO;
import com.haier.isales.yangji.service.YangjiClient;

@ContextConfiguration(locations = {
		"classpath*:/spring/yangji/spring-yangji.xml",
		"classpath*:/spring_service/yangji/spring-yangji-provider.xml"
		})
public class YangjiClientImplTest extends BaseIsalesClientTestCase {
	
	@Resource
	YangjiClient yangjiClient;
	
	@Test
	@Rollback(false)
	public void testSaveYang(){
		YangjiDTO  yangjiDTO=new YangjiDTO();
		yangjiDTO.setKey("12323232323232");
		yangjiDTO.setStoreName("8800002132");
		yangjiDTO.setStoreCode("8800002132");
		yangjiDTO.setModelCode("GB23KG1212");
		yangjiDTO.setIndustryName("冰箱");
		yangjiDTO.setIndustryCode("106");
		yangjiDTO.setOperDate(new Date());
		yangjiDTO.setOperStatus("shangyang");//上样
		yangjiDTO.setBarNum("1");
		DubboResult res=(DubboResult)yangjiClient.saveYangjiClient(yangjiDTO);
		System.out.println(res.toString());
		res.getResultBean();
	}
	
	@Test
	public void testFindMsgListByUserCode(){
		String userCode="Z0120497";
		DubboResult res=(DubboResult)yangjiClient.findMsgListByUserCode(userCode);
		System.out.println(res.toString());
		res.getResultBean();
	}
	
	@Test
	@Rollback(false)
	public void testUpdateCheckById(){
		String id="376";
		yangjiClient.updateMsgById(id);
	}

}