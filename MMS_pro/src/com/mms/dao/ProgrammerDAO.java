package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mms.vo.EduVO;


import util.DBManager;

public class ProgrammerDAO extends DBManager {

	private static ProgrammerDAO instance;
	
	public static ProgrammerDAO getInstance() {
		if (instance == null) {
			instance = new ProgrammerDAO();
		}
		return instance;
	}
	
	
	//학력 등록
	public void insertEdu(EduVO eduVo) {
		String sql = "INSERT INTO tbl_programmer("
				+ "	   EDUCATEGORY, EDUSTATE, EDUSCHOOLNAME, EDUENTERDATE, EDUGRADEATEDATE)"
				+ "	  VALUES(?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(1, eduVo.getEduCategory());
			pstmt.setString(2, eduVo.getEduState());
			pstmt.setString(3, eduVo.getSchoolName());
			pstmt.setString(4, eduVo.getEnterDate());
			pstmt.setString(5, eduVo.getGraduateDate());
		
			
			pstmt.executeUpdate();
			
		}	catch (SQLException e) {
				e.printStackTrace();
		}	finally {
			try {
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
}
