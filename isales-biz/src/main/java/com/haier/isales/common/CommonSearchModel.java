/**
* @Company 青鸟软通   
* @Title: CommonSearchModel.java 
* @Package com.haier.isales.common 
* @author Guo Yuchao   
* @date 2014-10-29 下午9:40:01 
* @version V1.0   
*/ 
package com.haier.isales.common;

import com.haier.openplatform.util.SearchModel;

/** 
 * @ClassName: CommonSearchModel 
 * @Description: 查询分页使用 
 *  
 */
public class CommonSearchModel<T> extends SearchModel<T> {

	/** 
	* @Fields serialVersionUID :
	*/ 
	private static final long serialVersionUID = 3826857581306644476L;
	
	private Long firstResult = 0L;

	/**
	 * @Description: 属性 firstResult 的get方法 
	 * @return firstResult
	 */
	public Long getFirstResult() {		
		if(this.getPager() != null){
			firstResult = (this.getPager().getCurrentPage() - 1) * this.getPager().getPageSize();
		}
		return firstResult;
	}

	/**
	 * @Description: 属性 firstResult 的set方法 
	 * @param firstResult 
	 */
	public void setFirstResult(Long firstResult) {
		if(firstResult < 0){
			this.firstResult = 0L;
		}else{
			this.firstResult = firstResult;
		}
	}
	
}
