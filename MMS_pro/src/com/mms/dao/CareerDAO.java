package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mms.vo.CareerVO;

import util.DBManager;

public class CareerDAO extends DBManager {

	private static CareerDAO instance = new CareerDAO();
	
	public static CareerDAO getInstance() {
		return instance;
	}
	
	
	// 경력 등록
	public void insertCareer(CareerVO cVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO TBL_CAREER("
				+ "	  COMPANY_NAME, DEPARTMENT, POSITION, JOIN_DATE, RETIRE_DATE, PROG_NUM)"
				+ "	  VALUES(?, ?, ?, ?, ?, ?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, cVo.getCompanyName());
			pstmt.setString(2, cVo.getDepartment());
			pstmt.setString(3, cVo.getPosition());
			pstmt.setString(4, cVo.getJoinDate());
			pstmt.setString(5, cVo.getRetireDate());
			pstmt.setString(6, cVo.getProgNum());
			
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
