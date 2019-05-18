package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mms.vo.ApplyStmtVO;

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
				"          , AP.APPLY_STAT AS APPLY_STAT" + 
				"       FROM TBL_PROJECT PJ" + 
				"	       , TBL_PROGRAMMER PG" + 
				"          , TBL_APPLY_STMT AP" + 
				" WHERE PJ.PROG_NUM = PG.PROG_NUM" + 
				"   AND PJ.PROJ_NUM = AP.PROJ_NUM"
				+ " AND AP.PROG_NUM = ?"
				+ " ORDER BY APPLY_STMT_NUM DESC";
		
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
				"          , AP.APPLY_STAT AS APPLY_STAT" + 
				"       FROM TBL_PROJECT PJ" + 
				"	       , TBL_PROGRAMMER PG" + 
				"          , TBL_APPLY_STMT AP" + 
				" WHERE PJ.PROG_NUM = PG.PROG_NUM" + 
				"   AND PJ.PROJ_NUM = AP.PROJ_NUM"
				+ " AND AP.PROG_NUM = ?"
				+ "	AND AP.APPLY_STAT LIKE '%승인대기%'"
				+ " ORDER BY APPLY_STMT_NUM DESC";
		
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
	
}
