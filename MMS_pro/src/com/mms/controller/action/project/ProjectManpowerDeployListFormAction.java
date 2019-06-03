package com.mms.controller.action.project;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.controller.action.Action;
import com.mms.dao.ProjectDAO;
import com.mms.vo.ProgrammerVO;
import com.mms.vo.ProjectVO;

public class ProjectManpowerDeployListFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "project/projectManpowerDeployListForm.jsp";
		HttpSession session = request.getSession();
		
		ProgrammerVO progVo = (ProgrammerVO) session.getAttribute("LoginUser");
		String progNum = progVo.getProgNum();
		
		ArrayList<ProjectVO> list = new ArrayList<ProjectVO>();
		ProjectDAO pDao = ProjectDAO.getInstance();
		list = pDao.ProjectDeployList(progNum);
		request.setAttribute("list", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}
