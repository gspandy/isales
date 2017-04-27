/**
* @Company 青鸟软通   
* @Title: createBoData4Json.java 
* @Package com.haier.isales.app.dto 
* @author Guo  Yuchao   
* @date 2015-1-28 下午4:40:57 
* @version V1.0   
*/ 
package com.haier.isales.app.dto;

import java.io.Serializable;

/** 
 * @ClassName: createBoData4Json 
 * @Description: 
 *  
 */
public class CreateBoData4Json implements Serializable {

	private static final long serialVersionUID = -1596823390508571530L;
	
	private String tbr;  //	提报人	文本	单行	20
	private String tbrbh;  //提报人编号	文本	单行	10
	private String gm;  //	工贸	文本	单行	150	
	private String md;  //	门店	文本	单行	200	
	private String tradename;  //工贸名称
	private String wtdlmc;  //	需求大类名称	文本	单行	50
	private String wtxlmc;  //	需求小类名称	文本	单行	50
	private String wtsm	;  //需求内容	文本	多行	2000
	private String cpz	;  //产品组	文本	数据字典	100
	private String bu	;  //bu	文本	单行	100
	private String xsqd;  //	渠道	文本	列表	20	
	
	private String cldz;  //	处理动作	文本	单行	30	
	private String htype;  //	平台类型	文本	单行	50	
	private String tbsj	;  //提报时间	日期	日期时间	0
	private String jc	;  //级次	数值	数值	2
	private String wtbt	;  //需求标题	文本	单行	100
	
	private String yqjjsj	;  //要求解决时间	日期	日期	0
	private String sjjjsj	;  //实际解决时间	日期	日期	0
	private String wtzt	;  //问题状态	文本	单行	20
	private String dqjdnr;  //	当前解答内容	文本	多行	2000
	private String yqyy	;  //延期原因	文本	单行	2000
	private String yqts	;  //延期天数	数值	数值	3
	private String wtjssj	;  //需求结束时间	日期	日期	0	
	private String sfyhd	;  //是否已回答	数值	数值	1	
	private String zfjsr;  //	转发接收人	文本	单行	10	
	private String zfjsrbh;  //	转发接受人编号	文本	单行	10	
	private String wtid;  //	问题id	文本	单行	20	
	private String hdid;  //	回答id	文本	单行	20	
	private String sfyq;  //	是否延期	数值	数值	1	
	private String sfmy;  //	是否满意	数值	数值	1	
	private String lxdh;  //	联系电话	文本	单行	100	
	private String email;  //	电子邮件	文本	单行	64	
	private String cs;  //	cs	数值	数值	10	
	private String qnums;  //	问题数量	文本	单行	20	
	private String anums;  //	提报人问题的数量	文本	单行	20	
	private String man;    //	转发人	文本	数据字典	100	
	private String manno;  //	转发接收人	文本	单行	50
	private String wtly;  //	WTLY问题来源
	

	public CreateBoData4Json() {
		super();
	}
	//================getters & setters===============
	/**
	 * @Description: 属性 tbr 的get方法 
	 * @return tbr
	 */
	public String getTbr() {
		return tbr;
	}

	/**
	 * @Description: 属性 tbr 的set方法 
	 * @param tbr 
	 */
	public void setTbr(String tbr) {
		this.tbr = tbr;
	}

	/**
	 * @Description: 属性 tbrbh 的get方法 
	 * @return tbrbh
	 */
	public String getTbrbh() {
		return tbrbh;
	}

	/**
	 * @Description: 属性 tbrbh 的set方法 
	 * @param tbrbh 
	 */
	public void setTbrbh(String tbrbh) {
		this.tbrbh = tbrbh;
	}

	/**
	 * @Description: 属性 gm 的get方法 
	 * @return gm
	 */
	public String getGm() {
		return gm;
	}

	/**
	 * @Description: 属性 gm 的set方法 
	 * @param gm 
	 */
	public void setGm(String gm) {
		this.gm = gm;
	}

	/**
	 * @Description: 属性 md 的get方法 
	 * @return md
	 */
	public String getMd() {
		return md;
	}

	/**
	 * @Description: 属性 md 的set方法 
	 * @param md 
	 */
	public void setMd(String md) {
		this.md = md;
	}

	/**
	 * @Description: 属性 tradename 的get方法 
	 * @return tradename
	 */
	public String getTradename() {
		return tradename;
	}

	/**
	 * @Description: 属性 tradename 的set方法 
	 * @param tradename 
	 */
	public void setTradename(String tradename) {
		this.tradename = tradename;
	}

	/**
	 * @Description: 属性 wtdlmc 的get方法 
	 * @return wtdlmc
	 */
	public String getWtdlmc() {
		return wtdlmc;
	}

	/**
	 * @Description: 属性 wtdlmc 的set方法 
	 * @param wtdlmc 
	 */
	public void setWtdlmc(String wtdlmc) {
		this.wtdlmc = wtdlmc;
	}

	/**
	 * @Description: 属性 wtxlmc 的get方法 
	 * @return wtxlmc
	 */
	public String getWtxlmc() {
		return wtxlmc;
	}

	/**
	 * @Description: 属性 wtxlmc 的set方法 
	 * @param wtxlmc 
	 */
	public void setWtxlmc(String wtxlmc) {
		this.wtxlmc = wtxlmc;
	}

	/**
	 * @Description: 属性 wtsm 的get方法 
	 * @return wtsm
	 */
	public String getWtsm() {
		return wtsm;
	}

	/**
	 * @Description: 属性 wtsm 的set方法 
	 * @param wtsm 
	 */
	public void setWtsm(String wtsm) {
		this.wtsm = wtsm;
	}

	/**
	 * @Description: 属性 cpz 的get方法 
	 * @return cpz
	 */
	public String getCpz() {
		return cpz;
	}

	/**
	 * @Description: 属性 cpz 的set方法 
	 * @param cpz 
	 */
	public void setCpz(String cpz) {
		this.cpz = cpz;
	}

	/**
	 * @Description: 属性 bu 的get方法 
	 * @return bu
	 */
	public String getBu() {
		return bu;
	}

	/**
	 * @Description: 属性 bu 的set方法 
	 * @param bu 
	 */
	public void setBu(String bu) {
		this.bu = bu;
	}

	/**
	 * @Description: 属性 xsqd 的get方法 
	 * @return xsqd
	 */
	public String getXsqd() {
		return xsqd;
	}

	/**
	 * @Description: 属性 xsqd 的set方法 
	 * @param xsqd 
	 */
	public void setXsqd(String xsqd) {
		this.xsqd = xsqd;
	}

	/**
	 * @Description: 属性 cldz 的get方法 
	 * @return cldz
	 */
	public String getCldz() {
		return cldz;
	}

	/**
	 * @Description: 属性 cldz 的set方法 
	 * @param cldz 
	 */
	public void setCldz(String cldz) {
		this.cldz = cldz;
	}

	/**
	 * @Description: 属性 htype 的get方法 
	 * @return htype
	 */
	public String getHtype() {
		return htype;
	}

	/**
	 * @Description: 属性 htype 的set方法 
	 * @param htype 
	 */
	public void setHtype(String htype) {
		this.htype = htype;
	}

	/**
	 * @Description: 属性 tbsj 的get方法 
	 * @return tbsj
	 */
	public String getTbsj() {
		return tbsj;
	}

	/**
	 * @Description: 属性 tbsj 的set方法 
	 * @param tbsj 
	 */
	public void setTbsj(String tbsj) {
		this.tbsj = tbsj;
	}

	/**
	 * @Description: 属性 jc 的get方法 
	 * @return jc
	 */
	public String getJc() {
		return jc;
	}

	/**
	 * @Description: 属性 jc 的set方法 
	 * @param jc 
	 */
	public void setJc(String jc) {
		this.jc = jc;
	}

	/**
	 * @Description: 属性 wtbt 的get方法 
	 * @return wtbt
	 */
	public String getWtbt() {
		return wtbt;
	}

	/**
	 * @Description: 属性 wtbt 的set方法 
	 * @param wtbt 
	 */
	public void setWtbt(String wtbt) {
		this.wtbt = wtbt;
	}

	/**
	 * @Description: 属性 yqjjsj 的get方法 
	 * @return yqjjsj
	 */
	public String getYqjjsj() {
		return yqjjsj;
	}

	/**
	 * @Description: 属性 yqjjsj 的set方法 
	 * @param yqjjsj 
	 */
	public void setYqjjsj(String yqjjsj) {
		this.yqjjsj = yqjjsj;
	}

	/**
	 * @Description: 属性 sjjjsj 的get方法 
	 * @return sjjjsj
	 */
	public String getSjjjsj() {
		return sjjjsj;
	}

	/**
	 * @Description: 属性 sjjjsj 的set方法 
	 * @param sjjjsj 
	 */
	public void setSjjjsj(String sjjjsj) {
		this.sjjjsj = sjjjsj;
	}

	/**
	 * @Description: 属性 wtzt 的get方法 
	 * @return wtzt
	 */
	public String getWtzt() {
		return wtzt;
	}

	/**
	 * @Description: 属性 wtzt 的set方法 
	 * @param wtzt 
	 */
	public void setWtzt(String wtzt) {
		this.wtzt = wtzt;
	}

	/**
	 * @Description: 属性 dqjdnr 的get方法 
	 * @return dqjdnr
	 */
	public String getDqjdnr() {
		return dqjdnr;
	}

	/**
	 * @Description: 属性 dqjdnr 的set方法 
	 * @param dqjdnr 
	 */
	public void setDqjdnr(String dqjdnr) {
		this.dqjdnr = dqjdnr;
	}

	/**
	 * @Description: 属性 yqyy 的get方法 
	 * @return yqyy
	 */
	public String getYqyy() {
		return yqyy;
	}

	/**
	 * @Description: 属性 yqyy 的set方法 
	 * @param yqyy 
	 */
	public void setYqyy(String yqyy) {
		this.yqyy = yqyy;
	}

	/**
	 * @Description: 属性 yqts 的get方法 
	 * @return yqts
	 */
	public String getYqts() {
		return yqts;
	}

	/**
	 * @Description: 属性 yqts 的set方法 
	 * @param yqts 
	 */
	public void setYqts(String yqts) {
		this.yqts = yqts;
	}

	/**
	 * @Description: 属性 wtjssj 的get方法 
	 * @return wtjssj
	 */
	public String getWtjssj() {
		return wtjssj;
	}

	/**
	 * @Description: 属性 wtjssj 的set方法 
	 * @param wtjssj 
	 */
	public void setWtjssj(String wtjssj) {
		this.wtjssj = wtjssj;
	}

	/**
	 * @Description: 属性 sfyhd 的get方法 
	 * @return sfyhd
	 */
	public String getSfyhd() {
		return sfyhd;
	}

	/**
	 * @Description: 属性 sfyhd 的set方法 
	 * @param sfyhd 
	 */
	public void setSfyhd(String sfyhd) {
		this.sfyhd = sfyhd;
	}

	/**
	 * @Description: 属性 zfjsr 的get方法 
	 * @return zfjsr
	 */
	public String getZfjsr() {
		return zfjsr;
	}

	/**
	 * @Description: 属性 zfjsr 的set方法 
	 * @param zfjsr 
	 */
	public void setZfjsr(String zfjsr) {
		this.zfjsr = zfjsr;
	}

	/**
	 * @Description: 属性 zfjsrbh 的get方法 
	 * @return zfjsrbh
	 */
	public String getZfjsrbh() {
		return zfjsrbh;
	}

	/**
	 * @Description: 属性 zfjsrbh 的set方法 
	 * @param zfjsrbh 
	 */
	public void setZfjsrbh(String zfjsrbh) {
		this.zfjsrbh = zfjsrbh;
	}

	/**
	 * @Description: 属性 wtid 的get方法 
	 * @return wtid
	 */
	public String getWtid() {
		return wtid;
	}

	/**
	 * @Description: 属性 wtid 的set方法 
	 * @param wtid 
	 */
	public void setWtid(String wtid) {
		this.wtid = wtid;
	}

	/**
	 * @Description: 属性 hdid 的get方法 
	 * @return hdid
	 */
	public String getHdid() {
		return hdid;
	}

	/**
	 * @Description: 属性 hdid 的set方法 
	 * @param hdid 
	 */
	public void setHdid(String hdid) {
		this.hdid = hdid;
	}

	/**
	 * @Description: 属性 sfyq 的get方法 
	 * @return sfyq
	 */
	public String getSfyq() {
		return sfyq;
	}

	/**
	 * @Description: 属性 sfyq 的set方法 
	 * @param sfyq 
	 */
	public void setSfyq(String sfyq) {
		this.sfyq = sfyq;
	}

	/**
	 * @Description: 属性 sfmy 的get方法 
	 * @return sfmy
	 */
	public String getSfmy() {
		return sfmy;
	}

	/**
	 * @Description: 属性 sfmy 的set方法 
	 * @param sfmy 
	 */
	public void setSfmy(String sfmy) {
		this.sfmy = sfmy;
	}

	/**
	 * @Description: 属性 lxdh 的get方法 
	 * @return lxdh
	 */
	public String getLxdh() {
		return lxdh;
	}

	/**
	 * @Description: 属性 lxdh 的set方法 
	 * @param lxdh 
	 */
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	/**
	 * @Description: 属性 email 的get方法 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @Description: 属性 email 的set方法 
	 * @param email 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @Description: 属性 cs 的get方法 
	 * @return cs
	 */
	public String getCs() {
		return cs;
	}

	/**
	 * @Description: 属性 cs 的set方法 
	 * @param cs 
	 */
	public void setCs(String cs) {
		this.cs = cs;
	}

	/**
	 * @Description: 属性 qnums 的get方法 
	 * @return qnums
	 */
	public String getQnums() {
		return qnums;
	}

	/**
	 * @Description: 属性 qnums 的set方法 
	 * @param qnums 
	 */
	public void setQnums(String qnums) {
		this.qnums = qnums;
	}

	/**
	 * @Description: 属性 anums 的get方法 
	 * @return anums
	 */
	public String getAnums() {
		return anums;
	}

	/**
	 * @Description: 属性 anums 的set方法 
	 * @param anums 
	 */
	public void setAnums(String anums) {
		this.anums = anums;
	}

	/**
	 * @Description: 属性 man 的get方法 
	 * @return man
	 */
	public String getMan() {
		return man;
	}

	/**
	 * @Description: 属性 man 的set方法 
	 * @param man 
	 */
	public void setMan(String man) {
		this.man = man;
	}

	/**
	 * @Description: 属性 manno 的get方法 
	 * @return manno
	 */
	public String getManno() {
		return manno;
	}

	/**
	 * @Description: 属性 manno 的set方法 
	 * @param manno 
	 */
	public void setManno(String manno) {
		this.manno = manno;
	}

	/**
	 * @Description: 属性 wtly 的get方法 
	 * @return wtly
	 */
	public String getWtly() {
		return wtly;
	}

	/**
	 * @Description: 属性 wtly 的set方法 
	 * @param wtly 
	 */
	public void setWtly(String wtly) {
		this.wtly = wtly;
	}
	
	//=============toString======================
	/**
	* <p>Description: CreateBoData4Json自动生成的toString方法</p> 
	* @author John zhao   
	* @date 2015-5-11 下午2:32:27 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "CreateBoData4Json [tbr=" + tbr + ", tbrbh=" + tbrbh + ", gm="
				+ gm + ", md=" + md + ", tradename=" + tradename + ", wtdlmc="
				+ wtdlmc + ", wtxlmc=" + wtxlmc + ", wtsm=" + wtsm + ", cpz="
				+ cpz + ", bu=" + bu + ", xsqd=" + xsqd + ", cldz=" + cldz
				+ ", htype=" + htype + ", tbsj=" + tbsj + ", jc=" + jc
				+ ", wtbt=" + wtbt + ", yqjjsj=" + yqjjsj + ", sjjjsj="
				+ sjjjsj + ", wtzt=" + wtzt + ", dqjdnr=" + dqjdnr + ", yqyy="
				+ yqyy + ", yqts=" + yqts + ", wtjssj=" + wtjssj + ", sfyhd="
				+ sfyhd + ", zfjsr=" + zfjsr + ", zfjsrbh=" + zfjsrbh
				+ ", wtid=" + wtid + ", hdid=" + hdid + ", sfyq=" + sfyq
				+ ", sfmy=" + sfmy + ", lxdh=" + lxdh + ", email=" + email
				+ ", cs=" + cs + ", qnums=" + qnums + ", anums=" + anums
				+ ", man=" + man + ", manno=" + manno + ", wtly=" + wtly + "]";
	}

}
