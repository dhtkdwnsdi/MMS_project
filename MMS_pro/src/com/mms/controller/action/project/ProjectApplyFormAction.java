package com.mms.controller.action.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ApplyStmtDAO;
import com.mms.dao.ProjectDAO;
import com.mms.vo.ApplyStmtVO;
import com.mms.vo.ProjectVO;

public class ProjectApplyFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int result;
		String url = "project/projectApplyForm.jsp";
		String projNum = request.getParameter("projNum");
		String progNum = request.getParameter("progNum");
		
		System.out.println("projNum : " + projNum + " progNum : " + progNum);
		ApplyStmtVO aVo = new ApplyStmtVO();
		ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
		aVo.setProjNum(projNum);
		aVo.setProgNum(progNum);
		result = aDao.applyCheck(aVo);
		
		if(result == 0) {
		ProjectVO pVo = new ProjectVO();
		ProjectDAO pDao = ProjectDAO.getInstance();
		pVo = pDao.viewProject(projNum);
		request.setAttribute("pVo", pVo);
		
		} 
		else {
			url = "proj?command=projectApplyListForm";
			request.setAttribute("message", "이미 신청한 프로젝트입니다.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
