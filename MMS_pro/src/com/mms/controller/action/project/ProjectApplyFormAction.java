package com.mms.controller.action.project;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ProjectDAO;
import com.mms.vo.ProjectVO;

public class ProjectApplyFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "project/projectApplyForm.jsp";
		String projNum = request.getParameter("projNum");
		
		ProjectVO pVo = new ProjectVO();
		ProjectDAO pDao = ProjectDAO.getInstance();
		pVo = pDao.viewProject(projNum);
		request.setAttribute("pVo", pVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
