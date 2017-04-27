//package com.haier.openplatform.showcase.util;
//
//import com.haier.isales.common.JsonUtil;
//import net.sf.json.JSONArray;
//import net.sf.json.JSONException;
//import net.sf.json.JSONObject;
//import org.apache.commons.collections.map.HashedMap;
//import org.apache.commons.httpclient.HttpClient;
//import org.apache.commons.httpclient.methods.PostMethod;
//
//import java.io.UnsupportedEncodingException;
//import java.net.URLDecoder;
//import java.net.URLEncoder;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created by Administrator on 2014/12/18.
// * 验证产品中心的所有产品信息
// */
//public class ExampleUnitCodeValue {
//    //使用时请使用从Here平台申请的申请应用名和秘钥
//    public static String HERE_APPNAME="isales";
//    public static String HERE_SECRETKEY="f3ec438bd";
//
//    //特殊枚举值
//    public Map<String,String> enmValueMap=new HashMap<String, String>();
//
//    public void getAllProductInfo(String siteNameVal,String fieldGroups) throws UnsupportedEncodingException {
//        /*
//        *我们需要确定查询那个站点下的产品信息，首先需要确定该产品所在的站点名称，而后通过
//        *GetChannelViewsBySiteClient.getChannelViewsBySite方法获取该站点下的（此处以“家电家居”为例）下的所有视图，
//        */
//        //设置服务名
//        String serviceName="pcenterServiceProvider";
//        //获取站点下的视图栏目信息方法名
//        String methodName1 = "getPChnlViewsBySite";
//        //定义Method所需参数，JSON格式，需使用URLEncoder，编码与应用申请时填写的编码需保持一致
//        String siteName=URLEncoder.encode(siteNameVal,"UTF-8");
//        //获取站点下的视图栏目信息参数
//        String sJsonParams="{sitename:'"+siteName+"'}";
//        //开始调用接口返回视图信息
//        String returnViewResult=sendInterceRequest(serviceName,methodName1,sJsonParams);
//        System.out.println("开始输出查询的站点下的所有视图信息");
//        showChnlViewBySiteResult(JSONObject.fromObject(returnViewResult),siteNameVal);
//        System.out.println("结束输出查询的站点下的所有视图信息");
//        /**
//         * 我们拿到了该站点下的视图的信息后，我们可以根绝自己的需要来查询该站点下任意一个视图下的产品信息，
//         * 因此我们接下来需要通过GetViewFieldsInfoClient.getViewFieldsInfoClient来获取任意一个视图下的产品的分组的信息（此处先以获取“规格参数”中的属性字段为例）
//         * 通过该接口我们通过传入视图名称和其要查询的分组名称，最终我们可以得到该分组名称下的属性信息。
//         * 以下为其实现过程
//         *  */
//        //初始化并获取到当前站点下的所有数据
//
//        JSONObject siteAndViewObj=JSONObject.fromObject(JSONObject.fromObject(returnViewResult).get("providerData"));
//
//        if (siteAndViewObj.isNullObject()||!siteAndViewObj.get("providersuccess").equals("true")||JSONArray.fromObject(siteAndViewObj.get(siteNameVal)).isEmpty()){
//            System.out.println("没有获取到相应的查询信息，无法获取相应的视图内容,请查看错误信息");
//        }else{
//            JSONArray productViewData=JSONArray.fromObject(siteAndViewObj.get(siteNameVal));
//            /*--开始获取当下站点下每一个产品视图的规格参数的属性信息--*/
//            //当前视图的数量
//            int viewNum=productViewData.size();
//            for (int i=(viewNum-1);i>-1;i--){
//                JSONObject currentViewObj=productViewData.getJSONObject(i);
//                if(!"HCN_BING_XIANG_5".equalsIgnoreCase(currentViewObj.get("viewname").toString())){//仅HCN_BING_XIANG_5视图信息
//                    continue;
//                }
//                System.out.println("当前的视图名称为"+currentViewObj.get("viewname").toString()+",其中文描述是"+currentViewObj.get("viewdesc").toString());
//                String viewPropertiesResult=getChnlViewContent(siteName,currentViewObj.get("viewname").toString(),fieldGroups);
//
//                //System.out.println("特殊枚举类型字段信息："+JsonUtil.objectToJson(enmValueMap));
//               if (viewPropertiesResult.equals("")){
//                   System.out.print("查询属性出错，无法获取数据！");
//                   return;
//               }else{
//                   /**
//                    * 经过以上两个步骤之后，我们现在可以获取任意一个视图下的某个分组的属性字段，我们以此可以
//                    *通过GetHaierProductsClient.getHaierProducts，获取该视图下相应的产品信息（此处是以“规格参数”中的属性为例，以下以“规格参数”说明)，我们将获取到的“规格参数”的物理字段值以","拼接成字符串，作为当下接口的selectfields的查询参数。
//                    * 以下为其实现过程
//                    * */
//                   String getProMethodName="getHaierProducts";
//                   //获取站点下多联机室内机视图下的全量产品信息参数
//                   String sProParams="{sitename:'"+siteNameVal+"',viewname:'"+currentViewObj.get("viewname").toString()+"',pagesize:'20',curpage:'1',selectfields:'"+viewPropertiesResult+"','extcondition':[{'fieldname':'taotu','num':'1'}]}";
//                   //打印返回的结果
//                  String returnProInfoData=sendInterceRequest(serviceName,getProMethodName,sProParams);
//                  //对于返回视图下的所有产品信息进行显示
//                  showViewProductInfo(returnProInfoData,viewPropertiesResult,currentViewObj.get("viewname").toString());
//               }
//
//
//            }
//        }
//
//
//
//    }
//
//    /**
//     *
//     * @param productInfo     产品信息字符串
//     * @param viewPropertiesResult 上面接口查询出来的字段字符串
//     * @param viewName 视图名  比如：HCN_BING_XIANG_5
//     */
//    public void showViewProductInfo(String productInfo,String viewPropertiesResult,String viewName){
//        try{
//            JSONObject productInfoObj=JSONObject.fromObject(productInfo);
//            if (!productInfoObj.getString("resultMsg").equals("200-请求服务成功")){
//                System.out.println("请求服务失败，"+productInfoObj.getString("resultMsg"));
//                return;
//            }else{
//                JSONObject showInfoObj=new JSONObject();
//                showInfoObj.element("产品信息",JSONObject.fromObject(productInfoObj.get("providerData")).get("products"));
//                showInfoObj.element("分页信息",JSONObject.fromObject(productInfoObj.get("providerData")).get("paged"));
//                showInfoObj.element("数据类型",JSONObject.fromObject(productInfoObj.get("providerData")).get("datatype"));
//                System.out.println(showInfoObj);
//
//                //输出产品具体字段信息
//                JSONArray productsArr=JSONObject.fromObject(productInfoObj.get("providerData")).getJSONArray("products");
//                if(productsArr!=null){
//                    //System.out.println("产品信息字符串为："+JSONUtil.objectToJson(productsArr));
//                    for(int i=0;i<productsArr.size();i++){
//                        JSONObject productsObj=productsArr.getJSONObject(i);
//                        //这里字段内容只输出查询出的规格参数字段，其它字段自己获取
//                        String[] viewPropertiesResultArr=viewPropertiesResult.toLowerCase().split(",");
//                        for(int j=0;j<viewPropertiesResultArr.length;j++){
//                            String fieldName=viewPropertiesResultArr[j];
//                            if(fieldName==null||"".equals(fieldName)){
//                                continue;
//                            }
//
//                            String fieldValue=productsObj.get(fieldName).toString();
//                            System.out.println("字段名为："+fieldName+" 原字段值为："+fieldValue);
//
//                            if(enmValueMap.get(viewName+"-"+fieldName)!=null){//字段值需要替换为显示值，比如 SUDONGGONGNENG 有`1~无`0  获取的值1需要替换为有 获取的值0需要替换为无
//                                String enmValue=enmValueMap.get(viewName+"-"+fieldName);
//                                System.out.println("字段名为："+fieldName+" 原字段值为："+fieldValue);
//                                System.out.println("字段："+fieldName+"的值需需要替换为枚举值，枚举规则为："+enmValue);
//
//                                //根据原字段值查找显示值
//                                String disFieldValue="";
//                                String[] enmValueArr=enmValue.split("~");//enmValueArr:["有`1","无`0"]
//                                //System.out.println("enmValueArr:"+JSONUtil.objectToJson(enmValueArr));
//                                for(int k=0;k<enmValueArr.length;k++){
//                                    String enmValueArrEach=enmValueArr[k];
//                                    String[] enmValueArrEachArr=enmValueArrEach.split("`");
//                                    if(enmValueArrEachArr[1].equalsIgnoreCase(fieldValue)){//比如1与字段值一致，将替换为有
//                                        disFieldValue=enmValueArrEachArr[0];
//                                    }
//                                }
//
//
//                                System.out.println("字段名为："+fieldName+" 新字段值为："+disFieldValue);
//
//                            }
//                        }
//                    }
//                }
//
//            }
//        }catch(JSONException e){
//            System.out.println("没有查询到相关的属性信息！");
//        }
//
//    }
//    /**
//     * 分类别获取相应产品的内容
//     *
//     * */
//
//
//     /*
//     *调用获取视图信息的接口方法
//     */
//    public String getChnlViewContent(String siteNameVal,String viewNameVal,String fieldGroups) throws UnsupportedEncodingException {
//        //设置服务名
//        String serviceName="pcenterServiceProvider";
//        //获取视图下的属性信息方法名
//        String methodName1 = "getViewFieldsInfo";
//        //定义Method所需参数，JSON格式，需使用URLEncoder，编码与应用申请时填写的编码需保持一致
//        String viewName= URLEncoder.encode(viewNameVal, "UTF-8");
//        String fieldGroup=URLEncoder.encode(fieldGroups,"UTF-8");
//        String siteName= URLDecoder.decode(siteNameVal,"UTF-8");
//        //获取站点下的视图栏目信息参数
//        String sJsonParams="{viewname:'"+viewName+"',fieldgroup:'"+fieldGroup+"'}";
//        //开始调用接口返回视图信息
//        String returnViewResult=sendInterceRequest(serviceName,methodName1,sJsonParams);
//        //此处可以进行数据处理返回属性的名称
//        JSONObject viewPropertiesObj=JSONObject.fromObject(returnViewResult);
//
//        if (isEmpty(returnViewResult,viewName)){
//            //没有获取到返回数据，返回空字符串
//            return "";
//        }else{
//            //获取返回的属性数据
//           // JSONArray propertiesArray=JSONArray.fromObject(viewPropertiesObj.getJSONObject("providerData").get(viewNameVal));
//            String providerData=JsonUtil.getjsonVal(returnViewResult,"providerData");
//            String currentData=JsonUtil.getjsonVal(providerData,viewName.toLowerCase());
//            //获取到返回的所有产品属性内容，开始遍历，赋予字段值中文含义
//            JSONArray channelViewArrStr=JSONArray.fromObject(currentData);
//            //解析处理获取处理的属性信息，返回其查询的属性物理字段值
//            if (channelViewArrStr.isEmpty()){
//                System.out.println("当前的试图下没有对应的属性信息");
//                return "";
//            }else{
//                //获取到所有的产品属性数组信息
//                //获取字段list个数为0
//                if(JSONArray.fromObject(JSONObject.fromObject(channelViewArrStr.get(0)).get(siteName)).getJSONObject(0).getJSONArray("fieldsInfo").size()==0){
//                    return "";
//                }
//                try{
//                //JSONArray currentViewProArray=JSONArray.fromObject(JSONObject.fromObject(channelViewArrStr.get(0)).get(siteName)).getJSONObject(0).getJSONArray("fieldsInfo").getJSONArray(0);
//                    JSONArray currentViewProArray=JSONArray.fromObject(JSONObject.fromObject(channelViewArrStr.get(0)).get(siteName)).getJSONObject(0).getJSONArray("fieldsInfo");
//                //开始遍历所有的属性信息
//                 int proNums=currentViewProArray.size();
//                 JSONArray showResultArray=new JSONArray();
//                 StringBuilder returnProStr=new StringBuilder(100);
//                 for(int j=(proNums-1);j>-1;j--){
//                     JSONObject currentPropertyObj=currentViewProArray.getJSONObject(j);
//                     JSONObject currentProObj=new JSONObject();
//                     currentProObj.element("中文名称",currentPropertyObj.get("ANOTHERNAME").toString());
//                     currentProObj.element("物理名称", currentPropertyObj.get("DBFIELDNAME").toString());
//                     currentProObj.element("枚举值",currentPropertyObj.get("ENMVALUE").toString());
//                     showResultArray.add(currentProObj);
//                     returnProStr.append(currentPropertyObj.get("DBFIELDNAME").toString()+",");
//                     //枚举值不为空并且枚举值有特殊符号`，因为只有有此特殊符号的枚举值才需要将数值最终替换为显示值
//                     if(!"".equals(currentPropertyObj.get("ENMVALUE").toString())&&currentPropertyObj.get("ENMVALUE").toString().indexOf("`")>-1){
//                        enmValueMap.put(viewNameVal+"-"+currentPropertyObj.get("DBFIELDNAME").toString().toLowerCase(),currentPropertyObj.get("ENMVALUE").toString());
//                     }
//                 }
//                    System.out.println("当前的视图下的"+fieldGroups+"的属性值是："+showResultArray);
//                    return returnProStr.toString().substring(0,returnProStr.length()-1);
//                }catch(Exception e){
//                    e.printStackTrace();
//                    return "";
//                }
//            }
//
//        }
//    }
//    /*
//    * 打印出有好的返回信息
//    * */
//    public void showChnlViewBySiteResult(JSONObject resultObject,String siteName){
//          String returnResult=resultObject.get("resultMsg").toString();
//          if (returnResult.equals("200-请求服务成功")){
//               JSONObject providerData=JSONObject.fromObject(resultObject.get("providerData"));
//               if (providerData.get("providersuccess").toString().equals("true")){
//                   System.out.println("查询站点"+siteName+"下的所有产品视图信息为："+ JSONArray.fromObject(providerData.get(siteName)));
//               }else{
//                   System.out.println("查询数据出错。");
//               }
//          }else{
//              System.out.println("调用接口出现问题，其原因是："+returnResult);
//          }
//    }
//    //调用接口的公共方法
//    public String sendInterceRequest(String serviceName,String methodName, String jsonParams){
//        String  responsePost="";
//        try{
//            //定义ServiceUrl
//            String sAccessUrl ="http://here.haier.com/here/services/access.do";
//            //定义应用接入AppName和SecretKey，SecretKey在接入应用审核通过后，由HERE平台自动生成通知开发者
//            String sAppName =HERE_APPNAME;
//            String sSecretKey = HERE_SECRETKEY;
//
//            //调用服务，通过开源org.apache.commons.httpclient实现（也可通过其他方式）
//            PostMethod methodPost = new PostMethod(sAccessUrl );
//            methodPost.addParameter("appName", sAppName);
//            methodPost.addParameter("appSecret", sSecretKey);
//            //定义需要访问的ServiceName
//            methodPost.addParameter("serviceName", serviceName);
//
//            //定义需要访问的MethodName
//            methodPost.addParameter("methodName",methodName);
//            methodPost.addParameter("params", jsonParams);
//            methodPost.addParameter("resultFormat","true");
//           //执行访问请求
//            HttpClient httpClient = new HttpClient();
//            httpClient.executeMethod(methodPost);
//            //获取访问结果，访问结果JSON格式
//            responsePost = new String(methodPost.getResponseBody(), "UTF-8");
//        }catch (Exception ex) {
//            System.out.println("请求服务获取信息/编码失败.");
//            ex.printStackTrace();
//        }
//        return responsePost;
//    }
//    /**
//     * 判断返回结果是否为空
//     * @param
//     * @return
//     */
//    public static boolean isEmpty(String jsonStr,String viewName) {
//        String resultMsg=JsonUtil.getjsonVal(jsonStr,"resultMsg");
//        String providerData=JsonUtil.getjsonVal(jsonStr,"providerData");
//        String currentData= JsonUtil.getjsonVal(providerData, viewName.toLowerCase());
//        //获取到返回的所有产品属性内容，开始遍历，赋予字段值中文含义
//        //System.out.println("*****"+currentData);
//        JSONArray channelViewArrStr=null;
//        if(currentData==null||"".equals(currentData)){
//            return true;
//        }
//        try{
//            channelViewArrStr=JSONArray.fromObject(currentData);
//            if (resultMsg.equals("200-请求服务成功")&&JsonUtil.getjsonVal(providerData, "providersuccess").equals("true")){
//                return false;
//            }else{
//                return true;
//            }
//        }catch(Exception e){
//            System.out.println(channelViewArrStr);
//            e.printStackTrace();
//            return true;
//        }
//    }
//    public static  void main(String[] args){
//        String siteName="家电家居_5";
//        //规格参数
//        String fieldGroups1="规格参数";
//        //产品特性
//        String fieldGroups2="产品特性";
//        //用户评论
//        String fieldGroups3="用户评论";
//        //说明书
//        String fieldGroups4="说明书";
//        //常见问题
//        String fieldGroups5="常见问题";
//        ExampleUnitCodeValue code=new ExampleUnitCodeValue();
//        try {
//            code.getAllProductInfo(siteName,fieldGroups1);
//            System.out.println("**********************规格参数 分割线结束**************************");
//            System.out.println("**********************产品特性 分割线开始**************************");
//            //code.getAllProductInfo(siteName,fieldGroups2);
//            System.out.println("**********************产品特性 分割线结束**************************");
//           /* System.out.println("**********************用户评论 分割线开始**************************");
//            code.getAllProductInfo(siteName,fieldGroups3);
//            System.out.println("**********************用户评论 分割线结束**************************");
//            System.out.println("**********************说明书 分割线开始**************************");
//            code.getAllProductInfo(siteName,fieldGroups4);
//            System.out.println("**********************说明书 分割线结束**************************");
//            System.out.println("**********************常见问题 分割线开始**************************");
//            code.getAllProductInfo(siteName,fieldGroups5);
//            System.out.println("**********************常见问题 分割线结束**************************");*/
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//    }
//}
