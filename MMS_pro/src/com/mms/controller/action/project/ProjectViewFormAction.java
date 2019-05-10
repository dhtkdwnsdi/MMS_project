package com.mms.controller.action.project;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ProjectDAO;
import com.mms.vo.ProjectVO;

public class ProjectViewFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "project/projectViewForm.jsp";
		
		String projNum = request.getParameter("projNum");
		System.out.println(projNum);
		ProjectVO projVo = new ProjectVO();
		ProjectDAO pDao = ProjectDAO.getInstance();
		
		projVo = pDao.viewProject(projNum);
		System.out.println(projVo);
		request.setAttribute("projVo", projVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
