package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mms.vo.ProgrammerVO;

import util.DBManager;

public class IntroduceDAO extends DBManager {

	private static IntroduceDAO instance = new IntroduceDAO();

	public static IntroduceDAO getInstance() {
		return instance;
	}
	
	/*
	 * //자기소개서 리스트 출력 public ArrayList<ProgrammerVO> introduceList(String progNum){
	 * Connection conn = null; PreparedStatement pstmt = null; ResultSet rs = null;
	 * 
	 * String sql = "SELECT INTRODUCE1" + "			,INTRODUCE2" +
	 * "         ,INTRODUCE3" + "         ,INTRODUCE4" + "         ,INTRO_FILE" +
	 * "     FROM TBL_PROGRAMMER" + "    WHERE PROG_NUM = ?";
	 * 
	 * ArrayList<ProgrammerVO> list = new ArrayList<ProgrammerVO>();
	 * 
	 * try { conn = getConnection(); pstmt = conn.prepareStatement(sql);
	 * pstmt.setString(1, progNum); rs = pstmt.executeQuery();
	 * 
	 * while(rs.next()) { ProgrammerVO progVo = new ProgrammerVO();
	 * 
	 * progVo.setIntroduce1(rs.getString("introduce1"));
	 * progVo.setIntroduce2(rs.getString("introduce2"));
	 * progVo.setIntroduce3(rs.getString("introduce3"));
	 * progVo.setIntroduce4(rs.getString("introduce4"));
	 * progVo.setIntroFile(rs.getString("introFile"));
	 * 
	 * list.add(progVo); }
	 * 
	 * }catch (SQLException e) { e.printStackTrace(); } finally { try { if(rs !=
	 * null) rs.close(); if(pstmt != null) pstmt.close(); if(conn != null)
	 * conn.close();
	 * 
	 * } catch (Exception e) { e.printStackTrace();
	 * 
	 * } } return list;
	 * 
	 * }
	 */
	
	// 자기소개서 등록
	public void insertIntroduce(ProgrammerVO pVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "INSERT INTO TBL_PROGRAMMER("
				+ "	  INTRODUCE1, INTRODUCE2, INTRODUCE3"
				+ " , INTRODUCE4, INTRO_FILE"
				+ "   VALUES(?, ?, ?, ?, ?)";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, pVo.getIntroduce1());
			pstmt.setString(2, pVo.getIntroduce2());
			pstmt.setString(3, pVo.getIntroduce3());
			pstmt.setString(4, pVo.getIntroduce4());
			pstmt.setString(5, pVo.getIntroFile());
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
	
	//자기소개서 수정
	public boolean updateIntroduce(ProgrammerVO progVo) {
		
		boolean result = false;
		
		Connection conn = null;
	    PreparedStatement pstmt = null;
	    
	    
	    try {
	    	
	    	conn = getConnection();
	    	conn.setAutoCommit(false);
	    	
	    	StringBuffer sql = new StringBuffer();
	    	
	    	sql.append("UPDATE TBL_PROGRAMMER SET");
	    	sql.append(" INTRODUCE1=?");
	    	sql.append(" ,INTRODUCE2=?");
	    	sql.append(" ,INTRODUCE3=?");
	    	sql.append(" ,INTRODUCE4=?");
	    	sql.append(" ,INTRO_FILE=?");
	    	sql.append("WHERE PROG_NUM=?");
	    	
	    	pstmt = conn.prepareStatement(sql.toString());
	    	pstmt.setString(1, progVo.getIntroduce1());
	    	pstmt.setString(2, progVo.getIntroduce2());
	    	pstmt.setString(3, progVo.getIntroduce3());
	    	pstmt.setString(4, progVo.getIntroduce4());
	    	pstmt.setString(5, progVo.getIntroFile());
	    	pstmt.setString(6, progVo.getProgNum());
	    	
	    	int flag = pstmt.executeUpdate();
	    		if(flag > 0) {
	    			result = true;
	    			conn.commit(); // 완료시 커밋
	    		}
	    } catch (Exception e) {
	         try {
	                conn.rollback(); // 오류시 롤백
	            } catch (SQLException sqle) {
	                sqle.printStackTrace();
	            }
	            throw new RuntimeException(e.getMessage());
	        }
	      
	    	try {
	    		if(pstmt != null) pstmt.close();
	    		if(conn != null) conn.close();
	    		
	    	} catch (Exception e) {
				e.printStackTrace();
	    		// TODO: handle exception
			}
	    
	      return result;
	   }
	
		/*
		 * Connection conn = null; PreparedStatement pstmt = null;
		 * 
		 * String sql = "UPDATE TBL_PROGRAMMER SET" + "   INTRODUCE1 =?," +
		 * "   INTRODUCE2 =?," + "   INTRODUCE3 =?," + "   INTRODUCE4 =?," +
		 * "   INTRO_FILE = ?" + "   WHERE PROG_NUM =?" ;
		 * 
		 * try { conn = getConnection(); pstmt = conn.prepareStatement(sql);
		 * 
		 * pstmt.setString(1, progVo.getIntroduce1()); pstmt.setString(2,
		 * progVo.getIntroduce2()); pstmt.setString(3, progVo.getIntroduce3());
		 * pstmt.setString(4, progVo.getIntroduce4()); pstmt.setString(5,
		 * progVo.getIntroFile()); pstmt.setString(6, progVo.getProgNum());
		 * 
		 * pstmt.executeUpdate();
		 * 
		 * } catch (SQLException e) { e.printStackTrace();
		 * 
		 * } finally { try { if(pstmt != null) pstmt.close(); if(conn != null)
		 * conn.close();
		 * 
		 * } catch (Exception e) { e.printStackTrace();
		 * 
		 * } }
		 */
	
	
	//자기소개서 읽기
	public ProgrammerVO readIntroduce(String id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT INTRODUCE1"
				+ "			,INTRODUCE2"
				+ "         ,INTRODUCE3"
				+ "         ,INTRODUCE4"
				+ "         ,INTRO_FILE"
				+ "     FROM TBL_PROGRAMMER"
				+ "    WHERE ID = ?"; 
		
		ProgrammerVO progVo = new ProgrammerVO();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
		
				while(rs.next()) {
				
					progVo.setIntroduce1(rs.getString("INTRODUCE1"));
					progVo.setIntroduce2(rs.getString("INTRODUCE2"));
					progVo.setIntroduce3(rs.getString("INTRODUCE3"));
					progVo.setIntroduce4(rs.getString("INTRODUCE4"));
					progVo.setIntroFile(rs.getString("INTRO_FILE"));
				
				
			}
		}catch (SQLException e) {
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