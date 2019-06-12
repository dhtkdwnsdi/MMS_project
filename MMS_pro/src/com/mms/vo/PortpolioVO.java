package com.mms.vo;

public class PortpolioVO {

	
	private String portNum;
	private String subject;
	private String organization;
	private String portCate;
	private String portDetailCate;
	private String portContents;
	private String portStartDate;
	private String portEndDate;
	private String rate;
	private String portFile;
	private String plNum;
	private String progNum;
	private String plName;
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
	public String getPlNum() {
		return plNum;
	}
	public void setPlNum(String plNum) {
		this.plNum = plNum;
	}
	public String getPlName() {
		return plName;
	}
	public void setPlName(String plName) {
		this.plName = plName;
	}
	
	
	
	
	public String getPortFile() {
		return portFile;
	}
	public void setPortFile(String portFile) {
		this.portFile = portFile;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	@Override
	public String toString() {
		return "PortpolioVO [portNum=" + portNum + ", subject=" + subject + ", portCate=" + portCate
				+ ", portDetailCate=" + portDetailCate + ", portContents=" + portContents + ", portStartDate="
				+ portStartDate + ", portEndDate=" + portEndDate + ", rate=" + rate + ", progNum=" + progNum
				+ ", plNum=" + plNum + ", plName=" + plName + "]";
	}
	
	
	
}
