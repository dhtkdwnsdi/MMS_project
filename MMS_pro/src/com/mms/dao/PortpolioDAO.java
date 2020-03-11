package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mms.vo.PortpolioVO;

import util.DBManager;

public class PortpolioDAO extends DBManager {

	private static PortpolioDAO instance;

	private PortpolioDAO() {

	}

	public static PortpolioDAO getInstance() {
		if (instance == null) {
			instance = new PortpolioDAO();
		}
		System.out.print("PortpolioDAO.java");
		return instance;
	}
	
	//포토폴리오 목록 출력
	 public List<PortpolioVO> selectPortpolio(String progNum){
		 
		 String sql = "SELECT  PORT_NUM"
		 		+ "          , SUBJECT"
		 		+ "          , PORT_CATE"
		 		+ "          , PORT_DETAIL_CATE"
		 		+ "          , ORGANIZATION"
		 		+ "      FROM tbl_portpolio"
		 		+ "     WHERE PROG_NUM = " + progNum;
		 
		 List<PortpolioVO> list = new ArrayList<PortpolioVO>();
		 
		 Connection conn = null;
	     PreparedStatement pstmt = null;
	     ResultSet rs = null;
		
	     try {
	    	 conn = getConnection();
	         pstmt = conn.prepareStatement(sql);
	         rs = pstmt.executeQuery();
	            
	         while(rs.next()) {
	        	 PortpolioVO portpolioVo = new PortpolioVO();
	        	 
	        	 portpolioVo.setPortNum(rs.getString("PORT_NUM"));
	        	 portpolioVo.setSubject(rs.getString("SUBJECT"));
	        	 portpolioVo.setPortCate(rs.getString("PORT_CATE"));
	        	 portpolioVo.setPortDetailCate(rs.getString("PORT_DETAIL_CATE"));
	        	 portpolioVo.setOrganization(rs.getString("ORGANIZATION"));
	        	 list.add(portpolioVo);
	         }
	     } catch (SQLException e) {
	            
	            e.printStackTrace();
	            
	     } finally {
        	 try {
                 if(pstmt != null)
                	 pstmt.close();
                 if(conn != null)
                    conn.close();
              } catch (Exception e) {
                 e.printStackTrace();
              }
         }
	     
	     return list;
	 }
	
	
	// 포트폴리오 삭제
	public void deletePortpolio(String portNum) {

		String sql = "DELETE FROM TBL_PORTPOLIO" +
				  "    WHERE PORT_NUM=" + portNum;

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);

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
	
	//포트폴리오번호를 통해서 상세조회하는 메소드
	public PortpolioVO readPortpolio(String portNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT PORT_NUM"
				+ "		   , SUBJECT"
				+ "		   , ORGANIZATION"
				+ "		   , PORT_CATE"
				+ "		   , PORT_DETAIL_CATE"
				+ "		   , PORT_CONTENTS"
				+ "		   , PORT_START_DATE"
				+ "		   , PORT_END_DATE"
				+ "		   , RATE"
				+ "		   , PORT_FILE"
				+ "		   , PL.PL_NUM"
				+ "		   , PL.PL_NAME"
				+ "		   , PROG_NUM"
				+ "	    FROM TBL_PORTPOLIO PORT, TBL_PL PL"
				+ "	   WHERE PL.PL_NUM = PORT.PL_NUM"
				+ "	     AND PORT_NUM = ?";
		
		PortpolioVO portVo = new PortpolioVO();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, portNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				portVo.setPortNum(rs.getString("PORT_NUM"));
				portVo.setSubject(rs.getString("SUBJECT"));
				portVo.setOrganization(rs.getString("ORGANIZATION"));
				portVo.setPortCate(rs.getString("PORT_CATE"));
				portVo.setPortDetailCate(rs.getString("PORT_DETAIL_CATE"));
				portVo.setPortContents(rs.getString("PORT_CONTENTS"));
				portVo.setPortStartDate(rs.getString("PORT_START_DATE"));
				portVo.setPortEndDate(rs.getString("PORT_END_DATE"));
				portVo.setRate(rs.getString("RATE"));
				portVo.setPortFile(rs.getString("PORT_FILE"));
				portVo.setPlNum(rs.getString("PL_NUM"));
				portVo.setPlName(rs.getString("PL_NAME"));
				portVo.setProgNum(rs.getString("PROG_NUM"));
				
			}
			
		} catch(SQLException e) {
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
		
		return portVo;
	}
	
	
	//포트폴리오 등록하는 메소드
	public void insertPortpolio(PortpolioVO portVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		  String sql = "INSERT INTO TBL_PORTPOLIO(" +
		  "   				   PROG_NUM, "
		  + "			       SUBJECT, "
		  + "				   ORGANIZATION, "
		  + "			       PORT_CATE," 
		  + "  				   PORT_DETAIL_CATE, "
		  + "			       PORT_CONTENTS, "
		  + "				   PORT_START_DATE,"
		  + "   			   PORT_END_DATE, "
		  + "			  	   RATE, "
		  + "				   PORT_FILE, "
		  + "				   PL_NUM)" +
		  "	  VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
		  
		  try {
		  
		  conn = DBManager.getConnection();
		  
		  pstmt = conn.prepareStatement(sql);
		  
		  pstmt.setString(1, portVo.getProgNum()); 
		  pstmt.setString(2, portVo.getSubject()); 
		  pstmt.setString(3, portVo.getOrganization());
		  pstmt.setString(4, portVo.getPortCate()); 
		  pstmt.setString(5, portVo.getPortDetailCate()); 
		  pstmt.setString(6, portVo.getPortContents());
		  pstmt.setString(7, portVo.getPortStartDate());
		  pstmt.setString(8, portVo.getPortEndDate()); 
		  pstmt.setString(9, portVo.getRate());
		  pstmt.setString(10, portVo.getPortFile()); 
		  pstmt.setString(11, portVo.getPlNum());
		  
		  pstmt.executeUpdate(); 
		  } catch(SQLException e) { 
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
		 
	
	//포트폴리오 수정하는 메소드
	public void updatePortpolio(PortpolioVO portVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE TBL_PORTPOLIO SET"
				+ "	  SUBJECT = ?"
				+ ",  ORGANIZATION = ?"
				+ ",  PORT_CATE = ?"
				+ ",  PORT_DETAIL_CATE = ?"
				+ ",  PORT_CONTENTS = ?"
				+ ",  PORT_START_DATE = ?"
				+ ",  PORT_END_DATE = ?"
				+ ",  PORT_FILE =?"
				+ ",  RATE = ?"
				+ ",  PL_NUM =?"
				+ "	  WHERE PORT_NUM = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, portVo.getSubject());
			pstmt.setString(2, portVo.getOrganization());
			pstmt.setString(3, portVo.getPortCate());
			pstmt.setString(4, portVo.getPortDetailCate());
			pstmt.setString(5, portVo.getPortContents());
			pstmt.setString(6, portVo.getPortStartDate());
			pstmt.setString(7, portVo.getPortEndDate());
			pstmt.setString(8, portVo.getPortFile());
			pstmt.setString(9, portVo.getRate());
			pstmt.setString(10, portVo.getPlNum());
			pstmt.setString(11, portVo.getPortNum());
			
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
