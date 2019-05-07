package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mms.vo.EduVO;

import util.DBManager;

public class EduDAO extends DBManager {

	private static EduDAO instance;

	public static EduDAO getInstance() {
		if (instance == null) {
			instance = new EduDAO();
		}
		return instance;
	}

	// 학력 목록 가져오기
	public ArrayList<EduVO> selectEdu(String progNum) {

		ArrayList<EduVO> list = new ArrayList<EduVO>();

		String sql = "SELECT EDU_NUM,"
				+ "	       EDU_CATEGORY"
				+ "        , EDU_STATE"
				+ "        , SCHOOL_NAME"
				+ "		   , ENTER_DATE"
				+ "        , GRADUATE_DATE " + 
						"FROM TBL_EDU " + 
						"where PROG_NUM = " + progNum;

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				EduVO eduVo = new EduVO();
				eduVo.setEduNum(rs.getString("EDU_NUM"));
				eduVo.setEduCategory(rs.getString("EDU_CATEGORY"));
				eduVo.setEduState(rs.getString("EDU_STATE"));
				eduVo.setSchoolName(rs.getString("SCHOOL_NAME"));
				eduVo.setEnterDate(rs.getString("ENTER_DATE"));
				eduVo.setGraduateDate(rs.getString("GRADUATE_DATE"));

				list.add(eduVo);
			}

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

		return list;
	}

	public void insertEdu(EduVO eduVo) {
		String sql = "INSERT INTO tbl_edu("
				+ "	  edu_num, EDU_CATEGORY, EDU_STATE, SCHOOL_NAME, ENTER_DATE, GRADUATE_DATE, PROG_NUM)"
				+ "	  VALUES( ?, ?, ?, ?, ?, ?, ?)";

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
