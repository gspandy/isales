/**
 * @Company 青鸟软通   
 * @Title: CustomerService.java 
 * @Package  com.haier.isales.customer.service.impl
 * @author Cao Rui   
 * @date 2014年11月12日  12:04:03
 * @version V1.0   
 */
package com.haier.isales.customer.service.impl;

import java.util.Date;
import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.ScoreResult;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;
import com.haier.isales.customer.CustomerDomainDtoUtil;
import com.haier.isales.customer.dao.PotentialCustomerDAO;
import com.haier.isales.customer.domain.PotentialCustomerDomain;
import com.haier.isales.customer.dto.PotentialCustomerDTO;
import com.haier.isales.customer.service.PotentialCustomerService;
import com.haier.isales.score.dto.ScoreDTO;
import com.haier.isales.score.module.ScoreConstants.ScoreType;
import com.haier.isales.score.module.ScoreModule;
import com.haier.isales.score.service.ScoreService;

/** 
 * @ClassName: PotentialCustomerServiceImpl
 * @Description: 潜客管理；PotentialCustomerService的Service接口定义类
 *  
 */
public class PotentialCustomerServiceImpl implements PotentialCustomerService{

	private static final Logger LOG = LoggerFactory.getLogger(PotentialCustomerServiceImpl.class);
	public static final String ENABLE_STATUS = "101";
	public static final String DISABLE_STATUS = "102";
	
	/** 
	* @Fields customerDao : CustomerDao 工具依赖 
	*/
	private PotentialCustomerDAO potentialCustomerDao;	//潜在客户dao
	private ScoreService scoreService;
	
	/*===============潜在顾客=============*/
	/**
	 * 直销员添加潜客信息
	* @Title: savePotentialCustomer 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param saveDto  
	* @throws
	 */
	@Override
	public ScoreResult savePotentialCustomer(PotentialCustomerDTO saveDto){
		LOG.info("直销员添加潜客   service方法");
		// 校验必需输入的字段,员工号、客户姓名、客户手机、意向产品、意向日期
		CheckParamUtil.checkFieldIfNotBlank(saveDto, "userId","customerName","customerMobile","productName","expectedBuyDateShow");
		
		PotentialCustomerDomain saveBean;
		// 将传入的dto对象转为domain
		saveBean = CustomerDomainDtoUtil.clonePotentialCustomerDTO2Domain(saveDto);
		//必要信息赋值
		saveBean.setCreateTime(new Date());
		saveBean.setCustomerStatus(ENABLE_STATUS);
		
		potentialCustomerDao.save(saveBean);
		LOG.info("直销员添加潜客   service方法执行完成");
		
		ScoreModule scoreModule = new ScoreModule();
		scoreModule.setOperatorId(saveDto.getUserId());
		scoreModule.setScoreType(ScoreType.潜客);
		List<ScoreDTO> scoreList = scoreService.addScoreUseScoreRule(scoreModule);
		//修改返回值，将积分信息返回
		ScoreResult scoreResult = new ScoreResult();
		scoreResult.setScoreList(scoreList);
		return scoreResult;
	}
	
	/**
	 * @throws Exception 
	* @Title: 查询潜客列表
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryEntity
	* @param pageCond
	* @return  
	* @throws
	 */
	@Override
	public PageResult<PotentialCustomerDomain> getPotentialCustomerList(PotentialCustomerDTO queryEntity,PageCond pageCond) {
		
		if(null == queryEntity){
			throw new SystemException(BusinessExceptionCode.param_error,
					"参数为空");
		}
		CheckParamUtil.checkFieldIfNotBlank(queryEntity, "userId");
		
		PageCond pageCondQuery = pageCond;
		pageCondQuery = PageCondUtil.check(pageCondQuery);
		pageCondQuery.setFirstResult(PageCondUtil.calculateX(pageCondQuery));//计算分页数据 第一条数据
		//增加默认条件  有效的
		queryEntity.setCustomerStatus(ENABLE_STATUS);
		
		//获取查询结果列表
		List<PotentialCustomerDomain> customerList = potentialCustomerDao.getPotentialCustomerList(queryEntity, pageCondQuery);
		//获取该条件下全部结果的条数
		Integer totalCount = potentialCustomerDao.getPotentialCustomerCount(queryEntity);	
		
		pageCondQuery.setTotalCount(totalCount);//总条数
		pageCondQuery.setPageCount(PageCondUtil.calculatePageCount(pageCondQuery));//总页数
		
		return new PageResult<PotentialCustomerDomain>(customerList, pageCondQuery);

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
	public PotentialCustomerDomain getPotentialCustomerInfo(PotentialCustomerDTO queryEntity) {
		//判断参数是否为空  
		CheckParamUtil.checkFieldIfNotBlank(queryEntity, "id");
		
		//获取查询结果
		PotentialCustomerDomain bean = potentialCustomerDao.findById(queryEntity.getId());
		if(null == bean){
			throw new SystemException(BusinessExceptionCode.database_none_data,
					"没有指定记录");
		}
		if(null == bean.getCustomerStatus() || !ENABLE_STATUS.equals(bean.getCustomerStatus())){
			throw new SystemException(BusinessExceptionCode.database_none_data,
					"指定记录无效");
		}
		
		return bean;

	}
	
	/**
	 * 直销员修改潜客信息
	* @Title: updatePotentialCustomer 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param saveDto  
	* @throws
	 */
	@Override
	public void updatePotentialCustomer(PotentialCustomerDTO saveDto){
		LOG.info("直销员修改潜客   service方法");
		// 校验必需输入的字段
		CheckParamUtil.checkFieldIfNotBlank(saveDto, "id","customerName","customerMobile","productName","expectedBuyDateShow");
		
		//查询数据库中的该条记录
		PotentialCustomerDomain updateBean = potentialCustomerDao.findById(saveDto.getId());
		if(null == updateBean){
			throw new SystemException(BusinessExceptionCode.database_none_data,
					"没有指定记录");
		}
		PotentialCustomerDomain saveEntity = CustomerDomainDtoUtil.clonePotentialCustomerDTO2Domain(saveDto);
		
		// 将传入的dto对象赋值给domain
		updateBean.setCustomerName(saveEntity.getCustomerName());
		updateBean.setCustomerMobile(saveEntity.getCustomerMobile());
		updateBean.setCustomerAdd(saveEntity.getCustomerAdd());
//		updateBean.setCustomerPhone(saveEntity.getCustomerPhone());
		updateBean.setExpectedBuyDate(saveEntity.getExpectedBuyDate());
		updateBean.setRemindTime(saveEntity.getRemindTime());
		updateBean.setProductName(saveEntity.getProductName());
		updateBean.setBuyUse(saveDto.getBuyUse());
		updateBean.setRemark(saveDto.getRemark());
		//具体业务未确定，产品系列的编码和名称暂时处理为：如果接口不传值，则不更新
		//2014年11月28日19:24:51
		if(null != saveDto.getProductSeriesCode()){
			updateBean.setProductSeriesCode(saveDto.getProductSeriesCode());
		}
		if(null != saveDto.getProductSeriesName()){
			updateBean.setProductSeriesName(saveDto.getProductSeriesName());
		}
		//必要信息赋值
		updateBean.setUpdateTime(new Date());
		
		potentialCustomerDao.update(updateBean);
		LOG.info("直销员修改潜客   service方法执行完成");
		
	}
	
	/**
	 * 直销员删除潜客信息
	* @Title: deletePotentialCustomer 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param deleteDto  
	* @throws
	 */
	@Override
	public void deletePotentialCustomer(PotentialCustomerDTO deleteDto){
		LOG.info("直销员删除潜客   service方法");
		// 校验必需输入的字段
		CheckParamUtil.checkFieldIfNotBlank(deleteDto, "id");
		
		//查询数据库中的该条记录
		PotentialCustomerDomain deleteBean = potentialCustomerDao.findById(deleteDto.getId());
		if(null == deleteBean){
			throw new SystemException(BusinessExceptionCode.database_none_data,
					"没有指定记录");
		}
		// 逻辑删除 修改状态为
		deleteBean.setCustomerStatus(DISABLE_STATUS);

		//必要信息赋值
		deleteBean.setUpdateTime(new Date());
		
		potentialCustomerDao.update(deleteBean);
		
		LOG.info("直销员删除潜客   service方法执行完成");
		
	}
	
	/*====================业务方法结束 =================*/
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性customerDao 的set方法 
	 */
	public void setPotentialCustomerDao(PotentialCustomerDAO customerDao){
		this.potentialCustomerDao = customerDao;
	}

	/**
	 * @Description: 属性 scoreService 的set方法 
	 * @param scoreService 
	 */
	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
	}


	
	
}
