package com.mms.vo;

public class EduVO {
	private String progNum;
	private String eduNum;
	private String eduCategory;
	private String eduState;
	private String schoolName;
	private String enterDate;
	private String graduateDate;
	private String major;
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getProgNum() {
		return progNum;
	}
	public void setProgNum(String progNum) {
		this.progNum = progNum;
	}
	public String getEduNum() {
		return eduNum;
	}
	public void setEduNum(String eduNum) {
		this.eduNum = eduNum;
	}
	public String getEduCategory() {
		return eduCategory;
	}
	public void setEduCategory(String eduCategory) {
		this.eduCategory = eduCategory;
	}
	public String getEduState() {
		return eduState;
	}
	public void setEduState(String eduState) {
		this.eduState = eduState;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getEnterDate() {
		return enterDate;
	}
	public void setEnterDate(String enterDate) {
		this.enterDate = enterDate;
	}
	public String getGraduateDate() {
		return graduateDate;
	}
	public void setGraduateDate(String graduateDate) {
		this.graduateDate = graduateDate;
	}
	@Override
	public String toString() {
		return "EduVO [progNum=" + progNum + ", eduNum=" + eduNum + ", eduCategory=" + eduCategory + ", eduState="
				+ eduState + ", schoolName=" + schoolName + ", enterDate=" + enterDate + ", graduateDate="
				+ graduateDate + ", major=" + major + "]";
	}
	
	
	
	

	

	
}

