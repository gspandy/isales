/**
* @Company 青鸟软通   
* @Title: BusinessException.java 
* @Package com.jbinfo.common.exception 
* @author Liu Wenjie   
* @date 2013-11-8 下午12:26:36 
* @version V1.0   
*/ 
package com.haier.isales.common.exception;

import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.openplatform.util.HOPException;

/** 
 * @ClassName: BusinessException 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class BaseException extends HOPException {
	

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = -7745154374032695042L;
	
	protected BusinessExceptionCode exceptionCode;
	

	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-11-10 下午5:22:52 
	* @param message
	* @param cause 
	*/ 
	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}
	public BaseException(String message) {
		super(message, new Throwable(message));
	}
	public BaseException(Throwable cause) {
		super(cause.getMessage(), cause);
	}


	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-11-10 下午5:28:00 
	* @param exceptionCode 
	*/ 
	public BaseException(BusinessExceptionCode exceptionCode) {
		super(exceptionCode.getContext(),new Throwable(exceptionCode.getContext()));
		this.exceptionCode = exceptionCode;
	}

	/** 
	 * <p>Description: </p> 
	 * @author Liu Wenjie   
	 * @date 2013-11-8 下午12:26:36 
	 * @param message 
	 */
	public BaseException(BusinessExceptionCode exceptionCode,String message) {
		super(message,new Throwable(message));
		this.exceptionCode = exceptionCode;
	}

	/** 
	 * <p>Description: </p> 
	 * @author Liu Wenjie   
	 * @date 2013-11-8 下午12:26:36 
	 * @param cause 
	 */
	public BaseException(BusinessExceptionCode exceptionCode,Throwable cause) {
		super(cause.getMessage(),cause);
		this.exceptionCode = exceptionCode;
	}

	/** 
	 * <p>Description: </p> 
	 * @author Liu Wenjie   
	 * @date 2013-11-8 下午12:26:36 
	 * @param message
	 * @param cause 
	 */
	public BaseException(BusinessExceptionCode exceptionCode,String message, Throwable cause) {
		super(message, cause);
		this.exceptionCode = exceptionCode;
	}

	/**
	 * @Description: 属性 exceptionCode 的get方法 
	 * @return exceptionCode
	 */
	public BusinessExceptionCode getExceptionCode() {
		return exceptionCode;
	}
	

}
