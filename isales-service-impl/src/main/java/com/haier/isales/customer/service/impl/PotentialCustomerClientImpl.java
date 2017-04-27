/**
* @Company 青鸟软通   
* @Title: PotentialCustomerClientImpl.java 
* @Package com.haier.isales.customer.impl 
* @author Cao Rui   
* @date 2014-11-12 下午2:16:45 
* @version V1.0   
*/ 
package com.haier.isales.customer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.common.ScoreResult;
import com.haier.isales.customer.CustomerDomainDtoUtil;
import com.haier.isales.customer.domain.PotentialCustomerDomain;
import com.haier.isales.customer.dto.PotentialCustomerDTO;
import com.haier.isales.customer.service.PotentialCustomerClient;
import com.haier.isales.customer.service.PotentialCustomerService;

/** 
 * @ClassName: PotentialCustomerClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class PotentialCustomerClientImpl implements PotentialCustomerClient{
	private static Logger logger = Logger.getLogger(PotentialCustomerClientImpl.class);
	private PotentialCustomerService potentialCustomerService;
	
	/**
	* @Title: 查询潜客列表
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryEntity
	* @param pageCond
	* @return  
	* @throws
	 */
	@Override
	public PageResult<PotentialCustomerDTO> getPotentialCustomerList(
			PotentialCustomerDTO queryEntity ,Integer currentPage,Integer pageSize) {
		
		logger.info("调用潜在客户列表的方法begin");
		//如果分页条件为空，则赋默认值，不允许查询数据库的全部结果
		Integer pageNo = currentPage;
		Integer numPerPage = pageSize;
		if(pageNo == null){
			pageNo = 1;
		}
		if(numPerPage == null){
			numPerPage = 10;
		}
		
		PageResult<PotentialCustomerDomain> pageResult = potentialCustomerService.getPotentialCustomerList(queryEntity, new PageCond(pageNo,numPerPage));
		
		//将PageResult中的信息 由domain转为
		List<PotentialCustomerDTO> dtoList = new ArrayList<PotentialCustomerDTO>();
		for (PotentialCustomerDomain domain : pageResult.getResultList()) {
			PotentialCustomerDTO dto = CustomerDomainDtoUtil.clonePotentialCustomerDomain2DTO(domain);
			dtoList.add(dto);
		}
		return new PageResult<PotentialCustomerDTO>(dtoList, pageResult.getPageCond());
	}

	/**
	 * @throws Exception 
	* @Title: 查询一个潜客的详情
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryEntity
	* @return  
	* @throws
	 */
	@Override
	public PotentialCustomerDTO getPotentialCustomerInfo(PotentialCustomerDTO queryEntity){
		logger.info("获取潜客详情的dubbo方法");
		PotentialCustomerDomain domain = potentialCustomerService.getPotentialCustomerInfo(queryEntity);
		PotentialCustomerDTO dto = CustomerDomainDtoUtil.clonePotentialCustomerDomain2DTO(domain);
		return dto;
	}
	
	/**
	 * 添加潜客信息
	* @Title: savePotentialCustomer 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param saveDto  
	* @throws
	 */
	@Override
	public ScoreResult savePotentialCustomer(PotentialCustomerDTO saveDto){
		logger.info("调用潜在客户添加的方法begin");
		ScoreResult scoreResult = potentialCustomerService.savePotentialCustomer(saveDto);
		return scoreResult;
	}
	
	/**
	 * 修改潜客信息
	* @Title: updatePotentialCustomer 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param saveDto  
	* @throws
	 */
	@Override
	public Object updatePotentialCustomer(PotentialCustomerDTO saveDto){
		
		logger.info("调用潜在客户修改的方法begin");
		potentialCustomerService.updatePotentialCustomer(saveDto);
		return null;
	}
	
	/**
	 * 删除潜客信息
	* @Title: deletePotentialCustomer 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param deleteDto  
	* @throws
	 */
	@Override
	public Object deletePotentialCustomer(PotentialCustomerDTO deleteDto){
		logger.info("调用潜在客户删除的方法begin");
		potentialCustomerService.deletePotentialCustomer(deleteDto);
		return null;
	}
	
	
	
	/*===================================================*/
	/**
	 * @Description: 属性 potentialCustomerService 的get方法 
	 * @return potentialCustomerService
	 */
	public PotentialCustomerService getPotentialCustomerService() {
		return potentialCustomerService;
	}

	/**
	 * @Description: 属性 potentialCustomerService 的set方法 
	 * @param potentialCustomerService 
	 */
	public void setPotentialCustomerService(
			PotentialCustomerService potentialCustomerService) {
		this.potentialCustomerService = potentialCustomerService;
	}
	
}
