package com.mms.vo;

public class UsePlVO {
	private String usePlNum;
	private String plNum;
	private String projNum;
	private String plName;
	
	public String getPlName() {
		return plName;
	}
	public void setPlName(String plName) {
		this.plName = plName;
	}
	public String getUsePlNum() {
		return usePlNum;
	}
	public void setUsePlNum(String usePlNum) {
		this.usePlNum = usePlNum;
	}
	public String getPlNum() {
		return plNum;
	}
	public void setPlNum(String plNum) {
		this.plNum = plNum;
	}
	public String getProjNum() {
		return projNum;
	}
	public void setProjNum(String projNum) {
		this.projNum = projNum;
	}
	@Override
	public String toString() {
		return "UsePlVO [usePlNum=" + usePlNum + ", plNum=" + plNum + ", projNum=" + projNum + ", plName=" + plName
				+ "]";
	}
	
	
	
}
