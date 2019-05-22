package com.mms.vo;

public class ApplyStmtVO {
	private String applyStmtNum;
	private String applyStat;
	private String applyPosition;
	private String progNum;
	private String projNum;
	private String progName;
	private String projName;
	private String projStat;
	private String applyDate;
	
	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getProjStat() {
		return projStat;
	}

	public void setProjStat(String projStat) {
		this.projStat = projStat;
	}

	public String getProgName() {
		return progName;
	}

	public void setProgName(String progName) {
		this.progName = progName;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public ApplyStmtVO() {
		// TODO Auto-generated constructor stub
	}
	
	public String getApplyStmtNum() {
		return applyStmtNum;
	}
	public void setApplyStmtNum(String applyStmtNum) {
		this.applyStmtNum = applyStmtNum;
	}
	public String getApplyStat() {
		return applyStat;
	}
	public void setApplyStat(String applyStat) {
		this.applyStat = applyStat;
	}
	public String getApplyPosition() {
		return applyPosition;
	}
	public void setApplyPosition(String applyPosition) {
		this.applyPosition = applyPosition;
	}
	public String getProgNum() {
		return progNum;
	}
	public void setProgNum(String progNum) {
		this.progNum = progNum;
	}
	public String getProjNum() {
		return projNum;
	}
	public void setProjNum(String projNum) {
		this.projNum = projNum;
	}

	@Override
	public String toString() {
		return "ApplyStmtVO [applyStmtNum=" + applyStmtNum + ", applyStat=" + applyStat + ", applyPosition="
				+ applyPosition + ", progNum=" + progNum + ", projNum=" + projNum + ", progName=" + progName
				+ ", projName=" + projName + ", projStat=" + projStat + ", applyDate=" + applyDate + "]";
	}



	
	
}
