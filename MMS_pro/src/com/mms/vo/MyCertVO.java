package com.mms.vo;

public class MyCertVO {
	
	private String myCertNum;
	private String progNum;
	private String certNum;
	private String issueDate;
	private String certSerial;
	
	private String certName;
	private String issueOrg;
	public String getMyCertNum() {
		return myCertNum;
	}
	public void setMyCertNum(String myCertNum) {
		this.myCertNum = myCertNum;
	}
	public String getProgNum() {
		return progNum;
	}
	public void setProgNum(String progNum) {
		this.progNum = progNum;
	}
	public String getCertNum() {
		return certNum;
	}
	public void setCertNum(String certNum) {
		this.certNum = certNum;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getCertSerial() {
		return certSerial;
	}
	public void setCertSerial(String certSerial) {
		this.certSerial = certSerial;
	}
	public String getCertName() {
		return certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getIssueOrg() {
		return issueOrg;
	}
	public void setIssueOrg(String issueOrg) {
		this.issueOrg = issueOrg;
	}
	@Override
	public String toString() {
		return "MyCertVO [myCertNum=" + myCertNum + ", progNum=" + progNum + ", certNum=" + certNum + ", issueDate="
				+ issueDate + ", certSerial=" + certSerial + ", certName=" + certName + ", issueOrg=" + issueOrg + "]";
	}
	
	
}
