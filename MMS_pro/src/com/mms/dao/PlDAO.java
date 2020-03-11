package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mms.vo.PlVO;

import util.DBManager;

public class PlDAO extends DBManager{
	
	private static PlDAO instance = new PlDAO();
	
	public static PlDAO getInstance() {
		return instance;
	}
	
	//프로그래밍언어 읽기
		public ArrayList<PlVO> readPl(String plName){
			
			ArrayList<PlVO> list = new ArrayList<PlVO>();
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			String sql = "SELECT * FROM TBL_PL"
					+ "    WHERE PL_NAME LIKE '%" + plName +"%'";
			
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
					while(rs.next()) {
						
						PlVO plVo = new PlVO();
						
						plVo.setPlNum(rs.getString("PL_NUM"));
						plVo.setPlName(rs.getString("PL_NAME"));
						
						list.add(plVo);
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
	
	//프로그래밍언어 조회
	
	public ArrayList<PlVO> selectPl(){
		ArrayList<PlVO> plList = new ArrayList<PlVO>();
		
		String sql = "select * from tbl_pl order by pl_num desc";
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				PlVO plVo = new PlVO();
				
				plVo.setPlNum(rs.getString("pl_num"));
				plVo.setPlName(rs.getString("pl_name"));
				
				plList.add(plVo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return plList;
	}
	
	//프로그래밍언어 등록
	public void insertPl(PlVO plVo) {
		
		String sql = "insert into tbl_pl(pl_num, pl_name) values(pl_num, ?)";
		
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, plVo.getPlName());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	//프로그래밍언어 삭제
	public void deletePl(String plNum) {
		
		
		String sql = "delete from tbl_pl where pl_num=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, plNum);
			
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//프로그래밍언어 autoComplete
		public ArrayList<PlVO> searchPlList(String value){
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			ArrayList<PlVO> list = new ArrayList<PlVO>();
			String sql = "SELECT PL_NUM"
					+ "			,PL_NAME"
					+ "		FROM TBL_PL"
					+ "	   WHERE PL_NAME LIKE '%" + value + "%'";
			
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					PlVO plVo = new PlVO();
					plVo.setPlNum(rs.getString("PL_NUM"));
					plVo.setPlName(rs.getString("PL_NAME"));
					
					list.add(plVo);
					
				}
				
			} catch (SQLException e) {
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
			return list;
			
		}

}
