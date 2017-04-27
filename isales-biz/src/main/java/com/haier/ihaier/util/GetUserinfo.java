package com.haier.ihaier.util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

/**
 * @author 杜学森
 *
 */
public class GetUserinfo {
	//d5182ce0-9652-4322-9804-46bf98017ab1
	//
	public static final String EID="102";
	// 获取指定人员信息url
	private static String httpURL = "http://hdxtapp.haier.net/openaccess/input/person/get";

	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		//海尔方面地址
		//String httpURL = "http://hdxtapp.haier.net/openaccess/input/person/get";
		GetUserinfo bean = new GetUserinfo();
		List <NameValuePair> nvps = new ArrayList <NameValuePair>();
		//随机数
        nvps.add(new BasicNameValuePair("nonce", String.valueOf(new Date().getTime())));
        //工作圈ID
        nvps.add(new BasicNameValuePair("eid", EID));
        //data数据
        String userCode = "00616877";
        String email = userCode + "@haier.com";
        //String email = "yanglj@haier.com";
        nvps.add(new BasicNameValuePair("data", enyte(bean.setPerson(email))));  
        String line = bean.post(httpURL,nvps);
        JSONArray jsonArray = JSONArray.fromObject(JSONObject.fromObject(line).get("data").toString());
        String photoUrl = "";
        if (jsonArray.size() > 0 && jsonArray.getJSONObject(0).get("photoUrl") != null) {
        	photoUrl = jsonArray.getJSONObject(0).get("photoUrl").toString();
        }
        System.out.println("photoURL="+photoUrl);
	}
	
	/**
	 * 获取指定人员头像url方法
	 * @param phone 人员号码
	 */
	public String getPhotoUrl(String userCode) {
		String photoUrl = "";
		
		GetUserinfo bean = new GetUserinfo();
		List <NameValuePair> nvps = new ArrayList <NameValuePair>();
		//随机数
        nvps.add(new BasicNameValuePair("nonce", String.valueOf(new Date().getTime())));
        //工作圈ID
        nvps.add(new BasicNameValuePair("eid", EID));
        //data数据
        //String phone = "A0012656@haier.com";
        String email = userCode + "@haier.com";
        nvps.add(new BasicNameValuePair("data", enyte(bean.setPerson(email))));  
        String line = bean.post(httpURL,nvps);
        if (!line.equals("") && JSONObject.fromObject(line).get("data") != null) {
        	JSONArray jsonArray = JSONArray.fromObject(JSONObject.fromObject(line).get("data").toString());
            //System.out.println("phoneURL="+jsonArray.getJSONObject(0).get("photoUrl").toString());
            
            if (jsonArray.size() > 0 && jsonArray.getJSONObject(0).get("photoUrl") != null) {
            	photoUrl = jsonArray.getJSONObject(0).get("photoUrl").toString();
            }
        }
        
		return photoUrl;
	}
	/**
	 * http请求方法
	 * @param url
	 * @param params
	 * @return
	 */
	public String post(String url,List <NameValuePair> params){
		HttpClient httpClient = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);
		String responseBody = null;
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		try {
            post.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));  
			responseBody = httpClient.execute(post,responseHandler);
			
			System.out.println("responseBody="+responseBody);
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			httpClient.getConnectionManager().shutdown();  
		}
		return responseBody;
	}

	// 传入号码
	public String setPerson(String email){
		PersonDataDTO p = new PersonDataDTO();
		//工作圈ID设置为海尔测试工作圈
		p.setEid(EID);
		//0代表一个定值，表名这里通过邮箱来获取
		p.setType(0);
		List<String> array = new ArrayList<String>();
		//把想要获取openid的号码都通过这里加进来
		for (int i = 0; i < 1; i++) {
			//array.add("A0012656@haier.com");
			array.add(email);
			//如果需要添加多个用户，请在这里继续添加。
		}
		p.setArray(array);
		JSONObject jo = JSONObject.fromObject(p);
		return jo.toString();
	}

	
	/**
	 * 加密数据(金蝶官方提供的，根据工作圈id.key文件来加密)
	 * @param data
	 * @return
	 */
	private static String enyte(String data){
		try {
			// 顶级工程classPath目录下
			//String path = GetUserinfo.class.getResource("/").getPath();
			//byte[] b = FileUtils.readFileToByteArray(new File(path +  EID+".key"));
			//String cp = EID + ".key";
			// 当前工程classPath目录下
			//File file = new File(GetUserinfo.class.getResource("/"+ EID+".key").getPath());
			//byte[] b = FileUtils.readFileToByteArray(file);
			
			// 为解决访问jar包下文件，用getResourceStream 方法
			InputStream input = GetUserinfo.class.getResourceAsStream("/"+ EID+".key");
			byte[] b = IOUtils.toByteArray(input);
			PrivateKey restorePublicKey = RSAUtils.restorePrivateKey(b);
			//开始加密！！
			byte[] bytes =  Base64.encodeBase64(RSAUtils.encryptLarger(data.getBytes(), restorePublicKey));
			return new String(bytes,"UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
