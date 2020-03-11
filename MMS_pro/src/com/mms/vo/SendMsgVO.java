package com.mms.vo;

public class SendMsgVO {
	
	private String sendNum;
	private String sendSubject;
	private String sendWriteDate;
	private String sendContents;
	private String sendReceiver;
	private String sendSender;
	private String sendName;
	private String sendFile;
	public String getSendNum() {
		return sendNum;
	}
	public void setSendNum(String sendNum) {
		this.sendNum = sendNum;
	}
	public String getSendSubject() {
		return sendSubject;
	}
	public void setSendSubject(String sendSubject) {
		this.sendSubject = sendSubject;
	}
	public String getSendWriteDate() {
		return sendWriteDate;
	}
	public void setSendWriteDate(String sendWriteDate) {
		this.sendWriteDate = sendWriteDate;
	}
	public String getSendContents() {
		return sendContents;
	}
	public void setSendContents(String sendContents) {
		this.sendContents = sendContents;
	}
	public String getSendReceiver() {
		return sendReceiver;
	}
	public void setSendReceiver(String sendReceiver) {
		this.sendReceiver = sendReceiver;
	}
	public String getSendSender() {
		return sendSender;
	}
	public void setSendSender(String sendSender) {
		this.sendSender = sendSender;
	}
	public String getSendName() {
		return sendName;
	}
	public void setSendName(String sendName) {
		this.sendName = sendName;
	}
	public String getSendFile() {
		return sendFile;
	}
	public void setSendFile(String sendFile) {
		this.sendFile = sendFile;
	}
	@Override
	public String toString() {
		return "SendMsgVO [sendNum=" + sendNum + ", sendSubject=" + sendSubject + ", sendWriteDate=" + sendWriteDate
				+ ", sendContents=" + sendContents + ", sendReceiver=" + sendReceiver + ", sendSender=" + sendSender
				+ ", sendName=" + sendName + ", sendFile=" + sendFile + "]";
	}

	
	
	

}
