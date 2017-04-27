/**
 * @Company 青鸟软通   
 * @Title: PersonalmodelService.java 
 * @Package  com.haier.isales.retail.personalmodel.service.impl
 * @author Cao Rui   
 * @date 2014年12月03日  10:56:44
 * @version V1.0   
 */
package com.haier.isales.retail.personalmodel.service.impl;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bana.common.util.basic.StringUtils;
import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.basicinfo.promodel.dao.ProModelDAO;
import com.haier.isales.basicinfo.promodel.domain.ProModelDomain;
import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;
import com.haier.isales.retail.personalmodel.PersonalModelDomainDtoUtil;
import com.haier.isales.retail.personalmodel.dao.PersonalmodelDAO;
import com.haier.isales.retail.personalmodel.domain.PersonalmodelDomain;
import com.haier.isales.retail.personalmodel.dto.PersonalModelAddDto;
import com.haier.isales.retail.personalmodel.dto.PersonalModelQueryDto;
import com.haier.isales.retail.personalmodel.service.PersonalmodelService;
import com.haier.isales.salerinfo.personalinfo.dao.PersonalInfoDAO;
import com.haier.isales.salerinfo.personalinfo.domain.PersonalInfoDomain;
import com.haier.isales.system.user.dao.UserDao;
import com.haier.isales.system.user.domain.User;

/** 
 * @ClassName: PersonalmodelService
 * @Description: Personalmodel的Service接口定义类
 *  
 */
public class PersonalmodelServiceImpl implements PersonalmodelService{

	private static final Logger LOG = LoggerFactory.getLogger(PersonalmodelServiceImpl.class);
	
	/** 
	* @Fields personalmodelDao : PersonalmodelDao 工具依赖 
	*/
	private PersonalmodelDAO personalmodelDao;
	private UserDao userDao;
	private PersonalInfoDAO personalInfoDao;
	private ProModelDAO proModelDao;
	
	/*===============业务方法=============*/
	//查询直销员的常用型号
	/**
	 * 
	* @Title: getPersonalmodelList 
	* @Description: 查询指定直销员常用的型号
	* @param queryDto
	* @param pageCond
	* @return  
	* @throws
	 */
	@Override
	public PageResult<PersonalmodelDomain> getPersonalmodelList(PersonalModelQueryDto queryDto,PageCond pageCond) {
		LOG.info("查询指定直销员常用的型号  service方法");
		if(null == queryDto){
			throw new SystemException(BusinessExceptionCode.param_error,
					"参数为空");
		}
		CheckParamUtil.checkFieldIfNotBlank(queryDto, "operatorId");
		
		PageCond pageCondQuery = pageCond;
		pageCondQuery = PageCondUtil.check(pageCondQuery);
		pageCondQuery.setFirstResult(PageCondUtil.calculateX(pageCondQuery));//计算分页数据 第一条数据
		
		//将查询条件的dto转为domain
		PersonalmodelDomain queryDomain = PersonalModelDomainDtoUtil.clonePersonalModelQueryDTO2Domain(queryDto);
		//增加默认条件  有效的
		queryDomain.setStatus(PersonalmodelDomain.STATUS_ENABLE);
		
//		//获取查询结果列表
//		List<PersonalmodelDomain> list = personalmodelDao.findByParams(queryDomain, pageCondQuery);
//		//获取该条件下全部结果的条数
//		Integer totalCount = personalmodelDao.findCountByParams(queryDomain);
		/* 
		* @Description: 改为从btb_ratail表里查询常用型号
		* @author Cao Rui  
		* @date 2015年07月14日  14:58:34 
		* */
//		List<PersonalmodelDomain> list = personalmodelDao.findByParamsFromBtbRatail(queryDomain, pageCondQuery);
		List<PersonalmodelDomain> list = new ArrayList<PersonalmodelDomain>();
		// totalCount 暂定10，能够满足页面要求。页面不会翻页。
		Integer totalCount = 10;	
		
		pageCondQuery.setTotalCount(totalCount);//总条数
		pageCondQuery.setPageCount(PageCondUtil.calculatePageCount(pageCondQuery));//总页数
		
		return new PageResult<PersonalmodelDomain>(list, pageCondQuery);

	}

	//直销员添加常用型号
	/**
	 * 
	* @Title: savePersonalModel 
	* @Description: 直销员添加常用型号
	* @param addDto  
	* @throws
	 */
	public void savePersonalModel(PersonalModelAddDto addDto){
		LOG.info("直销员添加常用型号  service方法");
		if(null == addDto){
			throw new SystemException(BusinessExceptionCode.param_error,
					"参数为空");
		}
		CheckParamUtil.checkFieldIfNotBlank(addDto, "modelCode","operatorId");
		
		PersonalModelQueryDto addDtoForCheck = new PersonalModelQueryDto();
		addDtoForCheck.setOperatorId(addDto.getOperatorId());
		addDtoForCheck.setModelCode(addDto.getModelCode());
		PersonalmodelDomain checkDomain = checkDataIsEnable(addDtoForCheck);
		
		//查询用户是否已经添加过该型号为常用型号
		PersonalmodelDomain queryDomain = new PersonalmodelDomain();
		queryDomain.setOperatorId(addDto.getOperatorId());
		queryDomain.setModelCode(addDto.getModelCode());
		queryDomain.setStatus(PersonalmodelDomain.STATUS_ENABLE);
		Integer totalCount = personalmodelDao.findCountByParams(queryDomain);	
		//2014-12-8 曹瑞：需要修改逻辑 当已经添加过该型号时，更新原数据；添加时则按原来的添加逻辑
		if(totalCount > 0){
//			throw new SystemException(BusinessExceptionCode.database_duplicate_data,
//					"该型号已经添加为常用型号");
			PersonalmodelDomain updateBean = new PersonalmodelDomain();
			updateBean.setModelCode(addDto.getModelCode());
			updateBean.setOperatorId(addDto.getOperatorId());
			updateBean.setUpdateTime(new Date());
			personalmodelDao.updatePersonalModel(updateBean);
		}else{
			// 将传入的dto对象转为domain
			PersonalmodelDomain saveBean = PersonalModelDomainDtoUtil.clonePersonalModelAddDTO2Domain(addDto);
			
			//必要信息赋值
			saveBean.setCreateTime(new Date());
			saveBean.setStatus(PersonalmodelDomain.STATUS_ENABLE);
			saveBean.setUpdateTime(new Date());
			saveBean.setModelName(checkDomain.getModelName());
			saveBean.setUserCode(checkDomain.getUserCode());
			saveBean.setUserName(checkDomain.getUserName());
			
			personalmodelDao.save(saveBean);
		}
		LOG.info("直销员添加常用型号  service方法执行完成");
	}
	
	//删除常用型号
	/**
	 * 
	* @Title: deletePersonalModel 
	* @Description: 直销员删除常用型号 
	* @param deleteDto  
	* @throws
	 */
	public void deletePersonalModel(PersonalModelQueryDto deleteDto){
		LOG.info("直销员删除常用型号  service方法");
		if(null == deleteDto){
			throw new SystemException(BusinessExceptionCode.param_error,
					"参数为空");
		}
		CheckParamUtil.checkFieldIfNotBlank(deleteDto, "modelCode","operatorId");
		
		checkDataIsEnable(deleteDto);
		
		//将条件的dto转为domain
//		PersonalmodelDomain deleteDomain = PersonalModelDomainDtoUtil.clonePersonalModelQueryDTO2Domain(deleteDto);
//		personalmodelDao.deletePersonalModel(deleteDomain);
		
		
	}
	/**
	 * 
	* @Title: checkDataIsEnable 
	* @Description: 将数据校验的功能 抽取出公共方法。上面的添加或者删除业务中都要使用该校验
	* 				验证过程中任何信息不通过，即抛出异常。如验证通过，将必要的一些信息写入domain中返回，以便原业务方法使用
	* @param dto  
	* @throws
	 */
	private PersonalmodelDomain checkDataIsEnable(PersonalModelQueryDto dto){
		PersonalmodelDomain personalmodelDomain = new PersonalmodelDomain();
		User userDomain = userDao.findById(dto.getOperatorId());
		if(null == userDomain){
			//没有获取到用户信息
			LOG.info("未获取到用户信息，验证的用户operatorId=" + dto.getOperatorId());
			throw new SystemException(BusinessExceptionCode.no_user,
					"未获取到用户信息");
		}
		
		/*
		 * 以下判断逻辑以后可能需要更改;比如需不需要判断是否为employee中的员工;是不是直销员;有没有权限提报销量等等
		 */
		
		//获取用户信息
		String userCode = userDomain.getUserCode();
		if(StringUtils.isBlank(userCode) ){
			// 该用户的员工号为空
			throw new SystemException(BusinessExceptionCode.no_employee,
					"未获取到员工信息");
		}
		//根据用户获取员工信息
		PersonalInfoDomain domain ;
		List<PersonalInfoDomain> salerList = personalInfoDao.getSalerInfo(userCode);
		if(null != salerList && !salerList.isEmpty()){
			domain = salerList.get(0);
		}else{
			LOG.info("未获取到员工信息，验证的用户operatorId=" + dto.getOperatorId());
			throw new SystemException(BusinessExceptionCode.no_employee,
					"未获取到员工信息");
		}
		
		if(null == domain || null == domain.getStatus()){
			LOG.info("未获取到员工信息，验证的用户operatorId=" + dto.getOperatorId());
			throw new SystemException(BusinessExceptionCode.no_employee,
					"未获取到员工信息");
		}
		
		//查询要添加的型号是否存在
		ProModelDomain proModelDomain = proModelDao.findById(dto.getModelCode());
		if(null == proModelDomain){
			throw new SystemException(BusinessExceptionCode.database_none_data,
					"型号不存在");
		}
		
		//所有验证结束，未抛出任何异常则验证通过，将必要的一些信息写入domain中返回，以便原业务方法使用
		//暂时需要 型号名称、用户员工号、用户姓名；之后有需要的属性再加
		personalmodelDomain.setModelName(proModelDomain.getPrdn());
		personalmodelDomain.setUserCode(userCode);
		personalmodelDomain.setUserName(userDomain.getOperatorName());
		
		return personalmodelDomain;
	}
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性personalmodelDao 的set方法 
	 */
	public void setPersonalmodelDao(PersonalmodelDAO personalmodelDao){
		this.personalmodelDao = personalmodelDao;
	}

	/**
	 * @Description: 属性 userDao 的set方法 
	 * @param userDao 
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * @Description: 属性 personalInfoDao 的set方法 
	 * @param personalInfoDao 
	 */
	public void setPersonalInfoDao(PersonalInfoDAO personalInfoDao) {
		this.personalInfoDao = personalInfoDao;
	}

	/**
	 * @Description: 属性 proModelDao 的set方法 
	 * @param proModelDao 
	 */
	public void setProModelDao(ProModelDAO proModelDao) {
		this.proModelDao = proModelDao;
	}
	
	
	
}
