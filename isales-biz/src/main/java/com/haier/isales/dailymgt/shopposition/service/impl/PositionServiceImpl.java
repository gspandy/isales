/**
* @Company 青鸟软通   
* @Title: PositionServiceImpl.java 
* @Package com.haier.isales.dailymgt.shopposition.service.impl 
* @author John.zhao   
* @date 2015-3-2 下午2:38:58 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.shopposition.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.bana.common.util.basic.MapRunable;
import org.bana.common.util.exception.ThrowableUtil;

import com.haier.isales.common.DictionaryCache;
import com.haier.isales.common.HttpURLConnUtil;
import com.haier.isales.common.IsalesConstants.DictionaryType;
import com.haier.isales.common.PositionDistanceUtil;
import com.haier.isales.common.SpringApplicationContextHolder;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.dailymgt.dto.ShopPositionDTO;
import com.haier.isales.dailymgt.dto.ShopPositionParamDTO;
import com.haier.isales.dailymgt.shoperrorposition.dao.ShopErrorPositionDAO;
import com.haier.isales.dailymgt.shoperrorposition.domain.ShopErrorPositionDomain;
import com.haier.isales.dailymgt.shopposition.dao.PositionDAO;
import com.haier.isales.dailymgt.shopposition.domain.ShopPositionDomain;
import com.haier.isales.dailymgt.shopposition.service.PositionService;

/** 
 * @ClassName: PositionServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class PositionServiceImpl implements PositionService {
	
	// 创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们。
	private ExecutorService pool = Executors.newCachedThreadPool();
	/** 
	* @Fields SHOP_POSITION_ID : 数据字典维护的计算基准距离
	*/ 
	private static final String SHOP_POSITION_ID="1";
	/** 
	* @Fields ADDRESS : EAI提供的电子地图的接口地址 
	*/ 
	public static final String ADDRESS = "http://10.135.1.110:7001/EAI/service/HMMS/TransAddMendianErrorToHMMS/TransAddMendianErrorToHMMS";
	/** 
	* @Fields positionDao : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private PositionDAO positionDao;
	/** 
	* @Fields shopErrorPositionDao : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private ShopErrorPositionDAO shopErrorPositionDao;
	/**
	 * <p>Description: </p> 
	 * @author John.zhao   
	 * @date 2015-3-2 下午2:38:58 
	 * @param shopPositionParamDTO
	 * @return 
	 * @see com.haier.isales.dailymgt.shopposition.service.PositionService#checkIfInShop(com.haier.isales.dailymgt.dto.ShopPositionParamDTO) 
	 */
	@Override
	public ShopPositionDTO searchIfInShop(ShopPositionParamDTO shopPositionParamDTO) {
		ShopErrorPositionDomain shopErrorPositionDomain = new ShopErrorPositionDomain();
		if(shopPositionParamDTO == null){
			throw new BusinessException(BusinessExceptionCode.param_error,"输入参数为空！");
		}
		if(shopPositionParamDTO.getShopCode()==null){
			throw new BusinessException(BusinessExceptionCode.param_error,"未维护门店信息！");
		}
		if(shopPositionParamDTO.getShopLatitude()==null){
			throw new BusinessException(BusinessExceptionCode.param_error,"门店所在位置纬度参数为空！");
		}
		if(shopPositionParamDTO.getShopLongitude()==null){
			throw new BusinessException(BusinessExceptionCode.param_error,"门店所在位置经度参数为空！");
		}
		if(shopPositionParamDTO.getShopLatitude()<10||shopPositionParamDTO.getShopLongitude()<10){
			throw new BusinessException(BusinessExceptionCode.param_error,"当前位置GPS信号较弱,定位失败!");
		}
		shopErrorPositionDomain.setShopCode(shopPositionParamDTO.getShopCode());
		shopErrorPositionDomain.setShopName(shopPositionParamDTO.getShopName());
		shopErrorPositionDomain.setCurrentLatitude(String.valueOf(new Double(shopPositionParamDTO.getShopLatitude()*10000000).longValue()));
		shopErrorPositionDomain.setCurrentLongitude(String.valueOf(new Double(shopPositionParamDTO.getShopLongitude()*10000000).longValue()));
		shopErrorPositionDomain.setUserCode(shopPositionParamDTO.getUserCode());
		shopErrorPositionDomain.setUserName(shopPositionParamDTO.getUserName());
		shopErrorPositionDomain.setOperatorId(shopPositionParamDTO.getOperatorId());
		ShopPositionDomain shopPositionDomain = positionDao.findByShopCode(shopPositionParamDTO.getShopCode());
		ShopPositionDTO shopPositionDTO = new ShopPositionDTO();
		//如果没有维护该门店的经纬度信息，则该人在门店中，并把定位到的经纬度信息发送给电子地图，并且把返回值以及数据保存到数据库中
		if(shopPositionDomain== null){
			saveAndPost(shopErrorPositionDomain);
//			shopPositionDTO.setInShop(true);
//			return shopPositionDTO;
			throw new BusinessException(BusinessExceptionCode.param_error,"亲爱的用户，您所在的门店在电子地图中没有记录，请协同中心运营总监对门店信息进行采集！");
		}
		double distance = PositionDistanceUtil.getDistance(shopPositionParamDTO.getShopLongitude(), shopPositionParamDTO.getShopLatitude(),(double)shopPositionDomain.getShopLongitude()/10000000, (double)shopPositionDomain.getShopLatitude()/10000000);
		String baseDistance = DictionaryCache.getInstance().getValueByTypeAndId(DictionaryType.shop_position_distance.getTypeId(), SHOP_POSITION_ID);
		
		shopPositionDTO.setDistance(distance);
		shopErrorPositionDomain.setShopLatitude(String.valueOf(shopPositionDomain.getShopLatitude()));
		shopErrorPositionDomain.setShopLongitude(String.valueOf(shopPositionDomain.getShopLongitude()));
		shopErrorPositionDomain.setErrorDistance(String.valueOf(distance));
		if(distance>Double.valueOf(baseDistance)){
//			shopPositionDTO.setInShop(false);
			//如果定位到的数据大于baseDistance，则把定位到的经纬度信息发送给电子地图，并且把返回值以及数据保存到数据库中
			saveAndPost(shopErrorPositionDomain);
			// 更换页面的提示方式，使用shopPositionDTO.setInShop(false)的话页面会弹出框提示不在门店，而抛出下面的异常时，页面会在顶部显示提示信息，没有弹框;
			throw new BusinessException(BusinessExceptionCode.param_error,"亲，您签到的位置与电子地图中位置信息不一致，请在日常管理-位置纠错处反馈见证性照片。注意需要现场提交门头照片，且提交的新位置需要中心运营总监审核后生效！");
		}else{
			shopPositionDTO.setInShop(true);
			saveSuccessPost(shopErrorPositionDomain);
		}
		return shopPositionDTO;
	}

	/** 
	* @Description: 另起一个线程，如果定位在门店中，也要把定位到的数据传给电子地图
	* @author John.zhao   
	* @date 2015年4月14日 09:39:49 
	* @param shopErrorPositionDomain  
	*/ 
	public void saveSuccessPost(ShopErrorPositionDomain shopErrorPositionDomain) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("shopErrorPositionDomain", shopErrorPositionDomain);
		pool.execute(new MapRunable(map) {
			@Override
			public void run() {
				ShopErrorPositionDomain shopErrorPositionDomain = (ShopErrorPositionDomain) map.get("shopErrorPositionDomain");
				//修复违规  “当前局部变量名 是否与 类的属性名/字段名相同？”
				ShopErrorPositionDAO shopErrorPositionDao_1 = SpringApplicationContextHolder.getBean("shopErrorPositionDao");
				String sendGet="";
					StringBuffer url = new StringBuffer(ADDRESS);
					try {
						url.append("?id=").append(shopErrorPositionDomain.getShopCode());
						url.append("&latitude=").append(shopErrorPositionDomain.getCurrentLatitude());
						url.append("&longitude=").append(shopErrorPositionDomain.getCurrentLongitude());
						sendGet = HttpURLConnUtil.sendGet(url.toString());
					} catch (Exception e) {
						sendGet=ThrowableUtil.getStackTrace(e);
					}
				shopErrorPositionDomain.setExecuteResult(sendGet);
//				shopErrorPositionDao_1.save(shopErrorPositionDomain);
			}
		});
    }
	
	
	/** 
	* @Description: 另起一个线程，处理发送电子地图接口请求以及保存数据的操作
	* @author John.zhao   
	* @date 2015-3-5 下午1:29:41 
	* @param shopErrorPositionDomain  
	*/ 
	public void saveAndPost(ShopErrorPositionDomain shopErrorPositionDomain) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("shopErrorPositionDomain", shopErrorPositionDomain);
		pool.execute(new MapRunable(map) {
			@Override
			public void run() {
				PositionService positionService = SpringApplicationContextHolder.getBean("positionService");
				ShopErrorPositionDomain shopErrorPositionDomain = (ShopErrorPositionDomain) map.get("shopErrorPositionDomain");
				positionService.saveResult(shopErrorPositionDomain);
			}
		});
    }   
	
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-3-5 下午1:21:27 
	* @param shopErrorPositionDomain 
	* @see com.haier.isales.dailymgt.shopposition.service.PositionService#saveResult(com.haier.isales.dailymgt.shoperrorposition.domain.ShopErrorPositionDomain) 
	*/ 
	@Override
	public void saveResult(ShopErrorPositionDomain shopErrorPositionDomain) {
		String sendGet="";
		int count = shopErrorPositionDao.findInLastHour(shopErrorPositionDomain.getUserCode());
		if(count == 0){
			StringBuffer url = new StringBuffer(ADDRESS);
			try {
				url.append("?id=").append(shopErrorPositionDomain.getShopCode());
//				url.append("&name=").append(shopErrorPositionDomain.getShopName());
				url.append("&latitude=").append(shopErrorPositionDomain.getCurrentLatitude());
				url.append("&longitude=").append(shopErrorPositionDomain.getCurrentLongitude());
				sendGet = HttpURLConnUtil.sendGet(url.toString());
			} catch (Exception e) {
				sendGet=ThrowableUtil.getStackTrace(e);
			}
		}
		shopErrorPositionDomain.setExecuteResult(sendGet);
//		shopErrorPositionDao.save(shopErrorPositionDomain);
	}
	
	/**
	 * @Description: 属性 positionDao 的set方法 
	 * @param positionDao 
	 */
	public void setPositionDao(PositionDAO positionDao) {
		this.positionDao = positionDao;
	}
	/**
	 * @Description: 属性 shopErrorPositionDao 的set方法 
	 * @param shopErrorPositionDao 
	 */
	public void setShopErrorPositionDao(ShopErrorPositionDAO shopErrorPositionDao) {
		this.shopErrorPositionDao = shopErrorPositionDao;
	}
}
