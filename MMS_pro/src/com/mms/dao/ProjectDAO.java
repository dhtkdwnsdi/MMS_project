package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DBManager;

import com.mms.vo.ApplyStmtVO;
import com.mms.vo.ProgrammerVO;
import com.mms.vo.ProjectVO;

public class ProjectDAO extends DBManager {

	private ProjectDAO() {
	      
	   }
	   
	   public static ProjectDAO instance = new ProjectDAO();
	   
	   public static ProjectDAO getInstance() {
	      if(instance == null) {
	         instance = new ProjectDAO();
	      }
	      return instance;
	   }
	   
// 프로젝트 등록 메소드
	   public int registerProject(ProjectVO pVo) {
		   int res = 0;
		   
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   ResultSet rs = null;
		   
		   String sql = "INSERT INTO TBL_PROJECT("
		   		+ "		 PROJ_NAME"
		   		+ ",	 PROJ_CATE"
		   		+ ",	 PROJ_DETAIL_CATE"
		   		+ ",	 START_DUEDATE"
		   		+ ",	 END_DUEDATE"
		   		+ ",	 DEADLINE"
		   		+ ",	 CONTENTS"
		   		+ ",	 PARTI_FORM_CODE"
		   		+ ",	 FW_CODE"
		   		+ ",	 DBMS_CODE"
		   		+ ",	 OS_CODE"
		   		+ ",	 LEVEL_CODE"
		   		+ ",	 PROJ_FILE"
		   		+ ",	 PROG_NUM"
		   		+ ",	 RECRUIT_NUMBER)"
		   		+ "		 VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql, pstmt.RETURN_GENERATED_KEYS);
			   
			   pstmt.setString(1, pVo.getProjName());
			   pstmt.setString(2, pVo.getProjCate());
			   pstmt.setString(3, pVo.getProjDetailCate());
			   pstmt.setString(4, pVo.getStartDuedate());
			   pstmt.setString(5, pVo.getEndDuedate());
			   pstmt.setString(6, pVo.getDeadline());
			   pstmt.setString(7, pVo.getContents());
			   pstmt.setString(8, pVo.getPartiFormCode());
			   pstmt.setString(9, pVo.getFwCode());
			   pstmt.setString(10, pVo.getDbmsCode());
			   pstmt.setString(11, pVo.getOsCode());
			   pstmt.setString(12, pVo.getLevelCode());
			   pstmt.setString(13, pVo.getProjFile());
			   pstmt.setString(14, pVo.getProgNum());
			   pstmt.setString(15, pVo.getRecruitNumber());
			   
			   pstmt.executeUpdate();
			   
			   // 등록 후 AUTO_INCREMENT 한 키 값을 반환
			   rs = pstmt.getGeneratedKeys();
			   rs.next();
			   res = rs.getInt(1);
			   
			   
		   } catch (SQLException e) {
			   res = 0;
			   e.printStackTrace();
			   
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		   return res;
		   
	   }
	   

// 프로젝트 수정 메소드
	   
	   public void updateProject(ProjectVO pVo) {
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   
		   String sql = "UPDATE TBL_PROJECT SET"
		   		+ "		 PROJ_NAME = ?"
		   		+ ",	 PROJ_CATE = ?"
		   		+ ",	 PROJ_DETAIL_CATE = ?"
		   		+ ",	 START_DUEDATE = ?"
		   		+ ",	 END_DUEDATE = ?"
		   		+ ",     DEADLINE = ?"
		   		+ ",	 CONTENTS = ?"
		   		+ ",	 PARTI_FORM_CODE = ?"
		   		+ ",	 FW_CODE = ?"
		   		+ ",	 DBMS_CODE = ?"
		   		+ ",	 OS_CODE = ?"
		   		+ ",	 LEVEL_CODE = ?"
		   		+ ",	 PROJ_FILE = ?"
		   		+ ",	 RECRUIT_NUMBER = ?"
		   		+ "		 WHERE PROJ_NUM = ?";
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   
			   pstmt.setString(1, pVo.getProjName());
			   pstmt.setString(2, pVo.getProjCate());
			   pstmt.setString(3, pVo.getProjDetailCate());
			   pstmt.setString(4, pVo.getStartDuedate());
			   pstmt.setString(5, pVo.getEndDuedate());
			   pstmt.setString(6, pVo.getDeadline());
			   pstmt.setString(7, pVo.getContents());
			   pstmt.setString(8, pVo.getPartiFormCode());
			   pstmt.setString(9, pVo.getFwCode());
			   pstmt.setString(10, pVo.getDbmsCode());
			   pstmt.setString(11, pVo.getOsCode());
			   pstmt.setString(12, pVo.getLevelCode());
			   pstmt.setString(13, pVo.getProjFile());
			   pstmt.setString(14, pVo.getRecruitNumber());
			   pstmt.setString(15, pVo.getProjNum());
			   
			   pstmt.executeUpdate();
		   } catch (SQLException e) {
			   e.printStackTrace();
			   
		   } finally {
			   try {
				   if(pstmt != null) pstmt.close();
				   if(conn != null) conn.close();
				   
			   } catch (Exception e) {
				   	e.printStackTrace();

			   }
		}
		   
	   }

	   
// 프로젝트 삭제 메소드
	   
	   public void deleteProject(String projNum) {
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   
		   String sql = "DELETE FROM TBL_PROJECT WHERE PROJ_NUM = ?";
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   
			   pstmt.setString(1, projNum);
			   
			   pstmt.executeUpdate();
			   
		   } catch (SQLException e) {
			   e.printStackTrace();

		   } finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		   
	   }
	   

// 프로젝트 전체 리스트 메소드
	   public ArrayList<ProjectVO> projectList(){
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   ResultSet rs = null;
		   
		   String sql = "SELECT PJ.PROJ_NUM AS PROJ_NUM"
		   		+ "           , PJ.PROJ_NAME AS PROJ_NAME"
		   		+ "			  , PJ.PROJ_CATE AS PROJ_CATE"
		   		+ "			  , PJ.PROJ_DETAIL_CATE AS PROJ_DETAIL_CATE"
		   		+ "			  , PJ.START_DUEDATE AS START_DUEDATE"
		   		+ "			  , PJ.END_DUEDATE AS END_DUEDATE"
		   		+ "			  , PJ.DEADLINE AS DEADLINE"
		   		+ "			  , PJ.CONTENTS AS CONTENTS"
		   		+ "			  , PJ.PARTI_FORM_CODE AS PARTI_FORM_CODE"
		   		+ "			  , PJ.FW_CODE AS FW_CODE"
		   		+ "			  , PJ.DBMS_CODE AS DBMS_CODE"
		   		+ "			  , PJ.OS_CODE AS OS_CODE"
		   		+ "			  , PJ.LEVEL_CODE AS LEVEL_CODE"
		   		+ "			  , PJ.PROJ_FILE AS PROJ_FILE"
		   		+ "			  , PJ.PROJ_STAT AS PROJ_STAT"
		   		+ "			  , PG.NAME AS PROG_NAME"
		   		+ "			  , PJ.RECRUIT_NUMBER AS RECRUIT_NUMBER"
		   		+ "        FROM TBL_PROJECT PJ, TBL_PROGRAMMER PG"
		   		+ "		  WHERE PJ.PROG_NUM = PG.PROG_NUM"
		   		+ "    ORDER BY PROJ_NUM DESC";
		   ArrayList<ProjectVO> list = new ArrayList<ProjectVO>();
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   rs = pstmt.executeQuery();
			   
			   while(rs.next()) {
				   ProjectVO pVo = new ProjectVO();
				   pVo.setProjNum(rs.getString("PROJ_NUM"));
				   pVo.setProjName(rs.getString("PROJ_NAME"));
				   pVo.setProjCate(rs.getString("PROJ_CATE"));
				   pVo.setProjDetailCate(rs.getString("PROJ_DETAIL_CATE"));
				   pVo.setStartDuedate(rs.getString("START_DUEDATE"));
				   pVo.setEndDuedate(rs.getString("END_DUEDATE"));
				   pVo.setDeadline(rs.getString("DEADLINE"));
				   pVo.setContents(rs.getString("CONTENTS"));
				   pVo.setPartiFormCode(rs.getString("PARTI_FORM_CODE"));
				   pVo.setFwCode(rs.getString("FW_CODE"));
				   pVo.setDbmsCode(rs.getString("DBMS_CODE"));
				   pVo.setOsCode(rs.getString("OS_CODE"));
				   pVo.setLevelCode(rs.getString("LEVEL_CODE"));
				   pVo.setProjFile(rs.getString("PROJ_FILE"));
				   pVo.setProjStat(rs.getString("PROJ_STAT"));
//				   pVo.setProgNum(rs.getString("PROG_NUM"));
				   pVo.setProgName(rs.getString("PROG_NAME"));
				   pVo.setRecruitNumber(rs.getString("RECRUIT_NUMBER"));
				   
				   list.add(pVo);
			   }
		   } catch (SQLException e) {
			   e.printStackTrace();
		   
		   } finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		   return list;
	   }
	   
	   // 프로젝트 신청 리스트 - 모집만 띄우기
	   public ArrayList<ProjectVO> projectApplyList(String progNum){
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   ResultSet rs = null;
		   
		   String sql = "SELECT PJ.PROJ_NUM AS PROJ_NUM" + 
			   		"	           ,PJ.PROJ_CATE AS PROJ_CATE" + 
			   		"              ,PJ.PROJ_DETAIL_CATE AS PROJ_DETAIL_CATE"
			   		+ "			   ,PJ.PROJ_NAME AS PROJ_NAME" + 
			   		"              ,PJ.DEADLINE AS DEADLINE" + 
			   		"              ,PJ.START_DUEDATE AS START_DUEDATE" + 
			   		"              ,PJ.END_DUEDATE AS END_DUEDATE" + 
			   		"              ,PG.NAME AS PROG_NAME" + 
			   		"              ,PJ.PROJ_STAT AS PROJ_STAT"
			   		+ "			   ,PJ.CONTENTS AS CONTENTS"
			   		+ "			   ,PJ.PARTI_FORM_CODE AS PARTI_FORM_CODE"
			   		+ "			   ,PJ.FW_CODE AS FW_CODE"
			   		+ "			   ,PJ.DBMS_CODE AS DBMS_CODE"
			   		+ "			   ,PJ.OS_CODE AS OS_CODE"
			   		+ "			   ,PJ.LEVEL_CODE AS LEVEL_CODE"
			   		+ "			   ,PJ.PROJ_FILE AS PROJ_FILE"
			   		+ "			   ,PJ.PROG_NUM AS PROG_NUM"
			   		+ "			   ,PJ.RECRUIT_NUMBER AS RECRUIT_NUMBER" + 
			   		"          FROM TBL_PROJECT PJ" + 
			   		"			   ,TBL_PROGRAMMER PG" + 
			   		"  		   WHERE PG.PROG_NUM = PJ.PROG_NUM"
			   		+ "			 AND PJ.PROJ_STAT LIKE '%모집%'"
			   		+ "			 AND PJ.PROJ_NUM NOT IN (SELECT PROJ_NUM FROM TBL_APPLY_STMT WHERE PROG_NUM = ?)"
			   		+ "		   ORDER BY PJ.PROJ_NUM DESC";
		   ArrayList<ProjectVO> list = new ArrayList<ProjectVO>();
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, progNum);
			   rs = pstmt.executeQuery();
			   
			   while(rs.next()) {
				   ProjectVO pVo = new ProjectVO();
				   pVo.setProjNum(rs.getString("PROJ_NUM"));
				   pVo.setProjName(rs.getString("PROJ_NAME"));
				   pVo.setProjCate(rs.getString("PROJ_CATE"));
				   pVo.setProjDetailCate(rs.getString("PROJ_DETAIL_CATE"));
				   pVo.setStartDuedate(rs.getString("START_DUEDATE"));
				   pVo.setEndDuedate(rs.getString("END_DUEDATE"));
				   pVo.setDeadline(rs.getString("DEADLINE"));
				   pVo.setContents(rs.getString("CONTENTS"));
				   pVo.setPartiFormCode(rs.getString("PARTI_FORM_CODE"));
				   pVo.setFwCode(rs.getString("FW_CODE"));
				   pVo.setDbmsCode(rs.getString("DBMS_CODE"));
				   pVo.setOsCode(rs.getString("OS_CODE"));
				   pVo.setLevelCode(rs.getString("LEVEL_CODE"));
				   pVo.setProjFile(rs.getString("PROJ_FILE"));
				   pVo.setProjStat(rs.getString("PROJ_STAT"));
				   pVo.setProgNum(rs.getString("PROG_NUM"));
				   pVo.setProgName(rs.getString("PROG_NAME"));
				   pVo.setRecruitNumber(rs.getString("RECRUIT_NUMBER"));
				   
				   list.add(pVo);
			   }
		   } catch (SQLException e) {
			   e.printStackTrace();
		   
		   } finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		   return list;
	   }
	   
	   
	// 프로젝트 해당 PM의 프로젝트 리스트 메소드,  내가 등록한 프로젝트만 보는 메소드
	   public ArrayList<ProjectVO> myProjectList(String progNum){
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   ResultSet rs = null;
		   
		   String sql = "SELECT PJ.PROJ_NUM AS PROJ_NUM" + 
		   		"	           ,PJ.PROJ_CATE AS PROJ_CATE" + 
		   		"              ,PJ.PROJ_DETAIL_CATE AS PROJ_DETAIL_CATE"
		   		+ "			   ,PJ.PROJ_NAME AS PROJ_NAME" + 
		   		"              ,PJ.DEADLINE AS DEADLINE" + 
		   		"              ,PJ.START_DUEDATE AS START_DUEDATE" + 
		   		"              ,PJ.END_DUEDATE AS END_DUEDATE" + 
		   		"              ,PG.NAME AS PROG_NAME" + 
		   		"              ,PJ.PROJ_STAT AS PROJ_STAT"
		   		+ "			   ,PJ.CONTENTS AS CONTENTS"
		   		+ "			   ,PJ.PARTI_FORM_CODE AS PARTI_FORM_CODE"
		   		+ "			   ,PJ.FW_CODE AS FW_CODE"
		   		+ "			   ,PJ.DBMS_CODE AS DBMS_CODE"
		   		+ "			   ,PJ.OS_CODE AS OS_CODE"
		   		+ "			   ,PJ.LEVEL_CODE AS LEVEL_CODE"
		   		+ "			   ,PJ.PROJ_FILE AS PROJ_FILE"
		   		+ "			   ,PJ.PROG_NUM AS PROG_NUM"
		   		+ "			   ,PJ.RECRUIT_NUMBER AS RECRUIT_NUMBER" + 
		   		"          FROM TBL_PROJECT PJ" + 
		   		"			   ,TBL_PROGRAMMER PG" + 
		   		"  		   WHERE PG.PROG_NUM = ?"
		   		+ "			 AND PG.PROG_NUM = PJ.PROG_NUM"
		   		+ "		   ORDER BY PJ.PROJ_NUM DESC";
		   
		   ArrayList<ProjectVO> list = new ArrayList<ProjectVO>();
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, progNum);
			   rs = pstmt.executeQuery();
			   
			   while(rs.next()) {
				   ProjectVO pVo = new ProjectVO();
				   pVo.setProjNum(rs.getString("PROJ_NUM"));
				   pVo.setProjName(rs.getString("PROJ_NAME"));
				   pVo.setProjCate(rs.getString("PROJ_CATE"));
				   pVo.setProjDetailCate(rs.getString("PROJ_DETAIL_CATE"));
				   pVo.setStartDuedate(rs.getString("START_DUEDATE"));
				   pVo.setEndDuedate(rs.getString("END_DUEDATE"));
				   pVo.setDeadline(rs.getString("DEADLINE"));
				   pVo.setContents(rs.getString("CONTENTS"));
				   pVo.setPartiFormCode(rs.getString("PARTI_FORM_CODE"));
				   pVo.setFwCode(rs.getString("FW_CODE"));
				   pVo.setDbmsCode(rs.getString("DBMS_CODE"));
				   pVo.setOsCode(rs.getString("OS_CODE"));
				   pVo.setLevelCode(rs.getString("LEVEL_CODE"));
				   pVo.setProjFile(rs.getString("PROJ_FILE"));
				   pVo.setProjStat(rs.getString("PROJ_STAT"));
				   pVo.setProgName(rs.getString("PROG_NAME"));
				   pVo.setProgNum(rs.getString("PROG_NUM"));
				   pVo.setRecruitNumber(rs.getString("RECRUIT_NUMBER"));
				   
				   list.add(pVo);
			   }
		   } catch (SQLException e) {
			   e.printStackTrace();
		   
		   } finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		   return list;
	   }
	   
	   public ArrayList<ProjectVO> ProjectDeployList(String progNum){
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   ResultSet rs = null;
		   
		   String sql = "SELECT PJ.PROJ_NUM AS PROJ_NUM" + 
		   		"	           ,PJ.PROJ_CATE AS PROJ_CATE" + 
		   		"              ,PJ.PROJ_DETAIL_CATE AS PROJ_DETAIL_CATE"
		   		+ "			   ,PJ.PROJ_NAME AS PROJ_NAME" + 
		   		"              ,PJ.DEADLINE AS DEADLINE" + 
		   		"              ,PJ.START_DUEDATE AS START_DUEDATE" + 
		   		"              ,PJ.END_DUEDATE AS END_DUEDATE" + 
		   		"              ,PG.NAME AS PROG_NAME" + 
		   		"              ,PJ.PROJ_STAT AS PROJ_STAT"
		   		+ "			   ,PJ.CONTENTS AS CONTENTS"
		   		+ "			   ,PJ.PARTI_FORM_CODE AS PARTI_FORM_CODE"
		   		+ "			   ,PJ.FW_CODE AS FW_CODE"
		   		+ "			   ,PJ.DBMS_CODE AS DBMS_CODE"
		   		+ "			   ,PJ.OS_CODE AS OS_CODE"
		   		+ "			   ,PJ.LEVEL_CODE AS LEVEL_CODE"
		   		+ "			   ,PJ.PROJ_FILE AS PROJ_FILE"
		   		+ "			   ,PJ.PROG_NUM AS PROG_NUM"
		   		+ "			   ,PJ.RECRUIT_NUMBER AS RECRUIT_NUMBER" + 
		   		"          FROM TBL_PROJECT PJ" + 
		   		"			   ,TBL_PROGRAMMER PG" + 
		   		"  		   WHERE PG.PROG_NUM = ?"
		   		+ "			 AND PG.PROG_NUM = PJ.PROG_NUM"
		   		+ "			 AND PJ.PROJ_STAT NOT LIKE '종료'"
		   		+ "		   ORDER BY PJ.PROJ_NUM DESC";
		   
		   ArrayList<ProjectVO> list = new ArrayList<ProjectVO>();
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, progNum);
			   rs = pstmt.executeQuery();
			   
			   while(rs.next()) {
				   ProjectVO pVo = new ProjectVO();
				   pVo.setProjNum(rs.getString("PROJ_NUM"));
				   pVo.setProjName(rs.getString("PROJ_NAME"));
				   pVo.setProjCate(rs.getString("PROJ_CATE"));
				   pVo.setProjDetailCate(rs.getString("PROJ_DETAIL_CATE"));
				   pVo.setStartDuedate(rs.getString("START_DUEDATE"));
				   pVo.setEndDuedate(rs.getString("END_DUEDATE"));
				   pVo.setDeadline(rs.getString("DEADLINE"));
				   pVo.setContents(rs.getString("CONTENTS"));
				   pVo.setPartiFormCode(rs.getString("PARTI_FORM_CODE"));
				   pVo.setFwCode(rs.getString("FW_CODE"));
				   pVo.setDbmsCode(rs.getString("DBMS_CODE"));
				   pVo.setOsCode(rs.getString("OS_CODE"));
				   pVo.setLevelCode(rs.getString("LEVEL_CODE"));
				   pVo.setProjFile(rs.getString("PROJ_FILE"));
				   pVo.setProjStat(rs.getString("PROJ_STAT"));
				   pVo.setProgName(rs.getString("PROG_NAME"));
				   pVo.setProgNum(rs.getString("PROG_NUM"));
				   pVo.setRecruitNumber(rs.getString("RECRUIT_NUMBER"));
				   
				   list.add(pVo);
			   }
		   } catch (SQLException e) {
			   e.printStackTrace();
		   
		   } finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		   return list;
	   }


// 프로젝트 상세 보기 메소드
	   public ProjectVO viewProject(String projNum) {
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   ResultSet rs = null;
		   ProjectVO pVo = null;
		   
		   String sql = "SELECT PJ.PROJ_NUM AS PROJ_NUM" + 
			   		"	           ,PJ.PROJ_CATE AS PROJ_CATE" + 
			   		"              ,PJ.PROJ_DETAIL_CATE AS PROJ_DETAIL_CATE"
			   		+ "			   ,PJ.PROJ_NAME AS PROJ_NAME" + 
			   		"              ,PJ.DEADLINE AS DEADLINE" + 
			   		"              ,PJ.START_DUEDATE AS START_DUEDATE" + 
			   		"              ,PJ.END_DUEDATE AS END_DUEDATE" + 
			   		"              ,PG.NAME AS PROG_NAME" + 
			   		"              ,PJ.PROJ_STAT AS PROJ_STAT"
			   		+ "			   ,PJ.CONTENTS AS CONTENTS"
			   		+ "			   ,PJ.PARTI_FORM_CODE AS PARTI_FORM_CODE"
			   		+ "			   ,PJ.FW_CODE AS FW_CODE"
			   		+ "			   ,PJ.DBMS_CODE AS DBMS_CODE"
			   		+ "			   ,PJ.OS_CODE AS OS_CODE"
			   		+ "			   ,PJ.LEVEL_CODE AS LEVEL_CODE"
			   		+ "			   ,PJ.PROJ_FILE AS PROJ_FILE"
			   		+ "			   ,PJ.PROG_NUM AS PROG_NUM"
			   		+ "			   ,PJ.RECRUIT_NUMBER AS RECRUIT_NUMBER" + 
			   		"          FROM TBL_PROJECT PJ" + 
			   		"			   ,TBL_PROGRAMMER PG" + 
			   		"  		   WHERE PJ.PROJ_NUM = ?"
			   		+ "			 AND PJ.PROG_NUM = PG.PROG_NUM";
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, projNum);
			   rs = pstmt.executeQuery();
			   
			   if(rs.next()) {
				   pVo = new ProjectVO();
				   
				   pVo.setProjNum(rs.getString("PROJ_NUM"));
				   pVo.setProjName(rs.getString("PROJ_NAME"));
				   pVo.setProjCate(rs.getString("PROJ_CATE"));
				   pVo.setProjDetailCate(rs.getString("PROJ_DETAIL_CATE"));
				   pVo.setStartDuedate(rs.getString("START_DUEDATE"));
				   pVo.setEndDuedate(rs.getString("END_DUEDATE"));
				   pVo.setDeadline(rs.getString("DEADLINE"));
				   pVo.setContents(rs.getString("CONTENTS"));
				   pVo.setPartiFormCode(rs.getString("PARTI_FORM_CODE"));
				   pVo.setFwCode(rs.getString("FW_CODE"));
				   pVo.setDbmsCode(rs.getString("DBMS_CODE"));
				   pVo.setOsCode(rs.getString("OS_CODE"));
				   pVo.setLevelCode(rs.getString("LEVEL_CODE"));
				   pVo.setProjFile(rs.getString("PROJ_FILE"));
				   pVo.setProjStat(rs.getString("PROJ_STAT"));
				   pVo.setProgName(rs.getString("PROG_NAME"));
				   pVo.setProgNum(rs.getString("PROG_NUM"));
				   pVo.setRecruitNumber(rs.getString("RECRUIT_NUMBER"));
				   
			   }
			   
		   } catch (SQLException e) {
			   e.printStackTrace();
			   
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			
		}
		   return pVo;
		   
	   }
	   
	   // 내 진행 중인 프로젝트 내역 조회
	   public ArrayList<ApplyStmtVO> myProgressProjectList(String progNum){
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   ResultSet rs = null;
		   String sql ="SELECT PJ.PROJ_NAME AS PROJ_NAME" + 
		   		"     , PG.NAME AS PROG_NAME"
		   		+ "	  , AP.APPLY_POSITION AS APPLY_POSITION" + 
		   		"     , PJ.PROJ_STAT AS PROJ_STAT"
		   		+ "   , PJ.PROJ_NUM AS PROJ_NUM"
		   		+ "	  , PJ.PROG_NUM AS PROG_NUM" + 
		   		"  FROM TBL_PROJECT PJ" + 
		   		"     , TBL_PROGRAMMER PG" + 
		   		"     , TBL_APPLY_STMT AP" + 
		   		" WHERE PJ.PROG_NUM = PG.PROG_NUM" + 
		   		"   AND AP.PROJ_NUM = PJ.PROJ_NUM" + 
		   		"   AND PJ.PROJ_STAT LIKE '%진행%'" + 
		   		"   AND AP.APPLY_STAT LIKE '승인'" + 
		   		"   AND AP.PROG_NUM = ?"
		   		+ "	ORDER BY PJ.PROJ_NUM DESC";
		   
		   ArrayList<ApplyStmtVO> list = new ArrayList<ApplyStmtVO>();
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, progNum);
			   rs = pstmt.executeQuery();
			   
			   while(rs.next()) {
				   ApplyStmtVO aVo = new ApplyStmtVO();
				   aVo.setProjName(rs.getString("PROJ_NAME"));
				   aVo.setProgName(rs.getString("PROG_NAME"));
				   aVo.setApplyPosition(rs.getString("APPLY_POSITION"));
				   aVo.setProjStat(rs.getString("PROJ_STAT"));
				   aVo.setProjNum(rs.getString("PROJ_NUM"));
				   aVo.setProgNum(rs.getString("PROG_NUM"));
				   list.add(aVo);
				   
			   }
		   } catch (SQLException e) {
			   e.printStackTrace();
			   
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		   
		   return list;
	   }
	   
	   // 나의 종료된 프로젝트 리스트 보기
	   public ArrayList<ApplyStmtVO> myEndProjectList(String progNum){
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   ResultSet rs = null;
		   ArrayList<ApplyStmtVO> list = new ArrayList<ApplyStmtVO>();
		   String sql = "SELECT PJ.PROJ_NAME AS PROJ_NAME" + 
			   		"     , PG.NAME AS PROG_NAME"
			   		+ "   , AP.APPLY_POSITION AS APPLY_POSITION" + 
			   		"     , PJ.PROJ_STAT AS PROJ_STAT"
			   		+ "   , PJ.PROJ_NUM AS PROJ_NUM"
			   		+ "	  , PJ.PROG_NUM AS PROG_NUM" + 
			   		"  FROM TBL_PROJECT PJ" + 
			   		"     , TBL_PROGRAMMER PG" + 
			   		"     , TBL_APPLY_STMT AP" + 
			   		" WHERE PJ.PROG_NUM = PG.PROG_NUM" + 
			   		"   AND AP.PROJ_NUM = PJ.PROJ_NUM" + 
			   		"   AND PJ.PROJ_STAT LIKE '%종료%'" + 
			   		"   AND AP.APPLY_STAT LIKE '승인'" + 
			   		"   AND AP.PROG_NUM = ?"
			   		+ "	ORDER BY PJ.PROJ_NUM DESC";
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, progNum);
			   rs = pstmt.executeQuery();
			   
			   while(rs.next()) {
				   ApplyStmtVO aVo = new ApplyStmtVO();
				   aVo.setProjName(rs.getString("PROJ_NAME"));
				   aVo.setProgName(rs.getString("PROG_NAME"));
				   aVo.setApplyPosition(rs.getString("APPLY_POSITION"));
				   aVo.setProjStat(rs.getString("PROJ_STAT"));
				   aVo.setProjNum(rs.getString("PROJ_NUM"));
				   aVo.setProgNum(rs.getString("PROG_NUM"));
				   
				   list.add(aVo);
				   
			   }
		   } catch (SQLException e) {
			   e.printStackTrace();
			   
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		   
		   return list;
	   }
	   
	   // 나의 전체 프로젝트 리스트 보기
	   public ArrayList<ApplyStmtVO> myAllProjectList(String progNum){
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   ResultSet rs = null;
		   ArrayList<ApplyStmtVO> list = new ArrayList<ApplyStmtVO>();
		   String sql = "SELECT PJ.PROJ_NAME AS PROJ_NAME" + 
			   		"     , PG.NAME AS PROG_NAME"
			   		+ "   , AP.APPLY_POSITION AS APPLY_POSITION" + 
			   		"     , PJ.PROJ_STAT AS PROJ_STAT"
			   		+ "   , PJ.PROJ_NUM AS PROJ_NUM"
			   		+ "	  , PJ.PROG_NUM AS PROG_NUM" + 
			   		"  FROM TBL_PROJECT PJ" + 
			   		"     , TBL_PROGRAMMER PG" + 
			   		"     , TBL_APPLY_STMT AP" + 
			   		" WHERE PJ.PROG_NUM = PG.PROG_NUM" + 
			   		"   AND AP.PROJ_NUM = PJ.PROJ_NUM" + 
			   		"   AND AP.APPLY_STAT LIKE '승인'" + 
			   		"   AND AP.PROG_NUM = ?"
			   		+ " ORDER BY PJ.PROJ_NUM DESC";
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, progNum);
			   rs = pstmt.executeQuery();
			   
			   while(rs.next()) {
				   ApplyStmtVO aVo = new ApplyStmtVO();
				   aVo.setProjName(rs.getString("PROJ_NAME"));
				   aVo.setProgName(rs.getString("PROG_NAME"));
				   aVo.setApplyPosition(rs.getString("APPLY_POSITION"));
				   aVo.setProjStat(rs.getString("PROJ_STAT"));
				   aVo.setProjNum(rs.getString("PROJ_NUM"));
				   aVo.setProgNum(rs.getString("PROG_NUM"));
				   
				   list.add(aVo);
				   
			   }
		   } catch (SQLException e) {
			   e.printStackTrace();
			   
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		   
		   return list;
	   }
	   
	   // 프로젝트 신청 마감일 지나면 바로 프로젝트 상태 '진행'으로 업데이트
	   public void updateProgressProj() {
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   String sql = "UPDATE TBL_PROJECT"
		   		+ "		    SET PROJ_STAT = '진행'"
		   		+ "		  WHERE PROJ_NUM = "
		   		+ "		(SELECT PROJ_NUM "
		   		+ "		   FROM "
		   		+ "		(SELECT PROJ_NUM"
		   		+ "		   FROM TBL_PROJECT "
		   		+ "		  WHERE CURDATE() - DEADLINE > 0) PROJ_NUM )";
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.executeUpdate();
		   } catch (SQLException e) {
			   e.printStackTrace();
			   
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		   
	   }
	   
	   // 인력배치할 때 모든 프로그래머 띄우기 (PM과 ADMIN 제외)
	   
	   public ArrayList<ProgrammerVO> allProgrammer(){
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   ResultSet rs = null;
		   String sql = "SELECT * FROM TBL_PROGRAMMER PG WHERE PG.GRANT = 0";
		   ArrayList<ProgrammerVO> progList = new ArrayList<ProgrammerVO>();
		   
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   rs = pstmt.executeQuery();
			   
			   while(rs.next()) {
				   ProgrammerVO progVo = new ProgrammerVO();
				   progVo.setProgNum(rs.getString("PROG_NUM"));
				   progVo.setId(rs.getString("ID"));
				   progVo.setName(rs.getString("NAME"));
				   
				   progList.add(progVo);
				   
			   }
		   } catch (SQLException e) {
			   e.printStackTrace();

		   } finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		 return progList;  
		 
	   }
	   
	   // PM이 수동으로 proj_stat 진행으로 수정
	   public void projStatProgressUpdate(String projNum) {
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   String sql = "UPDATE TBL_PROJECT"
		   		+ "		    SET PROJ_STAT = '진행'"
		   		+ "		  WHERE PROJ_NUM = ?";
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, projNum);
			   pstmt.executeUpdate();
			   
		   } catch (SQLException e) {
			   e.printStackTrace();
			   
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	   }
	   
	   // PM이 수동으로 proj_stat 진행으로 수정
	   public void projStatEndUpdate(String projNum) {
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   String sql = "UPDATE TBL_PROJECT"
		   		+ "		    SET PROJ_STAT = '종료'"
		   		+ "		  WHERE PROJ_NUM = ?";
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, projNum);
			   pstmt.executeUpdate();
			   
		   } catch (SQLException e) {
			   e.printStackTrace();
			   
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	   }
	   
	   // PM이 수동으로 proj_stat 진행으로 수정
	   public void projStatApplyUpdate(String projNum) {
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   String sql = "UPDATE TBL_PROJECT"
		   		+ "		    SET PROJ_STAT = '모집'"
		   		+ "		  WHERE PROJ_NUM = ?";
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, projNum);
			   pstmt.executeUpdate();
			   
		   } catch (SQLException e) {
			   e.printStackTrace();
			   
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	   }
	   
	   // project 종료 시 apply_stmt의 prog_state 종료
	   public void endProgStateUpdate(String projNum) {
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   String sql = "UPDATE TBL_APPLY_STMT"
		   		+ "		    SET PROG_STATE = '종료'"
		   		+ "		  WHERE PROJ_NUM = ?";
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, projNum);
			   pstmt.executeUpdate();
			   
		   } catch (SQLException e) {
			   e.printStackTrace();
			   
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	   }
	   
	   // project 진행 시 apply_stmt의 prog_state 진행
	   public void progressProgStateUpdate(String projNum) {
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   String sql = "UPDATE TBL_APPLY_STMT"
		   		+ "		    SET PROG_STATE = '진행'"
		   		+ "		  WHERE PROJ_NUM = ?";
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, projNum);
			   pstmt.executeUpdate();
			   
		   } catch (SQLException e) {
			   e.printStackTrace();
			   
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	   }
	   
	// project 모집 시 apply_stmt의 prog_state 예정
	   public void applyProgStateUpdate(String projNum) {
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   String sql = "UPDATE TBL_APPLY_STMT"
		   		+ "		    SET PROG_STATE = '예정'"
		   		+ "		  WHERE PROJ_NUM = ?";
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, projNum);
			   pstmt.executeUpdate();
			   
		   } catch (SQLException e) {
			   e.printStackTrace();
			   
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	   }
	   
	   
	   // 프로젝트 구성원 메소드
	   public ArrayList<ProgrammerVO> projectMemberList(String projNum){
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   ResultSet rs = null;
		   String sql = "SELECT PROG_NUM FROM TBL_APPLY_STMT WHERE PROJ_NUM = ?";
		   ArrayList<ProgrammerVO> progList = new ArrayList<ProgrammerVO>();
		   
		   
		   try {
			   conn = getConnection();
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, projNum);
			   rs = pstmt.executeQuery();
			   
			   while(rs.next()) {
				   ProgrammerVO progVo = new ProgrammerVO();
				   progVo.setProgNum(rs.getString("PROG_NUM"));
				   progList.add(progVo);
				   
			   }
		   } catch (SQLException e) {
			   e.printStackTrace();

		   } finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		 return progList;  
		 
	   }
	   

}
