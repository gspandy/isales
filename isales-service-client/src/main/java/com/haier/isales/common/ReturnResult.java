/**
* @Company 青鸟软通   
* @Title: ReturnResult.java 
* @Package com.haier.isales.common 
* @author Guo Yuchao   
* @date 2014-10-31 下午3:12:36 
* @version V1.0   
*/ 
package com.haier.isales.common;

import java.io.Serializable;

import org.bana.common.util.basic.StringUtils;

/** 
 * @ClassName: ReturnResult 
 * @Description: 请求执行的返回结果
 *  
 */
public class ReturnResult implements Serializable {

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = -7531444301435932986L;
	public static final String RETURN_RESULT_SUCCESS = "success";//正常流程验证成功返回结果
	public static final String RETURN_RESULT_FAILURE = "failed";//正常流程验证失败返回
	public static final String RETURN_RESULT_ERROR = "error";//流程中抛出异常
	
	
	
	private String result;
	private String message = "";
	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-10-31 下午3:13:57  
	*/ 
	public ReturnResult() {
	}
	public ReturnResult(String result,String message) {
		if (StringUtils.isEmpty(result)) {
			this.result = RETURN_RESULT_SUCCESS;
		}else{
			this.result = result;
		}
		this.message = message;
	}
	/**
	 * @Description: 属性 result 的get方法 
	 * @return result
	 */
	public String getResult() {
		return result;
	}
	/**
	 * @Description: 属性 result 的set方法 
	 * @param result 
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * @Description: 属性 message 的get方法 
	 * @return message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @Description: 属性 message 的set方法 
	 * @param message 
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:03:16 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ReturnResult [result=" + result + ", message=" + message + "]";
	}
	
	
}
