/**
* @Company 青鸟软通   
* @Title: PrototypeListDTO.java 
* @Package com.haier.isales.prototype.dto 
* @author John.zhao   
* @date 2014-12-25 下午4:35:45 
* @version V1.0   
*/ 
package com.haier.isales.prototype.dto;

import java.io.Serializable;

/** 
 * @ClassName: PrototypeListDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class PrototypeListParamDTO implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -3719704605540604194L;

	/** 
	* @Fields operatorId : operatorId
	*/ 
	private Long operatorId;
	
	/** 
	* @Fields userCode : Z开头的 
	*/ 
	private String userCode;
	
	/** 
	* @Fields yearMonth : 查询的日期
	*/ 
	private String yearMonth;
	
	/** 
	* @Fields productLineNo : 产品线编码（101类型的） 
	*/ 
	private String productLineNo;
	
	/** 
	* @Fields shopId : 门店id 
	*/ 
	private String shopId;
	
	/** 
	* @Fields productModelCode : 产品型号名称（精确查询）
	*/ 
	private String productModelCode;
	
	/** 
	* @Fields productModelName : 产品型号名称（模糊查询）
	*/ 
	private String productModelName;
	
	/**
     * yjstate 在柜状态
     */
    private String yjstate;
    
    /**
     * 产品编码
     * barCode
     */
    private String barcode;

	/**
	 * @Description: 属性 operatorId 的get方法 
	 * @return operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}

	/**
	 * @Description: 属性 userCode 的get方法 
	 * @return userCode
	 */
	public String getUserCode() {
		return userCode;
	}

	/**
	 * @Description: 属性 yearMonth 的get方法 
	 * @return yearMonth
	 */
	public String getYearMonth() {
		return yearMonth;
	}

	/**
	 * @Description: 属性 productLineNo 的get方法 
	 * @return productLineNo
	 */
	public String getProductLineNo() {
		return productLineNo;
	}

	/**
	 * @Description: 属性 shopId 的get方法 
	 * @return shopId
	 */
	public String getShopId() {
		return shopId;
	}

	/**
	 * @Description: 属性 productModelName 的get方法 
	 * @return productModelName
	 */
	public String getProductModelName() {
		return productModelName;
	}

	/**
	 * @Description: 属性 operatorId 的set方法 
	 * @param operatorId 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * @Description: 属性 userCode 的set方法 
	 * @param userCode 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	/**
	 * @Description: 属性 yearMonth 的set方法 
	 * @param yearMonth 
	 */
	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}

	/**
	 * @Description: 属性 productLineNo 的set方法 
	 * @param productLineNo 
	 */
	public void setProductLineNo(String productLineNo) {
		this.productLineNo = productLineNo;
	}

	/**
	 * @Description: 属性 shopId 的set方法 
	 * @param shopId 
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	/**
	 * @Description: 属性 productModelName 的set方法 
	 * @param productModelName 
	 */
	public void setProductModelName(String productModelName) {
		this.productModelName = productModelName;
	}
	
	

	public String getYjstate() {
        return yjstate;
    }

    public void setYjstate(String yjstate) {
        this.yjstate = yjstate;
    }
    
    

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    
    

    public String getProductModelCode() {
        return productModelCode;
    }

    public void setProductModelCode(String productModelCode) {
        this.productModelCode = productModelCode;
    }

    /**
     * <p>Description: </p> 
     * @author Guo Yuchao   
     * @date 2015-1-7 下午7:09:03 
     * @return 
     * @see java.lang.Object#toString() 
     */ 
    @Override
    public String toString() {
        return "PrototypeListParamDTO [operatorId=" + operatorId
                + ", userCode=" + userCode + ", yearMonth=" + yearMonth
                + ", productLineNo=" + productLineNo + ", shopId=" + shopId
                + ", productModelName=" + productModelName + ",yjstate="+yjstate+ ",barCode="+barcode+",productModelCode="+productModelCode+"]";
    }
	
}
