package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mms.vo.ProgrammerVO;

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
			conn = getConnection();
			
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
	public void signUp(ProgrammerVO progVo) {
		String sql = "INSERT INTO tbl_programmer("
				+ "	  NAME, ID, PASSWORD, EMAIL, TEL, JUSO, EXTRAJUSO, BANK, ACCOUNT, GRADE)"
				+ "	  VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = getConnection();
			
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
	public int userCheck(ProgrammerVO progVo) {
		
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
	
	//관리자 로그인 인증시 사용하는 메소드
//	public int adminCheck(AdminVO adminVo) {
//		
//		int result = -1;
//		String sql = "SELECT ADMIN_ID, ADMIN_PW FROM TBL_ADMIN WHERE ID= '" + adminVo.getAdminId() + "'";
//		
//		System.out.println(adminVo.getAdminPw());
//		System.out.println(adminVo.getAdminId());
//		
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		
//		try {
//			
//			conn = getConnection();
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			
//			if(rs.next()) {
//				System.out.println(rs.getString("ADMIN_ID"));
//				if(rs.getString("ADMIN_PW") != null && rs.getString("ADMIN_PW").equals(adminVo.getAdminPw())) {
//					
//					result = 1;			// 로그인 성공
//					
//				} else {
//					
//					result = 0;			// 로그인 실패
//					
//				}
//			} else {
//				
//				result = -1;			
//				
//			}
//			
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//			
//		} finally {
//			try {
//				
//				if(rs != null) rs.close();
//				if(pstmt != null) pstmt.close();
//				if(conn != null) conn.close();
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		return result;
//	}
	
	//프로그래머의 정보를 가져오는 메소드
	public ProgrammerVO getProgInfo(ProgrammerVO tempVo) {
		
		String sql = "SELECT * FROM TBL_PROGRAMMER WHERE ID= '" + tempVo.getId() +"'";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ProgrammerVO progVo = new ProgrammerVO();
		
		try {
			
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				progVo.setProgNum(rs.getString("PROG_NUM"));
				progVo.setName(rs.getString("NAME"));
				progVo.setId(rs.getString("ID"));
				progVo.setPassword(rs.getString("PASSWORD"));
				progVo.setEmail(rs.getString("EMAIL"));
				progVo.setTel(rs.getString("TEL"));
				progVo.setPhoto(rs.getString("PHOTO"));
				progVo.setJuso(rs.getString("JUSO"));
				progVo.setExtraJuso(rs.getString("EXTRAJUSO"));
				progVo.setBank(rs.getString("BANK"));
				progVo.setAccount(rs.getString("ACCOUNT"));
				progVo.setGrant(rs.getString("GRANT"));
				progVo.setIntroduce1(rs.getString("INTRODUCE1"));
				progVo.setIntroduce2(rs.getString("INTRODUCE2"));
				progVo.setIntroduce3(rs.getString("INTRODUCE3"));
				progVo.setIntroduce4(rs.getString("INTRODUCE4"));
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
	
	
	//관리자의 정보를 가져오는 메소드
//	public AdminVO getAdminInfo(AdminVO tempVo) {
//		
//		String sql = "SELECT * FROM TBL_ADMIN WHERE ID= '" + tempVo.getAdminId() +"'";
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		
//		AdminVO adminVo = new AdminVO();
//		
//		try {
//			
//			conn = getConnection();
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			
//			if(rs.next()) {
//				
//				adminVo.setAdminId(rs.getString("ADMIN_ID"));
//				adminVo.setAdminPw(rs.getString("ADMIN_PW"));
//				adminVo.setGrant(rs.getString("GRANT"));
//				
//				
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				
//				if(rs != null) rs.close();
//				if(pstmt != null) pstmt.close();
//				if(conn != null) conn.close();
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//		return adminVo;
//	
//	}
	
	//user 수정 DAO
	public void updateUser(ProgrammerVO progVo) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE TBL_PROGRAMMER SET"
				+ "	  		 ID = ?, "
				+ "			 PASSWORD = ?, "
				+ "  	     NAME = ?,"
				+ "	  		 JUSO = ?, "
				+ "  		 EXTRAJUSO = ?, "
				+ " 		 EMAIL = ?,"
				+ "	  		 TEL = ?, "
				+ "			 BANK = ?, "
				+ "			 ACCOUNT = ?, "
				+ "			 PHOTO = ?,"
				+ "			 GRADE = ?"
				+ "    WHERE PROG_NUM = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, progVo.getId());
			pstmt.setString(2, progVo.getPassword());
			pstmt.setString(3, progVo.getName());
			pstmt.setString(4, progVo.getJuso());
			pstmt.setString(5, progVo.getExtraJuso());
			pstmt.setString(6, progVo.getEmail());
			pstmt.setString(7, progVo.getTel());
			pstmt.setString(8, progVo.getBank());
			pstmt.setString(9, progVo.getAccount());
			pstmt.setString(10, progVo.getPhoto());
			pstmt.setString(11, progVo.getGrade());
			pstmt.setString(12, progVo.getProgNum());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}	finally {
			
			try {
				if(pstmt != null) pstmt.close();
				
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			
			}
		}
		
	}
	
	
}
