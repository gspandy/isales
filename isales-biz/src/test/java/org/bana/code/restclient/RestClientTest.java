/**
* @Company 青鸟软通   
* @Title: RestClientTest.java 
* @Package org.bana.common.util.ws 
* @author Liu Wenjie   
* @date 2015-1-26 上午11:29:55 
* @version V1.0   
*/ 
package org.bana.code.restclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;

import org.bana.common.util.http.RestClient;
import org.junit.Test;

/** 
 * @ClassName: RestClientTest 
 * @Description: 测试restClient的使用方法
 *  
 */
public class RestClientTest {

	/**
	 * Test method for {@link org.bana.common.util.http.RestClient#post(java.lang.String, java.util.Map)}.
	 * @throws IOException 
	 */
	@Test
	public void testPost() throws IOException {
		String url = "http://iyx.haier.net/app/a/login";
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("username", "admin");
		params.put("password", "111111");
		HttpURLConnection postConn = RestClient.post(url, params);
		int responseCode = postConn.getResponseCode();
		
		System.out.println(responseCode);
		if(responseCode == 200){
			String location = postConn.getHeaderField("Location");
			System.out.println(location);
			System.out.println(postConn.getContent());
			System.out.println(postConn.getResponseMessage());
			InputStream in = postConn.getInputStream();
			BufferedReader breader = new BufferedReader(new InputStreamReader(in , "utf8"));
			String str=breader.readLine(); 
			while(str != null){ 
				System.out.println(str); 
				str=breader.readLine(); 
			} 
		}else{
			System.out.println(postConn.getResponseMessage());
			System.out.println(postConn.getErrorStream());
		}
	}
	
	/** 
	* @Description: 测试get方法访问
	* @author Liu Wenjie   
	* @date 2015-1-26 上午11:32:16 
	* @throws IOException  
	*/ 
	@Test
	public void testGet() throws IOException{
		String url = "http://10.135.1.110:7001/EAI/RoutingProxyService/EAI_SOAP_ServiceRoot";
		HttpURLConnection getConn = RestClient.get(url);
		int responseCode = getConn.getResponseCode();
		System.out.println(responseCode);
		if(responseCode == 200){
			String location = getConn.getHeaderField("Location");
//			System.out.println(location);
//			System.out.println(getConn.getContent());
//			System.out.println(getConn.getResponseMessage());
			InputStream in = getConn.getInputStream();
			BufferedReader breader = new BufferedReader(new InputStreamReader(in , "utf8"));
			String str=breader.readLine(); 
			while(str != null){ 
				System.out.println("\n"+str); 
				str=breader.readLine(); 
			} 
		}else{
			System.out.println(getConn.getResponseMessage());
			System.out.println(getConn.getErrorStream());
		}
		
	}

}
