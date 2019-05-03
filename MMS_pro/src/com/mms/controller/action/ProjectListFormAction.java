package com.mms.controller.action;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.dao.ProjectDAO;

public class ProjectListFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "/project/projectList.jsp";
		
		ProjectDAO projDao = ProjectDAO.getInstance();
		
		List<ProjectVO> projectList = projDao.selectProject();
		
	}

}
