/**
* @Company 青鸟软通   
* @Title: DubboResultInterceptor.java 
* @Package com.haier.isales.interceptor 
* @author Liu Wenjie   
* @date 2014-11-11 下午8:06:11 
* @version V1.0   
*/ 
package com.haier.isales.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.bana.common.util.basic.StringUtils;
import org.bana.common.util.exception.ThrowableUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.DubboResult;
import com.haier.isales.common.DubboResultCode;
import com.haier.isales.common.ScoreResult;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.SystemException;
import com.haier.openplatform.util.HOPException;

/** 
 * @ClassName: DubboResultInterceptor 
 * @Description: 对dubbo返回值进行统一封装的方法 
 *  
 */
public class DubboResultInterceptor {
	
	private static final Logger LOG = LoggerFactory.getLogger(DubboResultInterceptor.class);
	/** 
	* @Description: 封装dubbo接口对应的返回值
	* @author Liu Wenjie   
	* @date 2014-11-11 下午8:07:58 
	* @param jp
	* @return
	* @throws Throwable  
	*/ 
	public Object around(ProceedingJoinPoint jp){
		DubboResult dubboResult = new DubboResult();
		// 执行方法
		try {
			Object proceed = jp.proceed();
			if(proceed instanceof ScoreResult){
				ScoreResult scoreResult = (ScoreResult)proceed;
				dubboResult.setResultBean(scoreResult.getResult());
				dubboResult.setScoreList(scoreResult.getScoreList());
			}else{
				dubboResult.setResultBean(proceed);
			}
			dubboResult.setResultCode(DubboResultCode.SUCCESS);
			LOG.info("==============正常返回===============");
			return dubboResult;
		} catch (Throwable e) {
			//异常编码
			if(e instanceof BusinessException){
				BusinessException be = (BusinessException)e;
				if(be.getExceptionCode() != null && !StringUtils.isBlank(be.getExceptionCode().getErrorCode())){
					dubboResult.setResultCode(be.getExceptionCode().getErrorCode());
				}else{
					dubboResult.setResultCode(DubboResultCode.BUSINESS_ERROR);
				}
			}else if(e instanceof SystemException){
				SystemException be = (SystemException)e;
				if(be.getExceptionCode() != null && !StringUtils.isBlank(be.getExceptionCode().getErrorCode())){
					dubboResult.setResultCode(be.getExceptionCode().getErrorCode());
				}else{
					dubboResult.setResultCode(DubboResultCode.SYSTEM_ERROR);
				}
			}else{
				dubboResult.setResultCode(DubboResultCode.RUNTIME_ERROR);
			}
			//异常信息
			if(e instanceof HOPException){
				HOPException he = (HOPException)e;
				dubboResult.setErrorMessage(he.getHopErrMsg());
			}else{
				dubboResult.setErrorMessage(e.getMessage());
			}
			
			dubboResult.setErrorStackTrack(ThrowableUtil.getStackTrace(e));
			LOG.info("==============异常返回===============");
			return dubboResult;
		} 

	}
	
}
