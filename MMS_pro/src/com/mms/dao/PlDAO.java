package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mms.vo.PlVO;

import util.DBManager;

public class PlDAO extends DBManager{
	
	private static PlDAO instance = new PlDAO();
	
	public static PlDAO getInstance() {
		return instance;
	}
	
	//조회
	
	public List<PlVO> selectPl(){
		ArrayList<PlVO> plList = new ArrayList<PlVO>();
		
		String sql = "select * from tbl_pl order by pl_num desc";
		
		List<PlVO> list = new ArrayList<PlVO>();
		
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			
			while(rs.next()) {
				PlVO plVo = new PlVO();
				
				plVo.setPlNum(rs.getString("pl_num"));
				plVo.setPlName(rs.getString("pl_name"));
				
				plList.add(plVo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}return plList;
	}
	
	//등록
	public void insertPl(PlVO plVo) {
		
		String sql = "insert into tbl_pl(pl_num, pl_name) values(pl_num, ?)";
		
		Connection conn = getConnection();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, plVo.getPlName());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	
	//삭제
	public int deletePl(String plNum) {
		
		
		String sql = "delete from tbl_pl where pl_num=?";
		
		Connection conn = null;
		PreparedStatement pstmt;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, plNum);
			
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
