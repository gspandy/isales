/**
 * @Company 青鸟软通   
 * @Title: UserDao.java 
 * @Package com.haier.isales.system.user.dao 
 * @author Guo Yuchao   
 * @date 2014-10-28 上午10:11:23 
 * @version V1.0   
 */
package com.haier.isales.system.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bana.common.util.page.PageCond;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.system.label.domain.LabelDomain;
import com.haier.isales.system.user.domain.User;
import com.haier.isales.system.user.model.UserSearchModel;

/**
 * @ClassName: UserDao
 * @Description: 用户dao
 * 
 */
public interface UserDao extends CommonDAO<User, Long> {

	/**
	 * @Description: 根据参数返回用户信息
	 * @author Guo Yuchao
	 * @date 2014-10-28 上午10:36:41
	 * @param userSearchModel
	 * @return
	 */
	List<User> getUserByParam(@Param("model") UserSearchModel userSearchModel,
			@Param("pageCond") PageCond pageCond);

	/**
	 * @Description: 根据参数返回用户信息total
	 * @author Guo Yuchao
	 * @date 2014-10-29 下午7:59:57
	 * @param userSearchModel
	 * @return
	 */
	Long getCountUserByParam(UserSearchModel userSearchModel);


	/**
	 * @Description: 根据组织编号查询组织及下属组织所有用户
	 * @author Guo Yuchao
	 * @date 2014-11-10 下午3:26:08
	 * @param userSearchModel
	 * @return
	 */
	List<User> findUserByOrgParam(
			@Param("model") UserSearchModel userSearchModel);
	
	
	/** 
	* @Description: 根据指定的所在组织的集合，和不在的组织集合，查询这个组织下属的所有员工信息
	* @author Liu Wenjie   
	* @date 2014-11-15 下午1:37:41 
	* @param orgList
	* @return  
	*/ 
	List<User> findUserByOrgParamList(@Param("includeList")List<String> includeList,@Param("excludeList")List<String> excludeList); 

	/**
	 * @Description: 根据虚拟组织编号查询组织及下属组织所有用户
	 * @author Guo Yuchao
	 * @date 2014-11-10 下午6:23:14
	 * @param userSearchModel
	 * @return
	 */
	List<User> findUserByVirtualOrgParam(
			@Param("model") UserSearchModel userSearchModel);

	/** 
	* @Description: 根据指定的所在虚拟组织的集合，和不在的虚拟组织集合，查询这个组织下属的所有员工信息
	* @author Liu Wenjie   
	* @date 2014-11-15 下午1:57:16 
	* @param includeList
	* @param excludeList
	* @return  
	*/ 
	List<User> findUserByVirtualOrgParamList(@Param("includeList")List<String> includeList,@Param("excludeList")List<String> excludeList); 
	
	/** 
	* @Description: 根据标签返回用户列表
	* @author Guo Yuchao   
	* @date 2014-11-11 下午9:26:36 
	* @param userSearchModel
	* @param includeLabelList
	* @param excludeLabelList
	* @return  
	*/ 
	List<User> getUserByLabel(@Param("includeLabelList")List<LabelDomain> includeLabelList,	@Param("excludeLabelList")List<LabelDomain> excludeLabelList);

	/** 
	* @Description: 根据标签的主键集合（包含的于不包含的）
	* @author Liu Wenjie   
	* @date 2014-11-15 下午2:49:21 
	* @param includeGroupList
	* @param includeGroupList2
	* @return  
	*/ 
	List<User> getUserByLabelIds(@Param("includeGroupList")List<String> includeGroupList,
			@Param("excludeGroupList")List<String> excludeGroupList);

	
	/** 
	* @Description: TODO 查询同一个门店下所有员工
	* @author Shao Jingkai   
	* @date 2015-6-29 上午10:25:17 
	* @param shopId
	* @return  
	*/ 
	List<User> getUsersInSameShop(@Param("shopId") String shopId);
}
