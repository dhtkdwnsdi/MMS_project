package com.mms.vo;

public class ProjectVO {
	private String projNum;		// 프로젝트 번호
	private String projName;	// 프로젝트 명
	private String projCate;	// 프로젝트 분류 (개발, ..)
	private String projDetailCate; // 프로젝트 세분류 (웹, 앱, ..)
	private String startDuedate;	// 프로젝트 시작 예정일
	private String endDuedate;		// 프로젝트 종료 예정일
	private String deadline;		// 프로젝트 모집 마감일
	private String contents;			// 프로젝트 내용
	private String partiFormCode;	// 프로젝트 참여 형태 (하도급, 주관, ..)
	private String fwCode;			// 프레임워크 코드 (Spring, MVC,..)
	private String dbmsCode;		// 데이터베이스 관리 시스템 코드 (Oracle, MySql, ..)
	private String osCode;			// 운영체제 코드 (window, ..)
	private String levelCode;		// 프로젝트 난이도 코드 (상, 중, 하)
	private String projFile;		// 프로젝트 관련 첨부 파일
	private String progNum;			// 프로그래머 번호, 담당자
	
	
	public String getProjNum() {
		return projNum;
	}
	public void setProjNum(String projNum) {
		this.projNum = projNum;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public String getProjCate() {
		return projCate;
	}
	public void setProjCate(String projCate) {
		this.projCate = projCate;
	}
	public String getProjDetailCate() {
		return projDetailCate;
	}
	public void setProjDetailCate(String projDetailCate) {
		this.projDetailCate = projDetailCate;
	}
	public String getStartDuedate() {
		return startDuedate;
	}
	public void setStartDuedate(String startDuedate) {
		this.startDuedate = startDuedate;
	}
	public String getEndDuedate() {
		return endDuedate;
	}
	public void setEndDuedate(String endDuedate) {
		this.endDuedate = endDuedate;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getPartiFormCode() {
		return partiFormCode;
	}
	public void setPartiFormCode(String partiFormCode) {
		this.partiFormCode = partiFormCode;
	}
	public String getFwCode() {
		return fwCode;
	}
	public void setFwCode(String fwCode) {
		this.fwCode = fwCode;
	}
	public String getDbmsCode() {
		return dbmsCode;
	}
	public void setDbmsCode(String dbmsCode) {
		this.dbmsCode = dbmsCode;
	}
	public String getOsCode() {
		return osCode;
	}
	public void setOsCode(String osCode) {
		this.osCode = osCode;
	}
	public String getLevelCode() {
		return levelCode;
	}
	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}
	public String getProjFile() {
		return projFile;
	}
	public void setProjFile(String projFile) {
		this.projFile = projFile;
	}
	public String getProgNum() {
		return progNum;
	}
	public void setProgNum(String progNum) {
		this.progNum = progNum;
	}
	@Override
	public String toString() {
		return "ProjectVO [projNum=" + projNum + ", projName=" + projName + ", projCate=" + projCate
				+ ", projDetailCate=" + projDetailCate + ", startDuedate=" + startDuedate + ", endDuedate=" + endDuedate
				+ ", deadline=" + deadline + ", contents=" + contents + ", partiFormCode=" + partiFormCode + ", fwCode="
				+ fwCode + ", dbmsCode=" + dbmsCode + ", osCode=" + osCode + ", levelCode=" + levelCode + ", projFile="
				+ projFile + ", progNum=" + progNum + "]";
	}
	
	
	
	
	
		
}
