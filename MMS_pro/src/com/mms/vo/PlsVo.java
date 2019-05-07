package com.mms.vo;

public class PlsVo {
/*
 * @author YUJIN
 */
	private String plsNum;
	private String plNum;
	private String progNum;
	private String profiency;
	private String experience;
	public String getPlsNum() {
		return plsNum;
	}
	public void setPlsNum(String plsNum) {
		this.plsNum = plsNum;
	}
	public String getPlNum() {
		return plNum;
	}
	public void setPlNum(String plNum) {
		this.plNum = plNum;
	}
	public String getProgNum() {
		return progNum;
	}
	public void setProgNum(String progNum) {
		this.progNum = progNum;
	}
	public String getProfiency() {
		return profiency;
	}
	public void setProfiency(String profiency) {
		this.profiency = profiency;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "PlsVo [plsNum=" + plsNum + ", plNum=" + plNum + ", progNum=" + progNum + ", profiency=" + profiency
				+ ", experience=" + experience + "]";
	}
	
	
}
