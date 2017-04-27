package com.haier.isales.customer.service.impl;

import javax.annotation.Resource;

import org.bana.common.util.page.PageResult;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.common.DubboResult;
import com.haier.isales.customer.dto.PotentialCustomerDTO;
import com.haier.isales.customer.dto.PurchasedCustomerDTO;
import com.haier.isales.customer.service.PotentialCustomerClient;
import com.haier.isales.customer.service.PurchasedCustomerClient;
import com.haier.isales.test.BaseIsalesClientTestCase;



/**
 * 客户及潜客相关测试类
 * @author Cao Rui
 *
 */
@ContextConfiguration(locations = {
		"classpath*:/spring_service/customer/spring-customer-provider.xml",
		"classpath*:/spring/salerinfo/spring-*.xml",
		"classpath*:/spring_ws/**/spring-reportSalesByModel.xml",
		"classpath*:/spring_ws/**/spring-reportSalesByBarCode.xml",
		"classpath*:/spring_ws/**/spring-BTBxlcxSelectImpl.xml",
		"classpath*:/spring/customer/spring-customer.xml",
		"classpath*:/spring/basicinfo/spring-shop.xml",
		"classpath*:/spring/score/spring-score.xml",
		"classpath*:/spring/system/spring-dictionary.xml",
		"classpath*:/spring/retail/spring-*.xml"
		})
public class CustomerTest extends BaseIsalesClientTestCase{
	
	@Resource
	protected PotentialCustomerClient potentialCustomerClient;
	@Resource
	protected PurchasedCustomerClient purchasedCustomerClient;
	
	@Test
	public void testGetPurchasedCustomerList() throws Exception {
		// 获取已购买客户列表 
		PurchasedCustomerDTO queryEntity = new PurchasedCustomerDTO();
		queryEntity.setUserCode("Z0175868");
		
		DubboResult result =  (DubboResult) purchasedCustomerClient.getPurchasedCustomerList(queryEntity, 1, 10);
		PageResult<PurchasedCustomerDTO> list = result.getResultBean();
		
		logger.info("================================list.size:" + list.getResultList().size());
		
	}
	@Test
	public void testGetPurchasedCustomerInfo() throws Exception {
		// 获取已购买客户详情 
		PurchasedCustomerDTO queryEntity = new PurchasedCustomerDTO();
		queryEntity.setId(1L);
		
		DubboResult result =  (DubboResult) purchasedCustomerClient.getPurchasedCustomerInfo(queryEntity);
		if(null != result){
			logger.info("=======result:" + result.getResultBean().toString());
		}
	}
	
	@Test
	public void testUpdatePurchasedCustomerInfo() throws Exception {
		// 修改已购买客户详情 
		PurchasedCustomerDTO queryEntity = new PurchasedCustomerDTO();
		queryEntity.setId(1L);
		queryEntity.setCustomerMobile("测试电话");
		queryEntity.setCustomerName("测试名称");
		queryEntity.setCustomerAdd("ce shi dizhi");
		
		purchasedCustomerClient.updatePurchasedCustomerInfo(queryEntity);
		logger.info("========================执行完成");
	}
	
	
	@Test
	public void testGetPotentialCustomerList() throws Exception {
		// 获取潜客列表 
		PotentialCustomerDTO queryEntity = new PotentialCustomerDTO();
		queryEntity.setUserId(1L);
		
		DubboResult result = (DubboResult) potentialCustomerClient.getPotentialCustomerList(queryEntity, 1, 10);
		
		PageResult<PotentialCustomerDTO> dto = result.getResultBean();
		
		if(null != dto ){
			logger.info("==========================================dto.getPageCond().getTotalCount():" + dto.getPageCond().getTotalCount());
		}
		
	}
	
	@Test
	public void testGetPotentialCustomerInfo() throws Exception {
		// 获取指定潜客的详情 
		PotentialCustomerDTO dto = new PotentialCustomerDTO();
		dto.setId(8L);
		DubboResult result =  (DubboResult) potentialCustomerClient.getPotentialCustomerInfo(dto);
		MatcherAssert.assertThat(result, Matchers.notNullValue());
	}
	
	
	@Test
	public void testAddPotentialCustomer() {
		// 添加潜客
		logger.info("========================执行testAddPotentialCustomer");
		PotentialCustomerDTO saveDto = new PotentialCustomerDTO();
//		saveDto.setSalerId(salerId);	//直销员id
		saveDto.setUserId(1L);	//直销员员工号
		saveDto.setShopCode("8700090704") ;	//所在门店编码
		saveDto.setShopName("门店1");	//所在门店
		saveDto.setCustomerName("客户");//姓名
		saveDto.setCustomerAdd("山东青岛");//住址
		saveDto.setCustomerMobile("1312345678");//客户手机
		saveDto.setCustomerPhone("053212345678");//客户固话
		saveDto.setExpectedBuyDateShow("2014-12-10");//预计购机日期
		saveDto.setRemindTimeShow("2014-12-1");//提醒日期
		saveDto.setProductName("卡萨帝");//购买产品型号
		saveDto.setProductSeriesCode("系列code");
		saveDto.setProductSeriesName("系列name");
		saveDto.setBuyUse("换新");//购买用途名称
		saveDto.setRemark("中年人");//备注
		Object savePotentialCustomer = potentialCustomerClient.savePotentialCustomer(saveDto);
		
		logger.info("========================执行完成"+savePotentialCustomer);
		
	}
	
	@Test
	public void testUpdatePotentialCustomer() {
		// 添加潜客
		logger.info("========================执行testUpdatePotentialCustomer");
		PotentialCustomerDTO saveDto = new PotentialCustomerDTO();
		saveDto.setId(5L);
//		saveDto.setSalerId(salerId);	//直销员id
		saveDto.setUserCode("Z0100254");	//直销员员工号
		saveDto.setShopCode("8700090704") ;	//所在门店编码
		saveDto.setShopName("门店1");	//所在门店
		saveDto.setCustomerName("客户");//姓名
		saveDto.setCustomerAdd("山东青岛");//住址
		saveDto.setCustomerMobile("1312345678");//客户手机
		saveDto.setCustomerPhone("053212345678");//客户固话
		saveDto.setExpectedBuyDateShow("2014-12-10");//预计购机日期
		saveDto.setRemindTimeShow("2024-12-1");//提醒日期
		saveDto.setProductName("卡萨帝");//购买产品型号
		saveDto.setBuyUse("换新");//购买用途名称
		saveDto.setRemark("中年人");//备注
		potentialCustomerClient.updatePotentialCustomer(saveDto);
		
		logger.info("========================执行完成");
		
	}
	
	@Test
	public void testDeletePotentialCustomer() {
		// 添加潜客
		logger.info("========================执行testDeletePotentialCustomer");
		PotentialCustomerDTO saveDto = new PotentialCustomerDTO();
		saveDto.setId(4L);
		
		potentialCustomerClient.deletePotentialCustomer(saveDto);
		
		logger.info("========================执行完成");
		
	}
	
	

	/**
	 * @Description: 属性 potentialCustomerClient 的get方法 
	 * @return potentialCustomerClient
	 */
	public PotentialCustomerClient getPotentialCustomerClient() {
		return potentialCustomerClient;
	}

	/**
	 * @Description: 属性 potentialCustomerClient 的set方法 
	 * @param potentialCustomerClient 
	 */
	public void setPotentialCustomerClient(
			PotentialCustomerClient potentialCustomerClient) {
		this.potentialCustomerClient = potentialCustomerClient;
	}
	
	
}
