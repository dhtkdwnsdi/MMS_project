package com.mms.controller.action.project;
/**
 *  @author LEE HAN
 *  
 *  프로젝트 모집 상태 수정 액션
 *  
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ProjectDAO;

public class ProjectStatApplyAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String projNum = request.getParameter("projNum");
		
		ProjectDAO pDao = ProjectDAO.getInstance();
		pDao.projStatApplyUpdate(projNum);
		pDao.applyProgStateUpdate(projNum);
		
		
		response.setContentType("text/html; charset=UTF-8");
		 
		PrintWriter out = response.getWriter();
		 
		out.println("<script>alert('프로젝트 상태가 수정되었습니다.'); location.href='/proj?command=myProjectViewForm&projNum="
		+ projNum +"';</script>");
		 
		out.flush();
		
	}

}
