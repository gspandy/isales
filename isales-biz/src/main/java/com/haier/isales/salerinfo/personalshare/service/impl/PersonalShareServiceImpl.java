/**
 * @Company 青鸟软通   
 * @Title: PersonalShareService.java 
 * @Package  com.haier.isales.salerInfo.personalShare.service.impl
 * @author Guo Yuchao   
 * @date 2014年11月14日  14:19:09
 * @version V1.0   
 */
package com.haier.isales.salerinfo.personalshare.service.impl;


import java.util.Date;
import java.util.List;

import org.bana.common.util.basic.StringUtils;
import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.DictionaryCache;
import com.haier.isales.common.IsalesConstants.DictionaryType;
import com.haier.isales.common.StringUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.salerinfo.personalshare.dao.PersonalShareDAO;
import com.haier.isales.salerinfo.personalshare.domain.PersonalShareDomain;
import com.haier.isales.salerinfo.personalshare.service.PersonalShareService;

/** 
 * @ClassName: PersonalShareService
 * @Description: PersonalShare的Service接口定义类
 *  
 */
public class PersonalShareServiceImpl implements PersonalShareService{
//	private static final Logger LOG = LoggerFactory.getLogger(PersonalShareServiceImpl.class);
	
	/** 
	* @Fields personalShareDao : PersonalShareDao 工具依赖 
	*/
	private PersonalShareDAO personalShareDao;
	
	
	/*===============业务方法=============*/
	
	/**
	 * <p>Description: 根据条件查询经验或备忘</p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-14 上午9:35:55 
	 * @param personalShareDomain
	 * @return 
	 * @see com.haier.isales.personal.share.service.ShareService#findShareInfoByParam(com.haier.isales.personal.share.domain.PersonalShareDomain) 
	 */ 
	@Override
	public PageResult<PersonalShareDomain> findShareInfoByParam(PersonalShareDomain personalShareDomain,PageCond pageCond) {
		/*2015-5-28 修改代码违规  
		 * pageCond = PageCondUtil.check(pageCond);
		 * 不允许给参数赋值：否则可能方法内部改变的值，不能传到方法外部
		 */
		PageCond pageCondQuery = PageCondUtil.check(pageCond);
		List<PersonalShareDomain> shareList = personalShareDao.findByParams(personalShareDomain, pageCondQuery);
		int totalCount = personalShareDao.findCountByParams(personalShareDomain);
		pageCondQuery.setTotalCount(totalCount);
		PageCondUtil.calculatePageCount(pageCondQuery);
		return new PageResult<PersonalShareDomain>(shareList, pageCondQuery);
	}
	
	
	/**
	 * <p>Description:保存经验或备注 需要区分类型type 默认为经验 </p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-14 上午11:09:41 
	 * @param personalShareDomain 
	 * @see com.haier.isales.personal.share.service.ShareService#saveShareInfo(com.haier.isales.personal.share.domain.PersonalShareDomain) 
	 */ 
	@Override
	public void saveShareInfo(PersonalShareDomain personalShareDomain) {
		CheckParamUtil.checkFieldIfNotBlank(personalShareDomain,"content","userId","type");
		//验证保存类型是否可用
		DictionaryCache.getInstance().validateBusinIdInUse(DictionaryType.share_save_type.getTypeId(), personalShareDomain.getType());
		PersonalShareDomain toSaveDomain = new PersonalShareDomain();
		toSaveDomain.setContent(personalShareDomain.getContent());
		toSaveDomain.setUserId(personalShareDomain.getUserId());
		toSaveDomain.setType(personalShareDomain.getType());
		toSaveDomain.setCreateTime(new Date());
		toSaveDomain.setRemindTime(personalShareDomain.getRemindTime());
		toSaveDomain.setLoginName(personalShareDomain.getLoginName());
		toSaveDomain.setNeedRemind(personalShareDomain.getNeedRemind());
		toSaveDomain.setUserCode(personalShareDomain.getUserCode());
		toSaveDomain.setUpdateTime(new Date());//方便查询
		personalShareDao.save(toSaveDomain);
	}
	
	
	
	
	/**
	 * <p>Description:修改经验或备注 </p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-14 下午1:23:23 
	 * @param personalShareDomain 
	 * @see com.haier.isales.personal.share.service.ShareService#updateShareInfo(com.haier.isales.personal.share.domain.PersonalShareDomain) 
	 */ 
	@Override
	public void updateShareInfo(PersonalShareDomain personalShareDomain) {
		CheckParamUtil.checkFieldIfNotBlank(personalShareDomain, "id","userId");
		PersonalShareDomain shareDb = personalShareDao.findById(personalShareDomain.getId());
		if(shareDb == null){
			throw new BusinessException(BusinessExceptionCode.database_none_data,"数据库中没有指定的数据");
		}
		if(!personalShareDomain.getUserId().equals(shareDb.getUserId())){
			throw new BusinessException(BusinessExceptionCode.no_auth,"您无权修改别人的分享");
		}
		shareDb.setUpdateTime(new Date());	
		if(!StringUtil.isEmpty(personalShareDomain.getType())){
			
			//验证保存类型是否可用
			DictionaryCache.getInstance().validateBusinIdInUse(DictionaryType.share_save_type.getTypeId(), personalShareDomain.getType());
			shareDb.setType(personalShareDomain.getType());
		}
		if(!StringUtil.isEmpty(personalShareDomain.getContent())){
			shareDb.setContent(personalShareDomain.getContent());
		}
		if(!StringUtil.isEmpty(personalShareDomain.getTitle())){
			shareDb.setTitle(personalShareDomain.getTitle());
		}
		if(personalShareDomain.getBrowseCount() != null){
			shareDb.setBrowseCount(personalShareDomain.getBrowseCount());
		}
		if(personalShareDomain.getPostCount() != null){
			shareDb.setPostCount(personalShareDomain.getPostCount());
		}
		if(personalShareDomain.getDislikeCount() != null){
			shareDb.setDislikeCount(personalShareDomain.getDislikeCount());
		}
		if(personalShareDomain.getLikeCount() != null){
			shareDb.setLikeCount(personalShareDomain.getLikeCount());
		}
		if(personalShareDomain.getNeedRemind() != null){
			shareDb.setNeedRemind(personalShareDomain.getNeedRemind());
		}
		if(personalShareDomain.getRemindTime() != null){
			shareDb.setRemindTime(personalShareDomain.getRemindTime());
		}
		if(!StringUtils.isEmpty(personalShareDomain.getStatus())){
			shareDb.setStatus(personalShareDomain.getStatus());
		}
		personalShareDao.update(shareDb);
		
	}
	
	
	/**
	 * <p>Description: 分享经验</p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-14 下午1:23:23 
	 * @param personalShareDomain 
	 * @see com.haier.isales.personal.share.service.ShareService#saveSharedShare2Field(com.haier.isales.personal.share.domain.PersonalShareDomain) 
	 */ 
	@Override
	public void saveSharedShare2Field(PersonalShareDomain personalShareDomain) {
		CheckParamUtil.checkFieldIfNotBlank(personalShareDomain, "id");
		PersonalShareDomain toShare = personalShareDao.findById(personalShareDomain.getId());
		toShare.setUpdateTime(new Date());
		toShare.setShareType(PersonalShareDomain.SHARE_TYPE_TO_EVERYONE);//分享给所有人
		personalShareDao.update(toShare);
	}
	/**
	* <p>Description: 根据id查询经验或备注</p> 
	* @author Guo Yuchao   
	* @date 2014-11-14 下午2:01:43 
	* @param id
	* @return 
	* @see com.haier.isales.personal.share.service.ShareService#findShareById(java.lang.Long) 
	*/ 
	@Override
	public PersonalShareDomain findShareById(Long id) {
		if(id == null){
			throw new BusinessException(BusinessExceptionCode.param_error,"经验或备注id不能为空");
		}
		return personalShareDao.findById(id);
	}
	/**
	* <p>Description:删除备忘或经验分享 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-14 下午3:22:27 
	* @param personalShareDomain 
	* @see com.haier.isales.salerInfo.personalShare.service.PersonalShareService#deletePersonalShareInfo(com.haier.isales.salerInfo.personalShare.domain.PersonalShareDomain) 
	*/ 
	@Override
	public void deletePersonalShareInfo(PersonalShareDomain personalShareDomain) {
		CheckParamUtil.checkFieldIfNotBlank(personalShareDomain, "id");
		personalShareDao.delete(personalShareDomain.getId());
		
	}
	
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性personalShareDao 的set方法 
	 */
	public void setPersonalShareDao(PersonalShareDAO personalShareDao){
		this.personalShareDao = personalShareDao;
	}


	
	
}
