package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mms.vo.PlsVO;

import util.DBManager;

public class PlsDAO extends DBManager {

	private static PlsDAO instance;

	public static PlsDAO getInstance() {
		if (instance == null) {
			instance = new PlsDAO();
		}

		return instance;
	}

	// 프로그래밍 언어숙련도 목록 가져오기
	public List<PlsVO> selectPls(String progNum) {

		String sql = "SELECT PLS.PLS_NUM"
				+ "         ,PL.PL_NUM"
				+ "			,PL.PL_NAME"
				+ "			,PLS.PROFIENCY"
				+ "			,PLS.EXPERIENCE"
				+ "		FROM TBL_PLS PLS, TBL_PL PL"
				+ "	   WHERE PLS.PL_NUM = PL.PL_NUM"
				+ "		 AND PLS.PROG_NUM = " + progNum ;

		List<PlsVO> list = new ArrayList<PlsVO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				PlsVO pVo = new PlsVO();
				
				pVo.setPlsNum(rs.getString("plsNum"));
				pVo.setPlNum(rs.getString("plNum"));
				pVo.setPlNum(rs.getString("plName"));
				pVo.setProfiency(rs.getString("profiency"));
				pVo.setExperience(rs.getString("experience"));

				list.add(pVo);
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

	
	//프로그래밍 언어 숙련도 통해서 plsUpdate.jsp로 넘어가는 메소드
	public PlsVO readPls(String plsNum) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "Select * from tbl_pls where pls_num=?";

		
		PlsVO pVo = new PlsVO();

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, plsNum);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				pVo.setPlsNum(rs.getString("PLS_NUM"));
				pVo.setPlNum(rs.getString("PL_NUM"));
				pVo.setProfiency(rs.getString("profiency"));
				pVo.setExperience(rs.getString("experience"));
				pVo.setProgNum(rs.getString("prog_Num"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}

		}
		return pVo;
	}

	// insert
	public void insertPls(PlsVO pVo) {
		String sql = "insert into tbl_pls (" 
	            + " pls_num, pl_num, profiency, experience, prog_num)"
				+ " values (?,?,?,?,?) ";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {

			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);

			
			pstmt.setString(1, pVo.getPlNum());
			pstmt.setString(2, pVo.getProfiency());
			pstmt.setString(3, pVo.getExperience());
			pstmt.setString(4, pVo.getProgNum());

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

	// update
	public void updatePls(PlsVO pVo) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "update tbl_pls set" 
		       + "    pl_num=?" 
		       + ",   profiency=?" 
		       + ",   experience=?" 
		       + "    where pls_num=?";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, pVo.getPlNum());
			pstmt.setString(2, pVo.getProfiency());
			pstmt.setString(3, pVo.getExperience());
			pstmt.setString(4, pVo.getPlsNum());

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
	
	// delete
	   public void deletePls(String plsNum) {
		   String sql = "DELETE FROM TBL_PLS"
					+    "  WHERE PLS_NUM = " +plsNum;

		      Connection conn = null;
		         PreparedStatement pstmt =null;
		         try {
		            conn = getConnection();
		            pstmt = conn.prepareStatement(sql);
		            
		            pstmt.executeUpdate();
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
		      
		   }

}



