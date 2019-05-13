package com.mms.vo;

public class PlVO {

	private String plNum;
	private String plName;
	
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
	
	@Override
	public String toString() {
		return "PlVO [plNum=" + plNum + ", plName=" + plName + "]";
	}
	
	
}
