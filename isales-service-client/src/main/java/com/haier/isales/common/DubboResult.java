/**
* @Company 青鸟软通   
* @Title: DubboResult.java 
* @Package com.haier.isales.system.dto 
* @author Cao Rui   
* @date 2014-11-6 下午4:22:33 
* @version V1.0   
*/ 
package com.haier.isales.common;

import java.io.Serializable;
import java.util.List;

import com.haier.isales.score.dto.ScoreDTO;

/** 
 * @ClassName: DubboResult 
 * @Description: buddo接口统一的返回值类型
 *  
 */
public class DubboResult implements Serializable {

	private static final long serialVersionUID = -4114045990410261418L;
//	private PageResult<T> pageResult;	//带分页的结果列表
	private Object resultBean;	//单条实体返回时
	private String resultCode;	//返回结果编码
	private String errorMessage;	//返回结果信息
	private String errorStackTrack;	//返回结果的堆栈信息
	
	private List<ScoreDTO> scoreList;
	

	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-11-10 下午7:32:58  
	*/ 
	public DubboResult() {
	}
	public DubboResult(Object resultBean,String resultCode,String errorMessage,String errorStackTrack) {
		this.resultBean = resultBean;
		this.resultCode = resultCode;
		this.errorMessage = errorMessage;
		this.errorStackTrack = errorStackTrack;
	}
	
	/** 
	* @Description:判断Dubbo结果是否是成功
	* @author Liu Wenjie   
	* @date 2014-11-21 下午10:40:47 
	* @return  
	*/ 
	public static boolean isSuccess(DubboResult result){
		return result != null && DubboResultCode.SUCCESS.equals(result.getResultCode());
	}
	
	/**
	 * @Description: 属性 resultBean 的get方法 
	 * @return resultBean
	 */
	@SuppressWarnings("unchecked")
	public <T> T getResultBean() {
		return (T)resultBean;
	}
	/**
	 * @Description: 属性 resultBean 的set方法 
	 * @param resultBean 
	 */
	public void setResultBean(Object resultBean) {
		this.resultBean = resultBean;
	}
	/**
	 * @Description: 属性 resultCode 的get方法 
	 * @return resultCode
	 */
	public String getResultCode() {
		return resultCode;
	}
	/**
	 * @Description: 属性 resultCode 的set方法 
	 * @param resultCode 
	 */
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	/**
	 * @Description: 属性 errorMessage 的get方法 
	 * @return errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * @Description: 属性 errorMessage 的set方法 
	 * @param errorMessage 
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	/**
	 * @Description: 属性 errorStackTrack 的get方法 
	 * @return errorStackTrack
	 */
	public String getErrorStackTrack() {
		return errorStackTrack;
	}
	/**
	 * @Description: 属性 errorStackTrack 的set方法 
	 * @param errorStackTrack 
	 */
	public void setErrorStackTrack(String errorStackTrack) {
		this.errorStackTrack = errorStackTrack;
	}
	/**
	 * @Description: 属性 scoreList 的get方法 
	 * @return scoreList
	 */
	public List<ScoreDTO> getScoreList() {
		return scoreList;
	}
	/**
	 * @Description: 属性 scoreList 的set方法 
	 * @param scoreList 
	 */
	public void setScoreList(List<ScoreDTO> scoreList) {
		this.scoreList = scoreList;
	}
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:02:59 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "DubboResult [resultBean=" + resultBean + ", resultCode="
				+ resultCode + ", errorMessage=" + errorMessage
				+ ", errorStackTrack=" + errorStackTrack + ", scoreList="
				+ scoreList + "]";
	}
	
	
}
