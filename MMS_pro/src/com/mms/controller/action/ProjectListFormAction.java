package com.mms.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.dao.ProjectDAO;
import com.mms.vo.ProjectVO;

public class ProjectListFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "/project/projectList.jsp";
		
		ProjectDAO projectDao = ProjectDAO.getInstance();
		
		List<ProjectVO> projectList = projectDao.selectProject();
		
		request.setAttribute("projectList", projectList);
		
		System.out.println(projectList);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
