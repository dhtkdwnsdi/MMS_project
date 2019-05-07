package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mms.vo.PlsVo;

import util.DBManager;

public class PlsDAO extends DBManager {

	private static PlsDAO instance;
	
	private PlsDAO() {
		
	}
	
	public static PlsDAO getInstance() {
		if(instance == null) {
			instance = new PlsDAO();
		}
		System.out.println("PlsDAO.java");
		return instance;
	}
	
	public List<PlsVo> selectPls() {
		
		String sql = "select s.pls_num"
				+ "			, l.pl_name"
				+ "			, s.profiency"
				+ "			, s.experience"
				+ "			from tbl_pls s, tbl_pl l"
				+ "			where s.pl_num=l.pl_num and prog_num =?"
				+ "			order by pls_num";
		
		List<PlsVo> list = new ArrayList<PlsVo>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			
			while(rs.next()) {
				PlsVo pVo = new PlsVo();
				
				pVo.setPlsNum(rs.getString("plsNum"));
				pVo.setPlNum(rs.getString("plNum"));
				pVo.setProfiency(rs.getString("profiency"));
				pVo.setExperience(rs.getString("experience"));
				pVo.setProgNum(rs.getString("progNum"));
				
				list.add(pVo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}return list;
	}
	
	public ArrayList<PlsVo> getPlsList() throws Exception{
		ArrayList<PlsVo> plsList = new ArrayList<PlsVo>();
		
		String sql = "";
		
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			
			while (rs.next()) {
				PlsVo pVo = new PlsVo();
				
				pVo.setPlsNum(rs.getString("plsNum"));
				pVo.setPlNum(rs.getString("plNum"));
				pVo.setProfiency(rs.getString("profiency"));
				pVo.setExperience(rs.getString("experience"));
				pVo.setProgNum(rs.getString("progNum"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}return plsList;
	}
	
	
	public PlsVo readPls(String plsNum) {
		
		String sql = "Select * from tbl_pls where pls_num=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PlsVo pVo = new PlsVo();
		
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, plsNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				pVo.setPlsNum(rs.getString("plsNum"));
				pVo.setPlNum(rs.getString("plNum"));
				pVo.setProfiency(rs.getString("profiency"));
				pVo.setExperience(rs.getString("experience"));
				pVo.setProgNum(rs.getString("progNum"));
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}return pVo;
	}
	
	//insert
	public void insertPls(PlsVo pVo) {
		String sql = "insert into tbl_pls (pls_num, pl_num, profiency, experience, prog_num) values (?,?,?,?,?) ";
		
		Connection conn = getConnection();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, pVo.getPlsNum());
			pstmt.setString(2, pVo.getPlNum());
			pstmt.setString(3, pVo.getProfiency());
			pstmt.setString(4, pVo.getExperience());
			pstmt.setString(5, pVo.getProgNum());
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	
	//update
	public void updatePls(PlsVo pVo) throws Exception{
		String sql = "update tbl_pls set pl_num=?, profiency=?, experience=? where pls_num=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, pVo.getPlNum());
			pstmt.setString(2, pVo.getProfiency());
			pstmt.setString(3, pVo.getExperience());
			pstmt.setString(4, pVo.getPlsNum());
			
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	
	//delete
	public int deletePls(Object plsNumIndivi) {
		String sql = "";
		
		Connection conn = null;
		PreparedStatement pstmt;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, (String)plsNumIndivi);
			
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
