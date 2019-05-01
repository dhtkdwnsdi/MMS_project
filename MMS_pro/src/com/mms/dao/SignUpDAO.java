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
public class SignUpDAO extends DBManager {

	private static SignUpDAO instance = new SignUpDAO();
	
	public static SignUpDAO getInstance() {
		return instance;
	}
	
	public int idCheck(String id) {
		int result = -1;		//result 변수 초기화 -1
		String sql = "select ID from pmms.tbl_programmer where ID=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if (id.equals("")) {
				// 데이터 NULL
				result = 0;
			
			} else if (rs.next()) {
				 // 데이터 존재.
				result = 1;
				System.out.println(result + ":통과");
		
			} else {
				 // 데이터 없음.
				result = -1;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)
					rs.close();
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return result;
	}
	
	//회원 등록
	public void signUp(ProgrammerVo progVo) {
		String sql = "INSERT INTO tbl_programmer("
				+ "	  NAME, ID, PASSWORD, EMAIL, TEL, JUSO, EXTRAJUSO, BANK, ACCOUNT, GRADE)"
				+ "	  VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, progVo.getName());
			pstmt.setString(2, progVo.getId());
			pstmt.setString(3, progVo.getPassword());
			pstmt.setString(4, progVo.getEmail());
			pstmt.setString(5, progVo.getTel());
			pstmt.setString(6, progVo.getJuso());
			pstmt.setString(7, progVo.getExtraJuso());
			pstmt.setString(8, progVo.getBank());
			pstmt.setString(9, progVo.getAccount());
			pstmt.setString(10, progVo.getGrade());
			
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
	
	//로그인 인증시 사용하는 메소드
	public int userCheck(ProgrammerVo progVo) {
		
		int result = -1;
		String sql = "SELECT ID, PASSWORD FROM TBL_PROGRAMMER WHERE ID= '" + progVo.getId() + "'";
		
		System.out.println(progVo.getPassword());
		System.out.println(progVo.getId());
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getString("ID"));
				if(rs.getString("PASSWORD") != null && rs.getString("PASSWORD").equals(progVo.getPassword())) {
					
					result = 1;			// 로그인 성공
					
				} else {
					
					result = 0;			// 로그인 실패
					
				}
			} else {
				
				result = -1;			
				
			}
			
		} catch (Exception e) {
			
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
	
	//프로그래머의 정보를 가져오는 메소드
	public ProgrammerVo getProgInfo(ProgrammerVo tempVo) {
		
		String sql = "SELECT * FROM TBL_PROGRAMMER WHERE ID= '" + tempVo.getId() +"'";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ProgrammerVo progVo = new ProgrammerVo();
		
		try {
			
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				progVo = new ProgrammerVo();
				progVo.setProgNum(rs.getString("PROG_NUM"));
				progVo.setName(rs.getString("NAME"));
				progVo.setId(rs.getString("ID"));
				progVo.setPassword(rs.getString("PASSWORD"));
				progVo.setEmail(rs.getString("EMAIL"));
				progVo.setTel(rs.getString("TEL"));
				progVo.setPhoto(rs.getString("PHOTO"));
				progVo.setGender(rs.getString("GENDER"));
				progVo.setJuso(rs.getString("JUSO"));
				progVo.setExtraJuso(rs.getString("EXTRAJUSO"));
				progVo.setBank(rs.getString("BANK"));
				progVo.setAccount(rs.getString("ACCOUNT"));
				progVo.setGrant(rs.getString("GRANT"));
				progVo.setIntroduce(rs.getString("INTRODUCE"));
				progVo.setIntroFile(rs.getString("INTRO_FILE"));
				progVo.setGrade(rs.getString("GRADE"));
				progVo.setBirth(rs.getString("BIRTH"));
				
				
			}
		} catch (Exception e) {
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
		
		return progVo;
	
	}
	
	
}
