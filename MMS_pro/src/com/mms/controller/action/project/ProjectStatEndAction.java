package com.mms.controller.action.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ProjectDAO;
import com.mms.vo.ProgrammerVO;

public class ProjectStatEndAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String projNum = request.getParameter("projNum");
		
		ProjectDAO pDao = ProjectDAO.getInstance();
		pDao.projStatEndUpdate(projNum);

		pDao.endProgStateUpdate(projNum);
		
		
		response.setContentType("text/html; charset=UTF-8");
		 
		PrintWriter out = response.getWriter();
		 
		out.println("<script>alert('프로젝트 상태가 수정되었습니다.'); location.href='/proj?command=myProjectViewForm&projNum="
		+ projNum +"';</script>");
		 
		out.flush();
		
	}

}
