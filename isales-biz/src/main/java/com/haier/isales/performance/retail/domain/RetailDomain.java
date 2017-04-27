/**
* @Company 青鸟软通   
* @Title: RetailDomain.java 
* @Package com.haier.isales.performance.retail.domain 
* @author John.zhao   
* @date 2014年12月22日  14:41:06 
* @version V1.0   
*/ 
package com.haier.isales.performance.retail.domain;

import java.io.Serializable;

/** 
 * @ClassName: RetailDomain 
 * t_isales_btb_ratail 自动生成的对应的实体对象   
 *  
 */
public class RetailDomain implements Serializable{
	private static final long serialVersionUID = -1419230466118L;

	/** 
	* @Fields rowId : 同步数据时对方数据库中的唯一标识
	*/
	private String rowId;
	/** 
	* @Fields tradeId : 工贸
	*/
	private String tradeId;
	/** 
	* @Fields shopId : 门店编码
	*/
	private String shopId;
	/** 
	* @Fields shopName : 门店名称
	*/
	private String shopName;
	/** 
	* @Fields prolineId : 产品线
	*/
	private String prolineId;
	/** 
	* @Fields productId : 产品编码
	*/
	private String productId;
	/** 
	* @Fields salesMonth : 销售日期
	*/
	private java.util.Date salesMonth;
	/** 
	* @Fields salesNum : 数量
	*/
	private java.math.BigDecimal salesNum;
	/** 
	* @Fields salesPrice : 销售价格，出厂价
	*/
	private java.math.BigDecimal salesPrice;
	/** 
	* @Fields sourcetype : 取数方式，含义不明确
	*/
	private Integer sourcetype;
	/** 
	* @Fields createdate : 更新时间
	*/
	private java.util.Date createdate;
	/** 
	* @Fields saleschannelname : 大渠道
	*/
	private String saleschannelname;
	/** 
	* @Fields xsaleschannelname : 小渠道
	*/
	private String xsaleschannelname;
	/** 
	* @Fields parentorgid : 客户id
	*/
	private Integer parentorgid;
	/** 
	* @Fields parentorgcode : 客户编码
	*/
	private String parentorgcode;
	/** 
	* @Fields parentorgname : 客户名称
	*/
	private String parentorgname;
	/** 
	* @Fields bgorgid : bgorgid
	*/
	private Integer bgorgid;
	/** 
	* @Fields goodsName : 产品型号
	*/
	private String goodsName;
	/** 
	* @Fields manageorgcode : 管理客户编码
	*/
	private String manageorgcode;
	/** 
	* @Fields priceAdd : 匹配供价
	*/
	private Integer priceAdd;
	/** 
	* @Fields pricetype : 供价类型
	*/
	private String pricetype;
	/** 
	* @Fields createdDate : 创建时间
	*/
	private java.util.Date createdDate;
	/** 
	* @Fields lastModifiedDate : 最后修改时间
	*/
	private java.util.Date lastModifiedDate;
	/** 
	* @Fields loadBatch : 装载批次
	*/
	private String loadBatch;
	/** 
	* @Fields hyFlag : 是否会员
	*/
	private String hyFlag;
	/** 
	* @Fields empcode : 导购员
	*/
	private String empcode;
	/** 
	* @Fields fpnum : 发票号
	*/
	private String fpnum;
	/** 
	* @Fields barcode : 条码
	*/
	private String barcode;
	/** 
	* @Fields price : 价格
	*/
	private String price;
	/** 
	* @Fields yhname : 顾客姓名
	*/
	private String yhname;
	/** 
	* @Fields yhphone : 顾客电话
	*/
	private String yhphone;
	/** 
	* @Fields shaddress : 送货地址
	*/
	private String shaddress;
	/** 
	* @Fields hishfresult : 回访结果
	*/
	private String hishfresult;
	/** 
	* @Fields present : 礼品
	*/
	private String present;
	/** 
	* @Fields isPrototype : 是否样机
	*/
	private String isPrototype;
	/** 
	* @Fields remark : 备注,本系统中添加的字段，预留以存储一些信息。在同步数据时对方数据库中没有对应的字段
	*/
	private String remark;
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * 属性 rowId 的get方法 
	 * @return id
	 */
	public String getRowId() {
		return this.rowId;
	}
	/**
	 * 属性 rowId 的set方法 
	 * @param id 
	 */
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}
	/**
	 * 属性 tradeId 的get方法 
	 * @return id
	 */
	public String getTradeId() {
		return this.tradeId;
	}
	/**
	 * 属性 tradeId 的set方法 
	 * @param id 
	 */
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	/**
	 * 属性 shopId 的get方法 
	 * @return id
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * 属性 shopId 的set方法 
	 * @param id 
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	/**
	 * 属性 shopName 的get方法 
	 * @return id
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * 属性 shopName 的set方法 
	 * @param id 
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * 属性 prolineId 的get方法 
	 * @return id
	 */
	public String getProlineId() {
		return this.prolineId;
	}
	/**
	 * 属性 prolineId 的set方法 
	 * @param id 
	 */
	public void setProlineId(String prolineId) {
		this.prolineId = prolineId;
	}
	/**
	 * 属性 productId 的get方法 
	 * @return id
	 */
	public String getProductId() {
		return this.productId;
	}
	/**
	 * 属性 productId 的set方法 
	 * @param id 
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * 属性 salesMonth 的get方法 
	 * @return id
	 */
	public java.util.Date getSalesMonth() {
		return this.salesMonth;
	}
	/**
	 * 属性 salesMonth 的set方法 
	 * @param id 
	 */
	public void setSalesMonth(java.util.Date salesMonth) {
		this.salesMonth = salesMonth;
	}
	/**
	 * 属性 salesNum 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getSalesNum() {
		return this.salesNum;
	}
	/**
	 * 属性 salesNum 的set方法 
	 * @param id 
	 */
	public void setSalesNum(java.math.BigDecimal salesNum) {
		this.salesNum = salesNum;
	}
	/**
	 * 属性 salesPrice 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getSalesPrice() {
		return this.salesPrice;
	}
	/**
	 * 属性 salesPrice 的set方法 
	 * @param id 
	 */
	public void setSalesPrice(java.math.BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}
	/**
	 * 属性 sourcetype 的get方法 
	 * @return id
	 */
	public Integer getSourcetype() {
		return this.sourcetype;
	}
	/**
	 * 属性 sourcetype 的set方法 
	 * @param id 
	 */
	public void setSourcetype(Integer sourcetype) {
		this.sourcetype = sourcetype;
	}
	/**
	 * 属性 createdate 的get方法 
	 * @return id
	 */
	public java.util.Date getCreatedate() {
		return this.createdate;
	}
	/**
	 * 属性 createdate 的set方法 
	 * @param id 
	 */
	public void setCreatedate(java.util.Date createdate) {
		this.createdate = createdate;
	}
	/**
	 * 属性 saleschannelname 的get方法 
	 * @return id
	 */
	public String getSaleschannelname() {
		return this.saleschannelname;
	}
	/**
	 * 属性 saleschannelname 的set方法 
	 * @param id 
	 */
	public void setSaleschannelname(String saleschannelname) {
		this.saleschannelname = saleschannelname;
	}
	/**
	 * 属性 xsaleschannelname 的get方法 
	 * @return id
	 */
	public String getXsaleschannelname() {
		return this.xsaleschannelname;
	}
	/**
	 * 属性 xsaleschannelname 的set方法 
	 * @param id 
	 */
	public void setXsaleschannelname(String xsaleschannelname) {
		this.xsaleschannelname = xsaleschannelname;
	}
	/**
	 * 属性 parentorgid 的get方法 
	 * @return id
	 */
	public Integer getParentorgid() {
		return this.parentorgid;
	}
	/**
	 * 属性 parentorgid 的set方法 
	 * @param id 
	 */
	public void setParentorgid(Integer parentorgid) {
		this.parentorgid = parentorgid;
	}
	/**
	 * 属性 parentorgcode 的get方法 
	 * @return id
	 */
	public String getParentorgcode() {
		return this.parentorgcode;
	}
	/**
	 * 属性 parentorgcode 的set方法 
	 * @param id 
	 */
	public void setParentorgcode(String parentorgcode) {
		this.parentorgcode = parentorgcode;
	}
	/**
	 * 属性 parentorgname 的get方法 
	 * @return id
	 */
	public String getParentorgname() {
		return this.parentorgname;
	}
	/**
	 * 属性 parentorgname 的set方法 
	 * @param id 
	 */
	public void setParentorgname(String parentorgname) {
		this.parentorgname = parentorgname;
	}
	/**
	 * 属性 bgorgid 的get方法 
	 * @return id
	 */
	public Integer getBgorgid() {
		return this.bgorgid;
	}
	/**
	 * 属性 bgorgid 的set方法 
	 * @param id 
	 */
	public void setBgorgid(Integer bgorgid) {
		this.bgorgid = bgorgid;
	}
	/**
	 * 属性 goodsName 的get方法 
	 * @return id
	 */
	public String getGoodsName() {
		return this.goodsName;
	}
	/**
	 * 属性 goodsName 的set方法 
	 * @param id 
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * 属性 manageorgcode 的get方法 
	 * @return id
	 */
	public String getManageorgcode() {
		return this.manageorgcode;
	}
	/**
	 * 属性 manageorgcode 的set方法 
	 * @param id 
	 */
	public void setManageorgcode(String manageorgcode) {
		this.manageorgcode = manageorgcode;
	}
	/**
	 * 属性 priceAdd 的get方法 
	 * @return id
	 */
	public Integer getPriceAdd() {
		return this.priceAdd;
	}
	/**
	 * 属性 priceAdd 的set方法 
	 * @param id 
	 */
	public void setPriceAdd(Integer priceAdd) {
		this.priceAdd = priceAdd;
	}
	/**
	 * 属性 pricetype 的get方法 
	 * @return id
	 */
	public String getPricetype() {
		return this.pricetype;
	}
	/**
	 * 属性 pricetype 的set方法 
	 * @param id 
	 */
	public void setPricetype(String pricetype) {
		this.pricetype = pricetype;
	}
	/**
	 * 属性 createdDate 的get方法 
	 * @return id
	 */
	public java.util.Date getCreatedDate() {
		return this.createdDate;
	}
	/**
	 * 属性 createdDate 的set方法 
	 * @param id 
	 */
	public void setCreatedDate(java.util.Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * 属性 lastModifiedDate 的get方法 
	 * @return id
	 */
	public java.util.Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}
	/**
	 * 属性 lastModifiedDate 的set方法 
	 * @param id 
	 */
	public void setLastModifiedDate(java.util.Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	/**
	 * 属性 loadBatch 的get方法 
	 * @return id
	 */
	public String getLoadBatch() {
		return this.loadBatch;
	}
	/**
	 * 属性 loadBatch 的set方法 
	 * @param id 
	 */
	public void setLoadBatch(String loadBatch) {
		this.loadBatch = loadBatch;
	}
	/**
	 * 属性 hyFlag 的get方法 
	 * @return id
	 */
	public String getHyFlag() {
		return this.hyFlag;
	}
	/**
	 * 属性 hyFlag 的set方法 
	 * @param id 
	 */
	public void setHyFlag(String hyFlag) {
		this.hyFlag = hyFlag;
	}
	/**
	 * 属性 empcode 的get方法 
	 * @return id
	 */
	public String getEmpcode() {
		return this.empcode;
	}
	/**
	 * 属性 empcode 的set方法 
	 * @param id 
	 */
	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}
	/**
	 * 属性 fpnum 的get方法 
	 * @return id
	 */
	public String getFpnum() {
		return this.fpnum;
	}
	/**
	 * 属性 fpnum 的set方法 
	 * @param id 
	 */
	public void setFpnum(String fpnum) {
		this.fpnum = fpnum;
	}
	/**
	 * 属性 barcode 的get方法 
	 * @return id
	 */
	public String getBarcode() {
		return this.barcode;
	}
	/**
	 * 属性 barcode 的set方法 
	 * @param id 
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	/**
	 * 属性 price 的get方法 
	 * @return id
	 */
	public String getPrice() {
		return this.price;
	}
	/**
	 * 属性 price 的set方法 
	 * @param id 
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * 属性 yhname 的get方法 
	 * @return id
	 */
	public String getYhname() {
		return this.yhname;
	}
	/**
	 * 属性 yhname 的set方法 
	 * @param id 
	 */
	public void setYhname(String yhname) {
		this.yhname = yhname;
	}
	/**
	 * 属性 yhphone 的get方法 
	 * @return id
	 */
	public String getYhphone() {
		return this.yhphone;
	}
	/**
	 * 属性 yhphone 的set方法 
	 * @param id 
	 */
	public void setYhphone(String yhphone) {
		this.yhphone = yhphone;
	}
	/**
	 * 属性 shaddress 的get方法 
	 * @return id
	 */
	public String getShaddress() {
		return this.shaddress;
	}
	/**
	 * 属性 shaddress 的set方法 
	 * @param id 
	 */
	public void setShaddress(String shaddress) {
		this.shaddress = shaddress;
	}
	/**
	 * 属性 hishfresult 的get方法 
	 * @return id
	 */
	public String getHishfresult() {
		return this.hishfresult;
	}
	/**
	 * 属性 hishfresult 的set方法 
	 * @param id 
	 */
	public void setHishfresult(String hishfresult) {
		this.hishfresult = hishfresult;
	}
	/**
	 * 属性 present 的get方法 
	 * @return id
	 */
	public String getPresent() {
		return this.present;
	}
	/**
	 * 属性 present 的set方法 
	 * @param id 
	 */
	public void setPresent(String present) {
		this.present = present;
	}
	/**
	 * 属性 isPrototype 的get方法 
	 * @return id
	 */
	public String getIsPrototype() {
		return this.isPrototype;
	}
	/**
	 * 属性 isPrototype 的set方法 
	 * @param id 
	 */
	public void setIsPrototype(String isPrototype) {
		this.isPrototype = isPrototype;
	}
	/**
	 * 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: RetailDomain 自动生成的hashcode方法</p> 
	* @author John.zhao   
	* @date 2014年12月22日  14:41:06
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((rowId == null) ? 0 : rowId.hashCode());
		return result;
	}
	/**
	* <p>Description:RetailDomain 自动生成的equals方法 </p> 
	* @author John.zhao   
	* @date 2014年12月22日  14:41:06
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		RetailDomain other =(RetailDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (rowId == null) {if (other.rowId != null){ return false;} else if (!rowId.equals(other.rowId)){ return false;}}
		*/
		if (rowId == null) {
			if (other.rowId != null){ 
				return false;
			}
		}else if (!rowId.equals(other.rowId)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:RetailDomain 自动生成的toString方法 </p> 
	* @author John.zhao   
	* @date 2014年12月22日  14:41:06 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "RetailDomain [" +
					"rowId=" + rowId + "," + 
					"tradeId=" + tradeId + "," + 
					"shopId=" + shopId + "," + 
					"shopName=" + shopName + "," + 
					"prolineId=" + prolineId + "," + 
					"productId=" + productId + "," + 
					"salesMonth=" + salesMonth + "," + 
					"salesNum=" + salesNum + "," + 
					"salesPrice=" + salesPrice + "," + 
					"sourcetype=" + sourcetype + "," + 
					"createdate=" + createdate + "," + 
					"saleschannelname=" + saleschannelname + "," + 
					"xsaleschannelname=" + xsaleschannelname + "," + 
					"parentorgid=" + parentorgid + "," + 
					"parentorgcode=" + parentorgcode + "," + 
					"parentorgname=" + parentorgname + "," + 
					"bgorgid=" + bgorgid + "," + 
					"goodsName=" + goodsName + "," + 
					"manageorgcode=" + manageorgcode + "," + 
					"priceAdd=" + priceAdd + "," + 
					"pricetype=" + pricetype + "," + 
					"createdDate=" + createdDate + "," + 
					"lastModifiedDate=" + lastModifiedDate + "," + 
					"loadBatch=" + loadBatch + "," + 
					"hyFlag=" + hyFlag + "," + 
					"empcode=" + empcode + "," + 
					"fpnum=" + fpnum + "," + 
					"barcode=" + barcode + "," + 
					"price=" + price + "," + 
					"yhname=" + yhname + "," + 
					"yhphone=" + yhphone + "," + 
					"shaddress=" + shaddress + "," + 
					"hishfresult=" + hishfresult + "," + 
					"present=" + present + "," + 
					"isPrototype=" + isPrototype + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
