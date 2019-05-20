package com.mms.vo;

public class MessageVO {
	
	private String messageNum;
	private String msgSubject;
	private String messageContents;
	private String writeDate;
	private String receiver;
	private String sender;
	public String getMessageNum() {
		return messageNum;
	}
	public void setMessageNum(String messageNum) {
		this.messageNum = messageNum;
	}
	public String getMsgSubject() {
		return msgSubject;
	}
	public void setMsgSubject(String msgSubject) {
		this.msgSubject = msgSubject;
	}
	public String getMessageContents() {
		return messageContents;
	}
	public void setMessageContents(String messageContents) {
		this.messageContents = messageContents;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	@Override
	public String toString() {
		return "MessageVO [messageNum=" + messageNum + ", msgSubject=" + msgSubject + ", messageContents="
				+ messageContents + ", writeDate=" + writeDate + ", receiver=" + receiver + ", sender=" + sender + "]";
	}
	
	

}
