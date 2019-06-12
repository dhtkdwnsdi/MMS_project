package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mms.vo.ApplyStmtVO;
import com.mms.vo.ProjectVO;
import com.mms.vo.UsePlVO;

import util.DBManager;

public class ApplyStmtDAO extends DBManager {
	private static ApplyStmtDAO instance = new ApplyStmtDAO();
	
	public static ApplyStmtDAO getInstance() {
		return instance;
	}
	
	// 프로젝트 신청내역 등록
	public void insertApplyStmt(ApplyStmtVO aVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO TBL_APPLY_STMT("
				+ "	  APPLY_POSITION, PROG_NUM, PROJ_NUM)"
				+ "   VALUES(?, ?, ?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, aVo.getApplyPosition());
			pstmt.setString(2, aVo.getProgNum());
			pstmt.setString(3, aVo.getProjNum());
			
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
	// 프로젝트 등록할 때 PM 자동적으로 신청되는 것
	public void insertPMApplyStmt(ApplyStmtVO aVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO TBL_APPLY_STMT("
				+ "	  APPLY_POSITION, PROG_NUM, PROJ_NUM, APPLY_STAT)"
				+ "   VALUES(?, ?, ?, ?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, aVo.getApplyPosition());
			pstmt.setString(2, aVo.getProgNum());
			pstmt.setString(3, aVo.getProjNum());
			pstmt.setString(4, aVo.getApplyStat());
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
	
	// 내 프로젝트 신청내역 전체리스트 보기
	public ArrayList<ApplyStmtVO> myApplyStmtAllList(String progNum){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ApplyStmtVO> list = new ArrayList<ApplyStmtVO>();
		
		String sql = "SELECT PJ.PROJ_NUM AS PROJ_NUM" + 
				"	       , PJ.PROJ_NAME AS PROJ_NAME" + 
				"          , PG.NAME AS PROG_NAME" + 
				"     	   , AP.APPLY_STMT_NUM AS APPLY_STMT_NUM" + 
				"          , AP.APPLY_POSITION AS APPLY_POSITION" + 
				"          , AP.APPLY_STAT AS APPLY_STAT"
				+ "		   , SUBSTR(AP.APPLY_DATE, 1, 10) AS APPLY_DATE" + 
				"       FROM TBL_PROJECT PJ" + 
				"	       , TBL_PROGRAMMER PG" + 
				"          , TBL_APPLY_STMT AP" + 
				" WHERE PJ.PROG_NUM = PG.PROG_NUM" + 
				"   AND PJ.PROJ_NUM = AP.PROJ_NUM"
				/* + " AND PJ.PROJ_STAT LIKE '모집'" */
				/* + " AND PJ.PROJ_STAT NOT LIKE '%진행%'" */
				+ " AND AP.PROG_NUM = ?"
				+ " ORDER BY AP.APPLY_STMT_NUM DESC";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, progNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ApplyStmtVO aVo = new ApplyStmtVO();
				
				aVo.setApplyStmtNum(rs.getString("APPLY_STMT_NUM"));
				aVo.setApplyStat(rs.getString("APPLY_STAT"));
				aVo.setApplyPosition(rs.getString("APPLY_POSITION"));
				aVo.setProjNum(rs.getString("PROJ_NUM"));
				aVo.setProgName(rs.getString("PROG_NAME"));
				aVo.setProjName(rs.getString("PROJ_NAME"));
				aVo.setApplyDate(rs.getString("APPLY_DATE"));
				
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
	
	// 내 프로젝트 신청 대기 리스트
	public ArrayList<ApplyStmtVO> myApplyStmtWaitList(String progNum){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ApplyStmtVO> list = new ArrayList<ApplyStmtVO>();
		
		String sql = "SELECT PJ.PROJ_NUM AS PROJ_NUM" + 
				"	       , PJ.PROJ_NAME AS PROJ_NAME" + 
				"          , PG.NAME AS PROG_NAME" + 
				"     	   , AP.APPLY_STMT_NUM AS APPLY_STMT_NUM" + 
				"          , AP.APPLY_POSITION AS APPLY_POSITION" + 
				"          , AP.APPLY_STAT AS APPLY_STAT"
				+ "		   , SUBSTR(AP.APPLY_DATE, 1, 10) AS APPLY_DATE" + 
				"       FROM TBL_PROJECT PJ" + 
				"	       , TBL_PROGRAMMER PG" + 
				"          , TBL_APPLY_STMT AP" + 
				" WHERE PJ.PROG_NUM = PG.PROG_NUM" + 
				"   AND PJ.PROJ_NUM = AP.PROJ_NUM"
				+ " AND AP.PROG_NUM = ?"
				+ "	AND PJ.PROJ_STAT LIKE '모집'"
				+ "	AND AP.APPLY_STAT LIKE '%승인대기%'"
				+ " ORDER BY AP.APPLY_STMT_NUM DESC";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, progNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ApplyStmtVO aVo = new ApplyStmtVO();
				
				aVo.setApplyStmtNum(rs.getString("APPLY_STMT_NUM"));
				aVo.setApplyStat(rs.getString("APPLY_STAT"));
				aVo.setApplyPosition(rs.getString("APPLY_POSITION"));
				aVo.setProjNum(rs.getString("PROJ_NUM"));
				aVo.setProgName(rs.getString("PROG_NAME"));
				aVo.setProjName(rs.getString("PROJ_NAME"));
				aVo.setApplyDate(rs.getString("APPLY_DATE"));
				
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
	
	// PM 접수 승인 리스트
	public ArrayList<ApplyStmtVO> applyAcceptList(String progNum){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ApplyStmtVO> list = new ArrayList<ApplyStmtVO>();
		
		String sql = " SELECT AP.APPLY_STMT_NUM AS APPLY_STMT_NUM" + 
				"	 		, PJ.PROJ_NAME AS PROJ_NAME" + 
				"    		, PG.NAME AS PROG_NAME"
				+ "			, SUBSTR(AP.APPLY_DATE, 1, 10) AS APPLY_DATE"
				+ "			, AP.APPLY_POSITION AS APPLY_POSITION"
				+ "			, AP.APPLY_STAT AS APPLY_STAT"
				+ "		    , PJ.PROJ_STAT AS PROJ_STAT" + 
				"   	 FROM TBL_PROJECT PJ" + 
				"           , TBL_APPLY_STMT AP" + 
				"           , TBL_PROGRAMMER PG" + 
				"  WHERE PJ.PROJ_NUM = AP.PROJ_NUM" + 
				"    AND AP.PROG_NUM = PG.PROG_NUM" + 
				"    AND PJ.PROG_NUM = ?"
				+ "	AND PJ.PROJ_STAT NOT IN('진행','종료')"
				+ "  AND AP.APPLY_STAT LIKE '%승인대기%'"
				+ "  ORDER BY AP.APPLY_STMT_NUM DESC";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, progNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ApplyStmtVO aVo = new ApplyStmtVO();
				
				aVo.setApplyStmtNum(rs.getString("APPLY_STMT_NUM"));
				aVo.setProjName(rs.getString("PROJ_NAME"));
				aVo.setProgName(rs.getString("PROG_NAME"));
				aVo.setApplyDate(rs.getString("APPLY_DATE"));
				aVo.setApplyPosition(rs.getString("APPLY_POSITION"));
				aVo.setApplyStat(rs.getString("APPLY_STAT"));
				aVo.setProjStat(rs.getString("PROJ_STAT"));
				
				list.add(aVo);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) rs.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			
		}
		return list;
		
	}
	
	// 내 프로젝트에 대한 모든 신청 접수 리스트 띄우기
	public ArrayList<ApplyStmtVO> allApplyStmt(String progNum){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ApplyStmtVO> list = new ArrayList<ApplyStmtVO>();
		String sql = "SELECT AP.APPLY_STMT_NUM AS APPLY_STMT_NUM" + 
				"				, PJ.PROJ_NAME AS PROJ_NAME" + 
				"				, PG.NAME AS PROG_NAME" + 
				"				, SUBSTR(AP.APPLY_DATE, 1, 10) AS APPLY_DATE" + 
				"               , AP.APPLY_POSITION" + 
				"               , PJ.PROJ_STAT"
				+ "				, AP.APPLY_STAT AS APPLY_STAT" + 
				"			    FROM TBL_PROJECT PJ " + 
				"				   , TBL_APPLY_STMT AP" + 
				"				   , TBL_PROGRAMMER PG" + 
				"				WHERE PJ.PROJ_NUM = AP.PROJ_NUM " + 
				"				   AND AP.PROG_NUM = PG.PROG_NUM" + 
				"				AND PJ.PROG_NUM = ?"
				+ "				AND AP.PROG_NUM != ?" +
				"				  ORDER BY AP.APPLY_STMT_NUM DESC";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, progNum);
			pstmt.setString(2, progNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ApplyStmtVO aVo = new ApplyStmtVO();
				aVo.setApplyStmtNum(rs.getString("APPLY_STMT_NUM"));
				aVo.setProjName(rs.getString("PROJ_NAME"));
				aVo.setProgName(rs.getString("PROG_NAME"));
				aVo.setApplyDate(rs.getString("APPLY_DATE"));
				aVo.setApplyPosition(rs.getString("APPLY_POSITION"));
				aVo.setProjStat(rs.getString("PROJ_STAT"));
				aVo.setApplyStat(rs.getString("APPLY_STAT"));
				
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
	
	// 신청 취소 메소드
	public void deleteApplyStmt(String applyStmtNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "DELETE FROM TBL_APPLY_STMT WHERE APPLY_STMT_NUM = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, applyStmtNum);
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
	
	// 프로젝트 접수 승인
	public void acceptApply(String applyStmtNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE TBL_APPLY_STMT SET APPLY_STAT = '승인' WHERE APPLY_STMT_NUM = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, applyStmtNum);
			
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
	
	// 프로젝트 접수 거절
	public void denyApply(String applyStmtNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE TBL_APPLY_STMT SET APPLY_STAT = '거절' WHERE APPLY_STMT_NUM = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, applyStmtNum);
			
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
	
	// 프로젝트 중복신청 예방
	public int applyCheck(ApplyStmtVO aVo) {
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT PROJ_NUM" + 
				"	 	   , PROG_NUM" + 
				"          , APPLY_STAT" + 
				"  FROM TBL_APPLY_STMT" + 
				" WHERE PROJ_NUM = ?" + 
				"   AND PROG_NUM = ?" + 
				"   AND APPLY_STAT LIKE '%승인대기%'";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, aVo.getProjNum());
			pstmt.setString(2, aVo.getProgNum());
			
			rs = pstmt.executeQuery();
			if(aVo.equals("")) {
				// 데이터 null
				result = 0;
			} else if (rs.next()) {
				// 데이터 존재
				result = 1;
				
			} else {
				result = -1;
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
		return result;
		
	}
	
	//프로젝트 구성원 조회
	public ArrayList<ApplyStmtVO> projectMemberList(String projNum){
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		ArrayList<ApplyStmtVO> list = new ArrayList<ApplyStmtVO>();
		String sql = "SELECT AP.APPLY_STMT_NUM AS APPLY_STMT_NUM" + 
				"	 , PG.NAME AS PROG_NAME" + 
				"    , AP.APPLY_POSITION AS APPLY_POSITION"
				+ "	 , AP.PROG_NUM AS PROG_NUM" + 
				"  FROM TBL_APPLY_STMT AP" + 
				"	 , TBL_PROGRAMMER PG" + 
				" WHERE PG.PROG_NUM = AP.PROG_NUM" + 
				"   AND AP.APPLY_STAT LIKE '승인'" + 
				"   AND AP.PROJ_NUM = ?" + 
				"ORDER BY AP.APPLY_STMT_NUM";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, projNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ApplyStmtVO aVo = new ApplyStmtVO();
				aVo.setApplyStmtNum(rs.getString("APPLY_STMT_NUM"));
				aVo.setProgName(rs.getString("PROG_NAME"));
				aVo.setApplyPosition(rs.getString("APPLY_POSITION"));
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
	
	// 신청 승인 시 progState "예정" 업데이트
	public void updateProgState(String applyStmtNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE TBL_APPLY_STMT SET PROG_STATE = '예정' WHERE APPLY_STMT_NUM = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, applyStmtNum);
			
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
	
	// 프로젝트 인력 배치 :: 이미 프로젝트 진행 중일 경우 구성원 조회
	public ArrayList<ApplyStmtVO> progressProjectMemberList(String projNum){
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		ArrayList<ApplyStmtVO> list = new ArrayList<ApplyStmtVO>();
		String sql = "SELECT P.PROG_NUM AS PROG_NUM"
				+ "        , P.ID AS ID"
				+ "        , P.NAME AS PROG_NAME"
				+ "        , P.GRADE AS GRADE"
				+ "        , ifnull(V.PL_NAME, '-') AS PL_NAME"
				+ "     FROM TBL_PROGRAMMER P "
				+ "LEFT OUTER JOIN PLS_LIST_VIEW V "
				+ "ON P.PROG_NUM = V.PROG_NUM "
				+ "JOIN tbl_apply_stmt A "
				+ "ON P.PROG_NUM = A.PROG_NUM "
				+ "WHERE A.PROJ_NUM= ? "
				+ "AND A.APPLY_STAT='승인' "
				+ "AND A.APPLY_POSITION != 'PM'";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, projNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ApplyStmtVO aVo = new ApplyStmtVO();
				aVo.setId(rs.getString("ID"));
				aVo.setProgName(rs.getString("PROG_NAME"));
				aVo.setGrade(rs.getString("GRADE"));
				aVo.setProgNum(rs.getString("PROG_NUM"));
				aVo.setPlName(rs.getString("PL_NAME"));
				
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
	
	// 기본 추천 리스트 띄우기
	public ArrayList<ApplyStmtVO> defaultRecommnedList(){
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		ArrayList<ApplyStmtVO> list = new ArrayList<ApplyStmtVO>();
		String sql = "SELECT PROG_NUM"
				+ "        , ID"
				+ "        , NAME"
				+ "        , GRADE"
				+ "        , ifnull(PL_NAME, '-') AS PL_NAME"
				+ "     FROM DEFAULT_RECOMMEND_VIEW";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ApplyStmtVO aVo = new ApplyStmtVO();
				aVo.setProgNum(rs.getString("PROG_NUM"));
				aVo.setId(rs.getString("ID"));
				aVo.setProgName(rs.getString("NAME"));
				aVo.setGrade(rs.getString("GRADE"));
				aVo.setPlName(rs.getString("PL_NAME"));
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
	
	// 프로젝트 인력 추천 메소드
	
	public ArrayList<ApplyStmtVO> recommendList(String grade, String[] plName){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<ApplyStmtVO> list = new ArrayList<ApplyStmtVO>();
		String sql = "";
		
		if(grade.equals("")) {
			switch (plName.length) {
			case 1:{
				sql = "SELECT *"
					+ "  FROM DEFAULT_RECOMMEND_VIEW"
					+ " WHERE PL_NAME LIKE '%"+plName[0]+"%'";
				break;
			}
			case 2:{
				sql = "SELECT *"
				    + "  FROM DEFAULT_RECOMMEND_VIEW"
					+ " WHERE PL_NAME LIKE '%"+plName[0]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[1]+"%'";
				break;
			}
			case 3:{
				sql = "SELECT *"
					+ "  FROM DEFAULT_RECOMMEND_VIEW"
					+ " WHERE PL_NAME LIKE '%"+plName[0]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[1]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[2]+"%'";
				break;
			}
			case 4:{
				sql = "SELECT *"
					+ "  FROM DEFAULT_RECOMMEND_VIEW"
					+ " WHERE PL_NAME LIKE '%"+plName[0]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[1]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[2]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[3]+"%'";
				break;
			}
			case 5:{
				sql = "SELECT *"
					+ "  FROM DEFAULT_RECOMMEND_VIEW"
					+ " WHERE PL_NAME LIKE '%"+plName[0]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[1]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[2]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[3]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[4]+"%'";
				break;
			}
			case 6:{
				sql = "SELECT *"
					+ "  FROM DEFAULT_RECOMMEND_VIEW"
					+ " WHERE PL_NAME LIKE '%"+plName[0]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[1]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[2]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[3]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[4]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[5]+"%'";
				break;
			}

			}
		}
		else {
			switch (plName.length) {
			case 1:{
				sql = "SELECT *"
					+ "  FROM DEFAULT_RECOMMEND_VIEW"
					+ " WHERE GRADE = " + grade
					+ "   AND PL_NAME LIKE '%"+plName[0]+"%'";
				break;
			}
			case 2:{
				sql = "SELECT *"
				    + "  FROM DEFAULT_RECOMMEND_VIEW"
					+ " WHERE GRADE = " + grade
					+ "   AND (PL_NAME LIKE '%"+plName[0]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[1]+"%')";
				break;
			}
			case 3:{
				sql = "SELECT *"
					+ "  FROM DEFAULT_RECOMMEND_VIEW"
					+ " WHERE GRADE = " + grade
					+ "   AND (PL_NAME LIKE '%"+plName[0]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[1]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[2]+"%')";
				break;
			}
			case 4:{
				sql = "SELECT *"
					+ "  FROM DEFAULT_RECOMMEND_VIEW"
					+ " WHERE GRADE = " + grade
					+ "   AND (PL_NAME LIKE '%"+plName[0]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[1]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[2]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[3]+"%')";
				break;
			}
			case 5:{
				sql = "SELECT *"
					+ "  FROM DEFAULT_RECOMMEND_VIEW"
					+ " WHERE GRADE = " + grade
					+ "   AND (PL_NAME LIKE '%"+plName[0]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[1]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[2]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[3]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[4]+"%')";
				break;
			}
			case 6:{
				sql = "SELECT *"
					+ "  FROM DEFAULT_RECOMMEND_VIEW"
					+ " WHERE GRADE = " + grade
					+ "   AND (PL_NAME LIKE '%"+plName[0]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[1]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[2]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[3]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[4]+"%'"
					+ "    OR PL_NAME LIKE '%"+plName[5]+"%')";
				break;
			}

			}
		}
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ApplyStmtVO aVo = new ApplyStmtVO();
				aVo.setProgNum(rs.getString("PROG_NUM"));
				aVo.setId(rs.getString("ID"));
				aVo.setProgName(rs.getString("NAME"));
				aVo.setGrade(rs.getString("GRADE"));
				aVo.setPlName(rs.getString("PL_NAME"));
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
	
	// 추천 받은 인력 배치
		public void recommendManpowerDeploy(ApplyStmtVO aVo) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			String sql = "INSERT INTO TBL_APPLY_STMT("
					+ "	  PROG_NUM, PROJ_NUM, APPLY_STAT, PROG_STATE)"
					+ "   VALUES(?, ?, '승인', '예정')";
			
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, aVo.getProgNum());
				pstmt.setString(2, aVo.getProjNum());
				
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
	
	
}
