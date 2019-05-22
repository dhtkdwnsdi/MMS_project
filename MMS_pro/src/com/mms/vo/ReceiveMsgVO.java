package com.mms.vo;

public class ReceiveMsgVO {

	private String receiveNum;
	private String receiveSubject;
	private String receiveWriteDate;
	private String receiveContents;
	private String receiveReceiver;
	private String receiveSender;
	public String getReceiveNum() {
		return receiveNum;
	}
	public void setReceiveNum(String receiveNum) {
		this.receiveNum = receiveNum;
	}
	public String getReceiveSubject() {
		return receiveSubject;
	}
	public void setReceiveSubject(String receiveSubject) {
		this.receiveSubject = receiveSubject;
	}
	public String getReceiveWriteDate() {
		return receiveWriteDate;
	}
	public void setReceiveWriteDate(String receiveWriteDate) {
		this.receiveWriteDate = receiveWriteDate;
	}
	public String getReceiveContents() {
		return receiveContents;
	}
	public void setReceiveContents(String receiveContents) {
		this.receiveContents = receiveContents;
	}
	public String getReceiveReceiver() {
		return receiveReceiver;
	}
	public void setReceiveReceiver(String receiveReceiver) {
		this.receiveReceiver = receiveReceiver;
	}
	public String getReceiveSender() {
		return receiveSender;
	}
	public void setReceiveSender(String receiveSender) {
		this.receiveSender = receiveSender;
	}
	@Override
	public String toString() {
		return "ReceiveMsgVO [receiveNum=" + receiveNum + ", receiveSubject=" + receiveSubject + ", receiveWriteDate="
				+ receiveWriteDate + ", receiveContents=" + receiveContents + ", receiveReceiver=" + receiveReceiver
				+ ", receiveSender=" + receiveSender + "]";
	}
	
	
}
