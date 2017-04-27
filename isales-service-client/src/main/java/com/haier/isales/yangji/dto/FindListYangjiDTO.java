package com.haier.isales.yangji.dto;

import java.io.Serializable;

public class FindListYangjiDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2022166715387436334L;
	/**
	 * by wangp
	 */
	
	private String id;//用来更新状态
	private String title;//文件头
	private String content;//文件内容
	private String messageContent;//提醒用户的型号编码
	private String messagesType;//文件类型  shangyang,qianshou,xiayang
	private String messageForward;//消息去向
	private String isCheck;
//	private String userCode;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public String getMessagesType() {
		return messagesType;
	}
	public void setMessagesType(String messagesType) {
		this.messagesType = messagesType;
	}
	public String getMessageForward() {
		return messageForward;
	}
	public void setMessageForward(String messageForward) {
		this.messageForward = messageForward;
	}
	public String getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}
	@Override
	public String toString() {
		return "FindListYangjiDTO [id=" + id + ", title=" + title + ", content=" + content + ", messageContent="
				+ messageContent + ", messagesType=" + messagesType + ", messageForward=" + messageForward
				+ ", isCheck=" + isCheck + "]";
	}
}
