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

public class ProjectListFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String url = "project/projectListForm.jsp";
		
		ProgrammerVO progVo = (ProgrammerVO) session.getAttribute("LoginUser");
		String progNum = progVo.getProgNum();
		
		ArrayList<ProjectVO> myList = new ArrayList<ProjectVO>();
		ArrayList<ProjectVO> allList = new ArrayList<ProjectVO>();
		ProjectDAO pDao = ProjectDAO.getInstance();
		myList = pDao.myProjectList(progNum);
		request.setAttribute("myList", myList);
		allList = pDao.projectList();
		request.setAttribute("allList", allList);
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
