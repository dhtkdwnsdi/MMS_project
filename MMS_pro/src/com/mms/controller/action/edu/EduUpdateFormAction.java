package com.mms.controller.action.edu;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.EduDAO;
import com.mms.vo.EduVO;

public class EduUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String url = "profile/eduUpdateForm.jsp";
		
		EduDAO eduDao = EduDAO.getInstance();
		
		String eduNum = request.getParameter("eduNum");
		
		request.setAttribute("eduNum", eduNum);
		
		EduVO eduVo = eduDao.readEdu(eduNum);
		
		request.setAttribute("eduVo", eduVo);
		
		System.out.println(eduVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
