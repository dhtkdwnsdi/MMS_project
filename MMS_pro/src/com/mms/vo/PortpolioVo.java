package com.mms.vo;

public class PortpolioVo {
/*
 * @author YUJIN
 */
	
	private String portNum;
	private String subject;
	private String portCate;
	private String portDetailCate;
	private String portContents;
	private String portStartDate;
	private String portEndDate;
	private String portFile;
	private String connectSkill;
	private String rate;
	private String progNum;
	public String getPortNum() {
		return portNum;
	}
	public void setPortNum(String portNum) {
		this.portNum = portNum;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPortCate() {
		return portCate;
	}
	public void setPortCate(String portCate) {
		this.portCate = portCate;
	}
	public String getPortDetailCate() {
		return portDetailCate;
	}
	public void setPortDetailCate(String portDetailCate) {
		this.portDetailCate = portDetailCate;
	}
	public String getPortContents() {
		return portContents;
	}
	public void setPortContents(String portContents) {
		this.portContents = portContents;
	}
	public String getPortStartDate() {
		return portStartDate;
	}
	public void setPortStartDate(String portStartDate) {
		this.portStartDate = portStartDate;
	}
	public String getPortEndDate() {
		return portEndDate;
	}
	public void setPortEndDate(String portEndDate) {
		this.portEndDate = portEndDate;
	}
	public String getPortFile() {
		return portFile;
	}
	public void setPortFile(String portFile) {
		this.portFile = portFile;
	}
	public String getConnectSkill() {
		return connectSkill;
	}
	public void setConnectSkill(String connectSkill) {
		this.connectSkill = connectSkill;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getProgNum() {
		return progNum;
	}
	public void setProgNum(String progNum) {
		this.progNum = progNum;
	}
	@Override
	public String toString() {
		return "PortpolioVo [portNum=" + portNum + ", subject=" + subject + ", portCate=" + portCate
				+ ", portDetailCate=" + portDetailCate + ", portContents=" + portContents + ", portStartDate="
				+ portStartDate + ", portEndDate=" + portEndDate + ", portFile=" + portFile + ", connectSkill="
				+ connectSkill + ", rate=" + rate + ", progNum=" + progNum + "]";
	}

	
	
}
