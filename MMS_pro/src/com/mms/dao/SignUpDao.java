package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mms.vo.ProgrammerVo;

import util.DBManager;
/**
 * 
 * @author LEE HAN
 *
 */
public class SignUpDao extends DBManager {

	private static SignUpDao instance;
	
	private SignUpDao() {
		
	}
	
	public static SignUpDao getInstance() {
		if(instance == null) {
			instance = new SignUpDao();
		}
		System.out.print("SignUpDao.java");
		return instance;
	}
	
	public int idCheck(String id) {
		int result = -1;		//result 변수 초기화 -1
		String sql = "SELECT ID FROM TBL_PROGRAMMER WHERE ID=?";
		Connection conn = getConnection();
		PreparedStatement pstmt;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = 1;		//ID 중복
			} else {
				result = -1;	//ID 중복 아님
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return result;
	}
	
	public void SignUp(ProgrammerVo proVo) {
		String sql = "INSERT INTO TBL_PROGRAMMER("
				+ "	  ";
	}
	
}
