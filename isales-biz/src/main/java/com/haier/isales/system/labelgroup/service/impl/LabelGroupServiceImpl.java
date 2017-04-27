/**
 * @Company 青鸟软通   
 * @Title: LabelGroupService.java 
 * @Package  com.haier.isales.system.labelGroup.service.impl
 * @author Guo Yuchao   
 * @date 2014年11月11日  15:59:51
 * @version V1.0   
 */
package com.haier.isales.system.labelgroup.service.impl;


import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;
import com.haier.isales.common.DomainDtoUtil;
import com.haier.isales.system.dto.LabelGroupDTO;
import com.haier.isales.system.labelgroup.dao.LabelGroupDAO;
import com.haier.isales.system.labelgroup.domain.LabelGroupDomain;
import com.haier.isales.system.labelgroup.service.LabelGroupService;

/** 
 * @ClassName: LabelGroupService
 * @Description: LabelGroup的Service接口定义类
 *  
 */
public class LabelGroupServiceImpl implements LabelGroupService{

//	private static final Logger LOG = LoggerFactory.getLogger(LabelGroupServiceImpl.class);
	
	/** 
	* @Fields labelGroupDao : LabelGroupDao 工具依赖 
	*/
	private LabelGroupDAO labelGroupDao;
	
	
	

	/*===============业务方法=============*/
	
	/** 
	* @Description: 根据用户id，获取用户所关联的所有标签组
	* @author Liu Wenjie   
	* @date 2014-11-21 下午10:04:06 
	* @param operatorId
	* @return  
	*/ 
	public List<LabelGroupDomain> findGroupsByUser(Long operatorId){
		return labelGroupDao.findGroupsByUser(operatorId);
	}

	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-11-11 下午4:11:29 
	* @param labelGroupDTO
	* @return 
	* @see com.haier.isales.system.labelgroup.service.LabelGroupService#findByParam(com.haier.isales.system.dto.LabelGroupDTO) 
	*/ 
	@Override
	public PageResult<LabelGroupDomain> findByParam(LabelGroupDTO labelGroupDTO,PageCond pageCond) {
		
		PageCond pageCondQuery = pageCond;
		pageCondQuery = PageCondUtil.check(pageCondQuery);
		PageCondUtil.calculateX(pageCondQuery);
		LabelGroupDomain labelGroup = DomainDtoUtil.cloneLabelGroupDto2Domain(labelGroupDTO);
		List<LabelGroupDomain> labelGroupList = labelGroupDao.findByParams(labelGroup, pageCondQuery);
		int totalCount = labelGroupDao.findCountByParams(labelGroup);
		pageCondQuery.setTotalCount(totalCount);
		PageCondUtil.calculatePageCount(pageCondQuery);
		return new PageResult<LabelGroupDomain>(labelGroupList, pageCondQuery);
		
	}
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性labelGroupDao 的set方法 
	 */
	public void setLabelGroupDao(LabelGroupDAO labelGroupDao){
		this.labelGroupDao = labelGroupDao;
	}
}
