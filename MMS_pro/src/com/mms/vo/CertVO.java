package com.mms.vo;

public class CertVO {
	
	private String certNum;
	private String certName;
	private String issueOrg;
	
	public String getCertNum() {
		return certNum;
	}
	public void setCertNum(String certNum) {
		this.certNum = certNum;
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
		return "CertVO [certNum=" + certNum + ", certName=" + certName + ", issueOrg=" + issueOrg + "]";
	}
	
	
	
}
