package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mms.vo.ProgrammerVO;

import util.DBManager;

public class GrantDAO extends DBManager{
	
	private static GrantDAO instance = new GrantDAO();
	
	public static GrantDAO getInstance() {
		return instance;
	}
	
	public List<ProgrammerVO> selectGrant(){
		ArrayList<ProgrammerVO> gList = new ArrayList<ProgrammerVO>();
		
		String sql = "select pg.prog_num, pg.name, pg.grant from tbl_programmer pg where name != '관리자' order by pg.prog_num asc";
		
		List<ProgrammerVO> list = new ArrayList<ProgrammerVO>();
		
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			
			while(rs.next()) {
				ProgrammerVO pVo = new ProgrammerVO();
				
				pVo.setProgNum(rs.getString("prog_num"));
				pVo.setName(rs.getString("name"));
				pVo.setGrant(rs.getString("grant"));
				
				gList.add(pVo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}return gList;
	}
	
	//권한 변경
	public void updateGrant(ProgrammerVO pVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "update tbl_programmer pg set pg.grant = ? where pg.prog_num = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, pVo.getGrant());
			pstmt.setString(2, pVo.getProgNum());
			
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//
	public ProgrammerVO readGrant(String progNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "Select prog_num, name, grant from tbl_programmer where prog_num = ?";
		
		ProgrammerVO pVo = new ProgrammerVO();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, progNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				pVo.setProgNum(rs.getString("prog_num"));
				pVo.setName(rs.getString("name"));
				pVo.setGrant(rs.getString("grant"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return pVo;
	}
}
