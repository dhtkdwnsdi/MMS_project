package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mms.vo.PortpolioVo;

import util.DBManager;

public class PortpolioDAO extends DBManager {
	
	private static PortpolioDAO instance;
	
	private PortpolioDAO() {
		
	}
	
	public static PortpolioDAO getInstance() {
		if(instance == null) {
			instance = new PortpolioDAO();
		}
		System.out.print("PortpolioDAO.java");
		return instance;
	}
	
	//조회
	public List<PortpolioVo> selectPortpolio(String progNum){
		
		String sql = "SELECT PORT_NUM"
				+ "			,SUBJECT"
				+ "			,PORT_CATE"
				+ "			FROM TBL_PORTPOLIO"
				+ "			WHERE PROG_NUM = " + progNum
				+ "			ORDER BY PORT_NUM";
		
		List<PortpolioVo> list = new ArrayList<PortpolioVo>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				PortpolioVo portVo = new PortpolioVo();
				
				portVo.setPortNum(rs.getString("port_Num"));
				portVo.setSubject(rs.getString("subject"));
				portVo.setPortCate(rs.getString("port_Cate"));
				/*
				 * portVo.setPortDetailCate(rs.getString("portDetailCate"));
				 * portVo.setPortStartDate(rs.getString("portStartDate"));
				 * portVo.setPortEndDate(rs.getString("portEndDate"));
				 * portVo.setRate(rs.getString("rate"));
				 * portVo.setConnectSkill(rs.getString("connectSkill"));
				 * portVo.setPortContents(rs.getString("portContents"));
				 * portVo.setPortFile(rs.getString("portFile"));
				 */
				
				list.add(portVo);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			//dbClose();
		}
		return list;
	}
	
	public PortpolioVo readPortpolio(String portNum) {
		
		String sql ="Select * from tbl_portpolio where port_num=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PortpolioVo portVo = new PortpolioVo();
		
		try {
			conn=getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, portNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				portVo.setPortNum(rs.getString("portNum"));
				portVo.setSubject(rs.getString("subject"));
				portVo.setPortCate(rs.getString("portCate"));
				portVo.setPortDetailCate(rs.getString("portDetailCate"));
				portVo.setPortStartDate(rs.getString("portStartDate"));
				portVo.setPortEndDate(rs.getString("portEndDate"));
				portVo.setRate(rs.getString("rate"));
				portVo.setConnectSkill(rs.getString("connectSkill"));
				portVo.setPortContents(rs.getString("portContents"));
				portVo.setPortFile(rs.getString("portFile"));
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}return portVo;
	}
	
	public ArrayList<PortpolioVo> getPortpolioList() throws Exception {
		ArrayList<PortpolioVo> portpolioList = new ArrayList<PortpolioVo>();
		
		String sql = "SELECT PORT_NUM"
					+ "			,SUBJECT"
					+ "			,PORT_CATE"
					+ "			FROM TBL_PORTPOLIO"
					+ "			ORDER BY PORT_NUM";
		
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			
			while (rs.next()) {
				PortpolioVo portVo = new PortpolioVo();
				
				portVo.setPortNum(rs.getString("PORT_NUM"));
				portVo.setSubject(rs.getString("SUBJECT"));
				portVo.setPortCate(rs.getString("PORT_CATE"));
				/*
				 * portVo.setPortDetailCate(rs.getString("portDetailCate"));
				 * portVo.setPortStartDate(rs.getString("portStartDate"));
				 * portVo.setPortEndDate(rs.getString("portEndDate"));
				 * portVo.setRate(rs.getString("rate"));
				 * portVo.setConnectSkill(rs.getString("connectSkill"));
				 * portVo.setPortContents(rs.getString("portContents"));
				 * portVo.setPortFile(rs.getString("portFile"));
				 */
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		return portpolioList;
	}
	
	//등록
	public void insertPortpolio(PortpolioVo portVo) {
		String sql = "INSERT INTO TBL_PORTPOLIO (PORT_NUM,SUBJECT,PORT_CATE,PORT_DETAIL_CATE,PORT_START_DATE,PORT_END_DATE,RATE,CONNECT_SKILL,PORT_CONTENTS,PORT_FILE,PROG_NUM) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		
		Connection conn = getConnection();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, portVo.getPortNum());
			pstmt.setString(2, portVo.getSubject());
			pstmt.setString(3, portVo.getPortCate());
			pstmt.setString(4, portVo.getPortDetailCate());
			pstmt.setString(5, portVo.getPortStartDate());
			pstmt.setString(6, portVo.getPortEndDate());
			pstmt.setString(7, portVo.getRate());
			pstmt.setString(8, portVo.getConnectSkill());
			pstmt.setString(9, portVo.getPortContents());
			pstmt.setString(10, portVo.getPortFile());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//dbClose();
		}
	}
	
	//수정
	public void updatePortpolio(PortpolioVo portVo) throws Exception{
		String sql = "UPDATE TBL_PORTPOLIO SET SUBJECT=?,PORT_CATE=?,PORT_DETAIL_CATE=?,PORT_START_DATE=?,PORT_END_DATE=?,RATE=?,CONNECT_SKILL=?,PORT_CONTENTS=?,PORT_FILE=? WHERE PORT_NUM=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, portVo.getSubject());
			pstmt.setString(2, portVo.getPortCate());
			pstmt.setString(3, portVo.getPortDetailCate());
			pstmt.setString(4, portVo.getPortStartDate());
			pstmt.setString(5, portVo.getPortEndDate());
			pstmt.setString(6, portVo.getRate());
			pstmt.setString(7, portVo.getConnectSkill());
			pstmt.setString(8, portVo.getPortContents());
			pstmt.setString(9, portVo.getPortFile());
			//pstmt.setString(10, portVo.getProgNum());
			pstmt.setString(11, portVo.getPortNum());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//dbClose();
		}
	}
	
	//삭제
	public int deletePortpolio(String portNum) {
		
		String sql = "delete from tbl_portpolio where port_num=?";
		
		Connection conn = null;
		PreparedStatement pstmt;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,portNum);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		//dbClose();
		return 0;
	}

}
