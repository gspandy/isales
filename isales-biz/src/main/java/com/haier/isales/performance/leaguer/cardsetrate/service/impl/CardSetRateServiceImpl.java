/**
 * @Company 青鸟软通   
 * @Title: CardSetRateService.java 
 * @Package  com.haier.isales.performance.leaguer.cardsetrate.service.impl
 * @author Guo Yuchao   
 * @date 2014年12月18日  10:38:02
 * @version V1.0   
 */
package com.haier.isales.performance.leaguer.cardsetrate.service.impl;


import java.util.List;

import org.bana.common.util.basic.StringUtils;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.IsalesDateUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.performance.PerformanceEnum.IsAscendEnum;
import com.haier.isales.performance.leaguer.cardsetrate.dao.CardSetRateDAO;
import com.haier.isales.performance.leaguer.cardsetrate.service.CardSetRateService;
import com.haier.isales.performance.leaguer.dto.RegistDTO;

/** 
 * @ClassName: CardSetRateService
 * @Description: CardSetRate的Service接口定义类
 *  
 */
public class CardSetRateServiceImpl implements CardSetRateService{

//	private static final Logger LOG = LoggerFactory.getLogger(CardSetRateServiceImpl.class);
	
	/** 
	* @Fields cardSetRateDao : CardSetRateDao 工具依赖 
	*/
	private CardSetRateDAO cardSetRateDao;
	
	
	/*===============业务方法=============*/
	
	/** 
	* @Description: 查询套购率信息   根据     门店id、月份 （开始结束时间字符串yyyy-MM）、产品线   条件
	* @author Guo Yuchao   
	* @date 2014-12-22 下午4:46:29 
	* @param registDTO
	* @return
	* @throws BusinessException  
	*/ 
	@Override
	public RegistDTO findCardSetRateByParam(RegistDTO registDTO)
			throws BusinessException {
		//验证参数是否为空
		CheckParamUtil.checkFieldIfNotBlank(registDTO, "month");
		if(StringUtils.isEmpty(registDTO.getShopId().trim())){
			throw new BusinessException(BusinessExceptionCode.no_shop);
		}
		//验证月份格式
		String month = registDTO.getMonth();
		month = IsalesDateUtil.getPeriodDateString(month);
		registDTO.setMonth(month);
		registDTO.setBeforeMonth(month);//查询月份为开始结束的月份，这里使用同一个
		//查询指定月份注册信息
		List<RegistDTO> cardRateList = cardSetRateDao.findCardSetRateByParam(registDTO,null);
		if(cardRateList == null || cardRateList.isEmpty()){
//			throw new BusinessException(BusinessExceptionCode.database_none_data,"没有找到指定的套购率信息");
			return new RegistDTO("0", "0", "0", IsAscendEnum.平稳.getValue());
		}
		RegistDTO card = cardRateList.get(0);
		if(card == null){
//			throw new BusinessException(BusinessExceptionCode.database_none_data,"没有找到指定的套购率信息");
			card = new RegistDTO("0", "0", "0", IsAscendEnum.平稳.getValue());
		}
		return card;
	}
	
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性cardSetRateDao 的set方法 
	 */
	public void setCardSetRateDao(CardSetRateDAO cardSetRateDao){
		this.cardSetRateDao = cardSetRateDao;
	}
	
}
