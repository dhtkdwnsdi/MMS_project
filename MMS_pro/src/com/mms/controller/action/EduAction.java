package com.mms.controller.action;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.dao.EduDAO;
import com.mms.vo.EduVO;


public class EduAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		String eduCategory = request.getParameter("eduCategory");
		String eduState = request.getParameter("edustate");
		String schoolName = request.getParameter("schoolName");
		String enterDate = request.getParameter("enterdate");
		String graduateDate = request.getParameter("graduatedate");
	
		
		
		EduVO eduVo = new EduVO();
		EduDAO eduDao = EduDAO.getInstance();
		eduVo.setEduCategory(eduCategory);
		eduVo.setEduState(eduState);
		eduVo.setSchoolName(schoolName);
		eduVo.setEnterDate(enterDate);
		eduVo.setGraduateDate(graduateDate);
		
		eduDao.insertEdu(eduVo);
		
		/*
		 * response.setContentType("text/html; charset=UTF-8;"); PrintWriter out =
		 * response.getWriter(); out.
		 * println("<script>alert('계정이 등록 되었습니다'); location.href='login.jsp';</script>"
		 * );
		 */
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
//		dispatcher.forward(request, response);
		
	}

}
