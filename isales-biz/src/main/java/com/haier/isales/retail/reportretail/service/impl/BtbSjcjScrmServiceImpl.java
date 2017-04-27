/**
 * @Company 青鸟软通   
 * @Title: BtbSjcjScrmService.java 
 * @Package  com.haier.isales.reportretail.service.impl
 * @author Shao Jingkai   
 * @date 2015年06月23日  09:55:34
 * @version V1.0   
 */
package com.haier.isales.retail.reportretail.service.impl;


import com.haier.isales.retail.reportretail.dao.BtbSjcjScrmDAO;
import com.haier.isales.retail.reportretail.service.BtbSjcjScrmService;

/** 
 * @ClassName: BtbSjcjScrmService
 * @Description: BtbSjcjScrm的Service接口定义类
 *  
 */
public class BtbSjcjScrmServiceImpl implements BtbSjcjScrmService{

//	private static final Logger LOG = LoggerFactory.getLogger(BtbSjcjScrmServiceImpl.class);
	
	/** 
	* @Fields btbSjcjScrmDao : BtbSjcjScrmDao 工具依赖 
	*/
	private BtbSjcjScrmDAO btbSjcjScrmDao;
	
	
	/*===============业务方法=============*/
	
	
	
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性btbSjcjScrmDao 的set方法 
	 */
	public void setBtbSjcjScrmDao(BtbSjcjScrmDAO btbSjcjScrmDao){
		this.btbSjcjScrmDao = btbSjcjScrmDao;
	}
	
}
