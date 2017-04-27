/**
 * @Company 青鸟软通   
 * @Title: SearchModelSalesDTO.java 
 * @Package com.haier.isales.retail.searchsales.dto 
 * @author John Zhao   
 * @date 2014-11-17 上午11:26:56 
 * @version V1.0   
 */
package com.haier.isales.retail.searchsales.dto;

import java.io.Serializable;

/**
 * @ClassName: SearchModelSalesDTO
 * @Description: 按照型号提报的销量数据查询
 * 
 */
public class SearchModelSalesDTO implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -4663922661422578756L;

	/**
	 * @Fields startTime : 开始时间
	 */
	private String startTime;

	/**
	 * @Fields endTime : 结束时间
	 */
	private String endTime;

	/**
	 * @Fields start : TODO(用一句话描述这个变量表示什么)
	 */
	private int start;

	/**
	 * @Fields limit : TODO(用一句话描述这个变量表示什么)
	 */
	private int limit;

	/**
	 * @Fields sjcjlsId : ID
	 */
	private String sjcjlsId;

	/**
	 * @Fields ygId : 员工号
	 */
	private String ygId;
	/**
	 * @Fields ygName : 员工姓名
	 */
	private String ygName;
	/**
	 * @Fields fzxId :分中心ID
	 */
	private String fzxId;
	/**
	 * @Fields fzxName : 分中心名称
	 */
	private String fzxName;
	/**
	 * @Fields mdId : 门店ID
	 */
	private String mdId;
	/**
	 * @Fields mdName : 门店名称
	 */
	private String mdName;
	/**
	 * @Fields gjtime : 购机日期（格式：2013-07-24）
	 */
	private String gjtime;
	/**
	 * @Fields cpzNO : 产品组编号
	 */
	private String cpzNO;
	/**
	 * @Fields cpzMC : 产品组名称
	 */
	private String cpzMC;
	/**
	 * @Fields product : 产品型号编码
	 */
	private String product;
	/**
	 * @Fields productType : 产品型号
	 */
	private String productType;
	/**
	 * @Fields counts : 产品数量
	 */
	private String counts;
	/**
	 * @Fields fpnum :发票号
	 */
	private String fpnum;
	/**
	 * @Fields price : 零售价
	 */
	private String price;
	/**
	 * @Fields newprice : 销售价格
	 */
	private String newprice;
	/**
	 * @Fields isyj : 是否样机
	 */
	private String isyj;
	/**
	 * @Fields yhname : 用户姓名
	 */
	private String yhname;
	/**
	 * @Fields yhphone : 电话
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
	 * @Fields hyzc : 会员信息
	 */
	private String hyzc;
	/**
	 * @Fields lrfs : 录入方式
	 */
	private String lrfs;
	/**
	 * @Fields sflr : 是否录入
	 */
	private String sflr;
	/**
	 * @Fields nfxg : 能否修改
	 */
	private String nfxg;
	/**
	 * @Fields status : 状态是否有效
	 */
	private String status;
	/**
	 * @Fields qykId : 权益卡号
	 */
	private String qykId;
	/**
	 * @Fields haierMail : 海尔邮件
	 */
	private String haierMail;
	/**
	 * @Fields pageCount : 分页数
	 */
	private int pageCount;
	/** 
	* @Fields remark : 备注 
	*/ 
	private String remark;
	
	/*=================getters & setters==================*/
	/**
	 * @Description: 属性 startTime 的get方法 
	 * @return startTime
	 */
	public String getStartTime() {
		return startTime;
	}
	/**
	 * @Description: 属性 startTime 的set方法 
	 * @param startTime 
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	/**
	 * @Description: 属性 endTime 的get方法 
	 * @return endTime
	 */
	public String getEndTime() {
		return endTime;
	}
	/**
	 * @Description: 属性 endTime 的set方法 
	 * @param endTime 
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	/**
	 * @Description: 属性 start 的get方法 
	 * @return start
	 */
	public int getStart() {
		return start;
	}
	/**
	 * @Description: 属性 start 的set方法 
	 * @param start 
	 */
	public void setStart(int start) {
		this.start = start;
	}
	/**
	 * @Description: 属性 limit 的get方法 
	 * @return limit
	 */
	public int getLimit() {
		return limit;
	}
	/**
	 * @Description: 属性 limit 的set方法 
	 * @param limit 
	 */
	public void setLimit(int limit) {
		this.limit = limit;
	}
	/**
	 * @Description: 属性 sjcjlsId 的get方法 
	 * @return sjcjlsId
	 */
	public String getSjcjlsId() {
		return sjcjlsId;
	}
	/**
	 * @Description: 属性 sjcjlsId 的set方法 
	 * @param sjcjlsId 
	 */
	public void setSjcjlsId(String sjcjlsId) {
		this.sjcjlsId = sjcjlsId;
	}
	/**
	 * @Description: 属性 ygId 的get方法 
	 * @return ygId
	 */
	public String getYgId() {
		return ygId;
	}
	/**
	 * @Description: 属性 ygId 的set方法 
	 * @param ygId 
	 */
	public void setYgId(String ygId) {
		this.ygId = ygId;
	}
	/**
	 * @Description: 属性 ygName 的get方法 
	 * @return ygName
	 */
	public String getYgName() {
		return ygName;
	}
	/**
	 * @Description: 属性 ygName 的set方法 
	 * @param ygName 
	 */
	public void setYgName(String ygName) {
		this.ygName = ygName;
	}
	/**
	 * @Description: 属性 fzxId 的get方法 
	 * @return fzxId
	 */
	public String getFzxId() {
		return fzxId;
	}
	/**
	 * @Description: 属性 fzxId 的set方法 
	 * @param fzxId 
	 */
	public void setFzxId(String fzxId) {
		this.fzxId = fzxId;
	}
	/**
	 * @Description: 属性 fzxName 的get方法 
	 * @return fzxName
	 */
	public String getFzxName() {
		return fzxName;
	}
	/**
	 * @Description: 属性 fzxName 的set方法 
	 * @param fzxName 
	 */
	public void setFzxName(String fzxName) {
		this.fzxName = fzxName;
	}
	/**
	 * @Description: 属性 mdId 的get方法 
	 * @return mdId
	 */
	public String getMdId() {
		return mdId;
	}
	/**
	 * @Description: 属性 mdId 的set方法 
	 * @param mdId 
	 */
	public void setMdId(String mdId) {
		this.mdId = mdId;
	}
	/**
	 * @Description: 属性 mdName 的get方法 
	 * @return mdName
	 */
	public String getMdName() {
		return mdName;
	}
	/**
	 * @Description: 属性 mdName 的set方法 
	 * @param mdName 
	 */
	public void setMdName(String mdName) {
		this.mdName = mdName;
	}
	/**
	 * @Description: 属性 gjtime 的get方法 
	 * @return gjtime
	 */
	public String getGjtime() {
		return gjtime;
	}
	/**
	 * @Description: 属性 gjtime 的set方法 
	 * @param gjtime 
	 */
	public void setGjtime(String gjtime) {
		this.gjtime = gjtime;
	}
	/**
	 * @Description: 属性 cpzNO 的get方法 
	 * @return cpzNO
	 */
	public String getCpzNO() {
		return cpzNO;
	}
	/**
	 * @Description: 属性 cpzNO 的set方法 
	 * @param cpzNO 
	 */
	public void setCpzNO(String cpzNO) {
		this.cpzNO = cpzNO;
	}
	/**
	 * @Description: 属性 cpzMC 的get方法 
	 * @return cpzMC
	 */
	public String getCpzMC() {
		return cpzMC;
	}
	/**
	 * @Description: 属性 cpzMC 的set方法 
	 * @param cpzMC 
	 */
	public void setCpzMC(String cpzMC) {
		this.cpzMC = cpzMC;
	}
	/**
	 * @Description: 属性 product 的get方法 
	 * @return product
	 */
	public String getProduct() {
		return product;
	}
	/**
	 * @Description: 属性 product 的set方法 
	 * @param product 
	 */
	public void setProduct(String product) {
		this.product = product;
	}
	/**
	 * @Description: 属性 productType 的get方法 
	 * @return productType
	 */
	public String getProductType() {
		return productType;
	}
	/**
	 * @Description: 属性 productType 的set方法 
	 * @param productType 
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}
	/**
	 * @Description: 属性 counts 的get方法 
	 * @return counts
	 */
	public String getCounts() {
		return counts;
	}
	/**
	 * @Description: 属性 counts 的set方法 
	 * @param counts 
	 */
	public void setCounts(String counts) {
		this.counts = counts;
	}
	/**
	 * @Description: 属性 fpnum 的get方法 
	 * @return fpnum
	 */
	public String getFpnum() {
		return fpnum;
	}
	/**
	 * @Description: 属性 fpnum 的set方法 
	 * @param fpnum 
	 */
	public void setFpnum(String fpnum) {
		this.fpnum = fpnum;
	}
	/**
	 * @Description: 属性 price 的get方法 
	 * @return price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @Description: 属性 price 的set方法 
	 * @param price 
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @Description: 属性 newprice 的get方法 
	 * @return newprice
	 */
	public String getNewprice() {
		return newprice;
	}
	/**
	 * @Description: 属性 newprice 的set方法 
	 * @param newprice 
	 */
	public void setNewprice(String newprice) {
		this.newprice = newprice;
	}
	/**
	 * @Description: 属性 isyj 的get方法 
	 * @return isyj
	 */
	public String getIsyj() {
		return isyj;
	}
	/**
	 * @Description: 属性 isyj 的set方法 
	 * @param isyj 
	 */
	public void setIsyj(String isyj) {
		this.isyj = isyj;
	}
	/**
	 * @Description: 属性 yhname 的get方法 
	 * @return yhname
	 */
	public String getYhname() {
		return yhname;
	}
	/**
	 * @Description: 属性 yhname 的set方法 
	 * @param yhname 
	 */
	public void setYhname(String yhname) {
		this.yhname = yhname;
	}
	/**
	 * @Description: 属性 yhphone 的get方法 
	 * @return yhphone
	 */
	public String getYhphone() {
		return yhphone;
	}
	/**
	 * @Description: 属性 yhphone 的set方法 
	 * @param yhphone 
	 */
	public void setYhphone(String yhphone) {
		this.yhphone = yhphone;
	}
	/**
	 * @Description: 属性 shaddress 的get方法 
	 * @return shaddress
	 */
	public String getShaddress() {
		return shaddress;
	}
	/**
	 * @Description: 属性 shaddress 的set方法 
	 * @param shaddress 
	 */
	public void setShaddress(String shaddress) {
		this.shaddress = shaddress;
	}
	/**
	 * @Description: 属性 hishfresult 的get方法 
	 * @return hishfresult
	 */
	public String getHishfresult() {
		return hishfresult;
	}
	/**
	 * @Description: 属性 hishfresult 的set方法 
	 * @param hishfresult 
	 */
	public void setHishfresult(String hishfresult) {
		this.hishfresult = hishfresult;
	}
	/**
	 * @Description: 属性 hyzc 的get方法 
	 * @return hyzc
	 */
	public String getHyzc() {
		return hyzc;
	}
	/**
	 * @Description: 属性 hyzc 的set方法 
	 * @param hyzc 
	 */
	public void setHyzc(String hyzc) {
		this.hyzc = hyzc;
	}
	/**
	 * @Description: 属性 lrfs 的get方法 
	 * @return lrfs
	 */
	public String getLrfs() {
		return lrfs;
	}
	/**
	 * @Description: 属性 lrfs 的set方法 
	 * @param lrfs 
	 */
	public void setLrfs(String lrfs) {
		this.lrfs = lrfs;
	}
	/**
	 * @Description: 属性 sflr 的get方法 
	 * @return sflr
	 */
	public String getSflr() {
		return sflr;
	}
	/**
	 * @Description: 属性 sflr 的set方法 
	 * @param sflr 
	 */
	public void setSflr(String sflr) {
		this.sflr = sflr;
	}
	/**
	 * @Description: 属性 nfxg 的get方法 
	 * @return nfxg
	 */
	public String getNfxg() {
		return nfxg;
	}
	/**
	 * @Description: 属性 nfxg 的set方法 
	 * @param nfxg 
	 */
	public void setNfxg(String nfxg) {
		this.nfxg = nfxg;
	}
	/**
	 * @Description: 属性 status 的get方法 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @Description: 属性 status 的set方法 
	 * @param status 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @Description: 属性 qykId 的get方法 
	 * @return qykId
	 */
	public String getQykId() {
		return qykId;
	}
	/**
	 * @Description: 属性 qykId 的set方法 
	 * @param qykId 
	 */
	public void setQykId(String qykId) {
		this.qykId = qykId;
	}
	/**
	 * @Description: 属性 haierMail 的get方法 
	 * @return haierMail
	 */
	public String getHaierMail() {
		return haierMail;
	}
	/**
	 * @Description: 属性 haierMail 的set方法 
	 * @param haierMail 
	 */
	public void setHaierMail(String haierMail) {
		this.haierMail = haierMail;
	}
	/**
	 * @Description: 属性 pageCount 的get方法 
	 * @return pageCount
	 */
	public int getPageCount() {
		return pageCount;
	}
	/**
	 * @Description: 属性 pageCount 的set方法 
	 * @param pageCount 
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	/**
	 * @Description: 属性 remark 的get方法 
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @Description: 属性 remark 的set方法 
	 * @param remark 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/*================toString==================*/
	/**
	* <p>Description:SearchModelSalesDTO自动生成的toString方法 </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:10:47 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "SearchModelSalesDTO [startTime=" + startTime + ", endTime="
				+ endTime + ", start=" + start + ", limit=" + limit
				+ ", sjcjlsId=" + sjcjlsId + ", ygId=" + ygId + ", ygName="
				+ ygName + ", fzxId=" + fzxId + ", fzxName=" + fzxName
				+ ", mdId=" + mdId + ", mdName=" + mdName + ", gjtime="
				+ gjtime + ", cpzNO=" + cpzNO + ", cpzMC=" + cpzMC
				+ ", product=" + product + ", productType=" + productType
				+ ", counts=" + counts + ", fpnum=" + fpnum + ", price="
				+ price + ", newprice=" + newprice + ", isyj=" + isyj
				+ ", yhname=" + yhname + ", yhphone=" + yhphone
				+ ", shaddress=" + shaddress + ", hishfresult=" + hishfresult
				+ ", hyzc=" + hyzc + ", lrfs=" + lrfs + ", sflr=" + sflr
				+ ", nfxg=" + nfxg + ", status=" + status + ", qykId=" + qykId
				+ ", haierMail=" + haierMail + ", pageCount=" + pageCount
				+ ", remark=" + remark + "]";
	}

}
