/**
* @Company 青鸟软通   
* @Title: PrototypeAttachmentDomain.java 
* @Package com.haier.isales.prototype.domain 
* @author Guo Yuchao  
* @date 2015-1-13 15:50:03
* @version V1.0   
*/ 
package com.haier.isales.prototype.domain;

import java.io.Serializable;

/** 
 * @ClassName: PrototypeAttachmentDomain 
 * t_isales_propertype_attachment_ref 自动生成的对应的实体对象   
 *  
 */
public class PrototypeAttachmentDomain implements Serializable{
	private static final long serialVersionUID = -1420338666964L;

	/** 
	* @Fields barcode : 样机条码
	*/
	private String barcode;
	/**
	 * @Fields attachmentId : 附件id
	 */
	private Long attachmentId;
	
	public PrototypeAttachmentDomain() {
		super();
	}

	
	

	public String getBarcode() {
		return barcode;
	}




	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}




	public Long getAttachmentId() {
		return attachmentId;
	}




	public void setAttachmentId(Long attachmentId) {
		this.attachmentId = attachmentId;
	}




	@Override
	public String toString() {
		return "PrototypeAttachmentDomain [barcode=" + barcode
				+ ", attachmentId=" + attachmentId + "]";
	}

}
