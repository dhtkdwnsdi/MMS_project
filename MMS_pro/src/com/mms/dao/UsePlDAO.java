package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mms.vo.UsePlVO;

import util.DBManager;

public class UsePlDAO extends DBManager {
	private static UsePlDAO instance = new UsePlDAO();
	
	public static UsePlDAO getInstance() {
		return instance;
	}
	
	// 프로젝트 사용 프로그래밍 언어 등록
	public void insertUsePl(UsePlVO uVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO TBL_USE_PL(PL_NUM, PROJ_NUM)"
				+ "	  VALUSE(?, ?)";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uVo.getPlNum());
			pstmt.setString(2, uVo.getProjNum());
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
	
	// 프로젝트 사용 프로그래밍 언어 조회
	public ArrayList<UsePlVO> usePlList(String projNum){
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		ArrayList<UsePlVO> list = new ArrayList<UsePlVO>();
		String sql = "SELECT UPL.USE_PL_NUM AS USE_PL_NUM" + 
				"	 , PL.PL_NAME AS PL_NAME" + 
				"  FROM TBL_PL PL" + 
				"	 , TBL_PROJECT PJ" + 
				"     , TBL_USE_PL UPL" + 
				" WHERE UPL.PL_NUM = PL.PL_NUM" + 
				"   AND UPL.PROJ_NUM = PJ.PROJ_NUM" + 
				"   AND PJ.PROJ_NUM = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, projNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UsePlVO uVo = new UsePlVO();
				uVo.setUsePlNum(rs.getString("USE_PL_NUM"));
				uVo.setPlName(rs.getString("PL_NAME"));
				
				list.add(uVo);
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
}
