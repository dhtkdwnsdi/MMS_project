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

public class ProjectApplyListFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ProgrammerVO pVo = (ProgrammerVO) session.getAttribute("LoginUser");
		String progNum = pVo.getProgNum();
		String url = "project/projectApplyListForm.jsp";
		
		ProjectDAO pDao = ProjectDAO.getInstance();
		ArrayList<ProjectVO> list = new ArrayList<ProjectVO>();
		list = pDao.projectApplyList(progNum);
		request.setAttribute("Plist", list);
		
//		ArrayList<ProjectVO> aList = new ArrayList<ProjectVO>();
//		aList = pDao.projectList();
//		request.setAttribute("aList", aList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
