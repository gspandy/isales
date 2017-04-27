/**
 * @Company 青鸟软通   
 * @Title: ProModelDAO.java 
 * @Package  com.haier.isales.basicInfo.proModel.dao
 * @author Guo Yuchao   
 * @date 2014年11月15日  11:41:37
 * @version V1.0   
 */
package com.haier.isales.basicinfo.promodel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bana.common.util.page.PageCond;

import com.haier.isales.basicinfo.promodel.domain.ProModelDomain;
import com.haier.isales.common.dao.CommonDAO;

/**
 * @ClassName: ProModelDAO
 * @Description: ProModel的DAO接口定义类
 * 
 */
public interface ProModelDAO extends CommonDAO<ProModelDomain, String> {
	/**
	 * @Description: 根据型号名称模糊查询型号信息列表
	 * @author Guo Yuchao
	 * @date 2014-11-17 下午4:39:58
	 * @param prdn
	 * @return
	 */
	List<ProModelDomain> findProModelLikePrdn(@Param("prdns") List<String> prdns);

	/**
	 * @Description: 根据型号名称模糊查询型号信息列表  分页查询
	 * @author Guo Yuchao
	 * @date 2014-11-17 下午4:39:58
	 * @param prdn
	 * @return
	 */
	List<ProModelDomain> findModelPagerLikePrdn(@Param("prdns") List<String> prdns,
			@Param("pageCond") PageCond pageCond);

	/**
	 * @Description: 根据型号名称模糊查询型号信息列表    查询 分页总条数
	 * @author Guo Yuchao
	 * @date 2014-11-17 下午4:39:58
	 * @param prdn
	 * @return
	 */
	Integer findCountModelPagerLikePrdn(@Param("prdns") List<String> prdns);
}
