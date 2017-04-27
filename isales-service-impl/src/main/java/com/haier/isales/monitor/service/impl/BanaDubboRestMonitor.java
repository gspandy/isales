/**
* @Company 青鸟软通   
* @Title: BanaDubboRestMonitor.java 
* @Package org.bana.common.util.monitor.impl 
* @author Liu Wenjie   
* @date 2014-12-5 下午1:45:12 
* @version V1.0   
*/ 
package com.haier.isales.monitor.service.impl;



import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.haier.isales.monitor.service.BanaDubboMonitorResult;
import com.haier.isales.monitor.service.BanaStatusMonitor;

/** 
 * @ClassName: BanaDubboRestMonitor 
 * @Description: 发布的dubbo状态的监控机制
 *  
 */
@Path("monitor")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})//参数类型
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})//返回值类型
public class BanaDubboRestMonitor implements BanaStatusMonitor{

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-12-5 下午1:45:46 
	* @return 
	* @see org.bana.common.util.monitor.BanaStatusMonitor#checkStatus() 
	*/ 
	@Override
	@Path("checkStatus")
	@GET
	public BanaDubboMonitorResult checkStatus() {
		//获取request的方法
		//RpcContext rpc = RpcContext.getContext();
		BanaDubboMonitorResult result = new BanaDubboMonitorResult();
		result.setMessage("OK");
		result.setResult("success");
		return result;
	}

}
