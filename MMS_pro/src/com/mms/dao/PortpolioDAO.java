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

	
	//포토폴리오 조회
	 public List<PortpolioVO> selectPortpolio(String progNum){
		 
		 String sql = "SELECT  PORT_NUM"
		 		+ "          , SUBJECT"
		 		+ "          , PORT_CATE"
		 		+ "          , PORT_DETAIL_CATE"
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

		String sql = "DELETE FROM TBL_PORTPOLIO" + "    WHERE PORT_NUM=" + portNum;

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
				+ "		   , PORT_CATE"
				+ "		   , PORT_DETAIL_CATE"
				+ "		   , PORT_CONTENTS"
				+ "		   , PORT_START_DATE"
				+ "		   , PORT_END_DATE"
				+ "		   , RATE"
				+ "	    FROM TBL_PORTPOLIO"
				+ "	   WHERE PORT_NUM = ?";
		
		PortpolioVO portVo = new PortpolioVO();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, portNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				portVo.setPortNum(rs.getString("PORT_NUM"));
				portVo.setSubject(rs.getString("SUBJECT"));
				portVo.setPortCate(rs.getString("PORT_CATE"));
				portVo.setPortDetailCate(rs.getString("PORT_DETAIL_CATE"));
				portVo.setPortContents(rs.getString("PORT_CONTENTS"));
				portVo.setPortStartDate(rs.getString("PORT_START_DATE"));
				portVo.setPortEndDate(rs.getString("PORT_END_DATE"));
				portVo.setRate(rs.getString("RATE"));
				
				
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
	
	
	//포트폴리오 상세조회에서 PL 출력하기
	public List<PortpolioVO> readPl(String portNum){
		
		List<PortpolioVO> list = new ArrayList<PortpolioVO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT PL.PL_NAME"
				+ "		FROM TBL_PORTPOLIO_PL PPL, TBL_PL PL"
				+ "	   WHERE PL.PL_NUM = PPL.PL_NUM"
				+ "      AND PORT_NUM = " + portNum;
		
		try {
	    	 conn = getConnection();
	         pstmt = conn.prepareStatement(sql);
	         rs = pstmt.executeQuery();
	         
	            
	         while(rs.next()) {
	        	 PortpolioVO portpolioVo = new PortpolioVO();
	        	 
	        	 portpolioVo.setPlName(rs.getString("PL_NAME"));
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

}
