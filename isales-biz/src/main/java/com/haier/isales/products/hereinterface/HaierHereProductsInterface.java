/**
* @Company 青鸟软通   
* @Title: HaierHereProductsInterface.java 
* @Package com.haier.isales.products.hereinterface 
* @author John.zhao   
* @date 2015-1-20 下午4:44:44 
* @version V1.0   
*/ 
package com.haier.isales.products.hereinterface;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.Logger;

import com.haier.isales.common.JsonUtil;
import com.haier.isales.products.heretemp.productsclassify.domain.ProductsClassifyDomain;

/** 
 * @ClassName: HaierHereProductsInterface 
 * @Description: 调用here接口工具类 
 *  
 */
public class HaierHereProductsInterface {
	
	public static final String SITENAMEVAL = "家电家居_5";
	
	private static Logger logger = Logger.getLogger(HaierHereProductsInterface.class);
	
	public static List<ProductsClassifyDomain> saveAllProductInfo() throws UnsupportedEncodingException{
		List<ProductsClassifyDomain> list = new ArrayList<ProductsClassifyDomain>();
//		String siteNameVal = "家电家居_5";
		String serviceName="pcenterServiceProvider";
        //获取站点下的视图栏目信息方法名
        String methodName1 = "getPChnlViewsBySite";
        //定义Method所需参数，JSON格式，需使用URLEncoder，编码与应用申请时填写的编码需保持一致
        String siteName=URLEncoder.encode(SITENAMEVAL,"UTF-8");
        //获取站点下的视图栏目信息参数
        String sJsonParams="{sitename:'"+siteName+"'}";
        //开始调用接口返回视图信息
        String returnViewResult=sendInterceRequest(serviceName,methodName1,sJsonParams);
        JSONObject siteAndViewObj=JSONObject.fromObject(JSONObject.fromObject(returnViewResult).get("providerData"));
        if (!"true".equals(siteAndViewObj.get("providersuccess"))||JSONArray.fromObject(siteAndViewObj.get(SITENAMEVAL)).isEmpty()){
            logger.info("没有获取到相应的查询信息，无法获取相应的视图内容");
        }else{
            JSONArray productViewData=JSONArray.fromObject(siteAndViewObj.get(SITENAMEVAL));
            int viewNum=productViewData.size();
            for (int i=(viewNum-1);i>-1;i--){
                JSONObject currentViewObj=productViewData.getJSONObject(i);
                logger.info("当前的视图名称为"+currentViewObj.get("viewname").toString()+",其中文描述是"+currentViewObj.get("viewdesc").toString());
                ProductsClassifyDomain domain = new ProductsClassifyDomain();
                domain.setViewname(currentViewObj.get("viewname").toString());
                domain.setViewdesc(currentViewObj.get("viewdesc").toString());
                domain.setChanneldescstrs(currentViewObj.get("channeldescstrs").toString());
                logger.info(domain);
                list.add(domain);
            }
        }
		return list;
	}

	/** 
	* @Description: 获取某一个视图下的所有字段-对应中文
	* @author John.zhao
	* @date 2015-1-21 下午1:51:34 
	* @param viewName 视图名
	* @param fieldGroups 规格参数、产品特性、用户评论、说明书、常见问题
	* @throws UnsupportedEncodingException  
	*/ 
	public static String getAllViewProperties(String viewName,String fieldGroups) throws UnsupportedEncodingException{
		String siteNameVal = "家电家居_5";
		//定义Method所需参数，JSON格式，需使用URLEncoder，编码与应用申请时填写的编码需保持一致
        String siteName=URLEncoder.encode(siteNameVal,"UTF-8");
        String viewPropertiesResult=getChnlViewContent(siteName,viewName.toLowerCase(),fieldGroups);
        return viewPropertiesResult;
	}
	
	/** 
	* @Description: 获取某一视图下的字段的值，结果是json格式
	* @author John.zhao   
	* @date 2015-1-21 下午1:59:37 
	* @param viewPropertiesResult
	* @param viewName
	* @param serviceName  
	*/ 
	public static String getAllViewData(String viewPropertiesResult,String viewName){
		String serviceName="pcenterServiceProvider";
		if ("".equals(viewPropertiesResult)){
//            System.out.print("查询属性出错，无法获取数据！");
            return "";
        }else{
            /**
             * 经过以上两个步骤之后，我们现在可以获取任意一个视图下的某个分组的属性字段，我们以此可以
             *通过GetHaierProductsClient.getHaierProducts，获取该视图下相应的产品信息（此处是以“规格参数”中的属性为例，以下以“规格参数”说明)，我们将获取到的“规格参数”的物理字段值以","拼接成字符串，作为当下接口的selectfields的查询参数。
             * 以下为其实现过程
             * */
            String getProMethodName="getHaierProducts";
            //获取站点下多联机室内机视图下的全量产品信息参数
            String sProParams="{sitename:'"+SITENAMEVAL+"',viewname:'"+viewName.toLowerCase()+"',pagesize:'20',curpage:'1',selectfields:'"+viewPropertiesResult+"','extcondition':[{'fieldname':'taotu','num':'10'}]}";
            //打印返回的结果
           String returnProInfoData=sendInterceRequest(serviceName,getProMethodName,sProParams);
           //对于返回视图下的所有产品信息进行显示
           showViewProductInfo(returnProInfoData);
           return returnProInfoData;
        }
	}
	
	public static void showViewProductInfo(String productInfo){
        try{
            JSONObject productInfoObj=JSONObject.fromObject(productInfo);
            if (!"200-请求服务成功".equals(productInfoObj.getString("resultMsg"))){
                logger.info("请求服务失败，"+productInfoObj.getString("resultMsg"));
                return;
            }else{
                JSONObject showInfoObj=new JSONObject();
                showInfoObj.element("产品信息",JSONObject.fromObject(productInfoObj.get("providerData")).get("products"));
                showInfoObj.element("分页信息",JSONObject.fromObject(productInfoObj.get("providerData")).get("paged"));
                showInfoObj.element("数据类型",JSONObject.fromObject(productInfoObj.get("providerData")).get("datatype"));
                logger.info(showInfoObj);
            }
        }catch(JSONException e){
            logger.info("没有查询到相关的属性信息！");
        }

    }
	/*
     *调用获取视图信息的接口方法
     */
    public static String getChnlViewContent(String siteNameVal,String viewNameVal,String fieldGroups) throws UnsupportedEncodingException {
        //设置服务名
        String serviceName="pcenterServiceProvider";
        //获取视图下的属性信息方法名
        String methodName1 = "getViewFieldsInfo";
        //定义Method所需参数，JSON格式，需使用URLEncoder，编码与应用申请时填写的编码需保持一致
        String viewName= URLEncoder.encode(viewNameVal, "UTF-8");
        String fieldGroup=URLEncoder.encode(fieldGroups,"UTF-8");
        String siteName= URLDecoder.decode(siteNameVal,"UTF-8");
        //获取站点下的视图栏目信息参数
        String sJsonParams="{viewname:'"+viewName+"',fieldgroup:'"+fieldGroup+"'}";
        //开始调用接口返回视图信息
        String returnViewResult=sendInterceRequest(serviceName,methodName1,sJsonParams);
        //此处可以进行数据处理返回属性的名称
//        JSONObject viewPropertiesObj=JSONObject.fromObject(returnViewResult);

        if (isEmpty(returnViewResult,viewName)){
            //没有获取到返回数据，返回空字符串
            return "";
        }else{
            //获取返回的属性数据
           // JSONArray propertiesArray=JSONArray.fromObject(viewPropertiesObj.getJSONObject("providerData").get(viewNameVal));
            String providerData=JsonUtil.getjsonVal(returnViewResult,"providerData");
            String currentData=JsonUtil.getjsonVal(providerData,viewName.toLowerCase());
            //获取到返回的所有产品属性内容，开始遍历，赋予字段值中文含义
            JSONArray channelViewArrStr=JSONArray.fromObject(currentData);
            //解析处理获取处理的属性信息，返回其查询的属性物理字段值
            if (channelViewArrStr.isEmpty()){
                logger.info("当前的试图下没有对应的属性信息");
                return "";
            }else{
                //获取到所有的产品属性数组信息
                try{
                JSONArray currentViewProArray=JSONArray.fromObject(JSONObject.fromObject(channelViewArrStr.get(0)).get(siteName)).getJSONObject(0).getJSONArray("fieldsInfo");
                //开始遍历所有的属性信息
                 int proNums=currentViewProArray.size();
                 JSONArray showResultArray=new JSONArray();
                 StringBuilder returnProStr=new StringBuilder(100);
                 for(int j=(proNums-1);j>-1;j--){
                     JSONObject currentPropertyObj=currentViewProArray.getJSONObject(j);
                     JSONObject currentProObj=new JSONObject();
                     currentProObj.element("中文名称",currentPropertyObj.get("ANOTHERNAME").toString());
                     currentProObj.element("物理名称", currentPropertyObj.get("DBFIELDNAME").toString().toLowerCase());
                     currentProObj.element("枚举值",currentPropertyObj.get("ENMVALUE").toString());
                     showResultArray.add(currentProObj);
                     returnProStr.append(currentPropertyObj.get("DBFIELDNAME").toString()).append(",");
                 }
                    //logger.info("当前的视图下的"+fieldGroups+"的属性值是："+showResultArray);
                    return showResultArray.toString();
                }catch(Exception e){
//                    e.printStackTrace();
                    return "";
                }
            }

        }
    }
    public static String getSearchColumn(String viewNameVal,String fieldGroups) throws UnsupportedEncodingException {
        //设置服务名
        String serviceName="pcenterServiceProvider";
        //获取视图下的属性信息方法名
        String methodName1 = "getViewFieldsInfo";
        //定义Method所需参数，JSON格式，需使用URLEncoder，编码与应用申请时填写的编码需保持一致
        String viewName= URLEncoder.encode(viewNameVal, "UTF-8");
        String fieldGroup=URLEncoder.encode(fieldGroups,"UTF-8");
        String siteName= URLDecoder.decode(SITENAMEVAL,"UTF-8");
        //获取站点下的视图栏目信息参数
        String sJsonParams="{viewname:'"+viewName+"',fieldgroup:'"+fieldGroup+"'}";
        //开始调用接口返回视图信息
        String returnViewResult=sendInterceRequest(serviceName,methodName1,sJsonParams);
        //此处可以进行数据处理返回属性的名称
//        JSONObject viewPropertiesObj=JSONObject.fromObject(returnViewResult);

        if (isEmpty(returnViewResult,viewName)){
            //没有获取到返回数据，返回空字符串
            return "";
        }else{
            //获取返回的属性数据
           // JSONArray propertiesArray=JSONArray.fromObject(viewPropertiesObj.getJSONObject("providerData").get(viewNameVal));
            String providerData=JsonUtil.getjsonVal(returnViewResult,"providerData");
            String currentData=JsonUtil.getjsonVal(providerData,viewName.toLowerCase());
            //获取到返回的所有产品属性内容，开始遍历，赋予字段值中文含义
            JSONArray channelViewArrStr=JSONArray.fromObject(currentData);
            //解析处理获取处理的属性信息，返回其查询的属性物理字段值
            if (channelViewArrStr.isEmpty()){
                logger.info("当前的试图下没有对应的属性信息");
                return "";
            }else{
                //获取到所有的产品属性数组信息
                try{
                JSONArray currentViewProArray=JSONArray.fromObject(JSONObject.fromObject(channelViewArrStr.get(0)).get(siteName)).getJSONObject(0).getJSONArray("fieldsInfo");
                //开始遍历所有的属性信息
                 int proNums=currentViewProArray.size();
                 JSONArray showResultArray=new JSONArray();
                 StringBuilder returnProStr=new StringBuilder(100);
                 for(int j=(proNums-1);j>-1;j--){
                     JSONObject currentPropertyObj=currentViewProArray.getJSONObject(j);
                     JSONObject currentProObj=new JSONObject();
                     currentProObj.element("中文名称",currentPropertyObj.get("ANOTHERNAME").toString());
                     currentProObj.element("物理名称", currentPropertyObj.get("DBFIELDNAME").toString());
                     showResultArray.add(currentProObj);
                     returnProStr.append(currentPropertyObj.get("DBFIELDNAME").toString()).append(",");
                 }
                    logger.info("当前的视图下的"+fieldGroups+"的属性值是："+showResultArray);
                    return returnProStr.toString().substring(0,returnProStr.length()-1);
                }catch(Exception e){
//                    e.printStackTrace();
                    return "";
                }
            }

        }
    }
	 /**
     * 判断返回结果是否为空
     * @param
     * @return
     */
    public static boolean isEmpty(String jsonStr,String viewName) {
        String resultMsg=JsonUtil.getjsonVal(jsonStr,"resultMsg");
        String providerData=JsonUtil.getjsonVal(jsonStr,"providerData");
        String currentData= JsonUtil.getjsonVal(providerData, viewName.toLowerCase());
        //获取到返回的所有产品属性内容，开始遍历，赋予字段值中文含义
        JSONArray channelViewArrStr=null;
        try{
        	if("".equals(currentData)){
        		return true;
        	}
            channelViewArrStr=JSONArray.fromObject(currentData);
            if ("200-请求服务成功".equals(resultMsg)&&"true".equals(JsonUtil.getjsonVal(providerData, "providersuccess"))){
                return false;
            }else{
                return true;
            }
        }catch(Exception e){
            logger.info(channelViewArrStr);
//            e.printStackTrace();
            return true;
        }
    }
	
	 //调用接口的公共方法
    public static String sendInterceRequest(String serviceName,String methodName, String jsonParams){
        String  responsePost="";
        try{
            //定义ServiceUrl
            String sAccessUrl ="http://here.haier.com/here/services/access.do";
            //定义应用接入AppName和SecretKey，SecretKey在接入应用审核通过后，由HERE平台自动生成通知开发者
            String sAppName = "isales";
            String sSecretKey = "f3ec438bd";

            //调用服务，通过开源org.apache.commons.httpclient实现（也可通过其他方式）
            PostMethod methodPost = new PostMethod(sAccessUrl );
            methodPost.addParameter("appName", sAppName);
            methodPost.addParameter("appSecret", sSecretKey);
            //定义需要访问的ServiceName
            methodPost.addParameter("serviceName", serviceName);

            //定义需要访问的MethodName
            methodPost.addParameter("methodName",methodName);
            methodPost.addParameter("params", jsonParams);
            methodPost.addParameter("resultFormat","true");
           //执行访问请求
            HttpClient httpClient = new HttpClient();
            httpClient.executeMethod(methodPost);
            //获取访问结果，访问结果JSON格式
            responsePost = new String(methodPost.getResponseBody(), "UTF-8");
        }catch (Exception ex) {
            logger.info("请求服务获取信息/编码失败."+ex);
//            ex.printStackTrace();
        }
        return responsePost;
    }
}
