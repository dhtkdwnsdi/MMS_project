package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mms.vo.CertVO;

import util.DBManager;

public class CertDAO extends DBManager {

	public CertDAO() {

	}

	public static CertDAO instance = new CertDAO();

	public static CertDAO getInstance() {
		if (instance == null) {
			instance = new CertDAO();
		}
		return instance;
	}
	
	//자격증 읽기
	public ArrayList<CertVO> readCert(String certName) {
		
		ArrayList<CertVO> list = new ArrayList<CertVO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM TBL_CERT"
				+ "	  WHERE CERT_NAME LIKE '%" + certName + "%'";
		
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
				while(rs.next()) {
					
					CertVO certVo = new CertVO();
					
					certVo.setCertNum(rs.getString("CERT_NUM"));
					certVo.setCertName(rs.getString("CERT_NAME"));
					certVo.setIssueOrg(rs.getString("ISSUE_ORG"));
					
					list.add(certVo);
				}
		}catch (SQLException e) {
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

	// 등록된 자격증 출력하는 메소드
	public List<CertVO> selectCert() {
		String sql = "select cert_num as certNum" + "        , cert_name as certName"
				+ "        , issue_org as issueOrg" + "	    from tbl_cert order by cert_num desc";

		List<CertVO> certList = new ArrayList<CertVO>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				CertVO certVo = new CertVO();

				certVo.setCertNum(rs.getString("certNum"));
				certVo.setCertName(rs.getString("certName"));
				certVo.setIssueOrg(rs.getString("issueOrg"));
				certList.add(certVo);
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
		return certList;
	}

	// 자격증을 등록하는 메소드
	public void insertCert(CertVO certVo) {
		String sql = "insert into pmms.tbl_cert(cert_num, cert_name, issue_org)" + "	  values(cert_num , ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, certVo.getCertName());
			pstmt.setString(2, certVo.getIssueOrg());
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

	// 삭제
	public void deleteCert(String certNum) {
		
		String sql = "delete from tbl_cert where cert_num = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, certNum);

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
