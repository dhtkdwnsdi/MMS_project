package com.mms.controller.action.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mms.controller.action.Action;
import com.mms.dao.ProjectDAO;

public class ProjectStatProgressAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String projNum = request.getParameter("projNum");
		ProjectDAO pDao = ProjectDAO.getInstance();
		pDao.projStatProgressUpdate(projNum);
		pDao.progressProgStateUpdate(projNum);
		
		new MyProjectViewFormAction().execute(request, response);
	}

}
