/**
* @Company 青鸟软通   
* @Title: ReportSalesServiceClientImplTest.java 
* @Package com.haier.isales.retail.reportsales.service.impl 
* @author John Zhao   
* @date 2014-11-12 下午3:11:52 
* @version V1.0   
*/ 
package com.haier.isales.retail.reportsales.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.haier.isales.retail.reportsales.dto.ReportSalesDTO;
import com.haier.isales.retail.reportsales.service.ReportSalesServiceClient;
import com.haier.isales.retail.searchsales.dto.SearchModelSalesDTO;
import com.haier.isales.retail.searchsales.service.SearchSalesServiceClient;
import com.haier.openplatform.showcase.security.service.impl.BaseTestCase;

/** 
 * @ClassName: ReportSalesServiceClientImplTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ReportSalesServiceClientImplTest extends BaseTestCase{
	@Resource
	private ReportSalesServiceClient reportSalesServiceClient;
	@Resource
	private SearchSalesServiceClient searchSalesServiceClient;
	
	@Test
	public void testReportSalesByModel(){
		String ygid = "Z0175868";
		String gjtime = "2014-02-20";
		String product = "CB0K30B0M";
		String hyzc = "HY_1";
		String counts = "1";
		String newprice = "2600";
		String isyj = "Y";
		String yhname = "易招娣";
		String yhphone = "13570901725";
		String shaddress = "广东省广州市白云区黄石东路江夏小学附近";
		String hishfresult = "无";
		String haiermail = "";
		String qykid = "111111111";
		String lrfs = "111";
		String remark = "今天天气好好啊 ！！！";
		ReportSalesDTO reportsalesDomain = new ReportSalesDTO();
		reportsalesDomain.setYgid(ygid);
		reportsalesDomain.setGjtime(gjtime);
		reportsalesDomain.setProduct(product);
		reportsalesDomain.setHyzc(hyzc);
		reportsalesDomain.setCounts(counts);
		reportsalesDomain.setNewprice(newprice);
		reportsalesDomain.setIsyj(isyj);
		reportsalesDomain.setYhname(yhname);
		reportsalesDomain.setYhphone(yhphone);
		reportsalesDomain.setShaddress(shaddress);
		reportsalesDomain.setHishfresult(hishfresult);
		reportsalesDomain.setHaiermail(haiermail);
		reportsalesDomain.setQykid(qykid);
		reportsalesDomain.setLrfs(lrfs);
		reportsalesDomain.setRemark(remark);
		Object a = reportSalesServiceClient.reportSalesByModel(reportsalesDomain);
		System.out.println(a);
	} 
	@Test
	public void testSearchModelSales(){
		SearchModelSalesDTO searchModelSalesDTO = new SearchModelSalesDTO();
		searchModelSalesDTO.setYgId("Z0175868");
		searchModelSalesDTO.setStart(0);
		searchModelSalesDTO.setLimit(10);
		List<ReportSalesDTO> list = (List<ReportSalesDTO>) searchSalesServiceClient.searchModelSales(searchModelSalesDTO);
		for(ReportSalesDTO s : list){
			System.out.println(s);
		}
	}

}
