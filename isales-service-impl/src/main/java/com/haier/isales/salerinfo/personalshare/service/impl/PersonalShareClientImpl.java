/**
* @Company 青鸟软通   
* @Title: PersonalShareClientImpl.java 
* @Package com.haier.isales.salerInfo.personalShare.service.impl 
* @author Guo Yuchao   
* @date 2014-11-14 下午2:40:11 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalshare.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.salerinfo.personalinfo.SalerInfoDomainDtoUtil;
import com.haier.isales.salerinfo.personalshare.domain.PersonalShareDomain;
import com.haier.isales.salerinfo.personalshare.dto.PersonalShareDTO;
import com.haier.isales.salerinfo.personalshare.service.PersonalShareClient;
import com.haier.isales.salerinfo.personalshare.service.PersonalShareService;

/** 
 * @ClassName: PersonalShareClientImpl 
 * @Description: 备忘和经验相关接口实现
 *  
 */
public class PersonalShareClientImpl implements PersonalShareClient {
	private PersonalShareService personalShareService;
	/**
	 * <p>Description:根据条件查询经验或备忘 </p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-14 下午2:40:11 
	 * @param personalShareDTO
	 * @param pageCond
	 * @return 
	 * @see com.haier.isales.salerInfo.personalShare.service.PersonalShareClient#findShareInfoByParam(com.haier.isales.salerInfo.personalShare.dto.PersonalShareDTO, org.bana.common.util.page.PageCond) 
	 */
	@Override
	public PageResult<PersonalShareDTO> findShareInfoByParam(
			PersonalShareDTO personalShareDTO,Integer currentPage,Integer pageSize) {
		Integer pageNo = currentPage;
		Integer numPerPage = pageSize;
		if(pageNo == null){
			pageNo = 1;
		}
		if(numPerPage == null){
			numPerPage = 10;
		}
		
		PersonalShareDomain personalShareDomain = SalerInfoDomainDtoUtil.clonePersonalShareDTO2Domain(personalShareDTO);
		PageResult<PersonalShareDomain> pageResult = personalShareService.findShareInfoByParam(personalShareDomain, new PageCond(pageNo,numPerPage));
		List<PersonalShareDTO> shareDtoList = new ArrayList<PersonalShareDTO>();
		for (PersonalShareDomain psDomain : pageResult.getResultList()) {
			PersonalShareDTO personalShareDTO2 = SalerInfoDomainDtoUtil.clonePersonalShareDomain2DTO(psDomain);
			shareDtoList.add(personalShareDTO2);
		}
		return new PageResult<PersonalShareDTO>(shareDtoList, pageResult.getPageCond());
	}

	/**
	 * <p>Description:根据id查询经验或备注 </p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-14 下午2:40:11 
	 * @param id
	 * @return 
	 * @see com.haier.isales.salerInfo.personalShare.service.PersonalShareClient#findShareById(java.lang.Long) 
	 */
	@Override
	public PersonalShareDTO findShareById(Long id) {
		PersonalShareDomain personalShareDomain = personalShareService.findShareById(id);
		PersonalShareDTO personalShareDTO = SalerInfoDomainDtoUtil.clonePersonalShareDomain2DTO(personalShareDomain);
		return personalShareDTO;
	}

	/**
	 * <p>Description: 保存经验或备注 需要区分类型type 默认为经验 </p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-14 下午2:40:11 
	 * @param personalShareDTO 
	 * @see com.haier.isales.salerInfo.personalShare.service.PersonalShareClient#saveShareInfo(com.haier.isales.salerInfo.personalShare.dto.PersonalShareDTO) 
	 */
	@Override
	public String saveShareInfo(PersonalShareDTO personalShareDTO) {
		PersonalShareDomain personalShareDomain = SalerInfoDomainDtoUtil.clonePersonalShareDTO2Domain(personalShareDTO);
		personalShareService.saveShareInfo(personalShareDomain);
		return "success";
	}

	/**
	 * <p>Description: 修改经验或备注</p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-14 下午2:40:11 
	 * @param personalShareDTO 
	 * @see com.haier.isales.salerInfo.personalShare.service.PersonalShareClient#updateShareInfo(com.haier.isales.salerInfo.personalShare.dto.PersonalShareDTO) 
	 */
	@Override
	public String updateShareInfo(PersonalShareDTO personalShareDTO) {
		PersonalShareDomain personalShareDomain = SalerInfoDomainDtoUtil.clonePersonalShareDTO2Domain(personalShareDTO);
		personalShareService.updateShareInfo(personalShareDomain);
		return "success";
	}

	/**
	 * <p>Description: 分享经验 </p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-14 下午2:40:11 
	 * @param personalShareDTO 
	 * @see com.haier.isales.salerInfo.personalShare.service.PersonalShareClient#saveSharedShare2Field(com.haier.isales.salerInfo.personalShare.dto.PersonalShareDTO) 
	 */
	@Override
	public String saveSharedShare2Field(PersonalShareDTO personalShareDTO) {
		PersonalShareDomain personalShareDomain = SalerInfoDomainDtoUtil.clonePersonalShareDTO2Domain(personalShareDTO);
		personalShareService.saveSharedShare2Field(personalShareDomain);
		return "success";
	}

	/**
	* <p>Description:delete 备忘或经验 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-14 下午3:49:38 
	* @param personalShareDTO
	* @return 
	* @see com.haier.isales.salerInfo.personalShare.service.PersonalShareClient#deletePersonalShareInfo(com.haier.isales.salerInfo.personalShare.dto.PersonalShareDTO) 
	*/ 
	@Override
	public Object deletePersonalShareInfo(PersonalShareDTO personalShareDTO) {
		PersonalShareDomain personalShareDomain = SalerInfoDomainDtoUtil.clonePersonalShareDTO2Domain(personalShareDTO);
		personalShareService.deletePersonalShareInfo(personalShareDomain);
		return "success";
	}

	/**
	 * @Description: 属性 personalShareService 的get方法 
	 * @return personalShareService
	 */
	public PersonalShareService getPersonalShareService() {
		return personalShareService;
	}

	/**
	 * @Description: 属性 personalShareService 的set方法 
	 * @param personalShareService 
	 */
	public void setPersonalShareService(PersonalShareService personalShareService) {
		this.personalShareService = personalShareService;
	}

}
