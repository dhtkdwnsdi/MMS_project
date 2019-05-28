package com.mms.vo;

public class ProjectVO {
	private String projNum;		// 프로젝트 번호		PK	AI
	private String projName;	// 프로젝트 명		NN
	private String projCate;	// 프로젝트 분류 (개발, ..)	NN
	private String projDetailCate; // 프로젝트 세분류 (웹, 앱, ..)	NN
	private String startDuedate;	// 프로젝트 시작 예정일	NN
	private String endDuedate;		// 프로젝트 종료 예정일	NN
	private String deadline;		// 프로젝트 모집 마감일	NN
	private String contents;			// 프로젝트 내용		N
	private String partiFormCode;	// 프로젝트 참여 형태 (하도급, 주관, ..)	NN
	private String fwCode;			// 프레임워크 코드 (Spring, MVC,..)	NN
	private String dbmsCode;		// 데이터베이스 관리 시스템 코드 (Oracle, MySql, ..)	NN
	private String osCode;			// 운영체제 코드 (window, ..)	NN
	private String levelCode;		// 프로젝트 난이도 코드 (상, 중, 하)	NN
	private String projFile;		// 프로젝트 관련 첨부 파일	N
	private String progNum;			// 프로그래머 번호, 담당자	NN	----	총 15개
	private String projStat;		// 프로젝트 상태 (모집 중, 진행 중, 종료, 보류..)
	private String progName;		// DB에서 조인한 프로그래머 이름 가져오기
	private String recruitNumber;
	
	public String getProgName() {
		return progName;
	}

	public void setProgName(String progName) {
		this.progName = progName;
	}

	public ProjectVO() {
		// TODO Auto-generated constructor stub
	}
	
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

	public String getProjStat() {
		return projStat;
	}

	public void setProjStat(String projStat) {
		this.projStat = projStat;
	}

	public String getRecruitNumber() {
		return recruitNumber;
	}

	public void setRecruitNumber(String recruitNumber) {
		this.recruitNumber = recruitNumber;
	}

	@Override
	public String toString() {
		return "ProjectVO [projNum=" + projNum + ", projName=" + projName + ", projCate=" + projCate
				+ ", projDetailCate=" + projDetailCate + ", startDuedate=" + startDuedate + ", endDuedate=" + endDuedate
				+ ", deadline=" + deadline + ", contents=" + contents + ", partiFormCode=" + partiFormCode + ", fwCode="
				+ fwCode + ", dbmsCode=" + dbmsCode + ", osCode=" + osCode + ", levelCode=" + levelCode + ", projFile="
				+ projFile + ", progNum=" + progNum + ", projStat=" + projStat + ", progName=" + progName
				+ ", recruitNumber=" + recruitNumber + "]";
	}



	
	
	
	
	
	
	
		
}
