/**
 * @Company 青鸟软通   
 * @Title: SalestargetService.java 
 * @Package  com.haier.isales.retail.salestarget.service.impl
 * @author Cao Rui   
 * @date 2014年12月22日  16:32:01
 * @version V1.0   
 */
package com.haier.isales.retail.salestarget.service.impl;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;
import com.haier.isales.retail.salestarget.SalestargetDomainDtoUtil;
import com.haier.isales.retail.salestarget.dao.SalestargetDAO;
import com.haier.isales.retail.salestarget.domain.SalestargetDomain;
import com.haier.isales.retail.salestarget.dto.SalestargetDto;
import com.haier.isales.retail.salestarget.dto.SalestargetQueryDto;
import com.haier.isales.retail.salestarget.dto.SalestargetUpdateDto;
import com.haier.isales.retail.salestarget.service.SalestargetService;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalFullInfoDTO;

/** 
 * @ClassName: SalestargetService
 * @Description: Salestarget的Service接口定义类
 *  
 */
public class SalestargetServiceImpl implements SalestargetService{

	private static final Logger LOG = LoggerFactory.getLogger(SalestargetServiceImpl.class);
	
	/** 
	* @Fields salestargetDao : SalestargetDao 工具依赖 
	*/
	private SalestargetDAO salestargetDao;
	
	
	/*===============业务方法=============*/
	/**
	 * 
	* <p>查询销量</p> 
	* <p>Description: </p> 
	* @param queryDto
	* @return 
	* @see com.haier.isales.retail.salestarget.service.SalestargetService#getSalestarget(com.haier.isales.retail.salestarget.dto.SalestargetQueryDto)
	 */
	@Override
	public SalestargetDto getSalestarget(SalestargetQueryDto queryDto) {
		 LOG.info("查询个人目标销量 service方法");
		//验证参数非空性
		CheckParamUtil.checkFieldIfNotBlank(queryDto, "operatorId","productLine","year","month");
		//当产业线为全部时，将值改为空，与dao的查询条件匹配
		if("all".equals(queryDto.getProductLine())){
			queryDto.setProductLine(null);
		}
		//将queryDto转化为domain
		SalestargetDomain queryDomain = SalestargetDomainDtoUtil.clonePrototypeQueryDto2Domain(queryDto);
		//进行查询
		SalestargetDomain domain = salestargetDao.findPersonalTarget(queryDomain);
		if(null == domain){
			domain = new SalestargetDomain();
			domain.setTargetAmount(BigDecimal.ZERO);
			domain.setTargetNum(BigDecimal.ZERO);
		}
		
		SalestargetDto dtoResult = SalestargetDomainDtoUtil.cloneSalestargetDomain2DTO(domain);
		
		return dtoResult;
	}
	
	/**
	 * 
	* @Title: getSalestargetList 
	* @Description: 获取个人销量目标列表 用于展示折线图
	* @param queryDto
	* @return  
	* @throws
	 */
	@Override
	public List<SalestargetDomain> getSalestargetList(SalestargetQueryDto queryDto) {
		LOG.info("查询个人目标销量列表--折线图  service方法");
		//验证参数非空性
		CheckParamUtil.checkFieldIfNotBlank(queryDto, "operatorId","productLine");
		//当产业线为全部时，将值改为空，与dao的查询条件匹配
		if("all".equals(queryDto.getProductLine())){
			queryDto.setProductLine(null);
		}
		//获取当前年份 月份
		Calendar currentTime=Calendar.getInstance();
		Integer year = currentTime.get(Calendar.YEAR);
		Integer month = currentTime.get(Calendar.MONTH)+1;
		queryDto.setYear(year);
		queryDto.setMonth(month);
		
		//将queryDto转化为domain
		SalestargetDomain queryDomain = SalestargetDomainDtoUtil.clonePrototypeQueryDto2Domain(queryDto);
		//进行查询
		List<SalestargetDomain> list = salestargetDao.getPersonalTargetList(queryDomain);
		if(null == list ){
			list = new ArrayList<SalestargetDomain>();
		}
		return list;
	}
		
	//添加销量目标
	/**
	 * 
	* @Title: updateSalestarget 
	* @Description: 添加销量目标
	* @param updateDto
	* @param personalInfo  
	* @throws
	 */
	@Override
	public void updateSalestarget(SalestargetUpdateDto updateDto,PersonalFullInfoDTO personalInfo) {
		LOG.info("提报个人目标销量 service方法");
		//验证参数非空性
		CheckParamUtil.checkFieldIfNotBlank(updateDto, "operatorId","productLine","year","month");
		//目标销量或者目标销售额不能同时为空
		if(null == updateDto.getTargetAmount() && null == updateDto.getTargetNum()){
			throw new SystemException(BusinessExceptionCode.param_error,
					"目标销量或者目标销售额至少填写一项");
		}
		//将updateDto转化为updateDomain
		SalestargetDomain updateDomain = SalestargetDomainDtoUtil.clonePrototypeUpdateDto2Domain(updateDto);
		//将updateDomain中，需要进行查询的信息放入quertDomain
		SalestargetDomain quertDomain= new SalestargetDomain();
		quertDomain.setOperatorId(updateDomain.getOperatorId());
		quertDomain.setProductLine(updateDomain.getProductLine());
		quertDomain.setYear(updateDomain.getYear());
		quertDomain.setMonth(updateDomain.getMonth());
		//查询该员工在相应月份的对应产业中是否已经维护目标；存在结果则修改，不存在添加
		int count = salestargetDao.findCountByParams(quertDomain);
		if(count > 0){
			//修改
			updateDomain.setUpdateTime(new Date());
			salestargetDao.updateByParams(updateDomain);
		}else{
			//添加
			if(null == personalInfo.getUserCode()){
				throw new SystemException(BusinessExceptionCode.no_employee,
						"未获取到员工信息，无法提报销量目标");
			}
			updateDomain.setUserCode(personalInfo.getUserCode());
			updateDomain.setOrgCode(personalInfo.getOrgCode());
			updateDomain.setOrgName(personalInfo.getOrgName());
			updateDomain.setShopId(personalInfo.getShopId());
			updateDomain.setShopName(personalInfo.getShopName());
			//待优化 需要验证updateDto中productLine是否有效，并且获取productLineName
			// 由于需要其他表，此处暂留，待加入t_isales_zzjyt_hmms_proline表后优化该处代码
//			updateDomain.setProductLineName(personalInfo.get);
			
			updateDomain.setCreateTime(new Date());
			salestargetDao.save(updateDomain);
		}
		
	}
	
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性salestargetDao 的set方法 
	 */
	public void setSalestargetDao(SalestargetDAO salestargetDao){
		this.salestargetDao = salestargetDao;
	}
	
}
