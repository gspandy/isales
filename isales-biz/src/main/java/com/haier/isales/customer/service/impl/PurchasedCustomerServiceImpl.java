/**
* @Company 青鸟软通   
* @Title: PurchasedCustomerServiceImpl.java 
* @Package com.haier.isales.customer.service.impl 
* @author Cao Rui   
* @date 2014-11-15 上午11:58:51 
* @version V1.0   
*/ 
package com.haier.isales.customer.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.exception.SystemException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.customer.CustomerDomainDtoUtil;
import com.haier.isales.customer.dto.PurchasedCustomerDTO;
import com.haier.isales.customer.service.PurchasedCustomerService;
import com.haier.isales.retail.reportsales.dao.ReportsalesDAO;
import com.haier.isales.retail.reportsales.domain.ReportsalesDomain;

/** 
 * @ClassName: PurchasedCustomerServiceImpl 
 * @Description: 已购买顾客管理 ServiceImpl
 *  
 */
public class PurchasedCustomerServiceImpl implements PurchasedCustomerService{

	private static final Logger LOG = LoggerFactory.getLogger(PotentialCustomerServiceImpl.class);
	private ReportsalesDAO reportsalesDao;	//销售日志dao  从销售日志中获取已购买顾客信息
	
	/*===============业务方法=============*/
	/*===============已购买顾客=============*/
	/**
	 * @throws Exception 
	* @Title: 查询已购买顾客列表
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDTO
	* @param pageCond
	* @return  
	* @throws
	 */
	@Override
	public PageResult<PurchasedCustomerDTO> getPurchasedCustomerList(PurchasedCustomerDTO queryDTO,PageCond pageCond) {
		LOG.info("直销员查询已购买顾客列表   service方法");
		//判断查询参数queryDTO 及queryDTO中的usercode是否为空
		CheckParamUtil.checkFieldIfNotBlank(queryDTO, "userCode");

		pageCond = PageCondUtil.check(pageCond);
		pageCond.setFirstResult(PageCondUtil.calculateX(pageCond));//计算分页数据 第一条数据
		ReportsalesDomain queryBean = CustomerDomainDtoUtil.clonePurchasedCustomerDTO2Domain(queryDTO);
		
		//获取查询结果列表
		List<ReportsalesDomain> purchasedCustomerList = reportsalesDao.getPurchasedCustomerList(queryBean, pageCond);
		//获取该条件下全部结果的条数
		Integer totalCount = reportsalesDao.getPurchasedCustomerCount(queryBean);	
		
		//将查询出的purchasedCustomerList 转为DTO的list
		List<PurchasedCustomerDTO> dtoList = new ArrayList<PurchasedCustomerDTO>();
		for (ReportsalesDomain domain : purchasedCustomerList) {
			PurchasedCustomerDTO dto = CustomerDomainDtoUtil.clonePurchasedCustomerDomain2DTO(domain);
			dtoList.add(dto);
		}
		
		pageCond.setTotalCount(totalCount);//总条数
		pageCond.setPageCount(PageCondUtil.calculatePageCount(pageCond));//总页数
		
		return new PageResult<PurchasedCustomerDTO>(dtoList, pageCond);

	}
	
	/**
	 * @throws Exception 
	* @Title: 查询一条指定的已购买信息
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDTO
	* @return  
	* @throws
	 */
	@Override
	public PurchasedCustomerDTO getPurchasedCustomerInfo(PurchasedCustomerDTO queryDTO) {
		LOG.info("直销员查询已购买顾客详情   service方法");
		//判断查询参数queryDTO 及queryDTO中的id是否为空
		CheckParamUtil.checkFieldIfNotBlank(queryDTO, "id");
		
		//获取查询结果
		ReportsalesDomain domain = reportsalesDao.findById(queryDTO.getId());
		PurchasedCustomerDTO dto = CustomerDomainDtoUtil.clonePurchasedCustomerDomain2DTO(domain);
		
		return dto;

	}
	
	/**
	 * @throws Exception 
	* @Title: 修改一条指定的已购买信息，只能修改客户信息
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDTO
	* @return  
	* @throws
	 */
	@Override
	public void updatePurchasedCustomerInfo(PurchasedCustomerDTO queryDTO) {
		LOG.info("直销员修改已购买顾客   service方法");
		//判断查询参数queryDTO 及queryDTO中的id是否为空
		CheckParamUtil.checkFieldIfNotBlank(queryDTO, "id","customerMobile","customerName");
		//获取查询结果
		ReportsalesDomain domain = reportsalesDao.findById(queryDTO.getId());
		if(null == domain){
			throw new SystemException(BusinessExceptionCode.database_none_data,
					"没有指定记录");
		}
		//只能修改用户姓名 电话 地址
		domain.setYhname(queryDTO.getCustomerName());
		domain.setYhphone(queryDTO.getCustomerMobile());
		domain.setShaddress(queryDTO.getCustomerAdd());
		domain.setUpdateTime(new Date());
		
		reportsalesDao.update(domain);
	}
	
	/*====================业务方法结束 =================*/
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性 reportsalesDao 的set方法 
	 * @param reportsalesDao 
	 */
	public void setReportsalesDao(ReportsalesDAO reportsalesDao) {
		this.reportsalesDao = reportsalesDao;
	}

}
