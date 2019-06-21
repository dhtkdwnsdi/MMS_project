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
	
	//자기소개서 업데이트
	public void updateIntroduce(ProgrammerVO progVo) {
		
		Connection conn = null;
	    PreparedStatement pstmt = null;
	    
	    String sql = "UPDATE TBL_PROGRAMMER SET"
	    		+ "		     INTRODUCE1 = ?"
	    		+ ",		 INTRODUCE2 = ?"
	    		+ ",         INTRODUCE3 = ?"
	    		+ ",         INTRODUCE4 = ?"
	    		+ ",         INTRO_FILE = ?"
	    		+ "	   WHERE PROG_NUM =?";	
	    
	    try {
	    	
	    	conn = getConnection();
	    	pstmt = conn.prepareStatement(sql);
	    	
	    	pstmt.setString(1, progVo.getIntroduce1());
	    	pstmt.setString(2, progVo.getIntroduce2());
	    	pstmt.setString(3, progVo.getIntroduce3());
	    	pstmt.setString(4, progVo.getIntroduce4());
	    	pstmt.setString(5, progVo.getIntroFile());
	    	pstmt.setString(6, progVo.getProgNum());
	    	
	    	pstmt.executeUpdate();
	    		
	    } catch (Exception e) {
	    	e.printStackTrace();
	        }finally {
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	   }
	
	
	//자기소개서 읽기
	public ProgrammerVO readIntroduce(String progNum) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT INTRODUCE1"
				+ "			,INTRODUCE2"
				+ "         ,INTRODUCE3"
				+ "         ,INTRODUCE4"
				+ "         ,INTRO_FILE"
				+ "			,NAME"
				+ "			,PROG_NUM"
				+ "     FROM TBL_PROGRAMMER"
				+ "    WHERE PROG_NUM = ?"; 
		
		ProgrammerVO progVo = new ProgrammerVO();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, progNum);
			rs = pstmt.executeQuery();
		
				while(rs.next()) {
				
					progVo.setIntroduce1(rs.getString("INTRODUCE1"));
					progVo.setIntroduce2(rs.getString("INTRODUCE2"));
					progVo.setIntroduce3(rs.getString("INTRODUCE3"));
					progVo.setIntroduce4(rs.getString("INTRODUCE4"));
					progVo.setIntroFile(rs.getString("INTRO_FILE"));
					progVo.setName(rs.getString("NAME"));
					progVo.setProgNum(rs.getString("PROG_NUM"));
				
				
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