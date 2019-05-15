package com.mms.controller.action.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ProjectDAO;

public class ProjectDeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String projNum = request.getParameter("projNum");
		ProjectDAO pDao = ProjectDAO.getInstance();
		pDao.deleteProject(projNum);
		
		new ProjectListFormAction().execute(request, response);
		
	}

}
