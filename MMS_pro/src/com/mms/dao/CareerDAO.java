package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mms.vo.CareerVO;

import util.DBManager;

public class CareerDAO extends DBManager {

	private static CareerDAO instance = new CareerDAO();
	
	public static CareerDAO getInstance() {
		return instance;
	}
	
	
	// 경력 등록
	public void insertCareer(CareerVO cVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO TBL_CAREER("
				+ "	  COMPANY_NAME, DEPARTMENT, POSITION, JOIN_DATE, RETIRE_DATE, PROG_NUM)"
				+ "	  VALUES(?, ?, ?, ?, ?, ?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, cVo.getCompanyName());
			pstmt.setString(2, cVo.getDepartment());
			pstmt.setString(3, cVo.getPosition());
			pstmt.setString(4, cVo.getJoinDate());
			pstmt.setString(5, cVo.getRetireDate());
			pstmt.setString(6, cVo.getProgNum());
			
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
	
	// List 뽑아오기
	public ArrayList<CareerVO> careerList(String progNum){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM TBL_CAREER WHERE PROG_NUM = ? ORDER BY CAREER_NUM DESC";
		
		ArrayList<CareerVO> list = new ArrayList<CareerVO>();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, progNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				CareerVO cVo = new CareerVO();
				
				cVo.setCareerNum(rs.getString("CAREER_NUM"));
				cVo.setCompanyName(rs.getString("COMPANY_NAME"));
				cVo.setDepartment(rs.getString("DEPARTMENT"));
				cVo.setPosition(rs.getString("POSITION"));
				cVo.setJoinDate(rs.getString("JOIN_DATE"));
				cVo.setRetireDate(rs.getString("RETIRE_DATE"));
				cVo.setProgNum(rs.getString("PROG_NUM"));
				
				list.add(cVo);
				
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
	
	// 경력 수정 메소드
	public void updateCareer(CareerVO cVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		String sql = "UPDATE TBL_CAREER SET"
				+ "	  COMPANY_NAME = ?"
				+ ",  DEPARTMENT = ?"
				+ ",  POSITION = ?"
				+ ",  JOIN_DATE = ?"
				+ ",  RETIRE_DATE = ?"
				+ "   WHERE CAREER_NUM = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, cVo.getCompanyName());
			pstmt.setString(2, cVo.getDepartment());
			pstmt.setString(3, cVo.getPosition());
			pstmt.setString(4, cVo.getJoinDate());
			pstmt.setString(5, cVo.getRetireDate());
			pstmt.setString(6, cVo.getCareerNum());
			
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
	
	//경력 삭제하기
	public void deleteCareer(String careerNum) {
		String sql = "DELETE FROM TBL_CAREER "
				+ "    WHERE CAREER_NUM = " + careerNum;

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
