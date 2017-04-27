/**
* @Company 青鸟软通   
* @Title: HttpURLConnUtil.java 
* @Package com.haier.isales.common 
* @author John.zhao   
* @date 2015-3-5 上午10:14:34 
* @version V1.0   
*/ 
package com.haier.isales.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

import org.bana.common.util.http.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: HttpURLConnUtil 
 * @Description: 使用java发送GET或者POST请求
 *  
 */
public class HttpURLConnUtil {
	
	private static Logger logger = LoggerFactory.getLogger(HttpURLConnUtil.class);
	
	/** 
	* @Description: POST请求
	* @author John.zhao   
	* @date 2015-3-5 上午10:17:40 
	* @param url
	* @param params
	* @return  返回请求的结果
	 * @throws IOException 
	*/ 
	public static String sendPost(String url, Map<String,Object> params) throws IOException {
        BufferedReader in = null;
        String result = "";
        StringBuffer buf = new StringBuffer();
        HttpURLConnection conn = null;
        try {
        	conn = RestClient.post(url, params);
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                buf.append(line);
            }
            result = buf.toString();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(in!=null){
                    in.close();
                }
                if(conn!=null){
                	conn.disconnect();
                }
            }catch(IOException ex){
            	logger.warn("关闭请求出现异常！", ex);
            }
        }
        return result;
    }   

	/** 
	* @Description: GET方式
	* @author John.zhao   
	* @date 2015-3-5 下午1:06:41 
	* @param url
	* @return 返回请求的结果
	* @throws IOException  
	*/ 
	public static String sendGet(String url) throws IOException {
        BufferedReader in = null;
        String result = "";
        StringBuffer buf = new StringBuffer();
        HttpURLConnection conn = null;
        try {
        	conn = RestClient.get(url);
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                buf.append(line);
            }
            result = buf.toString();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(in!=null){
                    in.close();
                }
                if(conn!=null){
                	conn.disconnect();
                }
            }catch(IOException ex){
            	logger.warn("关闭请求出现异常！", ex);
            }
        }
        return result;
    }   

/*	public static void main(String[] args) throws IOException {
		StringBuffer url = new StringBuffer(PositionServiceImpl.ADDRESS);
		url.append("?id=8700000328&name=null").append("&longitude=1193924180&latitude=363058592");
		String result = HttpURLConnUtil.sendGet(url.toString());
		System.out.println(result);
	}*/
}
