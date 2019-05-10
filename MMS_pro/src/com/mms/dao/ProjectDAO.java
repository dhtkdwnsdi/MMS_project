package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DBManager;
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
	   public void registerProject(ProjectVO pVo) {
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   
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
		   		+ ",	 PROG_NUM)"
		   		+ "		 VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		   
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
			   pstmt.setString(14, pVo.getProgNum());
			   
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
	   

// 프로젝트 수정 메소드
	   
	   public void updateProject(ProjectVO pVo) {
		   Connection conn = null;
		   PreparedStatement pstmt = null;
		   
		   String sql = "UPDATE TBL_PROJECT SET"
		   		+ "		 PROJ_NAME = ?"
		   		+ ",	 PROJ_CATE = ?"
		   		+ ",	 PROJ_DETAIL_CATE = ?"
		   		+ ",	 START_DUECATE = ?"
		   		+ ",	 END_DEUDATE = ?"
		   		+ ",     DEADLINE = ?"
		   		+ ",	 CONTENTS = ?"
		   		+ ",	 PARTI_FORM_CODE = ?"
		   		+ ",	 FW_CODE = ?"
		   		+ ",	 DBMS_CODE = ?"
		   		+ ",	 OS_CODE = ?"
		   		+ ",	 LEVEL_CODE = ?"
		   		+ ",	 PROJ_FILE = ?"
		   		+ ",	 PROJ_STAT = ?"
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
			   pstmt.setString(14, pVo.getProjStat());
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
		   
		   String sql = "SELECT * FROM TBL_PROJECT ORDER BY PROJ_NUM DESC";
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
				   pVo.setProgNum(rs.getString("PROG_NUM"));
				   
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
		   		+ "			   ,PJ.PROG_NUM AS PROG_NUM" + 
		   		"          FROM TBL_PROJECT PJ" + 
		   		"			   ,TBL_PROGRAMMER PG" + 
		   		"  		   WHERE PG.PROG_NUM = ?";
		   
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
			   		+ "			   ,PJ.PROG_NUM AS PROG_NUM" + 
			   		"          FROM TBL_PROJECT PJ" + 
			   		"			   ,TBL_PROGRAMMER PG" + 
			   		"  		   WHERE PJ.PROJ_NUM = ?";
		   
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
	   
}
