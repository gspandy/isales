/**
 * @Company 青鸟软通   
 * @Title: LabelService.java 
 * @Package  com.haier.isales.system.label.service.impl
 * @author Guo Yuchao   
 * @date 2014年11月11日  15:35:45
 * @version V1.0   
 */
package com.haier.isales.system.label.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;

import com.haier.isales.common.StringUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.system.dto.LabelDTO;
import com.haier.isales.system.dto.LabelGroupDTO;
import com.haier.isales.system.label.dao.LabelDAO;
import com.haier.isales.system.label.domain.LabelDomain;
import com.haier.isales.system.label.service.LabelService;
import com.haier.isales.system.user.model.UserSearchModel;

/** 
 * @ClassName: LabelService
 * @Description: Label的Service接口定义类
 *  
 */
public class LabelServiceImpl implements LabelService{

//	private static final Logger LOG = LoggerFactory.getLogger(LabelServiceImpl.class);
	
	/** 
	* @Fields labelDao : LabelDao 工具依赖 
	*/
	private LabelDAO labelDao;
	
	
	/*===============业务方法=============*/
	/**
	 * <p>Description: 根据标签组参数查找标签 </p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-11 下午5:06:06 
	 * @param labelGroupDTO
	 * @return 
	 * @see com.haier.isales.system.label.service.LabelService#findByGroupParam(com.haier.isales.system.dto.LabelGroupDTO) 
	 */ 
	@Override
	public List<LabelDomain> findByGroupParam(LabelGroupDTO labelGroupDTO) {
		List<LabelDomain> labelList = labelDao.findByGroupParam(labelGroupDTO);
		return labelList;
	}
	
	
	
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性labelDao 的set方法 
	 */
	public void setLabelDao(LabelDAO labelDao){
		this.labelDao = labelDao;
	}





	/** 
	* @Description: 根据group查找标签 其中groupId 中可以存储多个Id  以","分隔
	* @author Guo Yuchao   
	* @date 2014-11-11 下午6:55:30 
	* @param userSearchModel
	* @param lableParentList  
	*/ 
	@Override
	public List<LabelDomain> getLabelListByLabelGroup(LabelGroupDTO labelGroupDTO){
		if(labelGroupDTO == null){
			throw new BusinessException(BusinessExceptionCode.param_error,"查询参数不能为空");
		}
		List<LabelDomain> lableParentList = new ArrayList<LabelDomain>();
		if(!StringUtil.isEmpty(labelGroupDTO.getGroupIds().trim())){
			String[] labelGroupIdAry = labelGroupDTO.getGroupIds().trim().split(UserSearchModel.STRING_ARRAY_SEPARATOR);
			for (String labelGroupIdStr : labelGroupIdAry) {
				if(StringUtil.isEmpty(labelGroupIdStr)){
					continue;
				}
				Long labelGroupId = null;
				try {
					labelGroupId = Long.valueOf(labelGroupIdStr);
				} catch (Exception e) {
					throw new BusinessException( BusinessExceptionCode.parse_format_error,"传入标签组编号错误，类型无法转换");
				}				
				labelGroupDTO.setGroupId(labelGroupId);
				List<LabelDomain> label2List = findByGroupParam(labelGroupDTO);
				if(label2List == null || label2List.isEmpty()){
					continue;
				}
				lableParentList.addAll(label2List);
			}
		}
		return lableParentList;
	}





	/**
	* <p>Description:根据labelIds 查找标签 其中可以存储多个Id  以","分隔 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-11 下午7:15:33 
	* @param labelDTO
	* @return 
	* @see com.haier.isales.system.label.service.LabelService#getLabelListByLabelIds(com.haier.isales.system.dto.LabelDTO) 
	*/ 
	@Override
	public List<LabelDomain> getLabelListByLabelIds(LabelDTO labelDTO) throws BusinessException{
		List<LabelDomain> lableParentList = new ArrayList<LabelDomain>();
		if(!StringUtil.isEmpty(labelDTO.getLabelIds().trim())){
			String[] labelGroupIdAry = labelDTO.getLabelIds().trim().split(UserSearchModel.STRING_ARRAY_SEPARATOR);
			for (String labelIdStr : labelGroupIdAry) {
				if(StringUtil.isEmpty(labelIdStr)){
					continue;
				}
				Long labelId = null;
				try {
					labelId = Long.valueOf(labelIdStr);
				} catch (Exception e) {
					throw new BusinessException( BusinessExceptionCode.parse_format_error,"传入标签组编号错误，类型无法转换");
				}	
				LabelDomain labeDomain = new LabelDomain();
				labeDomain.setLabelId(labelId);
				PageCond pageCond = new PageCond(1,Integer.MAX_VALUE);
				PageCondUtil.calculateX(pageCond);
				List<LabelDomain> label2List = labelDao.findByParams(labeDomain,pageCond);
				if(label2List != null && !label2List.isEmpty()){
					lableParentList.addAll(label2List);
				}
			}
		}
		return lableParentList;
	}





	/**
	* <p>Description:根据条件查询标签 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-11 下午7:43:44 
	* @param labelDomain
	* @param pageCond
	* @return 
	* @see com.haier.isales.system.label.service.LabelService#findByParams(com.haier.isales.system.label.domain.LabelDomain, org.bana.common.util.page.PageCond) 
	*/ 
	@Override
	public PageResult<LabelDomain> findByParams(LabelDomain labelDomain,
			PageCond pageCond) {
		pageCond = PageCondUtil.check(pageCond);
		PageCondUtil.calculateX(pageCond);
		List<LabelDomain> labelList = labelDao.findByParams(labelDomain, pageCond);
		int totalCount = labelDao.findCountByParams(labelDomain);
		pageCond.setTotalCount(totalCount);
		PageCondUtil.calculatePageCount(pageCond);
		return new PageResult<LabelDomain>(labelList,pageCond);
	}

	
}
