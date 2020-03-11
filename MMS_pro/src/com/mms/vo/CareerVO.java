package com.mms.vo;

public class CareerVO {
	private String careerNum;
	private String companyName;
	private String department;
	private String position;
	private String joinDate;
	private String retireDate;
	private String progNum;
	
	public CareerVO() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCareerNum() {
		return careerNum;
	}
	public void setCareerNum(String careerNum) {
		this.careerNum = careerNum;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getRetireDate() {
		return retireDate;
	}
	public void setRetireDate(String retireDate) {
		this.retireDate = retireDate;
	}
	public String getProgNum() {
		return progNum;
	}
	public void setProgNum(String progNum) {
		this.progNum = progNum;
	}
	@Override
	public String toString() {
		return "CareerVO [careerNum=" + careerNum + ", companyName=" + companyName + ", department=" + department
				+ ", position=" + position + ", joinDate=" + joinDate + ", retireDate=" + retireDate + ", progNum="
				+ progNum + "]";
	}
	
	
	
}
