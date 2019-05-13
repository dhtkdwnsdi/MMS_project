package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mms.vo.ProgrammerVO;

import util.DBManager;

public class IntroduceDAO extends DBManager {

	private static IntroduceDAO instance = new IntroduceDAO();

	public static IntroduceDAO getInstance() {
		return instance;
	}

	// 자기소개서 등록
	public void insertIntroduce(ProgrammerVO pVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "INSERT INTO TBL_PROGRAMMER(" + "	  INTRODUCE, INTRO_FILE)" + "	  VALUES(?, ?)";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, pVo.getIntroduce());
			pstmt.setString(2, pVo.getIntroFile());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}