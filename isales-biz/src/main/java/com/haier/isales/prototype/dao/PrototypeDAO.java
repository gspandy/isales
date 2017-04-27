/**
 * @Company 青鸟软通   
 * @Title: PrototypeDAO.java 
 * @Package  com.haier.isales.prototype.dao
 * @author Guo Yuchao   
 * @date 2014年12月25日  14:01:03
 * @version V1.0   
 */
package com.haier.isales.prototype.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bana.common.util.page.PageCond;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.prototype.domain.PrototypeDomain;
import com.haier.isales.prototype.dto.PrototypeListParamDTO;
/** 
 * @ClassName: PrototypeDAO
 * @Description: Prototype的DAO接口定义类
 *  
 */
public interface PrototypeDAO extends CommonDAO<PrototypeDomain,Long>{

	/** 
	* @Description: 查询样机列表
	* @author John.zhao   
	* @date 2014-12-25 下午6:51:43 
	* @param prototypeListDTO
	* @param productModelNameList
	* @param pageCond
	* @return  
	*/ 
	List<PrototypeDomain> findPrototypePagerLike(@Param("entity")PrototypeListParamDTO prototypeListParamDTO, @Param("proList")List<String> proList,
			@Param("pageCond")PageCond pageCond);
	/** 
	* @Description: 根据hmms系统的产品线AA 查询zzjyt产业线101  和 产品对应的图片id
	* @author Guo Yuchao   
	* @date 2015-1-6 下午3:03:03 
	* @param productSortNo
	* @return  
	*/ 
	PrototypeDomain findProLineBySortCode(@Param("productSortNo")String productSortNo);
	
	
	Integer findListByDataPeriodCount(@Param("entity")PrototypeListParamDTO prototypeListParamDTO,@Param("proList")List<String> productModelNameList, @Param("startDate")String startDate,
            @Param("endDate")String endDate);
	
	/**
     * 
     * @Description: 根据时间段进行样机列表查询
     * @author wangp
     * @date 2016-08-11 
     * @param client
     * @param prototypeListParamDTO
     * @param startDate
     * @param endDate
     * @param currentPage
     * @param pageSize
     * @param session
     * @return
     */
    List<PrototypeDomain> findPrototypePagerLikeListByDataPeriod(@Param("entity")PrototypeListParamDTO prototypeListParamDTO,@Param("proList")List<String> proList, @Param("startDate")String startDate,
            @Param("endDate")String endDate, @Param("pageCond")PageCond pageCond);
    
    /**
     * 根据barcode查询核销的样机
    * @Title: findByBarCode
    * @Description: TODO (这里用一句话描述这个类的作用)
    * @param @param barcode
    * @param @return
    * @return PrototypeDomain
    * @throws
     */
    PrototypeDomain findByBarCode(@Param("barcode")String barcode);
	
}
