package com.mms.vo;

public class ReceiveMsgVO {

	private String receiveNum;
	private String receiveSubject;
	private String receiveWriteDate;
	private String receiveContents;
	private String receiveReceiver;
	private String receiveSender;
	private String receiveName;
	private String receiveFile;
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
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	public String getReceiveFile() {
		return receiveFile;
	}
	public void setReceiveFile(String receiveFile) {
		this.receiveFile = receiveFile;
	}
	@Override
	public String toString() {
		return "ReceiveMsgVO [receiveNum=" + receiveNum + ", receiveSubject=" + receiveSubject + ", receiveWriteDate="
				+ receiveWriteDate + ", receiveContents=" + receiveContents + ", receiveReceiver=" + receiveReceiver
				+ ", receiveSender=" + receiveSender + ", receiveName=" + receiveName + ", receiveFile=" + receiveFile
				+ "]";
	}
	
	
	
}
