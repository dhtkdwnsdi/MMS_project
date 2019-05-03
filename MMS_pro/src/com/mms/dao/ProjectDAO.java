package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;
import com.mms.vo.ProjectVO;

public class ProjectDAO extends DBManager {

	private ProjectDAO() {
	      
	   }
	   
	   public static ProjectDAO instance = new ProjectDAO();
	   
	   public static ProjectDAO getInstance() {
	      if(instance == null) {
	         instance = new ProjectDAO();
	      }
	      return instance;
	   }
	   
	   
	   //프로젝트 번호, 프로젝트 명, 카테고리, 프로젝트 마감일, 시작 예정일, 종료 예정일, 담당자 출력하는 메소드
	   public List<ProjectVO> selectProject(){
		   
		   String sql = "select proj.proj_num, proj.proj_name, proj.proj_cate,"
		   		+ "proj.proj_detail_cate, proj.start_duedate, proj.end_duedate, proj.deadline, prog.name"
		   		+ "from pmms.tbl_project proj, pmms.tbl_programmer prog"
		   		+ "where proj.prog_num = prog.prog_num";
		   
		   List<ProjectVO> list = new ArrayList<ProjectVO>();
	       Connection conn = null;
	       PreparedStatement pstmt = null;
	       ResultSet rs = null;
	        
	       try {
	            conn = getConnection();
	            pstmt = conn.prepareStatement(sql);
	            rs = pstmt.executeQuery();

	            while (rs.next()) {
	            	ProjectVO projVo = new ProjectVO();

	            	projVo.setProjNum(rs.getString("projNum"));
	            	projVo.setProjName(rs.getString("projName"));
	            	projVo.setProjCate(rs.getString("projCate"));
	            	projVo.setProjDetailCate(rs.getString("projDetailCate"));
	            	projVo.setStartDuedate(rs.getString("startDuedate"));
	            	projVo.setEndDuedate(rs.getString("endDuedate"));
	            	projVo.setDeadline(rs.getString("deadline"));
	            	projVo.setName(rs.getString("name"));
	               list.add(projVo);
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
	   
	   //등록
	   public void insertProject(ProjectVO pVo) {
		   
		   String sql = "insert into pmms.tbl_project(porj_num,"
		   		+ "porj_name, proj_cate, proj_detail_cate, start_duedate"
		   		+ "end_duedate, deadline, contents, parti_form_code,fw_code"
		   		+ "dbms_code, os_code, level_code, proj_file, prog_num)"
		   		+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		   
		   Connection conn = null;
		   PreparedStatement pstmt = null;
	       
	       try {

	    	    conn = DBManager.getConnection();
	    	   
	            pstmt = conn.prepareStatement(sql);

	            //pstmt.setString(1, dVo.getDept_num());
	            pstmt.setString(2, pVo.getProjName());
	            pstmt.setString(3, pVo.getProjCate());
	            pstmt.setString(4, pVo.getProjDetailCate());
	            pstmt.setString(5, pVo.getStartDuedate());
	            pstmt.setString(6, pVo.getEndDuedate());
	            pstmt.setString(7, pVo.getDeadline());
	            pstmt.setString(8, pVo.getContents());
	            pstmt.setString(9, pVo.getPartiFormCode());
	            pstmt.setString(10, pVo.getFwCode());
	            pstmt.setString(11, pVo.getDbmsCode());
	            pstmt.setString(12, pVo.getOsCode());
	            pstmt.setString(13, pVo.getLevelCode());
	            pstmt.setString(14, pVo.getProjFile());
	            pstmt.setString(15, pVo.getProgNum());
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
