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
	        	 portpolioVo.setPortCate(rs.getString("PORT_DETAIL_CATE"));
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

}
